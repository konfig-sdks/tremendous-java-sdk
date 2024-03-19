# MembersApi

All URIs are relative to *https://testflight.tremendous.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewMember**](MembersApi.md#createNewMember) | **POST** /members | Create member |
| [**getMember**](MembersApi.md#getMember) | **GET** /members/{id} | Retrieve member |
| [**listMembers**](MembersApi.md#listMembers) | **GET** /members | List members |


<a name="createNewMember"></a>
# **createNewMember**
> MembersCreateNewMemberResponse createNewMember(membersCreateNewMemberRequest).execute();

Create member

Each organization has one or more users that can access and manage that organization. These users are called members.  Members can take actions via the Tremendous web dashboard directly. These actions include adding funding sources to the organization, creating Campaigns, and more.  ### Permissions  Members can have one of two roles that determine their permissions within the organization:  1. &#x60;MEMBER&#x60;: Limited permissions. Can view their own reward and order histories only. 2. &#x60;ADMIN&#x60;: Update organization settings, invite other members to the organization, and view all member order and reward histories within their organization.  To create members of a sub-organizations [create an API key for that organization](https://developers.tremendous.com/) first, then use the new API key in the create member request.  ### Inviting new members  After creating a member, an automatic invite is sent to the email address. If the user is not registered yet, that person will then need to sign up for a Tremendous account.  &gt; ❗️ Automatic invitations are not available in the sandbox &gt; &gt; You must manually use the returned &#x60;invite_url&#x60; field in the payload instead. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tremendous;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MembersApi;
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
    String email = "email_example"; // Email address of the member
    String name = "name_example"; // Full name of the member
    String role = "MEMBER"; // Role of the member within the organization.  <table>   <thead>     <tr>       <th>Role</th>       <th>Description</th>     </tr>   </thead>     <tr>       <td><code>MEMBER</code></td>       <td>Limited permissions. Can view their own reward and order histories only.</td>     </tr>     <tr>       <td><code>ADMIN</code></td>       <td>Update organization settings, invite other members to the organization, and view all member order and reward histories within their organization.</td>     </tr>   <tbody> </table> 
    try {
      MembersCreateNewMemberResponse result = client
              .members
              .createNewMember(email, name, role)
              .execute();
      System.out.println(result);
      System.out.println(result.getMember());
    } catch (ApiException e) {
      System.err.println("Exception when calling MembersApi#createNewMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MembersCreateNewMemberResponse> response = client
              .members
              .createNewMember(email, name, role)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MembersApi#createNewMember");
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
| **membersCreateNewMemberRequest** | [**MembersCreateNewMemberRequest**](MembersCreateNewMemberRequest.md)| Member details | |

### Return type

[**MembersCreateNewMemberResponse**](MembersCreateNewMemberResponse.md)

### Authorization

[BearerApiKey](../README.md#BearerApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A member (to be overwritten in specific responses) |  -  |

<a name="getMember"></a>
# **getMember**
> MembersGetMemberResponse getMember(id).execute();

Retrieve member

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tremendous;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MembersApi;
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
    String id = "SOMEIDSOMEID"; // ID of the member to retrieve
    try {
      MembersGetMemberResponse result = client
              .members
              .getMember(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getMember());
    } catch (ApiException e) {
      System.err.println("Exception when calling MembersApi#getMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MembersGetMemberResponse> response = client
              .members
              .getMember(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MembersApi#getMember");
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
| **id** | **String**| ID of the member to retrieve | |

### Return type

[**MembersGetMemberResponse**](MembersGetMemberResponse.md)

### Authorization

[BearerApiKey](../README.md#BearerApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details on the retrieved member |  -  |

<a name="listMembers"></a>
# **listMembers**
> MembersListMembersResponse listMembers().execute();

List members

To list members of a sub-organization [create an API key for that organization](https://developers.tremendous.com/) first, then use the new API key in the list members request. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tremendous;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MembersApi;
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
      MembersListMembersResponse result = client
              .members
              .listMembers()
              .execute();
      System.out.println(result);
      System.out.println(result.getMembers());
    } catch (ApiException e) {
      System.err.println("Exception when calling MembersApi#listMembers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MembersListMembersResponse> response = client
              .members
              .listMembers()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MembersApi#listMembers");
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

[**MembersListMembersResponse**](MembersListMembersResponse.md)

### Authorization

[BearerApiKey](../README.md#BearerApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of all members |  -  |

