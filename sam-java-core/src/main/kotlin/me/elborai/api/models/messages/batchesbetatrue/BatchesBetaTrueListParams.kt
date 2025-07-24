// File generated from our OpenAPI spec by Stainless.

package me.elborai.api.models.messages.batchesbetatrue

import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull
import me.elborai.api.core.Params
import me.elborai.api.core.http.Headers
import me.elborai.api.core.http.QueryParams
import me.elborai.api.core.toImmutable

/**
 * List all Message Batches within a Workspace. Most recently created batches are returned first.
 *
 * Learn more about the Message Batches API in our
 * [user guide](/en/docs/build-with-claude/batch-processing)
 */
class BatchesBetaTrueListParams
private constructor(
    private val afterId: String?,
    private val beforeId: String?,
    private val limit: Long?,
    private val anthropicBeta: List<String>?,
    private val anthropicVersion: String?,
    private val xApiKey: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * ID of the object to use as a cursor for pagination. When provided, returns the page of
     * results immediately after this object.
     */
    fun afterId(): Optional<String> = Optional.ofNullable(afterId)

    /**
     * ID of the object to use as a cursor for pagination. When provided, returns the page of
     * results immediately before this object.
     */
    fun beforeId(): Optional<String> = Optional.ofNullable(beforeId)

    /**
     * Number of items to return per page.
     *
     * Defaults to `20`. Ranges from `1` to `1000`.
     */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /**
     * Optional header to specify the beta version(s) you want to use.
     *
     * To use multiple betas, use a comma separated list like `beta1,beta2` or specify the header
     * multiple times for each beta.
     */
    fun anthropicBeta(): Optional<List<String>> = Optional.ofNullable(anthropicBeta)

    /**
     * The version of the Anthropic API you want to use.
     *
     * Read more about versioning and our version history
     * [here](https://docs.anthropic.com/en/api/versioning).
     */
    fun anthropicVersion(): Optional<String> = Optional.ofNullable(anthropicVersion)

    /**
     * Your unique API key for authentication.
     *
     * This key is required in the header of all API requests, to authenticate your account and
     * access Anthropic's services. Get your API key through the
     * [Console](https://console.anthropic.com/settings/keys). Each key is scoped to a Workspace.
     */
    fun xApiKey(): Optional<String> = Optional.ofNullable(xApiKey)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): BatchesBetaTrueListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [BatchesBetaTrueListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BatchesBetaTrueListParams]. */
    class Builder internal constructor() {

        private var afterId: String? = null
        private var beforeId: String? = null
        private var limit: Long? = null
        private var anthropicBeta: MutableList<String>? = null
        private var anthropicVersion: String? = null
        private var xApiKey: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(batchesBetaTrueListParams: BatchesBetaTrueListParams) = apply {
            afterId = batchesBetaTrueListParams.afterId
            beforeId = batchesBetaTrueListParams.beforeId
            limit = batchesBetaTrueListParams.limit
            anthropicBeta = batchesBetaTrueListParams.anthropicBeta?.toMutableList()
            anthropicVersion = batchesBetaTrueListParams.anthropicVersion
            xApiKey = batchesBetaTrueListParams.xApiKey
            additionalHeaders = batchesBetaTrueListParams.additionalHeaders.toBuilder()
            additionalQueryParams = batchesBetaTrueListParams.additionalQueryParams.toBuilder()
        }

        /**
         * ID of the object to use as a cursor for pagination. When provided, returns the page of
         * results immediately after this object.
         */
        fun afterId(afterId: String?) = apply { this.afterId = afterId }

        /** Alias for calling [Builder.afterId] with `afterId.orElse(null)`. */
        fun afterId(afterId: Optional<String>) = afterId(afterId.getOrNull())

        /**
         * ID of the object to use as a cursor for pagination. When provided, returns the page of
         * results immediately before this object.
         */
        fun beforeId(beforeId: String?) = apply { this.beforeId = beforeId }

        /** Alias for calling [Builder.beforeId] with `beforeId.orElse(null)`. */
        fun beforeId(beforeId: Optional<String>) = beforeId(beforeId.getOrNull())

        /**
         * Number of items to return per page.
         *
         * Defaults to `20`. Ranges from `1` to `1000`.
         */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /**
         * Optional header to specify the beta version(s) you want to use.
         *
         * To use multiple betas, use a comma separated list like `beta1,beta2` or specify the
         * header multiple times for each beta.
         */
        fun anthropicBeta(anthropicBeta: List<String>?) = apply {
            this.anthropicBeta = anthropicBeta?.toMutableList()
        }

        /** Alias for calling [Builder.anthropicBeta] with `anthropicBeta.orElse(null)`. */
        fun anthropicBeta(anthropicBeta: Optional<List<String>>) =
            anthropicBeta(anthropicBeta.getOrNull())

        /**
         * Adds a single [String] to [Builder.anthropicBeta].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAnthropicBeta(anthropicBeta: String) = apply {
            this.anthropicBeta =
                (this.anthropicBeta ?: mutableListOf()).apply { add(anthropicBeta) }
        }

        /**
         * The version of the Anthropic API you want to use.
         *
         * Read more about versioning and our version history
         * [here](https://docs.anthropic.com/en/api/versioning).
         */
        fun anthropicVersion(anthropicVersion: String?) = apply {
            this.anthropicVersion = anthropicVersion
        }

        /** Alias for calling [Builder.anthropicVersion] with `anthropicVersion.orElse(null)`. */
        fun anthropicVersion(anthropicVersion: Optional<String>) =
            anthropicVersion(anthropicVersion.getOrNull())

        /**
         * Your unique API key for authentication.
         *
         * This key is required in the header of all API requests, to authenticate your account and
         * access Anthropic's services. Get your API key through the
         * [Console](https://console.anthropic.com/settings/keys). Each key is scoped to a
         * Workspace.
         */
        fun xApiKey(xApiKey: String?) = apply { this.xApiKey = xApiKey }

        /** Alias for calling [Builder.xApiKey] with `xApiKey.orElse(null)`. */
        fun xApiKey(xApiKey: Optional<String>) = xApiKey(xApiKey.getOrNull())

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

        /**
         * Returns an immutable instance of [BatchesBetaTrueListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BatchesBetaTrueListParams =
            BatchesBetaTrueListParams(
                afterId,
                beforeId,
                limit,
                anthropicBeta?.toImmutable(),
                anthropicVersion,
                xApiKey,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                anthropicBeta?.forEach { put("anthropic-beta", it) }
                anthropicVersion?.let { put("anthropic-version", it) }
                xApiKey?.let { put("x-api-key", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                afterId?.let { put("after_id", it) }
                beforeId?.let { put("before_id", it) }
                limit?.let { put("limit", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BatchesBetaTrueListParams && afterId == other.afterId && beforeId == other.beforeId && limit == other.limit && anthropicBeta == other.anthropicBeta && anthropicVersion == other.anthropicVersion && xApiKey == other.xApiKey && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(afterId, beforeId, limit, anthropicBeta, anthropicVersion, xApiKey, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BatchesBetaTrueListParams{afterId=$afterId, beforeId=$beforeId, limit=$limit, anthropicBeta=$anthropicBeta, anthropicVersion=$anthropicVersion, xApiKey=$xApiKey, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
