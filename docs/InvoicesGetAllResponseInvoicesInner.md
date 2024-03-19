

# InvoicesGetAllResponseInvoicesInner

Invoices are instruments to fund your Tremendous account's balance.  Invoices can be created by your organization programatically. Once we receive your payment, the invoice is marked as `PAID` and we add the respective funds to your account's balance. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The invoice number |  |
|**poNumber** | **String** | Reference to the purchase order number within your organization |  [optional] |
|**amount** | **Double** | Amount of the invoice in USD |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status of this invoice  &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Status&lt;/th&gt;       &lt;th&gt;Description&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;DELETED&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Invoice has been deleted by your organization&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;PAID&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Invoice has been paid by your organization&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;OPEN&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Invoice has been created by your organization but has not been paid, yet&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;  |  |
|**orders** | **List&lt;String&gt;** | List of orders related to the invoice (it doesn&#39;t apply to prefunding) |  [optional] |
|**rewards** | **List&lt;String&gt;** | List of rewards related to the invoice (it doesn&#39;t apply to prefunding) |  [optional] |
|**createdAt** | **LocalDate** | Timestamp of when the invoice has been created.  |  |
|**paidAt** | **LocalDate** | Timestamp of when the invoice has been paid.  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DELETED | &quot;DELETED&quot; |
| PAID | &quot;PAID&quot; |
| OPEN | &quot;OPEN&quot; |
| MARKED_AS_PAID | &quot;MARKED_AS_PAID&quot; |



