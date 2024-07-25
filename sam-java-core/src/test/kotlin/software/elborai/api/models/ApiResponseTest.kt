// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ApiResponseTest {

    @Test
    fun createApiResponse() {
        val apiResponse = ApiResponse.builder().code(123L).message("message").type("type").build()
        assertThat(apiResponse).isNotNull
        assertThat(apiResponse.code()).contains(123L)
        assertThat(apiResponse.message()).contains("message")
        assertThat(apiResponse.type()).contains("type")
    }
}