// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.Order
import software.elborai.api.models.StoreCreateOrderParams
import software.elborai.api.models.StoreDeleteParams
import software.elborai.api.models.StoreInventoryParams
import software.elborai.api.models.StoreInventoryResponse
import software.elborai.api.models.StoreRetrieveParams
import software.elborai.api.services.async.stores.OrderServiceAsync

interface StoreServiceAsync {

    fun orders(): OrderServiceAsync

    /**
     * For valid response try integer IDs with value <= 5 or > 10. Other values will generate
     * exceptions.
     */
    @JvmOverloads
    fun retrieve(
        params: StoreRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Order>

    /**
     * For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will
     * generate API errors
     */
    @JvmOverloads
    fun delete(
        params: StoreDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Void>

    /** Place a new order in the store */
    @JvmOverloads
    fun createOrder(
        params: StoreCreateOrderParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Order>

    /** Returns a map of status codes to quantities */
    @JvmOverloads
    fun inventory(
        params: StoreInventoryParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<StoreInventoryResponse>
}
