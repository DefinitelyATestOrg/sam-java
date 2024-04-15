// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.core.http.BinaryResponseContent
import software.elborai.api.models.MemberDeleteParams
import software.elborai.api.models.MemberUpdateParams

interface MemberServiceAsync {

    @JvmOverloads
    fun update(
        params: MemberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BinaryResponseContent>

    @JvmOverloads
    fun delete(
        params: MemberDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Void>
}
