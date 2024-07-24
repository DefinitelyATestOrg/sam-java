// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.blocking

import software.elborai.api.core.RequestOptions
import software.elborai.api.models.CardDispute
import software.elborai.api.models.CardDisputeCreateParams
import software.elborai.api.models.CardDisputeListPage
import software.elborai.api.models.CardDisputeListParams
import software.elborai.api.models.CardDisputeRetrieveParams

interface CardDisputeService {

    /** Create a Card Dispute */
    @JvmOverloads
    fun create(
        params: CardDisputeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardDispute

    /** Retrieve a Card Dispute */
    @JvmOverloads
    fun retrieve(
        params: CardDisputeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardDispute

    /** List Card Disputes */
    @JvmOverloads
    fun list(
        params: CardDisputeListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardDisputeListPage
}
