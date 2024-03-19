# ProductsApi

All URIs are relative to *https://testflight.tremendous.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getById**](ProductsApi.md#getById) | **GET** /products/{id} | Retrieve product |
| [**getList**](ProductsApi.md#getList) | **GET** /products | List products |


<a name="getById"></a>
# **getById**
> ProductsGetByIdResponse getById(id).execute();

Retrieve product

Retrieve a product, identified by the given &#x60;id&#x60; in the URL 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tremendous;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProductsApi;
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
    String id = "SOMEIDSOMEID"; // ID of the product that should be retrieved
    try {
      ProductsGetByIdResponse result = client
              .products
              .getById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getProduct());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProductsGetByIdResponse> response = client
              .products
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#getById");
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
| **id** | **String**| ID of the product that should be retrieved | |

### Return type

[**ProductsGetByIdResponse**](ProductsGetByIdResponse.md)

### Authorization

[BearerApiKey](../README.md#BearerApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Requested product |  -  |

<a name="getList"></a>
# **getList**
> ProductsGetListResponse getList().country(country).currency(currency).execute();

List products

Retrieve a list of available products 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tremendous;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProductsApi;
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
    String country = "US,UK"; // Comma-separated list of [Alpha-2 country codes](https://www.iban.com/country-codes), used to only retrieve products available in the provided countries
    String currency = "USD,EUR"; // Comma-separated list of [currency codes](https://www.iban.com/currency-codes), used to only retrieve products available in the provided currencies
    try {
      ProductsGetListResponse result = client
              .products
              .getList()
              .country(country)
              .currency(currency)
              .execute();
      System.out.println(result);
      System.out.println(result.getProducts());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProductsGetListResponse> response = client
              .products
              .getList()
              .country(country)
              .currency(currency)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#getList");
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
| **country** | **String**| Comma-separated list of [Alpha-2 country codes](https://www.iban.com/country-codes), used to only retrieve products available in the provided countries | [optional] |
| **currency** | **String**| Comma-separated list of [currency codes](https://www.iban.com/currency-codes), used to only retrieve products available in the provided currencies | [optional] |

### Return type

[**ProductsGetListResponse**](ProductsGetListResponse.md)

### Authorization

[BearerApiKey](../README.md#BearerApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of available products. |  -  |

