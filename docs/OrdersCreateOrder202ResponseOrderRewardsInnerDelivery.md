

# OrdersCreateOrder202ResponseOrderRewardsInnerDelivery

Details on how the reward is delivered to the recipient. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**method** | [**MethodEnum**](#MethodEnum) | How to deliver the reward to the recipient.  &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Delivery Method&lt;/th&gt;       &lt;th&gt;Description&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;EMAIL&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Deliver the reward to the recipient by email&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;LINK&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;         &lt;p&gt;Deliver the reward to the recipient via a link.&lt;/p&gt;         &lt;p&gt;The link can be retrieved on a successfully ordered reward via the &lt;code&gt;/rewards&lt;/code&gt; or &lt;code&gt;/rewards/{id}&lt;/code&gt; endpoint. That link must then be  delivered to the recipient out-of-band.&lt;/p&gt;       &lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;PHONE&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Deliver the reward to the recipient by SMS&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;  |  |
|**status** | [**StatusEnum**](#StatusEnum) | Current status of the delivery of the reward:  * &#x60;SCHEDULED&#x60; - Reward is scheduled for delivery and will be delivered soon. * &#x60;FAILED&#x60; - Delivery of reward failed (e.g. email bounced). * &#x60;SUCCEEDED&#x60; - Reward was successfully delivered (email or text message delivered or reward link opened). * &#x60;PENDING&#x60; - Delivery is pending but not yet scheduled.  |  |
|**link** | **String** | Link to redeem the reward at. You need to deliver this link to the recipient.  Only available for rewards for which the &#x60;method&#x60; for delivery is set to &#x60;LINK&#x60;.  |  [optional] |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| EMAIL | &quot;EMAIL&quot; |
| LINK | &quot;LINK&quot; |
| PHONE | &quot;PHONE&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SCHEDULED | &quot;SCHEDULED&quot; |
| FAILED | &quot;FAILED&quot; |
| SUCCEEDED | &quot;SUCCEEDED&quot; |
| PENDING | &quot;PENDING&quot; |



