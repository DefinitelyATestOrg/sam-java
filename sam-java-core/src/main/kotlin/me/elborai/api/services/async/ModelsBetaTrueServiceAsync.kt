// File generated from our OpenAPI spec by Stainless.

package me.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import me.elborai.api.core.ClientOptions
import me.elborai.api.core.RequestOptions
import me.elborai.api.core.http.HttpResponseFor
import me.elborai.api.models.modelsbetatrue.ModelsBetaTrueListParams
import me.elborai.api.models.modelsbetatrue.ModelsBetaTrueListResponse

interface ModelsBetaTrueServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ModelsBetaTrueServiceAsync

    /**
     * List available models.
     *
     * The Models API response can be used to determine which models are available for use in the
     * API. More recently released models are listed first.
     */
    fun list(): CompletableFuture<ModelsBetaTrueListResponse> =
        list(ModelsBetaTrueListParams.none())

    /** @see [list] */
    fun list(
        params: ModelsBetaTrueListParams = ModelsBetaTrueListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ModelsBetaTrueListResponse>

    /** @see [list] */
    fun list(
        params: ModelsBetaTrueListParams = ModelsBetaTrueListParams.none()
    ): CompletableFuture<ModelsBetaTrueListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<ModelsBetaTrueListResponse> =
        list(ModelsBetaTrueListParams.none(), requestOptions)

    /**
     * A view of [ModelsBetaTrueServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ModelsBetaTrueServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/models?beta=true`, but is otherwise the same as
         * [ModelsBetaTrueServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ModelsBetaTrueListResponse>> =
            list(ModelsBetaTrueListParams.none())

        /** @see [list] */
        fun list(
            params: ModelsBetaTrueListParams = ModelsBetaTrueListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ModelsBetaTrueListResponse>>

        /** @see [list] */
        fun list(
            params: ModelsBetaTrueListParams = ModelsBetaTrueListParams.none()
        ): CompletableFuture<HttpResponseFor<ModelsBetaTrueListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ModelsBetaTrueListResponse>> =
            list(ModelsBetaTrueListParams.none(), requestOptions)
    }
}
