// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.CheckTransfer
import software.elborai.api.models.CheckTransferApproveParams
import software.elborai.api.models.CheckTransferCancelParams
import software.elborai.api.models.CheckTransferCreateParams
import software.elborai.api.models.CheckTransferListPageAsync
import software.elborai.api.models.CheckTransferListParams
import software.elborai.api.models.CheckTransferRetrieveParams
import software.elborai.api.models.CheckTransferStopPaymentParams

interface CheckTransferServiceAsync {

    /** Create a Check Transfer */
    @JvmOverloads
    fun create(
        params: CheckTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CheckTransfer>

    /** Retrieve a Check Transfer */
    @JvmOverloads
    fun retrieve(
        params: CheckTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CheckTransfer>

    /** List Check Transfers */
    @JvmOverloads
    fun list(
        params: CheckTransferListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CheckTransferListPageAsync>

    /** Approve a Check Transfer */
    @JvmOverloads
    fun approve(
        params: CheckTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CheckTransfer>

    /** Cancel a pending Check Transfer */
    @JvmOverloads
    fun cancel(
        params: CheckTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CheckTransfer>

    /** Request a stop payment on a Check Transfer */
    @JvmOverloads
    fun stopPayment(
        params: CheckTransferStopPaymentParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CheckTransfer>
}
