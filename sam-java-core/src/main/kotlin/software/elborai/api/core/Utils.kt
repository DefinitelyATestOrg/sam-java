@file:JvmName("Utils")

package software.elborai.api.core

import com.google.common.collect.ImmutableListMultimap
import com.google.common.collect.ListMultimap
import com.google.common.collect.Multimaps
import java.util.Collections
import software.elborai.api.errors.IncreaseInvalidDataException

@JvmSynthetic
internal fun <T : Any> T?.getOrThrow(name: String): T {
    if (this == null) {
        throw IncreaseInvalidDataException("'${name}' is not present")
    }

    return this
}

@JvmSynthetic
internal fun <T> List<T>.toUnmodifiable(): List<T> {
    if (isEmpty()) {
        return Collections.emptyList()
    }

    return Collections.unmodifiableList(this)
}

@JvmSynthetic
internal fun <K, V> Map<K, V>.toUnmodifiable(): Map<K, V> {
    if (isEmpty()) {
        return Collections.emptyMap()
    }

    return Collections.unmodifiableMap(this)
}

@JvmSynthetic
internal fun <K, V> ListMultimap<K, V>.toUnmodifiable(): ListMultimap<K, V> {
    if (isEmpty()) {
        return ImmutableListMultimap.of()
    }

    return Multimaps.unmodifiableListMultimap(this)
}

@JvmSynthetic
internal fun ListMultimap<String, String>.getRequiredHeader(header: String): String {
    val value =
        entries()
            .stream()
            .filter { entry -> entry.key.equals(header, ignoreCase = true) }
            .map { entry -> entry.value }
            .findFirst()
    if (!value.isPresent) {
        throw IncreaseInvalidDataException("Could not find $header header")
    }
    return value.get()
}

internal interface Enum
