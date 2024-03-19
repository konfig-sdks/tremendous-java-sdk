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
 * Current status of the delivery of the reward:  * &#x60;SCHEDULED&#x60; - Reward is scheduled for delivery and will be delivered soon. * &#x60;FAILED&#x60; - Delivery of reward failed (e.g. email bounced). * &#x60;SUCCEEDED&#x60; - Reward was successfully delivered (email or text message delivered or reward link opened). * &#x60;PENDING&#x60; - Delivery is pending but not yet scheduled. 
 */
@JsonAdapter(DeliveryStatus.Adapter.class)public enum DeliveryStatus {
  
  SCHEDULED("SCHEDULED"),
  
  FAILED("FAILED"),
  
  SUCCEEDED("SUCCEEDED"),
  
  PENDING("PENDING");

  private String value;

  DeliveryStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DeliveryStatus fromValue(String value) {
    for (DeliveryStatus b : DeliveryStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DeliveryStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final DeliveryStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DeliveryStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DeliveryStatus.fromValue(value);
    }
  }
}

