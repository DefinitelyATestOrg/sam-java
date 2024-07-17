// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async.simulations

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.DigitalWalletTokenRequestCreateResponse
import software.elborai.api.models.SimulationDigitalWalletTokenRequestCreateParams

interface DigitalWalletTokenRequestServiceAsync {

    /** Simulates a user attempting add a [Card](#cards) to a digital wallet such as Apple Pay. */
    @JvmOverloads
    fun create(
        params: SimulationDigitalWalletTokenRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DigitalWalletTokenRequestCreateResponse>
}
