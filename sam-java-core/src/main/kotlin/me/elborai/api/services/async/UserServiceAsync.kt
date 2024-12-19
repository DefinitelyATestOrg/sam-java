// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package me.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import me.elborai.api.core.RequestOptions
import me.elborai.api.models.User
import me.elborai.api.models.UserCreateParams
import me.elborai.api.models.UserCreateWithListParams
import me.elborai.api.models.UserDeleteParams
import me.elborai.api.models.UserLoginParams
import me.elborai.api.models.UserLogoutParams
import me.elborai.api.models.UserRetrieveParams
import me.elborai.api.models.UserUpdateParams

interface UserServiceAsync {

    /** This can only be done by the logged in user. */
    @JvmOverloads
    fun create(
        params: UserCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<User>

    /** Get user by user name */
    @JvmOverloads
    fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<User>

    /** This can only be done by the logged in user. */
    @JvmOverloads
    fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Void>

    /** This can only be done by the logged in user. */
    @JvmOverloads
    fun delete(
        params: UserDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Void>

    /** Creates list of users with given input array */
    @JvmOverloads
    fun createWithList(
        params: UserCreateWithListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<User>

    /** Logs user into the system */
    @JvmOverloads
    fun login(
        params: UserLoginParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<String>

    /** Logs out current logged in user session */
    @JvmOverloads
    fun logout(
        params: UserLogoutParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Void>
}
