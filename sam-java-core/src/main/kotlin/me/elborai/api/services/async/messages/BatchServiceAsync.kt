// File generated from our OpenAPI spec by Stainless.

package me.elborai.api.services.async.messages

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import me.elborai.api.core.RequestOptions
import me.elborai.api.core.http.AsyncStreamResponse
import me.elborai.api.core.http.HttpResponseFor
import me.elborai.api.core.http.StreamResponse
import me.elborai.api.models.messages.batches.BatchCancelBetaParams
import me.elborai.api.models.messages.batches.BatchCancelBetaResponse
import me.elborai.api.models.messages.batches.BatchCancelParams
import me.elborai.api.models.messages.batches.BatchCancelResponse
import me.elborai.api.models.messages.batches.BatchCreateParams
import me.elborai.api.models.messages.batches.BatchCreateResponse
import me.elborai.api.models.messages.batches.BatchDeleteParams
import me.elborai.api.models.messages.batches.BatchDeleteResponse
import me.elborai.api.models.messages.batches.BatchListParams
import me.elborai.api.models.messages.batches.BatchListResponse
import me.elborai.api.models.messages.batches.BatchResultsBetaParams
import me.elborai.api.models.messages.batches.BatchResultsBetaResponse
import me.elborai.api.models.messages.batches.BatchResultsParams
import me.elborai.api.models.messages.batches.BatchResultsResponse
import me.elborai.api.models.messages.batches.BatchRetrieveParams
import me.elborai.api.models.messages.batches.BatchRetrieveResponse
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
    fun create(params: BatchCreateParams): CompletableFuture<BatchCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: BatchCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchCreateResponse>

    /**
     * This endpoint is idempotent and can be used to poll for Message Batch completion. To access
     * the results of a Message Batch, make a request to the `results_url` field in the response.
     *
     * Learn more about the Message Batches API in our
     * [user guide](/en/docs/build-with-claude/batch-processing)
     */
    fun retrieve(messageBatchId: String): CompletableFuture<BatchRetrieveResponse> =
        retrieve(messageBatchId, BatchRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        messageBatchId: String,
        params: BatchRetrieveParams = BatchRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchRetrieveResponse> =
        retrieve(params.toBuilder().messageBatchId(messageBatchId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        messageBatchId: String,
        params: BatchRetrieveParams = BatchRetrieveParams.none(),
    ): CompletableFuture<BatchRetrieveResponse> =
        retrieve(messageBatchId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BatchRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(params: BatchRetrieveParams): CompletableFuture<BatchRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        messageBatchId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchRetrieveResponse> =
        retrieve(messageBatchId, BatchRetrieveParams.none(), requestOptions)

    /**
     * List all Message Batches within a Workspace. Most recently created batches are returned
     * first.
     *
     * Learn more about the Message Batches API in our
     * [user guide](/en/docs/build-with-claude/batch-processing)
     */
    fun list(): CompletableFuture<BatchListResponse> = list(BatchListParams.none())

    /** @see [list] */
    fun list(
        params: BatchListParams = BatchListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchListResponse>

    /** @see [list] */
    fun list(
        params: BatchListParams = BatchListParams.none()
    ): CompletableFuture<BatchListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<BatchListResponse> =
        list(BatchListParams.none(), requestOptions)

    /**
     * Delete a Message Batch.
     *
     * Message Batches can only be deleted once they've finished processing. If you'd like to delete
     * an in-progress batch, you must first cancel it.
     *
     * Learn more about the Message Batches API in our
     * [user guide](/en/docs/build-with-claude/batch-processing)
     */
    fun delete(messageBatchId: String): CompletableFuture<BatchDeleteResponse> =
        delete(messageBatchId, BatchDeleteParams.none())

    /** @see [delete] */
    fun delete(
        messageBatchId: String,
        params: BatchDeleteParams = BatchDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchDeleteResponse> =
        delete(params.toBuilder().messageBatchId(messageBatchId).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        messageBatchId: String,
        params: BatchDeleteParams = BatchDeleteParams.none(),
    ): CompletableFuture<BatchDeleteResponse> =
        delete(messageBatchId, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: BatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchDeleteResponse>

    /** @see [delete] */
    fun delete(params: BatchDeleteParams): CompletableFuture<BatchDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        messageBatchId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchDeleteResponse> =
        delete(messageBatchId, BatchDeleteParams.none(), requestOptions)

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
    fun cancel(messageBatchId: String): CompletableFuture<BatchCancelResponse> =
        cancel(messageBatchId, BatchCancelParams.none())

    /** @see [cancel] */
    fun cancel(
        messageBatchId: String,
        params: BatchCancelParams = BatchCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchCancelResponse> =
        cancel(params.toBuilder().messageBatchId(messageBatchId).build(), requestOptions)

    /** @see [cancel] */
    fun cancel(
        messageBatchId: String,
        params: BatchCancelParams = BatchCancelParams.none(),
    ): CompletableFuture<BatchCancelResponse> =
        cancel(messageBatchId, params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(
        params: BatchCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchCancelResponse>

    /** @see [cancel] */
    fun cancel(params: BatchCancelParams): CompletableFuture<BatchCancelResponse> =
        cancel(params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(
        messageBatchId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchCancelResponse> =
        cancel(messageBatchId, BatchCancelParams.none(), requestOptions)

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
    fun cancelBeta(messageBatchId: String): CompletableFuture<BatchCancelBetaResponse> =
        cancelBeta(messageBatchId, BatchCancelBetaParams.none())

    /** @see [cancelBeta] */
    fun cancelBeta(
        messageBatchId: String,
        params: BatchCancelBetaParams = BatchCancelBetaParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchCancelBetaResponse> =
        cancelBeta(params.toBuilder().messageBatchId(messageBatchId).build(), requestOptions)

    /** @see [cancelBeta] */
    fun cancelBeta(
        messageBatchId: String,
        params: BatchCancelBetaParams = BatchCancelBetaParams.none(),
    ): CompletableFuture<BatchCancelBetaResponse> =
        cancelBeta(messageBatchId, params, RequestOptions.none())

    /** @see [cancelBeta] */
    fun cancelBeta(
        params: BatchCancelBetaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchCancelBetaResponse>

    /** @see [cancelBeta] */
    fun cancelBeta(params: BatchCancelBetaParams): CompletableFuture<BatchCancelBetaResponse> =
        cancelBeta(params, RequestOptions.none())

    /** @see [cancelBeta] */
    fun cancelBeta(
        messageBatchId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchCancelBetaResponse> =
        cancelBeta(messageBatchId, BatchCancelBetaParams.none(), requestOptions)

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
    fun resultsStreaming(messageBatchId: String): AsyncStreamResponse<BatchResultsResponse> =
        resultsStreaming(messageBatchId, BatchResultsParams.none())

    /** @see [resultsStreaming] */
    fun resultsStreaming(
        messageBatchId: String,
        params: BatchResultsParams = BatchResultsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncStreamResponse<BatchResultsResponse> =
        resultsStreaming(params.toBuilder().messageBatchId(messageBatchId).build(), requestOptions)

    /** @see [resultsStreaming] */
    fun resultsStreaming(
        messageBatchId: String,
        params: BatchResultsParams = BatchResultsParams.none(),
    ): AsyncStreamResponse<BatchResultsResponse> =
        resultsStreaming(messageBatchId, params, RequestOptions.none())

    /** @see [resultsStreaming] */
    fun resultsStreaming(
        params: BatchResultsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncStreamResponse<BatchResultsResponse>

    /** @see [resultsStreaming] */
    fun resultsStreaming(params: BatchResultsParams): AsyncStreamResponse<BatchResultsResponse> =
        resultsStreaming(params, RequestOptions.none())

    /** @see [resultsStreaming] */
    fun resultsStreaming(
        messageBatchId: String,
        requestOptions: RequestOptions,
    ): AsyncStreamResponse<BatchResultsResponse> =
        resultsStreaming(messageBatchId, BatchResultsParams.none(), requestOptions)

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
        messageBatchId: String
    ): AsyncStreamResponse<BatchResultsBetaResponse> =
        resultsBetaStreaming(messageBatchId, BatchResultsBetaParams.none())

    /** @see [resultsBetaStreaming] */
    fun resultsBetaStreaming(
        messageBatchId: String,
        params: BatchResultsBetaParams = BatchResultsBetaParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncStreamResponse<BatchResultsBetaResponse> =
        resultsBetaStreaming(
            params.toBuilder().messageBatchId(messageBatchId).build(),
            requestOptions,
        )

    /** @see [resultsBetaStreaming] */
    fun resultsBetaStreaming(
        messageBatchId: String,
        params: BatchResultsBetaParams = BatchResultsBetaParams.none(),
    ): AsyncStreamResponse<BatchResultsBetaResponse> =
        resultsBetaStreaming(messageBatchId, params, RequestOptions.none())

    /** @see [resultsBetaStreaming] */
    fun resultsBetaStreaming(
        params: BatchResultsBetaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncStreamResponse<BatchResultsBetaResponse>

    /** @see [resultsBetaStreaming] */
    fun resultsBetaStreaming(
        params: BatchResultsBetaParams
    ): AsyncStreamResponse<BatchResultsBetaResponse> =
        resultsBetaStreaming(params, RequestOptions.none())

    /** @see [resultsBetaStreaming] */
    fun resultsBetaStreaming(
        messageBatchId: String,
        requestOptions: RequestOptions,
    ): AsyncStreamResponse<BatchResultsBetaResponse> =
        resultsBetaStreaming(messageBatchId, BatchResultsBetaParams.none(), requestOptions)

    /** A view of [BatchServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun betaTrue(): BetaTrueServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/messages/batches`, but is otherwise the same as
         * [BatchServiceAsync.create].
         */
        fun create(
            params: BatchCreateParams
        ): CompletableFuture<HttpResponseFor<BatchCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: BatchCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/messages/batches/{message_batch_id}`, but is
         * otherwise the same as [BatchServiceAsync.retrieve].
         */
        fun retrieve(
            messageBatchId: String
        ): CompletableFuture<HttpResponseFor<BatchRetrieveResponse>> =
            retrieve(messageBatchId, BatchRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            messageBatchId: String,
            params: BatchRetrieveParams = BatchRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchRetrieveResponse>> =
            retrieve(params.toBuilder().messageBatchId(messageBatchId).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            messageBatchId: String,
            params: BatchRetrieveParams = BatchRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<BatchRetrieveResponse>> =
            retrieve(messageBatchId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: BatchRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchRetrieveResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: BatchRetrieveParams
        ): CompletableFuture<HttpResponseFor<BatchRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            messageBatchId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchRetrieveResponse>> =
            retrieve(messageBatchId, BatchRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/messages/batches`, but is otherwise the same as
         * [BatchServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BatchListResponse>> =
            list(BatchListParams.none())

        /** @see [list] */
        fun list(
            params: BatchListParams = BatchListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchListResponse>>

        /** @see [list] */
        fun list(
            params: BatchListParams = BatchListParams.none()
        ): CompletableFuture<HttpResponseFor<BatchListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BatchListResponse>> =
            list(BatchListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/messages/batches/{message_batch_id}`, but is
         * otherwise the same as [BatchServiceAsync.delete].
         */
        fun delete(
            messageBatchId: String
        ): CompletableFuture<HttpResponseFor<BatchDeleteResponse>> =
            delete(messageBatchId, BatchDeleteParams.none())

        /** @see [delete] */
        fun delete(
            messageBatchId: String,
            params: BatchDeleteParams = BatchDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchDeleteResponse>> =
            delete(params.toBuilder().messageBatchId(messageBatchId).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            messageBatchId: String,
            params: BatchDeleteParams = BatchDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<BatchDeleteResponse>> =
            delete(messageBatchId, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: BatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchDeleteResponse>>

        /** @see [delete] */
        fun delete(
            params: BatchDeleteParams
        ): CompletableFuture<HttpResponseFor<BatchDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            messageBatchId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchDeleteResponse>> =
            delete(messageBatchId, BatchDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/messages/batches/{message_batch_id}/cancel`,
         * but is otherwise the same as [BatchServiceAsync.cancel].
         */
        fun cancel(
            messageBatchId: String
        ): CompletableFuture<HttpResponseFor<BatchCancelResponse>> =
            cancel(messageBatchId, BatchCancelParams.none())

        /** @see [cancel] */
        fun cancel(
            messageBatchId: String,
            params: BatchCancelParams = BatchCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchCancelResponse>> =
            cancel(params.toBuilder().messageBatchId(messageBatchId).build(), requestOptions)

        /** @see [cancel] */
        fun cancel(
            messageBatchId: String,
            params: BatchCancelParams = BatchCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<BatchCancelResponse>> =
            cancel(messageBatchId, params, RequestOptions.none())

        /** @see [cancel] */
        fun cancel(
            params: BatchCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchCancelResponse>>

        /** @see [cancel] */
        fun cancel(
            params: BatchCancelParams
        ): CompletableFuture<HttpResponseFor<BatchCancelResponse>> =
            cancel(params, RequestOptions.none())

        /** @see [cancel] */
        fun cancel(
            messageBatchId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchCancelResponse>> =
            cancel(messageBatchId, BatchCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/messages/batches/{message_batch_id}/cancel?beta=true`, but is otherwise the same as
         * [BatchServiceAsync.cancelBeta].
         */
        fun cancelBeta(
            messageBatchId: String
        ): CompletableFuture<HttpResponseFor<BatchCancelBetaResponse>> =
            cancelBeta(messageBatchId, BatchCancelBetaParams.none())

        /** @see [cancelBeta] */
        fun cancelBeta(
            messageBatchId: String,
            params: BatchCancelBetaParams = BatchCancelBetaParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchCancelBetaResponse>> =
            cancelBeta(params.toBuilder().messageBatchId(messageBatchId).build(), requestOptions)

        /** @see [cancelBeta] */
        fun cancelBeta(
            messageBatchId: String,
            params: BatchCancelBetaParams = BatchCancelBetaParams.none(),
        ): CompletableFuture<HttpResponseFor<BatchCancelBetaResponse>> =
            cancelBeta(messageBatchId, params, RequestOptions.none())

        /** @see [cancelBeta] */
        fun cancelBeta(
            params: BatchCancelBetaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchCancelBetaResponse>>

        /** @see [cancelBeta] */
        fun cancelBeta(
            params: BatchCancelBetaParams
        ): CompletableFuture<HttpResponseFor<BatchCancelBetaResponse>> =
            cancelBeta(params, RequestOptions.none())

        /** @see [cancelBeta] */
        fun cancelBeta(
            messageBatchId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchCancelBetaResponse>> =
            cancelBeta(messageBatchId, BatchCancelBetaParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/messages/batches/{message_batch_id}/results`,
         * but is otherwise the same as [BatchServiceAsync.resultsStreaming].
         */
        @MustBeClosed
        fun resultsStreaming(
            messageBatchId: String
        ): CompletableFuture<HttpResponseFor<StreamResponse<BatchResultsResponse>>> =
            resultsStreaming(messageBatchId, BatchResultsParams.none())

        /** @see [resultsStreaming] */
        @MustBeClosed
        fun resultsStreaming(
            messageBatchId: String,
            params: BatchResultsParams = BatchResultsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<BatchResultsResponse>>> =
            resultsStreaming(
                params.toBuilder().messageBatchId(messageBatchId).build(),
                requestOptions,
            )

        /** @see [resultsStreaming] */
        @MustBeClosed
        fun resultsStreaming(
            messageBatchId: String,
            params: BatchResultsParams = BatchResultsParams.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<BatchResultsResponse>>> =
            resultsStreaming(messageBatchId, params, RequestOptions.none())

        /** @see [resultsStreaming] */
        @MustBeClosed
        fun resultsStreaming(
            params: BatchResultsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<BatchResultsResponse>>>

        /** @see [resultsStreaming] */
        @MustBeClosed
        fun resultsStreaming(
            params: BatchResultsParams
        ): CompletableFuture<HttpResponseFor<StreamResponse<BatchResultsResponse>>> =
            resultsStreaming(params, RequestOptions.none())

        /** @see [resultsStreaming] */
        @MustBeClosed
        fun resultsStreaming(
            messageBatchId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StreamResponse<BatchResultsResponse>>> =
            resultsStreaming(messageBatchId, BatchResultsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v1/messages/batches/{message_batch_id}/results?beta=true`, but is otherwise the same as
         * [BatchServiceAsync.resultsBetaStreaming].
         */
        @MustBeClosed
        fun resultsBetaStreaming(
            messageBatchId: String
        ): CompletableFuture<HttpResponseFor<StreamResponse<BatchResultsBetaResponse>>> =
            resultsBetaStreaming(messageBatchId, BatchResultsBetaParams.none())

        /** @see [resultsBetaStreaming] */
        @MustBeClosed
        fun resultsBetaStreaming(
            messageBatchId: String,
            params: BatchResultsBetaParams = BatchResultsBetaParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<BatchResultsBetaResponse>>> =
            resultsBetaStreaming(
                params.toBuilder().messageBatchId(messageBatchId).build(),
                requestOptions,
            )

        /** @see [resultsBetaStreaming] */
        @MustBeClosed
        fun resultsBetaStreaming(
            messageBatchId: String,
            params: BatchResultsBetaParams = BatchResultsBetaParams.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<BatchResultsBetaResponse>>> =
            resultsBetaStreaming(messageBatchId, params, RequestOptions.none())

        /** @see [resultsBetaStreaming] */
        @MustBeClosed
        fun resultsBetaStreaming(
            params: BatchResultsBetaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<BatchResultsBetaResponse>>>

        /** @see [resultsBetaStreaming] */
        @MustBeClosed
        fun resultsBetaStreaming(
            params: BatchResultsBetaParams
        ): CompletableFuture<HttpResponseFor<StreamResponse<BatchResultsBetaResponse>>> =
            resultsBetaStreaming(params, RequestOptions.none())

        /** @see [resultsBetaStreaming] */
        @MustBeClosed
        fun resultsBetaStreaming(
            messageBatchId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StreamResponse<BatchResultsBetaResponse>>> =
            resultsBetaStreaming(messageBatchId, BatchResultsBetaParams.none(), requestOptions)
    }
}
