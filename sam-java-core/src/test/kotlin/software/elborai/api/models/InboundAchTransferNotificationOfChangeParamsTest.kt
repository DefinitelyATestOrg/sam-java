// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import software.elborai.api.models.*

class InboundAchTransferNotificationOfChangeParamsTest {

    @Test
    fun createInboundAchTransferNotificationOfChangeParams() {
        InboundAchTransferNotificationOfChangeParams.builder()
            .inboundAchTransferId("inbound_ach_transfer_id")
            .updatedAccountNumber("x")
            .updatedRoutingNumber("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InboundAchTransferNotificationOfChangeParams.builder()
                .inboundAchTransferId("inbound_ach_transfer_id")
                .updatedAccountNumber("x")
                .updatedRoutingNumber("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.updatedAccountNumber()).isEqualTo("x")
        assertThat(body.updatedRoutingNumber()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InboundAchTransferNotificationOfChangeParams.builder()
                .inboundAchTransferId("inbound_ach_transfer_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            InboundAchTransferNotificationOfChangeParams.builder()
                .inboundAchTransferId("inbound_ach_transfer_id")
                .build()
        assertThat(params).isNotNull
        // path param "inboundAchTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("inbound_ach_transfer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
