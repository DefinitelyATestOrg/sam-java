// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package software.elborai.api.services.async

import java.util.concurrent.CompletableFuture
import software.elborai.api.core.RequestOptions
import software.elborai.api.models.User
import software.elborai.api.models.UserCreateParams
import software.elborai.api.models.UserCreateWithListParams
import software.elborai.api.models.UserDeleteParams
import software.elborai.api.models.UserLoginParams
import software.elborai.api.models.UserLogoutParams
import software.elborai.api.models.UserRetrieveParams
import software.elborai.api.models.UserUpdateParams

interface UserServiceAsync {

    /** This can only be done by the logged in user. */
    @JvmOverloads
    fun create(
        params: UserCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Void>

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
