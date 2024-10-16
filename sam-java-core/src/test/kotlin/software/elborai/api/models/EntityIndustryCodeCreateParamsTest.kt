// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import software.elborai.api.models.*

class EntityIndustryCodeCreateParamsTest {

    @Test
    fun createEntityIndustryCodeCreateParams() {
        EntityIndustryCodeCreateParams.builder().entityId("entity_id").industryCode("x").build()
    }

    @Test
    fun getBody() {
        val params =
            EntityIndustryCodeCreateParams.builder().entityId("entity_id").industryCode("x").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.industryCode()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EntityIndustryCodeCreateParams.builder().entityId("entity_id").industryCode("x").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.industryCode()).isEqualTo("x")
    }

    @Test
    fun getPathParam() {
        val params =
            EntityIndustryCodeCreateParams.builder().entityId("entity_id").industryCode("x").build()
        assertThat(params).isNotNull
        // path param "entityId"
        assertThat(params.getPathParam(0)).isEqualTo("entity_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
