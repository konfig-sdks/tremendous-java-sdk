package com.konfigthis.client;

import com.konfigthis.client.api.BalanceTransactionsApi;
import com.konfigthis.client.api.CampaignsApi;
import com.konfigthis.client.api.FieldsApi;
import com.konfigthis.client.api.FundingSourcesApi;
import com.konfigthis.client.api.InvoicesApi;
import com.konfigthis.client.api.MembersApi;
import com.konfigthis.client.api.OrdersApi;
import com.konfigthis.client.api.OrganizationsApi;
import com.konfigthis.client.api.ProductsApi;
import com.konfigthis.client.api.RewardsApi;
import com.konfigthis.client.api.WebhooksApi;

public class Tremendous {
    private ApiClient apiClient;
    public final BalanceTransactionsApi balanceTransactions;
    public final CampaignsApi campaigns;
    public final FieldsApi fields;
    public final FundingSourcesApi fundingSources;
    public final InvoicesApi invoices;
    public final MembersApi members;
    public final OrdersApi orders;
    public final OrganizationsApi organizations;
    public final ProductsApi products;
    public final RewardsApi rewards;
    public final WebhooksApi webhooks;

    public Tremendous() {
        this(null);
    }

    public Tremendous(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.balanceTransactions = new BalanceTransactionsApi(this.apiClient);
        this.campaigns = new CampaignsApi(this.apiClient);
        this.fields = new FieldsApi(this.apiClient);
        this.fundingSources = new FundingSourcesApi(this.apiClient);
        this.invoices = new InvoicesApi(this.apiClient);
        this.members = new MembersApi(this.apiClient);
        this.orders = new OrdersApi(this.apiClient);
        this.organizations = new OrganizationsApi(this.apiClient);
        this.products = new ProductsApi(this.apiClient);
        this.rewards = new RewardsApi(this.apiClient);
        this.webhooks = new WebhooksApi(this.apiClient);
    }

}
