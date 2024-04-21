// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.core.http.BinaryResponseContent
import software.elborai.api.models.FeedbackUpdateParams

interface FeedbackServiceAsync {

    @JvmOverloads
    fun update(
        params: FeedbackUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BinaryResponseContent>
}