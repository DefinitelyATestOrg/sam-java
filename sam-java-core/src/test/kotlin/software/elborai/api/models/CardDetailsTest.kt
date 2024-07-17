// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardDetailsTest {

    @Test
    fun createCardDetails() {
        val cardDetails =
            CardDetails.builder()
                .cardId("card_id")
                .expirationMonth(123L)
                .expirationYear(123L)
                .primaryAccountNumber("primary_account_number")
                .type(CardDetails.Type.CARD_DETAILS)
                .verificationCode("verification_code")
                .build()
        assertThat(cardDetails).isNotNull
        assertThat(cardDetails.cardId()).isEqualTo("card_id")
        assertThat(cardDetails.expirationMonth()).isEqualTo(123L)
        assertThat(cardDetails.expirationYear()).isEqualTo(123L)
        assertThat(cardDetails.primaryAccountNumber()).isEqualTo("primary_account_number")
        assertThat(cardDetails.type()).isEqualTo(CardDetails.Type.CARD_DETAILS)
        assertThat(cardDetails.verificationCode()).isEqualTo("verification_code")
    }
}
