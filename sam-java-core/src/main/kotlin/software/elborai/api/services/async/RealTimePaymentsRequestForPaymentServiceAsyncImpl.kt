// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.ClientOptions
import software.elborai.api.core.RequestOptions
import software.elborai.api.core.http.HttpMethod
import software.elborai.api.core.http.HttpRequest
import software.elborai.api.core.http.HttpResponse.Handler
import software.elborai.api.errors.IncreaseError
import software.elborai.api.models.RealTimePaymentsRequestForPayment
import software.elborai.api.models.RealTimePaymentsRequestForPaymentCreateParams
import software.elborai.api.models.RealTimePaymentsRequestForPaymentListPageAsync
import software.elborai.api.models.RealTimePaymentsRequestForPaymentListParams
import software.elborai.api.models.RealTimePaymentsRequestForPaymentRetrieveParams
import software.elborai.api.services.errorHandler
import software.elborai.api.services.json
import software.elborai.api.services.jsonHandler
import software.elborai.api.services.withErrorHandler

class RealTimePaymentsRequestForPaymentServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : RealTimePaymentsRequestForPaymentServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<RealTimePaymentsRequestForPayment> =
        jsonHandler<RealTimePaymentsRequestForPayment>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create a Real-Time Payments Request for Payment */
    override fun create(
        params: RealTimePaymentsRequestForPaymentCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<RealTimePaymentsRequestForPayment> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("real_time_payments_request_for_payments")
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

    private val retrieveHandler: Handler<RealTimePaymentsRequestForPayment> =
        jsonHandler<RealTimePaymentsRequestForPayment>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve a Real-Time Payments Request for Payment */
    override fun retrieve(
        params: RealTimePaymentsRequestForPaymentRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<RealTimePaymentsRequestForPayment> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("real_time_payments_request_for_payments", params.getPathParam(0))
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

    private val listHandler: Handler<RealTimePaymentsRequestForPaymentListPageAsync.Response> =
        jsonHandler<RealTimePaymentsRequestForPaymentListPageAsync.Response>(
                clientOptions.jsonMapper
            )
            .withErrorHandler(errorHandler)

    /** List Real-Time Payments Request for Payments */
    override fun list(
        params: RealTimePaymentsRequestForPaymentListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<RealTimePaymentsRequestForPaymentListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("real_time_payments_request_for_payments")
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
                .let { RealTimePaymentsRequestForPaymentListPageAsync.of(this, params, it) }
        }
    }
}
