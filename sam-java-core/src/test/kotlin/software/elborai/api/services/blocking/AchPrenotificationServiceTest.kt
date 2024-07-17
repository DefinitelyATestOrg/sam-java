// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.services.blocking

import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import software.elborai.api.TestServerExtension
import software.elborai.api.client.okhttp.IncreaseOkHttpClient
import software.elborai.api.models.*
import software.elborai.api.models.AchPrenotificationListParams

@ExtendWith(TestServerExtension::class)
class AchPrenotificationServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achPrenotificationService = client.achPrenotifications()
        val achPrenotification =
            achPrenotificationService.create(
                AchPrenotificationCreateParams.builder()
                    .accountId("string")
                    .accountNumber("x")
                    .routingNumber("xxxxxxxxx")
                    .addendum("x")
                    .companyDescriptiveDate("x")
                    .companyDiscretionaryData("x")
                    .companyEntryDescription("x")
                    .companyName("x")
                    .creditDebitIndicator(
                        AchPrenotificationCreateParams.CreditDebitIndicator.CREDIT
                    )
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .individualId("x")
                    .individualName("x")
                    .standardEntryClassCode(
                        AchPrenotificationCreateParams.StandardEntryClassCode
                            .CORPORATE_CREDIT_OR_DEBIT
                    )
                    .build()
            )
        println(achPrenotification)
        achPrenotification.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achPrenotificationService = client.achPrenotifications()
        val achPrenotification =
            achPrenotificationService.retrieve(
                AchPrenotificationRetrieveParams.builder().achPrenotificationId("string").build()
            )
        println(achPrenotification)
        achPrenotification.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achPrenotificationService = client.achPrenotifications()
        val achPrenotificationList =
            achPrenotificationService.list(AchPrenotificationListParams.builder().build())
        println(achPrenotificationList)
        achPrenotificationList.data().forEach { it.validate() }
    }
}