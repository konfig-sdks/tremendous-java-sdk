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
 * MembersCreateNewMemberRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MembersCreateNewMemberRequest {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Role of the member within the organization.  &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Role&lt;/th&gt;       &lt;th&gt;Description&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;MEMBER&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Limited permissions. Can view their own reward and order histories only.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;ADMIN&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Update organization settings, invite other members to the organization, and view all member order and reward histories within their organization.&lt;/td&gt;     &lt;/tr&gt;   &lt;tbody&gt; &lt;/table&gt; 
   */
  @JsonAdapter(RoleEnum.Adapter.class)
 public enum RoleEnum {
    MEMBER("MEMBER"),
    
    ADMIN("ADMIN");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RoleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RoleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RoleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private RoleEnum role;

  public MembersCreateNewMemberRequest() {
  }

  public MembersCreateNewMemberRequest email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Email address of the member
   * @return email
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "jane@example.com", required = true, value = "Email address of the member")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public MembersCreateNewMemberRequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Full name of the member
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Jane Doe", required = true, value = "Full name of the member")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public MembersCreateNewMemberRequest role(RoleEnum role) {
    
    
    
    
    this.role = role;
    return this;
  }

   /**
   * Role of the member within the organization.  &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Role&lt;/th&gt;       &lt;th&gt;Description&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;MEMBER&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Limited permissions. Can view their own reward and order histories only.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;ADMIN&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Update organization settings, invite other members to the organization, and view all member order and reward histories within their organization.&lt;/td&gt;     &lt;/tr&gt;   &lt;tbody&gt; &lt;/table&gt; 
   * @return role
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "MEMBER", required = true, value = "Role of the member within the organization.  <table>   <thead>     <tr>       <th>Role</th>       <th>Description</th>     </tr>   </thead>     <tr>       <td><code>MEMBER</code></td>       <td>Limited permissions. Can view their own reward and order histories only.</td>     </tr>     <tr>       <td><code>ADMIN</code></td>       <td>Update organization settings, invite other members to the organization, and view all member order and reward histories within their organization.</td>     </tr>   <tbody> </table> ")

  public RoleEnum getRole() {
    return role;
  }


  public void setRole(RoleEnum role) {
    
    
    
    this.role = role;
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
   * @return the MembersCreateNewMemberRequest instance itself
   */
  public MembersCreateNewMemberRequest putAdditionalProperty(String key, Object value) {
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
    MembersCreateNewMemberRequest membersCreateNewMemberRequest = (MembersCreateNewMemberRequest) o;
    return Objects.equals(this.email, membersCreateNewMemberRequest.email) &&
        Objects.equals(this.name, membersCreateNewMemberRequest.name) &&
        Objects.equals(this.role, membersCreateNewMemberRequest.role)&&
        Objects.equals(this.additionalProperties, membersCreateNewMemberRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, name, role, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MembersCreateNewMemberRequest {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("name");
    openapiFields.add("role");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("role");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MembersCreateNewMemberRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MembersCreateNewMemberRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MembersCreateNewMemberRequest is not found in the empty JSON string", MembersCreateNewMemberRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MembersCreateNewMemberRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MembersCreateNewMemberRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MembersCreateNewMemberRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MembersCreateNewMemberRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MembersCreateNewMemberRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<MembersCreateNewMemberRequest>() {
           @Override
           public void write(JsonWriter out, MembersCreateNewMemberRequest value) throws IOException {
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
           public MembersCreateNewMemberRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MembersCreateNewMemberRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MembersCreateNewMemberRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MembersCreateNewMemberRequest
  * @throws IOException if the JSON string is invalid with respect to MembersCreateNewMemberRequest
  */
  public static MembersCreateNewMemberRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MembersCreateNewMemberRequest.class);
  }

 /**
  * Convert an instance of MembersCreateNewMemberRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

