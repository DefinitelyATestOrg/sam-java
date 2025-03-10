// File generated from our OpenAPI spec by Stainless.

package me.elborai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import me.elborai.api.core.RequestOptions
import me.elborai.api.core.http.HttpResponseFor
import me.elborai.api.models.MessageCountTokensBetaParams
import me.elborai.api.models.MessageCountTokensBetaResponse
import me.elborai.api.models.MessageCountTokensParams
import me.elborai.api.models.MessageCountTokensResponse
import me.elborai.api.models.MessageCreateParams
import me.elborai.api.models.MessageCreateResponse
import me.elborai.api.services.async.messages.BatchServiceAsync
import me.elborai.api.services.async.messages.BatchesBetaTrueServiceAsync

interface MessageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun batches(): BatchServiceAsync

    fun batchesBetaTrue(): BatchesBetaTrueServiceAsync

    /**
     * Send a structured list of input messages with text and/or image content, and the model will
     * generate the next message in the conversation.
     *
     * The Messages API can be used for either single queries or stateless multi-turn conversations.
     *
     * Learn more about the Messages API in our [user guide](/en/docs/initial-setup)
     */
    fun create(params: MessageCreateParams): CompletableFuture<MessageCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: MessageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageCreateResponse>

    /**
     * Count the number of tokens in a Message.
     *
     * The Token Count API can be used to count the number of tokens in a Message, including tools,
     * images, and documents, without creating it.
     *
     * Learn more about token counting in our
     * [user guide](/en/docs/build-with-claude/token-counting)
     */
    fun countTokens(
        params: MessageCountTokensParams
    ): CompletableFuture<MessageCountTokensResponse> = countTokens(params, RequestOptions.none())

    /** @see [countTokens] */
    fun countTokens(
        params: MessageCountTokensParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageCountTokensResponse>

    /**
     * Count the number of tokens in a Message.
     *
     * The Token Count API can be used to count the number of tokens in a Message, including tools,
     * images, and documents, without creating it.
     *
     * Learn more about token counting in our
     * [user guide](/en/docs/build-with-claude/token-counting)
     */
    fun countTokensBeta(
        params: MessageCountTokensBetaParams
    ): CompletableFuture<MessageCountTokensBetaResponse> =
        countTokensBeta(params, RequestOptions.none())

    /** @see [countTokensBeta] */
    fun countTokensBeta(
        params: MessageCountTokensBetaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageCountTokensBetaResponse>

    /**
     * A view of [MessageServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun batches(): BatchServiceAsync.WithRawResponse

        fun batchesBetaTrue(): BatchesBetaTrueServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/messages`, but is otherwise the same as
         * [MessageServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: MessageCreateParams
        ): CompletableFuture<HttpResponseFor<MessageCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: MessageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageCreateResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/messages/count_tokens`, but is otherwise the
         * same as [MessageServiceAsync.countTokens].
         */
        @MustBeClosed
        fun countTokens(
            params: MessageCountTokensParams
        ): CompletableFuture<HttpResponseFor<MessageCountTokensResponse>> =
            countTokens(params, RequestOptions.none())

        /** @see [countTokens] */
        @MustBeClosed
        fun countTokens(
            params: MessageCountTokensParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageCountTokensResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/messages/count_tokens?beta=true`, but is
         * otherwise the same as [MessageServiceAsync.countTokensBeta].
         */
        @MustBeClosed
        fun countTokensBeta(
            params: MessageCountTokensBetaParams
        ): CompletableFuture<HttpResponseFor<MessageCountTokensBetaResponse>> =
            countTokensBeta(params, RequestOptions.none())

        /** @see [countTokensBeta] */
        @MustBeClosed
        fun countTokensBeta(
            params: MessageCountTokensBetaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageCountTokensBetaResponse>>
    }
}
