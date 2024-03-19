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
import java.net.URI;
import java.time.LocalDate;

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
 * Organizations are a way to separate different parts of your business within the same Tremendous account. Your root Tremendous account is an organization itself and can have multiple sub-organizations.  You can assign users in your Tremendous team as members to any organization. Users can be members of multiple organizations at once.  Each organizations can have it&#39;s own API key. 
 */
@ApiModel(description = "Organizations are a way to separate different parts of your business within the same Tremendous account. Your root Tremendous account is an organization itself and can have multiple sub-organizations.  You can assign users in your Tremendous team as members to any organization. Users can be members of multiple organizations at once.  Each organizations can have it's own API key. ")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OrganizationsGetOrganizationResponseOrganization {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private URI website;

  /**
   * Status of the organization. Organizations need to be approved to be able to use them to send out rewards.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    PENDING("PENDING"),
    
    APPROVED("APPROVED"),
    
    REJECTED("REJECTED");

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

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private LocalDate createdAt;

  public OrganizationsGetOrganizationResponseOrganization() {
  }

  public OrganizationsGetOrganizationResponseOrganization id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SOMEIDSOMEID", value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public OrganizationsGetOrganizationResponseOrganization name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Name of the organization
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ACME Inc.", required = true, value = "Name of the organization")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public OrganizationsGetOrganizationResponseOrganization website(URI website) {
    
    
    
    
    this.website = website;
    return this;
  }

   /**
   * URL of the website of that organization
   * @return website
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://www.example.com/some-org", required = true, value = "URL of the website of that organization")

  public URI getWebsite() {
    return website;
  }


  public void setWebsite(URI website) {
    
    
    
    this.website = website;
  }


  public OrganizationsGetOrganizationResponseOrganization status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Status of the organization. Organizations need to be approved to be able to use them to send out rewards.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "APPROVED", value = "Status of the organization. Organizations need to be approved to be able to use them to send out rewards.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public OrganizationsGetOrganizationResponseOrganization createdAt(LocalDate createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp of when the organization has been created.  *This field is only returned when creating an organization.* It is not returned anymore when retrieving or listing organizations. 
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sun Aug 01 17:00:00 PDT 2021", value = "Timestamp of when the organization has been created.  *This field is only returned when creating an organization.* It is not returned anymore when retrieving or listing organizations. ")

  public LocalDate getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(LocalDate createdAt) {
    
    
    
    this.createdAt = createdAt;
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
   * @return the OrganizationsGetOrganizationResponseOrganization instance itself
   */
  public OrganizationsGetOrganizationResponseOrganization putAdditionalProperty(String key, Object value) {
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
    OrganizationsGetOrganizationResponseOrganization organizationsGetOrganizationResponseOrganization = (OrganizationsGetOrganizationResponseOrganization) o;
    return Objects.equals(this.id, organizationsGetOrganizationResponseOrganization.id) &&
        Objects.equals(this.name, organizationsGetOrganizationResponseOrganization.name) &&
        Objects.equals(this.website, organizationsGetOrganizationResponseOrganization.website) &&
        Objects.equals(this.status, organizationsGetOrganizationResponseOrganization.status) &&
        Objects.equals(this.createdAt, organizationsGetOrganizationResponseOrganization.createdAt)&&
        Objects.equals(this.additionalProperties, organizationsGetOrganizationResponseOrganization.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, website, status, createdAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationsGetOrganizationResponseOrganization {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("website");
    openapiFields.add("status");
    openapiFields.add("created_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("website");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrganizationsGetOrganizationResponseOrganization
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrganizationsGetOrganizationResponseOrganization.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrganizationsGetOrganizationResponseOrganization is not found in the empty JSON string", OrganizationsGetOrganizationResponseOrganization.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrganizationsGetOrganizationResponseOrganization.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("website").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `website` to be a primitive type in the JSON string but got `%s`", jsonObj.get("website").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrganizationsGetOrganizationResponseOrganization.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrganizationsGetOrganizationResponseOrganization' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrganizationsGetOrganizationResponseOrganization> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrganizationsGetOrganizationResponseOrganization.class));

       return (TypeAdapter<T>) new TypeAdapter<OrganizationsGetOrganizationResponseOrganization>() {
           @Override
           public void write(JsonWriter out, OrganizationsGetOrganizationResponseOrganization value) throws IOException {
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
           public OrganizationsGetOrganizationResponseOrganization read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OrganizationsGetOrganizationResponseOrganization instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OrganizationsGetOrganizationResponseOrganization given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrganizationsGetOrganizationResponseOrganization
  * @throws IOException if the JSON string is invalid with respect to OrganizationsGetOrganizationResponseOrganization
  */
  public static OrganizationsGetOrganizationResponseOrganization fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrganizationsGetOrganizationResponseOrganization.class);
  }

 /**
  * Convert an instance of OrganizationsGetOrganizationResponseOrganization to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

