

# OrganizationsCreateNewOrganizationResponseOrganization

Organizations are a way to separate different parts of your business within the same Tremendous account. Your root Tremendous account is an organization itself and can have multiple sub-organizations.  You can assign users in your Tremendous team as members to any organization. Users can be members of multiple organizations at once.  Each organizations can have it's own API key. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**name** | **String** | Name of the organization |  |
|**website** | **URI** | URL of the website of that organization |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the organization. Organizations need to be approved to be able to use them to send out rewards. |  [optional] |
|**createdAt** | **LocalDate** | Timestamp of when the organization has been created.  *This field is only returned when creating an organization.* It is not returned anymore when retrieving or listing organizations.  |  [optional] |
|**apiKey** | **String** | The API key for the created organization. This property is only returned when &#x60;with_api_key&#x60; is set to &#x60;true&#x60;.  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |



