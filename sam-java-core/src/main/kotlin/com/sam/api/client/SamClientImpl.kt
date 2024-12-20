// File generated from our OpenAPI spec by Stainless.

package com.sam.api.client

import com.sam.api.core.ClientOptions
import com.sam.api.core.getPackageVersion
import com.sam.api.services.blocking.StoreService
import com.sam.api.services.blocking.StoreServiceImpl
import com.sam.api.services.blocking.UserService
import com.sam.api.services.blocking.UserServiceImpl

class SamClientImpl
constructor(
    private val clientOptions: ClientOptions,
) : SamClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: SamClientAsync by lazy { SamClientAsyncImpl(clientOptions) }

    private val store: StoreService by lazy { StoreServiceImpl(clientOptionsWithUserAgent) }

    private val users: UserService by lazy { UserServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): SamClientAsync = async

    override fun store(): StoreService = store

    override fun users(): UserService = users
}
