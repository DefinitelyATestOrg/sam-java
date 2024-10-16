// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import software.elborai.api.models.*

class CardDisputeCreateParamsTest {

    @Test
    fun createCardDisputeCreateParams() {
        CardDisputeCreateParams.builder()
            .disputedTransactionId("disputed_transaction_id")
            .explanation("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CardDisputeCreateParams.builder()
                .disputedTransactionId("disputed_transaction_id")
                .explanation("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.disputedTransactionId()).isEqualTo("disputed_transaction_id")
        assertThat(body.explanation()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CardDisputeCreateParams.builder()
                .disputedTransactionId("disputed_transaction_id")
                .explanation("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.disputedTransactionId()).isEqualTo("disputed_transaction_id")
        assertThat(body.explanation()).isEqualTo("x")
    }
}
