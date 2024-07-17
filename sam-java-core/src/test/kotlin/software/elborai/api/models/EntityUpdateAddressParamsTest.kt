// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import software.elborai.api.models.*

class EntityUpdateAddressParamsTest {

    @Test
    fun createEntityUpdateAddressParams() {
        EntityUpdateAddressParams.builder()
            .entityId("string")
            .address(
                EntityUpdateAddressParams.Address.builder()
                    .city("x")
                    .line1("x")
                    .state("x")
                    .zip("x")
                    .line2("x")
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EntityUpdateAddressParams.builder()
                .entityId("string")
                .address(
                    EntityUpdateAddressParams.Address.builder()
                        .city("x")
                        .line1("x")
                        .state("x")
                        .zip("x")
                        .line2("x")
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.address())
            .isEqualTo(
                EntityUpdateAddressParams.Address.builder()
                    .city("x")
                    .line1("x")
                    .state("x")
                    .zip("x")
                    .line2("x")
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EntityUpdateAddressParams.builder()
                .entityId("string")
                .address(
                    EntityUpdateAddressParams.Address.builder()
                        .city("x")
                        .line1("x")
                        .state("x")
                        .zip("x")
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.address())
            .isEqualTo(
                EntityUpdateAddressParams.Address.builder()
                    .city("x")
                    .line1("x")
                    .state("x")
                    .zip("x")
                    .build()
            )
    }

    @Test
    fun getPathParam() {
        val params =
            EntityUpdateAddressParams.builder()
                .entityId("string")
                .address(
                    EntityUpdateAddressParams.Address.builder()
                        .city("x")
                        .line1("x")
                        .state("x")
                        .zip("x")
                        .build()
                )
                .build()
        assertThat(params).isNotNull
        // path param "entityId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
