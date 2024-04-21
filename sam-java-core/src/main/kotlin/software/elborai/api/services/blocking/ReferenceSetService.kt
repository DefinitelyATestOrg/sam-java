// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.blocking

import software.elborai.api.core.RequestOptions
import software.elborai.api.core.http.BinaryResponseContent
import software.elborai.api.models.ReferenceSetDeleteParams
import software.elborai.api.models.ReferenceSetRetrieveParams
import software.elborai.api.models.ReferenceSetUpdateParams

interface ReferenceSetService {

    @JvmOverloads
    fun retrieve(
        params: ReferenceSetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): BinaryResponseContent

    @JvmOverloads
    fun update(
        params: ReferenceSetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): BinaryResponseContent

    @JvmOverloads
    fun delete(
        params: ReferenceSetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )
}