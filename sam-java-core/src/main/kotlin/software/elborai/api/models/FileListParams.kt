// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import software.elborai.api.core.Enum
import software.elborai.api.core.JsonField
import software.elborai.api.core.JsonValue
import software.elborai.api.core.NoAutoDetect
import software.elborai.api.core.toUnmodifiable
import software.elborai.api.errors.IncreaseInvalidDataException
import software.elborai.api.models.*

class FileListParams
constructor(
    private val createdAt: CreatedAt?,
    private val cursor: String?,
    private val idempotencyKey: String?,
    private val limit: Long?,
    private val purpose: Purpose?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun createdAt(): Optional<CreatedAt> = Optional.ofNullable(createdAt)

    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    fun idempotencyKey(): Optional<String> = Optional.ofNullable(idempotencyKey)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun purpose(): Optional<Purpose> = Optional.ofNullable(purpose)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.createdAt?.forEachQueryParam { key, values -> params.put("created_at.$key", values) }
        this.cursor?.let { params.put("cursor", listOf(it.toString())) }
        this.idempotencyKey?.let { params.put("idempotency_key", listOf(it.toString())) }
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.purpose?.forEachQueryParam { key, values -> params.put("purpose.$key", values) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileListParams &&
            this.createdAt == other.createdAt &&
            this.cursor == other.cursor &&
            this.idempotencyKey == other.idempotencyKey &&
            this.limit == other.limit &&
            this.purpose == other.purpose &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            createdAt,
            cursor,
            idempotencyKey,
            limit,
            purpose,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "FileListParams{createdAt=$createdAt, cursor=$cursor, idempotencyKey=$idempotencyKey, limit=$limit, purpose=$purpose, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var createdAt: CreatedAt? = null
        private var cursor: String? = null
        private var idempotencyKey: String? = null
        private var limit: Long? = null
        private var purpose: Purpose? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fileListParams: FileListParams) = apply {
            this.createdAt = fileListParams.createdAt
            this.cursor = fileListParams.cursor
            this.idempotencyKey = fileListParams.idempotencyKey
            this.limit = fileListParams.limit
            this.purpose = fileListParams.purpose
            additionalQueryParams(fileListParams.additionalQueryParams)
            additionalHeaders(fileListParams.additionalHeaders)
            additionalBodyProperties(fileListParams.additionalBodyProperties)
        }

        fun createdAt(createdAt: CreatedAt) = apply { this.createdAt = createdAt }

        /** Return the page of entries after this one. */
        fun cursor(cursor: String) = apply { this.cursor = cursor }

        /**
         * Filter records to the one with the specified `idempotency_key` you chose for that object.
         * This value is unique across Increase and is used to ensure that a request is only
         * processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String) = apply { this.idempotencyKey = idempotencyKey }

        /**
         * Limit the size of the list that is returned. The default (and maximum) is 100 objects.
         */
        fun limit(limit: Long) = apply { this.limit = limit }

        fun purpose(purpose: Purpose) = apply { this.purpose = purpose }

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

        fun build(): FileListParams =
            FileListParams(
                createdAt,
                cursor,
                idempotencyKey,
                limit,
                purpose,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = CreatedAt.Builder::class)
    @NoAutoDetect
    class CreatedAt
    private constructor(
        private val after: OffsetDateTime?,
        private val before: OffsetDateTime?,
        private val onOrAfter: OffsetDateTime?,
        private val onOrBefore: OffsetDateTime?,
        private val additionalProperties: Map<String, List<String>>,
    ) {

        private var hashCode: Int = 0

        /**
         * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
         */
        fun after(): OffsetDateTime? = after

        /**
         * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
         */
        fun before(): OffsetDateTime? = before

        /**
         * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
         * timestamp.
         */
        fun onOrAfter(): OffsetDateTime? = onOrAfter

        /**
         * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
         * timestamp.
         */
        fun onOrBefore(): OffsetDateTime? = onOrBefore

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        @JvmSynthetic
        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.after?.let { putParam("after", listOf(it.toString())) }
            this.before?.let { putParam("before", listOf(it.toString())) }
            this.onOrAfter?.let { putParam("on_or_after", listOf(it.toString())) }
            this.onOrBefore?.let { putParam("on_or_before", listOf(it.toString())) }
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreatedAt &&
                this.after == other.after &&
                this.before == other.before &&
                this.onOrAfter == other.onOrAfter &&
                this.onOrBefore == other.onOrBefore &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        after,
                        before,
                        onOrAfter,
                        onOrBefore,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CreatedAt{after=$after, before=$before, onOrAfter=$onOrAfter, onOrBefore=$onOrBefore, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var after: OffsetDateTime? = null
            private var before: OffsetDateTime? = null
            private var onOrAfter: OffsetDateTime? = null
            private var onOrBefore: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            @JvmSynthetic
            internal fun from(createdAt: CreatedAt) = apply {
                this.after = createdAt.after
                this.before = createdAt.before
                this.onOrAfter = createdAt.onOrAfter
                this.onOrBefore = createdAt.onOrBefore
                additionalProperties(createdAt.additionalProperties)
            }

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun after(after: OffsetDateTime) = apply { this.after = after }

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun before(before: OffsetDateTime) = apply { this.before = before }

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrAfter(onOrAfter: OffsetDateTime) = apply { this.onOrAfter = onOrAfter }

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrBefore(onOrBefore: OffsetDateTime) = apply { this.onOrBefore = onOrBefore }

            fun additionalProperties(additionalProperties: Map<String, List<String>>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: List<String>) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, List<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun build(): CreatedAt =
                CreatedAt(
                    after,
                    before,
                    onOrAfter,
                    onOrBefore,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    @JsonDeserialize(builder = Purpose.Builder::class)
    @NoAutoDetect
    class Purpose
    private constructor(
        private val in_: List<In>?,
        private val additionalProperties: Map<String, List<String>>,
    ) {

        private var hashCode: Int = 0

        /**
         * Filter Files for those with the specified purpose or purposes. For GET requests, this
         * should be encoded as a comma-delimited string, such as `?in=one,two,three`.
         */
        fun in_(): List<In>? = in_

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        @JvmSynthetic
        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.in_?.let { putParam("in", listOf(it.joinToString(separator = ","))) }
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Purpose &&
                this.in_ == other.in_ &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(in_, additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Purpose{in_=$in_, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var in_: List<In>? = null
            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            @JvmSynthetic
            internal fun from(purpose: Purpose) = apply {
                this.in_ = purpose.in_
                additionalProperties(purpose.additionalProperties)
            }

            /**
             * Filter Files for those with the specified purpose or purposes. For GET requests, this
             * should be encoded as a comma-delimited string, such as `?in=one,two,three`.
             */
            fun in_(in_: List<In>) = apply { this.in_ = in_ }

            fun additionalProperties(additionalProperties: Map<String, List<String>>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: List<String>) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, List<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun build(): Purpose =
                Purpose(in_?.toUnmodifiable(), additionalProperties.toUnmodifiable())
        }

        class In
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is In && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val CHECK_IMAGE_FRONT = In(JsonField.of("check_image_front"))

                @JvmField val CHECK_IMAGE_BACK = In(JsonField.of("check_image_back"))

                @JvmField
                val PROCESSED_CHECK_IMAGE_FRONT = In(JsonField.of("processed_check_image_front"))

                @JvmField
                val PROCESSED_CHECK_IMAGE_BACK = In(JsonField.of("processed_check_image_back"))

                @JvmField val MAILED_CHECK_IMAGE = In(JsonField.of("mailed_check_image"))

                @JvmField val INBOUND_MAIL_ITEM = In(JsonField.of("inbound_mail_item"))

                @JvmField val FORM_1099_INT = In(JsonField.of("form_1099_int"))

                @JvmField val FORM_SS_4 = In(JsonField.of("form_ss_4"))

                @JvmField val IDENTITY_DOCUMENT = In(JsonField.of("identity_document"))

                @JvmField val INCREASE_STATEMENT = In(JsonField.of("increase_statement"))

                @JvmField val OTHER = In(JsonField.of("other"))

                @JvmField
                val TRUST_FORMATION_DOCUMENT = In(JsonField.of("trust_formation_document"))

                @JvmField val DIGITAL_WALLET_ARTWORK = In(JsonField.of("digital_wallet_artwork"))

                @JvmField val DIGITAL_WALLET_APP_ICON = In(JsonField.of("digital_wallet_app_icon"))

                @JvmField val PHYSICAL_CARD_FRONT = In(JsonField.of("physical_card_front"))

                @JvmField val PHYSICAL_CARD_BACK = In(JsonField.of("physical_card_back"))

                @JvmField val PHYSICAL_CARD_CARRIER = In(JsonField.of("physical_card_carrier"))

                @JvmField val DOCUMENT_REQUEST = In(JsonField.of("document_request"))

                @JvmField
                val ENTITY_SUPPLEMENTAL_DOCUMENT = In(JsonField.of("entity_supplemental_document"))

                @JvmField val EXPORT = In(JsonField.of("export"))

                @JvmField
                val UNUSUAL_ACTIVITY_REPORT_ATTACHMENT =
                    In(JsonField.of("unusual_activity_report_attachment"))

                @JvmStatic fun of(value: String) = In(JsonField.of(value))
            }

            enum class Known {
                CHECK_IMAGE_FRONT,
                CHECK_IMAGE_BACK,
                PROCESSED_CHECK_IMAGE_FRONT,
                PROCESSED_CHECK_IMAGE_BACK,
                MAILED_CHECK_IMAGE,
                INBOUND_MAIL_ITEM,
                FORM_1099_INT,
                FORM_SS_4,
                IDENTITY_DOCUMENT,
                INCREASE_STATEMENT,
                OTHER,
                TRUST_FORMATION_DOCUMENT,
                DIGITAL_WALLET_ARTWORK,
                DIGITAL_WALLET_APP_ICON,
                PHYSICAL_CARD_FRONT,
                PHYSICAL_CARD_BACK,
                PHYSICAL_CARD_CARRIER,
                DOCUMENT_REQUEST,
                ENTITY_SUPPLEMENTAL_DOCUMENT,
                EXPORT,
                UNUSUAL_ACTIVITY_REPORT_ATTACHMENT,
            }

            enum class Value {
                CHECK_IMAGE_FRONT,
                CHECK_IMAGE_BACK,
                PROCESSED_CHECK_IMAGE_FRONT,
                PROCESSED_CHECK_IMAGE_BACK,
                MAILED_CHECK_IMAGE,
                INBOUND_MAIL_ITEM,
                FORM_1099_INT,
                FORM_SS_4,
                IDENTITY_DOCUMENT,
                INCREASE_STATEMENT,
                OTHER,
                TRUST_FORMATION_DOCUMENT,
                DIGITAL_WALLET_ARTWORK,
                DIGITAL_WALLET_APP_ICON,
                PHYSICAL_CARD_FRONT,
                PHYSICAL_CARD_BACK,
                PHYSICAL_CARD_CARRIER,
                DOCUMENT_REQUEST,
                ENTITY_SUPPLEMENTAL_DOCUMENT,
                EXPORT,
                UNUSUAL_ACTIVITY_REPORT_ATTACHMENT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CHECK_IMAGE_FRONT -> Value.CHECK_IMAGE_FRONT
                    CHECK_IMAGE_BACK -> Value.CHECK_IMAGE_BACK
                    PROCESSED_CHECK_IMAGE_FRONT -> Value.PROCESSED_CHECK_IMAGE_FRONT
                    PROCESSED_CHECK_IMAGE_BACK -> Value.PROCESSED_CHECK_IMAGE_BACK
                    MAILED_CHECK_IMAGE -> Value.MAILED_CHECK_IMAGE
                    INBOUND_MAIL_ITEM -> Value.INBOUND_MAIL_ITEM
                    FORM_1099_INT -> Value.FORM_1099_INT
                    FORM_SS_4 -> Value.FORM_SS_4
                    IDENTITY_DOCUMENT -> Value.IDENTITY_DOCUMENT
                    INCREASE_STATEMENT -> Value.INCREASE_STATEMENT
                    OTHER -> Value.OTHER
                    TRUST_FORMATION_DOCUMENT -> Value.TRUST_FORMATION_DOCUMENT
                    DIGITAL_WALLET_ARTWORK -> Value.DIGITAL_WALLET_ARTWORK
                    DIGITAL_WALLET_APP_ICON -> Value.DIGITAL_WALLET_APP_ICON
                    PHYSICAL_CARD_FRONT -> Value.PHYSICAL_CARD_FRONT
                    PHYSICAL_CARD_BACK -> Value.PHYSICAL_CARD_BACK
                    PHYSICAL_CARD_CARRIER -> Value.PHYSICAL_CARD_CARRIER
                    DOCUMENT_REQUEST -> Value.DOCUMENT_REQUEST
                    ENTITY_SUPPLEMENTAL_DOCUMENT -> Value.ENTITY_SUPPLEMENTAL_DOCUMENT
                    EXPORT -> Value.EXPORT
                    UNUSUAL_ACTIVITY_REPORT_ATTACHMENT -> Value.UNUSUAL_ACTIVITY_REPORT_ATTACHMENT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CHECK_IMAGE_FRONT -> Known.CHECK_IMAGE_FRONT
                    CHECK_IMAGE_BACK -> Known.CHECK_IMAGE_BACK
                    PROCESSED_CHECK_IMAGE_FRONT -> Known.PROCESSED_CHECK_IMAGE_FRONT
                    PROCESSED_CHECK_IMAGE_BACK -> Known.PROCESSED_CHECK_IMAGE_BACK
                    MAILED_CHECK_IMAGE -> Known.MAILED_CHECK_IMAGE
                    INBOUND_MAIL_ITEM -> Known.INBOUND_MAIL_ITEM
                    FORM_1099_INT -> Known.FORM_1099_INT
                    FORM_SS_4 -> Known.FORM_SS_4
                    IDENTITY_DOCUMENT -> Known.IDENTITY_DOCUMENT
                    INCREASE_STATEMENT -> Known.INCREASE_STATEMENT
                    OTHER -> Known.OTHER
                    TRUST_FORMATION_DOCUMENT -> Known.TRUST_FORMATION_DOCUMENT
                    DIGITAL_WALLET_ARTWORK -> Known.DIGITAL_WALLET_ARTWORK
                    DIGITAL_WALLET_APP_ICON -> Known.DIGITAL_WALLET_APP_ICON
                    PHYSICAL_CARD_FRONT -> Known.PHYSICAL_CARD_FRONT
                    PHYSICAL_CARD_BACK -> Known.PHYSICAL_CARD_BACK
                    PHYSICAL_CARD_CARRIER -> Known.PHYSICAL_CARD_CARRIER
                    DOCUMENT_REQUEST -> Known.DOCUMENT_REQUEST
                    ENTITY_SUPPLEMENTAL_DOCUMENT -> Known.ENTITY_SUPPLEMENTAL_DOCUMENT
                    EXPORT -> Known.EXPORT
                    UNUSUAL_ACTIVITY_REPORT_ATTACHMENT -> Known.UNUSUAL_ACTIVITY_REPORT_ATTACHMENT
                    else -> throw IncreaseInvalidDataException("Unknown In: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }
}
