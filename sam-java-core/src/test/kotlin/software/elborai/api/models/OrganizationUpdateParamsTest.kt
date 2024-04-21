// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import software.elborai.api.models.*

class OrganizationUpdateParamsTest {

    @Test
    fun createOrganizationUpdateParams() {
        OrganizationUpdateParams.builder()
            .id("string")
            .friendlyId("string")
            .name("string")
            .defaultLanguage(
                OrganizationUpdateParams.DefaultLanguage.builder()
                    .code("string")
                    .detected(true)
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            OrganizationUpdateParams.builder()
                .id("string")
                .friendlyId("string")
                .name("string")
                .defaultLanguage(
                    OrganizationUpdateParams.DefaultLanguage.builder()
                        .code("string")
                        .detected(true)
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.id()).isEqualTo("string")
        assertThat(body.friendlyId()).isEqualTo("string")
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.defaultLanguage())
            .isEqualTo(
                OrganizationUpdateParams.DefaultLanguage.builder()
                    .code("string")
                    .detected(true)
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            OrganizationUpdateParams.builder()
                .id("string")
                .friendlyId("string")
                .name("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.id()).isEqualTo("string")
        assertThat(body.friendlyId()).isEqualTo("string")
        assertThat(body.name()).isEqualTo("string")
    }
}