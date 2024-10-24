// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.ProofOfAuthorizationRequestSubmission
import software.elborai.api.models.ProofOfAuthorizationRequestSubmissionCreateParams
import software.elborai.api.models.ProofOfAuthorizationRequestSubmissionListPageAsync
import software.elborai.api.models.ProofOfAuthorizationRequestSubmissionListParams
import software.elborai.api.models.ProofOfAuthorizationRequestSubmissionRetrieveParams

interface ProofOfAuthorizationRequestSubmissionServiceAsync {

    /** Submit Proof of Authorization */
    @JvmOverloads
    fun create(
        params: ProofOfAuthorizationRequestSubmissionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ProofOfAuthorizationRequestSubmission>

    /** Retrieve a Proof of Authorization Request Submission */
    @JvmOverloads
    fun retrieve(
        params: ProofOfAuthorizationRequestSubmissionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ProofOfAuthorizationRequestSubmission>

    /** List Proof of Authorization Request Submissions */
    @JvmOverloads
    fun list(
        params: ProofOfAuthorizationRequestSubmissionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ProofOfAuthorizationRequestSubmissionListPageAsync>
}
