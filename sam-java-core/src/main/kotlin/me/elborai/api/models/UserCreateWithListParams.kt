// File generated from our OpenAPI spec by Stainless.

package me.elborai.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import me.elborai.api.core.NoAutoDetect
import me.elborai.api.core.http.Headers
import me.elborai.api.core.http.QueryParams
import me.elborai.api.core.toImmutable

class UserCreateWithListParams
constructor(
    private val body: List<User>,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun body(): List<User> = body

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic
    internal fun getBody(): List<User> {
        return body
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class UserCreateWithListBody
    @JsonCreator
    internal constructor(
        @JsonProperty("body") private val body: List<User>,
    ) {

        @JsonProperty("body") fun body(): List<User> = body

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var body: List<User>? = null

            @JvmSynthetic
            internal fun from(userCreateWithListBody: UserCreateWithListBody) = apply {
                body = userCreateWithListBody.body.toMutableList()
            }

            fun body(body: List<User>) = apply { this.body = body }

            fun build(): UserCreateWithListBody =
                UserCreateWithListBody(
                    checkNotNull(body) { "`body` is required but was not set" }.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UserCreateWithListBody && body == other.body /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(body) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "UserCreateWithListBody{body=$body}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: MutableList<User> = mutableListOf()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(userCreateWithListParams: UserCreateWithListParams) = apply {
            body = userCreateWithListParams.body.toMutableList()
            additionalHeaders = userCreateWithListParams.additionalHeaders.toBuilder()
            additionalQueryParams = userCreateWithListParams.additionalQueryParams.toBuilder()
        }

        fun body(body: List<User>) = apply {
            this.body.clear()
            this.body.addAll(body)
        }

        fun addBody(body: User) = apply { this.body.add(body) }

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

        fun build(): UserCreateWithListParams =
            UserCreateWithListParams(
                body.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UserCreateWithListParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "UserCreateWithListParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
