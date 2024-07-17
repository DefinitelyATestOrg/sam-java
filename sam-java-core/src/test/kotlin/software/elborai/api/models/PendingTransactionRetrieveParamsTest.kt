// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import software.elborai.api.models.*

class PendingTransactionRetrieveParamsTest {

    @Test
    fun createPendingTransactionRetrieveParams() {
        PendingTransactionRetrieveParams.builder()
            .pendingTransactionId("pending_transaction_id")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            PendingTransactionRetrieveParams.builder()
                .pendingTransactionId("pending_transaction_id")
                .build()
        assertThat(params).isNotNull
        // path param "pendingTransactionId"
        assertThat(params.getPathParam(0)).isEqualTo("pending_transaction_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
