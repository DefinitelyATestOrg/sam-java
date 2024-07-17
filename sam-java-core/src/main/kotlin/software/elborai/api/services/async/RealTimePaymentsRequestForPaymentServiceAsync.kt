// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.RealTimePaymentsRequestForPayment
import software.elborai.api.models.RealTimePaymentsRequestForPaymentCreateParams
import software.elborai.api.models.RealTimePaymentsRequestForPaymentListPageAsync
import software.elborai.api.models.RealTimePaymentsRequestForPaymentListParams
import software.elborai.api.models.RealTimePaymentsRequestForPaymentRetrieveParams

interface RealTimePaymentsRequestForPaymentServiceAsync {

    /** Create a Real-Time Payments Request for Payment */
    @JvmOverloads
    fun create(
        params: RealTimePaymentsRequestForPaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RealTimePaymentsRequestForPayment>

    /** Retrieve a Real-Time Payments Request for Payment */
    @JvmOverloads
    fun retrieve(
        params: RealTimePaymentsRequestForPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RealTimePaymentsRequestForPayment>

    /** List Real-Time Payments Request for Payments */
    @JvmOverloads
    fun list(
        params: RealTimePaymentsRequestForPaymentListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RealTimePaymentsRequestForPaymentListPageAsync>
}
