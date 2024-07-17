// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.AccountStatement
import software.elborai.api.models.AccountStatementListPageAsync
import software.elborai.api.models.AccountStatementListParams
import software.elborai.api.models.AccountStatementRetrieveParams

interface AccountStatementServiceAsync {

    /** Retrieve an Account Statement */
    @JvmOverloads
    fun retrieve(
        params: AccountStatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountStatement>

    /** List Account Statements */
    @JvmOverloads
    fun list(
        params: AccountStatementListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountStatementListPageAsync>
}
