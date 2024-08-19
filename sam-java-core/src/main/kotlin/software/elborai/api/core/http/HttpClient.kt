package software.elborai.api.core.http

import java.lang.AutoCloseable
import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions

interface HttpClient : AutoCloseable {

    fun execute(
        request: HttpRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    fun executeAsync(
        request: HttpRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>
}
