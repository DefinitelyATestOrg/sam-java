// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.WireDrawdownRequest
import software.elborai.api.models.WireDrawdownRequestCreateParams
import software.elborai.api.models.WireDrawdownRequestListPageAsync
import software.elborai.api.models.WireDrawdownRequestListParams
import software.elborai.api.models.WireDrawdownRequestRetrieveParams

interface WireDrawdownRequestServiceAsync {

    /** Create a Wire Drawdown Request */
    @JvmOverloads
    fun create(
        params: WireDrawdownRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<WireDrawdownRequest>

    /** Retrieve a Wire Drawdown Request */
    @JvmOverloads
    fun retrieve(
        params: WireDrawdownRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<WireDrawdownRequest>

    /** List Wire Drawdown Requests */
    @JvmOverloads
    fun list(
        params: WireDrawdownRequestListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<WireDrawdownRequestListPageAsync>
}
