// File generated from our OpenAPI spec by Stainless.

package me.elborai.api.services.blocking

import java.util.function.Consumer
import me.elborai.api.core.ClientOptions

class SamPlopPlopServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SamPlopPlopService {

    private val withRawResponse: SamPlopPlopService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SamPlopPlopService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SamPlopPlopService =
        SamPlopPlopServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SamPlopPlopService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SamPlopPlopService.WithRawResponse =
            SamPlopPlopServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
