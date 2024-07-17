// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import software.elborai.api.models.*

class SimulationDigitalWalletTokenRequestCreateParamsTest {

    @Test
    fun createSimulationDigitalWalletTokenRequestCreateParams() {
        SimulationDigitalWalletTokenRequestCreateParams.builder().cardId("string").build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationDigitalWalletTokenRequestCreateParams.builder().cardId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationDigitalWalletTokenRequestCreateParams.builder().cardId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardId()).isEqualTo("string")
    }
}
