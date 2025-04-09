// File generated from our OpenAPI spec by Stainless.

package me.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import me.elborai.api.core.ClientOptions
import me.elborai.api.core.JsonValue
import me.elborai.api.core.RequestOptions
import me.elborai.api.core.handlers.errorHandler
import me.elborai.api.core.handlers.jsonHandler
import me.elborai.api.core.handlers.withErrorHandler
import me.elborai.api.core.http.HttpMethod
import me.elborai.api.core.http.HttpRequest
import me.elborai.api.core.http.HttpResponse.Handler
import me.elborai.api.core.http.HttpResponseFor
import me.elborai.api.core.http.json
import me.elborai.api.core.http.parseable
import me.elborai.api.core.prepareAsync
import me.elborai.api.models.samplopplop.SamPlopPlopCreateMessageParams
import me.elborai.api.models.samplopplop.SamPlopPlopCreateMessageResponse

class SamPlopPlopServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SamPlopPlopServiceAsync {

    private val withRawResponse: SamPlopPlopServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SamPlopPlopServiceAsync.WithRawResponse = withRawResponse

    override fun createMessage(
        params: SamPlopPlopCreateMessageParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SamPlopPlopCreateMessageResponse> =
        // post /v1/sam-plop-plop
        withRawResponse().createMessage(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SamPlopPlopServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createMessageHandler: Handler<SamPlopPlopCreateMessageResponse> =
            jsonHandler<SamPlopPlopCreateMessageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun createMessage(
            params: SamPlopPlopCreateMessageParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SamPlopPlopCreateMessageResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "sam-plop-plop")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createMessageHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
