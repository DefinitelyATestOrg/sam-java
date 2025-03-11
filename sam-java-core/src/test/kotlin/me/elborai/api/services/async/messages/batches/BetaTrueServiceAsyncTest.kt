// File generated from our OpenAPI spec by Stainless.

package me.elborai.api.services.async.messages.batches

import me.elborai.api.TestServerExtension
import me.elborai.api.client.okhttp.SamOkHttpClientAsync
import me.elborai.api.models.messages.batches.betatrue.BetaTrueDeleteParams
import me.elborai.api.models.messages.batches.betatrue.BetaTrueRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BetaTrueServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            SamOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val betaTrueServiceAsync = client.messages().batches().betaTrue()

        val betaTrueFuture =
            betaTrueServiceAsync.retrieve(
                BetaTrueRetrieveParams.builder()
                    .messageBatchId("message_batch_id")
                    .addAnthropicBeta("string")
                    .anthropicVersion("anthropic-version")
                    .xApiKey("x-api-key")
                    .build()
            )

        val betaTrue = betaTrueFuture.get()
        betaTrue.validate()
    }

    @Test
    fun delete() {
        val client =
            SamOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val betaTrueServiceAsync = client.messages().batches().betaTrue()

        val betaTrueFuture =
            betaTrueServiceAsync.delete(
                BetaTrueDeleteParams.builder()
                    .messageBatchId("message_batch_id")
                    .addAnthropicBeta("string")
                    .anthropicVersion("anthropic-version")
                    .xApiKey("x-api-key")
                    .build()
            )

        val betaTrue = betaTrueFuture.get()
        betaTrue.validate()
    }
}
