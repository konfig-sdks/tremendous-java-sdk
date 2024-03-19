

# RewardForOrderCreate

A single reward, sent to a recipient. A reward is always part of an order.  Either `products` or `campaign_id` must be specified. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Tremendous ID of the reward |  [optional] [readonly] |
|**orderId** | **String** | Tremendous ID of the order this reward is part of. |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | Date the reward was created |  [optional] [readonly] |
|**campaignId** | **String** | ID of the campaign in your account, that defines the available products (different gift cards, charity, etc.) that the recipient can choose from.  |  [optional] |
|**products** | **List&lt;String&gt;** | List of IDs of product (different gift cards, charity, etc.) that will be available to the recipient to choose from.  Providing a &#x60;products&#x60; array will override the products made available by the campaign specified using the &#x60;campaign_id&#x60; property unless the &#x60;products&#x60; array is empty. It will _not_ override other campaign attributes, like the message and customization of the look and feel.  |  [optional] |
|**value** | [**RewardForOrderCreateValue**](RewardForOrderCreateValue.md) |  |  [optional] |
|**recipient** | [**RewardForOrderCreateRecipient**](RewardForOrderCreateRecipient.md) |  |  [optional] |
|**deliverAt** | **LocalDate** | Timestamp of reward delivery within the next year. Note that if date-time is provided, the time values will be ignored. |  [optional] |
|**customFields** | [**List&lt;RewardForOrderCreateCustomFieldsInner&gt;**](RewardForOrderCreateCustomFieldsInner.md) |  |  [optional] |
|**language** | **String** | Set this to translate the redemption experience for this reward. Pass a 2-letter [ISO-639-1 code](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) for the desired language. Defaults to &#x60;en&#x60;.  |  [optional] |
|**delivery** | [**RewardForOrderCreateDelivery**](RewardForOrderCreateDelivery.md) |  |  [optional] |


