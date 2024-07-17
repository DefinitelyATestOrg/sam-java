// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.Account
import software.elborai.api.models.AccountBalanceParams
import software.elborai.api.models.AccountCloseParams
import software.elborai.api.models.AccountCreateParams
import software.elborai.api.models.AccountListPageAsync
import software.elborai.api.models.AccountListParams
import software.elborai.api.models.AccountRetrieveParams
import software.elborai.api.models.AccountUpdateParams
import software.elborai.api.models.BalanceLookup

interface AccountServiceAsync {

    /** Create an Account */
    @JvmOverloads
    fun create(
        params: AccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Account>

    /** Retrieve an Account */
    @JvmOverloads
    fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Account>

    /** Update an Account */
    @JvmOverloads
    fun update(
        params: AccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Account>

    /** List Accounts */
    @JvmOverloads
    fun list(
        params: AccountListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountListPageAsync>

    /** Retrieve an Account Balance */
    @JvmOverloads
    fun balance(
        params: AccountBalanceParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BalanceLookup>

    /** Close an Account */
    @JvmOverloads
    fun close(
        params: AccountCloseParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Account>
}
