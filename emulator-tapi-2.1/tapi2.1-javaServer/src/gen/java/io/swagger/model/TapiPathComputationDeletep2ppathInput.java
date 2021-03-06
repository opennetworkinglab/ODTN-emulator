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
import javax.validation.constraints.*;

/**
 * TapiPathComputationDeletep2ppathInput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiPathComputationDeletep2ppathInput   {
  @JsonProperty("path-id-or-name")
  private String pathIdOrName = null;

  public TapiPathComputationDeletep2ppathInput pathIdOrName(String pathIdOrName) {
    this.pathIdOrName = pathIdOrName;
    return this;
  }

  /**
   * none
   * @return pathIdOrName
   **/
  @JsonProperty("path-id-or-name")
  @ApiModelProperty(value = "none")
  public String getPathIdOrName() {
    return pathIdOrName;
  }

  public void setPathIdOrName(String pathIdOrName) {
    this.pathIdOrName = pathIdOrName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPathComputationDeletep2ppathInput tapiPathComputationDeletep2ppathInput = (TapiPathComputationDeletep2ppathInput) o;
    return Objects.equals(this.pathIdOrName, tapiPathComputationDeletep2ppathInput.pathIdOrName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pathIdOrName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPathComputationDeletep2ppathInput {\n");
    
    sb.append("    pathIdOrName: ").append(toIndentedString(pathIdOrName)).append("\n");
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

