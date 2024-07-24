// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DigitalWalletTokenTest {

    @Test
    fun createDigitalWalletToken() {
        val digitalWalletToken =
            DigitalWalletToken.builder()
                .id("id")
                .cardId("card_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(DigitalWalletToken.Status.ACTIVE)
                .tokenRequestor(DigitalWalletToken.TokenRequestor.APPLE_PAY)
                .type(DigitalWalletToken.Type.DIGITAL_WALLET_TOKEN)
                .build()
        assertThat(digitalWalletToken).isNotNull
        assertThat(digitalWalletToken.id()).isEqualTo("id")
        assertThat(digitalWalletToken.cardId()).isEqualTo("card_id")
        assertThat(digitalWalletToken.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(digitalWalletToken.status()).isEqualTo(DigitalWalletToken.Status.ACTIVE)
        assertThat(digitalWalletToken.tokenRequestor())
            .isEqualTo(DigitalWalletToken.TokenRequestor.APPLE_PAY)
        assertThat(digitalWalletToken.type())
            .isEqualTo(DigitalWalletToken.Type.DIGITAL_WALLET_TOKEN)
    }
}
