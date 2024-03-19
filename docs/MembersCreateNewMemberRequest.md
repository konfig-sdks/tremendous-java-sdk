

# MembersCreateNewMemberRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** | Email address of the member |  |
|**name** | **String** | Full name of the member |  |
|**role** | [**RoleEnum**](#RoleEnum) | Role of the member within the organization.  &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Role&lt;/th&gt;       &lt;th&gt;Description&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;MEMBER&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Limited permissions. Can view their own reward and order histories only.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;ADMIN&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Update organization settings, invite other members to the organization, and view all member order and reward histories within their organization.&lt;/td&gt;     &lt;/tr&gt;   &lt;tbody&gt; &lt;/table&gt;  |  |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| MEMBER | &quot;MEMBER&quot; |
| ADMIN | &quot;ADMIN&quot; |



