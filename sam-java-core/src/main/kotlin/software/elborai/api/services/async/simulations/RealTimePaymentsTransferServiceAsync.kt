// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async.simulations

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.InboundRealTimePaymentsTransferSimulationResult
import software.elborai.api.models.RealTimePaymentsTransfer
import software.elborai.api.models.SimulationRealTimePaymentsTransferCompleteParams
import software.elborai.api.models.SimulationRealTimePaymentsTransferCreateInboundParams

interface RealTimePaymentsTransferServiceAsync {

    /**
     * Simulates submission of a Real-Time Payments transfer and handling the response from the
     * destination financial institution. This transfer must first have a `status` of
     * `pending_submission`.
     */
    @JvmOverloads
    fun complete(
        params: SimulationRealTimePaymentsTransferCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RealTimePaymentsTransfer>

    /**
     * Simulates an inbound Real-Time Payments transfer to your account. Real-Time Payments are a
     * beta feature.
     */
    @JvmOverloads
    fun createInbound(
        params: SimulationRealTimePaymentsTransferCreateInboundParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<InboundRealTimePaymentsTransferSimulationResult>
}
