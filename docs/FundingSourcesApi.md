# FundingSourcesApi

All URIs are relative to *https://testflight.tremendous.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAll**](FundingSourcesApi.md#getAll) | **GET** /funding_sources | List funding sources |
| [**getById**](FundingSourcesApi.md#getById) | **GET** /funding_sources/{id} | Retrieve funding source |


<a name="getAll"></a>
# **getAll**
> FundingSourcesGetAllResponse getAll().execute();

List funding sources

Retrieve a list of all funding sources available for ordering through the API in your organization&#39;s account. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tremendous;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FundingSourcesApi;
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
      FundingSourcesGetAllResponse result = client
              .fundingSources
              .getAll()
              .execute();
      System.out.println(result);
      System.out.println(result.getFundingSources());
    } catch (ApiException e) {
      System.err.println("Exception when calling FundingSourcesApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FundingSourcesGetAllResponse> response = client
              .fundingSources
              .getAll()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FundingSourcesApi#getAll");
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

[**FundingSourcesGetAllResponse**](FundingSourcesGetAllResponse.md)

### Authorization

[BearerApiKey](../README.md#BearerApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of all funding sources available in your organization&#39;s account. |  -  |

<a name="getById"></a>
# **getById**
> FundingSourcesGetByIdResponse getById(id).execute();

Retrieve funding source

Retrieve a funding source, identified by the given &#x60;id&#x60; in the URL 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tremendous;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FundingSourcesApi;
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
    String id = "SOMEIDSOMEID"; // ID of the funding source that should be retrieved
    try {
      FundingSourcesGetByIdResponse result = client
              .fundingSources
              .getById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getFundingSource());
    } catch (ApiException e) {
      System.err.println("Exception when calling FundingSourcesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FundingSourcesGetByIdResponse> response = client
              .fundingSources
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FundingSourcesApi#getById");
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
| **id** | **String**| ID of the funding source that should be retrieved | |

### Return type

[**FundingSourcesGetByIdResponse**](FundingSourcesGetByIdResponse.md)

### Authorization

[BearerApiKey](../README.md#BearerApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Requested funding source |  -  |

