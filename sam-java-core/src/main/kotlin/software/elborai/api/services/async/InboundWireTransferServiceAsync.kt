// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.InboundWireTransfer
import software.elborai.api.models.InboundWireTransferListPageAsync
import software.elborai.api.models.InboundWireTransferListParams
import software.elborai.api.models.InboundWireTransferRetrieveParams

interface InboundWireTransferServiceAsync {

    /** Retrieve an Inbound Wire Transfer */
    @JvmOverloads
    fun retrieve(
        params: InboundWireTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<InboundWireTransfer>

    /** List Inbound Wire Transfers */
    @JvmOverloads
    fun list(
        params: InboundWireTransferListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<InboundWireTransferListPageAsync>
}
