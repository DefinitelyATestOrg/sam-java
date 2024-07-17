// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.AccountNumber
import software.elborai.api.models.AccountNumberCreateParams
import software.elborai.api.models.AccountNumberListPageAsync
import software.elborai.api.models.AccountNumberListParams
import software.elborai.api.models.AccountNumberRetrieveParams
import software.elborai.api.models.AccountNumberUpdateParams

interface AccountNumberServiceAsync {

    /** Create an Account Number */
    @JvmOverloads
    fun create(
        params: AccountNumberCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountNumber>

    /** Retrieve an Account Number */
    @JvmOverloads
    fun retrieve(
        params: AccountNumberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountNumber>

    /** Update an Account Number */
    @JvmOverloads
    fun update(
        params: AccountNumberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountNumber>

    /** List Account Numbers */
    @JvmOverloads
    fun list(
        params: AccountNumberListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountNumberListPageAsync>
}
