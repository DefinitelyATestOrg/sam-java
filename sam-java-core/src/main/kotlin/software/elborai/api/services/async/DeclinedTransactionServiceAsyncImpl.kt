// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.ClientOptions
import software.elborai.api.core.RequestOptions
import software.elborai.api.core.http.HttpMethod
import software.elborai.api.core.http.HttpRequest
import software.elborai.api.core.http.HttpResponse.Handler
import software.elborai.api.errors.IncreaseError
import software.elborai.api.models.DeclinedTransaction
import software.elborai.api.models.DeclinedTransactionListPageAsync
import software.elborai.api.models.DeclinedTransactionListParams
import software.elborai.api.models.DeclinedTransactionRetrieveParams
import software.elborai.api.services.errorHandler
import software.elborai.api.services.jsonHandler
import software.elborai.api.services.withErrorHandler

class DeclinedTransactionServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : DeclinedTransactionServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<DeclinedTransaction> =
        jsonHandler<DeclinedTransaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Declined Transaction */
    override fun retrieve(
        params: DeclinedTransactionRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<DeclinedTransaction> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("declined_transactions", params.getPathParam(0))
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

    private val listHandler: Handler<DeclinedTransactionListPageAsync.Response> =
        jsonHandler<DeclinedTransactionListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Declined Transactions */
    override fun list(
        params: DeclinedTransactionListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<DeclinedTransactionListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("declined_transactions")
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
                .let { DeclinedTransactionListPageAsync.of(this, params, it) }
        }
    }
}
