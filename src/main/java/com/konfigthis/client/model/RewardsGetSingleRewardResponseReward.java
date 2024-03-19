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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.RewardsGetSingleRewardResponseRewardCustomFieldsInner;
import com.konfigthis.client.model.RewardsGetSingleRewardResponseRewardRecipient;
import com.konfigthis.client.model.RewardsGetSingleRewardResponseRewardValue;
import com.konfigthis.client.model.RewardsListAllRewardsResponseRewardsInnerDelivery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * A single reward, sent to a recipient. A reward is always part of an order.  Either &#x60;products&#x60; or &#x60;campaign_id&#x60; must be specified. 
 */
@ApiModel(description = "A single reward, sent to a recipient. A reward is always part of an order.  Either `products` or `campaign_id` must be specified. ")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RewardsGetSingleRewardResponseReward {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private RewardsGetSingleRewardResponseRewardValue value;

  public static final String SERIALIZED_NAME_RECIPIENT = "recipient";
  @SerializedName(SERIALIZED_NAME_RECIPIENT)
  private RewardsGetSingleRewardResponseRewardRecipient recipient;

  public static final String SERIALIZED_NAME_DELIVER_AT = "deliver_at";
  @SerializedName(SERIALIZED_NAME_DELIVER_AT)
  private LocalDate deliverAt;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "custom_fields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private List<RewardsGetSingleRewardResponseRewardCustomFieldsInner> customFields = null;

  public static final String SERIALIZED_NAME_DELIVERY = "delivery";
  @SerializedName(SERIALIZED_NAME_DELIVERY)
  private RewardsListAllRewardsResponseRewardsInnerDelivery delivery;

  public RewardsGetSingleRewardResponseReward() {
  }

  public RewardsGetSingleRewardResponseReward id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Tremendous ID of the reward
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SOMEIDSOMEID", value = "Tremendous ID of the reward")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public RewardsGetSingleRewardResponseReward orderId(String orderId) {
    
    
    
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Tremendous ID of the order this reward is part of.
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SOMEIDSOMEID", value = "Tremendous ID of the order this reward is part of.")

  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    
    
    
    this.orderId = orderId;
  }


  public RewardsGetSingleRewardResponseReward createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Date the reward was created
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date the reward was created")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public RewardsGetSingleRewardResponseReward value(RewardsGetSingleRewardResponseRewardValue value) {
    
    
    
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RewardsGetSingleRewardResponseRewardValue getValue() {
    return value;
  }


  public void setValue(RewardsGetSingleRewardResponseRewardValue value) {
    
    
    
    this.value = value;
  }


  public RewardsGetSingleRewardResponseReward recipient(RewardsGetSingleRewardResponseRewardRecipient recipient) {
    
    
    
    
    this.recipient = recipient;
    return this;
  }

   /**
   * Get recipient
   * @return recipient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RewardsGetSingleRewardResponseRewardRecipient getRecipient() {
    return recipient;
  }


  public void setRecipient(RewardsGetSingleRewardResponseRewardRecipient recipient) {
    
    
    
    this.recipient = recipient;
  }


  public RewardsGetSingleRewardResponseReward deliverAt(LocalDate deliverAt) {
    
    
    
    
    this.deliverAt = deliverAt;
    return this;
  }

   /**
   * Timestamp of reward delivery within the next year. Note that if date-time is provided, the time values will be ignored.
   * @return deliverAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sat Dec 30 16:00:00 PST 2023", value = "Timestamp of reward delivery within the next year. Note that if date-time is provided, the time values will be ignored.")

  public LocalDate getDeliverAt() {
    return deliverAt;
  }


  public void setDeliverAt(LocalDate deliverAt) {
    
    
    
    this.deliverAt = deliverAt;
  }


  public RewardsGetSingleRewardResponseReward customFields(List<RewardsGetSingleRewardResponseRewardCustomFieldsInner> customFields) {
    
    
    
    
    this.customFields = customFields;
    return this;
  }

  public RewardsGetSingleRewardResponseReward addCustomFieldsItem(RewardsGetSingleRewardResponseRewardCustomFieldsInner customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RewardsGetSingleRewardResponseRewardCustomFieldsInner> getCustomFields() {
    return customFields;
  }


  public void setCustomFields(List<RewardsGetSingleRewardResponseRewardCustomFieldsInner> customFields) {
    
    
    
    this.customFields = customFields;
  }


  public RewardsGetSingleRewardResponseReward delivery(RewardsListAllRewardsResponseRewardsInnerDelivery delivery) {
    
    
    
    
    this.delivery = delivery;
    return this;
  }

   /**
   * Get delivery
   * @return delivery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RewardsListAllRewardsResponseRewardsInnerDelivery getDelivery() {
    return delivery;
  }


  public void setDelivery(RewardsListAllRewardsResponseRewardsInnerDelivery delivery) {
    
    
    
    this.delivery = delivery;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the RewardsGetSingleRewardResponseReward instance itself
   */
  public RewardsGetSingleRewardResponseReward putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RewardsGetSingleRewardResponseReward rewardsGetSingleRewardResponseReward = (RewardsGetSingleRewardResponseReward) o;
    return Objects.equals(this.id, rewardsGetSingleRewardResponseReward.id) &&
        Objects.equals(this.orderId, rewardsGetSingleRewardResponseReward.orderId) &&
        Objects.equals(this.createdAt, rewardsGetSingleRewardResponseReward.createdAt) &&
        Objects.equals(this.value, rewardsGetSingleRewardResponseReward.value) &&
        Objects.equals(this.recipient, rewardsGetSingleRewardResponseReward.recipient) &&
        Objects.equals(this.deliverAt, rewardsGetSingleRewardResponseReward.deliverAt) &&
        Objects.equals(this.customFields, rewardsGetSingleRewardResponseReward.customFields) &&
        Objects.equals(this.delivery, rewardsGetSingleRewardResponseReward.delivery)&&
        Objects.equals(this.additionalProperties, rewardsGetSingleRewardResponseReward.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orderId, createdAt, value, recipient, deliverAt, customFields, delivery, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RewardsGetSingleRewardResponseReward {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    deliverAt: ").append(toIndentedString(deliverAt)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("order_id");
    openapiFields.add("created_at");
    openapiFields.add("value");
    openapiFields.add("recipient");
    openapiFields.add("deliver_at");
    openapiFields.add("custom_fields");
    openapiFields.add("delivery");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RewardsGetSingleRewardResponseReward
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RewardsGetSingleRewardResponseReward.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RewardsGetSingleRewardResponseReward is not found in the empty JSON string", RewardsGetSingleRewardResponseReward.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonNull()) && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      // validate the optional field `value`
      if (jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) {
        RewardsGetSingleRewardResponseRewardValue.validateJsonObject(jsonObj.getAsJsonObject("value"));
      }
      // validate the optional field `recipient`
      if (jsonObj.get("recipient") != null && !jsonObj.get("recipient").isJsonNull()) {
        RewardsGetSingleRewardResponseRewardRecipient.validateJsonObject(jsonObj.getAsJsonObject("recipient"));
      }
      if (jsonObj.get("custom_fields") != null && !jsonObj.get("custom_fields").isJsonNull()) {
        JsonArray jsonArraycustomFields = jsonObj.getAsJsonArray("custom_fields");
        if (jsonArraycustomFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("custom_fields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `custom_fields` to be an array in the JSON string but got `%s`", jsonObj.get("custom_fields").toString()));
          }

          // validate the optional field `custom_fields` (array)
          for (int i = 0; i < jsonArraycustomFields.size(); i++) {
            RewardsGetSingleRewardResponseRewardCustomFieldsInner.validateJsonObject(jsonArraycustomFields.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `delivery`
      if (jsonObj.get("delivery") != null && !jsonObj.get("delivery").isJsonNull()) {
        RewardsListAllRewardsResponseRewardsInnerDelivery.validateJsonObject(jsonObj.getAsJsonObject("delivery"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RewardsGetSingleRewardResponseReward.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RewardsGetSingleRewardResponseReward' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RewardsGetSingleRewardResponseReward> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RewardsGetSingleRewardResponseReward.class));

       return (TypeAdapter<T>) new TypeAdapter<RewardsGetSingleRewardResponseReward>() {
           @Override
           public void write(JsonWriter out, RewardsGetSingleRewardResponseReward value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public RewardsGetSingleRewardResponseReward read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RewardsGetSingleRewardResponseReward instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RewardsGetSingleRewardResponseReward given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RewardsGetSingleRewardResponseReward
  * @throws IOException if the JSON string is invalid with respect to RewardsGetSingleRewardResponseReward
  */
  public static RewardsGetSingleRewardResponseReward fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RewardsGetSingleRewardResponseReward.class);
  }

 /**
  * Convert an instance of RewardsGetSingleRewardResponseReward to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

