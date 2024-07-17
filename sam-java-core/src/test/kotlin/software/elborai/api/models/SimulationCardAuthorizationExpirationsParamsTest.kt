// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import software.elborai.api.models.*

class SimulationCardAuthorizationExpirationsParamsTest {

    @Test
    fun createSimulationCardAuthorizationExpirationsParams() {
        SimulationCardAuthorizationExpirationsParams.builder().cardPaymentId("string").build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationCardAuthorizationExpirationsParams.builder().cardPaymentId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardPaymentId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationCardAuthorizationExpirationsParams.builder().cardPaymentId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardPaymentId()).isEqualTo("string")
    }
}
