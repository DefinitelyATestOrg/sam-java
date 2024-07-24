// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.BookkeepingEntry
import software.elborai.api.models.BookkeepingEntryListPageAsync
import software.elborai.api.models.BookkeepingEntryListParams
import software.elborai.api.models.BookkeepingEntryRetrieveParams

interface BookkeepingEntryServiceAsync {

    /** Retrieve a Bookkeeping Entry */
    @JvmOverloads
    fun retrieve(
        params: BookkeepingEntryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BookkeepingEntry>

    /** List Bookkeeping Entries */
    @JvmOverloads
    fun list(
        params: BookkeepingEntryListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BookkeepingEntryListPageAsync>
}
