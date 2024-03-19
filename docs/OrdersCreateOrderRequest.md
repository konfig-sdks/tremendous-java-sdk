

# OrdersCreateOrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**externalId** | **String** | Reference for this order, supplied by the customer.  When set, &#x60;external_id&#x60; makes order idempotent. All requests that use the same &#x60;external_id&#x60; after the initial order creation, will result in a response that returns the data of the initially created order. The response will have a &#x60;201&#x60; response code. These responses **fail** to create any further orders.  It also allows for retrieving by &#x60;external_id&#x60; instead of &#x60;id&#x60; only.  |  [optional] |
|**payment** | [**OrderForCreatePayment**](OrderForCreatePayment.md) |  |  |
|**reward** | [**OrdersCreateOrderRequestReward**](OrdersCreateOrderRequestReward.md) |  |  |



