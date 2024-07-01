// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.core.http.BinaryResponseContent
import software.elborai.api.models.DocumentDeleteParams
import software.elborai.api.models.DocumentRetrieveParams
import software.elborai.api.models.DocumentUpdateParams

interface DocumentServiceAsync {

    @JvmOverloads
    fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BinaryResponseContent>

    @JvmOverloads
    fun update(
        params: DocumentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BinaryResponseContent>

    @JvmOverloads
    fun delete(
        params: DocumentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Void>
}
