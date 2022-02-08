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

/**
 * V1alpha1StreamSpecStorage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-08T13:25:48.598Z[Etc/UTC]")
public class V1alpha1StreamSpecStorage {
  public static final String SERIALIZED_NAME_CLUSTER_STREAM = "clusterStream";
  @SerializedName(SERIALIZED_NAME_CLUSTER_STREAM)
  private String clusterStream;


  public V1alpha1StreamSpecStorage clusterStream(String clusterStream) {
    
    this.clusterStream = clusterStream;
    return this;
  }

   /**
   * Get clusterStream
   * @return clusterStream
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClusterStream() {
    return clusterStream;
  }


  public void setClusterStream(String clusterStream) {
    this.clusterStream = clusterStream;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1StreamSpecStorage v1alpha1StreamSpecStorage = (V1alpha1StreamSpecStorage) o;
    return Objects.equals(this.clusterStream, v1alpha1StreamSpecStorage.clusterStream);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterStream);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1StreamSpecStorage {\n");
    sb.append("    clusterStream: ").append(toIndentedString(clusterStream)).append("\n");
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
