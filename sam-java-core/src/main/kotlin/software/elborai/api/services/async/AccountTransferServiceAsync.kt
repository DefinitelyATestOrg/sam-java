// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.AccountTransfer
import software.elborai.api.models.AccountTransferApproveParams
import software.elborai.api.models.AccountTransferCancelParams
import software.elborai.api.models.AccountTransferCreateParams
import software.elborai.api.models.AccountTransferListPageAsync
import software.elborai.api.models.AccountTransferListParams
import software.elborai.api.models.AccountTransferRetrieveParams

interface AccountTransferServiceAsync {

    /** Create an Account Transfer */
    @JvmOverloads
    fun create(
        params: AccountTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountTransfer>

    /** Retrieve an Account Transfer */
    @JvmOverloads
    fun retrieve(
        params: AccountTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountTransfer>

    /** List Account Transfers */
    @JvmOverloads
    fun list(
        params: AccountTransferListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountTransferListPageAsync>

    /** Approve an Account Transfer */
    @JvmOverloads
    fun approve(
        params: AccountTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountTransfer>

    /** Cancel an Account Transfer */
    @JvmOverloads
    fun cancel(
        params: AccountTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountTransfer>
}
