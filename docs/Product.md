

# Product

A product represents one way to payout a reward to it's recipient. Think:  * Amazon.com gift card (ID: `OKMHM2X2OHYV`) * Donations to Save the Children (ID: `ESRNAD533W5A`) * Virtual Visa debit card (ID: `Q24BD9EZ332JT`)  each of which is one specific product on Tremendous.  > 📘 All available products > > See this [list](https://www.tremendous.com/catalog)  Products can be limited in their availability to recipients by  * geography (field `countries`) * currency (field `currencies`) * amount of the reward (field `skus`)   * e.g. adidas gift cards accept any amount between 5 and 200 USD.  See the description of each respective parameter for further details. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Detailed description of the product. Mostly used for products with a &#x60;category&#x60; of &#x60;charities&#x60;. |  |
|**id** | **String** |  |  [readonly] |
|**name** | **String** | Name of the product |  |
|**category** | [**CategoryEnum**](#CategoryEnum) | The category of this product  &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Category&lt;/th&gt;       &lt;th&gt;Description&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;ach&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Bank transfer to the recipient&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;charity&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Donations to a charity&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;merchant_card&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;A gift card for a certain merchant (e.g. Amazon)&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;paypal&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Payout via PayPal&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;venmo&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Payout via Venmo&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;visa_card&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Payout in form of a Visa debit card&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;  |  |
|**disclosure** | **String** | Legal disclosures for this product. Can be in HTML format. |  |
|**skus** | [**List&lt;ProductSkusInner&gt;**](ProductSkusInner.md) | Products may are restricted in their usage based on the amount of the reward. The &#x60;skus&#x60; array defines bands of denominations in which this product may be used for payouts.  |  [optional] |
|**currencyCodes** | [**List&lt;CurrencyCodesEnum&gt;**](#List&lt;CurrencyCodesEnum&gt;) | Available currencies for this product |  |
|**countries** | [**List&lt;ProductCountriesInner&gt;**](ProductCountriesInner.md) | List of countries in which this product is available to recipients. |  |
|**images** | [**List&lt;ProductImagesInner&gt;**](ProductImagesInner.md) | List of product images associated with this product (e.g. logos or images of the gift cards) |  |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| ACH | &quot;ach&quot; |
| CHARITY | &quot;charity&quot; |
| MERCHANT_CARD | &quot;merchant_card&quot; |
| PAYPAL | &quot;paypal&quot; |
| VENMO | &quot;venmo&quot; |
| VISA_CARD | &quot;visa_card&quot; |



## Enum: List&lt;CurrencyCodesEnum&gt;

| Name | Value |
|---- | -----|
| USD | &quot;USD&quot; |
| CAD | &quot;CAD&quot; |
| EUR | &quot;EUR&quot; |
| AED | &quot;AED&quot; |
| AFN | &quot;AFN&quot; |
| ALL | &quot;ALL&quot; |
| AMD | &quot;AMD&quot; |
| ARS | &quot;ARS&quot; |
| AUD | &quot;AUD&quot; |
| AZN | &quot;AZN&quot; |
| BAM | &quot;BAM&quot; |
| BDT | &quot;BDT&quot; |
| BGN | &quot;BGN&quot; |
| BHD | &quot;BHD&quot; |
| BIF | &quot;BIF&quot; |
| BND | &quot;BND&quot; |
| BOB | &quot;BOB&quot; |
| BRL | &quot;BRL&quot; |
| BWP | &quot;BWP&quot; |
| BYR | &quot;BYR&quot; |
| BZD | &quot;BZD&quot; |
| CDF | &quot;CDF&quot; |
| CHF | &quot;CHF&quot; |
| CLP | &quot;CLP&quot; |
| CNY | &quot;CNY&quot; |
| COP | &quot;COP&quot; |
| CRC | &quot;CRC&quot; |
| CVE | &quot;CVE&quot; |
| CZK | &quot;CZK&quot; |
| DJF | &quot;DJF&quot; |
| DKK | &quot;DKK&quot; |
| DOP | &quot;DOP&quot; |
| DZD | &quot;DZD&quot; |
| EEK | &quot;EEK&quot; |
| EGP | &quot;EGP&quot; |
| ERN | &quot;ERN&quot; |
| ETB | &quot;ETB&quot; |
| GBP | &quot;GBP&quot; |
| GEL | &quot;GEL&quot; |
| GHS | &quot;GHS&quot; |
| GNF | &quot;GNF&quot; |
| GTQ | &quot;GTQ&quot; |
| HKD | &quot;HKD&quot; |
| HNL | &quot;HNL&quot; |
| HRK | &quot;HRK&quot; |
| HUF | &quot;HUF&quot; |
| IDR | &quot;IDR&quot; |
| ILS | &quot;ILS&quot; |
| INR | &quot;INR&quot; |
| IQD | &quot;IQD&quot; |
| IRR | &quot;IRR&quot; |
| ISK | &quot;ISK&quot; |
| JMD | &quot;JMD&quot; |
| JOD | &quot;JOD&quot; |
| JPY | &quot;JPY&quot; |
| KES | &quot;KES&quot; |
| KHR | &quot;KHR&quot; |
| KRW | &quot;KRW&quot; |
| KWD | &quot;KWD&quot; |
| KZT | &quot;KZT&quot; |
| LBP | &quot;LBP&quot; |
| LKR | &quot;LKR&quot; |
| LTL | &quot;LTL&quot; |
| LVL | &quot;LVL&quot; |
| MAD | &quot;MAD&quot; |
| MDL | &quot;MDL&quot; |
| MGA | &quot;MGA&quot; |
| MKD | &quot;MKD&quot; |
| MMK | &quot;MMK&quot; |
| MOP | &quot;MOP&quot; |
| MUR | &quot;MUR&quot; |
| MXN | &quot;MXN&quot; |
| MYR | &quot;MYR&quot; |
| MZN | &quot;MZN&quot; |
| NAD | &quot;NAD&quot; |
| NGN | &quot;NGN&quot; |
| NIO | &quot;NIO&quot; |
| NOK | &quot;NOK&quot; |
| NPR | &quot;NPR&quot; |
| NZD | &quot;NZD&quot; |
| OMR | &quot;OMR&quot; |
| PAB | &quot;PAB&quot; |
| PEN | &quot;PEN&quot; |
| PHP | &quot;PHP&quot; |
| PKR | &quot;PKR&quot; |
| PLN | &quot;PLN&quot; |
| PYG | &quot;PYG&quot; |
| QAR | &quot;QAR&quot; |
| RON | &quot;RON&quot; |
| RSD | &quot;RSD&quot; |
| RUB | &quot;RUB&quot; |
| RWF | &quot;RWF&quot; |
| SAR | &quot;SAR&quot; |
| SDG | &quot;SDG&quot; |
| SEK | &quot;SEK&quot; |
| SGD | &quot;SGD&quot; |
| SOS | &quot;SOS&quot; |
| SYP | &quot;SYP&quot; |
| THB | &quot;THB&quot; |
| TND | &quot;TND&quot; |
| TOP | &quot;TOP&quot; |
| TRY | &quot;TRY&quot; |
| TTD | &quot;TTD&quot; |
| TWD | &quot;TWD&quot; |
| TZS | &quot;TZS&quot; |
| UAH | &quot;UAH&quot; |
| UGX | &quot;UGX&quot; |
| UYU | &quot;UYU&quot; |
| UZS | &quot;UZS&quot; |
| VEF | &quot;VEF&quot; |
| VND | &quot;VND&quot; |
| XAF | &quot;XAF&quot; |
| XOF | &quot;XOF&quot; |
| YER | &quot;YER&quot; |
| ZAR | &quot;ZAR&quot; |
| ZMK | &quot;ZMK&quot; |



