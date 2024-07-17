// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.BookkeepingAccount
import software.elborai.api.models.BookkeepingAccountBalanceParams
import software.elborai.api.models.BookkeepingAccountCreateParams
import software.elborai.api.models.BookkeepingAccountListPageAsync
import software.elborai.api.models.BookkeepingAccountListParams
import software.elborai.api.models.BookkeepingAccountUpdateParams
import software.elborai.api.models.BookkeepingBalanceLookup

interface BookkeepingAccountServiceAsync {

    /** Create a Bookkeeping Account */
    @JvmOverloads
    fun create(
        params: BookkeepingAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BookkeepingAccount>

    /** Update a Bookkeeping Account */
    @JvmOverloads
    fun update(
        params: BookkeepingAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BookkeepingAccount>

    /** List Bookkeeping Accounts */
    @JvmOverloads
    fun list(
        params: BookkeepingAccountListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BookkeepingAccountListPageAsync>

    /** Retrieve a Bookkeeping Account Balance */
    @JvmOverloads
    fun balance(
        params: BookkeepingAccountBalanceParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BookkeepingBalanceLookup>
}
