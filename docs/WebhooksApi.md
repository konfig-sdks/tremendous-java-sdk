# WebhooksApi

All URIs are relative to *https://testflight.tremendous.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWebhook**](WebhooksApi.md#createWebhook) | **POST** /webhooks | Create webhook |
| [**getDetails**](WebhooksApi.md#getDetails) | **GET** /webhooks | List webhooks |
| [**getDetails_0**](WebhooksApi.md#getDetails_0) | **GET** /webhooks/{id} | Retrieve webhook |
| [**listEvents**](WebhooksApi.md#listEvents) | **GET** /webhooks/{id}/events | List events |
| [**triggerEvent**](WebhooksApi.md#triggerEvent) | **POST** /webhooks/{id}/simulate | Test webhook |


<a name="createWebhook"></a>
# **createWebhook**
> WebhooksCreateWebhookResponse createWebhook(webhooksCreateWebhookRequest).execute();

Create webhook

Tremendous uses webhooks as a notification system for various events that happen in your account.  &gt; 📘 Learn more about Webhooks &gt; &gt; Our guide explains everything you need to know about the Tremendous webhooks: &gt; [Read it here](https://developers.tremendous.com/)  Every organization can define a single webhook endpoint where we send requests to, whenever an event happens.  This endpoint allows you to setup that endpoint. The URL of the endpoint can be changed by making a request to this endpoint again with the new URL.  ## Request body  &lt;div class&#x3D;\&quot;object-schema-request-schema\&quot;&gt;   &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Property&lt;/th&gt;       &lt;th&gt;Type&lt;/th&gt;       &lt;th&gt;Description&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody class&#x3D;\&quot;object-schema-table-body\&quot;&gt;     &lt;tr class&#x3D;\&quot;\&quot;&gt;&lt;td&gt;&lt;div class&#x3D;\&quot;property-name\&quot;&gt;   &lt;code class&#x3D;\&quot;property-name\&quot;&gt;url&lt;/code&gt; &lt;/div&gt; &lt;/td&gt;&lt;td&gt;&lt;span class&#x3D;\&quot;property-type\&quot;&gt;string&lt;/span&gt; &lt;span class&#x3D;\&quot;property-format\&quot;&gt;uri&lt;/span&gt;&lt;/td&gt;&lt;td&gt;&lt;p&gt;URL the webhook will make requests to&lt;/p&gt; &lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;  &lt;/div&gt;  

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tremendous;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://testflight.tremendous.com/api/v2";
    
    // Configure HTTP bearer authorization: BearerApiKey
    configuration.token = "BEARER TOKEN";
    Tremendous client = new Tremendous(configuration);
    URI url = new URI(); // URL the webhook will make requests to
    try {
      WebhooksCreateWebhookResponse result = client
              .webhooks
              .createWebhook(url)
              .execute();
      System.out.println(result);
      System.out.println(result.getWebhook());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#createWebhook");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebhooksCreateWebhookResponse> response = client
              .webhooks
              .createWebhook(url)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#createWebhook");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webhooksCreateWebhookRequest** | [**WebhooksCreateWebhookRequest**](WebhooksCreateWebhookRequest.md)| Webhook details | |

### Return type

[**WebhooksCreateWebhookResponse**](WebhooksCreateWebhookResponse.md)

### Authorization

[BearerApiKey](../README.md#BearerApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A webhook (to be overwritten in specific responses) |  -  |

<a name="getDetails"></a>
# **getDetails**
> WebhooksGetDetailsResponse getDetails().execute();

List webhooks

Every organization can only have one webhook. This endpoint shows the details about that webhook.  &gt; 📘 Learn more about Webhooks &gt; &gt; Our guide explains everything you need to know about the Tremendous webhooks: &gt; [Read it here](https://developers.tremendous.com/) 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tremendous;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://testflight.tremendous.com/api/v2";
    
    // Configure HTTP bearer authorization: BearerApiKey
    configuration.token = "BEARER TOKEN";
    Tremendous client = new Tremendous(configuration);
    try {
      WebhooksGetDetailsResponse result = client
              .webhooks
              .getDetails()
              .execute();
      System.out.println(result);
      System.out.println(result.getWebhooks());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebhooksGetDetailsResponse> response = client
              .webhooks
              .getDetails()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebhooksGetDetailsResponse**](WebhooksGetDetailsResponse.md)

### Authorization

[BearerApiKey](../README.md#BearerApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of configured webhooks (never more than 1 webhook) |  -  |

<a name="getDetails_0"></a>
# **getDetails_0**
> WebhooksGetDetails200Response getDetails_0(id).execute();

Retrieve webhook

&gt; 📘 Learn more about Webhooks &gt; &gt; Our guide explains everything you need to know about the Tremendous webhooks: &gt; [Read it here](https://developers.tremendous.com/) 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tremendous;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://testflight.tremendous.com/api/v2";
    
    // Configure HTTP bearer authorization: BearerApiKey
    configuration.token = "BEARER TOKEN";
    Tremendous client = new Tremendous(configuration);
    String id = "SOMEIDSOMEID"; // ID of the webhook to retrieve
    try {
      WebhooksGetDetails200Response result = client
              .webhooks
              .getDetails_0(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getWebhook());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#getDetails_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebhooksGetDetails200Response> response = client
              .webhooks
              .getDetails_0(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#getDetails_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| ID of the webhook to retrieve | |

### Return type

[**WebhooksGetDetails200Response**](WebhooksGetDetails200Response.md)

### Authorization

[BearerApiKey](../README.md#BearerApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A webhook (to be overwritten in specific responses) |  -  |

<a name="listEvents"></a>
# **listEvents**
> WebhooksListEventsResponse listEvents(id).execute();

List events

Lists all event types that can be sent to the configured webhook endpoint.  &gt; 📘 Learn more about Webhooks &gt; &gt; Our guide explains everything you need to know about the Tremendous webhooks: &gt; [Read it here](https://developers.tremendous.com/) 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tremendous;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://testflight.tremendous.com/api/v2";
    
    // Configure HTTP bearer authorization: BearerApiKey
    configuration.token = "BEARER TOKEN";
    Tremendous client = new Tremendous(configuration);
    String id = "SOMEIDSOMEID"; // ID of the webhook to list the events for
    try {
      WebhooksListEventsResponse result = client
              .webhooks
              .listEvents(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getEvents());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#listEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebhooksListEventsResponse> response = client
              .webhooks
              .listEvents(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#listEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| ID of the webhook to list the events for | |

### Return type

[**WebhooksListEventsResponse**](WebhooksListEventsResponse.md)

### Authorization

[BearerApiKey](../README.md#BearerApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of all possible event types |  -  |

<a name="triggerEvent"></a>
# **triggerEvent**
> String triggerEvent(id, webhooksTriggerEventRequest).execute();

Test webhook

Making a request to this endpoint will cause our system to trigger a webhook for the specified event. This can be very useful when testing the setup that processes webhooks on your end.  &gt; 📘 Learn more about Webhooks &gt; &gt; Our guide explains everything you need to know about the Tremendous webhooks: &gt; [Read it here](https://developers.tremendous.com/) 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tremendous;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhooksApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://testflight.tremendous.com/api/v2";
    
    // Configure HTTP bearer authorization: BearerApiKey
    configuration.token = "BEARER TOKEN";
    Tremendous client = new Tremendous(configuration);
    String event = "event_example"; // The event to test. See the [List events endpoint reference](https://developers.tremendous.com/) for all available events.
    String id = "SOMEIDSOMEID"; // ID of the webhook to test
    try {
      String result = client
              .webhooks
              .triggerEvent(event, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#triggerEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .webhooks
              .triggerEvent(event, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#triggerEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| ID of the webhook to test | |
| **webhooksTriggerEventRequest** | [**WebhooksTriggerEventRequest**](WebhooksTriggerEventRequest.md)| Webhook details | |

### Return type

**String**

### Authorization

[BearerApiKey](../README.md#BearerApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/html, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webhook simulation triggered successfully |  -  |

