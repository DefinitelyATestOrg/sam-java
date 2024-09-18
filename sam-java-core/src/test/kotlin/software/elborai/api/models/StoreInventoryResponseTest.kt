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
import software.elborai.api.models.StoreInventoryResponse

class StoreInventoryResponseTest {

    @Test
    fun createStoreInventoryResponse() {
      val storeInventoryResponse = StoreInventoryResponse.builder().build()
      assertThat(storeInventoryResponse).isNotNull
    }
}
