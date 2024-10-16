// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.services.blocking.simulations

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import software.elborai.api.TestServerExtension
import software.elborai.api.client.okhttp.IncreaseOkHttpClient
import software.elborai.api.models.*

@ExtendWith(TestServerExtension::class)
class CardServiceTest {

    @Test
    fun callAuthorize() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardService = client.simulations().cards()
        val cardAuthorizationSimulation =
            cardService.authorize(
                SimulationCardAuthorizeParams.builder()
                    .amount(123L)
                    .cardId("card_id")
                    .digitalWalletTokenId("digital_wallet_token_id")
                    .eventSubscriptionId("event_subscription_id")
                    .merchantAcceptorId("x")
                    .merchantCategoryCode("x")
                    .merchantCity("x")
                    .merchantCountry("x")
                    .merchantDescriptor("x")
                    .physicalCardId("physical_card_id")
                    .build()
            )
        println(cardAuthorizationSimulation)
        cardAuthorizationSimulation.validate()
    }

    @Test
    fun callSettlement() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardService = client.simulations().cards()
        val transaction =
            cardService.settlement(
                SimulationCardSettlementParams.builder()
                    .cardId("card_id")
                    .pendingTransactionId("pending_transaction_id")
                    .amount(123L)
                    .build()
            )
        println(transaction)
        transaction.validate()
    }
}
