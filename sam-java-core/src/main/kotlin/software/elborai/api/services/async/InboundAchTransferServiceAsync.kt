// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.InboundAchTransfer
import software.elborai.api.models.InboundAchTransferDeclineParams
import software.elborai.api.models.InboundAchTransferListPageAsync
import software.elborai.api.models.InboundAchTransferListParams
import software.elborai.api.models.InboundAchTransferNotificationOfChangeParams
import software.elborai.api.models.InboundAchTransferRetrieveParams
import software.elborai.api.models.InboundAchTransferTransferReturnParams

interface InboundAchTransferServiceAsync {

    /** Retrieve an Inbound ACH Transfer */
    @JvmOverloads
    fun retrieve(
        params: InboundAchTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<InboundAchTransfer>

    /** List Inbound ACH Transfers */
    @JvmOverloads
    fun list(
        params: InboundAchTransferListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<InboundAchTransferListPageAsync>

    /** Decline an Inbound ACH Transfer */
    @JvmOverloads
    fun decline(
        params: InboundAchTransferDeclineParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<InboundAchTransfer>

    /** Create a notification of change for an Inbound ACH Transfer */
    @JvmOverloads
    fun notificationOfChange(
        params: InboundAchTransferNotificationOfChangeParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<InboundAchTransfer>

    /** Return an Inbound ACH Transfer */
    @JvmOverloads
    fun transferReturn(
        params: InboundAchTransferTransferReturnParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<InboundAchTransfer>
}
