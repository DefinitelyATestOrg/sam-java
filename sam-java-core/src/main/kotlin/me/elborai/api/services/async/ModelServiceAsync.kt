// File generated from our OpenAPI spec by Stainless.

package me.elborai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import me.elborai.api.core.RequestOptions
import me.elborai.api.core.http.HttpResponseFor
import me.elborai.api.models.ModelListParams
import me.elborai.api.models.ModelListResponse
import me.elborai.api.models.ModelRetrieveBetaParams
import me.elborai.api.models.ModelRetrieveBetaResponse
import me.elborai.api.models.ModelRetrieveParams
import me.elborai.api.models.ModelRetrieveResponse

interface ModelServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Get a specific model.
     *
     * The Models API response can be used to determine information about a specific model or
     * resolve a model alias to a model ID.
     */
    fun retrieve(params: ModelRetrieveParams): CompletableFuture<ModelRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ModelRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ModelRetrieveResponse>

    /**
     * List available models.
     *
     * The Models API response can be used to determine which models are available for use in the
     * API. More recently released models are listed first.
     */
    fun list(): CompletableFuture<ModelListResponse> = list(ModelListParams.none())

    /** @see [list] */
    fun list(
        params: ModelListParams = ModelListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ModelListResponse>

    /** @see [list] */
    fun list(
        params: ModelListParams = ModelListParams.none()
    ): CompletableFuture<ModelListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<ModelListResponse> =
        list(ModelListParams.none(), requestOptions)

    /**
     * Get a specific model.
     *
     * The Models API response can be used to determine information about a specific model or
     * resolve a model alias to a model ID.
     */
    fun retrieveBeta(
        params: ModelRetrieveBetaParams
    ): CompletableFuture<ModelRetrieveBetaResponse> = retrieveBeta(params, RequestOptions.none())

    /** @see [retrieveBeta] */
    fun retrieveBeta(
        params: ModelRetrieveBetaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ModelRetrieveBetaResponse>

    /** A view of [ModelServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/models/{model_id}`, but is otherwise the same as
         * [ModelServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ModelRetrieveParams
        ): CompletableFuture<HttpResponseFor<ModelRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ModelRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ModelRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/models`, but is otherwise the same as
         * [ModelServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<ModelListResponse>> =
            list(ModelListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ModelListParams = ModelListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ModelListResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ModelListParams = ModelListParams.none()
        ): CompletableFuture<HttpResponseFor<ModelListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ModelListResponse>> =
            list(ModelListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/models/{model_id}?beta=true`, but is otherwise
         * the same as [ModelServiceAsync.retrieveBeta].
         */
        @MustBeClosed
        fun retrieveBeta(
            params: ModelRetrieveBetaParams
        ): CompletableFuture<HttpResponseFor<ModelRetrieveBetaResponse>> =
            retrieveBeta(params, RequestOptions.none())

        /** @see [retrieveBeta] */
        @MustBeClosed
        fun retrieveBeta(
            params: ModelRetrieveBetaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ModelRetrieveBetaResponse>>
    }
}
