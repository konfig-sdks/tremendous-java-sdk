# BalanceTransactionsApi

All URIs are relative to *https://testflight.tremendous.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listAll**](BalanceTransactionsApi.md#listAll) | **GET** /balance_transactions | List balance transactions |


<a name="listAll"></a>
# **listAll**
> BalanceTransactionsListAllResponse listAll().offset(offset).limit(limit).createdAtGte(createdAtGte).createdAtLte(createdAtLte).execute();

List balance transactions

Fetch a list of all balance transactions on your account. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tremendous;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BalanceTransactionsApi;
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
    Integer offset = 10; // Offsets the returned list by the given number of transactions. The returned transactions are ordered (and offsetted) by their creation date (DESC).
    Integer limit = 10; // Limits the number of transactions listed. The default value is 10.
    String createdAtGte = "2023-07-15T18:00:00Z"; // Only return results where the created_at field is greater than or equal to the supplied value. The string needs to be an ISO 8601 datetime.
    String createdAtLte = "2023-08-01T18:00:00Z"; // Only return results where the created_at field is less than or equal to the supplied value. The string needs to be an ISO 8601 datetime.
    try {
      BalanceTransactionsListAllResponse result = client
              .balanceTransactions
              .listAll()
              .offset(offset)
              .limit(limit)
              .createdAtGte(createdAtGte)
              .createdAtLte(createdAtLte)
              .execute();
      System.out.println(result);
      System.out.println(result.getInvoices());
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceTransactionsApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BalanceTransactionsListAllResponse> response = client
              .balanceTransactions
              .listAll()
              .offset(offset)
              .limit(limit)
              .createdAtGte(createdAtGte)
              .createdAtLte(createdAtLte)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceTransactionsApi#listAll");
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
| **offset** | **Integer**| Offsets the returned list by the given number of transactions. The returned transactions are ordered (and offsetted) by their creation date (DESC). | [optional] |
| **limit** | **Integer**| Limits the number of transactions listed. The default value is 10. | [optional] |
| **createdAtGte** | **String**| Only return results where the created_at field is greater than or equal to the supplied value. The string needs to be an ISO 8601 datetime. | [optional] |
| **createdAtLte** | **String**| Only return results where the created_at field is less than or equal to the supplied value. The string needs to be an ISO 8601 datetime. | [optional] |

### Return type

[**BalanceTransactionsListAllResponse**](BalanceTransactionsListAllResponse.md)

### Authorization

[BearerApiKey](../README.md#BearerApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of all transactions on this account |  -  |

