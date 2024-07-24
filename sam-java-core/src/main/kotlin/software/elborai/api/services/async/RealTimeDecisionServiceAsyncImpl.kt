// File generated from our OpenAPI spec by Stainless.

package software.elborai.api.services.async

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import software.elborai.api.core.Enum
import software.elborai.api.core.NoAutoDetect
import software.elborai.api.errors.IncreaseInvalidDataException
import software.elborai.api.models.RealTimeDecision
import software.elborai.api.models.RealTimeDecisionActionParams
import software.elborai.api.models.RealTimeDecisionRetrieveParams
import software.elborai.api.core.ClientOptions
import software.elborai.api.core.http.HttpMethod
import software.elborai.api.core.http.HttpRequest
import software.elborai.api.core.http.HttpResponse.Handler
import software.elborai.api.core.http.BinaryResponseContent
import software.elborai.api.core.JsonField
import software.elborai.api.core.JsonValue
import software.elborai.api.core.RequestOptions
import software.elborai.api.errors.IncreaseError
import software.elborai.api.services.emptyHandler
import software.elborai.api.services.errorHandler
import software.elborai.api.services.json
import software.elborai.api.services.jsonHandler
import software.elborai.api.services.multipartFormData
import software.elborai.api.services.stringHandler
import software.elborai.api.services.binaryHandler
import software.elborai.api.services.withErrorHandler

class RealTimeDecisionServiceAsyncImpl constructor(private val clientOptions: ClientOptions, ) : RealTimeDecisionServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<RealTimeDecision> =
    jsonHandler<RealTimeDecision>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Retrieve a Real-Time Decision */
    override fun retrieve(params: RealTimeDecisionRetrieveParams, requestOptions: RequestOptions): CompletableFuture<RealTimeDecision> {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("real_time_decisions", params.getPathParam(0))
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
          response.use {
              retrieveHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }

    private val actionHandler: Handler<RealTimeDecision> =
    jsonHandler<RealTimeDecision>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Action a Real-Time Decision */
    override fun action(params: RealTimeDecisionActionParams, requestOptions: RequestOptions): CompletableFuture<RealTimeDecision> {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("real_time_decisions", params.getPathParam(0), "action")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .body(json(clientOptions.jsonMapper, params.getBody()))
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
          response.use {
              actionHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }
}
