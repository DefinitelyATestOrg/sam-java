// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.EventSubscription
import software.elborai.api.models.EventSubscriptionCreateParams
import software.elborai.api.models.EventSubscriptionListPageAsync
import software.elborai.api.models.EventSubscriptionListParams
import software.elborai.api.models.EventSubscriptionRetrieveParams
import software.elborai.api.models.EventSubscriptionUpdateParams

interface EventSubscriptionServiceAsync {

    /** Create an Event Subscription */
    @JvmOverloads
    fun create(
        params: EventSubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<EventSubscription>

    /** Retrieve an Event Subscription */
    @JvmOverloads
    fun retrieve(
        params: EventSubscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<EventSubscription>

    /** Update an Event Subscription */
    @JvmOverloads
    fun update(
        params: EventSubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<EventSubscription>

    /** List Event Subscriptions */
    @JvmOverloads
    fun list(
        params: EventSubscriptionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<EventSubscriptionListPageAsync>
}