// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import software.elborai.api.models.*

class SimulationProgramCreateParamsTest {

    @Test
    fun createSimulationProgramCreateParams() {
        SimulationProgramCreateParams.builder().name("x").build()
    }

    @Test
    fun getBody() {
        val params = SimulationProgramCreateParams.builder().name("x").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = SimulationProgramCreateParams.builder().name("x").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("x")
    }
}
