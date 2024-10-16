// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import software.elborai.api.TestServerExtension
import software.elborai.api.client.okhttp.IncreaseOkHttpClient
import software.elborai.api.models.*
import software.elborai.api.models.CardListParams

@ExtendWith(TestServerExtension::class)
class CardServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardService = client.cards()
        val card =
            cardService.create(
                CardCreateParams.builder()
                    .accountId("account_id")
                    .billingAddress(
                        CardCreateParams.BillingAddress.builder()
                            .city("x")
                            .line1("x")
                            .postalCode("x")
                            .state("x")
                            .line2("x")
                            .build()
                    )
                    .description("x")
                    .digitalWallet(
                        CardCreateParams.DigitalWallet.builder()
                            .digitalCardProfileId("digital_card_profile_id")
                            .email("x")
                            .phone("x")
                            .build()
                    )
                    .entityId("entity_id")
                    .build()
            )
        println(card)
        card.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardService = client.cards()
        val card = cardService.retrieve(CardRetrieveParams.builder().cardId("card_id").build())
        println(card)
        card.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardService = client.cards()
        val card =
            cardService.update(
                CardUpdateParams.builder()
                    .cardId("card_id")
                    .billingAddress(
                        CardUpdateParams.BillingAddress.builder()
                            .city("x")
                            .line1("x")
                            .postalCode("x")
                            .state("x")
                            .line2("x")
                            .build()
                    )
                    .description("x")
                    .digitalWallet(
                        CardUpdateParams.DigitalWallet.builder()
                            .digitalCardProfileId("digital_card_profile_id")
                            .email("x")
                            .phone("x")
                            .build()
                    )
                    .entityId("entity_id")
                    .status(CardUpdateParams.Status.ACTIVE)
                    .build()
            )
        println(card)
        card.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardService = client.cards()
        val cardList = cardService.list(CardListParams.builder().build())
        println(cardList)
        cardList.data().forEach { it.validate() }
    }

    @Test
    fun callRetrieveSensitiveDetails() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardService = client.cards()
        val cardDetails =
            cardService.retrieveSensitiveDetails(
                CardRetrieveSensitiveDetailsParams.builder().cardId("card_id").build()
            )
        println(cardDetails)
        cardDetails.validate()
    }
}
