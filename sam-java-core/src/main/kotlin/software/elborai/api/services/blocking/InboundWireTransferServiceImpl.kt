// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.services.blocking

import software.elborai.api.core.ClientOptions
import software.elborai.api.core.RequestOptions
import software.elborai.api.core.http.HttpMethod
import software.elborai.api.core.http.HttpRequest
import software.elborai.api.core.http.HttpResponse.Handler
import software.elborai.api.errors.IncreaseError
import software.elborai.api.models.InboundWireTransfer
import software.elborai.api.models.InboundWireTransferListPage
import software.elborai.api.models.InboundWireTransferListParams
import software.elborai.api.models.InboundWireTransferRetrieveParams
import software.elborai.api.services.errorHandler
import software.elborai.api.services.jsonHandler
import software.elborai.api.services.withErrorHandler

class InboundWireTransferServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : InboundWireTransferService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<InboundWireTransfer> =
        jsonHandler<InboundWireTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve an Inbound Wire Transfer */
    override fun retrieve(
        params: InboundWireTransferRetrieveParams,
        requestOptions: RequestOptions
    ): InboundWireTransfer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("inbound_wire_transfers", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<InboundWireTransferListPage.Response> =
        jsonHandler<InboundWireTransferListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Inbound Wire Transfers */
    override fun list(
        params: InboundWireTransferListParams,
        requestOptions: RequestOptions
    ): InboundWireTransferListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("inbound_wire_transfers")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { InboundWireTransferListPage.of(this, params, it) }
        }
    }
}
