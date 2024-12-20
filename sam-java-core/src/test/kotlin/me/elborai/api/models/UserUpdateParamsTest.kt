// File generated from our OpenAPI spec by Stainless.

package me.elborai.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UserUpdateParamsTest {

    @Test
    fun createUserUpdateParams() {
        UserUpdateParams.builder()
            .pathUsername("username")
            .id(10L)
            .email("john@email.com")
            .firstName("John")
            .lastName("James")
            .password("12345")
            .phone("12345")
            .bodyUsername("theUser")
            .userStatus(1L)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            UserUpdateParams.builder()
                .pathUsername("username")
                .id(10L)
                .email("john@email.com")
                .firstName("John")
                .lastName("James")
                .password("12345")
                .phone("12345")
                .bodyUsername("theUser")
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
        assertThat(body.bodyUsername()).contains("theUser")
        assertThat(body.userStatus()).contains(1L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = UserUpdateParams.builder().pathUsername("username").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = UserUpdateParams.builder().pathUsername("username").build()
        assertThat(params).isNotNull
        // path param "pathUsername"
        assertThat(params.getPathParam(0)).isEqualTo("username")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
