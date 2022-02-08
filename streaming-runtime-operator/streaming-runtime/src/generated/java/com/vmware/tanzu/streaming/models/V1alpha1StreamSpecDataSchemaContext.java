/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.19.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.vmware.tanzu.streaming.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vmware.tanzu.streaming.models.V1alpha1StreamSpecDataSchemaContextInline;
import com.vmware.tanzu.streaming.models.V1alpha1StreamSpecDataSchemaContextMetadataFields;
import com.vmware.tanzu.streaming.models.V1alpha1StreamSpecDataSchemaContextSchema;
import com.vmware.tanzu.streaming.models.V1alpha1StreamSpecDataSchemaContextTimeAttributes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * V1alpha1StreamSpecDataSchemaContext
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-28T15:22:14.271Z[Etc/UTC]")
public class V1alpha1StreamSpecDataSchemaContext {
  public static final String SERIALIZED_NAME_INLINE = "inline";
  @SerializedName(SERIALIZED_NAME_INLINE)
  private V1alpha1StreamSpecDataSchemaContextInline inline;

  public static final String SERIALIZED_NAME_METADATA_FIELDS = "metadataFields";
  @SerializedName(SERIALIZED_NAME_METADATA_FIELDS)
  private List<V1alpha1StreamSpecDataSchemaContextMetadataFields> metadataFields = null;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Map<String, String> options = null;

  public static final String SERIALIZED_NAME_PRIMARY_KEY = "primaryKey";
  @SerializedName(SERIALIZED_NAME_PRIMARY_KEY)
  private List<String> primaryKey = null;

  public static final String SERIALIZED_NAME_SCHEMA = "schema";
  @SerializedName(SERIALIZED_NAME_SCHEMA)
  private V1alpha1StreamSpecDataSchemaContextSchema schema;

  public static final String SERIALIZED_NAME_TIME_ATTRIBUTES = "timeAttributes";
  @SerializedName(SERIALIZED_NAME_TIME_ATTRIBUTES)
  private List<V1alpha1StreamSpecDataSchemaContextTimeAttributes> timeAttributes = null;


  public V1alpha1StreamSpecDataSchemaContext inline(V1alpha1StreamSpecDataSchemaContextInline inline) {
    
    this.inline = inline;
    return this;
  }

   /**
   * Get inline
   * @return inline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1StreamSpecDataSchemaContextInline getInline() {
    return inline;
  }


  public void setInline(V1alpha1StreamSpecDataSchemaContextInline inline) {
    this.inline = inline;
  }


  public V1alpha1StreamSpecDataSchemaContext metadataFields(List<V1alpha1StreamSpecDataSchemaContextMetadataFields> metadataFields) {
    
    this.metadataFields = metadataFields;
    return this;
  }

  public V1alpha1StreamSpecDataSchemaContext addMetadataFieldsItem(V1alpha1StreamSpecDataSchemaContextMetadataFields metadataFieldsItem) {
    if (this.metadataFields == null) {
      this.metadataFields = new ArrayList<>();
    }
    this.metadataFields.add(metadataFieldsItem);
    return this;
  }

   /**
   * Get metadataFields
   * @return metadataFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1alpha1StreamSpecDataSchemaContextMetadataFields> getMetadataFields() {
    return metadataFields;
  }


  public void setMetadataFields(List<V1alpha1StreamSpecDataSchemaContextMetadataFields> metadataFields) {
    this.metadataFields = metadataFields;
  }


  public V1alpha1StreamSpecDataSchemaContext options(Map<String, String> options) {
    
    this.options = options;
    return this;
  }

  public V1alpha1StreamSpecDataSchemaContext putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getOptions() {
    return options;
  }


  public void setOptions(Map<String, String> options) {
    this.options = options;
  }


  public V1alpha1StreamSpecDataSchemaContext primaryKey(List<String> primaryKey) {
    
    this.primaryKey = primaryKey;
    return this;
  }

  public V1alpha1StreamSpecDataSchemaContext addPrimaryKeyItem(String primaryKeyItem) {
    if (this.primaryKey == null) {
      this.primaryKey = new ArrayList<>();
    }
    this.primaryKey.add(primaryKeyItem);
    return this;
  }

   /**
   * Get primaryKey
   * @return primaryKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPrimaryKey() {
    return primaryKey;
  }


  public void setPrimaryKey(List<String> primaryKey) {
    this.primaryKey = primaryKey;
  }


  public V1alpha1StreamSpecDataSchemaContext schema(V1alpha1StreamSpecDataSchemaContextSchema schema) {
    
    this.schema = schema;
    return this;
  }

   /**
   * Get schema
   * @return schema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1StreamSpecDataSchemaContextSchema getSchema() {
    return schema;
  }


  public void setSchema(V1alpha1StreamSpecDataSchemaContextSchema schema) {
    this.schema = schema;
  }


  public V1alpha1StreamSpecDataSchemaContext timeAttributes(List<V1alpha1StreamSpecDataSchemaContextTimeAttributes> timeAttributes) {
    
    this.timeAttributes = timeAttributes;
    return this;
  }

  public V1alpha1StreamSpecDataSchemaContext addTimeAttributesItem(V1alpha1StreamSpecDataSchemaContextTimeAttributes timeAttributesItem) {
    if (this.timeAttributes == null) {
      this.timeAttributes = new ArrayList<>();
    }
    this.timeAttributes.add(timeAttributesItem);
    return this;
  }

   /**
   * Get timeAttributes
   * @return timeAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1alpha1StreamSpecDataSchemaContextTimeAttributes> getTimeAttributes() {
    return timeAttributes;
  }


  public void setTimeAttributes(List<V1alpha1StreamSpecDataSchemaContextTimeAttributes> timeAttributes) {
    this.timeAttributes = timeAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1StreamSpecDataSchemaContext v1alpha1StreamSpecDataSchemaContext = (V1alpha1StreamSpecDataSchemaContext) o;
    return Objects.equals(this.inline, v1alpha1StreamSpecDataSchemaContext.inline) &&
        Objects.equals(this.metadataFields, v1alpha1StreamSpecDataSchemaContext.metadataFields) &&
        Objects.equals(this.options, v1alpha1StreamSpecDataSchemaContext.options) &&
        Objects.equals(this.primaryKey, v1alpha1StreamSpecDataSchemaContext.primaryKey) &&
        Objects.equals(this.schema, v1alpha1StreamSpecDataSchemaContext.schema) &&
        Objects.equals(this.timeAttributes, v1alpha1StreamSpecDataSchemaContext.timeAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inline, metadataFields, options, primaryKey, schema, timeAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1StreamSpecDataSchemaContext {\n");
    sb.append("    inline: ").append(toIndentedString(inline)).append("\n");
    sb.append("    metadataFields: ").append(toIndentedString(metadataFields)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    primaryKey: ").append(toIndentedString(primaryKey)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    timeAttributes: ").append(toIndentedString(timeAttributes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

