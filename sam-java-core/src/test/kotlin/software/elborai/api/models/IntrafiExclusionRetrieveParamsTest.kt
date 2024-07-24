// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import software.elborai.api.models.*

class IntrafiExclusionRetrieveParamsTest {

    @Test
    fun createIntrafiExclusionRetrieveParams() {
        IntrafiExclusionRetrieveParams.builder().intrafiExclusionId("intrafi_exclusion_id").build()
    }

    @Test
    fun getPathParam() {
        val params =
            IntrafiExclusionRetrieveParams.builder()
                .intrafiExclusionId("intrafi_exclusion_id")
                .build()
        assertThat(params).isNotNull
        // path param "intrafiExclusionId"
        assertThat(params.getPathParam(0)).isEqualTo("intrafi_exclusion_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
