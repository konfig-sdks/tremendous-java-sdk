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
 * ProductSkusInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ProductSkusInner {
  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  private Double min;

  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  private Double max;

  public ProductSkusInner() {
  }

  public ProductSkusInner min(Double min) {
    if (min != null && min < 0) {
      throw new IllegalArgumentException("Invalid value for min. Must be greater than or equal to 0.");
    }
    
    
    
    this.min = min;
    return this;
  }

  public ProductSkusInner min(Integer min) {
    if (min != null && min < 0) {
      throw new IllegalArgumentException("Invalid value for min. Must be greater than or equal to 0.");
    }
    
    
    
    this.min = min.doubleValue();
    return this;
  }

   /**
   * Minimal denomination that this product supports (in the product&#39;s currency)
   * minimum: 0
   * @return min
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "20", required = true, value = "Minimal denomination that this product supports (in the product's currency)")

  public Double getMin() {
    return min;
  }


  public void setMin(Double min) {
    if (min != null && min < 0) {
      throw new IllegalArgumentException("Invalid value for min. Must be greater than or equal to 0.");
    }
    
    
    this.min = min;
  }


  public ProductSkusInner max(Double max) {
    if (max != null && max < 0) {
      throw new IllegalArgumentException("Invalid value for max. Must be greater than or equal to 0.");
    }
    
    
    
    this.max = max;
    return this;
  }

  public ProductSkusInner max(Integer max) {
    if (max != null && max < 0) {
      throw new IllegalArgumentException("Invalid value for max. Must be greater than or equal to 0.");
    }
    
    
    
    this.max = max.doubleValue();
    return this;
  }

   /**
   * Maximum denomination that this product supports (in the product&#39;s currency)
   * minimum: 0
   * @return max
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "100", required = true, value = "Maximum denomination that this product supports (in the product's currency)")

  public Double getMax() {
    return max;
  }


  public void setMax(Double max) {
    if (max != null && max < 0) {
      throw new IllegalArgumentException("Invalid value for max. Must be greater than or equal to 0.");
    }
    
    
    this.max = max;
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
   * @return the ProductSkusInner instance itself
   */
  public ProductSkusInner putAdditionalProperty(String key, Object value) {
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
    ProductSkusInner productSkusInner = (ProductSkusInner) o;
    return Objects.equals(this.min, productSkusInner.min) &&
        Objects.equals(this.max, productSkusInner.max)&&
        Objects.equals(this.additionalProperties, productSkusInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSkusInner {\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
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
    openapiFields.add("min");
    openapiFields.add("max");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("min");
    openapiRequiredFields.add("max");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProductSkusInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProductSkusInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductSkusInner is not found in the empty JSON string", ProductSkusInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProductSkusInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductSkusInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductSkusInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductSkusInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductSkusInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductSkusInner>() {
           @Override
           public void write(JsonWriter out, ProductSkusInner value) throws IOException {
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
           public ProductSkusInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProductSkusInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProductSkusInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductSkusInner
  * @throws IOException if the JSON string is invalid with respect to ProductSkusInner
  */
  public static ProductSkusInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductSkusInner.class);
  }

 /**
  * Convert an instance of ProductSkusInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
