// File generated from our OpenAPI spec by Stainless.

package me.elborai.api.services.async.messages.batches

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import me.elborai.api.core.ClientOptions
import me.elborai.api.core.RequestOptions
import me.elborai.api.core.http.HttpResponseFor
import me.elborai.api.models.messages.batches.betatrue.BetaTrueDeleteParams
import me.elborai.api.models.messages.batches.betatrue.BetaTrueDeleteResponse
import me.elborai.api.models.messages.batches.betatrue.BetaTrueRetrieveParams
import me.elborai.api.models.messages.batches.betatrue.BetaTrueRetrieveResponse

interface BetaTrueServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BetaTrueServiceAsync

    /**
     * This endpoint is idempotent and can be used to poll for Message Batch completion. To access
     * the results of a Message Batch, make a request to the `results_url` field in the response.
     *
     * Learn more about the Message Batches API in our
     * [user guide](/en/docs/build-with-claude/batch-processing)
     */
    fun retrieve(messageBatchId: String): CompletableFuture<BetaTrueRetrieveResponse> =
        retrieve(messageBatchId, BetaTrueRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        messageBatchId: String,
        params: BetaTrueRetrieveParams = BetaTrueRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BetaTrueRetrieveResponse> =
        retrieve(params.toBuilder().messageBatchId(messageBatchId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        messageBatchId: String,
        params: BetaTrueRetrieveParams = BetaTrueRetrieveParams.none(),
    ): CompletableFuture<BetaTrueRetrieveResponse> =
        retrieve(messageBatchId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BetaTrueRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BetaTrueRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: BetaTrueRetrieveParams): CompletableFuture<BetaTrueRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        messageBatchId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BetaTrueRetrieveResponse> =
        retrieve(messageBatchId, BetaTrueRetrieveParams.none(), requestOptions)

    /**
     * Delete a Message Batch.
     *
     * Message Batches can only be deleted once they've finished processing. If you'd like to delete
     * an in-progress batch, you must first cancel it.
     *
     * Learn more about the Message Batches API in our
     * [user guide](/en/docs/build-with-claude/batch-processing)
     */
    fun delete(messageBatchId: String): CompletableFuture<BetaTrueDeleteResponse> =
        delete(messageBatchId, BetaTrueDeleteParams.none())

    /** @see delete */
    fun delete(
        messageBatchId: String,
        params: BetaTrueDeleteParams = BetaTrueDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BetaTrueDeleteResponse> =
        delete(params.toBuilder().messageBatchId(messageBatchId).build(), requestOptions)

    /** @see delete */
    fun delete(
        messageBatchId: String,
        params: BetaTrueDeleteParams = BetaTrueDeleteParams.none(),
    ): CompletableFuture<BetaTrueDeleteResponse> =
        delete(messageBatchId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BetaTrueDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BetaTrueDeleteResponse>

    /** @see delete */
    fun delete(params: BetaTrueDeleteParams): CompletableFuture<BetaTrueDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        messageBatchId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BetaTrueDeleteResponse> =
        delete(messageBatchId, BetaTrueDeleteParams.none(), requestOptions)

    /**
     * A view of [BetaTrueServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BetaTrueServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/messages/batches/{message_batch_id}?beta=true`,
         * but is otherwise the same as [BetaTrueServiceAsync.retrieve].
         */
        fun retrieve(
            messageBatchId: String
        ): CompletableFuture<HttpResponseFor<BetaTrueRetrieveResponse>> =
            retrieve(messageBatchId, BetaTrueRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            messageBatchId: String,
            params: BetaTrueRetrieveParams = BetaTrueRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BetaTrueRetrieveResponse>> =
            retrieve(params.toBuilder().messageBatchId(messageBatchId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            messageBatchId: String,
            params: BetaTrueRetrieveParams = BetaTrueRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<BetaTrueRetrieveResponse>> =
            retrieve(messageBatchId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BetaTrueRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BetaTrueRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: BetaTrueRetrieveParams
        ): CompletableFuture<HttpResponseFor<BetaTrueRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            messageBatchId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BetaTrueRetrieveResponse>> =
            retrieve(messageBatchId, BetaTrueRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /v1/messages/batches/{message_batch_id}?beta=true`, but is otherwise the same as
         * [BetaTrueServiceAsync.delete].
         */
        fun delete(
            messageBatchId: String
        ): CompletableFuture<HttpResponseFor<BetaTrueDeleteResponse>> =
            delete(messageBatchId, BetaTrueDeleteParams.none())

        /** @see delete */
        fun delete(
            messageBatchId: String,
            params: BetaTrueDeleteParams = BetaTrueDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BetaTrueDeleteResponse>> =
            delete(params.toBuilder().messageBatchId(messageBatchId).build(), requestOptions)

        /** @see delete */
        fun delete(
            messageBatchId: String,
            params: BetaTrueDeleteParams = BetaTrueDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<BetaTrueDeleteResponse>> =
            delete(messageBatchId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: BetaTrueDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BetaTrueDeleteResponse>>

        /** @see delete */
        fun delete(
            params: BetaTrueDeleteParams
        ): CompletableFuture<HttpResponseFor<BetaTrueDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            messageBatchId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BetaTrueDeleteResponse>> =
            delete(messageBatchId, BetaTrueDeleteParams.none(), requestOptions)
    }
}
