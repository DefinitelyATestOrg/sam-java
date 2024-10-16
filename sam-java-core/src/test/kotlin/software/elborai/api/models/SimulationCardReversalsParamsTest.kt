// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import software.elborai.api.models.*

class SimulationCardReversalsParamsTest {

    @Test
    fun createSimulationCardReversalsParams() {
        SimulationCardReversalsParams.builder()
            .cardPaymentId("card_payment_id")
            .amount(123L)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationCardReversalsParams.builder()
                .cardPaymentId("card_payment_id")
                .amount(123L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardPaymentId()).isEqualTo("card_payment_id")
        assertThat(body.amount()).isEqualTo(123L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationCardReversalsParams.builder().cardPaymentId("card_payment_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardPaymentId()).isEqualTo("card_payment_id")
    }
}
