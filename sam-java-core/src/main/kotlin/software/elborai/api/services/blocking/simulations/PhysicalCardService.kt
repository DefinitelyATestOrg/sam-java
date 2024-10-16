// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.blocking.simulations

import software.elborai.api.core.RequestOptions
import software.elborai.api.models.PhysicalCard
import software.elborai.api.models.SimulationPhysicalCardShipmentAdvanceParams

interface PhysicalCardService {

    /**
     * This endpoint allows you to simulate advancing the shipment status of a Physical Card, to
     * simulate e.g., that a physical card was attempted shipped but then failed delivery.
     */
    @JvmOverloads
    fun shipmentAdvance(
        params: SimulationPhysicalCardShipmentAdvanceParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PhysicalCard
}
