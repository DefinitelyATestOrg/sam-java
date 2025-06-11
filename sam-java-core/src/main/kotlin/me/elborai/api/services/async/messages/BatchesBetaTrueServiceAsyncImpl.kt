// File generated from our OpenAPI spec by Stainless.

package me.elborai.api.services.async.messages

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
import me.elborai.api.models.messages.batchesbetatrue.BatchesBetaTrueCreateParams
import me.elborai.api.models.messages.batchesbetatrue.BatchesBetaTrueCreateResponse
import me.elborai.api.models.messages.batchesbetatrue.BatchesBetaTrueListParams
import me.elborai.api.models.messages.batchesbetatrue.BatchesBetaTrueListResponse

class BatchesBetaTrueServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : BatchesBetaTrueServiceAsync {

    private val withRawResponse: BatchesBetaTrueServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BatchesBetaTrueServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: BatchesBetaTrueCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchesBetaTrueCreateResponse> =
        // post /v1/messages/batches?beta=true
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: BatchesBetaTrueListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchesBetaTrueListResponse> =
        // get /v1/messages/batches?beta=true
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BatchesBetaTrueServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<BatchesBetaTrueCreateResponse> =
            jsonHandler<BatchesBetaTrueCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: BatchesBetaTrueCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchesBetaTrueCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "messages", "batches")
                    .putQueryParam("beta", "true")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<BatchesBetaTrueListResponse> =
            jsonHandler<BatchesBetaTrueListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: BatchesBetaTrueListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchesBetaTrueListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "messages", "batches")
                    .putQueryParam("beta", "true")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
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
