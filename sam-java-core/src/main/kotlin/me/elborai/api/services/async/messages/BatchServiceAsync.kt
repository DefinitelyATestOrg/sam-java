// File generated from our OpenAPI spec by Stainless.

package me.elborai.api.services.async.messages

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import me.elborai.api.core.RequestOptions
import me.elborai.api.core.http.AsyncStreamResponse
import me.elborai.api.core.http.HttpResponseFor
import me.elborai.api.core.http.StreamResponse
import me.elborai.api.models.MessageBatchCancelBetaParams
import me.elborai.api.models.MessageBatchCancelBetaResponse
import me.elborai.api.models.MessageBatchCancelParams
import me.elborai.api.models.MessageBatchCancelResponse
import me.elborai.api.models.MessageBatchCreateParams
import me.elborai.api.models.MessageBatchCreateResponse
import me.elborai.api.models.MessageBatchDeleteParams
import me.elborai.api.models.MessageBatchDeleteResponse
import me.elborai.api.models.MessageBatchListParams
import me.elborai.api.models.MessageBatchListResponse
import me.elborai.api.models.MessageBatchResultsBetaParams
import me.elborai.api.models.MessageBatchResultsBetaResponse
import me.elborai.api.models.MessageBatchResultsParams
import me.elborai.api.models.MessageBatchResultsResponse
import me.elborai.api.models.MessageBatchRetrieveParams
import me.elborai.api.models.MessageBatchRetrieveResponse
import me.elborai.api.services.async.messages.batches.BetaTrueServiceAsync

