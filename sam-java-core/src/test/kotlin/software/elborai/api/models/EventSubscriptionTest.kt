// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventSubscriptionTest {

    @Test
    fun createEventSubscription() {
        val eventSubscription =
            EventSubscription.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .idempotencyKey("idempotency_key")
                .oauthConnectionId("oauth_connection_id")
                .selectedEventCategory(EventSubscription.SelectedEventCategory.ACCOUNT_CREATED)
                .status(EventSubscription.Status.ACTIVE)
                .type(EventSubscription.Type.EVENT_SUBSCRIPTION)
                .url("url")
                .build()
        assertThat(eventSubscription).isNotNull
        assertThat(eventSubscription.id()).isEqualTo("id")
        assertThat(eventSubscription.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventSubscription.idempotencyKey()).contains("idempotency_key")
        assertThat(eventSubscription.oauthConnectionId()).contains("oauth_connection_id")
        assertThat(eventSubscription.selectedEventCategory())
            .contains(EventSubscription.SelectedEventCategory.ACCOUNT_CREATED)
        assertThat(eventSubscription.status()).isEqualTo(EventSubscription.Status.ACTIVE)
        assertThat(eventSubscription.type()).isEqualTo(EventSubscription.Type.EVENT_SUBSCRIPTION)
        assertThat(eventSubscription.url()).isEqualTo("url")
    }
}
