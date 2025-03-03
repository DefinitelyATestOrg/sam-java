// File generated from our OpenAPI spec by Stainless.

package me.elborai.api.services.async

import me.elborai.api.TestServerExtension
import me.elborai.api.client.okhttp.SamOkHttpClientAsync
import me.elborai.api.models.User
import me.elborai.api.models.UserCreateListParams
import me.elborai.api.models.UserCreateParams
import me.elborai.api.models.UserDeleteParams
import me.elborai.api.models.UserLoginParams
import me.elborai.api.models.UserRetrieveParams
import me.elborai.api.models.UserUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class UserServiceAsyncTest {

    @Test
    fun create() {
        val client =
            SamOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.user()

        val userFuture =
            userServiceAsync.create(
                UserCreateParams.builder()
                    .user(
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
                    )
                    .build()
            )

        val user = userFuture.get()
        user.validate()
    }

    @Test
    fun retrieve() {
        val client =
            SamOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.user()

        val userFuture =
            userServiceAsync.retrieve(UserRetrieveParams.builder().username("username").build())

        val user = userFuture.get()
        user.validate()
    }

    @Test
    fun update() {
        val client =
            SamOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.user()

        val future =
            userServiceAsync.update(
                UserUpdateParams.builder()
                    .username("username")
                    .user(
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
                    )
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun delete() {
        val client =
            SamOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.user()

        val future =
            userServiceAsync.delete(UserDeleteParams.builder().username("username").build())

        val response = future.get()
    }

    @Test
    fun createList() {
        val client =
            SamOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.user()

        val userFuture =
            userServiceAsync.createList(
                UserCreateListParams.builder()
                    .addBody(
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
                    )
                    .build()
            )

        val user = userFuture.get()
        user.validate()
    }

    @Test
    fun login() {
        val client =
            SamOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.user()

        val responseFuture =
            userServiceAsync.login(
                UserLoginParams.builder().password("password").username("username").build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun logout() {
        val client =
            SamOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.user()

        val future = userServiceAsync.logout()

        val response = future.get()
    }
}
