// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import software.elborai.api.models.*

class SimulationAchTransferCreateInboundParamsTest {

    @Test
    fun createSimulationAchTransferCreateInboundParams() {
        SimulationAchTransferCreateInboundParams.builder()
            .accountNumberId("account_number_id")
            .amount(123L)
            .companyDescriptiveDate("x")
            .companyDiscretionaryData("x")
            .companyEntryDescription("x")
            .companyId("x")
            .companyName("x")
            .receiverIdNumber("x")
            .receiverName("x")
            .resolveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationAchTransferCreateInboundParams.builder()
                .accountNumberId("account_number_id")
                .amount(123L)
                .companyDescriptiveDate("x")
                .companyDiscretionaryData("x")
                .companyEntryDescription("x")
                .companyId("x")
                .companyName("x")
                .receiverIdNumber("x")
                .receiverName("x")
                .resolveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountNumberId()).isEqualTo("account_number_id")
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.companyDescriptiveDate()).isEqualTo("x")
        assertThat(body.companyDiscretionaryData()).isEqualTo("x")
        assertThat(body.companyEntryDescription()).isEqualTo("x")
        assertThat(body.companyId()).isEqualTo("x")
        assertThat(body.companyName()).isEqualTo("x")
        assertThat(body.receiverIdNumber()).isEqualTo("x")
        assertThat(body.receiverName()).isEqualTo("x")
        assertThat(body.resolveAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationAchTransferCreateInboundParams.builder()
                .accountNumberId("account_number_id")
                .amount(123L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountNumberId()).isEqualTo("account_number_id")
        assertThat(body.amount()).isEqualTo(123L)
    }
}
