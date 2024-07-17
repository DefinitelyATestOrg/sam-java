// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.OAuthToken
import software.elborai.api.models.OAuthTokenCreateParams

interface OAuthTokenServiceAsync {

    /** Create an OAuth Token */
    @JvmOverloads
    fun create(
        params: OAuthTokenCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<OAuthToken>
}