interface BatchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun betaTrue(): BetaTrueServiceAsync

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
    fun create(params: MessageBatchCreateParams): CompletableFuture<MessageBatchCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: MessageBatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageBatchCreateResponse>

    /**
     * This endpoint is idempotent and can be used to poll for Message Batch completion. To access
     * the results of a Message Batch, make a request to the `results_url` field in the response.
     *
     * Learn more about the Message Batches API in our
     * [user guide](/en/docs/build-with-claude/batch-processing)
     */
    fun retrieve(
        params: MessageBatchRetrieveParams
    ): CompletableFuture<MessageBatchRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: MessageBatchRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageBatchRetrieveResponse>

    /**
     * List all Message Batches within a Workspace. Most recently created batches are returned
     * first.
     *
     * Learn more about the Message Batches API in our
     * [user guide](/en/docs/build-with-claude/batch-processing)
     */
    fun list(): CompletableFuture<MessageBatchListResponse> = list(MessageBatchListParams.none())

    /** @see [list] */
    fun list(
        params: MessageBatchListParams = MessageBatchListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageBatchListResponse>

    /** @see [list] */
    fun list(
        params: MessageBatchListParams = MessageBatchListParams.none()
    ): CompletableFuture<MessageBatchListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<MessageBatchListResponse> =
        list(MessageBatchListParams.none(), requestOptions)

    /**
     * Delete a Message Batch.
     *
     * Message Batches can only be deleted once they've finished processing. If you'd like to delete
     * an in-progress batch, you must first cancel it.
     *
     * Learn more about the Message Batches API in our
     * [user guide](/en/docs/build-with-claude/batch-processing)
     */
    fun delete(params: MessageBatchDeleteParams): CompletableFuture<MessageBatchDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: MessageBatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageBatchDeleteResponse>

    /**
     * Batches may be canceled any time before processing ends. Once cancellation is initiated, the
     * batch enters a `canceling` state, at which time the system may complete any in-progress,
     * non-interruptible requests before finalizing cancellation.
     *
     * The number of canceled requests is specified in `request_counts`. To determine which requests
     * were canceled, check the individual results within the batch. Note that cancellation may not
     * result in any canceled requests if they were non-interruptible.
     *
     * Learn more about the Message Batches API in our
     * [user guide](/en/docs/build-with-claude/batch-processing)
     */
    fun cancel(params: MessageBatchCancelParams): CompletableFuture<MessageBatchCancelResponse> =
        cancel(params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(
        params: MessageBatchCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageBatchCancelResponse>

    /**
     * Batches may be canceled any time before processing ends. Once cancellation is initiated, the
     * batch enters a `canceling` state, at which time the system may complete any in-progress,
     * non-interruptible requests before finalizing cancellation.
     *
     * The number of canceled requests is specified in `request_counts`. To determine which requests
     * were canceled, check the individual results within the batch. Note that cancellation may not
     * result in any canceled requests if they were non-interruptible.
     *
     * Learn more about the Message Batches API in our
     * [user guide](/en/docs/build-with-claude/batch-processing)
     */
    fun cancelBeta(
        params: MessageBatchCancelBetaParams
    ): CompletableFuture<MessageBatchCancelBetaResponse> = cancelBeta(params, RequestOptions.none())

    /** @see [cancelBeta] */
    fun cancelBeta(
        params: MessageBatchCancelBetaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageBatchCancelBetaResponse>

    /**
     * Streams the results of a Message Batch as a `.jsonl` file.
     *
     * Each line in the file is a JSON object containing the result of a single request in the
     * Message Batch. Results are not guaranteed to be in the same order as requests. Use the
     * `custom_id` field to match results to requests.
     *
     * Learn more about the Message Batches API in our
     * [user guide](/en/docs/build-with-claude/batch-processing)
     */
    fun resultsStreaming(
        params: MessageBatchResultsParams
    ): AsyncStreamResponse<MessageBatchResultsResponse> =
        resultsStreaming(params, RequestOptions.none())

    /** @see [resultsStreaming] */
    fun resultsStreaming(
        params: MessageBatchResultsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncStreamResponse<MessageBatchResultsResponse>

    /**
     * Streams the results of a Message Batch as a `.jsonl` file.
     *
     * Each line in the file is a JSON object containing the result of a single request in the
     * Message Batch. Results are not guaranteed to be in the same order as requests. Use the
     * `custom_id` field to match results to requests.
     *
     * Learn more about the Message Batches API in our
     * [user guide](/en/docs/build-with-claude/batch-processing)
     */
    fun resultsBetaStreaming(
        params: MessageBatchResultsBetaParams
    ): AsyncStreamResponse<MessageBatchResultsBetaResponse> =
        resultsBetaStreaming(params, RequestOptions.none())

    /** @see [resultsBetaStreaming] */
    fun resultsBetaStreaming(
        params: MessageBatchResultsBetaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncStreamResponse<MessageBatchResultsBetaResponse>

    /** A view of [BatchServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun betaTrue(): BetaTrueServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/messages/batches`, but is otherwise the same as
         * [BatchServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: MessageBatchCreateParams
        ): CompletableFuture<HttpResponseFor<MessageBatchCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: MessageBatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageBatchCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/messages/batches/{message_batch_id}`, but is
         * otherwise the same as [BatchServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: MessageBatchRetrieveParams
        ): CompletableFuture<HttpResponseFor<MessageBatchRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: MessageBatchRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageBatchRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/messages/batches`, but is otherwise the same as
         * [BatchServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<MessageBatchListResponse>> =
            list(MessageBatchListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: MessageBatchListParams = MessageBatchListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageBatchListResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: MessageBatchListParams = MessageBatchListParams.none()
        ): CompletableFuture<HttpResponseFor<MessageBatchListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MessageBatchListResponse>> =
            list(MessageBatchListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/messages/batches/{message_batch_id}`, but is
         * otherwise the same as [BatchServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: MessageBatchDeleteParams
        ): CompletableFuture<HttpResponseFor<MessageBatchDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: MessageBatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageBatchDeleteResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/messages/batches/{message_batch_id}/cancel`,
         * but is otherwise the same as [BatchServiceAsync.cancel].
         */
        @MustBeClosed
        fun cancel(
            params: MessageBatchCancelParams
        ): CompletableFuture<HttpResponseFor<MessageBatchCancelResponse>> =
            cancel(params, RequestOptions.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            params: MessageBatchCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageBatchCancelResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /v1/messages/batches/{message_batch_id}/cancel?beta=true`, but is otherwise the same as
         * [BatchServiceAsync.cancelBeta].
         */
        @MustBeClosed
        fun cancelBeta(
            params: MessageBatchCancelBetaParams
        ): CompletableFuture<HttpResponseFor<MessageBatchCancelBetaResponse>> =
            cancelBeta(params, RequestOptions.none())

        /** @see [cancelBeta] */
        @MustBeClosed
        fun cancelBeta(
            params: MessageBatchCancelBetaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageBatchCancelBetaResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/messages/batches/{message_batch_id}/results`,
         * but is otherwise the same as [BatchServiceAsync.resultsStreaming].
         */
        @MustBeClosed
        fun resultsStreaming(
            params: MessageBatchResultsParams
        ): CompletableFuture<HttpResponseFor<StreamResponse<MessageBatchResultsResponse>>> =
            resultsStreaming(params, RequestOptions.none())

        /** @see [resultsStreaming] */
        @MustBeClosed
        fun resultsStreaming(
            params: MessageBatchResultsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<MessageBatchResultsResponse>>>

        /**
         * Returns a raw HTTP response for `get
         * /v1/messages/batches/{message_batch_id}/results?beta=true`, but is otherwise the same as
         * [BatchServiceAsync.resultsBetaStreaming].
         */
        @MustBeClosed
        fun resultsBetaStreaming(
            params: MessageBatchResultsBetaParams
        ): CompletableFuture<HttpResponseFor<StreamResponse<MessageBatchResultsBetaResponse>>> =
            resultsBetaStreaming(params, RequestOptions.none())

        /** @see [resultsBetaStreaming] */
        @MustBeClosed
        fun resultsBetaStreaming(
            params: MessageBatchResultsBetaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<MessageBatchResultsBetaResponse>>>
    }
}
