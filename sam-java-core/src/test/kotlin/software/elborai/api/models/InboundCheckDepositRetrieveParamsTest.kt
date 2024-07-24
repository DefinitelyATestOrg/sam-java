// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import software.elborai.api.models.*

class InboundCheckDepositRetrieveParamsTest {

    @Test
    fun createInboundCheckDepositRetrieveParams() {
        InboundCheckDepositRetrieveParams.builder()
            .inboundCheckDepositId("inbound_check_deposit_id")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            InboundCheckDepositRetrieveParams.builder()
                .inboundCheckDepositId("inbound_check_deposit_id")
                .build()
        assertThat(params).isNotNull
        // path param "inboundCheckDepositId"
        assertThat(params.getPathParam(0)).isEqualTo("inbound_check_deposit_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
