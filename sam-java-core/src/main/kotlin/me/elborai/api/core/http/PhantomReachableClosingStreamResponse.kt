package me.elborai.api.core.http

import me.elborai.api.core.closeWhenPhantomReachable
import java.util.stream.Stream

/**
 * A delegating wrapper around a `StreamResponse` that closes it once it's only phantom reachable.
 *
 * This class ensures the `StreamResponse` is closed even if the user forgets to close it.
 */
internal class PhantomReachableClosingStreamResponse<T>(
    private val streamResponse: StreamResponse<T>
) : StreamResponse<T> {
    init {
        closeWhenPhantomReachable(this, streamResponse)
    }

    override fun stream(): Stream<T> = streamResponse.stream()

    override fun close() = streamResponse.close()
}
