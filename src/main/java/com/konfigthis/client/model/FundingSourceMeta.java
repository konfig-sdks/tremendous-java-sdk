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
import java.time.OffsetDateTime;
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
 * FundingSourceMeta
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class FundingSourceMeta {
  public static final String SERIALIZED_NAME_AVAILABLE_CENTS = "available_cents";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_CENTS)
  private Integer availableCents;

  public static final String SERIALIZED_NAME_PENDING_CENTS = "pending_cents";
  @SerializedName(SERIALIZED_NAME_PENDING_CENTS)
  private Integer pendingCents;

  public static final String SERIALIZED_NAME_ACCOUNTHOLDER_NAME = "accountholder_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNTHOLDER_NAME)
  private String accountholderName;

  /**
   * **Only available when &#x60;method&#x60; is set to &#x60;bank_account&#x60;.**  Is this a checking or savings account 
   */
  @JsonAdapter(AccountTypeEnum.Adapter.class)
 public enum AccountTypeEnum {
    CHECKING("checking"),
    
    SAVINGS("savings");

    private String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountTypeEnum fromValue(String value) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccountTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private AccountTypeEnum accountType;

  public static final String SERIALIZED_NAME_BANK_NAME = "bank_name";
  @SerializedName(SERIALIZED_NAME_BANK_NAME)
  private String bankName;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER_MASK = "account_number_mask";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER_MASK)
  private String accountNumberMask;

  public static final String SERIALIZED_NAME_ACCOUNT_ROUTING_MASK = "account_routing_mask";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ROUTING_MASK)
  private String accountRoutingMask;

  public static final String SERIALIZED_NAME_REFUNDABLE = "refundable";
  @SerializedName(SERIALIZED_NAME_REFUNDABLE)
  private Boolean refundable;

  /**
   * **Only available when &#x60;method&#x60; is set to &#x60;credit_card&#x60;.**  Network of the credit card 
   */
  @JsonAdapter(NetworkEnum.Adapter.class)
 public enum NetworkEnum {
    MASTERCARD("MasterCard"),
    
    AMEX("Amex"),
    
    JCB("JCB"),
    
    DINER_S_CLUB("Diner's Club"),
    
    VISA("visa"),
    
    DISCOVER("discover"),
    
    LASER("laser"),
    
    ELO("elo"),
    
    MAESTRO("maestro"),
    
    SOLO("solo");

    private String value;

    NetworkEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NetworkEnum fromValue(String value) {
      for (NetworkEnum b : NetworkEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NetworkEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NetworkEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NetworkEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NetworkEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private NetworkEnum network;

  public static final String SERIALIZED_NAME_LAST4 = "last4";
  @SerializedName(SERIALIZED_NAME_LAST4)
  private String last4;

  public static final String SERIALIZED_NAME_EXPIRED = "expired";
  @SerializedName(SERIALIZED_NAME_EXPIRED)
  private Boolean expired;

  public static final String SERIALIZED_NAME_LAST_PAYMENT_FAILED_AT = "last_payment_failed_at";
  @SerializedName(SERIALIZED_NAME_LAST_PAYMENT_FAILED_AT)
  private OffsetDateTime lastPaymentFailedAt;

  public FundingSourceMeta() {
  }

  public FundingSourceMeta availableCents(Integer availableCents) {
    
    
    
    
    this.availableCents = availableCents;
    return this;
  }

   /**
   * **Only available when &#x60;method&#x60; is set to &#x60;balance&#x60;.**  Available amount for this funding source (in Cents USD) 
   * @return availableCents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50000", value = "**Only available when `method` is set to `balance`.**  Available amount for this funding source (in Cents USD) ")

  public Integer getAvailableCents() {
    return availableCents;
  }


  public void setAvailableCents(Integer availableCents) {
    
    
    
    this.availableCents = availableCents;
  }


  public FundingSourceMeta pendingCents(Integer pendingCents) {
    
    
    
    
    this.pendingCents = pendingCents;
    return this;
  }

   /**
   * **Only available when &#x60;method&#x60; is set to &#x60;balance&#x60;.**  Funds that are already registered on your Tremendous account but which have not yet been deposited in your account (e.g. unpaid invoices) (in Cents USD). 
   * @return pendingCents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25000", value = "**Only available when `method` is set to `balance`.**  Funds that are already registered on your Tremendous account but which have not yet been deposited in your account (e.g. unpaid invoices) (in Cents USD). ")

  public Integer getPendingCents() {
    return pendingCents;
  }


  public void setPendingCents(Integer pendingCents) {
    
    
    
    this.pendingCents = pendingCents;
  }


  public FundingSourceMeta accountholderName(String accountholderName) {
    
    
    
    
    this.accountholderName = accountholderName;
    return this;
  }

   /**
   * **Only available when &#x60;method&#x60; is set to &#x60;bank_account&#x60; or &#x60;credit_card&#x60;.**  Name of the holder of the bank account or credit_card 
   * @return accountholderName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Jane Doe", value = "**Only available when `method` is set to `bank_account` or `credit_card`.**  Name of the holder of the bank account or credit_card ")

  public String getAccountholderName() {
    return accountholderName;
  }


  public void setAccountholderName(String accountholderName) {
    
    
    
    this.accountholderName = accountholderName;
  }


  public FundingSourceMeta accountType(AccountTypeEnum accountType) {
    
    
    
    
    this.accountType = accountType;
    return this;
  }

   /**
   * **Only available when &#x60;method&#x60; is set to &#x60;bank_account&#x60;.**  Is this a checking or savings account 
   * @return accountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CHECKING", value = "**Only available when `method` is set to `bank_account`.**  Is this a checking or savings account ")

  public AccountTypeEnum getAccountType() {
    return accountType;
  }


  public void setAccountType(AccountTypeEnum accountType) {
    
    
    
    this.accountType = accountType;
  }


  public FundingSourceMeta bankName(String bankName) {
    
    
    
    
    this.bankName = bankName;
    return this;
  }

   /**
   * **Only available when &#x60;method&#x60; is set to &#x60;bank_account&#x60;.**  Name of the bank 
   * @return bankName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Bank of Fancyland", value = "**Only available when `method` is set to `bank_account`.**  Name of the bank ")

  public String getBankName() {
    return bankName;
  }


  public void setBankName(String bankName) {
    
    
    
    this.bankName = bankName;
  }


  public FundingSourceMeta accountNumberMask(String accountNumberMask) {
    
    
    
    
    this.accountNumberMask = accountNumberMask;
    return this;
  }

   /**
   * **Only available when &#x60;method&#x60; is set to &#x60;bank_account&#x60;.**  Last 4 digits of the account number 
   * @return accountNumberMask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234", value = "**Only available when `method` is set to `bank_account`.**  Last 4 digits of the account number ")

  public String getAccountNumberMask() {
    return accountNumberMask;
  }


  public void setAccountNumberMask(String accountNumberMask) {
    
    
    
    this.accountNumberMask = accountNumberMask;
  }


  public FundingSourceMeta accountRoutingMask(String accountRoutingMask) {
    
    
    
    
    this.accountRoutingMask = accountRoutingMask;
    return this;
  }

   /**
   * **Only available when &#x60;method&#x60; is set to &#x60;bank_account&#x60;.**  Last 4 digits of the routing number 
   * @return accountRoutingMask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5678", value = "**Only available when `method` is set to `bank_account`.**  Last 4 digits of the routing number ")

  public String getAccountRoutingMask() {
    return accountRoutingMask;
  }


  public void setAccountRoutingMask(String accountRoutingMask) {
    
    
    
    this.accountRoutingMask = accountRoutingMask;
  }


  public FundingSourceMeta refundable(Boolean refundable) {
    
    
    
    
    this.refundable = refundable;
    return this;
  }

   /**
   * **Only available when &#x60;method&#x60; is set to &#x60;bank_account&#x60;.**  Can refunds be deposited to this bank account 
   * @return refundable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "**Only available when `method` is set to `bank_account`.**  Can refunds be deposited to this bank account ")

  public Boolean getRefundable() {
    return refundable;
  }


  public void setRefundable(Boolean refundable) {
    
    
    
    this.refundable = refundable;
  }


  public FundingSourceMeta network(NetworkEnum network) {
    
    
    
    
    this.network = network;
    return this;
  }

   /**
   * **Only available when &#x60;method&#x60; is set to &#x60;credit_card&#x60;.**  Network of the credit card 
   * @return network
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AMEX", value = "**Only available when `method` is set to `credit_card`.**  Network of the credit card ")

  public NetworkEnum getNetwork() {
    return network;
  }


  public void setNetwork(NetworkEnum network) {
    
    
    
    this.network = network;
  }


  public FundingSourceMeta last4(String last4) {
    
    
    
    
    this.last4 = last4;
    return this;
  }

   /**
   * **Only available when &#x60;method&#x60; is set to &#x60;credit_card&#x60;.**  Last 4 digits of the credit card number 
   * @return last4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234", value = "**Only available when `method` is set to `credit_card`.**  Last 4 digits of the credit card number ")

  public String getLast4() {
    return last4;
  }


  public void setLast4(String last4) {
    
    
    
    this.last4 = last4;
  }


  public FundingSourceMeta expired(Boolean expired) {
    
    
    
    
    this.expired = expired;
    return this;
  }

   /**
   * **Only available when &#x60;method&#x60; is set to &#x60;credit_card&#x60;.**  Is this credit card expired 
   * @return expired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "**Only available when `method` is set to `credit_card`.**  Is this credit card expired ")

  public Boolean getExpired() {
    return expired;
  }


  public void setExpired(Boolean expired) {
    
    
    
    this.expired = expired;
  }


  public FundingSourceMeta lastPaymentFailedAt(OffsetDateTime lastPaymentFailedAt) {
    
    
    
    
    this.lastPaymentFailedAt = lastPaymentFailedAt;
    return this;
  }

   /**
   * **Only available when &#x60;method&#x60; is set to &#x60;bank_account&#x60; or &#x60;credit_card&#x60;.**  Point in time when the last order failed using this bank account or credit card as a funding source. 
   * @return lastPaymentFailedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "**Only available when `method` is set to `bank_account` or `credit_card`.**  Point in time when the last order failed using this bank account or credit card as a funding source. ")

  public OffsetDateTime getLastPaymentFailedAt() {
    return lastPaymentFailedAt;
  }


  public void setLastPaymentFailedAt(OffsetDateTime lastPaymentFailedAt) {
    
    
    
    this.lastPaymentFailedAt = lastPaymentFailedAt;
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
   * @return the FundingSourceMeta instance itself
   */
  public FundingSourceMeta putAdditionalProperty(String key, Object value) {
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
    FundingSourceMeta fundingSourceMeta = (FundingSourceMeta) o;
    return Objects.equals(this.availableCents, fundingSourceMeta.availableCents) &&
        Objects.equals(this.pendingCents, fundingSourceMeta.pendingCents) &&
        Objects.equals(this.accountholderName, fundingSourceMeta.accountholderName) &&
        Objects.equals(this.accountType, fundingSourceMeta.accountType) &&
        Objects.equals(this.bankName, fundingSourceMeta.bankName) &&
        Objects.equals(this.accountNumberMask, fundingSourceMeta.accountNumberMask) &&
        Objects.equals(this.accountRoutingMask, fundingSourceMeta.accountRoutingMask) &&
        Objects.equals(this.refundable, fundingSourceMeta.refundable) &&
        Objects.equals(this.network, fundingSourceMeta.network) &&
        Objects.equals(this.last4, fundingSourceMeta.last4) &&
        Objects.equals(this.expired, fundingSourceMeta.expired) &&
        Objects.equals(this.lastPaymentFailedAt, fundingSourceMeta.lastPaymentFailedAt)&&
        Objects.equals(this.additionalProperties, fundingSourceMeta.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableCents, pendingCents, accountholderName, accountType, bankName, accountNumberMask, accountRoutingMask, refundable, network, last4, expired, lastPaymentFailedAt, additionalProperties);
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
    sb.append("class FundingSourceMeta {\n");
    sb.append("    availableCents: ").append(toIndentedString(availableCents)).append("\n");
    sb.append("    pendingCents: ").append(toIndentedString(pendingCents)).append("\n");
    sb.append("    accountholderName: ").append(toIndentedString(accountholderName)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    accountNumberMask: ").append(toIndentedString(accountNumberMask)).append("\n");
    sb.append("    accountRoutingMask: ").append(toIndentedString(accountRoutingMask)).append("\n");
    sb.append("    refundable: ").append(toIndentedString(refundable)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    last4: ").append(toIndentedString(last4)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    lastPaymentFailedAt: ").append(toIndentedString(lastPaymentFailedAt)).append("\n");
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
    openapiFields.add("available_cents");
    openapiFields.add("pending_cents");
    openapiFields.add("accountholder_name");
    openapiFields.add("account_type");
    openapiFields.add("bank_name");
    openapiFields.add("account_number_mask");
    openapiFields.add("account_routing_mask");
    openapiFields.add("refundable");
    openapiFields.add("network");
    openapiFields.add("last4");
    openapiFields.add("expired");
    openapiFields.add("last_payment_failed_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FundingSourceMeta
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FundingSourceMeta.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FundingSourceMeta is not found in the empty JSON string", FundingSourceMeta.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("accountholder_name") != null && !jsonObj.get("accountholder_name").isJsonNull()) && !jsonObj.get("accountholder_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountholder_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountholder_name").toString()));
      }
      if ((jsonObj.get("account_type") != null && !jsonObj.get("account_type").isJsonNull()) && !jsonObj.get("account_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_type").toString()));
      }
      if (!jsonObj.get("bank_name").isJsonNull() && (jsonObj.get("bank_name") != null && !jsonObj.get("bank_name").isJsonNull()) && !jsonObj.get("bank_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_name").toString()));
      }
      if ((jsonObj.get("account_number_mask") != null && !jsonObj.get("account_number_mask").isJsonNull()) && !jsonObj.get("account_number_mask").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_number_mask` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_number_mask").toString()));
      }
      if ((jsonObj.get("account_routing_mask") != null && !jsonObj.get("account_routing_mask").isJsonNull()) && !jsonObj.get("account_routing_mask").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_routing_mask` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_routing_mask").toString()));
      }
      if ((jsonObj.get("network") != null && !jsonObj.get("network").isJsonNull()) && !jsonObj.get("network").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `network` to be a primitive type in the JSON string but got `%s`", jsonObj.get("network").toString()));
      }
      if ((jsonObj.get("last4") != null && !jsonObj.get("last4").isJsonNull()) && !jsonObj.get("last4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last4").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FundingSourceMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FundingSourceMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FundingSourceMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FundingSourceMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<FundingSourceMeta>() {
           @Override
           public void write(JsonWriter out, FundingSourceMeta value) throws IOException {
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
           public FundingSourceMeta read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FundingSourceMeta instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FundingSourceMeta given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FundingSourceMeta
  * @throws IOException if the JSON string is invalid with respect to FundingSourceMeta
  */
  public static FundingSourceMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FundingSourceMeta.class);
  }

 /**
  * Convert an instance of FundingSourceMeta to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

