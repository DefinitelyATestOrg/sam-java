// File generated from our OpenAPI spec by Stainless.

package me.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import me.elborai.api.core.ClientOptions
import me.elborai.api.core.RequestOptions
import me.elborai.api.core.http.HttpResponseFor
import me.elborai.api.models.models.ModelListParams
import me.elborai.api.models.models.ModelListResponse
import me.elborai.api.models.models.ModelRetrieveBetaParams
import me.elborai.api.models.models.ModelRetrieveBetaResponse
import me.elborai.api.models.models.ModelRetrieveParams
import me.elborai.api.models.models.ModelRetrieveResponse

interface ModelServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ModelServiceAsync

    /**
     * Get a specific model.
     *
     * The Models API response can be used to determine information about a specific model or
     * resolve a model alias to a model ID.
     */
    fun retrieve(modelId: String): CompletableFuture<ModelRetrieveResponse> =
        retrieve(modelId, ModelRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        modelId: String,
        params: ModelRetrieveParams = ModelRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ModelRetrieveResponse> =
        retrieve(params.toBuilder().modelId(modelId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        modelId: String,
        params: ModelRetrieveParams = ModelRetrieveParams.none(),
    ): CompletableFuture<ModelRetrieveResponse> = retrieve(modelId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ModelRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ModelRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: ModelRetrieveParams): CompletableFuture<ModelRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        modelId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ModelRetrieveResponse> =
        retrieve(modelId, ModelRetrieveParams.none(), requestOptions)

    /**
     * List available models.
     *
     * The Models API response can be used to determine which models are available for use in the
     * API. More recently released models are listed first.
     */
    fun list(): CompletableFuture<ModelListResponse> = list(ModelListParams.none())

    /** @see list */
    fun list(
        params: ModelListParams = ModelListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ModelListResponse>

    /** @see list */
    fun list(
        params: ModelListParams = ModelListParams.none()
    ): CompletableFuture<ModelListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ModelListResponse> =
        list(ModelListParams.none(), requestOptions)

    /**
     * Get a specific model.
     *
     * The Models API response can be used to determine information about a specific model or
     * resolve a model alias to a model ID.
     */
    fun retrieveBeta(modelId: String): CompletableFuture<ModelRetrieveBetaResponse> =
        retrieveBeta(modelId, ModelRetrieveBetaParams.none())

    /** @see retrieveBeta */
    fun retrieveBeta(
        modelId: String,
        params: ModelRetrieveBetaParams = ModelRetrieveBetaParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ModelRetrieveBetaResponse> =
        retrieveBeta(params.toBuilder().modelId(modelId).build(), requestOptions)

    /** @see retrieveBeta */
    fun retrieveBeta(
        modelId: String,
        params: ModelRetrieveBetaParams = ModelRetrieveBetaParams.none(),
    ): CompletableFuture<ModelRetrieveBetaResponse> =
        retrieveBeta(modelId, params, RequestOptions.none())

    /** @see retrieveBeta */
    fun retrieveBeta(
        params: ModelRetrieveBetaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ModelRetrieveBetaResponse>

    /** @see retrieveBeta */
    fun retrieveBeta(
        params: ModelRetrieveBetaParams
    ): CompletableFuture<ModelRetrieveBetaResponse> = retrieveBeta(params, RequestOptions.none())

    /** @see retrieveBeta */
    fun retrieveBeta(
        modelId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ModelRetrieveBetaResponse> =
        retrieveBeta(modelId, ModelRetrieveBetaParams.none(), requestOptions)

    /** A view of [ModelServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ModelServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/models/{model_id}`, but is otherwise the same as
         * [ModelServiceAsync.retrieve].
         */
        fun retrieve(modelId: String): CompletableFuture<HttpResponseFor<ModelRetrieveResponse>> =
            retrieve(modelId, ModelRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            modelId: String,
            params: ModelRetrieveParams = ModelRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ModelRetrieveResponse>> =
            retrieve(params.toBuilder().modelId(modelId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            modelId: String,
            params: ModelRetrieveParams = ModelRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ModelRetrieveResponse>> =
            retrieve(modelId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ModelRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ModelRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ModelRetrieveParams
        ): CompletableFuture<HttpResponseFor<ModelRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            modelId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ModelRetrieveResponse>> =
            retrieve(modelId, ModelRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/models`, but is otherwise the same as
         * [ModelServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ModelListResponse>> =
            list(ModelListParams.none())

        /** @see list */
        fun list(
            params: ModelListParams = ModelListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ModelListResponse>>

        /** @see list */
        fun list(
            params: ModelListParams = ModelListParams.none()
        ): CompletableFuture<HttpResponseFor<ModelListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ModelListResponse>> =
            list(ModelListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/models/{model_id}?beta=true`, but is otherwise
         * the same as [ModelServiceAsync.retrieveBeta].
         */
        fun retrieveBeta(
            modelId: String
        ): CompletableFuture<HttpResponseFor<ModelRetrieveBetaResponse>> =
            retrieveBeta(modelId, ModelRetrieveBetaParams.none())

        /** @see retrieveBeta */
        fun retrieveBeta(
            modelId: String,
            params: ModelRetrieveBetaParams = ModelRetrieveBetaParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ModelRetrieveBetaResponse>> =
            retrieveBeta(params.toBuilder().modelId(modelId).build(), requestOptions)

        /** @see retrieveBeta */
        fun retrieveBeta(
            modelId: String,
            params: ModelRetrieveBetaParams = ModelRetrieveBetaParams.none(),
        ): CompletableFuture<HttpResponseFor<ModelRetrieveBetaResponse>> =
            retrieveBeta(modelId, params, RequestOptions.none())

        /** @see retrieveBeta */
        fun retrieveBeta(
            params: ModelRetrieveBetaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ModelRetrieveBetaResponse>>

        /** @see retrieveBeta */
        fun retrieveBeta(
            params: ModelRetrieveBetaParams
        ): CompletableFuture<HttpResponseFor<ModelRetrieveBetaResponse>> =
            retrieveBeta(params, RequestOptions.none())

        /** @see retrieveBeta */
        fun retrieveBeta(
            modelId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ModelRetrieveBetaResponse>> =
            retrieveBeta(modelId, ModelRetrieveBetaParams.none(), requestOptions)
    }
}
