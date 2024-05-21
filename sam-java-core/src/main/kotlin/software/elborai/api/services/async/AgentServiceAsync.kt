// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.core.http.BinaryResponseContent
import software.elborai.api.models.AgentDeleteParams
import software.elborai.api.models.AgentRetrieveParams
import software.elborai.api.models.AgentUpdateParams
import software.elborai.api.services.async.agents.ConfigServiceAsync
import software.elborai.api.services.async.agents.HiddenTagServiceAsync

interface AgentServiceAsync {

    fun hiddenTags(): HiddenTagServiceAsync

    fun configs(): ConfigServiceAsync

    @JvmOverloads
    fun retrieve(
        params: AgentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BinaryResponseContent>

    @JvmOverloads
    fun update(
        params: AgentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BinaryResponseContent>

    @JvmOverloads
    fun delete(
        params: AgentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Void>
}
