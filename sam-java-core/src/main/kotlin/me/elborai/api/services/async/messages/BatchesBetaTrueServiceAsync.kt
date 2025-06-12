// File generated from our OpenAPI spec by Stainless.

package me.elborai.api.services.async.messages

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import me.elborai.api.core.ClientOptions
import me.elborai.api.core.RequestOptions
import me.elborai.api.core.http.HttpResponseFor
import me.elborai.api.models.messages.batchesbetatrue.BatchesBetaTrueCreateParams
import me.elborai.api.models.messages.batchesbetatrue.BatchesBetaTrueCreateResponse
import me.elborai.api.models.messages.batchesbetatrue.BatchesBetaTrueListParams
import me.elborai.api.models.messages.batchesbetatrue.BatchesBetaTrueListResponse

interface BatchesBetaTrueServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchesBetaTrueServiceAsync

    /**
     * Send a batch of Message creation requests.
     *
     * The Message Batches API can be used to process multiple Messages API requests at once. Once a
     * Message Batch is created, it begins processing immediately. Batches can take up to 24 hours
     * to complete.
     *
     * Learn more about the Message Batches API in our
     * [user guide](/en/docs/build-with-claude/batch-processing)
     */
    fun create(
        params: BatchesBetaTrueCreateParams
    ): CompletableFuture<BatchesBetaTrueCreateResponse> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: BatchesBetaTrueCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchesBetaTrueCreateResponse>

    /**
     * List all Message Batches within a Workspace. Most recently created batches are returned
     * first.
     *
     * Learn more about the Message Batches API in our
     * [user guide](/en/docs/build-with-claude/batch-processing)
     */
    fun list(): CompletableFuture<BatchesBetaTrueListResponse> =
        list(BatchesBetaTrueListParams.none())

    /** @see [list] */
    fun list(
        params: BatchesBetaTrueListParams = BatchesBetaTrueListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchesBetaTrueListResponse>

    /** @see [list] */
    fun list(
        params: BatchesBetaTrueListParams = BatchesBetaTrueListParams.none()
    ): CompletableFuture<BatchesBetaTrueListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<BatchesBetaTrueListResponse> =
        list(BatchesBetaTrueListParams.none(), requestOptions)

    /**
     * A view of [BatchesBetaTrueServiceAsync] that provides access to raw HTTP responses for each
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
        ): BatchesBetaTrueServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/messages/batches?beta=true`, but is otherwise
         * the same as [BatchesBetaTrueServiceAsync.create].
         */
        fun create(
            params: BatchesBetaTrueCreateParams
        ): CompletableFuture<HttpResponseFor<BatchesBetaTrueCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: BatchesBetaTrueCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchesBetaTrueCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/messages/batches?beta=true`, but is otherwise
         * the same as [BatchesBetaTrueServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BatchesBetaTrueListResponse>> =
            list(BatchesBetaTrueListParams.none())

        /** @see [list] */
        fun list(
            params: BatchesBetaTrueListParams = BatchesBetaTrueListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchesBetaTrueListResponse>>

        /** @see [list] */
        fun list(
            params: BatchesBetaTrueListParams = BatchesBetaTrueListParams.none()
        ): CompletableFuture<HttpResponseFor<BatchesBetaTrueListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BatchesBetaTrueListResponse>> =
            list(BatchesBetaTrueListParams.none(), requestOptions)
    }
}
