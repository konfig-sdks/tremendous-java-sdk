

# OrdersRejectByIdResponseOrderReward

A single reward, sent to a recipient. A reward is always part of an order.  Either `products` or `campaign_id` must be specified. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Tremendous ID of the reward |  [optional] |
|**orderId** | **String** | Tremendous ID of the order this reward is part of. |  [optional] |
|**createdAt** | **OffsetDateTime** | Date the reward was created |  [optional] |
|**value** | [**OrdersRejectByIdResponseOrderRewardValue**](OrdersRejectByIdResponseOrderRewardValue.md) |  |  [optional] |
|**recipient** | [**OrdersRejectByIdResponseOrderRewardRecipient**](OrdersRejectByIdResponseOrderRewardRecipient.md) |  |  [optional] |
|**deliverAt** | **LocalDate** | Timestamp of reward delivery within the next year. Note that if date-time is provided, the time values will be ignored. |  [optional] |
|**customFields** | [**List&lt;OrdersRejectByIdResponseOrderRewardCustomFieldsInner&gt;**](OrdersRejectByIdResponseOrderRewardCustomFieldsInner.md) |  |  [optional] |
|**delivery** | [**RewardsListAllRewardsResponseRewardsInnerDelivery**](RewardsListAllRewardsResponseRewardsInnerDelivery.md) |  |  [optional] |



