# OrdersApi

All URIs are relative to *https://testflight.tremendous.com/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**approveOrderById**](OrdersApi.md#approveOrderById) | **POST** /order_approvals/{id}/approve | Approve order |
| [**createOrder**](OrdersApi.md#createOrder) | **POST** /orders | Create order |
| [**getList**](OrdersApi.md#getList) | **GET** /orders | List orders |
| [**getOrderById**](OrdersApi.md#getOrderById) | **GET** /orders/{id} | Retrieve order |
| [**rejectById**](OrdersApi.md#rejectById) | **POST** /order_approvals/{id}/reject | Reject order |


<a name="approveOrderById"></a>
# **approveOrderById**
> OrdersApproveOrderByIdResponse approveOrderById(id).execute();

Approve order

Approves an order that is pending review, identified by the given &#x60;id&#x60; in the URL.  Approvals is a feature that requires orders to be approved by an organization admin before they are sent out. To enable approvals for your organization, please enable &#39;Allow approvals via API&#39; via the organization&#39;&#39;s &#39;Order Approvals&#39; settings from the Tremendous dashboard. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tremendous;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrdersApi;
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
    String id = "SOMEIDSOMEID"; // ID of the order that should be approved. In case the order has an `external_id` reference supplied by the customer on creation, it's possible to use it instead.
    try {
      OrdersApproveOrderByIdResponse result = client
              .orders
              .approveOrderById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getOrder());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#approveOrderById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrdersApproveOrderByIdResponse> response = client
              .orders
              .approveOrderById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#approveOrderById");
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
| **id** | **String**| ID of the order that should be approved. In case the order has an &#x60;external_id&#x60; reference supplied by the customer on creation, it&#39;s possible to use it instead. | |

### Return type

[**OrdersApproveOrderByIdResponse**](OrdersApproveOrderByIdResponse.md)

### Authorization

[BearerApiKey](../README.md#BearerApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An order (to be overwritten in specific reponses) |  -  |

<a name="createOrder"></a>
# **createOrder**
> OrdersCreateOrderResponse createOrder(ordersCreateOrderRequest).execute();

Create order

Every time you want to send out a reward through Tremendous you need to create an order for it.  &gt; 📘 Getting started with your first order &gt; &gt; Our step-by-step guide walks you through everything you need &gt; to send your first gift card through the Tremendous API: &gt; &gt; &lt;strong&gt;&lt;a style&#x3D;\&quot;display: block; margin-top: 20px;\&quot; href&#x3D;\&quot;/docs/sending-rewards-intro\&quot;&gt;Check it out!&lt;/a&gt;&lt;/strong&gt;  ## Request body  &lt;div class&#x3D;\&quot;object-schema-request-schema\&quot;&gt;   &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Property&lt;/th&gt;       &lt;th&gt;Type&lt;/th&gt;       &lt;th&gt;Description&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody class&#x3D;\&quot;object-schema-table-body\&quot;&gt;     &lt;tr class&#x3D;\&quot;\&quot;&gt;&lt;td&gt;&lt;div class&#x3D;\&quot;property-name\&quot;&gt;   &lt;code class&#x3D;\&quot;property-name\&quot;&gt;external_id&lt;/code&gt; &lt;/div&gt; &lt;/td&gt;&lt;td&gt;&lt;span class&#x3D;\&quot;property-type\&quot;&gt;string&lt;/span&gt;&lt;/td&gt;&lt;td&gt;&lt;p&gt;Reference for this order, supplied by the customer.&lt;/p&gt;  &lt;p&gt;When set, &lt;code&gt;external_id&lt;/code&gt; makes order idempotent. All requests that use the same &lt;code&gt;external_id&lt;/code&gt; after the initial order creation, will result in a response that returns the data of the initially created order. The response will have a &lt;code&gt;201&lt;/code&gt; response code. These responses &lt;strong&gt;fail&lt;/strong&gt; to create any further orders.&lt;/p&gt;  &lt;p&gt;It also allows for retrieving by &lt;code&gt;external_id&lt;/code&gt; instead of &lt;code&gt;id&lt;/code&gt; only.&lt;/p&gt; &lt;/td&gt;&lt;/tr&gt; &lt;tr class&#x3D;\&quot;\&quot;&gt;&lt;td&gt;&lt;div class&#x3D;\&quot;property-name\&quot;&gt;   &lt;code class&#x3D;\&quot;property-name\&quot;&gt;payment&lt;/code&gt; &lt;/div&gt; &lt;/td&gt;&lt;td&gt;&lt;span class&#x3D;\&quot;property-type\&quot;&gt;object&lt;/span&gt;&lt;/td&gt;&lt;td&gt;&lt;/td&gt;&lt;/tr&gt;  &lt;tr&gt;     &lt;td colspan&#x3D;\&quot;3\&quot;&gt;       &lt;details&gt;         &lt;summary&gt;Show object properties&lt;/summary&gt;         &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Property&lt;/th&gt;       &lt;th&gt;Type&lt;/th&gt;       &lt;th&gt;Description&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody class&#x3D;\&quot;object-schema-table-body\&quot;&gt;     &lt;tr class&#x3D;\&quot;\&quot;&gt;&lt;td&gt;&lt;div class&#x3D;\&quot;property-name\&quot;&gt;   &lt;code class&#x3D;\&quot;property-name\&quot;&gt;funding_source_id&lt;/code&gt; &lt;/div&gt; &lt;/td&gt;&lt;td&gt;&lt;span class&#x3D;\&quot;property-type\&quot;&gt;string&lt;/span&gt;&lt;/td&gt;&lt;td&gt;&lt;p&gt;Tremendous ID of the funding source that will be used to pay for the order. Use &lt;code&gt;balance&lt;/code&gt; to use your Tremendous&amp;#39;s balance.&lt;/p&gt; &lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;  &lt;/tr&gt;  &lt;tr class&#x3D;\&quot;\&quot;&gt;&lt;td&gt;&lt;div class&#x3D;\&quot;property-name\&quot;&gt;   &lt;code class&#x3D;\&quot;property-name\&quot;&gt;reward&lt;/code&gt; &lt;/div&gt; &lt;/td&gt;&lt;td&gt;&lt;span class&#x3D;\&quot;property-type\&quot;&gt;object&lt;/span&gt;&lt;/td&gt;&lt;td&gt;&lt;p&gt;A single reward, sent to a recipient. A reward is always part of an order.&lt;/p&gt;  &lt;p&gt;Either &lt;code&gt;products&lt;/code&gt; or &lt;code&gt;campaign_id&lt;/code&gt; must be specified.&lt;/p&gt; &lt;/td&gt;&lt;/tr&gt;  &lt;tr&gt;     &lt;td colspan&#x3D;\&quot;3\&quot;&gt;       &lt;details&gt;         &lt;summary&gt;Show object properties&lt;/summary&gt;         &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Property&lt;/th&gt;       &lt;th&gt;Type&lt;/th&gt;       &lt;th&gt;Description&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody class&#x3D;\&quot;object-schema-table-body\&quot;&gt;     &lt;tr class&#x3D;\&quot;property-conditional-hint-response-only\&quot;&gt;&lt;td&gt;&lt;div class&#x3D;\&quot;property-name\&quot;&gt;   &lt;code class&#x3D;\&quot;property-name\&quot;&gt;id&lt;/code&gt; &lt;/div&gt; &lt;/td&gt;&lt;td&gt;&lt;span class&#x3D;\&quot;property-type\&quot;&gt;string&lt;/span&gt;&lt;/td&gt;&lt;td&gt;&lt;p&gt;Tremendous ID of the reward&lt;/p&gt; &lt;/td&gt;&lt;/tr&gt; &lt;tr class&#x3D;\&quot;property-conditional-hint-response-only\&quot;&gt;&lt;td&gt;&lt;div class&#x3D;\&quot;property-name\&quot;&gt;   &lt;code class&#x3D;\&quot;property-name\&quot;&gt;order_id&lt;/code&gt; &lt;/div&gt; &lt;/td&gt;&lt;td&gt;&lt;span class&#x3D;\&quot;property-type\&quot;&gt;string&lt;/span&gt;&lt;/td&gt;&lt;td&gt;&lt;p&gt;Tremendous ID of the order this reward is part of.&lt;/p&gt; &lt;/td&gt;&lt;/tr&gt; &lt;tr class&#x3D;\&quot;property-conditional-hint-response-only\&quot;&gt;&lt;td&gt;&lt;div class&#x3D;\&quot;property-name\&quot;&gt;   &lt;code class&#x3D;\&quot;property-name\&quot;&gt;created_at&lt;/code&gt; &lt;/div&gt; &lt;/td&gt;&lt;td&gt;&lt;span class&#x3D;\&quot;property-type\&quot;&gt;string&lt;/span&gt; &lt;span class&#x3D;\&quot;property-format\&quot;&gt;date-time&lt;/span&gt;&lt;/td&gt;&lt;td&gt;&lt;p&gt;Date the reward was created&lt;/p&gt; &lt;/td&gt;&lt;/tr&gt; &lt;tr class&#x3D;\&quot;property-conditional-hint-request-only\&quot;&gt;&lt;td&gt;&lt;div class&#x3D;\&quot;property-name\&quot;&gt;   &lt;code class&#x3D;\&quot;property-name\&quot;&gt;campaign_id&lt;/code&gt; &lt;/div&gt; &lt;/td&gt;&lt;td&gt;&lt;span class&#x3D;\&quot;property-type\&quot;&gt;string&lt;/span&gt;&lt;/td&gt;&lt;td&gt;&lt;p&gt;ID of the campaign in your account, that defines the available products (different gift cards, charity, etc.) that the recipient can choose from.&lt;/p&gt; &lt;/td&gt;&lt;/tr&gt; &lt;tr class&#x3D;\&quot;property-conditional-hint-request-only\&quot;&gt;&lt;td&gt;&lt;div class&#x3D;\&quot;property-name\&quot;&gt;   &lt;code class&#x3D;\&quot;property-name\&quot;&gt;products&lt;/code&gt; &lt;/div&gt; &lt;/td&gt;&lt;td&gt;&lt;span class&#x3D;\&quot;property-type\&quot;&gt;array&lt;/span&gt; &lt;span class&#x3D;\&quot;property-format\&quot;&gt;string&lt;/span&gt;&lt;/td&gt;&lt;td&gt;&lt;p&gt;List of IDs of product (different gift cards, charity, etc.) that will be available to the recipient to choose from.&lt;/p&gt;  &lt;p&gt;Providing a &lt;code&gt;products&lt;/code&gt; array will override the products made available by the campaign specified using the &lt;code&gt;campaign_id&lt;/code&gt; property unless the &lt;code&gt;products&lt;/code&gt; array is empty. It will &lt;em&gt;not&lt;/em&gt; override other campaign attributes, like the message and customization of the look and feel.&lt;/p&gt; &lt;/td&gt;&lt;/tr&gt; &lt;tr class&#x3D;\&quot;\&quot;&gt;&lt;td&gt;&lt;div class&#x3D;\&quot;property-name\&quot;&gt;   &lt;code class&#x3D;\&quot;property-name\&quot;&gt;value&lt;/code&gt; &lt;/div&gt; &lt;/td&gt;&lt;td&gt;&lt;span class&#x3D;\&quot;property-type\&quot;&gt;object&lt;/span&gt;&lt;/td&gt;&lt;td&gt;&lt;/td&gt;&lt;/tr&gt;  &lt;tr&gt;     &lt;td colspan&#x3D;\&quot;3\&quot;&gt;       &lt;details&gt;         &lt;summary&gt;Show object properties&lt;/summary&gt;         &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Property&lt;/th&gt;       &lt;th&gt;Type&lt;/th&gt;       &lt;th&gt;Description&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody class&#x3D;\&quot;object-schema-table-body\&quot;&gt;     &lt;tr class&#x3D;\&quot;\&quot;&gt;&lt;td&gt;&lt;div class&#x3D;\&quot;property-name\&quot;&gt;   &lt;code class&#x3D;\&quot;property-name\&quot;&gt;denomination&lt;/code&gt; &lt;/div&gt; &lt;/td&gt;&lt;td&gt;&lt;span class&#x3D;\&quot;property-type\&quot;&gt;number&lt;/span&gt; &lt;span class&#x3D;\&quot;property-format\&quot;&gt;double&lt;/span&gt;&lt;/td&gt;&lt;td&gt;&lt;p&gt;Amount of the reward&lt;/p&gt; &lt;/td&gt;&lt;/tr&gt; &lt;tr class&#x3D;\&quot;\&quot;&gt;&lt;td&gt;&lt;div class&#x3D;\&quot;property-name\&quot;&gt;   &lt;code class&#x3D;\&quot;property-name\&quot;&gt;currency_code&lt;/code&gt; &lt;/div&gt; &lt;/td&gt;&lt;td&gt;&lt;span class&#x3D;\&quot;property-type\&quot;&gt;string&lt;/span&gt;&lt;/td&gt;&lt;td&gt;&lt;p&gt;Currency of the reward&lt;/p&gt; &lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;  &lt;/tr&gt;  &lt;tr class&#x3D;\&quot;\&quot;&gt;&lt;td&gt;&lt;div class&#x3D;\&quot;property-name\&quot;&gt;   &lt;code class&#x3D;\&quot;property-name\&quot;&gt;recipient&lt;/code&gt; &lt;/div&gt; &lt;/td&gt;&lt;td&gt;&lt;span class&#x3D;\&quot;property-type\&quot;&gt;object&lt;/span&gt;&lt;/td&gt;&lt;td&gt;&lt;p&gt;Details of the recipient of the reward&lt;/p&gt; &lt;/td&gt;&lt;/tr&gt;  &lt;tr&gt;     &lt;td colspan&#x3D;\&quot;3\&quot;&gt;       &lt;details&gt;         &lt;summary&gt;Show object properties&lt;/summary&gt;         &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Property&lt;/th&gt;       &lt;th&gt;Type&lt;/th&gt;       &lt;th&gt;Description&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody class&#x3D;\&quot;object-schema-table-body\&quot;&gt;     &lt;tr class&#x3D;\&quot;\&quot;&gt;&lt;td&gt;&lt;div class&#x3D;\&quot;property-name\&quot;&gt;   &lt;code class&#x3D;\&quot;property-name\&quot;&gt;name&lt;/code&gt; &lt;/div&gt; &lt;/td&gt;&lt;td&gt;&lt;span class&#x3D;\&quot;property-type\&quot;&gt;string&lt;/span&gt;&lt;/td&gt;&lt;td&gt;&lt;p&gt;Name of the recipient&lt;/p&gt; &lt;/td&gt;&lt;/tr&gt; &lt;tr class&#x3D;\&quot;\&quot;&gt;&lt;td&gt;&lt;div class&#x3D;\&quot;property-name\&quot;&gt;   &lt;code class&#x3D;\&quot;property-name\&quot;&gt;email&lt;/code&gt; &lt;/div&gt; &lt;/td&gt;&lt;td&gt;&lt;span class&#x3D;\&quot;property-type\&quot;&gt;string&lt;/span&gt;&lt;/td&gt;&lt;td&gt;&lt;p&gt;Email address of the recipient&lt;/p&gt; &lt;/td&gt;&lt;/tr&gt; &lt;tr class&#x3D;\&quot;\&quot;&gt;&lt;td&gt;&lt;div class&#x3D;\&quot;property-name\&quot;&gt;   &lt;code class&#x3D;\&quot;property-name\&quot;&gt;phone&lt;/code&gt; &lt;/div&gt; &lt;/td&gt;&lt;td&gt;&lt;span class&#x3D;\&quot;property-type\&quot;&gt;string&lt;/span&gt;&lt;/td&gt;&lt;td&gt;&lt;p&gt;Phone number of the recipient. For non-US phone numbers, specify the country code (prefixed with +).&lt;/p&gt; &lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;  &lt;/tr&gt;  &lt;tr class&#x3D;\&quot;\&quot;&gt;&lt;td&gt;&lt;div class&#x3D;\&quot;property-name\&quot;&gt;   &lt;code class&#x3D;\&quot;property-name\&quot;&gt;deliver_at&lt;/code&gt; &lt;/div&gt; &lt;/td&gt;&lt;td&gt;&lt;span class&#x3D;\&quot;property-type\&quot;&gt;string&lt;/span&gt; &lt;span class&#x3D;\&quot;property-format\&quot;&gt;date&lt;/span&gt;&lt;/td&gt;&lt;td&gt;&lt;p&gt;Timestamp of reward delivery within the next year. Note that if date-time is provided, the time values will be ignored.&lt;/p&gt; &lt;/td&gt;&lt;/tr&gt; &lt;tr class&#x3D;\&quot;\&quot;&gt;&lt;td&gt;&lt;div class&#x3D;\&quot;property-name\&quot;&gt;   &lt;code class&#x3D;\&quot;property-name\&quot;&gt;custom_fields&lt;/code&gt; &lt;/div&gt; &lt;/td&gt;&lt;td&gt;&lt;span class&#x3D;\&quot;property-type\&quot;&gt;array&lt;/span&gt;&lt;/td&gt;&lt;td&gt;&lt;/td&gt;&lt;/tr&gt;  &lt;tr&gt;     &lt;td colspan&#x3D;\&quot;3\&quot;&gt;       &lt;details&gt;         &lt;summary&gt;Show array item type&lt;/summary&gt;         &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Property&lt;/th&gt;       &lt;th&gt;Type&lt;/th&gt;       &lt;th&gt;Description&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody class&#x3D;\&quot;object-schema-table-body\&quot;&gt;     &lt;tr class&#x3D;\&quot;\&quot;&gt;&lt;td&gt;&lt;div class&#x3D;\&quot;property-name\&quot;&gt;   &lt;code class&#x3D;\&quot;property-name\&quot;&gt;id&lt;/code&gt; &lt;/div&gt; &lt;/td&gt;&lt;td&gt;&lt;span class&#x3D;\&quot;property-type\&quot;&gt;string&lt;/span&gt;&lt;/td&gt;&lt;td&gt;&lt;p&gt;Tremendous ID of the custom field&lt;/p&gt; &lt;/td&gt;&lt;/tr&gt; &lt;tr class&#x3D;\&quot;\&quot;&gt;&lt;td&gt;&lt;div class&#x3D;\&quot;property-name\&quot;&gt;   &lt;code class&#x3D;\&quot;property-name\&quot;&gt;value&lt;/code&gt; &lt;/div&gt; &lt;/td&gt;&lt;td&gt;&lt;span class&#x3D;\&quot;property-type\&quot;&gt;string&lt;/span&gt;&lt;/td&gt;&lt;td&gt;&lt;p&gt;Value of the custom field&lt;/p&gt; &lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;  &lt;/tr&gt;  &lt;tr class&#x3D;\&quot;\&quot;&gt;&lt;td&gt;&lt;div class&#x3D;\&quot;property-name\&quot;&gt;   &lt;code class&#x3D;\&quot;property-name\&quot;&gt;language&lt;/code&gt; &lt;/div&gt; &lt;/td&gt;&lt;td&gt;&lt;span class&#x3D;\&quot;property-type\&quot;&gt;string&lt;/span&gt;&lt;/td&gt;&lt;td&gt;&lt;p&gt;Set this to translate the redemption experience for this reward. Pass a 2-letter &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes\&quot;&gt;ISO-639-1 code&lt;/a&gt; for the desired language. Defaults to &lt;code&gt;en&lt;/code&gt;.&lt;/p&gt; &lt;/td&gt;&lt;/tr&gt; &lt;tr class&#x3D;\&quot;\&quot;&gt;&lt;td&gt;&lt;div class&#x3D;\&quot;property-name\&quot;&gt;   &lt;code class&#x3D;\&quot;property-name\&quot;&gt;delivery&lt;/code&gt; &lt;/div&gt; &lt;/td&gt;&lt;td&gt;&lt;span class&#x3D;\&quot;property-type\&quot;&gt;object&lt;/span&gt;&lt;/td&gt;&lt;td&gt;&lt;p&gt;Details on how the reward is delivered to the recipient.&lt;/p&gt; &lt;/td&gt;&lt;/tr&gt;  &lt;tr&gt;     &lt;td colspan&#x3D;\&quot;3\&quot;&gt;       &lt;details&gt;         &lt;summary&gt;Show object properties&lt;/summary&gt;         &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Property&lt;/th&gt;       &lt;th&gt;Type&lt;/th&gt;       &lt;th&gt;Description&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody class&#x3D;\&quot;object-schema-table-body\&quot;&gt;     &lt;tr class&#x3D;\&quot;\&quot;&gt;&lt;td&gt;&lt;div class&#x3D;\&quot;property-name\&quot;&gt;   &lt;code class&#x3D;\&quot;property-name\&quot;&gt;method&lt;/code&gt; &lt;/div&gt; &lt;/td&gt;&lt;td&gt;&lt;span class&#x3D;\&quot;property-type\&quot;&gt;string&lt;/span&gt;&lt;/td&gt;&lt;td&gt;&lt;p&gt;How to deliver the reward to the recipient.&lt;/p&gt;  &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Delivery Method&lt;/th&gt;       &lt;th&gt;Description&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;EMAIL&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Deliver the reward to the recipient by email&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;LINK&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;         &lt;p&gt;Deliver the reward to the recipient via a link.&lt;/p&gt;         &lt;p&gt;The link can be retrieved on a successfully ordered reward via the &lt;code&gt;/rewards&lt;/code&gt; or &lt;code&gt;/rewards/{id}&lt;/code&gt; endpoint. That link must then be  delivered to the recipient out-of-band.&lt;/p&gt;       &lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;PHONE&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Deliver the reward to the recipient by SMS&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; &lt;/td&gt;&lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;  &lt;/tr&gt;    &lt;/tbody&gt; &lt;/table&gt;  &lt;/tr&gt;    &lt;/tbody&gt; &lt;/table&gt;  &lt;/div&gt;   ### Funding sources  There are different ways to pay for gift cards and rewards on Tremendous. Every payment mechanism is called a \&quot;funding source\&quot;.  You can retrieve a list of all available funding sources by using the [Funding sources API endpoint](https://tremendous.readme.io/reference/core-funding-source-index).  The Tremendous API sandbox environment comes with a single funding source that allows you to spend up to $5,000 in *fake money* to test the API. [Learn more about the sandbox environment](https://tremendous.readme.io/reference/sandbox).  The HTTP status code &#x60;200&#x60; on the response will be used to indicate success.  After processing successfully the reward gets queued to be delivered to it&#39;s recipient (for delivery method &#x60;EMAIL&#x60; and &#x60;PHONE&#x60;). Delivery will happen asynchronously, after the response has been sent.  ### Idempotence  Requests issued with the same external_id are idempotent.  Submitting an order with an already existing &#x60;external_id&#x60;, will result in a &#x60;201&#x60; response code. In this case the response will return a representation of the already existing order in the response body. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tremendous;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrdersApi;
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
    OrderForCreatePayment payment = new OrderForCreatePayment();
    OrdersCreateOrderRequestReward reward = new OrdersCreateOrderRequestReward();
    String externalId = "externalId_example"; // Reference for this order, supplied by the customer.  When set, `external_id` makes order idempotent. All requests that use the same `external_id` after the initial order creation, will result in a response that returns the data of the initially created order. The response will have a `201` response code. These responses **fail** to create any further orders.  It also allows for retrieving by `external_id` instead of `id` only. 
    try {
      OrdersCreateOrderResponse result = client
              .orders
              .createOrder(payment, reward)
              .externalId(externalId)
              .execute();
      System.out.println(result);
      System.out.println(result.getOrder());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#createOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrdersCreateOrderResponse> response = client
              .orders
              .createOrder(payment, reward)
              .externalId(externalId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#createOrder");
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
| **ordersCreateOrderRequest** | [**OrdersCreateOrderRequest**](OrdersCreateOrderRequest.md)| Order to create | |

### Return type

[**OrdersCreateOrderResponse**](OrdersCreateOrderResponse.md)

### Authorization

[BearerApiKey](../README.md#BearerApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An order (to be overwritten in specific reponses) |  -  |
| **201** | An order (to be overwritten in specific reponses) |  -  |
| **202** | An order (to be overwritten in specific reponses) |  -  |

<a name="getList"></a>
# **getList**
> OrdersGetListResponse getList().offset(offset).campaignId(campaignId).externalId(externalId).createdAtGte(createdAtGte).createdAtLte(createdAtLte).limit(limit).execute();

List orders

Retrieve a list of orders 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tremendous;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrdersApi;
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
    Integer offset = 10; // Offsets the returned list by the given number of orders. The returned orders are ordered (and offsetted) by their creation date (DESC).
    String campaignId = "IVM0I3WNJJL0"; // Only return results with a matching campaign_id.
    String externalId = "12878"; // Only return results with a matching external_id.
    String createdAtGte = "2023-07-15T18:12:18Z"; // Only return results where the created_at field is greater than or equal to the supplied value. The string needs to be an ISO 8601 datetime.
    String createdAtLte = "2023-08-01T18:12:18Z"; // Only return results where the created_at field is less than or equal to the supplied value. The string needs to be an ISO 8601 datetime.
    Integer limit = 10; // Limits the number of orders listed. The maximum value is 100 and the default is 10.
    try {
      OrdersGetListResponse result = client
              .orders
              .getList()
              .offset(offset)
              .campaignId(campaignId)
              .externalId(externalId)
              .createdAtGte(createdAtGte)
              .createdAtLte(createdAtLte)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getOrders());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrdersGetListResponse> response = client
              .orders
              .getList()
              .offset(offset)
              .campaignId(campaignId)
              .externalId(externalId)
              .createdAtGte(createdAtGte)
              .createdAtLte(createdAtLte)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getList");
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
| **offset** | **Integer**| Offsets the returned list by the given number of orders. The returned orders are ordered (and offsetted) by their creation date (DESC). | [optional] |
| **campaignId** | **String**| Only return results with a matching campaign_id. | [optional] |
| **externalId** | **String**| Only return results with a matching external_id. | [optional] |
| **createdAtGte** | **String**| Only return results where the created_at field is greater than or equal to the supplied value. The string needs to be an ISO 8601 datetime. | [optional] |
| **createdAtLte** | **String**| Only return results where the created_at field is less than or equal to the supplied value. The string needs to be an ISO 8601 datetime. | [optional] |
| **limit** | **Integer**| Limits the number of orders listed. The maximum value is 100 and the default is 10. | [optional] |

### Return type

[**OrdersGetListResponse**](OrdersGetListResponse.md)

### Authorization

[BearerApiKey](../README.md#BearerApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of existing orders. Ordered by creation date (DESC). |  -  |

<a name="getOrderById"></a>
# **getOrderById**
> OrdersGetOrderByIdResponse getOrderById(id).execute();

Retrieve order

Retrieve the order, identified by the given &#x60;id&#x60; in the URL 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tremendous;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrdersApi;
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
    String id = "id_example"; // ID of the order that should be retrieved. In case the order has an `external_id` reference supplied by the customer on creation, it's possible to use it instead. 
    try {
      OrdersGetOrderByIdResponse result = client
              .orders
              .getOrderById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getOrder());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getOrderById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrdersGetOrderByIdResponse> response = client
              .orders
              .getOrderById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getOrderById");
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
| **id** | **String**| ID of the order that should be retrieved. In case the order has an &#x60;external_id&#x60; reference supplied by the customer on creation, it&#39;s possible to use it instead.  | |

### Return type

[**OrdersGetOrderByIdResponse**](OrdersGetOrderByIdResponse.md)

### Authorization

[BearerApiKey](../README.md#BearerApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An order (to be overwritten in specific reponses) |  -  |

<a name="rejectById"></a>
# **rejectById**
> OrdersRejectByIdResponse rejectById(id).execute();

Reject order

Rejects an order that is pending review, identified by the given &#x60;id&#x60; in the URL.  Approvals is a feature that requires orders to be approved by an organization admin before they are sent out. To enable approvals for your organization, please enable &#39;Allow approvals via API&#39; via the organization&#39;&#39;s &#39;Order Approvals&#39; settings from the Tremendous dashboard. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tremendous;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrdersApi;
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
    String id = "SOMEIDSOMEID"; // ID of the order that should be rejected. In case the order has an `external_id` reference supplied by the customer on creation, it's possible to use it instead.
    try {
      OrdersRejectByIdResponse result = client
              .orders
              .rejectById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getOrder());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#rejectById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrdersRejectByIdResponse> response = client
              .orders
              .rejectById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#rejectById");
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
| **id** | **String**| ID of the order that should be rejected. In case the order has an &#x60;external_id&#x60; reference supplied by the customer on creation, it&#39;s possible to use it instead. | |

### Return type

[**OrdersRejectByIdResponse**](OrdersRejectByIdResponse.md)

### Authorization

[BearerApiKey](../README.md#BearerApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An order (to be overwritten in specific reponses) |  -  |

