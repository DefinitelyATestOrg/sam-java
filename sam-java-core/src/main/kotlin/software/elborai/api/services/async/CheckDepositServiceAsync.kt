// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.CheckDeposit
import software.elborai.api.models.CheckDepositCreateParams
import software.elborai.api.models.CheckDepositListPageAsync
import software.elborai.api.models.CheckDepositListParams
import software.elborai.api.models.CheckDepositRetrieveParams

interface CheckDepositServiceAsync {

    /** Create a Check Deposit */
    @JvmOverloads
    fun create(
        params: CheckDepositCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CheckDeposit>

    /** Retrieve a Check Deposit */
    @JvmOverloads
    fun retrieve(
        params: CheckDepositRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CheckDeposit>

    /** List Check Deposits */
    @JvmOverloads
    fun list(
        params: CheckDepositListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CheckDepositListPageAsync>
}
