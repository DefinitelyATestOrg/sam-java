// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.ClientOptions
import software.elborai.api.core.RequestOptions
import software.elborai.api.core.http.HttpMethod
import software.elborai.api.core.http.HttpRequest
import software.elborai.api.core.http.HttpResponse.Handler
import software.elborai.api.errors.IncreaseError
import software.elborai.api.models.RealTimePaymentsTransfer
import software.elborai.api.models.RealTimePaymentsTransferCreateParams
import software.elborai.api.models.RealTimePaymentsTransferListPageAsync
import software.elborai.api.models.RealTimePaymentsTransferListParams
import software.elborai.api.models.RealTimePaymentsTransferRetrieveParams
import software.elborai.api.services.errorHandler
import software.elborai.api.services.json
import software.elborai.api.services.jsonHandler
import software.elborai.api.services.withErrorHandler

class RealTimePaymentsTransferServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : RealTimePaymentsTransferServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<RealTimePaymentsTransfer> =
        jsonHandler<RealTimePaymentsTransfer>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create a Real-Time Payments Transfer */
    override fun create(
        params: RealTimePaymentsTransferCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<RealTimePaymentsTransfer> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("real_time_payments_transfers")
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

    private val retrieveHandler: Handler<RealTimePaymentsTransfer> =
        jsonHandler<RealTimePaymentsTransfer>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve a Real-Time Payments Transfer */
    override fun retrieve(
        params: RealTimePaymentsTransferRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<RealTimePaymentsTransfer> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("real_time_payments_transfers", params.getPathParam(0))
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

    private val listHandler: Handler<RealTimePaymentsTransferListPageAsync.Response> =
        jsonHandler<RealTimePaymentsTransferListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Real-Time Payments Transfers */
    override fun list(
        params: RealTimePaymentsTransferListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<RealTimePaymentsTransferListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("real_time_payments_transfers")
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
                .let { RealTimePaymentsTransferListPageAsync.of(this, params, it) }
        }
    }
}
