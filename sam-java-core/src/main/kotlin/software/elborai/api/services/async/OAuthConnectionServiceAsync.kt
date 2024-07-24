// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.OAuthConnection
import software.elborai.api.models.OAuthConnectionListPageAsync
import software.elborai.api.models.OAuthConnectionListParams
import software.elborai.api.models.OAuthConnectionRetrieveParams

interface OAuthConnectionServiceAsync {

    /** Retrieve an OAuth Connection */
    @JvmOverloads
    fun retrieve(
        params: OAuthConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<OAuthConnection>

    /** List OAuth Connections */
    @JvmOverloads
    fun list(
        params: OAuthConnectionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<OAuthConnectionListPageAsync>
}
