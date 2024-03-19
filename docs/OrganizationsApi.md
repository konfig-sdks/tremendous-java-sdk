# OrganizationsApi

All URIs are relative to *https://testflight.tremendous.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createApiKey**](OrganizationsApi.md#createApiKey) | **POST** /organizations/create_api_key | Create API key |
| [**createNewOrganization**](OrganizationsApi.md#createNewOrganization) | **POST** /organizations | Create organization |
| [**getList**](OrganizationsApi.md#getList) | **GET** /organizations | List organizations |
| [**getOrganization**](OrganizationsApi.md#getOrganization) | **GET** /organizations/{id} | Retrieve organization |


<a name="createApiKey"></a>
# **createApiKey**
> OrganizationsCreateApiKeyResponse createApiKey().execute();

Create API key

Creates a new API key. The API key used to make the request will remain active.  Created API keys are generated randomly and returned in the response. **You cannot retrieve them again.** 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tremendous;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationsApi;
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
      OrganizationsCreateApiKeyResponse result = client
              .organizations
              .createApiKey()
              .execute();
      System.out.println(result);
      System.out.println(result.getApiKey());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#createApiKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationsCreateApiKeyResponse> response = client
              .organizations
              .createApiKey()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#createApiKey");
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

[**OrganizationsCreateApiKeyResponse**](OrganizationsCreateApiKeyResponse.md)

### Authorization

[BearerApiKey](../README.md#BearerApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The created API key |  -  |

<a name="createNewOrganization"></a>
# **createNewOrganization**
> OrganizationsCreateNewOrganizationResponse createNewOrganization(organizationsCreateNewOrganizationRequest).execute();

Create organization

Organizations are a way to separate different parts of your business within the same Tremendous account.  You can assign users in your Tremendous team as members to any organization. Users can be members of multiple organizations at once.  API keys belong to a single organization. The API key used in a request determines on behalf of which organization the request is carried out.  **Important note:** When creating an organization, you are required to either pass &#x60;with_api_key&#x60; or &#x60;copy_settings[user]&#x60; in the request body as &#x60;true&#x60;. This ensures that your new Organization can either be accessed via the API or the Dashboard. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tremendous;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationsApi;
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
    String name = "name_example"; // Name of the organization
    URI website = new URI(); // URL of the website of that organization
    Boolean withApiKey = true; // Default value is `false`. Set to true to also generate an API key associated to the new organization.
    OrganizationsCreateNewOrganizationRequestCopySettings copySettings = new OrganizationsCreateNewOrganizationRequestCopySettings();
    String phone = "phone_example"; // Phone number of the organization. For non-US phone numbers, specify the country code (prefixed with +).
    try {
      OrganizationsCreateNewOrganizationResponse result = client
              .organizations
              .createNewOrganization(name, website)
              .withApiKey(withApiKey)
              .copySettings(copySettings)
              .phone(phone)
              .execute();
      System.out.println(result);
      System.out.println(result.getOrganization());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#createNewOrganization");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationsCreateNewOrganizationResponse> response = client
              .organizations
              .createNewOrganization(name, website)
              .withApiKey(withApiKey)
              .copySettings(copySettings)
              .phone(phone)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#createNewOrganization");
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
| **organizationsCreateNewOrganizationRequest** | [**OrganizationsCreateNewOrganizationRequest**](OrganizationsCreateNewOrganizationRequest.md)| Organization details | |

### Return type

[**OrganizationsCreateNewOrganizationResponse**](OrganizationsCreateNewOrganizationResponse.md)

### Authorization

[BearerApiKey](../README.md#BearerApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The created organization |  -  |

<a name="getList"></a>
# **getList**
> OrganizationsGetListResponse getList().execute();

List organizations

The returned list only includes the organization to which the API key belongs to, that is used for the request. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tremendous;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationsApi;
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
      OrganizationsGetListResponse result = client
              .organizations
              .getList()
              .execute();
      System.out.println(result);
      System.out.println(result.getOrganizations());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationsGetListResponse> response = client
              .organizations
              .getList()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#getList");
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

[**OrganizationsGetListResponse**](OrganizationsGetListResponse.md)

### Authorization

[BearerApiKey](../README.md#BearerApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of all organizations |  -  |

<a name="getOrganization"></a>
# **getOrganization**
> OrganizationsGetOrganizationResponse getOrganization(id).execute();

Retrieve organization

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tremendous;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationsApi;
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
    String id = "SOMEIDSOMEID"; // ID of the organization to retrieve
    try {
      OrganizationsGetOrganizationResponse result = client
              .organizations
              .getOrganization(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getOrganization());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#getOrganization");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrganizationsGetOrganizationResponse> response = client
              .organizations
              .getOrganization(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationsApi#getOrganization");
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
| **id** | **String**| ID of the organization to retrieve | |

### Return type

[**OrganizationsGetOrganizationResponse**](OrganizationsGetOrganizationResponse.md)

### Authorization

[BearerApiKey](../README.md#BearerApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An organization (to be overwritten in specific responses) |  -  |

