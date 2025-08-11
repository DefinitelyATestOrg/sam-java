// File generated from our OpenAPI spec by Stainless.

package me.elborai.api.services.async.messages

import me.elborai.api.TestServerExtension
import me.elborai.api.client.okhttp.SamOkHttpClientAsync
import me.elborai.api.core.JsonValue
import me.elborai.api.models.messages.batches.BatchCancelBetaParams
import me.elborai.api.models.messages.batches.BatchCancelParams
import me.elborai.api.models.messages.batches.BatchCreateParams
import me.elborai.api.models.messages.batches.BatchDeleteParams
import me.elborai.api.models.messages.batches.BatchListParams
import me.elborai.api.models.messages.batches.BatchResultsBetaParams
import me.elborai.api.models.messages.batches.BatchResultsParams
import me.elborai.api.models.messages.batches.BatchRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BatchServiceAsyncTest {

    @Test
    fun create() {
        val client =
            SamOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchServiceAsync = client.messages().batches()

        val batchFuture =
            batchServiceAsync.create(
                BatchCreateParams.builder()
                    .addAnthropicBeta("string")
                    .anthropicVersion("anthropic-version")
                    .xApiKey("x-api-key")
                    .addRequest(
                        BatchCreateParams.Request.builder()
                            .customId("my-custom-id-1")
                            .params(
                                BatchCreateParams.Request.Params.builder()
                                    .maxTokens(1024L)
                                    .addMessage(
                                        BatchCreateParams.Request.Params.Message.builder()
                                            .content("Hello, world")
                                            .role(
                                                BatchCreateParams.Request.Params.Message.Role.USER
                                            )
                                            .build()
                                    )
                                    .model("claude-3-7-sonnet-20250219")
                                    .metadata(
                                        BatchCreateParams.Request.Params.Metadata.builder()
                                            .userId("13803d75-b4b5-4c3e-b2a2-6f21399b021b")
                                            .build()
                                    )
                                    .addStopSequence("string")
                                    .stream(true)
                                    .systemOfRequestTextBlocks(
                                        listOf(
                                            BatchCreateParams.Request.Params.System.RequestTextBlock
                                                .builder()
                                                .text("Today's date is 2024-06-01.")
                                                .cacheControl(
                                                    BatchCreateParams.Request.Params.System
                                                        .RequestTextBlock
                                                        .CacheControl
                                                        .builder()
                                                        .build()
                                                )
                                                .addCitation(
                                                    BatchCreateParams.Request.Params.System
                                                        .RequestTextBlock
                                                        .Citation
                                                        .CharLocation
                                                        .builder()
                                                        .citedText("cited_text")
                                                        .documentIndex(0L)
                                                        .documentTitle("x")
                                                        .endCharIndex(0L)
                                                        .startCharIndex(0L)
                                                        .build()
                                                )
                                                .build()
                                        )
                                    )
                                    .temperature(1.0)
                                    .enabledThinking(1024L)
                                    .toolChoice(
                                        BatchCreateParams.Request.Params.ToolChoice.Auto.builder()
                                            .disableParallelToolUse(true)
                                            .build()
                                    )
                                    .addTool(
                                        BatchCreateParams.Request.Params.Tool.InnerTool.builder()
                                            .inputSchema(
                                                BatchCreateParams.Request.Params.Tool.InnerTool
                                                    .InputSchema
                                                    .builder()
                                                    .properties(
                                                        JsonValue.from(
                                                            mapOf(
                                                                "location" to
                                                                    mapOf(
                                                                        "description" to
                                                                            "The city and state, e.g. San Francisco, CA",
                                                                        "type" to "string",
                                                                    ),
                                                                "unit" to
                                                                    mapOf(
                                                                        "description" to
                                                                            "Unit for the output - one of (celsius, fahrenheit)",
                                                                        "type" to "string",
                                                                    ),
                                                            )
                                                        )
                                                    )
                                                    .build()
                                            )
                                            .name("name")
                                            .cacheControl(
                                                BatchCreateParams.Request.Params.Tool.InnerTool
                                                    .CacheControl
                                                    .builder()
                                                    .build()
                                            )
                                            .description(
                                                "Get the current weather in a given location"
                                            )
                                            .build()
                                    )
                                    .topK(5L)
                                    .topP(0.7)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val batch = batchFuture.get()
        batch.validate()
    }

    @Test
    fun retrieve() {
        val client =
            SamOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchServiceAsync = client.messages().batches()

        val batchFuture =
            batchServiceAsync.retrieve(
                BatchRetrieveParams.builder()
                    .messageBatchId("message_batch_id")
                    .addAnthropicBeta("string")
                    .anthropicVersion("anthropic-version")
                    .xApiKey("x-api-key")
                    .build()
            )

        val batch = batchFuture.get()
        batch.validate()
    }

    @Test
    fun list() {
        val client =
            SamOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchServiceAsync = client.messages().batches()

        val batchesFuture =
            batchServiceAsync.list(
                BatchListParams.builder()
                    .afterId("after_id")
                    .beforeId("before_id")
                    .limit(1L)
                    .addAnthropicBeta("string")
                    .anthropicVersion("anthropic-version")
                    .xApiKey("x-api-key")
                    .build()
            )

        val batches = batchesFuture.get()
        batches.validate()
    }

    @Test
    fun delete() {
        val client =
            SamOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchServiceAsync = client.messages().batches()

        val batchFuture =
            batchServiceAsync.delete(
                BatchDeleteParams.builder()
                    .messageBatchId("message_batch_id")
                    .addAnthropicBeta("string")
                    .anthropicVersion("anthropic-version")
                    .xApiKey("x-api-key")
                    .build()
            )

        val batch = batchFuture.get()
        batch.validate()
    }

    @Test
    fun cancel() {
        val client =
            SamOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchServiceAsync = client.messages().batches()

        val responseFuture =
            batchServiceAsync.cancel(
                BatchCancelParams.builder()
                    .messageBatchId("message_batch_id")
                    .addAnthropicBeta("string")
                    .anthropicVersion("anthropic-version")
                    .xApiKey("x-api-key")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun cancelBeta() {
        val client =
            SamOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchServiceAsync = client.messages().batches()

        val responseFuture =
            batchServiceAsync.cancelBeta(
                BatchCancelBetaParams.builder()
                    .messageBatchId("message_batch_id")
                    .addAnthropicBeta("string")
                    .anthropicVersion("anthropic-version")
                    .xApiKey("x-api-key")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism doesn't support application/x-jsonl responses")
    @Test
    fun resultsStreaming() {
        val client =
            SamOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchServiceAsync = client.messages().batches()

        val responseStreamResponse =
            batchServiceAsync.resultsStreaming(
                BatchResultsParams.builder()
                    .messageBatchId("message_batch_id")
                    .addAnthropicBeta("string")
                    .anthropicVersion("anthropic-version")
                    .xApiKey("x-api-key")
                    .build()
            )

        val onCompleteFuture =
            responseStreamResponse.subscribe { response -> response.validate() }.onCompleteFuture()
        onCompleteFuture.get()
    }

    @Disabled("Prism doesn't support application/x-jsonl responses")
    @Test
    fun resultsBetaStreaming() {
        val client =
            SamOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val batchServiceAsync = client.messages().batches()

        val responseStreamResponse =
            batchServiceAsync.resultsBetaStreaming(
                BatchResultsBetaParams.builder()
                    .messageBatchId("message_batch_id")
                    .addAnthropicBeta("string")
                    .anthropicVersion("anthropic-version")
                    .xApiKey("x-api-key")
                    .build()
            )

        val onCompleteFuture =
            responseStreamResponse.subscribe { response -> response.validate() }.onCompleteFuture()
        onCompleteFuture.get()
    }
}
