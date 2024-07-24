// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.blocking.intrafi

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import software.elborai.api.core.Enum
import software.elborai.api.core.NoAutoDetect
import software.elborai.api.errors.IncreaseInvalidDataException
import software.elborai.api.models.IntrafiExclusion
import software.elborai.api.models.IntrafiExclusionArchiveParams
import software.elborai.api.models.IntrafiExclusionCreateParams
import software.elborai.api.models.IntrafiExclusionListPage
import software.elborai.api.models.IntrafiExclusionListParams
import software.elborai.api.models.IntrafiExclusionRetrieveParams
import software.elborai.api.core.ClientOptions
import software.elborai.api.core.http.HttpMethod
import software.elborai.api.core.http.HttpRequest
import software.elborai.api.core.http.HttpResponse.Handler
import software.elborai.api.core.http.BinaryResponseContent
import software.elborai.api.core.JsonField
import software.elborai.api.core.JsonValue
import software.elborai.api.core.RequestOptions
import software.elborai.api.errors.IncreaseError
import software.elborai.api.services.emptyHandler
import software.elborai.api.services.errorHandler
import software.elborai.api.services.json
import software.elborai.api.services.jsonHandler
import software.elborai.api.services.multipartFormData
import software.elborai.api.services.stringHandler
import software.elborai.api.services.binaryHandler
import software.elborai.api.services.withErrorHandler

interface ExclusionService {

    /** Create an IntraFi Exclusion */
    @JvmOverloads
    fun create(params: IntrafiExclusionCreateParams, requestOptions: RequestOptions = RequestOptions.none()): IntrafiExclusion

    /** Get an IntraFi Exclusion */
    @JvmOverloads
    fun retrieve(params: IntrafiExclusionRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): IntrafiExclusion

    /** List IntraFi Exclusions. */
    @JvmOverloads
    fun list(params: IntrafiExclusionListParams, requestOptions: RequestOptions = RequestOptions.none()): IntrafiExclusionListPage

    /** Archive an IntraFi Exclusion */
    @JvmOverloads
    fun archive(params: IntrafiExclusionArchiveParams, requestOptions: RequestOptions = RequestOptions.none()): IntrafiExclusion
}
