// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.blocking.agents

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
import software.elborai.api.errors.SamInvalidDataException
import software.elborai.api.models.AgentConfigRetrieveParams
import software.elborai.api.models.AgentConfigUpdateParams
import software.elborai.api.core.ClientOptions
import software.elborai.api.core.http.HttpMethod
import software.elborai.api.core.http.HttpRequest
import software.elborai.api.core.http.HttpResponse.Handler
import software.elborai.api.core.http.BinaryResponseContent
import software.elborai.api.core.JsonField
import software.elborai.api.core.JsonValue
import software.elborai.api.core.RequestOptions
import software.elborai.api.errors.SamError
import software.elborai.api.services.emptyHandler
import software.elborai.api.services.errorHandler
import software.elborai.api.services.json
import software.elborai.api.services.jsonHandler
import software.elborai.api.services.multipartFormData
import software.elborai.api.services.stringHandler
import software.elborai.api.services.binaryHandler
import software.elborai.api.services.withErrorHandler
import software.elborai.api.services.blocking.agents.configs.ChatService
import software.elborai.api.services.blocking.agents.configs.ChatServiceImpl

interface ConfigService {

    fun chat(): ChatService

    @JvmOverloads
    fun retrieve(params: AgentConfigRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): BinaryResponseContent

    @JvmOverloads
    fun update(params: AgentConfigUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): BinaryResponseContent

    class Integration @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Integration &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val SALESFORCE = Integration(JsonField.of("SALESFORCE"))

            @JvmField val ZENDESK = Integration(JsonField.of("ZENDESK"))

            @JvmField val FRESHDESK = Integration(JsonField.of("FRESHDESK"))

            @JvmField val SLACK_QA_BOT = Integration(JsonField.of("SLACK_QA_BOT"))

            @JvmField val TWILIO = Integration(JsonField.of("TWILIO"))

            @JvmStatic fun of(value: String) = Integration(JsonField.of(value))
        }

        enum class Known {
            SALESFORCE,
            ZENDESK,
            FRESHDESK,
            SLACK_QA_BOT,
            TWILIO,
        }

        enum class Value {
            SALESFORCE,
            ZENDESK,
            FRESHDESK,
            SLACK_QA_BOT,
            TWILIO,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            SALESFORCE -> Value.SALESFORCE
            ZENDESK -> Value.ZENDESK
            FRESHDESK -> Value.FRESHDESK
            SLACK_QA_BOT -> Value.SLACK_QA_BOT
            TWILIO -> Value.TWILIO
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            SALESFORCE -> Known.SALESFORCE
            ZENDESK -> Known.ZENDESK
            FRESHDESK -> Known.FRESHDESK
            SLACK_QA_BOT -> Known.SLACK_QA_BOT
            TWILIO -> Known.TWILIO
            else -> throw SamInvalidDataException("Unknown Integration: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
