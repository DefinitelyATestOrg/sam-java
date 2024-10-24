// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.ClientOptions
import software.elborai.api.core.RequestOptions
import software.elborai.api.core.http.HttpMethod
import software.elborai.api.core.http.HttpRequest
import software.elborai.api.core.http.HttpResponse.Handler
import software.elborai.api.errors.IncreaseError
import software.elborai.api.models.File
import software.elborai.api.models.FileCreateParams
import software.elborai.api.models.FileListPageAsync
import software.elborai.api.models.FileListParams
import software.elborai.api.models.FileRetrieveParams
import software.elborai.api.services.errorHandler
import software.elborai.api.services.jsonHandler
import software.elborai.api.services.multipartFormData
import software.elborai.api.services.withErrorHandler

class FileServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : FileServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<File> =
        jsonHandler<File>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * To upload a file to Increase, you'll need to send a request of Content-Type
     * `multipart/form-data`. The request should contain the file you would like to upload, as well
     * as the parameters for creating a file.
     */
    override fun create(
        params: FileCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<File> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("files")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(multipartFormData(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<File> =
        jsonHandler<File>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a File */
    override fun retrieve(
        params: FileRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<File> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("files", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<FileListPageAsync.Response> =
        jsonHandler<FileListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Files */
    override fun list(
        params: FileListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<FileListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("files")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { FileListPageAsync.of(this, params, it) }
        }
    }
}
