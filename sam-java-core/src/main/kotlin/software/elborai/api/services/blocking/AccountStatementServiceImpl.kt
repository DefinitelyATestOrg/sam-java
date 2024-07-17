// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.services.blocking

import software.elborai.api.core.ClientOptions
import software.elborai.api.core.RequestOptions
import software.elborai.api.core.http.HttpMethod
import software.elborai.api.core.http.HttpRequest
import software.elborai.api.core.http.HttpResponse.Handler
import software.elborai.api.errors.IncreaseError
import software.elborai.api.models.AccountStatement
import software.elborai.api.models.AccountStatementListPage
import software.elborai.api.models.AccountStatementListParams
import software.elborai.api.models.AccountStatementRetrieveParams
import software.elborai.api.services.errorHandler
import software.elborai.api.services.jsonHandler
import software.elborai.api.services.withErrorHandler

class AccountStatementServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : AccountStatementService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<AccountStatement> =
        jsonHandler<AccountStatement>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve an Account Statement */
    override fun retrieve(
        params: AccountStatementRetrieveParams,
        requestOptions: RequestOptions
    ): AccountStatement {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("account_statements", params.getPathParam(0))
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

    private val listHandler: Handler<AccountStatementListPage.Response> =
        jsonHandler<AccountStatementListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Account Statements */
    override fun list(
        params: AccountStatementListParams,
        requestOptions: RequestOptions
    ): AccountStatementListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("account_statements")
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
                .let { AccountStatementListPage.of(this, params, it) }
        }
    }
}
