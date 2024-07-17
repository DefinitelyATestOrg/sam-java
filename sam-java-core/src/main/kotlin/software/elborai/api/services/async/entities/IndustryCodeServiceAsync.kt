// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async.entities

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.Entity
import software.elborai.api.models.EntityIndustryCodeCreateParams

interface IndustryCodeServiceAsync {

    /** Update the industry code for a corporate Entity */
    @JvmOverloads
    fun create(
        params: EntityIndustryCodeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Entity>
}
