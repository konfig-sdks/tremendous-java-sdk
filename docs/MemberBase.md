

# MemberBase

Each organization has one or more users that can access and manage that organization. These users are called members.  Members can take actions via the Tremendous web dashboard directly.  These actions include adding funding sources to the organization, creating Campaigns, and more. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [readonly] |
|**email** | **String** | Email address of the member |  |
|**name** | **String** | Full name of the member |  |
|**role** | [**RoleEnum**](#RoleEnum) | Role of the member within the organization.  &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Role&lt;/th&gt;       &lt;th&gt;Description&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;MEMBER&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Limited permissions. Can view their own reward and order histories only.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;ADMIN&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Update organization settings, invite other members to the organization, and view all member order and reward histories within their organization.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;DELETED&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;No longer a member of this organization.&lt;/td&gt;     &lt;/tr&gt;   &lt;tbody&gt;   &lt;/tbody&gt; &lt;/table&gt;  |  |
|**status** | [**StatusEnum**](#StatusEnum) | Current status of the member&#39;s account.  When creating a member it starts out in the status &#x60;INVITED&#x60;. As soon as that member open the invitation link and registers an account, the status switches to &#x60;REGISTERED&#x60;.  |  [readonly] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| MEMBER | &quot;MEMBER&quot; |
| ADMIN | &quot;ADMIN&quot; |
| DELETED | &quot;DELETED&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| REGISTERED | &quot;REGISTERED&quot; |
| INVITED | &quot;INVITED&quot; |



