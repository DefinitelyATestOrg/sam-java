// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.PhysicalCardProfile
import software.elborai.api.models.PhysicalCardProfileArchiveParams
import software.elborai.api.models.PhysicalCardProfileCloneParams
import software.elborai.api.models.PhysicalCardProfileCreateParams
import software.elborai.api.models.PhysicalCardProfileListPageAsync
import software.elborai.api.models.PhysicalCardProfileListParams
import software.elborai.api.models.PhysicalCardProfileRetrieveParams

interface PhysicalCardProfileServiceAsync {

    /** Create a Physical Card Profile */
    @JvmOverloads
    fun create(
        params: PhysicalCardProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PhysicalCardProfile>

    /** Retrieve a Card Profile */
    @JvmOverloads
    fun retrieve(
        params: PhysicalCardProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PhysicalCardProfile>

    /** List Physical Card Profiles */
    @JvmOverloads
    fun list(
        params: PhysicalCardProfileListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PhysicalCardProfileListPageAsync>

    /** Archive a Physical Card Profile */
    @JvmOverloads
    fun archive(
        params: PhysicalCardProfileArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PhysicalCardProfile>

    /** Clone a Physical Card Profile */
    @JvmOverloads
    fun clone(
        params: PhysicalCardProfileCloneParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PhysicalCardProfile>
}
