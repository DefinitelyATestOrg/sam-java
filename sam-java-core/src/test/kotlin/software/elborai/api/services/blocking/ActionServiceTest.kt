// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.services.blocking

import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.put
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import software.elborai.api.TestServerExtension
import software.elborai.api.client.okhttp.SamOkHttpClient
import software.elborai.api.core.http.BinaryResponseContent
import software.elborai.api.models.*

@ExtendWith(TestServerExtension::class)
@WireMockTest
class ActionServiceTest {

    @Test
    fun callRetrieve(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            SamOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .authToken("My Auth Token")
                .build()
        stubFor(get("/api/v1/actions/{actionId}").willReturn(ok().withBody("abc")))
        val actionService = client.actions()
        val response =
            actionService.retrieve(ActionRetrieveParams.builder().actionId("string").build())
        println(response)
        assertThat(response).isInstanceOf(BinaryResponseContent::class.java)
        assertThat(response.body()).hasBinaryContent("abc".toByteArray())
    }

    @Test
    fun callUpdate(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            SamOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .authToken("My Auth Token")
                .build()
        stubFor(put("/api/v1/actions/{actionId}").willReturn(ok().withBody("abc")))
        val actionService = client.actions()
        val response =
            actionService.update(
                ActionUpdateParams.builder()
                    .actionId("string")
                    .actionSetId("string")
                    .agentId("string")
                    .createdBy(
                        ActionUpdateParams.CreatedBy.builder().id("string").name("string").build()
                    )
                    .description("string")
                    .errorMessage("string")
                    .method(ActionUpdateParams.Method.GET)
                    .name("string")
                    .parameters(
                        listOf(
                            ActionUpdateParams.Parameter.builder()
                                .description("string")
                                .errorMessage("string")
                                .name("string")
                                .required(true)
                                .status(ActionUpdateParams.Parameter.Status.USER_CONTEXT)
                                .type(ActionUpdateParams.Parameter.Type.PATH)
                                .validationType(ActionUpdateParams.Parameter.ValidationType.STRING)
                                .build()
                        )
                    )
                    .path("string")
                    .requestBodyType(ActionUpdateParams.RequestBodyType.JSON)
                    .status(ActionUpdateParams.Status.ACTIVE)
                    .updatedBy(
                        ActionUpdateParams.UpdatedBy.builder().id("string").name("string").build()
                    )
                    .build()
            )
        println(response)
        assertThat(response).isInstanceOf(BinaryResponseContent::class.java)
        assertThat(response.body()).hasBinaryContent("abc".toByteArray())
    }
}