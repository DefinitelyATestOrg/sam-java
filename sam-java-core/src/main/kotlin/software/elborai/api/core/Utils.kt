@file:JvmName("Utils")

package software.elborai.api.core

import com.google.common.collect.ImmutableListMultimap
import com.google.common.collect.ListMultimap
import java.util.Collections
import java.util.SortedMap
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
internal fun <K : Comparable<K>, V> SortedMap<K, V>.toImmutable(): SortedMap<K, V> =
    if (isEmpty()) Collections.emptySortedMap()
    else Collections.unmodifiableSortedMap(toSortedMap(comparator()))

@JvmSynthetic
internal fun <K, V> ListMultimap<K, V>.toImmutable(): ListMultimap<K, V> =
    ImmutableListMultimap.copyOf(this)

internal interface Enum
