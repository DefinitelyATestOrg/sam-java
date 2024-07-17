// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.AchPrenotification
import software.elborai.api.models.AchPrenotificationCreateParams
import software.elborai.api.models.AchPrenotificationListPageAsync
import software.elborai.api.models.AchPrenotificationListParams
import software.elborai.api.models.AchPrenotificationRetrieveParams

interface AchPrenotificationServiceAsync {

    /** Create an ACH Prenotification */
    @JvmOverloads
    fun create(
        params: AchPrenotificationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AchPrenotification>

    /** Retrieve an ACH Prenotification */
    @JvmOverloads
    fun retrieve(
        params: AchPrenotificationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AchPrenotification>

    /** List ACH Prenotifications */
    @JvmOverloads
    fun list(
        params: AchPrenotificationListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AchPrenotificationListPageAsync>
}
