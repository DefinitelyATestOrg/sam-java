// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import software.elborai.api.models.*

class WireTransferSubmitParamsTest {

    @Test
    fun createWireTransferSubmitParams() {
        WireTransferSubmitParams.builder().wireTransferId("wire_transfer_id").build()
    }

    @Test
    fun getPathParam() {
        val params = WireTransferSubmitParams.builder().wireTransferId("wire_transfer_id").build()
        assertThat(params).isNotNull
        // path param "wireTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("wire_transfer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
