// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import software.elborai.api.core.ExcludeMissing
import software.elborai.api.core.JsonValue
import software.elborai.api.core.NoAutoDetect
import software.elborai.api.core.toUnmodifiable
import software.elborai.api.models.*

class BookkeepingEntrySetCreateParams
constructor(
    private val entries: List<Entry>,
    private val date: OffsetDateTime?,
    private val transactionId: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun entries(): List<Entry> = entries

    fun date(): Optional<OffsetDateTime> = Optional.ofNullable(date)

    fun transactionId(): Optional<String> = Optional.ofNullable(transactionId)

    @JvmSynthetic
    internal fun getBody(): BookkeepingEntrySetCreateBody {
        return BookkeepingEntrySetCreateBody(
            entries,
            date,
            transactionId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = BookkeepingEntrySetCreateBody.Builder::class)
    @NoAutoDetect
    class BookkeepingEntrySetCreateBody
    internal constructor(
        private val entries: List<Entry>?,
        private val date: OffsetDateTime?,
        private val transactionId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The bookkeeping entries. */
        @JsonProperty("entries") fun entries(): List<Entry>? = entries

        /**
         * The date of the transaction. Optional if `transaction_id` is provided, in which case we
         * use the `date` of that transaction. Required otherwise.
         */
        @JsonProperty("date") fun date(): OffsetDateTime? = date

        /** The identifier of the Transaction related to this entry set, if any. */
        @JsonProperty("transaction_id") fun transactionId(): String? = transactionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BookkeepingEntrySetCreateBody &&
                this.entries == other.entries &&
                this.date == other.date &&
                this.transactionId == other.transactionId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        entries,
                        date,
                        transactionId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "BookkeepingEntrySetCreateBody{entries=$entries, date=$date, transactionId=$transactionId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var entries: List<Entry>? = null
            private var date: OffsetDateTime? = null
            private var transactionId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(bookkeepingEntrySetCreateBody: BookkeepingEntrySetCreateBody) =
                apply {
                    this.entries = bookkeepingEntrySetCreateBody.entries
                    this.date = bookkeepingEntrySetCreateBody.date
                    this.transactionId = bookkeepingEntrySetCreateBody.transactionId
                    additionalProperties(bookkeepingEntrySetCreateBody.additionalProperties)
                }

            /** The bookkeeping entries. */
            @JsonProperty("entries")
            fun entries(entries: List<Entry>) = apply { this.entries = entries }

            /**
             * The date of the transaction. Optional if `transaction_id` is provided, in which case
             * we use the `date` of that transaction. Required otherwise.
             */
            @JsonProperty("date") fun date(date: OffsetDateTime) = apply { this.date = date }

            /** The identifier of the Transaction related to this entry set, if any. */
            @JsonProperty("transaction_id")
            fun transactionId(transactionId: String) = apply { this.transactionId = transactionId }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): BookkeepingEntrySetCreateBody =
                BookkeepingEntrySetCreateBody(
                    checkNotNull(entries) { "`entries` is required but was not set" }
                        .toUnmodifiable(),
                    date,
                    transactionId,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BookkeepingEntrySetCreateParams &&
            this.entries == other.entries &&
            this.date == other.date &&
            this.transactionId == other.transactionId &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            entries,
            date,
            transactionId,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "BookkeepingEntrySetCreateParams{entries=$entries, date=$date, transactionId=$transactionId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var entries: MutableList<Entry> = mutableListOf()
        private var date: OffsetDateTime? = null
        private var transactionId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bookkeepingEntrySetCreateParams: BookkeepingEntrySetCreateParams) =
            apply {
                this.entries(bookkeepingEntrySetCreateParams.entries)
                this.date = bookkeepingEntrySetCreateParams.date
                this.transactionId = bookkeepingEntrySetCreateParams.transactionId
                additionalQueryParams(bookkeepingEntrySetCreateParams.additionalQueryParams)
                additionalHeaders(bookkeepingEntrySetCreateParams.additionalHeaders)
                additionalBodyProperties(bookkeepingEntrySetCreateParams.additionalBodyProperties)
            }

        /** The bookkeeping entries. */
        fun entries(entries: List<Entry>) = apply {
            this.entries.clear()
            this.entries.addAll(entries)
        }

        /** The bookkeeping entries. */
        fun addEntry(entry: Entry) = apply { this.entries.add(entry) }

        /**
         * The date of the transaction. Optional if `transaction_id` is provided, in which case we
         * use the `date` of that transaction. Required otherwise.
         */
        fun date(date: OffsetDateTime) = apply { this.date = date }

        /** The identifier of the Transaction related to this entry set, if any. */
        fun transactionId(transactionId: String) = apply { this.transactionId = transactionId }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): BookkeepingEntrySetCreateParams =
            BookkeepingEntrySetCreateParams(
                checkNotNull(entries) { "`entries` is required but was not set" }.toUnmodifiable(),
                date,
                transactionId,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Entry.Builder::class)
    @NoAutoDetect
    class Entry
    private constructor(
        private val accountId: String?,
        private val amount: Long?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The identifier for the Bookkeeping Account impacted by this entry. */
        @JsonProperty("account_id") fun accountId(): String? = accountId

        /**
         * The entry amount in the minor unit of the account currency. For dollars, for example,
         * this is cents. Debit entries have positive amounts; credit entries have negative amounts.
         */
        @JsonProperty("amount") fun amount(): Long? = amount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Entry &&
                this.accountId == other.accountId &&
                this.amount == other.amount &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountId,
                        amount,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Entry{accountId=$accountId, amount=$amount, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountId: String? = null
            private var amount: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(entry: Entry) = apply {
                this.accountId = entry.accountId
                this.amount = entry.amount
                additionalProperties(entry.additionalProperties)
            }

            /** The identifier for the Bookkeeping Account impacted by this entry. */
            @JsonProperty("account_id")
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /**
             * The entry amount in the minor unit of the account currency. For dollars, for example,
             * this is cents. Debit entries have positive amounts; credit entries have negative
             * amounts.
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Entry =
                Entry(
                    checkNotNull(accountId) { "`accountId` is required but was not set" },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
