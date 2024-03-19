

# FundingSourcesGetAllResponseFundingSourcesInnerMeta


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**availableCents** | **Integer** | **Only available when &#x60;method&#x60; is set to &#x60;balance&#x60;.**  Available amount for this funding source (in Cents USD)  |  [optional] |
|**pendingCents** | **Integer** | **Only available when &#x60;method&#x60; is set to &#x60;balance&#x60;.**  Funds that are already registered on your Tremendous account but which have not yet been deposited in your account (e.g. unpaid invoices) (in Cents USD).  |  [optional] |
|**accountholderName** | **String** | **Only available when &#x60;method&#x60; is set to &#x60;bank_account&#x60; or &#x60;credit_card&#x60;.**  Name of the holder of the bank account or credit_card  |  [optional] |
|**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | **Only available when &#x60;method&#x60; is set to &#x60;bank_account&#x60;.**  Is this a checking or savings account  |  [optional] |
|**bankName** | **String** | **Only available when &#x60;method&#x60; is set to &#x60;bank_account&#x60;.**  Name of the bank  |  [optional] |
|**accountNumberMask** | **String** | **Only available when &#x60;method&#x60; is set to &#x60;bank_account&#x60;.**  Last 4 digits of the account number  |  [optional] |
|**accountRoutingMask** | **String** | **Only available when &#x60;method&#x60; is set to &#x60;bank_account&#x60;.**  Last 4 digits of the routing number  |  [optional] |
|**refundable** | **Boolean** | **Only available when &#x60;method&#x60; is set to &#x60;bank_account&#x60;.**  Can refunds be deposited to this bank account  |  [optional] |
|**network** | [**NetworkEnum**](#NetworkEnum) | **Only available when &#x60;method&#x60; is set to &#x60;credit_card&#x60;.**  Network of the credit card  |  [optional] |
|**last4** | **String** | **Only available when &#x60;method&#x60; is set to &#x60;credit_card&#x60;.**  Last 4 digits of the credit card number  |  [optional] |
|**expired** | **Boolean** | **Only available when &#x60;method&#x60; is set to &#x60;credit_card&#x60;.**  Is this credit card expired  |  [optional] |
|**lastPaymentFailedAt** | **OffsetDateTime** | **Only available when &#x60;method&#x60; is set to &#x60;bank_account&#x60; or &#x60;credit_card&#x60;.**  Point in time when the last order failed using this bank account or credit card as a funding source.  |  [optional] |



## Enum: AccountTypeEnum

| Name | Value |
|---- | -----|
| CHECKING | &quot;checking&quot; |
| SAVINGS | &quot;savings&quot; |



## Enum: NetworkEnum

| Name | Value |
|---- | -----|
| MASTERCARD | &quot;MasterCard&quot; |
| AMEX | &quot;Amex&quot; |
| JCB | &quot;JCB&quot; |
| DINER_S_CLUB | &quot;Diner&#39;s Club&quot; |
| VISA | &quot;visa&quot; |
| DISCOVER | &quot;discover&quot; |
| LASER | &quot;laser&quot; |
| ELO | &quot;elo&quot; |
| MAESTRO | &quot;maestro&quot; |
| SOLO | &quot;solo&quot; |



