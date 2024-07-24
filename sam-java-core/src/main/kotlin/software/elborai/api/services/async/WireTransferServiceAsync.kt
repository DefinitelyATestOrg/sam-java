// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.WireTransfer
import software.elborai.api.models.WireTransferApproveParams
import software.elborai.api.models.WireTransferCancelParams
import software.elborai.api.models.WireTransferCreateParams
import software.elborai.api.models.WireTransferListPageAsync
import software.elborai.api.models.WireTransferListParams
import software.elborai.api.models.WireTransferRetrieveParams
import software.elborai.api.models.WireTransferReverseParams
import software.elborai.api.models.WireTransferSubmitParams

interface WireTransferServiceAsync {

    /** Create a Wire Transfer */
    @JvmOverloads
    fun create(
        params: WireTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<WireTransfer>

    /** Retrieve a Wire Transfer */
    @JvmOverloads
    fun retrieve(
        params: WireTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<WireTransfer>

    /** List Wire Transfers */
    @JvmOverloads
    fun list(
        params: WireTransferListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<WireTransferListPageAsync>

    /** Approve a Wire Transfer */
    @JvmOverloads
    fun approve(
        params: WireTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<WireTransfer>

    /** Cancel a pending Wire Transfer */
    @JvmOverloads
    fun cancel(
        params: WireTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<WireTransfer>

    /**
     * Simulates the reversal of a [Wire Transfer](#wire-transfers) by the Federal Reserve due to
     * error conditions. This will also create a [Transaction](#transaction) to account for the
     * returned funds. This Wire Transfer must first have a `status` of `complete`.
     */
    @JvmOverloads
    fun reverse(
        params: WireTransferReverseParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<WireTransfer>

    /**
     * Simulates the submission of a [Wire Transfer](#wire-transfers) to the Federal Reserve. This
     * transfer must first have a `status` of `pending_approval` or `pending_creating`.
     */
    @JvmOverloads
    fun submit(
        params: WireTransferSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<WireTransfer>
}
