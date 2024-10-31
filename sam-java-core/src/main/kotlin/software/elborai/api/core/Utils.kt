@file:JvmName("Utils")

package software.elborai.api.core

import com.google.common.collect.ImmutableListMultimap
import com.google.common.collect.ListMultimap
import java.util.Collections
import software.elborai.api.errors.SamInvalidDataException

@JvmSynthetic
internal fun <T : Any> T?.getOrThrow(name: String): T =
    this ?: throw SamInvalidDataException("`${name}` is not present")

@JvmSynthetic
internal fun <T> List<T>.toImmutable(): List<T> =
    if (isEmpty()) Collections.emptyList() else Collections.unmodifiableList(toList())

@JvmSynthetic
internal fun <K, V> Map<K, V>.toImmutable(): Map<K, V> =
    if (isEmpty()) Collections.emptyMap() else Collections.unmodifiableMap(toMap())

@JvmSynthetic
internal fun <K, V> ListMultimap<K, V>.toImmutable(): ListMultimap<K, V> =
    ImmutableListMultimap.copyOf(this)

internal interface Enum
