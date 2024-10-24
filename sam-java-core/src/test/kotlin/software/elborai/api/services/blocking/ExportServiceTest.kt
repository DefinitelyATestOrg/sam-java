// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.services.blocking

import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import software.elborai.api.TestServerExtension
import software.elborai.api.client.okhttp.IncreaseOkHttpClient
import software.elborai.api.core.JsonValue
import software.elborai.api.models.*
import software.elborai.api.models.ExportListParams

@ExtendWith(TestServerExtension::class)
class ExportServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val exportService = client.exports()
        val export =
            exportService.create(
                ExportCreateParams.builder()
                    .category(ExportCreateParams.Category.ACCOUNT_STATEMENT_OFX)
                    .accountStatementOfx(
                        ExportCreateParams.AccountStatementOfx.builder()
                            .accountId("account_id")
                            .createdAt(
                                ExportCreateParams.AccountStatementOfx.CreatedAt.builder()
                                    .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .build()
                    )
                    .balanceCsv(
                        ExportCreateParams.BalanceCsv.builder()
                            .accountId("account_id")
                            .createdAt(
                                ExportCreateParams.BalanceCsv.CreatedAt.builder()
                                    .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .build()
                    )
                    .bookkeepingAccountBalanceCsv(
                        ExportCreateParams.BookkeepingAccountBalanceCsv.builder()
                            .bookkeepingAccountId("bookkeeping_account_id")
                            .createdAt(
                                ExportCreateParams.BookkeepingAccountBalanceCsv.CreatedAt.builder()
                                    .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .build()
                    )
                    .entityCsv(
                        ExportCreateParams.EntityCsv.builder()
                            .status(
                                ExportCreateParams.EntityCsv.Status.builder()
                                    .in_(listOf(ExportCreateParams.EntityCsv.Status.In.ACTIVE))
                                    .build()
                            )
                            .build()
                    )
                    .transactionCsv(
                        ExportCreateParams.TransactionCsv.builder()
                            .accountId("account_id")
                            .createdAt(
                                ExportCreateParams.TransactionCsv.CreatedAt.builder()
                                    .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .build()
                    )
                    .vendorCsv(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        println(export)
        export.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val exportService = client.exports()
        val export =
            exportService.retrieve(ExportRetrieveParams.builder().exportId("export_id").build())
        println(export)
        export.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val exportService = client.exports()
        val exportList = exportService.list(ExportListParams.builder().build())
        println(exportList)
        exportList.data().forEach { it.validate() }
    }
}
