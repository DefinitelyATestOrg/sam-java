// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.Lockbox
import software.elborai.api.models.LockboxCreateParams
import software.elborai.api.models.LockboxListPageAsync
import software.elborai.api.models.LockboxListParams
import software.elborai.api.models.LockboxRetrieveParams
import software.elborai.api.models.LockboxUpdateParams

interface LockboxServiceAsync {

    /** Create a Lockbox */
    @JvmOverloads
    fun create(
        params: LockboxCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Lockbox>

    /** Retrieve a Lockbox */
    @JvmOverloads
    fun retrieve(
        params: LockboxRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Lockbox>

    /** Update a Lockbox */
    @JvmOverloads
    fun update(
        params: LockboxUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Lockbox>

    /** List Lockboxes */
    @JvmOverloads
    fun list(
        params: LockboxListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<LockboxListPageAsync>
}
