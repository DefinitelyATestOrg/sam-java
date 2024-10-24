// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import software.elborai.api.models.*

class AchPrenotificationRetrieveParamsTest {

    @Test
    fun createAchPrenotificationRetrieveParams() {
        AchPrenotificationRetrieveParams.builder()
            .achPrenotificationId("ach_prenotification_id")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            AchPrenotificationRetrieveParams.builder()
                .achPrenotificationId("ach_prenotification_id")
                .build()
        assertThat(params).isNotNull
        // path param "achPrenotificationId"
        assertThat(params.getPathParam(0)).isEqualTo("ach_prenotification_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
