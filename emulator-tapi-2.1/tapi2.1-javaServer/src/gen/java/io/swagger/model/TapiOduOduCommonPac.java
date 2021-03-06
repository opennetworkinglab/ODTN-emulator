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
 * TapiOduOduCommonPac
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiOduOduCommonPac   {
  @JsonProperty("odu-rate-tolerance")
  private Integer oduRateTolerance = null;

  @JsonProperty("odu-rate")
  private Integer oduRate = null;

  @JsonProperty("odu-type")
  private String oduType = null;

  public TapiOduOduCommonPac oduRateTolerance(Integer oduRateTolerance) {
    this.oduRateTolerance = oduRateTolerance;
    return this;
  }

  /**
   * This attribute indicates the rate tolerance of the ODU termination point.                       Valid values are real value in the unit of ppm.                       Standardized values are defined in Table 7-2/G.709.
   * @return oduRateTolerance
   **/
  @JsonProperty("odu-rate-tolerance")
  @ApiModelProperty(value = "This attribute indicates the rate tolerance of the ODU termination point.                       Valid values are real value in the unit of ppm.                       Standardized values are defined in Table 7-2/G.709.")
  public Integer getOduRateTolerance() {
    return oduRateTolerance;
  }

  public void setOduRateTolerance(Integer oduRateTolerance) {
    this.oduRateTolerance = oduRateTolerance;
  }

  public TapiOduOduCommonPac oduRate(Integer oduRate) {
    this.oduRate = oduRate;
    return this;
  }

  /**
   * This attribute indicates the rate of the ODU terminatino point.                       This attribute is Set at create; i.e., once created it cannot be changed directly.                       In case of resizable ODU flex, its value can be changed via HAO (not directly on the attribute).                       
   * @return oduRate
   **/
  @JsonProperty("odu-rate")
  @ApiModelProperty(value = "This attribute indicates the rate of the ODU terminatino point.                       This attribute is Set at create; i.e., once created it cannot be changed directly.                       In case of resizable ODU flex, its value can be changed via HAO (not directly on the attribute).                       ")
  public Integer getOduRate() {
    return oduRate;
  }

  public void setOduRate(Integer oduRate) {
    this.oduRate = oduRate;
  }

  public TapiOduOduCommonPac oduType(String oduType) {
    this.oduType = oduType;
    return this;
  }

  /**
   * This attribute specifies the type of the ODU termination point.
   * @return oduType
   **/
  @JsonProperty("odu-type")
  @ApiModelProperty(value = "This attribute specifies the type of the ODU termination point.")
  public String getOduType() {
    return oduType;
  }

  public void setOduType(String oduType) {
    this.oduType = oduType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOduOduCommonPac tapiOduOduCommonPac = (TapiOduOduCommonPac) o;
    return Objects.equals(this.oduRateTolerance, tapiOduOduCommonPac.oduRateTolerance) &&
        Objects.equals(this.oduRate, tapiOduOduCommonPac.oduRate) &&
        Objects.equals(this.oduType, tapiOduOduCommonPac.oduType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oduRateTolerance, oduRate, oduType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOduOduCommonPac {\n");
    
    sb.append("    oduRateTolerance: ").append(toIndentedString(oduRateTolerance)).append("\n");
    sb.append("    oduRate: ").append(toIndentedString(oduRate)).append("\n");
    sb.append("    oduType: ").append(toIndentedString(oduType)).append("\n");
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

