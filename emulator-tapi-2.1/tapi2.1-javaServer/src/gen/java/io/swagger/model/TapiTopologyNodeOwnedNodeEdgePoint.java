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
import io.swagger.model.TapiCommonAdministrativeState;
import io.swagger.model.TapiCommonCapacity;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonLifecycleState;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonOperationalState;
import io.swagger.model.TapiCommonPortDirection;
import io.swagger.model.TapiCommonPortRole;
import io.swagger.model.TapiCommonServiceInterfacePointRef;
import io.swagger.model.TapiCommonTerminationDirection;
import io.swagger.model.TapiCommonTerminationState;
import io.swagger.model.TapiConnectivityContextTopologycontextTopologyNodeOwnednodeedgepointCepList;
import io.swagger.model.TapiConnectivityOwnedNodeEdgePointAugmentation3;
import io.swagger.model.TapiOduOduNodeEdgePointSpec;
import io.swagger.model.TapiOduOwnedNodeEdgePointAugmentation1;
import io.swagger.model.TapiPhotonicMediaMediaChannelNodeEdgePointSpec;
import io.swagger.model.TapiPhotonicMediaOwnedNodeEdgePointAugmentation2;
import io.swagger.model.TapiTopologyNodeEdgePoint;
import io.swagger.model.TapiTopologyNodeEdgePointRef;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * TapiTopologyNodeOwnedNodeEdgePoint
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiTopologyNodeOwnedNodeEdgePoint   {
  @JsonProperty("cep-list")
  private TapiConnectivityContextTopologycontextTopologyNodeOwnednodeedgepointCepList cepList = null;

  @JsonProperty("odu-node-edge-point-spec")
  private TapiOduOduNodeEdgePointSpec oduNodeEdgePointSpec = null;

  @JsonProperty("media-channel-node-edge-point-spec")
  private TapiPhotonicMediaMediaChannelNodeEdgePointSpec mediaChannelNodeEdgePointSpec = null;

  @JsonProperty("operational-state")
  private TapiCommonOperationalState operationalState = null;

  @JsonProperty("lifecycle-state")
  private TapiCommonLifecycleState lifecycleState = null;

  @JsonProperty("administrative-state")
  private TapiCommonAdministrativeState administrativeState = null;

  @JsonProperty("available-capacity")
  private TapiCommonCapacity availableCapacity = null;

  @JsonProperty("total-potential-capacity")
  private TapiCommonCapacity totalPotentialCapacity = null;

  @JsonProperty("name")
  private List<TapiCommonNameAndValue> name = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("termination-direction")
  private TapiCommonTerminationDirection terminationDirection = null;

  @JsonProperty("termination-state")
  private TapiCommonTerminationState terminationState = null;

  @JsonProperty("link-port-role")
  private TapiCommonPortRole linkPortRole = null;

  @JsonProperty("mapped-service-interface-point")
  private List<TapiCommonServiceInterfacePointRef> mappedServiceInterfacePoint = null;

  @JsonProperty("aggregated-node-edge-point")
  private List<TapiTopologyNodeEdgePointRef> aggregatedNodeEdgePoint = null;

  @JsonProperty("layer-protocol-name")
  private TapiCommonLayerProtocolName layerProtocolName = null;

  @JsonProperty("link-port-direction")
  private TapiCommonPortDirection linkPortDirection = null;

  @JsonProperty("supported-cep-layer-protocol-qualifier")
  private List<String> supportedCepLayerProtocolQualifier = null;

  public TapiTopologyNodeOwnedNodeEdgePoint cepList(TapiConnectivityContextTopologycontextTopologyNodeOwnednodeedgepointCepList cepList) {
    this.cepList = cepList;
    return this;
  }

  /**
   * none
   * @return cepList
   **/
  @JsonProperty("cep-list")
  @ApiModelProperty(value = "none")
  public TapiConnectivityContextTopologycontextTopologyNodeOwnednodeedgepointCepList getCepList() {
    return cepList;
  }

  public void setCepList(TapiConnectivityContextTopologycontextTopologyNodeOwnednodeedgepointCepList cepList) {
    this.cepList = cepList;
  }

  public TapiTopologyNodeOwnedNodeEdgePoint oduNodeEdgePointSpec(TapiOduOduNodeEdgePointSpec oduNodeEdgePointSpec) {
    this.oduNodeEdgePointSpec = oduNodeEdgePointSpec;
    return this;
  }

  /**
   * Augments the base LayerProtocol information in NodeEdgePoint with ODU-specific information
   * @return oduNodeEdgePointSpec
   **/
  @JsonProperty("odu-node-edge-point-spec")
  @ApiModelProperty(value = "Augments the base LayerProtocol information in NodeEdgePoint with ODU-specific information")
  public TapiOduOduNodeEdgePointSpec getOduNodeEdgePointSpec() {
    return oduNodeEdgePointSpec;
  }

  public void setOduNodeEdgePointSpec(TapiOduOduNodeEdgePointSpec oduNodeEdgePointSpec) {
    this.oduNodeEdgePointSpec = oduNodeEdgePointSpec;
  }

  public TapiTopologyNodeOwnedNodeEdgePoint mediaChannelNodeEdgePointSpec(TapiPhotonicMediaMediaChannelNodeEdgePointSpec mediaChannelNodeEdgePointSpec) {
    this.mediaChannelNodeEdgePointSpec = mediaChannelNodeEdgePointSpec;
    return this;
  }

  /**
   * Augments the base LayerProtocol information in NodeEdgePoint with OCH-specific information
   * @return mediaChannelNodeEdgePointSpec
   **/
  @JsonProperty("media-channel-node-edge-point-spec")
  @ApiModelProperty(value = "Augments the base LayerProtocol information in NodeEdgePoint with OCH-specific information")
  public TapiPhotonicMediaMediaChannelNodeEdgePointSpec getMediaChannelNodeEdgePointSpec() {
    return mediaChannelNodeEdgePointSpec;
  }

  public void setMediaChannelNodeEdgePointSpec(TapiPhotonicMediaMediaChannelNodeEdgePointSpec mediaChannelNodeEdgePointSpec) {
    this.mediaChannelNodeEdgePointSpec = mediaChannelNodeEdgePointSpec;
  }

  public TapiTopologyNodeOwnedNodeEdgePoint operationalState(TapiCommonOperationalState operationalState) {
    this.operationalState = operationalState;
    return this;
  }

  /**
   * none
   * @return operationalState
   **/
  @JsonProperty("operational-state")
  @ApiModelProperty(value = "none")
  public TapiCommonOperationalState getOperationalState() {
    return operationalState;
  }

  public void setOperationalState(TapiCommonOperationalState operationalState) {
    this.operationalState = operationalState;
  }

  public TapiTopologyNodeOwnedNodeEdgePoint lifecycleState(TapiCommonLifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

  /**
   * none
   * @return lifecycleState
   **/
  @JsonProperty("lifecycle-state")
  @ApiModelProperty(value = "none")
  public TapiCommonLifecycleState getLifecycleState() {
    return lifecycleState;
  }

  public void setLifecycleState(TapiCommonLifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
  }

  public TapiTopologyNodeOwnedNodeEdgePoint administrativeState(TapiCommonAdministrativeState administrativeState) {
    this.administrativeState = administrativeState;
    return this;
  }

  /**
   * none
   * @return administrativeState
   **/
  @JsonProperty("administrative-state")
  @ApiModelProperty(value = "none")
  public TapiCommonAdministrativeState getAdministrativeState() {
    return administrativeState;
  }

  public void setAdministrativeState(TapiCommonAdministrativeState administrativeState) {
    this.administrativeState = administrativeState;
  }

  public TapiTopologyNodeOwnedNodeEdgePoint availableCapacity(TapiCommonCapacity availableCapacity) {
    this.availableCapacity = availableCapacity;
    return this;
  }

  /**
   * Capacity available to be assigned.
   * @return availableCapacity
   **/
  @JsonProperty("available-capacity")
  @ApiModelProperty(value = "Capacity available to be assigned.")
  public TapiCommonCapacity getAvailableCapacity() {
    return availableCapacity;
  }

  public void setAvailableCapacity(TapiCommonCapacity availableCapacity) {
    this.availableCapacity = availableCapacity;
  }

  public TapiTopologyNodeOwnedNodeEdgePoint totalPotentialCapacity(TapiCommonCapacity totalPotentialCapacity) {
    this.totalPotentialCapacity = totalPotentialCapacity;
    return this;
  }

  /**
   * An optimistic view of the capacity of the TopologicalEntity assuming that any shared capacity is available to be taken.
   * @return totalPotentialCapacity
   **/
  @JsonProperty("total-potential-capacity")
  @ApiModelProperty(value = "An optimistic view of the capacity of the TopologicalEntity assuming that any shared capacity is available to be taken.")
  public TapiCommonCapacity getTotalPotentialCapacity() {
    return totalPotentialCapacity;
  }

  public void setTotalPotentialCapacity(TapiCommonCapacity totalPotentialCapacity) {
    this.totalPotentialCapacity = totalPotentialCapacity;
  }

  public TapiTopologyNodeOwnedNodeEdgePoint name(List<TapiCommonNameAndValue> name) {
    this.name = name;
    return this;
  }

  public TapiTopologyNodeOwnedNodeEdgePoint addNameItem(TapiCommonNameAndValue nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<TapiCommonNameAndValue>();
    }
    this.name.add(nameItem);
    return this;
  }

  /**
   * List of names. A property of an entity with a value that is unique in some namespace but may change during the life of the entity. A name carries no semantics with respect to the purpose of the entity.
   * @return name
   **/
  @JsonProperty("name")
  @ApiModelProperty(value = "List of names. A property of an entity with a value that is unique in some namespace but may change during the life of the entity. A name carries no semantics with respect to the purpose of the entity.")
  public List<TapiCommonNameAndValue> getName() {
    return name;
  }

  public void setName(List<TapiCommonNameAndValue> name) {
    this.name = name;
  }

  public TapiTopologyNodeOwnedNodeEdgePoint uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable. An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-&#39; + &#39;[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6
   * @return uuid
   **/
  @JsonProperty("uuid")
  @ApiModelProperty(value = "UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable. An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public TapiTopologyNodeOwnedNodeEdgePoint terminationDirection(TapiCommonTerminationDirection terminationDirection) {
    this.terminationDirection = terminationDirection;
    return this;
  }

  /**
   * The overall directionality of the LP.                       - A BIDIRECTIONAL LP will have some SINK and/or SOURCE flowss.                      - A SINK LP can only contain elements with SINK flows or CONTRA_DIRECTION_SOURCE flows                      - A SOURCE LP can only contain SOURCE flows or CONTRA_DIRECTION_SINK flows
   * @return terminationDirection
   **/
  @JsonProperty("termination-direction")
  @ApiModelProperty(value = "The overall directionality of the LP.                       - A BIDIRECTIONAL LP will have some SINK and/or SOURCE flowss.                      - A SINK LP can only contain elements with SINK flows or CONTRA_DIRECTION_SOURCE flows                      - A SOURCE LP can only contain SOURCE flows or CONTRA_DIRECTION_SINK flows")
  public TapiCommonTerminationDirection getTerminationDirection() {
    return terminationDirection;
  }

  public void setTerminationDirection(TapiCommonTerminationDirection terminationDirection) {
    this.terminationDirection = terminationDirection;
  }

  public TapiTopologyNodeOwnedNodeEdgePoint terminationState(TapiCommonTerminationState terminationState) {
    this.terminationState = terminationState;
    return this;
  }

  /**
   * Indicates whether the layer is terminated and if so how.
   * @return terminationState
   **/
  @JsonProperty("termination-state")
  @ApiModelProperty(value = "Indicates whether the layer is terminated and if so how.")
  public TapiCommonTerminationState getTerminationState() {
    return terminationState;
  }

  public void setTerminationState(TapiCommonTerminationState terminationState) {
    this.terminationState = terminationState;
  }

  public TapiTopologyNodeOwnedNodeEdgePoint linkPortRole(TapiCommonPortRole linkPortRole) {
    this.linkPortRole = linkPortRole;
    return this;
  }

  /**
   * Each LinkEnd of the Link has a role (e.g., symmetric, hub, spoke, leaf, root)  in the context of the Link with respect to the Link function. 
   * @return linkPortRole
   **/
  @JsonProperty("link-port-role")
  @ApiModelProperty(value = "Each LinkEnd of the Link has a role (e.g., symmetric, hub, spoke, leaf, root)  in the context of the Link with respect to the Link function. ")
  public TapiCommonPortRole getLinkPortRole() {
    return linkPortRole;
  }

  public void setLinkPortRole(TapiCommonPortRole linkPortRole) {
    this.linkPortRole = linkPortRole;
  }

  public TapiTopologyNodeOwnedNodeEdgePoint mappedServiceInterfacePoint(List<TapiCommonServiceInterfacePointRef> mappedServiceInterfacePoint) {
    this.mappedServiceInterfacePoint = mappedServiceInterfacePoint;
    return this;
  }

  public TapiTopologyNodeOwnedNodeEdgePoint addMappedServiceInterfacePointItem(TapiCommonServiceInterfacePointRef mappedServiceInterfacePointItem) {
    if (this.mappedServiceInterfacePoint == null) {
      this.mappedServiceInterfacePoint = new ArrayList<TapiCommonServiceInterfacePointRef>();
    }
    this.mappedServiceInterfacePoint.add(mappedServiceInterfacePointItem);
    return this;
  }

  /**
   * NodeEdgePoint mapped to more than ServiceInterfacePoint (slicing/virtualizing) or a ServiceInterfacePoint mapped to more than one NodeEdgePoint (load balancing/Resilience) should be considered experimental
   * @return mappedServiceInterfacePoint
   **/
  @JsonProperty("mapped-service-interface-point")
  @ApiModelProperty(value = "NodeEdgePoint mapped to more than ServiceInterfacePoint (slicing/virtualizing) or a ServiceInterfacePoint mapped to more than one NodeEdgePoint (load balancing/Resilience) should be considered experimental")
  public List<TapiCommonServiceInterfacePointRef> getMappedServiceInterfacePoint() {
    return mappedServiceInterfacePoint;
  }

  public void setMappedServiceInterfacePoint(List<TapiCommonServiceInterfacePointRef> mappedServiceInterfacePoint) {
    this.mappedServiceInterfacePoint = mappedServiceInterfacePoint;
  }

  public TapiTopologyNodeOwnedNodeEdgePoint aggregatedNodeEdgePoint(List<TapiTopologyNodeEdgePointRef> aggregatedNodeEdgePoint) {
    this.aggregatedNodeEdgePoint = aggregatedNodeEdgePoint;
    return this;
  }

  public TapiTopologyNodeOwnedNodeEdgePoint addAggregatedNodeEdgePointItem(TapiTopologyNodeEdgePointRef aggregatedNodeEdgePointItem) {
    if (this.aggregatedNodeEdgePoint == null) {
      this.aggregatedNodeEdgePoint = new ArrayList<TapiTopologyNodeEdgePointRef>();
    }
    this.aggregatedNodeEdgePoint.add(aggregatedNodeEdgePointItem);
    return this;
  }

  /**
   * none
   * @return aggregatedNodeEdgePoint
   **/
  @JsonProperty("aggregated-node-edge-point")
  @ApiModelProperty(value = "none")
  public List<TapiTopologyNodeEdgePointRef> getAggregatedNodeEdgePoint() {
    return aggregatedNodeEdgePoint;
  }

  public void setAggregatedNodeEdgePoint(List<TapiTopologyNodeEdgePointRef> aggregatedNodeEdgePoint) {
    this.aggregatedNodeEdgePoint = aggregatedNodeEdgePoint;
  }

  public TapiTopologyNodeOwnedNodeEdgePoint layerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
    return this;
  }

  /**
   * none
   * @return layerProtocolName
   **/
  @JsonProperty("layer-protocol-name")
  @ApiModelProperty(value = "none")
  public TapiCommonLayerProtocolName getLayerProtocolName() {
    return layerProtocolName;
  }

  public void setLayerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
  }

  public TapiTopologyNodeOwnedNodeEdgePoint linkPortDirection(TapiCommonPortDirection linkPortDirection) {
    this.linkPortDirection = linkPortDirection;
    return this;
  }

  /**
   * The orientation of defined flow at the LinkEnd.
   * @return linkPortDirection
   **/
  @JsonProperty("link-port-direction")
  @ApiModelProperty(value = "The orientation of defined flow at the LinkEnd.")
  public TapiCommonPortDirection getLinkPortDirection() {
    return linkPortDirection;
  }

  public void setLinkPortDirection(TapiCommonPortDirection linkPortDirection) {
    this.linkPortDirection = linkPortDirection;
  }

  public TapiTopologyNodeOwnedNodeEdgePoint supportedCepLayerProtocolQualifier(List<String> supportedCepLayerProtocolQualifier) {
    this.supportedCepLayerProtocolQualifier = supportedCepLayerProtocolQualifier;
    return this;
  }

  public TapiTopologyNodeOwnedNodeEdgePoint addSupportedCepLayerProtocolQualifierItem(String supportedCepLayerProtocolQualifierItem) {
    if (this.supportedCepLayerProtocolQualifier == null) {
      this.supportedCepLayerProtocolQualifier = new ArrayList<String>();
    }
    this.supportedCepLayerProtocolQualifier.add(supportedCepLayerProtocolQualifierItem);
    return this;
  }

  /**
   * none
   * @return supportedCepLayerProtocolQualifier
   **/
  @JsonProperty("supported-cep-layer-protocol-qualifier")
  @ApiModelProperty(value = "none")
  public List<String> getSupportedCepLayerProtocolQualifier() {
    return supportedCepLayerProtocolQualifier;
  }

  public void setSupportedCepLayerProtocolQualifier(List<String> supportedCepLayerProtocolQualifier) {
    this.supportedCepLayerProtocolQualifier = supportedCepLayerProtocolQualifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiTopologyNodeOwnedNodeEdgePoint tapiTopologyNodeOwnedNodeEdgePoint = (TapiTopologyNodeOwnedNodeEdgePoint) o;
    return Objects.equals(this.cepList, tapiTopologyNodeOwnedNodeEdgePoint.cepList) &&
        Objects.equals(this.oduNodeEdgePointSpec, tapiTopologyNodeOwnedNodeEdgePoint.oduNodeEdgePointSpec) &&
        Objects.equals(this.mediaChannelNodeEdgePointSpec, tapiTopologyNodeOwnedNodeEdgePoint.mediaChannelNodeEdgePointSpec) &&
        Objects.equals(this.operationalState, tapiTopologyNodeOwnedNodeEdgePoint.operationalState) &&
        Objects.equals(this.lifecycleState, tapiTopologyNodeOwnedNodeEdgePoint.lifecycleState) &&
        Objects.equals(this.administrativeState, tapiTopologyNodeOwnedNodeEdgePoint.administrativeState) &&
        Objects.equals(this.availableCapacity, tapiTopologyNodeOwnedNodeEdgePoint.availableCapacity) &&
        Objects.equals(this.totalPotentialCapacity, tapiTopologyNodeOwnedNodeEdgePoint.totalPotentialCapacity) &&
        Objects.equals(this.name, tapiTopologyNodeOwnedNodeEdgePoint.name) &&
        Objects.equals(this.uuid, tapiTopologyNodeOwnedNodeEdgePoint.uuid) &&
        Objects.equals(this.terminationDirection, tapiTopologyNodeOwnedNodeEdgePoint.terminationDirection) &&
        Objects.equals(this.terminationState, tapiTopologyNodeOwnedNodeEdgePoint.terminationState) &&
        Objects.equals(this.linkPortRole, tapiTopologyNodeOwnedNodeEdgePoint.linkPortRole) &&
        Objects.equals(this.mappedServiceInterfacePoint, tapiTopologyNodeOwnedNodeEdgePoint.mappedServiceInterfacePoint) &&
        Objects.equals(this.aggregatedNodeEdgePoint, tapiTopologyNodeOwnedNodeEdgePoint.aggregatedNodeEdgePoint) &&
        Objects.equals(this.layerProtocolName, tapiTopologyNodeOwnedNodeEdgePoint.layerProtocolName) &&
        Objects.equals(this.linkPortDirection, tapiTopologyNodeOwnedNodeEdgePoint.linkPortDirection) &&
        Objects.equals(this.supportedCepLayerProtocolQualifier, tapiTopologyNodeOwnedNodeEdgePoint.supportedCepLayerProtocolQualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cepList, oduNodeEdgePointSpec, mediaChannelNodeEdgePointSpec, operationalState, lifecycleState, administrativeState, availableCapacity, totalPotentialCapacity, name, uuid, terminationDirection, terminationState, linkPortRole, mappedServiceInterfacePoint, aggregatedNodeEdgePoint, layerProtocolName, linkPortDirection, supportedCepLayerProtocolQualifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiTopologyNodeOwnedNodeEdgePoint {\n");
    
    sb.append("    cepList: ").append(toIndentedString(cepList)).append("\n");
    sb.append("    oduNodeEdgePointSpec: ").append(toIndentedString(oduNodeEdgePointSpec)).append("\n");
    sb.append("    mediaChannelNodeEdgePointSpec: ").append(toIndentedString(mediaChannelNodeEdgePointSpec)).append("\n");
    sb.append("    operationalState: ").append(toIndentedString(operationalState)).append("\n");
    sb.append("    lifecycleState: ").append(toIndentedString(lifecycleState)).append("\n");
    sb.append("    administrativeState: ").append(toIndentedString(administrativeState)).append("\n");
    sb.append("    availableCapacity: ").append(toIndentedString(availableCapacity)).append("\n");
    sb.append("    totalPotentialCapacity: ").append(toIndentedString(totalPotentialCapacity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    terminationDirection: ").append(toIndentedString(terminationDirection)).append("\n");
    sb.append("    terminationState: ").append(toIndentedString(terminationState)).append("\n");
    sb.append("    linkPortRole: ").append(toIndentedString(linkPortRole)).append("\n");
    sb.append("    mappedServiceInterfacePoint: ").append(toIndentedString(mappedServiceInterfacePoint)).append("\n");
    sb.append("    aggregatedNodeEdgePoint: ").append(toIndentedString(aggregatedNodeEdgePoint)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    linkPortDirection: ").append(toIndentedString(linkPortDirection)).append("\n");
    sb.append("    supportedCepLayerProtocolQualifier: ").append(toIndentedString(supportedCepLayerProtocolQualifier)).append("\n");
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

