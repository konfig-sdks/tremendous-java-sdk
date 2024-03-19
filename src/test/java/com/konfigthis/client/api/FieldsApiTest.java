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
import com.konfigthis.client.model.FieldsGetCustomFieldsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FieldsApi
 */
@Disabled
public class FieldsApiTest {

    private static FieldsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new FieldsApi(apiClient);
    }

    /**
     * List fields
     *
     * For reporting and analytics purposes, custom fields can be associated with rewards generated through the API. Custom fields must be first added by members of your admin team through the Tremendous Dashboard. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomFieldsTest() throws ApiException {
        FieldsGetCustomFieldsResponse response = api.getCustomFields()
                .execute();
        // TODO: test validations
    }

}