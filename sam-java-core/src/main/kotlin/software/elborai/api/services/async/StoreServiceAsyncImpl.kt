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
import software.elborai.api.errors.SamInvalidDataException
import software.elborai.api.models.Order
import software.elborai.api.models.StoreCreateOrderParams
import software.elborai.api.models.StoreDeleteParams
import software.elborai.api.models.StoreInventoryParams
import software.elborai.api.models.StoreInventoryResponse
import software.elborai.api.models.StoreRetrieveParams
import software.elborai.api.core.ClientOptions
import software.elborai.api.core.http.HttpMethod
import software.elborai.api.core.http.HttpRequest
import software.elborai.api.core.http.HttpResponse.Handler
import software.elborai.api.core.http.BinaryResponseContent
import software.elborai.api.core.JsonField
import software.elborai.api.core.JsonValue
import software.elborai.api.core.RequestOptions
import software.elborai.api.errors.SamError
import software.elborai.api.services.emptyHandler
import software.elborai.api.services.errorHandler
import software.elborai.api.services.json
import software.elborai.api.services.jsonHandler
import software.elborai.api.services.multipartFormData
import software.elborai.api.services.stringHandler
import software.elborai.api.services.binaryHandler
import software.elborai.api.services.withErrorHandler
import software.elborai.api.services.async.stores.OrderServiceAsync
import software.elborai.api.services.async.stores.OrderServiceAsyncImpl

class StoreServiceAsyncImpl constructor(private val clientOptions: ClientOptions, ) : StoreServiceAsync {

    private val errorHandler: Handler<SamError> = errorHandler(clientOptions.jsonMapper)

    private val orders: OrderServiceAsync by lazy { OrderServiceAsyncImpl(clientOptions) }

    override fun orders(): OrderServiceAsync = orders

    private val retrieveHandler: Handler<Order> =
    jsonHandler<Order>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * For valid response try integer IDs with value <= 5 or > 10. Other values will
     * generate exceptions.
     */
    override fun retrieve(params: StoreRetrieveParams, requestOptions: RequestOptions): CompletableFuture<Order> {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("store", "order", params.getPathParam(0))
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

    private val deleteHandler: Handler<Void?> =
    emptyHandler()
    .withErrorHandler(errorHandler)

    /**
     * For valid response try integer IDs with value < 1000. Anything above 1000 or
     * nonintegers will generate API errors
     */
    override fun delete(params: StoreDeleteParams, requestOptions: RequestOptions): CompletableFuture<Void> {
      val request = HttpRequest.builder()
        .method(HttpMethod.DELETE)
        .addPathSegments("store", "order", params.getPathParam(0))
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .apply {
            params.getBody().ifPresent {
                body(json(clientOptions.jsonMapper, it))
            }
        }
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
          response.use {
              deleteHandler.handle(it)
          }
      }
    }

    private val createOrderHandler: Handler<Order> =
    jsonHandler<Order>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Place a new order in the store */
    override fun createOrder(params: StoreCreateOrderParams, requestOptions: RequestOptions): CompletableFuture<Order> {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("store", "order")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .body(json(clientOptions.jsonMapper, params.getBody()))
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
          response.use {
              createOrderHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }

    private val inventoryHandler: Handler<StoreInventoryResponse> =
    jsonHandler<StoreInventoryResponse>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Returns a map of status codes to quantities */
    override fun inventory(params: StoreInventoryParams, requestOptions: RequestOptions): CompletableFuture<StoreInventoryResponse> {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("store", "inventory")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
          response.use {
              inventoryHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }
}
