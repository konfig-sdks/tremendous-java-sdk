# InvoicesApi

All URIs are relative to *https://testflight.tremendous.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAndFundAccountBalance**](InvoicesApi.md#createAndFundAccountBalance) | **POST** /invoices | Create invoice |
| [**getAll**](InvoicesApi.md#getAll) | **GET** /invoices | List invoices |
| [**getById**](InvoicesApi.md#getById) | **GET** /invoices/{id} | Retrieve invoice |
| [**getCsv**](InvoicesApi.md#getCsv) | **GET** /invoices/{id}/csv | Retrieve invoice as CSV |
| [**getPdf**](InvoicesApi.md#getPdf) | **GET** /invoices/{id}/pdf | Retrieve invoice as PDF |
| [**removeInvoice**](InvoicesApi.md#removeInvoice) | **DELETE** /invoices/{id} | Delete invoice |


<a name="createAndFundAccountBalance"></a>
# **createAndFundAccountBalance**
> InvoicesCreateAndFundAccountBalanceResponse createAndFundAccountBalance(invoicesCreateAndFundAccountBalanceRequest).execute();

Create invoice

Creating an invoice is the way for your organization to fund your account&#39;s balance.  1. Create an invoice 2. Pay the invoice 3. Funds get added to your account&#39;s balance  ## Request body  &lt;div class&#x3D;\&quot;object-schema-request-schema\&quot;&gt;   &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Property&lt;/th&gt;       &lt;th&gt;Type&lt;/th&gt;       &lt;th&gt;Description&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody class&#x3D;\&quot;object-schema-table-body\&quot;&gt;     &lt;tr class&#x3D;\&quot;\&quot;&gt;&lt;td&gt;&lt;div class&#x3D;\&quot;property-name\&quot;&gt;   &lt;code class&#x3D;\&quot;property-name\&quot;&gt;po_number&lt;/code&gt; &lt;/div&gt; &lt;/td&gt;&lt;td&gt;&lt;span class&#x3D;\&quot;property-type\&quot;&gt;string&lt;/span&gt;&lt;/td&gt;&lt;td&gt;&lt;p&gt;Reference to the purchase order number within your organization&lt;/p&gt; &lt;/td&gt;&lt;/tr&gt; &lt;tr class&#x3D;\&quot;\&quot;&gt;&lt;td&gt;&lt;div class&#x3D;\&quot;property-name\&quot;&gt;   &lt;code class&#x3D;\&quot;property-name\&quot;&gt;amount&lt;/code&gt; &lt;/div&gt; &lt;/td&gt;&lt;td&gt;&lt;span class&#x3D;\&quot;property-type\&quot;&gt;number&lt;/span&gt; &lt;span class&#x3D;\&quot;property-format\&quot;&gt;double&lt;/span&gt;&lt;/td&gt;&lt;td&gt;&lt;p&gt;Amount of the invoice in USD&lt;/p&gt; &lt;/td&gt;&lt;/tr&gt; &lt;tr class&#x3D;\&quot;\&quot;&gt;&lt;td&gt;&lt;div class&#x3D;\&quot;property-name\&quot;&gt;   &lt;code class&#x3D;\&quot;property-name\&quot;&gt;memo&lt;/code&gt; &lt;/div&gt; &lt;/td&gt;&lt;td&gt;&lt;span class&#x3D;\&quot;property-type\&quot;&gt;string&lt;/span&gt;&lt;/td&gt;&lt;td&gt;&lt;p&gt;A note to be included in the invoice. This is for your internal use and will not be visible to the recipient.&lt;/p&gt; &lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;  &lt;/div&gt;  

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tremendous;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoicesApi;
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
    Double amount = 3.4D; // Amount of the invoice in USD
    String poNumber = "poNumber_example"; // Reference to the purchase order number within your organization
    String memo = "memo_example"; // A note to be included in the invoice. This is for your internal use and will not be visible to the recipient. 
    try {
      InvoicesCreateAndFundAccountBalanceResponse result = client
              .invoices
              .createAndFundAccountBalance(amount)
              .poNumber(poNumber)
              .memo(memo)
              .execute();
      System.out.println(result);
      System.out.println(result.getInvoice());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#createAndFundAccountBalance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InvoicesCreateAndFundAccountBalanceResponse> response = client
              .invoices
              .createAndFundAccountBalance(amount)
              .poNumber(poNumber)
              .memo(memo)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#createAndFundAccountBalance");
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
| **invoicesCreateAndFundAccountBalanceRequest** | [**InvoicesCreateAndFundAccountBalanceRequest**](InvoicesCreateAndFundAccountBalanceRequest.md)| Invoice details | |

### Return type

[**InvoicesCreateAndFundAccountBalanceResponse**](InvoicesCreateAndFundAccountBalanceResponse.md)

### Authorization

[BearerApiKey](../README.md#BearerApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An invoice (to be overwritten in specific reponses) |  -  |

<a name="getAll"></a>
# **getAll**
> InvoicesGetAllResponse getAll().offset(offset).limit(limit).execute();

List invoices

Fetch a list of all invoices on your account.  &gt; 🚧 Deleted invoices are omitted &gt; &gt; The response does not include any previously deleted invoices. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tremendous;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoicesApi;
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
    Integer offset = 10; // Offsets the returned list by the given number of invoices. The returned invoices are ordered (and offsetted) by their creation date (DESC).
    Integer limit = 10; // Limits the number of invoices listed. The maximum and default value is 10.
    try {
      InvoicesGetAllResponse result = client
              .invoices
              .getAll()
              .offset(offset)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getInvoices());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InvoicesGetAllResponse> response = client
              .invoices
              .getAll()
              .offset(offset)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getAll");
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
| **offset** | **Integer**| Offsets the returned list by the given number of invoices. The returned invoices are ordered (and offsetted) by their creation date (DESC). | [optional] |
| **limit** | **Integer**| Limits the number of invoices listed. The maximum and default value is 10. | [optional] |

### Return type

[**InvoicesGetAllResponse**](InvoicesGetAllResponse.md)

### Authorization

[BearerApiKey](../README.md#BearerApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of all invoices in state &#x60;PAID&#x60; or &#x60;OPEN&#x60; |  -  |

<a name="getById"></a>
# **getById**
> InvoicesGetByIdResponse getById(id).execute();

Retrieve invoice

Retrieve an invoice, identified by the given &#x60;id&#x60; in the URL  &gt; 📘 Deleted Invoices &gt; &gt; This endpoint can be used to retrieve details on deleted invoices &gt; that the list of invoices omits. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tremendous;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoicesApi;
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
    String id = "PPS-26873"; // ID of the invoice that should be retrieved
    try {
      InvoicesGetByIdResponse result = client
              .invoices
              .getById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getInvoice());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InvoicesGetByIdResponse> response = client
              .invoices
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getById");
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
| **id** | **String**| ID of the invoice that should be retrieved | |

### Return type

[**InvoicesGetByIdResponse**](InvoicesGetByIdResponse.md)

### Authorization

[BearerApiKey](../README.md#BearerApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An invoice (to be overwritten in specific reponses) |  -  |

<a name="getCsv"></a>
# **getCsv**
> String getCsv(id).execute();

Retrieve invoice as CSV

Generates a CSV version for an invoice listing the associated rewards and orders 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tremendous;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoicesApi;
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
    String id = "PPS-26873"; // ID of the Invoice for that the CSV should be generated
    try {
      String result = client
              .invoices
              .getCsv(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getCsv");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .invoices
              .getCsv(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getCsv");
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
| **id** | **String**| ID of the Invoice for that the CSV should be generated | |

### Return type

**String**

### Authorization

[BearerApiKey](../README.md#BearerApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | CSV for the specified Invoice |  * Content-Disposition -  <br>  |

<a name="getPdf"></a>
# **getPdf**
> File getPdf(id).execute();

Retrieve invoice as PDF

Generates a PDF version for an invoice 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tremendous;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoicesApi;
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
    String id = "PPS-26873"; // ID of the Invoice for that the PDF should be generated
    try {
      File result = client
              .invoices
              .getPdf(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getPdf");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<File> response = client
              .invoices
              .getPdf(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getPdf");
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
| **id** | **String**| ID of the Invoice for that the PDF should be generated | |

### Return type

[**File**](File.md)

### Authorization

[BearerApiKey](../README.md#BearerApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | PDF for the specified Invoice |  * Content-Disposition -  <br>  |

<a name="removeInvoice"></a>
# **removeInvoice**
> InvoicesRemoveInvoiceResponse removeInvoice(id).execute();

Delete invoice

Removes an invoice. This has no further consequences but is a rather cosmetic operation. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tremendous;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InvoicesApi;
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
    String id = "PPS-26873"; // ID of the invoice that should be retrieved
    try {
      InvoicesRemoveInvoiceResponse result = client
              .invoices
              .removeInvoice(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getInvoice());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#removeInvoice");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InvoicesRemoveInvoiceResponse> response = client
              .invoices
              .removeInvoice(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#removeInvoice");
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
| **id** | **String**| ID of the invoice that should be retrieved | |

### Return type

[**InvoicesRemoveInvoiceResponse**](InvoicesRemoveInvoiceResponse.md)

### Authorization

[BearerApiKey](../README.md#BearerApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An invoice (to be overwritten in specific reponses) |  -  |

