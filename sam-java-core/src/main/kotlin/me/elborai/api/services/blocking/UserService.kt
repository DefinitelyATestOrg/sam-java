// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package me.elborai.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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

interface UserService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** This can only be done by the logged in user. */
    @JvmOverloads
    fun create(
        params: UserCreateParams = UserCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User

    /** This can only be done by the logged in user. */
    fun create(requestOptions: RequestOptions): User =
        create(UserCreateParams.none(), requestOptions)

    /** Get user by user name */
    @JvmOverloads
    fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User

    /** This can only be done by the logged in user. */
    @JvmOverloads
    fun update(params: UserUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** This can only be done by the logged in user. */
    @JvmOverloads
    fun delete(params: UserDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Creates list of users with given input array */
    @JvmOverloads
    fun createList(
        params: UserCreateListParams = UserCreateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User

    /** Creates list of users with given input array */
    fun createList(requestOptions: RequestOptions): User =
        createList(UserCreateListParams.none(), requestOptions)

    /** Logs user into the system */
    @JvmOverloads
    fun login(
        params: UserLoginParams = UserLoginParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** Logs user into the system */
    fun login(requestOptions: RequestOptions): String =
        login(UserLoginParams.none(), requestOptions)

    /** Logs out current logged in user session */
    @JvmOverloads
    fun logout(
        params: UserLogoutParams = UserLogoutParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Logs out current logged in user session */
    fun logout(requestOptions: RequestOptions) = logout(UserLogoutParams.none(), requestOptions)

    /** A view of [UserService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /user`, but is otherwise the same as
         * [UserService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: UserCreateParams = UserCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User>

        /**
         * Returns a raw HTTP response for `post /user`, but is otherwise the same as
         * [UserService.create].
         */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<User> =
            create(UserCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /user/{username}`, but is otherwise the same as
         * [UserService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User>

        /**
         * Returns a raw HTTP response for `put /user/{username}`, but is otherwise the same as
         * [UserService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete /user/{username}`, but is otherwise the same as
         * [UserService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: UserDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /user/createWithList`, but is otherwise the same as
         * [UserService.createList].
         */
        @JvmOverloads
        @MustBeClosed
        fun createList(
            params: UserCreateListParams = UserCreateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User>

        /**
         * Returns a raw HTTP response for `post /user/createWithList`, but is otherwise the same as
         * [UserService.createList].
         */
        @MustBeClosed
        fun createList(requestOptions: RequestOptions): HttpResponseFor<User> =
            createList(UserCreateListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /user/login`, but is otherwise the same as
         * [UserService.login].
         */
        @JvmOverloads
        @MustBeClosed
        fun login(
            params: UserLoginParams = UserLoginParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `get /user/login`, but is otherwise the same as
         * [UserService.login].
         */
        @MustBeClosed
        fun login(requestOptions: RequestOptions): HttpResponseFor<String> =
            login(UserLoginParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /user/logout`, but is otherwise the same as
         * [UserService.logout].
         */
        @JvmOverloads
        @MustBeClosed
        fun logout(
            params: UserLogoutParams = UserLogoutParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /user/logout`, but is otherwise the same as
         * [UserService.logout].
         */
        @MustBeClosed
        fun logout(requestOptions: RequestOptions): HttpResponse =
            logout(UserLogoutParams.none(), requestOptions)
    }
}
