// File generated from our OpenAPI spec by Stainless.

package com.sam.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.sam.api.core.ExcludeMissing
import com.sam.api.core.JsonValue
import com.sam.api.core.NoAutoDetect
import com.sam.api.core.http.Headers
import com.sam.api.core.http.QueryParams
import com.sam.api.core.toImmutable
import java.util.Objects
import java.util.Optional

class UserUpdateParams
constructor(
    private val pathUsername: String,
    private val id: Long?,
    private val email: String?,
    private val firstName: String?,
    private val lastName: String?,
    private val password: String?,
    private val phone: String?,
    private val bodyUsername: String?,
    private val userStatus: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun pathUsername(): String = pathUsername

    fun id(): Optional<Long> = Optional.ofNullable(id)

    fun email(): Optional<String> = Optional.ofNullable(email)

    fun firstName(): Optional<String> = Optional.ofNullable(firstName)

    fun lastName(): Optional<String> = Optional.ofNullable(lastName)

    fun password(): Optional<String> = Optional.ofNullable(password)

    fun phone(): Optional<String> = Optional.ofNullable(phone)

    fun bodyUsername(): Optional<String> = Optional.ofNullable(bodyUsername)

    fun userStatus(): Optional<Long> = Optional.ofNullable(userStatus)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): UserUpdateBody {
        return UserUpdateBody(
            id,
            email,
            firstName,
            lastName,
            password,
            phone,
            bodyUsername,
            userStatus,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> pathUsername
            else -> ""
        }
    }

    @JsonDeserialize(builder = UserUpdateBody.Builder::class)
    @NoAutoDetect
    class UserUpdateBody
    internal constructor(
        private val id: Long?,
        private val email: String?,
        private val firstName: String?,
        private val lastName: String?,
        private val password: String?,
        private val phone: String?,
        private val bodyUsername: String?,
        private val userStatus: Long?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("id") fun id(): Long? = id

        @JsonProperty("email") fun email(): String? = email

        @JsonProperty("firstName") fun firstName(): String? = firstName

        @JsonProperty("lastName") fun lastName(): String? = lastName

        @JsonProperty("password") fun password(): String? = password

        @JsonProperty("phone") fun phone(): String? = phone

        @JsonProperty("username") fun bodyUsername(): String? = bodyUsername

        /** User Status */
        @JsonProperty("userStatus") fun userStatus(): Long? = userStatus

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: Long? = null
            private var email: String? = null
            private var firstName: String? = null
            private var lastName: String? = null
            private var password: String? = null
            private var phone: String? = null
            private var bodyUsername: String? = null
            private var userStatus: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(userUpdateBody: UserUpdateBody) = apply {
                this.id = userUpdateBody.id
                this.email = userUpdateBody.email
                this.firstName = userUpdateBody.firstName
                this.lastName = userUpdateBody.lastName
                this.password = userUpdateBody.password
                this.phone = userUpdateBody.phone
                this.bodyUsername = userUpdateBody.bodyUsername
                this.userStatus = userUpdateBody.userStatus
                additionalProperties(userUpdateBody.additionalProperties)
            }

            @JsonProperty("id") fun id(id: Long) = apply { this.id = id }

            @JsonProperty("email") fun email(email: String) = apply { this.email = email }

            @JsonProperty("firstName")
            fun firstName(firstName: String) = apply { this.firstName = firstName }

            @JsonProperty("lastName")
            fun lastName(lastName: String) = apply { this.lastName = lastName }

            @JsonProperty("password")
            fun password(password: String) = apply { this.password = password }

            @JsonProperty("phone") fun phone(phone: String) = apply { this.phone = phone }

            @JsonProperty("username")
            fun bodyUsername(bodyUsername: String) = apply { this.bodyUsername = bodyUsername }

            /** User Status */
            @JsonProperty("userStatus")
            fun userStatus(userStatus: Long) = apply { this.userStatus = userStatus }

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

            fun build(): UserUpdateBody =
                UserUpdateBody(
                    id,
                    email,
                    firstName,
                    lastName,
                    password,
                    phone,
                    bodyUsername,
                    userStatus,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UserUpdateBody && id == other.id && email == other.email && firstName == other.firstName && lastName == other.lastName && password == other.password && phone == other.phone && bodyUsername == other.bodyUsername && userStatus == other.userStatus && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, email, firstName, lastName, password, phone, bodyUsername, userStatus, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UserUpdateBody{id=$id, email=$email, firstName=$firstName, lastName=$lastName, password=$password, phone=$phone, bodyUsername=$bodyUsername, userStatus=$userStatus, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var pathUsername: String? = null
        private var id: Long? = null
        private var email: String? = null
        private var firstName: String? = null
        private var lastName: String? = null
        private var password: String? = null
        private var phone: String? = null
        private var bodyUsername: String? = null
        private var userStatus: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(userUpdateParams: UserUpdateParams) = apply {
            pathUsername = userUpdateParams.pathUsername
            id = userUpdateParams.id
            email = userUpdateParams.email
            firstName = userUpdateParams.firstName
            lastName = userUpdateParams.lastName
            password = userUpdateParams.password
            phone = userUpdateParams.phone
            bodyUsername = userUpdateParams.bodyUsername
            userStatus = userUpdateParams.userStatus
            additionalHeaders = userUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = userUpdateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties = userUpdateParams.additionalBodyProperties.toMutableMap()
        }

        fun pathUsername(pathUsername: String) = apply { this.pathUsername = pathUsername }

        fun id(id: Long) = apply { this.id = id }

        fun email(email: String) = apply { this.email = email }

        fun firstName(firstName: String) = apply { this.firstName = firstName }

        fun lastName(lastName: String) = apply { this.lastName = lastName }

        fun password(password: String) = apply { this.password = password }

        fun phone(phone: String) = apply { this.phone = phone }

        fun bodyUsername(bodyUsername: String) = apply { this.bodyUsername = bodyUsername }

        /** User Status */
        fun userStatus(userStatus: Long) = apply { this.userStatus = userStatus }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): UserUpdateParams =
            UserUpdateParams(
                checkNotNull(pathUsername) { "`pathUsername` is required but was not set" },
                id,
                email,
                firstName,
                lastName,
                password,
                phone,
                bodyUsername,
                userStatus,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UserUpdateParams && pathUsername == other.pathUsername && id == other.id && email == other.email && firstName == other.firstName && lastName == other.lastName && password == other.password && phone == other.phone && bodyUsername == other.bodyUsername && userStatus == other.userStatus && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(pathUsername, id, email, firstName, lastName, password, phone, bodyUsername, userStatus, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "UserUpdateParams{pathUsername=$pathUsername, id=$id, email=$email, firstName=$firstName, lastName=$lastName, password=$password, phone=$phone, bodyUsername=$bodyUsername, userStatus=$userStatus, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}