/*
 * API Endpoints
 * Deliver monetary rewards and incentives to employees, customers, survey participants, and more through the Tremendous API. For organizational tasks, like managing your organization and it's members within Tremendous, please see the Tremendous Organizational API.
 *
 * The version of the OpenAPI document: 2
 * Contact: developers@tremendous.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.FundingSourcesGetAllResponse;
import com.konfigthis.client.model.FundingSourcesGetByIdResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FundingSourcesApi
 */
@Disabled
public class FundingSourcesApiTest {

    private static FundingSourcesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new FundingSourcesApi(apiClient);
    }

    /**
     * List funding sources
     *
     * Retrieve a list of all funding sources available for ordering through the API in your organization&#39;s account. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTest() throws ApiException {
        FundingSourcesGetAllResponse response = api.getAll()
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve funding source
     *
     * Retrieve a funding source, identified by the given &#x60;id&#x60; in the URL 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String id = null;
        FundingSourcesGetByIdResponse response = api.getById(id)
                .execute();
        // TODO: test validations
    }

}
