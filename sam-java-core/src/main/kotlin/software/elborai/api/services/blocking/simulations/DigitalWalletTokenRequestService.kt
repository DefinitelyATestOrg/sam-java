// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.blocking.simulations

import software.elborai.api.core.RequestOptions
import software.elborai.api.models.DigitalWalletTokenRequestCreateResponse
import software.elborai.api.models.SimulationDigitalWalletTokenRequestCreateParams

interface DigitalWalletTokenRequestService {

    /** Simulates a user attempting add a [Card](#cards) to a digital wallet such as Apple Pay. */
    @JvmOverloads
    fun create(
        params: SimulationDigitalWalletTokenRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DigitalWalletTokenRequestCreateResponse
}
