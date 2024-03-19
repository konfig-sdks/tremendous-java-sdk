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
import com.konfigthis.client.model.FundingSourceMeta;
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
 * 
 */
@ApiModel(description = "")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class FundingSource {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * You can pay for rewards using different payment methods on Tremendous:  &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Payment Method&lt;/th&gt;       &lt;th&gt;Description&lt;/th&gt;       &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;balance&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Pre-funded balance in your Tremendous account to draw funds from to send rewards to recipients.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;bank_account&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Bank account to draw funds from to send rewards to recipients.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;credit_card&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Credit card to draw funds from to send rewards to recipients.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;invoice&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Send rewards to recipients and pay by invoice.&lt;/td&gt;     &lt;/tr&gt;    &lt;/tbody&gt; &lt;/table&gt; 
   */
  @JsonAdapter(MethodEnum.Adapter.class)
 public enum MethodEnum {
    BALANCE("balance"),
    
    BANK_ACCOUNT("bank_account"),
    
    CREDIT_CARD("credit_card"),
    
    INVOICE("invoice");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MethodEnum fromValue(String value) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private MethodEnum method;

  /**
   * **Only available when &#x60;method&#x60; is set to &#x60;invoice&#x60;.** 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    COMMERCIAL("COMMERCIAL"),
    
    PRO_FORMA("PRO_FORMA"),
    
    PREFUNDING_ONLY("PREFUNDING_ONLY");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private FundingSourceMeta meta;

  public FundingSource() {
  }

  
  public FundingSource(
     String id
  ) {
    this();
    this.id = id;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "SOMEIDSOMEID", required = true, value = "")

  public String getId() {
    return id;
  }




  public FundingSource method(MethodEnum method) {
    
    
    
    
    this.method = method;
    return this;
  }

   /**
   * You can pay for rewards using different payment methods on Tremendous:  &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Payment Method&lt;/th&gt;       &lt;th&gt;Description&lt;/th&gt;       &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;balance&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Pre-funded balance in your Tremendous account to draw funds from to send rewards to recipients.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;bank_account&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Bank account to draw funds from to send rewards to recipients.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;credit_card&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Credit card to draw funds from to send rewards to recipients.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;invoice&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Send rewards to recipients and pay by invoice.&lt;/td&gt;     &lt;/tr&gt;    &lt;/tbody&gt; &lt;/table&gt; 
   * @return method
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "BALANCE", required = true, value = "You can pay for rewards using different payment methods on Tremendous:  <table>   <thead>     <tr>       <th>Payment Method</th>       <th>Description</th>       </tr>   </thead>   <tbody>     <tr>       <td><code>balance</code></td>       <td>Pre-funded balance in your Tremendous account to draw funds from to send rewards to recipients.</td>     </tr>     <tr>       <td><code>bank_account</code></td>       <td>Bank account to draw funds from to send rewards to recipients.</td>     </tr>     <tr>       <td><code>credit_card</code></td>       <td>Credit card to draw funds from to send rewards to recipients.</td>     </tr>     <tr>       <td><code>invoice</code></td>       <td>Send rewards to recipients and pay by invoice.</td>     </tr>    </tbody> </table> ")

  public MethodEnum getMethod() {
    return method;
  }


  public void setMethod(MethodEnum method) {
    
    
    
    this.method = method;
  }


  public FundingSource type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * **Only available when &#x60;method&#x60; is set to &#x60;invoice&#x60;.** 
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "COMMERCIAL", value = "**Only available when `method` is set to `invoice`.** ")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public FundingSource meta(FundingSourceMeta meta) {
    
    
    
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public FundingSourceMeta getMeta() {
    return meta;
  }


  public void setMeta(FundingSourceMeta meta) {
    
    
    
    this.meta = meta;
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
   * @return the FundingSource instance itself
   */
  public FundingSource putAdditionalProperty(String key, Object value) {
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
    FundingSource fundingSource = (FundingSource) o;
    return Objects.equals(this.id, fundingSource.id) &&
        Objects.equals(this.method, fundingSource.method) &&
        Objects.equals(this.type, fundingSource.type) &&
        Objects.equals(this.meta, fundingSource.meta)&&
        Objects.equals(this.additionalProperties, fundingSource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, method, type, meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundingSource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
    openapiFields.add("method");
    openapiFields.add("type");
    openapiFields.add("meta");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("method");
    openapiRequiredFields.add("meta");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FundingSource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FundingSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FundingSource is not found in the empty JSON string", FundingSource.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FundingSource.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `meta`
      FundingSourceMeta.validateJsonObject(jsonObj.getAsJsonObject("meta"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FundingSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FundingSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FundingSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FundingSource.class));

       return (TypeAdapter<T>) new TypeAdapter<FundingSource>() {
           @Override
           public void write(JsonWriter out, FundingSource value) throws IOException {
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
           public FundingSource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FundingSource instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FundingSource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FundingSource
  * @throws IOException if the JSON string is invalid with respect to FundingSource
  */
  public static FundingSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FundingSource.class);
  }

 /**
  * Convert an instance of FundingSource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

