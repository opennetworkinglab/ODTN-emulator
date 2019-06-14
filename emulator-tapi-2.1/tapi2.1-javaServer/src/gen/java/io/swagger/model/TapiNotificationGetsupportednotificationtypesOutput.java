/*
 * tapi-common,tapi-dsr,tapi-path-computation,tapi-eth,tapi-virtual-network,tapi-topology,tapi-notification,tapi-oam,tapi-photonic-media,tapi-connectivity API
 * tapi-common,tapi-dsr,tapi-path-computation,tapi-eth,tapi-virtual-network,tapi-topology,tapi-notification,tapi-oam,tapi-photonic-media,tapi-connectivity API generated from yang definitions
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiNotificationNotificationType;
import io.swagger.model.TapiNotificationObjectType;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * TapiNotificationGetsupportednotificationtypesOutput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiNotificationGetsupportednotificationtypesOutput   {
  @JsonProperty("supported-object-types")
  private List<TapiNotificationObjectType> supportedObjectTypes = null;

  @JsonProperty("supported-notification-types")
  private List<TapiNotificationNotificationType> supportedNotificationTypes = null;

  public TapiNotificationGetsupportednotificationtypesOutput supportedObjectTypes(List<TapiNotificationObjectType> supportedObjectTypes) {
    this.supportedObjectTypes = supportedObjectTypes;
    return this;
  }

  public TapiNotificationGetsupportednotificationtypesOutput addSupportedObjectTypesItem(TapiNotificationObjectType supportedObjectTypesItem) {
    if (this.supportedObjectTypes == null) {
      this.supportedObjectTypes = new ArrayList<TapiNotificationObjectType>();
    }
    this.supportedObjectTypes.add(supportedObjectTypesItem);
    return this;
  }

  /**
   * none
   * @return supportedObjectTypes
   **/
  @JsonProperty("supported-object-types")
  @ApiModelProperty(value = "none")
  public List<TapiNotificationObjectType> getSupportedObjectTypes() {
    return supportedObjectTypes;
  }

  public void setSupportedObjectTypes(List<TapiNotificationObjectType> supportedObjectTypes) {
    this.supportedObjectTypes = supportedObjectTypes;
  }

  public TapiNotificationGetsupportednotificationtypesOutput supportedNotificationTypes(List<TapiNotificationNotificationType> supportedNotificationTypes) {
    this.supportedNotificationTypes = supportedNotificationTypes;
    return this;
  }

  public TapiNotificationGetsupportednotificationtypesOutput addSupportedNotificationTypesItem(TapiNotificationNotificationType supportedNotificationTypesItem) {
    if (this.supportedNotificationTypes == null) {
      this.supportedNotificationTypes = new ArrayList<TapiNotificationNotificationType>();
    }
    this.supportedNotificationTypes.add(supportedNotificationTypesItem);
    return this;
  }

  /**
   * none
   * @return supportedNotificationTypes
   **/
  @JsonProperty("supported-notification-types")
  @ApiModelProperty(value = "none")
  public List<TapiNotificationNotificationType> getSupportedNotificationTypes() {
    return supportedNotificationTypes;
  }

  public void setSupportedNotificationTypes(List<TapiNotificationNotificationType> supportedNotificationTypes) {
    this.supportedNotificationTypes = supportedNotificationTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiNotificationGetsupportednotificationtypesOutput tapiNotificationGetsupportednotificationtypesOutput = (TapiNotificationGetsupportednotificationtypesOutput) o;
    return Objects.equals(this.supportedObjectTypes, tapiNotificationGetsupportednotificationtypesOutput.supportedObjectTypes) &&
        Objects.equals(this.supportedNotificationTypes, tapiNotificationGetsupportednotificationtypesOutput.supportedNotificationTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportedObjectTypes, supportedNotificationTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiNotificationGetsupportednotificationtypesOutput {\n");
    
    sb.append("    supportedObjectTypes: ").append(toIndentedString(supportedObjectTypes)).append("\n");
    sb.append("    supportedNotificationTypes: ").append(toIndentedString(supportedNotificationTypes)).append("\n");
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
