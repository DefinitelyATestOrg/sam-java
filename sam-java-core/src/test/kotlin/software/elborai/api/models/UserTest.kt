// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import software.elborai.api.core.JsonNull
import software.elborai.api.core.JsonString
import software.elborai.api.core.JsonValue
import software.elborai.api.models.User

class UserTest {

    @Test
    fun createUser() {
      val user = User.builder()
          .id(123L)
          .email("john@email.com")
          .firstName("John")
          .lastName("James")
          .password("12345")
          .phone("12345")
          .username("theUser")
          .userStatus(123L)
          .build()
      assertThat(user).isNotNull
      assertThat(user.id()).contains(123L)
      assertThat(user.email()).contains("john@email.com")
      assertThat(user.firstName()).contains("John")
      assertThat(user.lastName()).contains("James")
      assertThat(user.password()).contains("12345")
      assertThat(user.phone()).contains("12345")
      assertThat(user.username()).contains("theUser")
      assertThat(user.userStatus()).contains(123L)
    }
}
