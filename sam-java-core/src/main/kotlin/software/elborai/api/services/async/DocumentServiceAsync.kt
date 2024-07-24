// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.Document
import software.elborai.api.models.DocumentListPageAsync
import software.elborai.api.models.DocumentListParams
import software.elborai.api.models.DocumentRetrieveParams

interface DocumentServiceAsync {

    /** Retrieve a Document */
    @JvmOverloads
    fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Document>

    /** List Documents */
    @JvmOverloads
    fun list(
        params: DocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DocumentListPageAsync>
}
