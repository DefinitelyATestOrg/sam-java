// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import org.apache.hc.core5.http.ContentType
import software.elborai.api.core.ContentTypes
import software.elborai.api.core.JsonNull
import software.elborai.api.core.JsonString
import software.elborai.api.core.JsonValue
import software.elborai.api.core.MultipartFormValue
import software.elborai.api.models.*
import software.elborai.api.models.AccountNumberUpdateParams
import software.elborai.api.models.AccountNumberUpdateParams.AccountNumberUpdateBody

class AccountNumberUpdateParamsTest {

    @Test
    fun createAccountNumberUpdateParams() {
      AccountNumberUpdateParams.builder()
          .accountNumberId("account_number_id")
          .inboundAch(AccountNumberUpdateParams.InboundAch.builder()
              .debitStatus(AccountNumberUpdateParams.InboundAch.DebitStatus.ALLOWED)
              .build())
          .inboundChecks(AccountNumberUpdateParams.InboundChecks.builder()
              .status(AccountNumberUpdateParams.InboundChecks.Status.ALLOWED)
              .build())
          .name("x")
          .status(AccountNumberUpdateParams.Status.ACTIVE)
          .build()
    }

    @Test
    fun getBody() {
      val params = AccountNumberUpdateParams.builder()
          .accountNumberId("account_number_id")
          .inboundAch(AccountNumberUpdateParams.InboundAch.builder()
              .debitStatus(AccountNumberUpdateParams.InboundAch.DebitStatus.ALLOWED)
              .build())
          .inboundChecks(AccountNumberUpdateParams.InboundChecks.builder()
              .status(AccountNumberUpdateParams.InboundChecks.Status.ALLOWED)
              .build())
          .name("x")
          .status(AccountNumberUpdateParams.Status.ACTIVE)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.inboundAch()).isEqualTo(AccountNumberUpdateParams.InboundAch.builder()
          .debitStatus(AccountNumberUpdateParams.InboundAch.DebitStatus.ALLOWED)
          .build())
      assertThat(body.inboundChecks()).isEqualTo(AccountNumberUpdateParams.InboundChecks.builder()
          .status(AccountNumberUpdateParams.InboundChecks.Status.ALLOWED)
          .build())
      assertThat(body.name()).isEqualTo("x")
      assertThat(body.status()).isEqualTo(AccountNumberUpdateParams.Status.ACTIVE)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = AccountNumberUpdateParams.builder()
          .accountNumberId("account_number_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
      val params = AccountNumberUpdateParams.builder()
          .accountNumberId("account_number_id")
          .build()
      assertThat(params).isNotNull
      // path param "accountNumberId"
      assertThat(params.getPathParam(0)).isEqualTo("account_number_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
