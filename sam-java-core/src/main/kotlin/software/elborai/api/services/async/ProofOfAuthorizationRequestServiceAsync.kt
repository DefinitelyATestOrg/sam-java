// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.ProofOfAuthorizationRequest
import software.elborai.api.models.ProofOfAuthorizationRequestListPageAsync
import software.elborai.api.models.ProofOfAuthorizationRequestListParams
import software.elborai.api.models.ProofOfAuthorizationRequestRetrieveParams

interface ProofOfAuthorizationRequestServiceAsync {

    /** Retrieve a Proof of Authorization Request */
    @JvmOverloads
    fun retrieve(
        params: ProofOfAuthorizationRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ProofOfAuthorizationRequest>

    /** List Proof of Authorization Requests */
    @JvmOverloads
    fun list(
        params: ProofOfAuthorizationRequestListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ProofOfAuthorizationRequestListPageAsync>
}
