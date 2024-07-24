// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import software.elborai.api.models.*

class DigitalCardProfileArchiveParamsTest {

    @Test
    fun createDigitalCardProfileArchiveParams() {
        DigitalCardProfileArchiveParams.builder()
            .digitalCardProfileId("digital_card_profile_id")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            DigitalCardProfileArchiveParams.builder()
                .digitalCardProfileId("digital_card_profile_id")
                .build()
        assertThat(params).isNotNull
        // path param "digitalCardProfileId"
        assertThat(params.getPathParam(0)).isEqualTo("digital_card_profile_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
