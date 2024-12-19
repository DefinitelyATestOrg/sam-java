// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package me.elborai.api.services.blocking

import me.elborai.api.core.RequestOptions
import me.elborai.api.models.User
import me.elborai.api.models.UserCreateParams
import me.elborai.api.models.UserCreateWithListParams
import me.elborai.api.models.UserDeleteParams
import me.elborai.api.models.UserLoginParams
import me.elborai.api.models.UserLogoutParams
import me.elborai.api.models.UserRetrieveParams
import me.elborai.api.models.UserUpdateParams

interface UserService {

    /** This can only be done by the logged in user. */
    @JvmOverloads
    fun create(
        params: UserCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): User

    /** Get user by user name */
    @JvmOverloads
    fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): User

    /** This can only be done by the logged in user. */
    @JvmOverloads
    fun update(params: UserUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** This can only be done by the logged in user. */
    @JvmOverloads
    fun delete(params: UserDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Creates list of users with given input array */
    @JvmOverloads
    fun createWithList(
        params: UserCreateWithListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): User

    /** Logs user into the system */
    @JvmOverloads
    fun login(
        params: UserLoginParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): String

    /** Logs out current logged in user session */
    @JvmOverloads
    fun logout(params: UserLogoutParams, requestOptions: RequestOptions = RequestOptions.none())
}
