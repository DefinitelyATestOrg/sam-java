// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.ClientOptions
import software.elborai.api.core.RequestOptions
import software.elborai.api.core.http.HttpMethod
import software.elborai.api.core.http.HttpRequest
import software.elborai.api.core.http.HttpResponse.Handler
import software.elborai.api.errors.IncreaseError
import software.elborai.api.models.Export
import software.elborai.api.models.ExportCreateParams
import software.elborai.api.models.ExportListPageAsync
import software.elborai.api.models.ExportListParams
import software.elborai.api.models.ExportRetrieveParams
import software.elborai.api.services.errorHandler
import software.elborai.api.services.json
import software.elborai.api.services.jsonHandler
import software.elborai.api.services.withErrorHandler

class ExportServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ExportServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Export> =
        jsonHandler<Export>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create an Export */
    override fun create(
        params: ExportCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Export> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("exports")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
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

    private val retrieveHandler: Handler<Export> =
        jsonHandler<Export>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve an Export */
    override fun retrieve(
        params: ExportRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Export> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("exports", params.getPathParam(0))
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

    private val listHandler: Handler<ExportListPageAsync.Response> =
        jsonHandler<ExportListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Exports */
    override fun list(
        params: ExportListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ExportListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("exports")
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
                .let { ExportListPageAsync.of(this, params, it) }
        }
    }
}
