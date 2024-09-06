// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.ApiResponse
import software.elborai.api.models.Pet
import software.elborai.api.models.PetCreateParams
import software.elborai.api.models.PetDeleteParams
import software.elborai.api.models.PetFindByStatusParams
import software.elborai.api.models.PetFindByTagsParams
import software.elborai.api.models.PetRetrieveParams
import software.elborai.api.models.PetUpdateParams
import software.elborai.api.models.PetUploadImageParams

interface PetServiceAsync {

    /** Updates a pet in the store with form data */
    @JvmOverloads
    fun create(
        params: PetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Void>

    /** Returns a single pet */
    @JvmOverloads
    fun retrieve(
        params: PetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Pet>

    /** Update an existing pet by Id */
    @JvmOverloads
    fun update(
        params: PetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Pet>

    /** Deletes a pet */
    @JvmOverloads
    fun delete(
        params: PetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Void>

    /** Multiple status values can be provided with comma separated strings */
    @JvmOverloads
    fun findByStatus(
        params: PetFindByStatusParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<List<Pet>>

    /**
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     */
    @JvmOverloads
    fun findByTags(
        params: PetFindByTagsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<List<Pet>>

    /** uploads an image */
    @JvmOverloads
    fun uploadImage(
        params: PetUploadImageParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ApiResponse>
}
