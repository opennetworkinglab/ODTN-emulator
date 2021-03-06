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
import io.swagger.model.TapiOduOduConnectionEndPointSpec;
import javax.validation.constraints.*;

/**
 * TapiOduMepAugmentation1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiOduMepAugmentation1   {
  @JsonProperty("odu-connection-end-point-spec")
  private TapiOduOduConnectionEndPointSpec oduConnectionEndPointSpec = null;

  public TapiOduMepAugmentation1 oduConnectionEndPointSpec(TapiOduOduConnectionEndPointSpec oduConnectionEndPointSpec) {
    this.oduConnectionEndPointSpec = oduConnectionEndPointSpec;
    return this;
  }

  /**
   * none
   * @return oduConnectionEndPointSpec
   **/
  @JsonProperty("odu-connection-end-point-spec")
  @ApiModelProperty(value = "none")
  public TapiOduOduConnectionEndPointSpec getOduConnectionEndPointSpec() {
    return oduConnectionEndPointSpec;
  }

  public void setOduConnectionEndPointSpec(TapiOduOduConnectionEndPointSpec oduConnectionEndPointSpec) {
    this.oduConnectionEndPointSpec = oduConnectionEndPointSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOduMepAugmentation1 tapiOduMepAugmentation1 = (TapiOduMepAugmentation1) o;
    return Objects.equals(this.oduConnectionEndPointSpec, tapiOduMepAugmentation1.oduConnectionEndPointSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oduConnectionEndPointSpec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOduMepAugmentation1 {\n");
    
    sb.append("    oduConnectionEndPointSpec: ").append(toIndentedString(oduConnectionEndPointSpec)).append("\n");
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

