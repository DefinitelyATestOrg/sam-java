// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.Spliterator
import java.util.Spliterators
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import software.elborai.api.core.ExcludeMissing
import software.elborai.api.core.JsonMissing
import software.elborai.api.core.JsonValue
import software.elborai.api.core.JsonField
import software.elborai.api.core.NoAutoDetect
import software.elborai.api.core.toUnmodifiable
import software.elborai.api.models.RealTimePaymentsRequestForPayment
import software.elborai.api.services.blocking.RealTimePaymentsRequestForPaymentService

class RealTimePaymentsRequestForPaymentListPage private constructor(private val realTimePaymentsRequestForPaymentsService: RealTimePaymentsRequestForPaymentService, private val params: RealTimePaymentsRequestForPaymentListParams, private val response: Response, ) {

    fun response(): Response = response

    fun data(): List<RealTimePaymentsRequestForPayment> = response().data()

    fun nextCursor(): Optional<String> = response().nextCursor()

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is RealTimePaymentsRequestForPaymentListPage &&
          this.realTimePaymentsRequestForPaymentsService == other.realTimePaymentsRequestForPaymentsService &&
          this.params == other.params &&
          this.response == other.response
    }

    override fun hashCode(): Int {
      return Objects.hash(
          realTimePaymentsRequestForPaymentsService,
          params,
          response,
      )
    }

    override fun toString() = "RealTimePaymentsRequestForPaymentListPage{realTimePaymentsRequestForPaymentsService=$realTimePaymentsRequestForPaymentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
      if (data().isEmpty()) {
        return false;
      }

      return nextCursor().isPresent()
    }

    fun getNextPageParams(): Optional<RealTimePaymentsRequestForPaymentListParams> {
      if (!hasNextPage()) {
        return Optional.empty()
      }

      return Optional.of(RealTimePaymentsRequestForPaymentListParams.builder().from(params).apply {nextCursor().ifPresent{ this.cursor(it) } }.build())
    }

    fun getNextPage(): Optional<RealTimePaymentsRequestForPaymentListPage> {
      return getNextPageParams().map { realTimePaymentsRequestForPaymentsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(realTimePaymentsRequestForPaymentsService: RealTimePaymentsRequestForPaymentService, params: RealTimePaymentsRequestForPaymentListParams, response: Response) = RealTimePaymentsRequestForPaymentListPage(
            realTimePaymentsRequestForPaymentsService,
            params,
            response,
        )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response constructor(private val data: JsonField<List<RealTimePaymentsRequestForPayment>>, private val nextCursor: JsonField<String>, private val additionalProperties: Map<String, JsonValue>, ) {

        private var validated: Boolean = false

        fun data(): List<RealTimePaymentsRequestForPayment> = data.getNullable("data") ?: listOf()

        fun nextCursor(): Optional<String> = Optional.ofNullable(nextCursor.getNullable("next_cursor"))

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<RealTimePaymentsRequestForPayment>>> = Optional.ofNullable(data)

        @JsonProperty("next_cursor")
        fun _nextCursor(): Optional<JsonField<String>> = Optional.ofNullable(nextCursor)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
              data().map { it.validate() }
              nextCursor()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Response &&
              this.data == other.data &&
              this.nextCursor == other.nextCursor &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          return Objects.hash(
              data,
              nextCursor,
              additionalProperties,
          )
        }

        override fun toString() = "RealTimePaymentsRequestForPaymentListPage.Response{data=$data, nextCursor=$nextCursor, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<RealTimePaymentsRequestForPayment>> = JsonMissing.of()
            private var nextCursor: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.data = page.data
                this.nextCursor = page.nextCursor
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<RealTimePaymentsRequestForPayment>) = data(JsonField.of(data))

            @JsonProperty("data")
            fun data(data: JsonField<List<RealTimePaymentsRequestForPayment>>) = apply { this.data = data }

            fun nextCursor(nextCursor: String) = nextCursor(JsonField.of(nextCursor))

            @JsonProperty("next_cursor")
            fun nextCursor(nextCursor: JsonField<String>) = apply { this.nextCursor = nextCursor }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(
                data,
                nextCursor,
                additionalProperties.toUnmodifiable(),
            )
        }
    }

    class AutoPager constructor(private val firstPage: RealTimePaymentsRequestForPaymentListPage, ) : Iterable<RealTimePaymentsRequestForPayment> {

        override fun iterator(): Iterator<RealTimePaymentsRequestForPayment> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
              while (index < page.data().size) {
                yield(page.data()[index++])
              }
              page = page.getNextPage().orElse(null) ?: break
              index = 0
            }
        }

        fun stream(): Stream<RealTimePaymentsRequestForPayment> {
          return StreamSupport.stream(spliterator(), false)
        }
    }
}
