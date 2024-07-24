// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.Export
import software.elborai.api.models.ExportCreateParams
import software.elborai.api.models.ExportListPageAsync
import software.elborai.api.models.ExportListParams
import software.elborai.api.models.ExportRetrieveParams

interface ExportServiceAsync {

    /** Create an Export */
    @JvmOverloads
    fun create(
        params: ExportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Export>

    /** Retrieve an Export */
    @JvmOverloads
    fun retrieve(
        params: ExportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Export>

    /** List Exports */
    @JvmOverloads
    fun list(
        params: ExportListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ExportListPageAsync>
}
