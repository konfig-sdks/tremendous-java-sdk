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
import com.konfigthis.client.model.OrderPaymentRefund;
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
 * Cost breakdown of the order (cost of rewards + fees). Cost and fees are always denominated in USD, independent from the currency of the ordered rewards. Note that this property will only appear for processed orders (&#x60;status&#x60; is &#x60;EXECUTED&#x60;).
 */
@ApiModel(description = "Cost breakdown of the order (cost of rewards + fees). Cost and fees are always denominated in USD, independent from the currency of the ordered rewards. Note that this property will only appear for processed orders (`status` is `EXECUTED`).")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OrderPayment {
  public static final String SERIALIZED_NAME_SUBTOTAL = "subtotal";
  @SerializedName(SERIALIZED_NAME_SUBTOTAL)
  private Double subtotal;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Double total;

  public static final String SERIALIZED_NAME_FEES = "fees";
  @SerializedName(SERIALIZED_NAME_FEES)
  private Double fees;

  public static final String SERIALIZED_NAME_REFUND = "refund";
  @SerializedName(SERIALIZED_NAME_REFUND)
  private OrderPaymentRefund refund;

  /**
   * Name of the channel in which the order was created
   */
  @JsonAdapter(ChannelEnum.Adapter.class)
 public enum ChannelEnum {
    UI("UI"),
    
    API("API"),
    
    EMBED("EMBED"),
    
    DECIPHER("DECIPHER"),
    
    QUALTRICS("QUALTRICS"),
    
    TYPEFORM("TYPEFORM"),
    
    SURVEY_MONKEY("SURVEY MONKEY");

    private String value;

    ChannelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChannelEnum fromValue(String value) {
      for (ChannelEnum b : ChannelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ChannelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChannelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChannelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ChannelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private ChannelEnum channel;

  public OrderPayment() {
  }

  
  public OrderPayment(
     Double subtotal, 
     Double total, 
     Double fees
  ) {
    this();
    this.subtotal = subtotal;
    this.total = total;
    this.fees = fees;
  }

   /**
   * Total price of the order before fees (in USD)
   * minimum: 0
   * @return subtotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50", value = "Total price of the order before fees (in USD)")

  public Double getSubtotal() {
    return subtotal;
  }




   /**
   * Total price of the order including fees (in USD)
   * minimum: 0
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "52.5", value = "Total price of the order including fees (in USD)")

  public Double getTotal() {
    return total;
  }




   /**
   * Fees for the order (in USD)
   * minimum: 0
   * @return fees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.5", value = "Fees for the order (in USD)")

  public Double getFees() {
    return fees;
  }




  public OrderPayment refund(OrderPaymentRefund refund) {
    
    
    
    
    this.refund = refund;
    return this;
  }

   /**
   * Get refund
   * @return refund
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrderPaymentRefund getRefund() {
    return refund;
  }


  public void setRefund(OrderPaymentRefund refund) {
    
    
    
    this.refund = refund;
  }


  public OrderPayment channel(ChannelEnum channel) {
    
    
    
    
    this.channel = channel;
    return this;
  }

   /**
   * Name of the channel in which the order was created
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the channel in which the order was created")

  public ChannelEnum getChannel() {
    return channel;
  }


  public void setChannel(ChannelEnum channel) {
    
    
    
    this.channel = channel;
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
   * @return the OrderPayment instance itself
   */
  public OrderPayment putAdditionalProperty(String key, Object value) {
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
    OrderPayment orderPayment = (OrderPayment) o;
    return Objects.equals(this.subtotal, orderPayment.subtotal) &&
        Objects.equals(this.total, orderPayment.total) &&
        Objects.equals(this.fees, orderPayment.fees) &&
        Objects.equals(this.refund, orderPayment.refund) &&
        Objects.equals(this.channel, orderPayment.channel)&&
        Objects.equals(this.additionalProperties, orderPayment.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subtotal, total, fees, refund, channel, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderPayment {\n");
    sb.append("    subtotal: ").append(toIndentedString(subtotal)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    refund: ").append(toIndentedString(refund)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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
    openapiFields.add("subtotal");
    openapiFields.add("total");
    openapiFields.add("fees");
    openapiFields.add("refund");
    openapiFields.add("channel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderPayment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrderPayment.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderPayment is not found in the empty JSON string", OrderPayment.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `refund`
      if (jsonObj.get("refund") != null && !jsonObj.get("refund").isJsonNull()) {
        OrderPaymentRefund.validateJsonObject(jsonObj.getAsJsonObject("refund"));
      }
      if ((jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonNull()) && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderPayment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderPayment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderPayment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderPayment.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderPayment>() {
           @Override
           public void write(JsonWriter out, OrderPayment value) throws IOException {
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
           public OrderPayment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OrderPayment instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OrderPayment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderPayment
  * @throws IOException if the JSON string is invalid with respect to OrderPayment
  */
  public static OrderPayment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderPayment.class);
  }

 /**
  * Convert an instance of OrderPayment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

