// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import software.elborai.api.TestServerExtension
import software.elborai.api.client.okhttp.IncreaseOkHttpClient
import software.elborai.api.models.*
import software.elborai.api.models.CardPaymentListParams

@ExtendWith(TestServerExtension::class)
class CardPaymentServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPaymentService = client.cardPayments()
        val cardPayment =
            cardPaymentService.retrieve(
                CardPaymentRetrieveParams.builder().cardPaymentId("card_payment_id").build()
            )
        println(cardPayment)
        cardPayment.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPaymentService = client.cardPayments()
        val cardPaymentList = cardPaymentService.list(CardPaymentListParams.builder().build())
        println(cardPaymentList)
        cardPaymentList.data().forEach { it.validate() }
    }
}
