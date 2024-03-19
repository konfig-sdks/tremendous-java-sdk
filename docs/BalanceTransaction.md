

# BalanceTransaction

A balance transaction represents a specific movement or change in an account's balance. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A brief description of the transaction |  [optional] |
|**createdAt** | **LocalDate** | Date that the transaction was created |  [optional] |
|**amount** | **Double** | Amount of the transaction in USD |  [optional] |
|**balance** | **Double** | The updated total after the transaction. Note that this running balance may be delayed and contain &#x60;null&#x60;. |  [optional] |
|**action** | **String** | The action that was performed |  [optional] |



