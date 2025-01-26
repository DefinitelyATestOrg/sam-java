// File generated from our OpenAPI spec by Stainless.

package me.elborai.api.client

import me.elborai.api.services.async.StoreServiceAsync
import me.elborai.api.services.async.UserServiceAsync

interface SamClientAsync {

    fun sync(): SamClient

    fun store(): StoreServiceAsync

    fun users(): UserServiceAsync

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()
}
