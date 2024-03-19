

# OrderWithLinkPayment

Cost breakdown of the order (cost of rewards + fees). Cost and fees are always denominated in USD, independent from the currency of the ordered rewards. Note that this property will only appear for processed orders (`status` is `EXECUTED`).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subtotal** | **Double** | Total price of the order before fees (in USD) |  [optional] [readonly] |
|**total** | **Double** | Total price of the order including fees (in USD) |  [optional] [readonly] |
|**fees** | **Double** | Fees for the order (in USD) |  [optional] [readonly] |
|**refund** | [**OrderWithLinkPaymentRefund**](OrderWithLinkPaymentRefund.md) |  |  [optional] |
|**channel** | [**ChannelEnum**](#ChannelEnum) | Name of the channel in which the order was created |  [optional] |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| UI | &quot;UI&quot; |
| API | &quot;API&quot; |
| EMBED | &quot;EMBED&quot; |
| DECIPHER | &quot;DECIPHER&quot; |
| QUALTRICS | &quot;QUALTRICS&quot; |
| TYPEFORM | &quot;TYPEFORM&quot; |
| SURVEY_MONKEY | &quot;SURVEY MONKEY&quot; |



