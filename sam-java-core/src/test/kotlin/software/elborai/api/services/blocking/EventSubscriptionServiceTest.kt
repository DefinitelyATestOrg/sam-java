// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import software.elborai.api.TestServerExtension
import software.elborai.api.client.okhttp.IncreaseOkHttpClient
import software.elborai.api.models.*
import software.elborai.api.models.EventSubscriptionListParams

@ExtendWith(TestServerExtension::class)
class EventSubscriptionServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val eventSubscriptionService = client.eventSubscriptions()
        val eventSubscription =
            eventSubscriptionService.create(
                EventSubscriptionCreateParams.builder()
                    .url("url")
                    .oauthConnectionId("oauth_connection_id")
                    .selectedEventCategory(
                        EventSubscriptionCreateParams.SelectedEventCategory.ACCOUNT_CREATED
                    )
                    .sharedSecret("x")
                    .build()
            )
        println(eventSubscription)
        eventSubscription.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val eventSubscriptionService = client.eventSubscriptions()
        val eventSubscription =
            eventSubscriptionService.retrieve(
                EventSubscriptionRetrieveParams.builder()
                    .eventSubscriptionId("event_subscription_id")
                    .build()
            )
        println(eventSubscription)
        eventSubscription.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val eventSubscriptionService = client.eventSubscriptions()
        val eventSubscription =
            eventSubscriptionService.update(
                EventSubscriptionUpdateParams.builder()
                    .eventSubscriptionId("event_subscription_id")
                    .status(EventSubscriptionUpdateParams.Status.ACTIVE)
                    .build()
            )
        println(eventSubscription)
        eventSubscription.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val eventSubscriptionService = client.eventSubscriptions()
        val eventSubscriptionList =
            eventSubscriptionService.list(EventSubscriptionListParams.builder().build())
        println(eventSubscriptionList)
        eventSubscriptionList.data().forEach { it.validate() }
    }
}
