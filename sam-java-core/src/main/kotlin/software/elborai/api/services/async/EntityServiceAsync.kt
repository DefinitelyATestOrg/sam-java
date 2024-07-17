// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.Entity
import software.elborai.api.models.EntityArchiveParams
import software.elborai.api.models.EntityConfirmParams
import software.elborai.api.models.EntityCreateParams
import software.elborai.api.models.EntityListPageAsync
import software.elborai.api.models.EntityListParams
import software.elborai.api.models.EntityRetrieveParams
import software.elborai.api.models.EntityUpdateAddressParams
import software.elborai.api.services.async.entities.BeneficialOwnerServiceAsync
import software.elborai.api.services.async.entities.IndustryCodeServiceAsync
import software.elborai.api.services.async.entities.SupplementalDocumentServiceAsync

interface EntityServiceAsync {

    fun beneficialOwners(): BeneficialOwnerServiceAsync

    fun supplementalDocuments(): SupplementalDocumentServiceAsync

    fun industryCode(): IndustryCodeServiceAsync

    /** Create an Entity */
    @JvmOverloads
    fun create(
        params: EntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Entity>

    /** Retrieve an Entity */
    @JvmOverloads
    fun retrieve(
        params: EntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Entity>

    /** List Entities */
    @JvmOverloads
    fun list(
        params: EntityListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<EntityListPageAsync>

    /** Archive an Entity */
    @JvmOverloads
    fun archive(
        params: EntityArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Entity>

    /**
     * Depending on your program, you may be required to re-confirm an Entity's details on a
     * recurring basis. After making any required updates, call this endpoint to record that your
     * user confirmed their details.
     */
    @JvmOverloads
    fun confirm(
        params: EntityConfirmParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Entity>

    /** Update a Natural Person or Corporation's address */
    @JvmOverloads
    fun updateAddress(
        params: EntityUpdateAddressParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Entity>
}
