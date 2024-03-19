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
 * Each organization has one or more users that can access and manage that organization. These users are called members.  Members can take actions via the Tremendous web dashboard directly.  These actions include adding funding sources to the organization, creating Campaigns, and more. 
 */
@ApiModel(description = "Each organization has one or more users that can access and manage that organization. These users are called members.  Members can take actions via the Tremendous web dashboard directly.  These actions include adding funding sources to the organization, creating Campaigns, and more. ")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Member {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Role of the member within the organization.  &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Role&lt;/th&gt;       &lt;th&gt;Description&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;MEMBER&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Limited permissions. Can view their own reward and order histories only.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;ADMIN&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Update organization settings, invite other members to the organization, and view all member order and reward histories within their organization.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;DELETED&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;No longer a member of this organization.&lt;/td&gt;     &lt;/tr&gt;   &lt;tbody&gt;   &lt;/tbody&gt; &lt;/table&gt; 
   */
  @JsonAdapter(RoleEnum.Adapter.class)
 public enum RoleEnum {
    MEMBER("MEMBER"),
    
    ADMIN("ADMIN"),
    
    DELETED("DELETED");

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

  /**
   * Current status of the member&#39;s account.  When creating a member it starts out in the status &#x60;INVITED&#x60;. As soon as that member open the invitation link and registers an account, the status switches to &#x60;REGISTERED&#x60;. 
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    REGISTERED("REGISTERED"),
    
    INVITED("INVITED");

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
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_LAST_LOGIN_AT = "last_login_at";
  @SerializedName(SERIALIZED_NAME_LAST_LOGIN_AT)
  private OffsetDateTime lastLoginAt;

  public Member() {
  }

  
  public Member(
     String id, 
     StatusEnum status, 
     OffsetDateTime createdAt, 
     OffsetDateTime lastLoginAt
  ) {
    this();
    this.id = id;
    this.status = status;
    this.createdAt = createdAt;
    this.lastLoginAt = lastLoginAt;
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




  public Member email(String email) {
    
    
    
    
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


  public Member name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Full name of the member
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Jane Doe", required = true, value = "Full name of the member")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public Member role(RoleEnum role) {
    
    
    
    
    this.role = role;
    return this;
  }

   /**
   * Role of the member within the organization.  &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Role&lt;/th&gt;       &lt;th&gt;Description&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;MEMBER&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Limited permissions. Can view their own reward and order histories only.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;ADMIN&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;Update organization settings, invite other members to the organization, and view all member order and reward histories within their organization.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;&lt;code&gt;DELETED&lt;/code&gt;&lt;/td&gt;       &lt;td&gt;No longer a member of this organization.&lt;/td&gt;     &lt;/tr&gt;   &lt;tbody&gt;   &lt;/tbody&gt; &lt;/table&gt; 
   * @return role
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Role of the member within the organization.  <table>   <thead>     <tr>       <th>Role</th>       <th>Description</th>     </tr>   </thead>     <tr>       <td><code>MEMBER</code></td>       <td>Limited permissions. Can view their own reward and order histories only.</td>     </tr>     <tr>       <td><code>ADMIN</code></td>       <td>Update organization settings, invite other members to the organization, and view all member order and reward histories within their organization.</td>     </tr>     <tr>       <td><code>DELETED</code></td>       <td>No longer a member of this organization.</td>     </tr>   <tbody>   </tbody> </table> ")

  public RoleEnum getRole() {
    return role;
  }


  public void setRole(RoleEnum role) {
    
    
    
    this.role = role;
  }


   /**
   * Current status of the member&#39;s account.  When creating a member it starts out in the status &#x60;INVITED&#x60;. As soon as that member open the invitation link and registers an account, the status switches to &#x60;REGISTERED&#x60;. 
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "INVITED", required = true, value = "Current status of the member's account.  When creating a member it starts out in the status `INVITED`. As soon as that member open the invitation link and registers an account, the status switches to `REGISTERED`. ")

  public StatusEnum getStatus() {
    return status;
  }




   /**
   * Timestamp when this member was created.  The &#x60;created_at&#x60; timestamp is **NOT** returned when retrieving a member (but is part of the response when listing or creating members). 
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-08-02T11:05:59Z", value = "Timestamp when this member was created.  The `created_at` timestamp is **NOT** returned when retrieving a member (but is part of the response when listing or creating members). ")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * Timestamp when this member most recently logged into the dashboard of the organization associated with this API key. 
   * @return lastLoginAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-08-02T11:05:59Z", value = "Timestamp when this member most recently logged into the dashboard of the organization associated with this API key. ")

  public OffsetDateTime getLastLoginAt() {
    return lastLoginAt;
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
   * @return the Member instance itself
   */
  public Member putAdditionalProperty(String key, Object value) {
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
    Member member = (Member) o;
    return Objects.equals(this.id, member.id) &&
        Objects.equals(this.email, member.email) &&
        Objects.equals(this.name, member.name) &&
        Objects.equals(this.role, member.role) &&
        Objects.equals(this.status, member.status) &&
        Objects.equals(this.createdAt, member.createdAt) &&
        Objects.equals(this.lastLoginAt, member.lastLoginAt)&&
        Objects.equals(this.additionalProperties, member.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, name, role, status, createdAt, lastLoginAt, additionalProperties);
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
    sb.append("class Member {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    lastLoginAt: ").append(toIndentedString(lastLoginAt)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("name");
    openapiFields.add("role");
    openapiFields.add("status");
    openapiFields.add("created_at");
    openapiFields.add("last_login_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("role");
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Member
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Member.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Member is not found in the empty JSON string", Member.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Member.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (!jsonObj.get("name").isJsonNull() && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Member.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Member' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Member> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Member.class));

       return (TypeAdapter<T>) new TypeAdapter<Member>() {
           @Override
           public void write(JsonWriter out, Member value) throws IOException {
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
           public Member read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Member instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Member given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Member
  * @throws IOException if the JSON string is invalid with respect to Member
  */
  public static Member fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Member.class);
  }

 /**
  * Convert an instance of Member to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

