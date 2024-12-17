// File generated from our OpenAPI spec by Stainless.

package com.sam.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OrderTest {

    @Test
    fun createOrder() {
        val order =
            Order.builder()
                .id(10L)
                .complete(true)
                .petId(198772L)
                .quantity(7L)
                .shipDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(Order.Status.PLACED)
                .build()
        assertThat(order).isNotNull
        assertThat(order.id()).contains(10L)
        assertThat(order.complete()).contains(true)
        assertThat(order.petId()).contains(198772L)
        assertThat(order.quantity()).contains(7L)
        assertThat(order.shipDate()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(order.status()).contains(Order.Status.PLACED)
    }
}
