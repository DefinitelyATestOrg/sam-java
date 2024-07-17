// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.services.async.simulations

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.ClientOptions
import software.elborai.api.core.RequestOptions
import software.elborai.api.core.http.HttpMethod
import software.elborai.api.core.http.HttpRequest
import software.elborai.api.core.http.HttpResponse.Handler
import software.elborai.api.errors.IncreaseError
import software.elborai.api.models.InboundWireDrawdownRequest
import software.elborai.api.models.SimulationInboundWireDrawdownRequestCreateParams
import software.elborai.api.services.errorHandler
import software.elborai.api.services.json
import software.elborai.api.services.jsonHandler
import software.elborai.api.services.withErrorHandler

class InboundWireDrawdownRequestServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : InboundWireDrawdownRequestServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<InboundWireDrawdownRequest> =
        jsonHandler<InboundWireDrawdownRequest>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Simulates receiving an [Inbound Wire Drawdown Request](#inbound-wire-drawdown-requests). */
    override fun create(
        params: SimulationInboundWireDrawdownRequestCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<InboundWireDrawdownRequest> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "inbound_wire_drawdown_requests")
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
}
