<div align="left">

[![Visit Tremendous](./header.png)](https://www.tremendous.com&#x2F;)

# [Tremendous](https://www.tremendous.com&#x2F;)

Deliver monetary rewards and incentives to employees, customers, survey participants, and more through the Tremendous API. For organizational tasks, like managing your organization and it's members within Tremendous, please see the Tremendous Organizational API.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Tremendous&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>tremendous-java-sdk</artifactId>
  <version>2</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:tremendous-java-sdk:2"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/tremendous-java-sdk-2.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Tremendous;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BalanceTransactionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://testflight.tremendous.com/api/v2";
    
    // Configure HTTP bearer authorization: BearerApiKey
    configuration.token = "BEARER TOKEN";
    Tremendous client = new Tremendous(configuration);
    Integer offset = 10; // Offsets the returned list by the given number of transactions. The returned transactions are ordered (and offsetted) by their creation date (DESC).
    Integer limit = 10; // Limits the number of transactions listed. The default value is 10.
    String createdAtGte = "2023-07-15T18:00:00Z"; // Only return results where the created_at field is greater than or equal to the supplied value. The string needs to be an ISO 8601 datetime.
    String createdAtLte = "2023-08-01T18:00:00Z"; // Only return results where the created_at field is less than or equal to the supplied value. The string needs to be an ISO 8601 datetime.
    try {
      BalanceTransactionsListAllResponse result = client
              .balanceTransactions
              .listAll()
              .offset(offset)
              .limit(limit)
              .createdAtGte(createdAtGte)
              .createdAtLte(createdAtLte)
              .execute();
      System.out.println(result);
      System.out.println(result.getInvoices());
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceTransactionsApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BalanceTransactionsListAllResponse> response = client
              .balanceTransactions
              .listAll()
              .offset(offset)
              .limit(limit)
              .createdAtGte(createdAtGte)
              .createdAtLte(createdAtLte)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceTransactionsApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://testflight.tremendous.com/api/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BalanceTransactionsApi* | [**listAll**](docs/BalanceTransactionsApi.md#listAll) | **GET** /balance_transactions | List balance transactions
*CampaignsApi* | [**getAll**](docs/CampaignsApi.md#getAll) | **GET** /campaigns | List campaigns
*CampaignsApi* | [**getById**](docs/CampaignsApi.md#getById) | **GET** /campaigns/{id} | Retrieve campaign
*FieldsApi* | [**getCustomFields**](docs/FieldsApi.md#getCustomFields) | **GET** /fields | List fields
*FundingSourcesApi* | [**getAll**](docs/FundingSourcesApi.md#getAll) | **GET** /funding_sources | List funding sources
*FundingSourcesApi* | [**getById**](docs/FundingSourcesApi.md#getById) | **GET** /funding_sources/{id} | Retrieve funding source
*InvoicesApi* | [**createAndFundAccountBalance**](docs/InvoicesApi.md#createAndFundAccountBalance) | **POST** /invoices | Create invoice
*InvoicesApi* | [**getAll**](docs/InvoicesApi.md#getAll) | **GET** /invoices | List invoices
*InvoicesApi* | [**getById**](docs/InvoicesApi.md#getById) | **GET** /invoices/{id} | Retrieve invoice
*InvoicesApi* | [**getCsv**](docs/InvoicesApi.md#getCsv) | **GET** /invoices/{id}/csv | Retrieve invoice as CSV
*InvoicesApi* | [**getPdf**](docs/InvoicesApi.md#getPdf) | **GET** /invoices/{id}/pdf | Retrieve invoice as PDF
*InvoicesApi* | [**removeInvoice**](docs/InvoicesApi.md#removeInvoice) | **DELETE** /invoices/{id} | Delete invoice
*MembersApi* | [**createNewMember**](docs/MembersApi.md#createNewMember) | **POST** /members | Create member
*MembersApi* | [**getMember**](docs/MembersApi.md#getMember) | **GET** /members/{id} | Retrieve member
*MembersApi* | [**listMembers**](docs/MembersApi.md#listMembers) | **GET** /members | List members
*OrdersApi* | [**approveOrderById**](docs/OrdersApi.md#approveOrderById) | **POST** /order_approvals/{id}/approve | Approve order
*OrdersApi* | [**createOrder**](docs/OrdersApi.md#createOrder) | **POST** /orders | Create order
*OrdersApi* | [**getList**](docs/OrdersApi.md#getList) | **GET** /orders | List orders
*OrdersApi* | [**getOrderById**](docs/OrdersApi.md#getOrderById) | **GET** /orders/{id} | Retrieve order
*OrdersApi* | [**rejectById**](docs/OrdersApi.md#rejectById) | **POST** /order_approvals/{id}/reject | Reject order
*OrganizationsApi* | [**createApiKey**](docs/OrganizationsApi.md#createApiKey) | **POST** /organizations/create_api_key | Create API key
*OrganizationsApi* | [**createNewOrganization**](docs/OrganizationsApi.md#createNewOrganization) | **POST** /organizations | Create organization
*OrganizationsApi* | [**getList**](docs/OrganizationsApi.md#getList) | **GET** /organizations | List organizations
*OrganizationsApi* | [**getOrganization**](docs/OrganizationsApi.md#getOrganization) | **GET** /organizations/{id} | Retrieve organization
*ProductsApi* | [**getById**](docs/ProductsApi.md#getById) | **GET** /products/{id} | Retrieve product
*ProductsApi* | [**getList**](docs/ProductsApi.md#getList) | **GET** /products | List products
*RewardsApi* | [**generateEmbedToken**](docs/RewardsApi.md#generateEmbedToken) | **POST** /rewards/{id}/generate_embed_token | Generate a reward token
*RewardsApi* | [**generateLink**](docs/RewardsApi.md#generateLink) | **POST** /rewards/{id}/generate_link | Generate a reward URL
*RewardsApi* | [**getSingleReward**](docs/RewardsApi.md#getSingleReward) | **GET** /rewards/{id} | Retrieve single reward
*RewardsApi* | [**listAllRewards**](docs/RewardsApi.md#listAllRewards) | **GET** /rewards | List rewards
*RewardsApi* | [**resendRewardById**](docs/RewardsApi.md#resendRewardById) | **POST** /rewards/{id}/resend | Resend reward
*WebhooksApi* | [**createWebhook**](docs/WebhooksApi.md#createWebhook) | **POST** /webhooks | Create webhook
*WebhooksApi* | [**getDetails**](docs/WebhooksApi.md#getDetails) | **GET** /webhooks | List webhooks
*WebhooksApi* | [**getDetails_0**](docs/WebhooksApi.md#getDetails_0) | **GET** /webhooks/{id} | Retrieve webhook
*WebhooksApi* | [**listEvents**](docs/WebhooksApi.md#listEvents) | **GET** /webhooks/{id}/events | List events
*WebhooksApi* | [**triggerEvent**](docs/WebhooksApi.md#triggerEvent) | **POST** /webhooks/{id}/simulate | Test webhook


## Documentation for Models

 - [BalanceTransaction](docs/BalanceTransaction.md)
 - [BalanceTransactionsListAllResponse](docs/BalanceTransactionsListAllResponse.md)
 - [BalanceTransactionsListAllResponseInvoicesInner](docs/BalanceTransactionsListAllResponseInvoicesInner.md)
 - [Campaign](docs/Campaign.md)
 - [CampaignsGetAllResponse](docs/CampaignsGetAllResponse.md)
 - [CampaignsGetAllResponseCampaignsInner](docs/CampaignsGetAllResponseCampaignsInner.md)
 - [CampaignsGetByIdResponse](docs/CampaignsGetByIdResponse.md)
 - [CampaignsGetByIdResponseCampaign](docs/CampaignsGetByIdResponseCampaign.md)
 - [CreateInvoice](docs/CreateInvoice.md)
 - [CreateMember](docs/CreateMember.md)
 - [CreateOrganization](docs/CreateOrganization.md)
 - [CreateOrganizationCopySettings](docs/CreateOrganizationCopySettings.md)
 - [CurrencyCodes](docs/CurrencyCodes.md)
 - [CustomField](docs/CustomField.md)
 - [DeliveryDetails](docs/DeliveryDetails.md)
 - [DeliveryDetailsWithLink](docs/DeliveryDetailsWithLink.md)
 - [DeliveryMethod](docs/DeliveryMethod.md)
 - [DeliveryStatus](docs/DeliveryStatus.md)
 - [ErrorModel](docs/ErrorModel.md)
 - [ErrorModelErrors](docs/ErrorModelErrors.md)
 - [Field](docs/Field.md)
 - [FieldsGetCustomFieldsResponse](docs/FieldsGetCustomFieldsResponse.md)
 - [FieldsGetCustomFieldsResponseFieldsInner](docs/FieldsGetCustomFieldsResponseFieldsInner.md)
 - [FundingSource](docs/FundingSource.md)
 - [FundingSourceMeta](docs/FundingSourceMeta.md)
 - [FundingSourcesGetAllResponse](docs/FundingSourcesGetAllResponse.md)
 - [FundingSourcesGetAllResponseFundingSourcesInner](docs/FundingSourcesGetAllResponseFundingSourcesInner.md)
 - [FundingSourcesGetAllResponseFundingSourcesInnerMeta](docs/FundingSourcesGetAllResponseFundingSourcesInnerMeta.md)
 - [FundingSourcesGetByIdResponse](docs/FundingSourcesGetByIdResponse.md)
 - [FundingSourcesGetByIdResponseFundingSource](docs/FundingSourcesGetByIdResponseFundingSource.md)
 - [FundingSourcesGetByIdResponseFundingSourceMeta](docs/FundingSourcesGetByIdResponseFundingSourceMeta.md)
 - [Invoice](docs/Invoice.md)
 - [InvoicesCreateAndFundAccountBalanceRequest](docs/InvoicesCreateAndFundAccountBalanceRequest.md)
 - [InvoicesCreateAndFundAccountBalanceResponse](docs/InvoicesCreateAndFundAccountBalanceResponse.md)
 - [InvoicesCreateAndFundAccountBalanceResponseInvoice](docs/InvoicesCreateAndFundAccountBalanceResponseInvoice.md)
 - [InvoicesGetAllResponse](docs/InvoicesGetAllResponse.md)
 - [InvoicesGetAllResponseInvoicesInner](docs/InvoicesGetAllResponseInvoicesInner.md)
 - [InvoicesGetByIdResponse](docs/InvoicesGetByIdResponse.md)
 - [InvoicesGetByIdResponseInvoice](docs/InvoicesGetByIdResponseInvoice.md)
 - [InvoicesRemoveInvoiceResponse](docs/InvoicesRemoveInvoiceResponse.md)
 - [InvoicesRemoveInvoiceResponseInvoice](docs/InvoicesRemoveInvoiceResponseInvoice.md)
 - [Member](docs/Member.md)
 - [MemberBase](docs/MemberBase.md)
 - [MemberWithEvents](docs/MemberWithEvents.md)
 - [MemberWithEventsEventsInner](docs/MemberWithEventsEventsInner.md)
 - [MemberWithoutEvents](docs/MemberWithoutEvents.md)
 - [MembersCreateNewMemberRequest](docs/MembersCreateNewMemberRequest.md)
 - [MembersCreateNewMemberResponse](docs/MembersCreateNewMemberResponse.md)
 - [MembersCreateNewMemberResponseMember](docs/MembersCreateNewMemberResponseMember.md)
 - [MembersGetMemberResponse](docs/MembersGetMemberResponse.md)
 - [MembersGetMemberResponseMember](docs/MembersGetMemberResponseMember.md)
 - [MembersGetMemberResponseMemberEventsInner](docs/MembersGetMemberResponseMemberEventsInner.md)
 - [MembersListMembersResponse](docs/MembersListMembersResponse.md)
 - [MembersListMembersResponseMembersInner](docs/MembersListMembersResponseMembersInner.md)
 - [Order](docs/Order.md)
 - [OrderBase](docs/OrderBase.md)
 - [OrderBasePayment](docs/OrderBasePayment.md)
 - [OrderBasePaymentRefund](docs/OrderBasePaymentRefund.md)
 - [OrderForCreate](docs/OrderForCreate.md)
 - [OrderForCreatePayment](docs/OrderForCreatePayment.md)
 - [OrderForCreateReward](docs/OrderForCreateReward.md)
 - [OrderForCreateRewardCustomFieldsInner](docs/OrderForCreateRewardCustomFieldsInner.md)
 - [OrderForCreateRewardRecipient](docs/OrderForCreateRewardRecipient.md)
 - [OrderForCreateRewardValue](docs/OrderForCreateRewardValue.md)
 - [OrderPayment](docs/OrderPayment.md)
 - [OrderPaymentRefund](docs/OrderPaymentRefund.md)
 - [OrderReward](docs/OrderReward.md)
 - [OrderRewardCustomFieldsInner](docs/OrderRewardCustomFieldsInner.md)
 - [OrderRewardRecipient](docs/OrderRewardRecipient.md)
 - [OrderRewardValue](docs/OrderRewardValue.md)
 - [OrderStatus](docs/OrderStatus.md)
 - [OrderWithLink](docs/OrderWithLink.md)
 - [OrderWithLinkPayment](docs/OrderWithLinkPayment.md)
 - [OrderWithLinkPaymentRefund](docs/OrderWithLinkPaymentRefund.md)
 - [OrderWithLinkRewardsInner](docs/OrderWithLinkRewardsInner.md)
 - [OrderWithLinkRewardsInnerCustomFieldsInner](docs/OrderWithLinkRewardsInnerCustomFieldsInner.md)
 - [OrderWithLinkRewardsInnerDelivery](docs/OrderWithLinkRewardsInnerDelivery.md)
 - [OrderWithLinkRewardsInnerRecipient](docs/OrderWithLinkRewardsInnerRecipient.md)
 - [OrderWithLinkRewardsInnerValue](docs/OrderWithLinkRewardsInnerValue.md)
 - [OrderWithoutLink](docs/OrderWithoutLink.md)
 - [OrderWithoutLinkPayment](docs/OrderWithoutLinkPayment.md)
 - [OrderWithoutLinkPaymentRefund](docs/OrderWithoutLinkPaymentRefund.md)
 - [OrderWithoutLinkReward](docs/OrderWithoutLinkReward.md)
 - [OrderWithoutLinkRewardCustomFieldsInner](docs/OrderWithoutLinkRewardCustomFieldsInner.md)
 - [OrderWithoutLinkRewardRecipient](docs/OrderWithoutLinkRewardRecipient.md)
 - [OrderWithoutLinkRewardValue](docs/OrderWithoutLinkRewardValue.md)
 - [OrdersApproveOrderByIdResponse](docs/OrdersApproveOrderByIdResponse.md)
 - [OrdersApproveOrderByIdResponseOrder](docs/OrdersApproveOrderByIdResponseOrder.md)
 - [OrdersApproveOrderByIdResponseOrderPayment](docs/OrdersApproveOrderByIdResponseOrderPayment.md)
 - [OrdersApproveOrderByIdResponseOrderPaymentRefund](docs/OrdersApproveOrderByIdResponseOrderPaymentRefund.md)
 - [OrdersApproveOrderByIdResponseOrderReward](docs/OrdersApproveOrderByIdResponseOrderReward.md)
 - [OrdersApproveOrderByIdResponseOrderRewardCustomFieldsInner](docs/OrdersApproveOrderByIdResponseOrderRewardCustomFieldsInner.md)
 - [OrdersApproveOrderByIdResponseOrderRewardRecipient](docs/OrdersApproveOrderByIdResponseOrderRewardRecipient.md)
 - [OrdersApproveOrderByIdResponseOrderRewardValue](docs/OrdersApproveOrderByIdResponseOrderRewardValue.md)
 - [OrdersCreateOrder201Response](docs/OrdersCreateOrder201Response.md)
 - [OrdersCreateOrder201ResponseOrder](docs/OrdersCreateOrder201ResponseOrder.md)
 - [OrdersCreateOrder201ResponseOrderPayment](docs/OrdersCreateOrder201ResponseOrderPayment.md)
 - [OrdersCreateOrder201ResponseOrderPaymentRefund](docs/OrdersCreateOrder201ResponseOrderPaymentRefund.md)
 - [OrdersCreateOrder201ResponseOrderReward](docs/OrdersCreateOrder201ResponseOrderReward.md)
 - [OrdersCreateOrder201ResponseOrderRewardCustomFieldsInner](docs/OrdersCreateOrder201ResponseOrderRewardCustomFieldsInner.md)
 - [OrdersCreateOrder201ResponseOrderRewardRecipient](docs/OrdersCreateOrder201ResponseOrderRewardRecipient.md)
 - [OrdersCreateOrder201ResponseOrderRewardValue](docs/OrdersCreateOrder201ResponseOrderRewardValue.md)
 - [OrdersCreateOrder202Response](docs/OrdersCreateOrder202Response.md)
 - [OrdersCreateOrder202ResponseOrder](docs/OrdersCreateOrder202ResponseOrder.md)
 - [OrdersCreateOrder202ResponseOrderPayment](docs/OrdersCreateOrder202ResponseOrderPayment.md)
 - [OrdersCreateOrder202ResponseOrderPaymentRefund](docs/OrdersCreateOrder202ResponseOrderPaymentRefund.md)
 - [OrdersCreateOrder202ResponseOrderRewardsInner](docs/OrdersCreateOrder202ResponseOrderRewardsInner.md)
 - [OrdersCreateOrder202ResponseOrderRewardsInnerCustomFieldsInner](docs/OrdersCreateOrder202ResponseOrderRewardsInnerCustomFieldsInner.md)
 - [OrdersCreateOrder202ResponseOrderRewardsInnerDelivery](docs/OrdersCreateOrder202ResponseOrderRewardsInnerDelivery.md)
 - [OrdersCreateOrder202ResponseOrderRewardsInnerRecipient](docs/OrdersCreateOrder202ResponseOrderRewardsInnerRecipient.md)
 - [OrdersCreateOrder202ResponseOrderRewardsInnerValue](docs/OrdersCreateOrder202ResponseOrderRewardsInnerValue.md)
 - [OrdersCreateOrderRequest](docs/OrdersCreateOrderRequest.md)
 - [OrdersCreateOrderRequestReward](docs/OrdersCreateOrderRequestReward.md)
 - [OrdersCreateOrderRequestRewardCustomFieldsInner](docs/OrdersCreateOrderRequestRewardCustomFieldsInner.md)
 - [OrdersCreateOrderRequestRewardRecipient](docs/OrdersCreateOrderRequestRewardRecipient.md)
 - [OrdersCreateOrderRequestRewardValue](docs/OrdersCreateOrderRequestRewardValue.md)
 - [OrdersCreateOrderResponse](docs/OrdersCreateOrderResponse.md)
 - [OrdersCreateOrderResponseOrder](docs/OrdersCreateOrderResponseOrder.md)
 - [OrdersCreateOrderResponseOrderPayment](docs/OrdersCreateOrderResponseOrderPayment.md)
 - [OrdersCreateOrderResponseOrderPaymentRefund](docs/OrdersCreateOrderResponseOrderPaymentRefund.md)
 - [OrdersCreateOrderResponseOrderRewardsInner](docs/OrdersCreateOrderResponseOrderRewardsInner.md)
 - [OrdersCreateOrderResponseOrderRewardsInnerCustomFieldsInner](docs/OrdersCreateOrderResponseOrderRewardsInnerCustomFieldsInner.md)
 - [OrdersCreateOrderResponseOrderRewardsInnerDelivery](docs/OrdersCreateOrderResponseOrderRewardsInnerDelivery.md)
 - [OrdersCreateOrderResponseOrderRewardsInnerRecipient](docs/OrdersCreateOrderResponseOrderRewardsInnerRecipient.md)
 - [OrdersCreateOrderResponseOrderRewardsInnerValue](docs/OrdersCreateOrderResponseOrderRewardsInnerValue.md)
 - [OrdersGetListResponse](docs/OrdersGetListResponse.md)
 - [OrdersGetListResponseOrdersInner](docs/OrdersGetListResponseOrdersInner.md)
 - [OrdersGetListResponseOrdersInnerPayment](docs/OrdersGetListResponseOrdersInnerPayment.md)
 - [OrdersGetListResponseOrdersInnerPaymentRefund](docs/OrdersGetListResponseOrdersInnerPaymentRefund.md)
 - [OrdersGetListResponseOrdersInnerReward](docs/OrdersGetListResponseOrdersInnerReward.md)
 - [OrdersGetListResponseOrdersInnerRewardCustomFieldsInner](docs/OrdersGetListResponseOrdersInnerRewardCustomFieldsInner.md)
 - [OrdersGetListResponseOrdersInnerRewardRecipient](docs/OrdersGetListResponseOrdersInnerRewardRecipient.md)
 - [OrdersGetListResponseOrdersInnerRewardValue](docs/OrdersGetListResponseOrdersInnerRewardValue.md)
 - [OrdersGetOrderByIdResponse](docs/OrdersGetOrderByIdResponse.md)
 - [OrdersGetOrderByIdResponseOrder](docs/OrdersGetOrderByIdResponseOrder.md)
 - [OrdersGetOrderByIdResponseOrderPayment](docs/OrdersGetOrderByIdResponseOrderPayment.md)
 - [OrdersGetOrderByIdResponseOrderPaymentRefund](docs/OrdersGetOrderByIdResponseOrderPaymentRefund.md)
 - [OrdersGetOrderByIdResponseOrderReward](docs/OrdersGetOrderByIdResponseOrderReward.md)
 - [OrdersGetOrderByIdResponseOrderRewardCustomFieldsInner](docs/OrdersGetOrderByIdResponseOrderRewardCustomFieldsInner.md)
 - [OrdersGetOrderByIdResponseOrderRewardRecipient](docs/OrdersGetOrderByIdResponseOrderRewardRecipient.md)
 - [OrdersGetOrderByIdResponseOrderRewardValue](docs/OrdersGetOrderByIdResponseOrderRewardValue.md)
 - [OrdersRejectByIdResponse](docs/OrdersRejectByIdResponse.md)
 - [OrdersRejectByIdResponseOrder](docs/OrdersRejectByIdResponseOrder.md)
 - [OrdersRejectByIdResponseOrderPayment](docs/OrdersRejectByIdResponseOrderPayment.md)
 - [OrdersRejectByIdResponseOrderPaymentRefund](docs/OrdersRejectByIdResponseOrderPaymentRefund.md)
 - [OrdersRejectByIdResponseOrderReward](docs/OrdersRejectByIdResponseOrderReward.md)
 - [OrdersRejectByIdResponseOrderRewardCustomFieldsInner](docs/OrdersRejectByIdResponseOrderRewardCustomFieldsInner.md)
 - [OrdersRejectByIdResponseOrderRewardRecipient](docs/OrdersRejectByIdResponseOrderRewardRecipient.md)
 - [OrdersRejectByIdResponseOrderRewardValue](docs/OrdersRejectByIdResponseOrderRewardValue.md)
 - [Organization](docs/Organization.md)
 - [OrganizationsCreateApiKeyResponse](docs/OrganizationsCreateApiKeyResponse.md)
 - [OrganizationsCreateNewOrganizationRequest](docs/OrganizationsCreateNewOrganizationRequest.md)
 - [OrganizationsCreateNewOrganizationRequestCopySettings](docs/OrganizationsCreateNewOrganizationRequestCopySettings.md)
 - [OrganizationsCreateNewOrganizationResponse](docs/OrganizationsCreateNewOrganizationResponse.md)
 - [OrganizationsCreateNewOrganizationResponseOrganization](docs/OrganizationsCreateNewOrganizationResponseOrganization.md)
 - [OrganizationsGetListResponse](docs/OrganizationsGetListResponse.md)
 - [OrganizationsGetListResponseOrganizationsInner](docs/OrganizationsGetListResponseOrganizationsInner.md)
 - [OrganizationsGetOrganizationResponse](docs/OrganizationsGetOrganizationResponse.md)
 - [OrganizationsGetOrganizationResponseOrganization](docs/OrganizationsGetOrganizationResponseOrganization.md)
 - [PaymentDetails](docs/PaymentDetails.md)
 - [PaymentDetailsRefund](docs/PaymentDetailsRefund.md)
 - [Product](docs/Product.md)
 - [ProductCountriesInner](docs/ProductCountriesInner.md)
 - [ProductImagesInner](docs/ProductImagesInner.md)
 - [ProductSkusInner](docs/ProductSkusInner.md)
 - [ProductsGetByIdResponse](docs/ProductsGetByIdResponse.md)
 - [ProductsGetByIdResponseProduct](docs/ProductsGetByIdResponseProduct.md)
 - [ProductsGetByIdResponseProductCountriesInner](docs/ProductsGetByIdResponseProductCountriesInner.md)
 - [ProductsGetByIdResponseProductSkusInner](docs/ProductsGetByIdResponseProductSkusInner.md)
 - [ProductsGetListResponse](docs/ProductsGetListResponse.md)
 - [ProductsGetListResponseProductsInner](docs/ProductsGetListResponseProductsInner.md)
 - [ProductsGetListResponseProductsInnerCountriesInner](docs/ProductsGetListResponseProductsInnerCountriesInner.md)
 - [ProductsGetListResponseProductsInnerSkusInner](docs/ProductsGetListResponseProductsInnerSkusInner.md)
 - [Recipient](docs/Recipient.md)
 - [RefundDetails](docs/RefundDetails.md)
 - [Reward](docs/Reward.md)
 - [RewardBase](docs/RewardBase.md)
 - [RewardBaseCustomFieldsInner](docs/RewardBaseCustomFieldsInner.md)
 - [RewardBaseRecipient](docs/RewardBaseRecipient.md)
 - [RewardBaseValue](docs/RewardBaseValue.md)
 - [RewardCustomFieldsInner](docs/RewardCustomFieldsInner.md)
 - [RewardForOrderCreate](docs/RewardForOrderCreate.md)
 - [RewardForOrderCreateCustomFieldsInner](docs/RewardForOrderCreateCustomFieldsInner.md)
 - [RewardForOrderCreateDelivery](docs/RewardForOrderCreateDelivery.md)
 - [RewardForOrderCreateRecipient](docs/RewardForOrderCreateRecipient.md)
 - [RewardForOrderCreateValue](docs/RewardForOrderCreateValue.md)
 - [RewardLink](docs/RewardLink.md)
 - [RewardRecipient](docs/RewardRecipient.md)
 - [RewardToken](docs/RewardToken.md)
 - [RewardValue](docs/RewardValue.md)
 - [RewardWithLink](docs/RewardWithLink.md)
 - [RewardWithLinkCustomFieldsInner](docs/RewardWithLinkCustomFieldsInner.md)
 - [RewardWithLinkDelivery](docs/RewardWithLinkDelivery.md)
 - [RewardWithLinkRecipient](docs/RewardWithLinkRecipient.md)
 - [RewardWithLinkValue](docs/RewardWithLinkValue.md)
 - [RewardWithoutLink](docs/RewardWithoutLink.md)
 - [RewardWithoutLinkCustomFieldsInner](docs/RewardWithoutLinkCustomFieldsInner.md)
 - [RewardWithoutLinkDelivery](docs/RewardWithoutLinkDelivery.md)
 - [RewardWithoutLinkRecipient](docs/RewardWithoutLinkRecipient.md)
 - [RewardWithoutLinkValue](docs/RewardWithoutLinkValue.md)
 - [RewardsGenerateEmbedTokenResponse](docs/RewardsGenerateEmbedTokenResponse.md)
 - [RewardsGenerateEmbedTokenResponseReward](docs/RewardsGenerateEmbedTokenResponseReward.md)
 - [RewardsGenerateLinkResponse](docs/RewardsGenerateLinkResponse.md)
 - [RewardsGenerateLinkResponseReward](docs/RewardsGenerateLinkResponseReward.md)
 - [RewardsGetSingleRewardResponse](docs/RewardsGetSingleRewardResponse.md)
 - [RewardsGetSingleRewardResponseReward](docs/RewardsGetSingleRewardResponseReward.md)
 - [RewardsGetSingleRewardResponseRewardCustomFieldsInner](docs/RewardsGetSingleRewardResponseRewardCustomFieldsInner.md)
 - [RewardsGetSingleRewardResponseRewardRecipient](docs/RewardsGetSingleRewardResponseRewardRecipient.md)
 - [RewardsGetSingleRewardResponseRewardValue](docs/RewardsGetSingleRewardResponseRewardValue.md)
 - [RewardsListAllRewardsResponse](docs/RewardsListAllRewardsResponse.md)
 - [RewardsListAllRewardsResponseRewardsInner](docs/RewardsListAllRewardsResponseRewardsInner.md)
 - [RewardsListAllRewardsResponseRewardsInnerCustomFieldsInner](docs/RewardsListAllRewardsResponseRewardsInnerCustomFieldsInner.md)
 - [RewardsListAllRewardsResponseRewardsInnerDelivery](docs/RewardsListAllRewardsResponseRewardsInnerDelivery.md)
 - [RewardsListAllRewardsResponseRewardsInnerRecipient](docs/RewardsListAllRewardsResponseRewardsInnerRecipient.md)
 - [RewardsListAllRewardsResponseRewardsInnerValue](docs/RewardsListAllRewardsResponseRewardsInnerValue.md)
 - [Webhook](docs/Webhook.md)
 - [WebhookPost](docs/WebhookPost.md)
 - [WebhooksCreateWebhookRequest](docs/WebhooksCreateWebhookRequest.md)
 - [WebhooksCreateWebhookResponse](docs/WebhooksCreateWebhookResponse.md)
 - [WebhooksCreateWebhookResponseWebhook](docs/WebhooksCreateWebhookResponseWebhook.md)
 - [WebhooksGetDetails200Response](docs/WebhooksGetDetails200Response.md)
 - [WebhooksGetDetails200ResponseWebhook](docs/WebhooksGetDetails200ResponseWebhook.md)
 - [WebhooksGetDetailsResponse](docs/WebhooksGetDetailsResponse.md)
 - [WebhooksGetDetailsResponseWebhooksInner](docs/WebhooksGetDetailsResponseWebhooksInner.md)
 - [WebhooksListEventsResponse](docs/WebhooksListEventsResponse.md)
 - [WebhooksTriggerEventRequest](docs/WebhooksTriggerEventRequest.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
