// File generated from our OpenAPI spec by Stainless.

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
    fun create(): CompletableFuture<User> = create(UserCreateParams.none())

    /** @see [create] */
    fun create(
        params: UserCreateParams = UserCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<User>

    /** @see [create] */
    fun create(params: UserCreateParams = UserCreateParams.none()): CompletableFuture<User> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): CompletableFuture<User> =
        create(UserCreateParams.none(), requestOptions)

    /** Get user by user name */
    fun retrieve(params: UserRetrieveParams): CompletableFuture<User> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<User>

    /** This can only be done by the logged in user. */
    fun update(params: UserUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** This can only be done by the logged in user. */
    fun delete(params: UserDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: UserDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Creates list of users with given input array */
    fun createList(): CompletableFuture<User> = createList(UserCreateListParams.none())

    /** @see [createList] */
    fun createList(
        params: UserCreateListParams = UserCreateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<User>

    /** @see [createList] */
    fun createList(
        params: UserCreateListParams = UserCreateListParams.none()
    ): CompletableFuture<User> = createList(params, RequestOptions.none())

    /** @see [createList] */
    fun createList(requestOptions: RequestOptions): CompletableFuture<User> =
        createList(UserCreateListParams.none(), requestOptions)

    /** Logs user into the system */
    fun login(): CompletableFuture<String> = login(UserLoginParams.none())

    /** @see [login] */
    fun login(
        params: UserLoginParams = UserLoginParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see [login] */
    fun login(params: UserLoginParams = UserLoginParams.none()): CompletableFuture<String> =
        login(params, RequestOptions.none())

    /** @see [login] */
    fun login(requestOptions: RequestOptions): CompletableFuture<String> =
        login(UserLoginParams.none(), requestOptions)

    /** Logs out current logged in user session */
    fun logout(): CompletableFuture<Void?> = logout(UserLogoutParams.none())

    /** @see [logout] */
    fun logout(
        params: UserLogoutParams = UserLogoutParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [logout] */
    fun logout(params: UserLogoutParams = UserLogoutParams.none()): CompletableFuture<Void?> =
        logout(params, RequestOptions.none())

    /** @see [logout] */
    fun logout(requestOptions: RequestOptions): CompletableFuture<Void?> =
        logout(UserLogoutParams.none(), requestOptions)

    /** A view of [UserServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /user`, but is otherwise the same as
         * [UserServiceAsync.create].
         */
        @MustBeClosed
        fun create(): CompletableFuture<HttpResponseFor<User>> = create(UserCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: UserCreateParams = UserCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<User>>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: UserCreateParams = UserCreateParams.none()
        ): CompletableFuture<HttpResponseFor<User>> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<User>> =
            create(UserCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /user/{username}`, but is otherwise the same as
         * [UserServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: UserRetrieveParams): CompletableFuture<HttpResponseFor<User>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<User>>

        /**
         * Returns a raw HTTP response for `put /user/{username}`, but is otherwise the same as
         * [UserServiceAsync.update].
         */
        @MustBeClosed
        fun update(params: UserUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `delete /user/{username}`, but is otherwise the same as
         * [UserServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(params: UserDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: UserDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /user/createWithList`, but is otherwise the same as
         * [UserServiceAsync.createList].
         */
        @MustBeClosed
        fun createList(): CompletableFuture<HttpResponseFor<User>> =
            createList(UserCreateListParams.none())

        /** @see [createList] */
        @MustBeClosed
        fun createList(
            params: UserCreateListParams = UserCreateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<User>>

        /** @see [createList] */
        @MustBeClosed
        fun createList(
            params: UserCreateListParams = UserCreateListParams.none()
        ): CompletableFuture<HttpResponseFor<User>> = createList(params, RequestOptions.none())

        /** @see [createList] */
        @MustBeClosed
        fun createList(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<User>> =
            createList(UserCreateListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /user/login`, but is otherwise the same as
         * [UserServiceAsync.login].
         */
        @MustBeClosed
        fun login(): CompletableFuture<HttpResponseFor<String>> = login(UserLoginParams.none())

        /** @see [login] */
        @MustBeClosed
        fun login(
            params: UserLoginParams = UserLoginParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see [login] */
        @MustBeClosed
        fun login(
            params: UserLoginParams = UserLoginParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = login(params, RequestOptions.none())

        /** @see [login] */
        @MustBeClosed
        fun login(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            login(UserLoginParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /user/logout`, but is otherwise the same as
         * [UserServiceAsync.logout].
         */
        @MustBeClosed
        fun logout(): CompletableFuture<HttpResponse> = logout(UserLogoutParams.none())

        /** @see [logout] */
        @MustBeClosed
        fun logout(
            params: UserLogoutParams = UserLogoutParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [logout] */
        @MustBeClosed
        fun logout(
            params: UserLogoutParams = UserLogoutParams.none()
        ): CompletableFuture<HttpResponse> = logout(params, RequestOptions.none())

        /** @see [logout] */
        @MustBeClosed
        fun logout(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            logout(UserLogoutParams.none(), requestOptions)
    }
}
