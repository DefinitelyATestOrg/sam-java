// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import software.elborai.api.core.ExcludeMissing
import software.elborai.api.core.JsonValue
import software.elborai.api.core.NoAutoDetect
import software.elborai.api.core.toUnmodifiable
import software.elborai.api.models.*

class EntityBeneficialOwnerArchiveParams
constructor(
    private val beneficialOwnerId: String,
    private val entityId: String,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun beneficialOwnerId(): String = beneficialOwnerId

    fun entityId(): String = entityId

    @JvmSynthetic
    internal fun getBody(): EntityBeneficialOwnerArchiveBody {
        return EntityBeneficialOwnerArchiveBody(
            beneficialOwnerId,
            entityId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = EntityBeneficialOwnerArchiveBody.Builder::class)
    @NoAutoDetect
    class EntityBeneficialOwnerArchiveBody
    internal constructor(
        private val beneficialOwnerId: String?,
        private val entityId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * The identifying details of anyone controlling or owning 25% or more of the corporation.
         */
        @JsonProperty("beneficial_owner_id") fun beneficialOwnerId(): String? = beneficialOwnerId

        /** The identifier of the Entity to retrieve. */
        @JsonProperty("entity_id") fun entityId(): String? = entityId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EntityBeneficialOwnerArchiveBody &&
                this.beneficialOwnerId == other.beneficialOwnerId &&
                this.entityId == other.entityId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        beneficialOwnerId,
                        entityId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "EntityBeneficialOwnerArchiveBody{beneficialOwnerId=$beneficialOwnerId, entityId=$entityId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var beneficialOwnerId: String? = null
            private var entityId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(entityBeneficialOwnerArchiveBody: EntityBeneficialOwnerArchiveBody) =
                apply {
                    this.beneficialOwnerId = entityBeneficialOwnerArchiveBody.beneficialOwnerId
                    this.entityId = entityBeneficialOwnerArchiveBody.entityId
                    additionalProperties(entityBeneficialOwnerArchiveBody.additionalProperties)
                }

            /**
             * The identifying details of anyone controlling or owning 25% or more of the
             * corporation.
             */
            @JsonProperty("beneficial_owner_id")
            fun beneficialOwnerId(beneficialOwnerId: String) = apply {
                this.beneficialOwnerId = beneficialOwnerId
            }

            /** The identifier of the Entity to retrieve. */
            @JsonProperty("entity_id")
            fun entityId(entityId: String) = apply { this.entityId = entityId }

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

            fun build(): EntityBeneficialOwnerArchiveBody =
                EntityBeneficialOwnerArchiveBody(
                    checkNotNull(beneficialOwnerId) {
                        "`beneficialOwnerId` is required but was not set"
                    },
                    checkNotNull(entityId) { "`entityId` is required but was not set" },
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

        return other is EntityBeneficialOwnerArchiveParams &&
            this.beneficialOwnerId == other.beneficialOwnerId &&
            this.entityId == other.entityId &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            beneficialOwnerId,
            entityId,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "EntityBeneficialOwnerArchiveParams{beneficialOwnerId=$beneficialOwnerId, entityId=$entityId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var beneficialOwnerId: String? = null
        private var entityId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(entityBeneficialOwnerArchiveParams: EntityBeneficialOwnerArchiveParams) =
            apply {
                this.beneficialOwnerId = entityBeneficialOwnerArchiveParams.beneficialOwnerId
                this.entityId = entityBeneficialOwnerArchiveParams.entityId
                additionalQueryParams(entityBeneficialOwnerArchiveParams.additionalQueryParams)
                additionalHeaders(entityBeneficialOwnerArchiveParams.additionalHeaders)
                additionalBodyProperties(
                    entityBeneficialOwnerArchiveParams.additionalBodyProperties
                )
            }

        /**
         * The identifying details of anyone controlling or owning 25% or more of the corporation.
         */
        fun beneficialOwnerId(beneficialOwnerId: String) = apply {
            this.beneficialOwnerId = beneficialOwnerId
        }

        /** The identifier of the Entity to retrieve. */
        fun entityId(entityId: String) = apply { this.entityId = entityId }

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

        fun build(): EntityBeneficialOwnerArchiveParams =
            EntityBeneficialOwnerArchiveParams(
                checkNotNull(beneficialOwnerId) {
                    "`beneficialOwnerId` is required but was not set"
                },
                checkNotNull(entityId) { "`entityId` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
