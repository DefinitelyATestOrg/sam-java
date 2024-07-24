// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.Group
import software.elborai.api.models.GroupRetrieveDetailsParams

interface GroupServiceAsync {

    /** Returns details for the currently authenticated Group. */
    @JvmOverloads
    fun retrieveDetails(
        params: GroupRetrieveDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Group>
}
