// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async.intrafi

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.IntrafiExclusion
import software.elborai.api.models.IntrafiExclusionArchiveParams
import software.elborai.api.models.IntrafiExclusionCreateParams
import software.elborai.api.models.IntrafiExclusionListPageAsync
import software.elborai.api.models.IntrafiExclusionListParams
import software.elborai.api.models.IntrafiExclusionRetrieveParams

interface ExclusionServiceAsync {

    /** Create an IntraFi Exclusion */
    @JvmOverloads
    fun create(
        params: IntrafiExclusionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<IntrafiExclusion>

    /** Get an IntraFi Exclusion */
    @JvmOverloads
    fun retrieve(
        params: IntrafiExclusionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<IntrafiExclusion>

    /** List IntraFi Exclusions. */
    @JvmOverloads
    fun list(
        params: IntrafiExclusionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<IntrafiExclusionListPageAsync>

    /** Archive an IntraFi Exclusion */
    @JvmOverloads
    fun archive(
        params: IntrafiExclusionArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<IntrafiExclusion>
}
