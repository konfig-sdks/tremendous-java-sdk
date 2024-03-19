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
 * RewardWithoutLinkValue
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RewardWithoutLinkValue {
  public static final String SERIALIZED_NAME_DENOMINATION = "denomination";
  @SerializedName(SERIALIZED_NAME_DENOMINATION)
  private Double denomination;

  /**
   * Currency of the reward
   */
  @JsonAdapter(CurrencyCodeEnum.Adapter.class)
 public enum CurrencyCodeEnum {
    USD("USD"),
    
    CAD("CAD"),
    
    EUR("EUR"),
    
    AED("AED"),
    
    AFN("AFN"),
    
    ALL("ALL"),
    
    AMD("AMD"),
    
    ARS("ARS"),
    
    AUD("AUD"),
    
    AZN("AZN"),
    
    BAM("BAM"),
    
    BDT("BDT"),
    
    BGN("BGN"),
    
    BHD("BHD"),
    
    BIF("BIF"),
    
    BND("BND"),
    
    BOB("BOB"),
    
    BRL("BRL"),
    
    BWP("BWP"),
    
    BYR("BYR"),
    
    BZD("BZD"),
    
    CDF("CDF"),
    
    CHF("CHF"),
    
    CLP("CLP"),
    
    CNY("CNY"),
    
    COP("COP"),
    
    CRC("CRC"),
    
    CVE("CVE"),
    
    CZK("CZK"),
    
    DJF("DJF"),
    
    DKK("DKK"),
    
    DOP("DOP"),
    
    DZD("DZD"),
    
    EEK("EEK"),
    
    EGP("EGP"),
    
    ERN("ERN"),
    
    ETB("ETB"),
    
    GBP("GBP"),
    
    GEL("GEL"),
    
    GHS("GHS"),
    
    GNF("GNF"),
    
    GTQ("GTQ"),
    
    HKD("HKD"),
    
    HNL("HNL"),
    
    HRK("HRK"),
    
    HUF("HUF"),
    
    IDR("IDR"),
    
    ILS("ILS"),
    
    INR("INR"),
    
    IQD("IQD"),
    
    IRR("IRR"),
    
    ISK("ISK"),
    
    JMD("JMD"),
    
    JOD("JOD"),
    
    JPY("JPY"),
    
    KES("KES"),
    
    KHR("KHR"),
    
    KRW("KRW"),
    
    KWD("KWD"),
    
    KZT("KZT"),
    
    LBP("LBP"),
    
    LKR("LKR"),
    
    LTL("LTL"),
    
    LVL("LVL"),
    
    MAD("MAD"),
    
    MDL("MDL"),
    
    MGA("MGA"),
    
    MKD("MKD"),
    
    MMK("MMK"),
    
    MOP("MOP"),
    
    MUR("MUR"),
    
    MXN("MXN"),
    
    MYR("MYR"),
    
    MZN("MZN"),
    
    NAD("NAD"),
    
    NGN("NGN"),
    
    NIO("NIO"),
    
    NOK("NOK"),
    
    NPR("NPR"),
    
    NZD("NZD"),
    
    OMR("OMR"),
    
    PAB("PAB"),
    
    PEN("PEN"),
    
    PHP("PHP"),
    
    PKR("PKR"),
    
    PLN("PLN"),
    
    PYG("PYG"),
    
    QAR("QAR"),
    
    RON("RON"),
    
    RSD("RSD"),
    
    RUB("RUB"),
    
    RWF("RWF"),
    
    SAR("SAR"),
    
    SDG("SDG"),
    
    SEK("SEK"),
    
    SGD("SGD"),
    
    SOS("SOS"),
    
    SYP("SYP"),
    
    THB("THB"),
    
    TND("TND"),
    
    TOP("TOP"),
    
    TRY("TRY"),
    
    TTD("TTD"),
    
    TWD("TWD"),
    
    TZS("TZS"),
    
    UAH("UAH"),
    
    UGX("UGX"),
    
    UYU("UYU"),
    
    UZS("UZS"),
    
    VEF("VEF"),
    
    VND("VND"),
    
    XAF("XAF"),
    
    XOF("XOF"),
    
    YER("YER"),
    
    ZAR("ZAR"),
    
    ZMK("ZMK");

    private String value;

    CurrencyCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CurrencyCodeEnum fromValue(String value) {
      for (CurrencyCodeEnum b : CurrencyCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CurrencyCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CurrencyCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CurrencyCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CurrencyCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private CurrencyCodeEnum currencyCode;

  public RewardWithoutLinkValue() {
  }

  public RewardWithoutLinkValue denomination(Double denomination) {
    
    
    
    
    this.denomination = denomination;
    return this;
  }

   /**
   * Amount of the reward
   * @return denomination
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "50", required = true, value = "Amount of the reward")

  public Double getDenomination() {
    return denomination;
  }


  public void setDenomination(Double denomination) {
    
    
    
    this.denomination = denomination;
  }


  public RewardWithoutLinkValue currencyCode(CurrencyCodeEnum currencyCode) {
    
    
    
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Currency of the reward
   * @return currencyCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "USD", required = true, value = "Currency of the reward")

  public CurrencyCodeEnum getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(CurrencyCodeEnum currencyCode) {
    
    
    
    this.currencyCode = currencyCode;
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
   * @return the RewardWithoutLinkValue instance itself
   */
  public RewardWithoutLinkValue putAdditionalProperty(String key, Object value) {
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
    RewardWithoutLinkValue rewardWithoutLinkValue = (RewardWithoutLinkValue) o;
    return Objects.equals(this.denomination, rewardWithoutLinkValue.denomination) &&
        Objects.equals(this.currencyCode, rewardWithoutLinkValue.currencyCode)&&
        Objects.equals(this.additionalProperties, rewardWithoutLinkValue.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(denomination, currencyCode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RewardWithoutLinkValue {\n");
    sb.append("    denomination: ").append(toIndentedString(denomination)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
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
    openapiFields.add("denomination");
    openapiFields.add("currency_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("denomination");
    openapiRequiredFields.add("currency_code");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RewardWithoutLinkValue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RewardWithoutLinkValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RewardWithoutLinkValue is not found in the empty JSON string", RewardWithoutLinkValue.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RewardWithoutLinkValue.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RewardWithoutLinkValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RewardWithoutLinkValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RewardWithoutLinkValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RewardWithoutLinkValue.class));

       return (TypeAdapter<T>) new TypeAdapter<RewardWithoutLinkValue>() {
           @Override
           public void write(JsonWriter out, RewardWithoutLinkValue value) throws IOException {
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
           public RewardWithoutLinkValue read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RewardWithoutLinkValue instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RewardWithoutLinkValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RewardWithoutLinkValue
  * @throws IOException if the JSON string is invalid with respect to RewardWithoutLinkValue
  */
  public static RewardWithoutLinkValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RewardWithoutLinkValue.class);
  }

 /**
  * Convert an instance of RewardWithoutLinkValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

