// File generated from our OpenAPI spec by Stainless.

package me.elborai.api.services.async

import java.util.function.Consumer
import me.elborai.api.core.ClientOptions
import me.elborai.api.services.async.store.OrderServiceAsync

interface StoreServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StoreServiceAsync

    fun orders(): OrderServiceAsync

    /** A view of [StoreServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StoreServiceAsync.WithRawResponse

        fun orders(): OrderServiceAsync.WithRawResponse
    }
}
