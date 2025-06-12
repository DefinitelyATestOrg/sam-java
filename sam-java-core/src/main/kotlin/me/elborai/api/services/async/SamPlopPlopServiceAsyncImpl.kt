// File generated from our OpenAPI spec by Stainless.

package me.elborai.api.services.async

import java.util.function.Consumer
import me.elborai.api.core.ClientOptions

class SamPlopPlopServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SamPlopPlopServiceAsync {

    private val withRawResponse: SamPlopPlopServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SamPlopPlopServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SamPlopPlopServiceAsync =
        SamPlopPlopServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SamPlopPlopServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SamPlopPlopServiceAsync.WithRawResponse =
            SamPlopPlopServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
