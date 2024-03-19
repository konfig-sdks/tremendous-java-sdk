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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Execution status of a given order  &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;         Status       &lt;/th&gt;       &lt;th&gt;         Description       &lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td&gt;         &lt;code&gt;           CANCELED         &lt;/code&gt;       &lt;/td&gt;       &lt;td&gt;         The order and all of its rewards were canceled.       &lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;         &lt;code&gt;           CART         &lt;/code&gt;       &lt;/td&gt;       &lt;td&gt;         The order has been created, but hasn&#39;t yet been processed.       &lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;         &lt;code&gt;           EXECUTED         &lt;/code&gt;       &lt;/td&gt;       &lt;td&gt;         The order has been executed. Payment has been handled and rewards are being delivered (if applicable).       &lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;         &lt;code&gt;           FAILED         &lt;/code&gt;       &lt;/td&gt;       &lt;td&gt;         The order could not be processed due to an error. E.g. due to insufficient funds in the account.       &lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;         &lt;code&gt;           PENDING APPROVAL         &lt;/code&gt;       &lt;/td&gt;       &lt;td&gt;         The order has been created but needs approval to be executed.       &lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;         &lt;code&gt;           PENDING INTERNAL PAYMENT APPROVAL         &lt;/code&gt;       &lt;/td&gt;       &lt;td&gt;         The order has been created but it is under review and requires approval from our team.       &lt;/td&gt;     &lt;/tr&gt;    &lt;/tbody&gt; &lt;/table&gt; 
 */
@JsonAdapter(OrderStatus.Adapter.class)public enum OrderStatus {
  
  CANCELED("CANCELED"),
  
  CART("CART"),
  
  EXECUTED("EXECUTED"),
  
  FAILED("FAILED"),
  
  PENDING_APPROVAL("PENDING APPROVAL"),
  
  PENDING_INTERNAL_PAYMENT_APPROVAL("PENDING INTERNAL PAYMENT APPROVAL");

  private String value;

  OrderStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OrderStatus fromValue(String value) {
    for (OrderStatus b : OrderStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OrderStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final OrderStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OrderStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OrderStatus.fromValue(value);
    }
  }
}
