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
import com.konfigthis.client.model.OrdersCreateOrderRequestRewardCustomFieldsInner;
import com.konfigthis.client.model.OrdersCreateOrderRequestRewardRecipient;
import com.konfigthis.client.model.OrdersCreateOrderRequestRewardValue;
import com.konfigthis.client.model.RewardForOrderCreateDelivery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
public class OrdersCreateOrderRequestReward {
  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<String> products = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private OrdersCreateOrderRequestRewardValue value;

  public static final String SERIALIZED_NAME_RECIPIENT = "recipient";
  @SerializedName(SERIALIZED_NAME_RECIPIENT)
  private OrdersCreateOrderRequestRewardRecipient recipient;

  public static final String SERIALIZED_NAME_DELIVER_AT = "deliver_at";
  @SerializedName(SERIALIZED_NAME_DELIVER_AT)
  private LocalDate deliverAt;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "custom_fields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private List<OrdersCreateOrderRequestRewardCustomFieldsInner> customFields = null;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_DELIVERY = "delivery";
  @SerializedName(SERIALIZED_NAME_DELIVERY)
  private RewardForOrderCreateDelivery delivery;

  public OrdersCreateOrderRequestReward() {
  }

  public OrdersCreateOrderRequestReward campaignId(String campaignId) {
    
    
    
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * ID of the campaign in your account, that defines the available products (different gift cards, charity, etc.) that the recipient can choose from. 
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SOMEIDSOMEID", value = "ID of the campaign in your account, that defines the available products (different gift cards, charity, etc.) that the recipient can choose from. ")

  public String getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(String campaignId) {
    
    
    
    this.campaignId = campaignId;
  }


  public OrdersCreateOrderRequestReward products(List<String> products) {
    
    
    
    
    this.products = products;
    return this;
  }

  public OrdersCreateOrderRequestReward addProductsItem(String productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * List of IDs of product (different gift cards, charity, etc.) that will be available to the recipient to choose from.  Providing a &#x60;products&#x60; array will override the products made available by the campaign specified using the &#x60;campaign_id&#x60; property unless the &#x60;products&#x60; array is empty. It will _not_ override other campaign attributes, like the message and customization of the look and feel. 
   * @return products
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of IDs of product (different gift cards, charity, etc.) that will be available to the recipient to choose from.  Providing a `products` array will override the products made available by the campaign specified using the `campaign_id` property unless the `products` array is empty. It will _not_ override other campaign attributes, like the message and customization of the look and feel. ")

  public List<String> getProducts() {
    return products;
  }


  public void setProducts(List<String> products) {
    
    
    
    this.products = products;
  }


  public OrdersCreateOrderRequestReward value(OrdersCreateOrderRequestRewardValue value) {
    
    
    
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrdersCreateOrderRequestRewardValue getValue() {
    return value;
  }


  public void setValue(OrdersCreateOrderRequestRewardValue value) {
    
    
    
    this.value = value;
  }


  public OrdersCreateOrderRequestReward recipient(OrdersCreateOrderRequestRewardRecipient recipient) {
    
    
    
    
    this.recipient = recipient;
    return this;
  }

   /**
   * Get recipient
   * @return recipient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrdersCreateOrderRequestRewardRecipient getRecipient() {
    return recipient;
  }


  public void setRecipient(OrdersCreateOrderRequestRewardRecipient recipient) {
    
    
    
    this.recipient = recipient;
  }


  public OrdersCreateOrderRequestReward deliverAt(LocalDate deliverAt) {
    
    
    
    
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


  public OrdersCreateOrderRequestReward customFields(List<OrdersCreateOrderRequestRewardCustomFieldsInner> customFields) {
    
    
    
    
    this.customFields = customFields;
    return this;
  }

  public OrdersCreateOrderRequestReward addCustomFieldsItem(OrdersCreateOrderRequestRewardCustomFieldsInner customFieldsItem) {
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

  public List<OrdersCreateOrderRequestRewardCustomFieldsInner> getCustomFields() {
    return customFields;
  }


  public void setCustomFields(List<OrdersCreateOrderRequestRewardCustomFieldsInner> customFields) {
    
    
    
    this.customFields = customFields;
  }


  public OrdersCreateOrderRequestReward language(String language) {
    
    
    
    
    this.language = language;
    return this;
  }

   /**
   * Set this to translate the redemption experience for this reward. Pass a 2-letter [ISO-639-1 code](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) for the desired language. Defaults to &#x60;en&#x60;. 
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "de", value = "Set this to translate the redemption experience for this reward. Pass a 2-letter [ISO-639-1 code](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) for the desired language. Defaults to `en`. ")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    
    
    
    this.language = language;
  }


  public OrdersCreateOrderRequestReward delivery(RewardForOrderCreateDelivery delivery) {
    
    
    
    
    this.delivery = delivery;
    return this;
  }

   /**
   * Get delivery
   * @return delivery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RewardForOrderCreateDelivery getDelivery() {
    return delivery;
  }


  public void setDelivery(RewardForOrderCreateDelivery delivery) {
    
    
    
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
   * @return the OrdersCreateOrderRequestReward instance itself
   */
  public OrdersCreateOrderRequestReward putAdditionalProperty(String key, Object value) {
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
    OrdersCreateOrderRequestReward ordersCreateOrderRequestReward = (OrdersCreateOrderRequestReward) o;
    return Objects.equals(this.campaignId, ordersCreateOrderRequestReward.campaignId) &&
        Objects.equals(this.products, ordersCreateOrderRequestReward.products) &&
        Objects.equals(this.value, ordersCreateOrderRequestReward.value) &&
        Objects.equals(this.recipient, ordersCreateOrderRequestReward.recipient) &&
        Objects.equals(this.deliverAt, ordersCreateOrderRequestReward.deliverAt) &&
        Objects.equals(this.customFields, ordersCreateOrderRequestReward.customFields) &&
        Objects.equals(this.language, ordersCreateOrderRequestReward.language) &&
        Objects.equals(this.delivery, ordersCreateOrderRequestReward.delivery)&&
        Objects.equals(this.additionalProperties, ordersCreateOrderRequestReward.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, products, value, recipient, deliverAt, customFields, language, delivery, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdersCreateOrderRequestReward {\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    deliverAt: ").append(toIndentedString(deliverAt)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
    openapiFields.add("campaign_id");
    openapiFields.add("products");
    openapiFields.add("value");
    openapiFields.add("recipient");
    openapiFields.add("deliver_at");
    openapiFields.add("custom_fields");
    openapiFields.add("language");
    openapiFields.add("delivery");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrdersCreateOrderRequestReward
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrdersCreateOrderRequestReward.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrdersCreateOrderRequestReward is not found in the empty JSON string", OrdersCreateOrderRequestReward.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("campaign_id").isJsonNull() && (jsonObj.get("campaign_id") != null && !jsonObj.get("campaign_id").isJsonNull()) && !jsonObj.get("campaign_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaign_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaign_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("products") != null && !jsonObj.get("products").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `products` to be an array in the JSON string but got `%s`", jsonObj.get("products").toString()));
      }
      // validate the optional field `value`
      if (jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) {
        OrdersCreateOrderRequestRewardValue.validateJsonObject(jsonObj.getAsJsonObject("value"));
      }
      // validate the optional field `recipient`
      if (jsonObj.get("recipient") != null && !jsonObj.get("recipient").isJsonNull()) {
        OrdersCreateOrderRequestRewardRecipient.validateJsonObject(jsonObj.getAsJsonObject("recipient"));
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
            OrdersCreateOrderRequestRewardCustomFieldsInner.validateJsonObject(jsonArraycustomFields.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      // validate the optional field `delivery`
      if (jsonObj.get("delivery") != null && !jsonObj.get("delivery").isJsonNull()) {
        RewardForOrderCreateDelivery.validateJsonObject(jsonObj.getAsJsonObject("delivery"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrdersCreateOrderRequestReward.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrdersCreateOrderRequestReward' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrdersCreateOrderRequestReward> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrdersCreateOrderRequestReward.class));

       return (TypeAdapter<T>) new TypeAdapter<OrdersCreateOrderRequestReward>() {
           @Override
           public void write(JsonWriter out, OrdersCreateOrderRequestReward value) throws IOException {
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
           public OrdersCreateOrderRequestReward read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OrdersCreateOrderRequestReward instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OrdersCreateOrderRequestReward given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrdersCreateOrderRequestReward
  * @throws IOException if the JSON string is invalid with respect to OrdersCreateOrderRequestReward
  */
  public static OrdersCreateOrderRequestReward fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrdersCreateOrderRequestReward.class);
  }

 /**
  * Convert an instance of OrdersCreateOrderRequestReward to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

