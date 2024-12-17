// File generated from our OpenAPI spec by Stainless.

package me.elborai.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import me.elborai.api.core.Enum
import me.elborai.api.core.ExcludeMissing
import me.elborai.api.core.JsonField
import me.elborai.api.core.JsonMissing
import me.elborai.api.core.JsonValue
import me.elborai.api.core.NoAutoDetect
import me.elborai.api.core.toImmutable
import me.elborai.api.errors.SamInvalidDataException

@JsonDeserialize(builder = CoolOrder.Builder::class)
@NoAutoDetect
class CoolOrder
private constructor(
    private val id: JsonField<Long>,
    private val petId: JsonField<Long>,
    private val quantity: JsonField<Long>,
    private val shipDate: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val complete: JsonField<Boolean>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun id(): Optional<Long> = Optional.ofNullable(id.getNullable("id"))

    fun petId(): Optional<Long> = Optional.ofNullable(petId.getNullable("petId"))

    fun quantity(): Optional<Long> = Optional.ofNullable(quantity.getNullable("quantity"))

    fun shipDate(): Optional<OffsetDateTime> = Optional.ofNullable(shipDate.getNullable("shipDate"))

    /** Order Status */
    fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

    fun complete(): Optional<Boolean> = Optional.ofNullable(complete.getNullable("complete"))

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("petId") @ExcludeMissing fun _petId() = petId

    @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

    @JsonProperty("shipDate") @ExcludeMissing fun _shipDate() = shipDate

    /** Order Status */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    @JsonProperty("complete") @ExcludeMissing fun _complete() = complete

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CoolOrder = apply {
        if (!validated) {
            id()
            petId()
            quantity()
            shipDate()
            status()
            complete()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<Long> = JsonMissing.of()
        private var petId: JsonField<Long> = JsonMissing.of()
        private var quantity: JsonField<Long> = JsonMissing.of()
        private var shipDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var complete: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(coolOrder: CoolOrder) = apply {
            this.id = coolOrder.id
            this.petId = coolOrder.petId
            this.quantity = coolOrder.quantity
            this.shipDate = coolOrder.shipDate
            this.status = coolOrder.status
            this.complete = coolOrder.complete
            additionalProperties(coolOrder.additionalProperties)
        }

        fun id(id: Long) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<Long>) = apply { this.id = id }

        fun petId(petId: Long) = petId(JsonField.of(petId))

        @JsonProperty("petId")
        @ExcludeMissing
        fun petId(petId: JsonField<Long>) = apply { this.petId = petId }

        fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

        @JsonProperty("quantity")
        @ExcludeMissing
        fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

        fun shipDate(shipDate: OffsetDateTime) = shipDate(JsonField.of(shipDate))

        @JsonProperty("shipDate")
        @ExcludeMissing
        fun shipDate(shipDate: JsonField<OffsetDateTime>) = apply { this.shipDate = shipDate }

        /** Order Status */
        fun status(status: Status) = status(JsonField.of(status))

        /** Order Status */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun complete(complete: Boolean) = complete(JsonField.of(complete))

        @JsonProperty("complete")
        @ExcludeMissing
        fun complete(complete: JsonField<Boolean>) = apply { this.complete = complete }

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

        fun build(): CoolOrder =
            CoolOrder(
                id,
                petId,
                quantity,
                shipDate,
                status,
                complete,
                additionalProperties.toImmutable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PLACED = of("placed")

            @JvmField val APPROVED = of("approved")

            @JvmField val DELIVERED = of("delivered")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PLACED,
            APPROVED,
            DELIVERED,
        }

        enum class Value {
            PLACED,
            APPROVED,
            DELIVERED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PLACED -> Value.PLACED
                APPROVED -> Value.APPROVED
                DELIVERED -> Value.DELIVERED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PLACED -> Known.PLACED
                APPROVED -> Known.APPROVED
                DELIVERED -> Known.DELIVERED
                else -> throw SamInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CoolOrder && id == other.id && petId == other.petId && quantity == other.quantity && shipDate == other.shipDate && status == other.status && complete == other.complete && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, petId, quantity, shipDate, status, complete, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CoolOrder{id=$id, petId=$petId, quantity=$quantity, shipDate=$shipDate, status=$status, complete=$complete, additionalProperties=$additionalProperties}"
}