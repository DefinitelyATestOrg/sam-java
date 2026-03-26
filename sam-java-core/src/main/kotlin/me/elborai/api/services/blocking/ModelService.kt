// File generated from our OpenAPI spec by Stainless.

package me.elborai.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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

interface ModelService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ModelService

    /**
     * Get a specific model.
     *
     * The Models API response can be used to determine information about a specific model or
     * resolve a model alias to a model ID.
     */
    fun retrieve(modelId: String): ModelRetrieveResponse =
        retrieve(modelId, ModelRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        modelId: String,
        params: ModelRetrieveParams = ModelRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ModelRetrieveResponse = retrieve(params.toBuilder().modelId(modelId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        modelId: String,
        params: ModelRetrieveParams = ModelRetrieveParams.none(),
    ): ModelRetrieveResponse = retrieve(modelId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ModelRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ModelRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ModelRetrieveParams): ModelRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(modelId: String, requestOptions: RequestOptions): ModelRetrieveResponse =
        retrieve(modelId, ModelRetrieveParams.none(), requestOptions)

    /**
     * List available models.
     *
     * The Models API response can be used to determine which models are available for use in the
     * API. More recently released models are listed first.
     */
    fun list(): ModelListResponse = list(ModelListParams.none())

    /** @see list */
    fun list(
        params: ModelListParams = ModelListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ModelListResponse

    /** @see list */
    fun list(params: ModelListParams = ModelListParams.none()): ModelListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ModelListResponse =
        list(ModelListParams.none(), requestOptions)

    /**
     * Get a specific model.
     *
     * The Models API response can be used to determine information about a specific model or
     * resolve a model alias to a model ID.
     */
    fun retrieveBeta(modelId: String): ModelRetrieveBetaResponse =
        retrieveBeta(modelId, ModelRetrieveBetaParams.none())

    /** @see retrieveBeta */
    fun retrieveBeta(
        modelId: String,
        params: ModelRetrieveBetaParams = ModelRetrieveBetaParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ModelRetrieveBetaResponse =
        retrieveBeta(params.toBuilder().modelId(modelId).build(), requestOptions)

    /** @see retrieveBeta */
    fun retrieveBeta(
        modelId: String,
        params: ModelRetrieveBetaParams = ModelRetrieveBetaParams.none(),
    ): ModelRetrieveBetaResponse = retrieveBeta(modelId, params, RequestOptions.none())

    /** @see retrieveBeta */
    fun retrieveBeta(
        params: ModelRetrieveBetaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ModelRetrieveBetaResponse

    /** @see retrieveBeta */
    fun retrieveBeta(params: ModelRetrieveBetaParams): ModelRetrieveBetaResponse =
        retrieveBeta(params, RequestOptions.none())

    /** @see retrieveBeta */
    fun retrieveBeta(modelId: String, requestOptions: RequestOptions): ModelRetrieveBetaResponse =
        retrieveBeta(modelId, ModelRetrieveBetaParams.none(), requestOptions)

    /** A view of [ModelService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ModelService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/models/{model_id}`, but is otherwise the same as
         * [ModelService.retrieve].
         */
        @MustBeClosed
        fun retrieve(modelId: String): HttpResponseFor<ModelRetrieveResponse> =
            retrieve(modelId, ModelRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            modelId: String,
            params: ModelRetrieveParams = ModelRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ModelRetrieveResponse> =
            retrieve(params.toBuilder().modelId(modelId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            modelId: String,
            params: ModelRetrieveParams = ModelRetrieveParams.none(),
        ): HttpResponseFor<ModelRetrieveResponse> = retrieve(modelId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ModelRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ModelRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ModelRetrieveParams): HttpResponseFor<ModelRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            modelId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ModelRetrieveResponse> =
            retrieve(modelId, ModelRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/models`, but is otherwise the same as
         * [ModelService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ModelListResponse> = list(ModelListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ModelListParams = ModelListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ModelListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ModelListParams = ModelListParams.none()
        ): HttpResponseFor<ModelListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ModelListResponse> =
            list(ModelListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/models/{model_id}?beta=true`, but is otherwise
         * the same as [ModelService.retrieveBeta].
         */
        @MustBeClosed
        fun retrieveBeta(modelId: String): HttpResponseFor<ModelRetrieveBetaResponse> =
            retrieveBeta(modelId, ModelRetrieveBetaParams.none())

        /** @see retrieveBeta */
        @MustBeClosed
        fun retrieveBeta(
            modelId: String,
            params: ModelRetrieveBetaParams = ModelRetrieveBetaParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ModelRetrieveBetaResponse> =
            retrieveBeta(params.toBuilder().modelId(modelId).build(), requestOptions)

        /** @see retrieveBeta */
        @MustBeClosed
        fun retrieveBeta(
            modelId: String,
            params: ModelRetrieveBetaParams = ModelRetrieveBetaParams.none(),
        ): HttpResponseFor<ModelRetrieveBetaResponse> =
            retrieveBeta(modelId, params, RequestOptions.none())

        /** @see retrieveBeta */
        @MustBeClosed
        fun retrieveBeta(
            params: ModelRetrieveBetaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ModelRetrieveBetaResponse>

        /** @see retrieveBeta */
        @MustBeClosed
        fun retrieveBeta(
            params: ModelRetrieveBetaParams
        ): HttpResponseFor<ModelRetrieveBetaResponse> = retrieveBeta(params, RequestOptions.none())

        /** @see retrieveBeta */
        @MustBeClosed
        fun retrieveBeta(
            modelId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ModelRetrieveBetaResponse> =
            retrieveBeta(modelId, ModelRetrieveBetaParams.none(), requestOptions)
    }
}
