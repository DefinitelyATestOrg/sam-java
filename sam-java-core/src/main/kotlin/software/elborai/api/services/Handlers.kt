@file:JvmName("Handlers")

package software.elborai.api.services

import java.io.ByteArrayInputStream
import java.io.InputStream
import java.io.OutputStream
import java.util.Optional
import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import software.elborai.api.core.http.HttpResponse
import software.elborai.api.core.http.HttpResponse.Handler
import software.elborai.api.core.http.BinaryResponseContent
import software.elborai.api.errors.SamError
import software.elborai.api.errors.SamException
import software.elborai.api.errors.SamServiceException
import software.elborai.api.errors.InternalServerException
import software.elborai.api.errors.BadRequestException
import software.elborai.api.errors.NotFoundException
import software.elborai.api.errors.PermissionDeniedException
import software.elborai.api.errors.RateLimitException
import software.elborai.api.errors.UnauthorizedException
import software.elborai.api.errors.UnexpectedStatusCodeException
import software.elborai.api.errors.UnprocessableEntityException

@JvmSynthetic
internal fun emptyHandler(): Handler<Void?> = EmptyHandler

private object EmptyHandler : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}

@JvmSynthetic
internal fun stringHandler(): Handler<String> = StringHandler

@JvmSynthetic
internal fun binaryHandler(): Handler<BinaryResponseContent> = BinaryHandler

private object StringHandler : Handler<String> {
    override fun handle(response: HttpResponse): String {
        return response.body().readBytes().toString(Charsets.UTF_8)
    }
}

private object BinaryHandler : Handler<BinaryResponseContent> {
    override fun handle(response: HttpResponse): BinaryResponseContent {
        return object : BinaryResponseContent {
            override fun contentType(): Optional<String> = Optional.ofNullable(response.headers().get("Content-Type").firstOrNull())

            override fun body(): InputStream = response.body()

            override fun close() = response.close()

            override fun writeTo(outputStream: OutputStream) {
                response.body().copyTo(outputStream)
            }
        }
    }
}

@JvmSynthetic
internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> {
    return object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            try {
                return jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw SamException("Error reading response", e)
            }
        }
    }
}

@JvmSynthetic
internal fun errorHandler(jsonMapper: JsonMapper): Handler<SamError> {
    val handler = jsonHandler<SamError>(jsonMapper)

    return object : Handler<SamError> {
        override fun handle(response: HttpResponse): SamError {
            try {
                return handler.handle(response)
            } catch (e: Exception) {
                return SamError.builder().build()
            }
        }
    }
}

@JvmSynthetic
internal fun <T> Handler<T>.withErrorHandler(errorHandler: Handler<SamError>): Handler<T> {
    return object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            when (val statusCode = response.statusCode()) {
                in 200..299 -> return this@withErrorHandler.handle(response)
                400 -> throw BadRequestException(response.headers(), errorHandler.handle(response))
                401 -> throw UnauthorizedException(response.headers(), errorHandler.handle(response))
                403 -> throw PermissionDeniedException(response.headers(), errorHandler.handle(response))
                404 -> throw NotFoundException(response.headers(), errorHandler.handle(response))
                422 -> throw UnprocessableEntityException(response.headers(), errorHandler.handle(response))
                429 -> throw RateLimitException(response.headers(), errorHandler.handle(response))
                in 500..599 ->
                    throw InternalServerException(
                        statusCode,
                        response.headers(),
                        errorHandler.handle(response)
                    )
                else ->
                    throw UnexpectedStatusCodeException(
                        statusCode,
                        response.headers(),
                        StringHandler.handle(response)
                    )
            }
        }
    }
}
