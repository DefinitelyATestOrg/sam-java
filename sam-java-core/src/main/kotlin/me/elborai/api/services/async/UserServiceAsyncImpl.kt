// File generated from our OpenAPI spec by Stainless.

package me.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import me.elborai.api.core.ClientOptions
import me.elborai.api.core.RequestOptions
import me.elborai.api.core.handlers.emptyHandler
import me.elborai.api.core.handlers.errorHandler
import me.elborai.api.core.handlers.jsonHandler
import me.elborai.api.core.handlers.stringHandler
import me.elborai.api.core.handlers.withErrorHandler
import me.elborai.api.core.http.HttpMethod
import me.elborai.api.core.http.HttpRequest
import me.elborai.api.core.http.HttpResponse
import me.elborai.api.core.http.HttpResponse.Handler
import me.elborai.api.core.http.HttpResponseFor
import me.elborai.api.core.http.json
import me.elborai.api.core.http.parseable
import me.elborai.api.core.prepareAsync
import me.elborai.api.errors.SamError
import me.elborai.api.models.User
import me.elborai.api.models.UserCreateListParams
import me.elborai.api.models.UserCreateParams
import me.elborai.api.models.UserDeleteParams
import me.elborai.api.models.UserLoginParams
import me.elborai.api.models.UserLogoutParams
import me.elborai.api.models.UserRetrieveParams
import me.elborai.api.models.UserUpdateParams

class UserServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UserServiceAsync {

    private val withRawResponse: UserServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UserServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: UserCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<User> =
        // post /user
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<User> =
        // get /user/{username}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /user/{username}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun delete(
        params: UserDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /user/{username}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun createList(
        params: UserCreateListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<User> =
        // post /user/createWithList
        withRawResponse().createList(params, requestOptions).thenApply { it.parse() }

    override fun login(
        params: UserLoginParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /user/login
        withRawResponse().login(params, requestOptions).thenApply { it.parse() }

    override fun logout(
        params: UserLogoutParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /user/logout
        withRawResponse().logout(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserServiceAsync.WithRawResponse {

        private val errorHandler: Handler<SamError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<User> =
            jsonHandler<User>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: UserCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<User>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("user")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<User> =
            jsonHandler<User>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<User>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("user", params.getPathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("user", params.getPathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { updateHandler.handle(it) } }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun delete(
            params: UserDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("user", params.getPathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { deleteHandler.handle(it) } }
                }
        }

        private val createListHandler: Handler<User> =
            jsonHandler<User>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun createList(
            params: UserCreateListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<User>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("user", "createWithList")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createListHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val loginHandler: Handler<String> = stringHandler().withErrorHandler(errorHandler)

        override fun login(
            params: UserLoginParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("user", "login")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { loginHandler.handle(it) } }
                }
        }

        private val logoutHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun logout(
            params: UserLogoutParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("user", "logout")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { logoutHandler.handle(it) } }
                }
        }
    }
}
