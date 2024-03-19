

# OrdersCreateOrder202ResponseOrder

An order wraps around the fulfilment of one or more rewards.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Tremendous ID of the order |  |
|**externalId** | **String** | Reference for this order, supplied by the customer.  When set, &#x60;external_id&#x60; makes order idempotent. All requests that use the same &#x60;external_id&#x60; after the initial order creation, will result in a response that returns the data of the initially created order. The response will have a &#x60;201&#x60; response code. These responses **fail** to create any further orders.  It also allows for retrieving by &#x60;external_id&#x60; instead of &#x60;id&#x60; only.  |  [optional] |
|**campaignId** | **String** | ID of the campaign in your account, that defines the available products (different gift cards, charity, etc.) that the recipient can choose from.  |  [optional] |
|**createdAt** | **OffsetDateTime** | Date the order has been created |  |
|**status** | [**StatusEnum**](#StatusEnum) | Execution status of a given order  &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;         Status       &lt;/th&gt;       &lt;th&gt;         Description       &lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td&gt;         &lt;code&gt;           CANCELED         &lt;/code&gt;       &lt;/td&gt;       &lt;td&gt;         The order and all of its rewards were canceled.       &lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;         &lt;code&gt;           CART         &lt;/code&gt;       &lt;/td&gt;       &lt;td&gt;         The order has been created, but hasn&#39;t yet been processed.       &lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;         &lt;code&gt;           EXECUTED         &lt;/code&gt;       &lt;/td&gt;       &lt;td&gt;         The order has been executed. Payment has been handled and rewards are being delivered (if applicable).       &lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;         &lt;code&gt;           FAILED         &lt;/code&gt;       &lt;/td&gt;       &lt;td&gt;         The order could not be processed due to an error. E.g. due to insufficient funds in the account.       &lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;         &lt;code&gt;           PENDING APPROVAL         &lt;/code&gt;       &lt;/td&gt;       &lt;td&gt;         The order has been created but needs approval to be executed.       &lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;         &lt;code&gt;           PENDING INTERNAL PAYMENT APPROVAL         &lt;/code&gt;       &lt;/td&gt;       &lt;td&gt;         The order has been created but it is under review and requires approval from our team.       &lt;/td&gt;     &lt;/tr&gt;    &lt;/tbody&gt; &lt;/table&gt;  |  |
|**payment** | [**OrdersCreateOrder202ResponseOrderPayment**](OrdersCreateOrder202ResponseOrderPayment.md) |  |  [optional] |
|**invoiceId** | **String** | The ID for the invoice associated with this order |  [optional] |
|**rewards** | [**List&lt;OrdersCreateOrder202ResponseOrderRewardsInner&gt;**](OrdersCreateOrder202ResponseOrderRewardsInner.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CANCELED | &quot;CANCELED&quot; |
| CART | &quot;CART&quot; |
| EXECUTED | &quot;EXECUTED&quot; |
| FAILED | &quot;FAILED&quot; |
| PENDING_APPROVAL | &quot;PENDING APPROVAL&quot; |
| PENDING_INTERNAL_PAYMENT_APPROVAL | &quot;PENDING INTERNAL PAYMENT APPROVAL&quot; |



