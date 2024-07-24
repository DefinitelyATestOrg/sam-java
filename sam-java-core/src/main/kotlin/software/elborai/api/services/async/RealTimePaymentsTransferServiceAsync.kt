// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.RealTimePaymentsTransfer
import software.elborai.api.models.RealTimePaymentsTransferCreateParams
import software.elborai.api.models.RealTimePaymentsTransferListPageAsync
import software.elborai.api.models.RealTimePaymentsTransferListParams
import software.elborai.api.models.RealTimePaymentsTransferRetrieveParams

interface RealTimePaymentsTransferServiceAsync {

    /** Create a Real-Time Payments Transfer */
    @JvmOverloads
    fun create(
        params: RealTimePaymentsTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RealTimePaymentsTransfer>

    /** Retrieve a Real-Time Payments Transfer */
    @JvmOverloads
    fun retrieve(
        params: RealTimePaymentsTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RealTimePaymentsTransfer>

    /** List Real-Time Payments Transfers */
    @JvmOverloads
    fun list(
        params: RealTimePaymentsTransferListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RealTimePaymentsTransferListPageAsync>
}
