# Sam Java API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/software.elborai.api/sam-java)](https://central.sonatype.com/artifact/software.elborai.api/sam-java/0.1.0-alpha.1)

<!-- x-release-please-end -->

The Sam Java SDK provides convenient access to the Sam REST API from applications written in Java. It includes helper classes with helpful types and documentation for every request and response property.

The Sam Java SDK is similar to the Sam Kotlin SDK but with minor differences that make it more ergonomic for use in Java, such as `Optional` instead of nullable values, `Stream` instead of `Sequence`, and `CompletableFuture` instead of suspend functions.

It is generated with [Stainless](https://www.stainlessapi.com/).

## Documentation

The REST API documentation can be found on [docs.sam.com](https://docs.sam.com).

---

## Getting started

### Install dependencies

#### Gradle

<!-- x-release-please-start-version -->

```kotlin
implementation("software.elborai.api:sam-java:0.1.0-alpha.1")
```

#### Maven

```xml
<dependency>
    <groupId>software.elborai.api</groupId>
    <artifactId>sam-java</artifactId>
    <version>0.1.0-alpha.1</version>
</dependency>
```

<!-- x-release-please-end -->

### Configure the client

Use `SamOkHttpClient.builder()` to configure the client.

```java
SamClient client = SamOkHttpClient.fromEnv();
```

Read the documentation for more configuration options.

---

### Example: creating a resource

To create a new store, first use the `StoreCreateOrderParams` builder to specify attributes,
then pass that to the `createOrder` method of the `stores` service.

```java
import software.elborai.api.models.Order;
import software.elborai.api.models.StoreCreateOrderParams;

StoreCreateOrderParams params = StoreCreateOrderParams.builder().build();
Order order = client.stores().createOrder(params);
```

---

## Requests

### Parameters and bodies

To make a request to the Sam API, you generally build an instance of the appropriate `Params` class.

In [Example: creating a resource](#example-creating-a-resource) above, we used the `StoreCreateOrderParams.builder()` to pass to
the `createOrder` method of the `stores` service.

Sometimes, the API may support other properties that are not yet supported in the Java SDK types. In that case,
you can attach them using the `putAdditionalProperty` method.

```java
StoreCreateOrderParams params = StoreCreateOrderParams.builder()
    // ... normal properties
    .putAdditionalProperty("secret_param", "4242")
    .build();
```

## Responses

### Response validation

When receiving a response, the Sam Java SDK will deserialize it into instances of the typed model classes. In rare cases, the API may return a response property that doesn't match the expected Java type. If you directly access the mistaken property, the SDK will throw an unchecked `SamInvalidDataException` at runtime. If you would prefer to check in advance that that response is completely well-typed, call `.validate()` on the returned model.

```java
Order order = client.stores().createOrder().validate();
```

### Response properties as JSON

In rare cases, you may want to access the underlying JSON value for a response property rather than using the typed version provided by
this SDK. Each model property has a corresponding JSON version, with an underscore before the method name, which returns a `JsonField` value.

```java
JsonField field = responseObj._field();

if (field.isMissing()) {
  // Value was not specified in the JSON response
} else if (field.isNull()) {
  // Value was provided as a literal null
} else {
  // See if value was provided as a string
  Optional<String> jsonString = field.asString();

  // If the value given by the API did not match the shape that the SDK expects
  // you can deserialise into a custom type
  MyClass myObj = responseObj._field().asUnknown().orElseThrow().convert(MyClass.class);
}
```

### Additional model properties

Sometimes, the server response may include additional properties that are not yet available in this library's types. You can access them using the model's `_additionalProperties` method:

```java
JsonValue secret = order._additionalProperties().get("secret_field");
```

---

---

## Error handling

This library throws exceptions in a single hierarchy for easy handling:

- **`SamException`** - Base exception for all exceptions

  - **`SamServiceException`** - HTTP errors with a well-formed response body we were able to parse. The exception message and the `.debuggingRequestId()` will be set by the server.

    | 400    | BadRequestException           |
    | ------ | ----------------------------- |
    | 401    | AuthenticationException       |
    | 403    | PermissionDeniedException     |
    | 404    | NotFoundException             |
    | 422    | UnprocessableEntityException  |
    | 429    | RateLimitException            |
    | 5xx    | InternalServerException       |
    | others | UnexpectedStatusCodeException |

  - **`SamIoException`** - I/O networking errors
  - **`SamInvalidDataException`** - any other exceptions on the client side, e.g.:
    - We failed to serialize the request body
    - We failed to parse the response body (has access to response code and body)

## Network options

### Retries

Requests that experience certain errors are automatically retried 2 times by default, with a short exponential backoff. Connection errors (for example, due to a network connectivity problem), 408 Request Timeout, 409 Conflict, 429 Rate Limit, and >=500 Internal errors will all be retried by default.
You can provide a `maxRetries` on the client builder to configure this:

```java
SamClient client = SamOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build();
```

### Timeouts

Requests time out after 1 minute by default. You can configure this on the client builder:

```java
SamClient client = SamOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build();
```

### Proxies

Requests can be routed through a proxy. You can configure this on the client builder:

```java
SamClient client = SamOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(
        Type.HTTP,
        new InetSocketAddress("proxy.com", 8080)
    ))
    .build();
```

## Making custom/undocumented requests

This library is typed for convenient access to the documented API. If you need to access undocumented
params or response properties, the library can still be used.

### Undocumented request params

To make requests using undocumented parameters, you can provide or override parameters on the params object
while building it.

```kotlin
FooCreateParams address = FooCreateParams.builder()
    .id("my_id")
    .putAdditionalProperty("secret_prop", JsonValue.from("hello"))
    .build();
```

### Undocumented response properties

To access undocumented response properties, you can use `res._additionalProperties()` on a response object to
get a map of untyped fields of type `Map<String, JsonValue>`. You can then access fields like
`._additionalProperties().get("secret_prop").asString()` or use other helpers defined on the `JsonValue` class
to extract it to a desired type.

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals)_.
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/DefinitelyATestOrg/sam-java/issues) with questions, bugs, or suggestions.

## Requirements

This library requires Java 8 or later.
