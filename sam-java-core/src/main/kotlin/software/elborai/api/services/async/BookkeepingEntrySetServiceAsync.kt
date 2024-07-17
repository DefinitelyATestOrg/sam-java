// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.BookkeepingEntrySet
import software.elborai.api.models.BookkeepingEntrySetCreateParams
import software.elborai.api.models.BookkeepingEntrySetListPageAsync
import software.elborai.api.models.BookkeepingEntrySetListParams
import software.elborai.api.models.BookkeepingEntrySetRetrieveParams

interface BookkeepingEntrySetServiceAsync {

    /** Create a Bookkeeping Entry Set */
    @JvmOverloads
    fun create(
        params: BookkeepingEntrySetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BookkeepingEntrySet>

    /** Retrieve a Bookkeeping Entry Set */
    @JvmOverloads
    fun retrieve(
        params: BookkeepingEntrySetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BookkeepingEntrySet>

    /** List Bookkeeping Entry Sets */
    @JvmOverloads
    fun list(
        params: BookkeepingEntrySetListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BookkeepingEntrySetListPageAsync>
}
