// File generated from our OpenAPI spec by Stainless.

package me.elborai.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CoolOrderTest {

    @Test
    fun createCoolOrder() {
        val coolOrder =
            CoolOrder.builder()
                .id(10L)
                .complete(true)
                .petId(198772L)
                .quantity(7L)
                .shipDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(CoolOrder.Status.PLACED)
                .build()
        assertThat(coolOrder).isNotNull
        assertThat(coolOrder.id()).contains(10L)
        assertThat(coolOrder.complete()).contains(true)
        assertThat(coolOrder.petId()).contains(198772L)
        assertThat(coolOrder.quantity()).contains(7L)
        assertThat(coolOrder.shipDate()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(coolOrder.status()).contains(CoolOrder.Status.PLACED)
    }
}
