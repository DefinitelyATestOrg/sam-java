// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async.entities

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.Entity
import software.elborai.api.models.EntitySupplementalDocumentCreateParams
import software.elborai.api.models.EntitySupplementalDocumentListPageAsync
import software.elborai.api.models.EntitySupplementalDocumentListParams

interface SupplementalDocumentServiceAsync {

    /** Create a supplemental document for an Entity */
    @JvmOverloads
    fun create(
        params: EntitySupplementalDocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Entity>

    /** List Entity Supplemental Document Submissions */
    @JvmOverloads
    fun list(
        params: EntitySupplementalDocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<EntitySupplementalDocumentListPageAsync>
}
