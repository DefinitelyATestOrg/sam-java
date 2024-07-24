// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.services.blocking

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
import software.elborai.api.services.blocking.intrafi.AccountEnrollmentService
import software.elborai.api.services.blocking.intrafi.AccountEnrollmentServiceImpl
import software.elborai.api.services.blocking.intrafi.BalanceService
import software.elborai.api.services.blocking.intrafi.BalanceServiceImpl
import software.elborai.api.services.blocking.intrafi.ExclusionService
import software.elborai.api.services.blocking.intrafi.ExclusionServiceImpl

class IntrafiServiceImpl constructor(private val clientOptions: ClientOptions, ) : IntrafiService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val accountEnrollments: AccountEnrollmentService by lazy { AccountEnrollmentServiceImpl(clientOptions) }

    private val balances: BalanceService by lazy { BalanceServiceImpl(clientOptions) }

    private val exclusions: ExclusionService by lazy { ExclusionServiceImpl(clientOptions) }

    override fun accountEnrollments(): AccountEnrollmentService = accountEnrollments

    override fun balances(): BalanceService = balances

    override fun exclusions(): ExclusionService = exclusions
}
