// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.DigitalCardProfile
import software.elborai.api.models.DigitalCardProfileArchiveParams
import software.elborai.api.models.DigitalCardProfileCloneParams
import software.elborai.api.models.DigitalCardProfileCreateParams
import software.elborai.api.models.DigitalCardProfileListPageAsync
import software.elborai.api.models.DigitalCardProfileListParams
import software.elborai.api.models.DigitalCardProfileRetrieveParams

interface DigitalCardProfileServiceAsync {

    /** Create a Digital Card Profile */
    @JvmOverloads
    fun create(
        params: DigitalCardProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DigitalCardProfile>

    /** Retrieve a Digital Card Profile */
    @JvmOverloads
    fun retrieve(
        params: DigitalCardProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DigitalCardProfile>

    /** List Card Profiles */
    @JvmOverloads
    fun list(
        params: DigitalCardProfileListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DigitalCardProfileListPageAsync>

    /** Archive a Digital Card Profile */
    @JvmOverloads
    fun archive(
        params: DigitalCardProfileArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DigitalCardProfile>

    /** Clones a Digital Card Profile */
    @JvmOverloads
    fun clone(
        params: DigitalCardProfileCloneParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DigitalCardProfile>
}
