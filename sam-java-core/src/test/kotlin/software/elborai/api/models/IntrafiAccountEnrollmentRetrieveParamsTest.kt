// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import software.elborai.api.models.*

class IntrafiAccountEnrollmentRetrieveParamsTest {

    @Test
    fun createIntrafiAccountEnrollmentRetrieveParams() {
        IntrafiAccountEnrollmentRetrieveParams.builder()
            .intrafiAccountEnrollmentId("intrafi_account_enrollment_id")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            IntrafiAccountEnrollmentRetrieveParams.builder()
                .intrafiAccountEnrollmentId("intrafi_account_enrollment_id")
                .build()
        assertThat(params).isNotNull
        // path param "intrafiAccountEnrollmentId"
        assertThat(params.getPathParam(0)).isEqualTo("intrafi_account_enrollment_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
