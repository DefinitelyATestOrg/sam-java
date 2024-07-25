// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.blocking.store

import software.elborai.api.core.RequestOptions
import software.elborai.api.models.Order
import software.elborai.api.models.StoreOrderDeleteParams
import software.elborai.api.models.StoreOrderRetrieveParams

interface OrderService {

    /**
     * For valid response try integer IDs with value <= 5 or > 10. Other values will generate
     * exceptions.
     */
    @JvmOverloads
    fun retrieve(
        params: StoreOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Order

    /**
     * For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will
     * generate API errors
     */
    @JvmOverloads
    fun delete(
        params: StoreOrderDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )
}