// File generated from our OpenAPI spec by Stainless.

package me.elborai.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UserCreateParamsTest {

    @Test
    fun createUserCreateParams() {
        UserCreateParams.builder()
            .id(10L)
            .email("john@email.com")
            .firstName("John")
            .lastName("James")
            .password("12345")
            .phone("12345")
            .username("theUser")
            .userStatus(1L)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            UserCreateParams.builder()
                .id(10L)
                .email("john@email.com")
                .firstName("John")
                .lastName("James")
                .password("12345")
                .phone("12345")
                .username("theUser")
                .userStatus(1L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.id()).contains(10L)
        assertThat(body.email()).contains("john@email.com")
        assertThat(body.firstName()).contains("John")
        assertThat(body.lastName()).contains("James")
        assertThat(body.password()).contains("12345")
        assertThat(body.phone()).contains("12345")
        assertThat(body.username()).contains("theUser")
        assertThat(body.userStatus()).contains(1L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = UserCreateParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
