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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * Details of the recipient of the reward
 */
@ApiModel(description = "Details of the recipient of the reward")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OrdersCreateOrder201ResponseOrderRewardRecipient {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public OrdersCreateOrder201ResponseOrderRewardRecipient() {
  }

  public OrdersCreateOrder201ResponseOrderRewardRecipient name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Name of the recipient
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John Doe Jr.", value = "Name of the recipient")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public OrdersCreateOrder201ResponseOrderRewardRecipient email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Email address of the recipient
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "john.doe@example.com", value = "Email address of the recipient")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public OrdersCreateOrder201ResponseOrderRewardRecipient phone(String phone) {
    
    
    
    
    this.phone = phone;
    return this;
  }

   /**
   * Phone number of the recipient. For non-US phone numbers, specify the country code (prefixed with +).
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123-456-7890", value = "Phone number of the recipient. For non-US phone numbers, specify the country code (prefixed with +).")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    
    
    
    this.phone = phone;
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
   * @return the OrdersCreateOrder201ResponseOrderRewardRecipient instance itself
   */
  public OrdersCreateOrder201ResponseOrderRewardRecipient putAdditionalProperty(String key, Object value) {
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
    OrdersCreateOrder201ResponseOrderRewardRecipient ordersCreateOrder201ResponseOrderRewardRecipient = (OrdersCreateOrder201ResponseOrderRewardRecipient) o;
    return Objects.equals(this.name, ordersCreateOrder201ResponseOrderRewardRecipient.name) &&
        Objects.equals(this.email, ordersCreateOrder201ResponseOrderRewardRecipient.email) &&
        Objects.equals(this.phone, ordersCreateOrder201ResponseOrderRewardRecipient.phone)&&
        Objects.equals(this.additionalProperties, ordersCreateOrder201ResponseOrderRewardRecipient.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, phone, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdersCreateOrder201ResponseOrderRewardRecipient {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("email");
    openapiFields.add("phone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrdersCreateOrder201ResponseOrderRewardRecipient
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrdersCreateOrder201ResponseOrderRewardRecipient.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrdersCreateOrder201ResponseOrderRewardRecipient is not found in the empty JSON string", OrdersCreateOrder201ResponseOrderRewardRecipient.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrdersCreateOrder201ResponseOrderRewardRecipient.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrdersCreateOrder201ResponseOrderRewardRecipient' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrdersCreateOrder201ResponseOrderRewardRecipient> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrdersCreateOrder201ResponseOrderRewardRecipient.class));

       return (TypeAdapter<T>) new TypeAdapter<OrdersCreateOrder201ResponseOrderRewardRecipient>() {
           @Override
           public void write(JsonWriter out, OrdersCreateOrder201ResponseOrderRewardRecipient value) throws IOException {
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
           public OrdersCreateOrder201ResponseOrderRewardRecipient read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OrdersCreateOrder201ResponseOrderRewardRecipient instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OrdersCreateOrder201ResponseOrderRewardRecipient given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrdersCreateOrder201ResponseOrderRewardRecipient
  * @throws IOException if the JSON string is invalid with respect to OrdersCreateOrder201ResponseOrderRewardRecipient
  */
  public static OrdersCreateOrder201ResponseOrderRewardRecipient fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrdersCreateOrder201ResponseOrderRewardRecipient.class);
  }

 /**
  * Convert an instance of OrdersCreateOrder201ResponseOrderRewardRecipient to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

