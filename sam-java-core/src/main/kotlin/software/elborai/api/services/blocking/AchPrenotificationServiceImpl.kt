// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.services.blocking

import software.elborai.api.core.ClientOptions
import software.elborai.api.core.RequestOptions
import software.elborai.api.core.http.HttpMethod
import software.elborai.api.core.http.HttpRequest
import software.elborai.api.core.http.HttpResponse.Handler
import software.elborai.api.errors.IncreaseError
import software.elborai.api.models.AchPrenotification
import software.elborai.api.models.AchPrenotificationCreateParams
import software.elborai.api.models.AchPrenotificationListPage
import software.elborai.api.models.AchPrenotificationListParams
import software.elborai.api.models.AchPrenotificationRetrieveParams
import software.elborai.api.services.errorHandler
import software.elborai.api.services.json
import software.elborai.api.services.jsonHandler
import software.elborai.api.services.withErrorHandler

class AchPrenotificationServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : AchPrenotificationService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AchPrenotification> =
        jsonHandler<AchPrenotification>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create an ACH Prenotification */
    override fun create(
        params: AchPrenotificationCreateParams,
        requestOptions: RequestOptions
    ): AchPrenotification {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("ach_prenotifications")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<AchPrenotification> =
        jsonHandler<AchPrenotification>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve an ACH Prenotification */
    override fun retrieve(
        params: AchPrenotificationRetrieveParams,
        requestOptions: RequestOptions
    ): AchPrenotification {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("ach_prenotifications", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<AchPrenotificationListPage.Response> =
        jsonHandler<AchPrenotificationListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List ACH Prenotifications */
    override fun list(
        params: AchPrenotificationListParams,
        requestOptions: RequestOptions
    ): AchPrenotificationListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("ach_prenotifications")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { AchPrenotificationListPage.of(this, params, it) }
        }
    }
}