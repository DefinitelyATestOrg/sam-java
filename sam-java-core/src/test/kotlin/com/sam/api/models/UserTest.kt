// File generated from our OpenAPI spec by Stainless.

package com.sam.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UserTest {

    @Test
    fun createUser() {
        val user =
            User.builder()
                .id(10L)
                .email("john@email.com")
                .firstName("John")
                .lastName("James")
                .password("12345")
                .phone("12345")
                .username("theUser")
                .userStatus(1L)
                .build()
        assertThat(user).isNotNull
        assertThat(user.id()).contains(10L)
        assertThat(user.email()).contains("john@email.com")
        assertThat(user.firstName()).contains("John")
        assertThat(user.lastName()).contains("James")
        assertThat(user.password()).contains("12345")
        assertThat(user.phone()).contains("12345")
        assertThat(user.username()).contains("theUser")
        assertThat(user.userStatus()).contains(1L)
    }
}
