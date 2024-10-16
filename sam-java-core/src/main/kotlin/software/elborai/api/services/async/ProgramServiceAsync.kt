// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.Program
import software.elborai.api.models.ProgramListPageAsync
import software.elborai.api.models.ProgramListParams
import software.elborai.api.models.ProgramRetrieveParams

interface ProgramServiceAsync {

    /** Retrieve a Program */
    @JvmOverloads
    fun retrieve(
        params: ProgramRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Program>

    /** List Programs */
    @JvmOverloads
    fun list(
        params: ProgramListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ProgramListPageAsync>
}
