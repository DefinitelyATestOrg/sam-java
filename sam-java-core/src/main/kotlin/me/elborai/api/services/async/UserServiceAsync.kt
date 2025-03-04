// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package me.elborai.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import me.elborai.api.core.RequestOptions
import me.elborai.api.core.http.HttpResponse
import me.elborai.api.core.http.HttpResponseFor
import me.elborai.api.models.User
import me.elborai.api.models.UserCreateListParams
import me.elborai.api.models.UserCreateParams
import me.elborai.api.models.UserDeleteParams
import me.elborai.api.models.UserLoginParams
import me.elborai.api.models.UserLogoutParams
import me.elborai.api.models.UserRetrieveParams
import me.elborai.api.models.UserUpdateParams

interface UserServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** This can only be done by the logged in user. */
    @JvmOverloads
    fun create(
        params: UserCreateParams = UserCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<User>

    /** This can only be done by the logged in user. */
    fun create(requestOptions: RequestOptions): CompletableFuture<User> =
        create(UserCreateParams.none(), requestOptions)

    /** Get user by user name */
    @JvmOverloads
    fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<User>

    /** This can only be done by the logged in user. */
    @JvmOverloads
    fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** This can only be done by the logged in user. */
    @JvmOverloads
    fun delete(
        params: UserDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Creates list of users with given input array */
    @JvmOverloads
    fun createList(
        params: UserCreateListParams = UserCreateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<User>

    /** Creates list of users with given input array */
    fun createList(requestOptions: RequestOptions): CompletableFuture<User> =
        createList(UserCreateListParams.none(), requestOptions)

    /** Logs user into the system */
    @JvmOverloads
    fun login(
        params: UserLoginParams = UserLoginParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** Logs user into the system */
    fun login(requestOptions: RequestOptions): CompletableFuture<String> =
        login(UserLoginParams.none(), requestOptions)

    /** Logs out current logged in user session */
    @JvmOverloads
    fun logout(
        params: UserLogoutParams = UserLogoutParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Logs out current logged in user session */
    fun logout(requestOptions: RequestOptions): CompletableFuture<Void?> =
        logout(UserLogoutParams.none(), requestOptions)

    /** A view of [UserServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /user`, but is otherwise the same as
         * [UserServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: UserCreateParams = UserCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<User>>

        /**
         * Returns a raw HTTP response for `post /user`, but is otherwise the same as
         * [UserServiceAsync.create].
         */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<User>> =
            create(UserCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /user/{username}`, but is otherwise the same as
         * [UserServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<User>>

        /**
         * Returns a raw HTTP response for `put /user/{username}`, but is otherwise the same as
         * [UserServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `delete /user/{username}`, but is otherwise the same as
         * [UserServiceAsync.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: UserDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /user/createWithList`, but is otherwise the same as
         * [UserServiceAsync.createList].
         */
        @JvmOverloads
        @MustBeClosed
        fun createList(
            params: UserCreateListParams = UserCreateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<User>>

        /**
         * Returns a raw HTTP response for `post /user/createWithList`, but is otherwise the same as
         * [UserServiceAsync.createList].
         */
        @MustBeClosed
        fun createList(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<User>> =
            createList(UserCreateListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /user/login`, but is otherwise the same as
         * [UserServiceAsync.login].
         */
        @JvmOverloads
        @MustBeClosed
        fun login(
            params: UserLoginParams = UserLoginParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `get /user/login`, but is otherwise the same as
         * [UserServiceAsync.login].
         */
        @MustBeClosed
        fun login(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            login(UserLoginParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /user/logout`, but is otherwise the same as
         * [UserServiceAsync.logout].
         */
        @JvmOverloads
        @MustBeClosed
        fun logout(
            params: UserLogoutParams = UserLogoutParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /user/logout`, but is otherwise the same as
         * [UserServiceAsync.logout].
         */
        @MustBeClosed
        fun logout(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            logout(UserLogoutParams.none(), requestOptions)
    }
}
