

# FundingSource



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [readonly] |
|**method** | [**MethodEnum**](#MethodEnum) | You can pay for rewards using different payment methods on Tremendous:  &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Payment Method&lt;/th&gt;       &lt;th&gt;Description&lt;/th&gt;       &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;balance&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Pre-funded balance in your Tremendous account to draw funds from to send rewards to recipients.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;bank_account&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Bank account to draw funds from to send rewards to recipients.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;credit_card&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Credit card to draw funds from to send rewards to recipients.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;invoice&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Send rewards to recipients and pay by invoice.&lt;/td&gt;     &lt;/tr&gt;    &lt;/tbody&gt; &lt;/table&gt;  |  |
|**type** | [**TypeEnum**](#TypeEnum) | **Only available when &#x60;method&#x60; is set to &#x60;invoice&#x60;.**  |  [optional] |
|**meta** | [**FundingSourceMeta**](FundingSourceMeta.md) |  |  |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| BALANCE | &quot;balance&quot; |
| BANK_ACCOUNT | &quot;bank_account&quot; |
| CREDIT_CARD | &quot;credit_card&quot; |
| INVOICE | &quot;invoice&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| COMMERCIAL | &quot;COMMERCIAL&quot; |
| PRO_FORMA | &quot;PRO_FORMA&quot; |
| PREFUNDING_ONLY | &quot;PREFUNDING_ONLY&quot; |



