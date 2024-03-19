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
 * Invoices are instruments to fund your Tremendous account&#39;s balance.  Invoices can be created by your organization programatically. Once we receive your payment, the invoice is marked as &#x60;PAID&#x60; and we add the respective funds to your account&#39;s balance. 
 */
@ApiModel(description = "Invoices are instruments to fund your Tremendous account's balance.  Invoices can be created by your organization programatically. Once we receive your payment, the invoice is marked as `PAID` and we add the respective funds to your account's balance. ")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InvoicesGetByIdResponseInvoice {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PO_NUMBER = "po_number";
  @SerializedName(SERIALIZED_NAME_PO_NUMBER)
  private String poNumber;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  /**
   * Status of this invoice  &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Status&lt;/th&gt;       &lt;th&gt;Description&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;DELETED&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Invoice has been deleted by your organization&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;PAID&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Invoice has been paid by your organization&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;OPEN&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Invoice has been created by your organization but has not been paid, yet&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; 
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    DELETED("DELETED"),
    
    PAID("PAID"),
    
    OPEN("OPEN"),
    
    MARKED_AS_PAID("MARKED_AS_PAID");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_ORDERS = "orders";
  @SerializedName(SERIALIZED_NAME_ORDERS)
  private List<String> orders = null;

  public static final String SERIALIZED_NAME_REWARDS = "rewards";
  @SerializedName(SERIALIZED_NAME_REWARDS)
  private List<String> rewards = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private LocalDate createdAt;

  public static final String SERIALIZED_NAME_PAID_AT = "paid_at";
  @SerializedName(SERIALIZED_NAME_PAID_AT)
  private LocalDate paidAt;

  public InvoicesGetByIdResponseInvoice() {
  }

  public InvoicesGetByIdResponseInvoice id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The invoice number
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "PPS-26873", required = true, value = "The invoice number")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public InvoicesGetByIdResponseInvoice poNumber(String poNumber) {
    
    
    
    
    this.poNumber = poNumber;
    return this;
  }

   /**
   * Reference to the purchase order number within your organization
   * @return poNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123-PO-EE", value = "Reference to the purchase order number within your organization")

  public String getPoNumber() {
    return poNumber;
  }


  public void setPoNumber(String poNumber) {
    
    
    
    this.poNumber = poNumber;
  }


  public InvoicesGetByIdResponseInvoice amount(Double amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * Amount of the invoice in USD
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "50.35", required = true, value = "Amount of the invoice in USD")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    
    
    
    this.amount = amount;
  }


  public InvoicesGetByIdResponseInvoice status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Status of this invoice  &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Status&lt;/th&gt;       &lt;th&gt;Description&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;DELETED&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Invoice has been deleted by your organization&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;PAID&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Invoice has been paid by your organization&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;OPEN&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Invoice has been created by your organization but has not been paid, yet&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt; 
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "PAID", required = true, value = "Status of this invoice  <table>   <thead>     <tr>       <th>Status</th>       <th>Description</th>     </tr>   </thead>   <tbody>     <tr>       <td><code>DELETED</code></td>       <td>Invoice has been deleted by your organization</td>     </tr>     <tr>       <td><code>PAID</code></td>       <td>Invoice has been paid by your organization</td>     </tr>     <tr>       <td><code>OPEN</code></td>       <td>Invoice has been created by your organization but has not been paid, yet</td>     </tr>   </tbody> </table> ")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public InvoicesGetByIdResponseInvoice orders(List<String> orders) {
    
    
    
    
    this.orders = orders;
    return this;
  }

  public InvoicesGetByIdResponseInvoice addOrdersItem(String ordersItem) {
    if (this.orders == null) {
      this.orders = new ArrayList<>();
    }
    this.orders.add(ordersItem);
    return this;
  }

   /**
   * List of orders related to the invoice (it doesn&#39;t apply to prefunding)
   * @return orders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"ABC123456789\",\"DEF123456789\"]", value = "List of orders related to the invoice (it doesn't apply to prefunding)")

  public List<String> getOrders() {
    return orders;
  }


  public void setOrders(List<String> orders) {
    
    
    
    this.orders = orders;
  }


  public InvoicesGetByIdResponseInvoice rewards(List<String> rewards) {
    
    
    
    
    this.rewards = rewards;
    return this;
  }

  public InvoicesGetByIdResponseInvoice addRewardsItem(String rewardsItem) {
    if (this.rewards == null) {
      this.rewards = new ArrayList<>();
    }
    this.rewards.add(rewardsItem);
    return this;
  }

   /**
   * List of rewards related to the invoice (it doesn&#39;t apply to prefunding)
   * @return rewards
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"ABC123456789\",\"DEF123456789\"]", value = "List of rewards related to the invoice (it doesn't apply to prefunding)")

  public List<String> getRewards() {
    return rewards;
  }


  public void setRewards(List<String> rewards) {
    
    
    
    this.rewards = rewards;
  }


  public InvoicesGetByIdResponseInvoice createdAt(LocalDate createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp of when the invoice has been created. 
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Timestamp of when the invoice has been created. ")

  public LocalDate getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(LocalDate createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public InvoicesGetByIdResponseInvoice paidAt(LocalDate paidAt) {
    
    
    
    
    this.paidAt = paidAt;
    return this;
  }

   /**
   * Timestamp of when the invoice has been paid. 
   * @return paidAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Timestamp of when the invoice has been paid. ")

  public LocalDate getPaidAt() {
    return paidAt;
  }


  public void setPaidAt(LocalDate paidAt) {
    
    
    
    this.paidAt = paidAt;
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
   * @return the InvoicesGetByIdResponseInvoice instance itself
   */
  public InvoicesGetByIdResponseInvoice putAdditionalProperty(String key, Object value) {
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
    InvoicesGetByIdResponseInvoice invoicesGetByIdResponseInvoice = (InvoicesGetByIdResponseInvoice) o;
    return Objects.equals(this.id, invoicesGetByIdResponseInvoice.id) &&
        Objects.equals(this.poNumber, invoicesGetByIdResponseInvoice.poNumber) &&
        Objects.equals(this.amount, invoicesGetByIdResponseInvoice.amount) &&
        Objects.equals(this.status, invoicesGetByIdResponseInvoice.status) &&
        Objects.equals(this.orders, invoicesGetByIdResponseInvoice.orders) &&
        Objects.equals(this.rewards, invoicesGetByIdResponseInvoice.rewards) &&
        Objects.equals(this.createdAt, invoicesGetByIdResponseInvoice.createdAt) &&
        Objects.equals(this.paidAt, invoicesGetByIdResponseInvoice.paidAt)&&
        Objects.equals(this.additionalProperties, invoicesGetByIdResponseInvoice.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, poNumber, amount, status, orders, rewards, createdAt, paidAt, additionalProperties);
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
    sb.append("class InvoicesGetByIdResponseInvoice {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    poNumber: ").append(toIndentedString(poNumber)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
    sb.append("    rewards: ").append(toIndentedString(rewards)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    paidAt: ").append(toIndentedString(paidAt)).append("\n");
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
    openapiFields.add("po_number");
    openapiFields.add("amount");
    openapiFields.add("status");
    openapiFields.add("orders");
    openapiFields.add("rewards");
    openapiFields.add("created_at");
    openapiFields.add("paid_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("paid_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvoicesGetByIdResponseInvoice
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InvoicesGetByIdResponseInvoice.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoicesGetByIdResponseInvoice is not found in the empty JSON string", InvoicesGetByIdResponseInvoice.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InvoicesGetByIdResponseInvoice.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("po_number").isJsonNull() && (jsonObj.get("po_number") != null && !jsonObj.get("po_number").isJsonNull()) && !jsonObj.get("po_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `po_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("po_number").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("orders") != null && !jsonObj.get("orders").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `orders` to be an array in the JSON string but got `%s`", jsonObj.get("orders").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("rewards") != null && !jsonObj.get("rewards").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rewards` to be an array in the JSON string but got `%s`", jsonObj.get("rewards").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoicesGetByIdResponseInvoice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoicesGetByIdResponseInvoice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoicesGetByIdResponseInvoice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoicesGetByIdResponseInvoice.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoicesGetByIdResponseInvoice>() {
           @Override
           public void write(JsonWriter out, InvoicesGetByIdResponseInvoice value) throws IOException {
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
           public InvoicesGetByIdResponseInvoice read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InvoicesGetByIdResponseInvoice instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InvoicesGetByIdResponseInvoice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoicesGetByIdResponseInvoice
  * @throws IOException if the JSON string is invalid with respect to InvoicesGetByIdResponseInvoice
  */
  public static InvoicesGetByIdResponseInvoice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoicesGetByIdResponseInvoice.class);
  }

 /**
  * Convert an instance of InvoicesGetByIdResponseInvoice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
