// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.Card
import software.elborai.api.models.CardCreateParams
import software.elborai.api.models.CardDetails
import software.elborai.api.models.CardListPageAsync
import software.elborai.api.models.CardListParams
import software.elborai.api.models.CardRetrieveParams
import software.elborai.api.models.CardRetrieveSensitiveDetailsParams
import software.elborai.api.models.CardUpdateParams

interface CardServiceAsync {

    /** Create a Card */
    @JvmOverloads
    fun create(
        params: CardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Card>

    /** Retrieve a Card */
    @JvmOverloads
    fun retrieve(
        params: CardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Card>

    /** Update a Card */
    @JvmOverloads
    fun update(
        params: CardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Card>

    /** List Cards */
    @JvmOverloads
    fun list(
        params: CardListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CardListPageAsync>

    /** Retrieve sensitive details for a Card */
    @JvmOverloads
    fun retrieveSensitiveDetails(
        params: CardRetrieveSensitiveDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CardDetails>
}
