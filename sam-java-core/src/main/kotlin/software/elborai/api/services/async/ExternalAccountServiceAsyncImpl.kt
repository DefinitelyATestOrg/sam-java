// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.ClientOptions
import software.elborai.api.core.RequestOptions
import software.elborai.api.core.http.HttpMethod
import software.elborai.api.core.http.HttpRequest
import software.elborai.api.core.http.HttpResponse.Handler
import software.elborai.api.errors.IncreaseError
import software.elborai.api.models.ExternalAccount
import software.elborai.api.models.ExternalAccountCreateParams
import software.elborai.api.models.ExternalAccountListPageAsync
import software.elborai.api.models.ExternalAccountListParams
import software.elborai.api.models.ExternalAccountRetrieveParams
import software.elborai.api.models.ExternalAccountUpdateParams
import software.elborai.api.services.errorHandler
import software.elborai.api.services.json
import software.elborai.api.services.jsonHandler
import software.elborai.api.services.withErrorHandler

class ExternalAccountServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ExternalAccountServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ExternalAccount> =
        jsonHandler<ExternalAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create an External Account */
    override fun create(
        params: ExternalAccountCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ExternalAccount> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("external_accounts")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<ExternalAccount> =
        jsonHandler<ExternalAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve an External Account */
    override fun retrieve(
        params: ExternalAccountRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ExternalAccount> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("external_accounts", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<ExternalAccount> =
        jsonHandler<ExternalAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update an External Account */
    override fun update(
        params: ExternalAccountUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ExternalAccount> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("external_accounts", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<ExternalAccountListPageAsync.Response> =
        jsonHandler<ExternalAccountListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List External Accounts */
    override fun list(
        params: ExternalAccountListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ExternalAccountListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("external_accounts")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { ExternalAccountListPageAsync.of(this, params, it) }
        }
    }
}
