// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import software.elborai.api.models.*

class InboundAchTransferTransferReturnParamsTest {

    @Test
    fun createInboundAchTransferTransferReturnParams() {
        InboundAchTransferTransferReturnParams.builder()
            .inboundAchTransferId("inbound_ach_transfer_id")
            .reason(InboundAchTransferTransferReturnParams.Reason.INSUFFICIENT_FUNDS)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InboundAchTransferTransferReturnParams.builder()
                .inboundAchTransferId("inbound_ach_transfer_id")
                .reason(InboundAchTransferTransferReturnParams.Reason.INSUFFICIENT_FUNDS)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.reason())
            .isEqualTo(InboundAchTransferTransferReturnParams.Reason.INSUFFICIENT_FUNDS)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InboundAchTransferTransferReturnParams.builder()
                .inboundAchTransferId("inbound_ach_transfer_id")
                .reason(InboundAchTransferTransferReturnParams.Reason.INSUFFICIENT_FUNDS)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.reason())
            .isEqualTo(InboundAchTransferTransferReturnParams.Reason.INSUFFICIENT_FUNDS)
    }

    @Test
    fun getPathParam() {
        val params =
            InboundAchTransferTransferReturnParams.builder()
                .inboundAchTransferId("inbound_ach_transfer_id")
                .reason(InboundAchTransferTransferReturnParams.Reason.INSUFFICIENT_FUNDS)
                .build()
        assertThat(params).isNotNull
        // path param "inboundAchTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("inbound_ach_transfer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}