// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package me.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import me.elborai.api.core.RequestOptions
import me.elborai.api.models.User
import me.elborai.api.models.UserCreateListParams
import me.elborai.api.models.UserCreateParams
import me.elborai.api.models.UserDeleteParams
import me.elborai.api.models.UserLoginParams
import me.elborai.api.models.UserLogoutParams
import me.elborai.api.models.UserRetrieveParams
import me.elborai.api.models.UserUpdateParams

interface UserServiceAsync {

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
}
