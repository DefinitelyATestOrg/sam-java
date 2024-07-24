// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async.intrafi

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.IntrafiAccountEnrollment
import software.elborai.api.models.IntrafiAccountEnrollmentCreateParams
import software.elborai.api.models.IntrafiAccountEnrollmentListPageAsync
import software.elborai.api.models.IntrafiAccountEnrollmentListParams
import software.elborai.api.models.IntrafiAccountEnrollmentRetrieveParams
import software.elborai.api.models.IntrafiAccountEnrollmentUnenrollParams

interface AccountEnrollmentServiceAsync {

    /** Enroll an account in the IntraFi deposit sweep network. */
    @JvmOverloads
    fun create(
        params: IntrafiAccountEnrollmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<IntrafiAccountEnrollment>

    /** Get an IntraFi Account Enrollment */
    @JvmOverloads
    fun retrieve(
        params: IntrafiAccountEnrollmentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<IntrafiAccountEnrollment>

    /** List IntraFi Account Enrollments */
    @JvmOverloads
    fun list(
        params: IntrafiAccountEnrollmentListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<IntrafiAccountEnrollmentListPageAsync>

    /** Unenroll an account from IntraFi. */
    @JvmOverloads
    fun unenroll(
        params: IntrafiAccountEnrollmentUnenrollParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<IntrafiAccountEnrollment>
}
