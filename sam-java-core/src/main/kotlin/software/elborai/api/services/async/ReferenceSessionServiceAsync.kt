// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.core.http.BinaryResponseContent
import software.elborai.api.models.ReferenceSessionDeleteParams
import software.elborai.api.models.ReferenceSessionRetrieveParams
import software.elborai.api.models.ReferenceSessionUpdateParams

interface ReferenceSessionServiceAsync {

    @JvmOverloads
    fun retrieve(
        params: ReferenceSessionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BinaryResponseContent>

    @JvmOverloads
    fun update(
        params: ReferenceSessionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BinaryResponseContent>

    @JvmOverloads
    fun delete(
        params: ReferenceSessionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Void>
}
