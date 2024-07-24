// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.UUID
import software.elborai.api.core.BaseDeserializer
import software.elborai.api.core.BaseSerializer
import software.elborai.api.core.getOrThrow
import software.elborai.api.core.ExcludeMissing
import software.elborai.api.core.JsonMissing
import software.elborai.api.core.JsonValue
import software.elborai.api.core.JsonNull
import software.elborai.api.core.JsonField
import software.elborai.api.core.Enum
import software.elborai.api.core.toUnmodifiable
import software.elborai.api.core.NoAutoDetect
import software.elborai.api.errors.IncreaseInvalidDataException

/**
 * Entries are T-account entries recording debits and credits. Your compliance
 * setup might require annotating money movements using this API. Learn more in our
 * [guide to Bookkeeping](https://increase.com/documentation/bookkeeping#bookkeeping).
 */
@JsonDeserialize(builder = BookkeepingEntry.Builder::class)
@NoAutoDetect
class BookkeepingEntry private constructor(
  private val accountId: JsonField<String>,
  private val amount: JsonField<Long>,
  private val createdAt: JsonField<OffsetDateTime>,
  private val entrySetId: JsonField<String>,
  private val id: JsonField<String>,
  private val type: JsonField<Type>,
  private val additionalProperties: Map<String, JsonValue>,

) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The identifier for the Account the Entry belongs to. */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The Entry amount in the minor unit of its currency. For dollars, for example,
     * this is cents.
     */
    fun amount(): Long = amount.getRequired("amount")

    /** When the entry set was created. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The identifier for the Account the Entry belongs to. */
    fun entrySetId(): String = entrySetId.getRequired("entry_set_id")

    /** The entry identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `bookkeeping_entry`.
     */
    fun type(): Type = type.getRequired("type")

    /** The identifier for the Account the Entry belongs to. */
    @JsonProperty("account_id")
    @ExcludeMissing
    fun _accountId() = accountId

    /**
     * The Entry amount in the minor unit of its currency. For dollars, for example,
     * this is cents.
     */
    @JsonProperty("amount")
    @ExcludeMissing
    fun _amount() = amount

    /** When the entry set was created. */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt() = createdAt

    /** The identifier for the Account the Entry belongs to. */
    @JsonProperty("entry_set_id")
    @ExcludeMissing
    fun _entrySetId() = entrySetId

    /** The entry identifier. */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id() = id

    /**
     * A constant representing the object's type. For this resource it will always be
     * `bookkeeping_entry`.
     */
    @JsonProperty("type")
    @ExcludeMissing
    fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): BookkeepingEntry = apply {
        if (!validated) {
          accountId()
          amount()
          createdAt()
          entrySetId()
          id()
          type()
          validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is BookkeepingEntry &&
          this.accountId == other.accountId &&
          this.amount == other.amount &&
          this.createdAt == other.createdAt &&
          this.entrySetId == other.entrySetId &&
          this.id == other.id &&
          this.type == other.type &&
          this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(
            accountId,
            amount,
            createdAt,
            entrySetId,
            id,
            type,
            additionalProperties,
        )
      }
      return hashCode
    }

    override fun toString() = "BookkeepingEntry{accountId=$accountId, amount=$amount, createdAt=$createdAt, entrySetId=$entrySetId, id=$id, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    class Builder {

        private var accountId: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var entrySetId: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bookkeepingEntry: BookkeepingEntry) = apply {
            this.accountId = bookkeepingEntry.accountId
            this.amount = bookkeepingEntry.amount
            this.createdAt = bookkeepingEntry.createdAt
            this.entrySetId = bookkeepingEntry.entrySetId
            this.id = bookkeepingEntry.id
            this.type = bookkeepingEntry.type
            additionalProperties(bookkeepingEntry.additionalProperties)
        }

        /** The identifier for the Account the Entry belongs to. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The identifier for the Account the Entry belongs to. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply {
            this.accountId = accountId
        }

        /**
         * The Entry amount in the minor unit of its currency. For dollars, for example,
         * this is cents.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * The Entry amount in the minor unit of its currency. For dollars, for example,
         * this is cents.
         */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply {
            this.amount = amount
        }

        /** When the entry set was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** When the entry set was created. */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
            this.createdAt = createdAt
        }

        /** The identifier for the Account the Entry belongs to. */
        fun entrySetId(entrySetId: String) = entrySetId(JsonField.of(entrySetId))

        /** The identifier for the Account the Entry belongs to. */
        @JsonProperty("entry_set_id")
        @ExcludeMissing
        fun entrySetId(entrySetId: JsonField<String>) = apply {
            this.entrySetId = entrySetId
        }

        /** The entry identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The entry identifier. */
        @JsonProperty("id")
        @ExcludeMissing
        fun id(id: JsonField<String>) = apply {
            this.id = id
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `bookkeeping_entry`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `bookkeeping_entry`.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply {
            this.type = type
        }

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

        fun build(): BookkeepingEntry = BookkeepingEntry(
            accountId,
            amount,
            createdAt,
            entrySetId,
            id,
            type,
            additionalProperties.toUnmodifiable(),
        )
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Type &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val BOOKKEEPING_ENTRY = Type(JsonField.of("bookkeeping_entry"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            BOOKKEEPING_ENTRY,
        }

        enum class Value {
            BOOKKEEPING_ENTRY,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            BOOKKEEPING_ENTRY -> Value.BOOKKEEPING_ENTRY
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            BOOKKEEPING_ENTRY -> Known.BOOKKEEPING_ENTRY
            else -> throw IncreaseInvalidDataException("Unknown Type: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
