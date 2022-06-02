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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * V1alpha1ClusterStreamStatusStorageAddressServer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T16:21:29.113Z[Etc/UTC]")
public class V1alpha1ClusterStreamStatusStorageAddressServer {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;

  public static final String SERIALIZED_NAME_PROTOCOL_VERSION = "protocolVersion";
  @SerializedName(SERIALIZED_NAME_PROTOCOL_VERSION)
  private String protocolVersion;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_VARIABLES = "variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private Map<String, String> variables = null;


  public V1alpha1ClusterStreamStatusStorageAddressServer description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public V1alpha1ClusterStreamStatusStorageAddressServer protocol(String protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProtocol() {
    return protocol;
  }


  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  public V1alpha1ClusterStreamStatusStorageAddressServer protocolVersion(String protocolVersion) {
    
    this.protocolVersion = protocolVersion;
    return this;
  }

   /**
   * Get protocolVersion
   * @return protocolVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProtocolVersion() {
    return protocolVersion;
  }


  public void setProtocolVersion(String protocolVersion) {
    this.protocolVersion = protocolVersion;
  }


  public V1alpha1ClusterStreamStatusStorageAddressServer url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public V1alpha1ClusterStreamStatusStorageAddressServer variables(Map<String, String> variables) {
    
    this.variables = variables;
    return this;
  }

  public V1alpha1ClusterStreamStatusStorageAddressServer putVariablesItem(String key, String variablesItem) {
    if (this.variables == null) {
      this.variables = new HashMap<>();
    }
    this.variables.put(key, variablesItem);
    return this;
  }

   /**
   * Get variables
   * @return variables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getVariables() {
    return variables;
  }


  public void setVariables(Map<String, String> variables) {
    this.variables = variables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterStreamStatusStorageAddressServer v1alpha1ClusterStreamStatusStorageAddressServer = (V1alpha1ClusterStreamStatusStorageAddressServer) o;
    return Objects.equals(this.description, v1alpha1ClusterStreamStatusStorageAddressServer.description) &&
        Objects.equals(this.protocol, v1alpha1ClusterStreamStatusStorageAddressServer.protocol) &&
        Objects.equals(this.protocolVersion, v1alpha1ClusterStreamStatusStorageAddressServer.protocolVersion) &&
        Objects.equals(this.url, v1alpha1ClusterStreamStatusStorageAddressServer.url) &&
        Objects.equals(this.variables, v1alpha1ClusterStreamStatusStorageAddressServer.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, protocol, protocolVersion, url, variables);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterStreamStatusStorageAddressServer {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    protocolVersion: ").append(toIndentedString(protocolVersion)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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

