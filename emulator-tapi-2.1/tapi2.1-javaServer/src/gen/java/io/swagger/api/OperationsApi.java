package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.OperationsApiService;
import io.swagger.api.factories.OperationsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.TapiCommonGetServiceInterfacePointDetails;
import io.swagger.model.TapiCommonGetServiceInterfacePointList;
import io.swagger.model.TapiCommonGetserviceinterfacepointdetailsInputBodyparam;
import io.swagger.model.TapiCommonUpdateserviceinterfacepointInputBodyparam;
import io.swagger.model.TapiConnectivityCreateConnectivityService;
import io.swagger.model.TapiConnectivityCreateconnectivityserviceInputBodyparam;
import io.swagger.model.TapiConnectivityDeleteconnectivityserviceInputBodyparam;
import io.swagger.model.TapiConnectivityGetConnectionDetails;
import io.swagger.model.TapiConnectivityGetConnectivityServiceDetails;
import io.swagger.model.TapiConnectivityGetConnectivityServiceList;
import io.swagger.model.TapiConnectivityGetconnectiondetailsInputBodyparam;
import io.swagger.model.TapiConnectivityGetconnectivityservicedetailsInputBodyparam;
import io.swagger.model.TapiConnectivityUpdateConnectivityService;
import io.swagger.model.TapiConnectivityUpdateconnectivityserviceInputBodyparam;
import io.swagger.model.TapiNotificationCreateNotificationSubscriptionService;
import io.swagger.model.TapiNotificationCreatenotificationsubscriptionserviceInputBodyparam;
import io.swagger.model.TapiNotificationDeleteNotificationSubscriptionService;
import io.swagger.model.TapiNotificationDeletenotificationsubscriptionserviceInputBodyparam;
import io.swagger.model.TapiNotificationGetNotificationList;
import io.swagger.model.TapiNotificationGetNotificationSubscriptionServiceDetails;
import io.swagger.model.TapiNotificationGetNotificationSubscriptionServiceList;
import io.swagger.model.TapiNotificationGetSupportedNotificationTypes;
import io.swagger.model.TapiNotificationGetnotificationlistInputBodyparam;
import io.swagger.model.TapiNotificationGetnotificationsubscriptionservicedetailsInputBodyparam;
import io.swagger.model.TapiNotificationUpdateNotificationSubscriptionService;
import io.swagger.model.TapiNotificationUpdatenotificationsubscriptionserviceInputBodyparam;
import io.swagger.model.TapiOamCreateOamJob;
import io.swagger.model.TapiOamCreateOamService;
import io.swagger.model.TapiOamCreateOamServiceEndPoint;
import io.swagger.model.TapiOamCreateoamjobInputBodyparam;
import io.swagger.model.TapiOamCreateoamserviceInputBodyparam;
import io.swagger.model.TapiOamCreateoamserviceendpointInputBodyparam;
import io.swagger.model.TapiOamDeleteoamjobInputBodyparam;
import io.swagger.model.TapiOamDeleteoamserviceInputBodyparam;
import io.swagger.model.TapiOamDeleteoamserviceendpointInputBodyparam;
import io.swagger.model.TapiOamGetMeg;
import io.swagger.model.TapiOamGetOamJob;
import io.swagger.model.TapiOamGetOamService;
import io.swagger.model.TapiOamGetOamServiceEndPoint;
import io.swagger.model.TapiOamGetOamServiceList;
import io.swagger.model.TapiOamGetmegInputBodyparam;
import io.swagger.model.TapiOamGetoamjobInputBodyparam;
import io.swagger.model.TapiOamGetoamserviceInputBodyparam;
import io.swagger.model.TapiOamGetoamserviceendpointInputBodyparam;
import io.swagger.model.TapiOamUpdateOamJob;
import io.swagger.model.TapiOamUpdateOamService;
import io.swagger.model.TapiOamUpdateOamServiceEndPoint;
import io.swagger.model.TapiOamUpdateoamjobInputBodyparam;
import io.swagger.model.TapiOamUpdateoamserviceInputBodyparam;
import io.swagger.model.TapiOamUpdateoamserviceendpointInputBodyparam;
import io.swagger.model.TapiPathComputationComputeP2PPath;
import io.swagger.model.TapiPathComputationComputep2ppathInputBodyparam;
import io.swagger.model.TapiPathComputationDeleteP2PPath;
import io.swagger.model.TapiPathComputationDeletep2ppathInputBodyparam;
import io.swagger.model.TapiPathComputationOptimizeP2PPath;
import io.swagger.model.TapiPathComputationOptimizep2ppathInputBodyparam;
import io.swagger.model.TapiTopologyGetLinkDetails;
import io.swagger.model.TapiTopologyGetNodeDetails;
import io.swagger.model.TapiTopologyGetNodeEdgePointDetails;
import io.swagger.model.TapiTopologyGetTopologyDetails;
import io.swagger.model.TapiTopologyGetTopologyList;
import io.swagger.model.TapiTopologyGetlinkdetailsInputBodyparam;
import io.swagger.model.TapiTopologyGetnodedetailsInputBodyparam;
import io.swagger.model.TapiTopologyGetnodeedgepointdetailsInputBodyparam;
import io.swagger.model.TapiTopologyGettopologydetailsInputBodyparam;
import io.swagger.model.TapiVirtualNetworkCreateVirtualNetworkService;
import io.swagger.model.TapiVirtualNetworkCreatevirtualnetworkserviceInputBodyparam;
import io.swagger.model.TapiVirtualNetworkDeleteVirtualNetworkService;
import io.swagger.model.TapiVirtualNetworkDeletevirtualnetworkserviceInputBodyparam;
import io.swagger.model.TapiVirtualNetworkGetVirtualNetworkServiceDetails;
import io.swagger.model.TapiVirtualNetworkGetVirtualNetworkServiceList;
import io.swagger.model.TapiVirtualNetworkGetvirtualnetworkservicedetailsInputBodyparam;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/operations")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the operations API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class OperationsApi  {
   private final OperationsApiService delegate;

   public OperationsApi(@Context ServletConfig servletContext) {
      OperationsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("OperationsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (OperationsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = OperationsApiServiceFactory.getOperationsApi();
      }

      this.delegate = delegate;
   }

    @POST
    @Path("/compute-p-2-p-path/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiPathComputationComputeP2PPath.class, tags={ "tapi-path-computation", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiPathComputationComputeP2PPath.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsComputeP2PPathPost(@ApiParam(value = "" ) TapiPathComputationComputep2ppathInputBodyparam tapiPathComputationComputep2ppathInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsComputeP2PPathPost(tapiPathComputationComputep2ppathInputBodyParam,securityContext);
    }
    @POST
    @Path("/create-connectivity-service/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiConnectivityCreateConnectivityService.class, tags={ "tapi-connectivity", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiConnectivityCreateConnectivityService.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsCreateConnectivityServicePost(@ApiParam(value = "" ) TapiConnectivityCreateconnectivityserviceInputBodyparam tapiConnectivityCreateconnectivityserviceInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsCreateConnectivityServicePost(tapiConnectivityCreateconnectivityserviceInputBodyParam,securityContext);
    }
    @POST
    @Path("/create-notification-subscription-service/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiNotificationCreateNotificationSubscriptionService.class, tags={ "tapi-notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiNotificationCreateNotificationSubscriptionService.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsCreateNotificationSubscriptionServicePost(@ApiParam(value = "" ) TapiNotificationCreatenotificationsubscriptionserviceInputBodyparam tapiNotificationCreatenotificationsubscriptionserviceInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsCreateNotificationSubscriptionServicePost(tapiNotificationCreatenotificationsubscriptionserviceInputBodyParam,securityContext);
    }
    @POST
    @Path("/create-oam-job/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiOamCreateOamJob.class, tags={ "tapi-oam", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiOamCreateOamJob.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsCreateOamJobPost(@ApiParam(value = "" ) TapiOamCreateoamjobInputBodyparam tapiOamCreateoamjobInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsCreateOamJobPost(tapiOamCreateoamjobInputBodyParam,securityContext);
    }
    @POST
    @Path("/create-oam-service-end-point/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiOamCreateOamServiceEndPoint.class, tags={ "tapi-oam", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiOamCreateOamServiceEndPoint.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsCreateOamServiceEndPointPost(@ApiParam(value = "" ) TapiOamCreateoamserviceendpointInputBodyparam tapiOamCreateoamserviceendpointInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsCreateOamServiceEndPointPost(tapiOamCreateoamserviceendpointInputBodyParam,securityContext);
    }
    @POST
    @Path("/create-oam-service/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiOamCreateOamService.class, tags={ "tapi-oam", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiOamCreateOamService.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsCreateOamServicePost(@ApiParam(value = "" ) TapiOamCreateoamserviceInputBodyparam tapiOamCreateoamserviceInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsCreateOamServicePost(tapiOamCreateoamserviceInputBodyParam,securityContext);
    }
    @POST
    @Path("/create-virtual-network-service/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiVirtualNetworkCreateVirtualNetworkService.class, tags={ "tapi-virtual-network", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiVirtualNetworkCreateVirtualNetworkService.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsCreateVirtualNetworkServicePost(@ApiParam(value = "" ) TapiVirtualNetworkCreatevirtualnetworkserviceInputBodyparam tapiVirtualNetworkCreatevirtualnetworkserviceInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsCreateVirtualNetworkServicePost(tapiVirtualNetworkCreatevirtualnetworkserviceInputBodyParam,securityContext);
    }
    @POST
    @Path("/delete-connectivity-service/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={ "tapi-connectivity", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsDeleteConnectivityServicePost(@ApiParam(value = "" ) TapiConnectivityDeleteconnectivityserviceInputBodyparam tapiConnectivityDeleteconnectivityserviceInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsDeleteConnectivityServicePost(tapiConnectivityDeleteconnectivityserviceInputBodyParam,securityContext);
    }
    @POST
    @Path("/delete-notification-subscription-service/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiNotificationDeleteNotificationSubscriptionService.class, tags={ "tapi-notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiNotificationDeleteNotificationSubscriptionService.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsDeleteNotificationSubscriptionServicePost(@ApiParam(value = "" ) TapiNotificationDeletenotificationsubscriptionserviceInputBodyparam tapiNotificationDeletenotificationsubscriptionserviceInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsDeleteNotificationSubscriptionServicePost(tapiNotificationDeletenotificationsubscriptionserviceInputBodyParam,securityContext);
    }
    @POST
    @Path("/delete-oam-job/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={ "tapi-oam", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsDeleteOamJobPost(@ApiParam(value = "" ) TapiOamDeleteoamjobInputBodyparam tapiOamDeleteoamjobInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsDeleteOamJobPost(tapiOamDeleteoamjobInputBodyParam,securityContext);
    }
    @POST
    @Path("/delete-oam-service-end-point/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={ "tapi-oam", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsDeleteOamServiceEndPointPost(@ApiParam(value = "" ) TapiOamDeleteoamserviceendpointInputBodyparam tapiOamDeleteoamserviceendpointInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsDeleteOamServiceEndPointPost(tapiOamDeleteoamserviceendpointInputBodyParam,securityContext);
    }
    @POST
    @Path("/delete-oam-service/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={ "tapi-oam", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsDeleteOamServicePost(@ApiParam(value = "" ) TapiOamDeleteoamserviceInputBodyparam tapiOamDeleteoamserviceInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsDeleteOamServicePost(tapiOamDeleteoamserviceInputBodyParam,securityContext);
    }
    @POST
    @Path("/delete-p-2-p-path/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiPathComputationDeleteP2PPath.class, tags={ "tapi-path-computation", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiPathComputationDeleteP2PPath.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsDeleteP2PPathPost(@ApiParam(value = "" ) TapiPathComputationDeletep2ppathInputBodyparam tapiPathComputationDeletep2ppathInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsDeleteP2PPathPost(tapiPathComputationDeletep2ppathInputBodyParam,securityContext);
    }
    @POST
    @Path("/delete-virtual-network-service/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiVirtualNetworkDeleteVirtualNetworkService.class, tags={ "tapi-virtual-network", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiVirtualNetworkDeleteVirtualNetworkService.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsDeleteVirtualNetworkServicePost(@ApiParam(value = "" ) TapiVirtualNetworkDeletevirtualnetworkserviceInputBodyparam tapiVirtualNetworkDeletevirtualnetworkserviceInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsDeleteVirtualNetworkServicePost(tapiVirtualNetworkDeletevirtualnetworkserviceInputBodyParam,securityContext);
    }
    @POST
    @Path("/get-connection-details/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiConnectivityGetConnectionDetails.class, tags={ "tapi-connectivity", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiConnectivityGetConnectionDetails.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsGetConnectionDetailsPost(@ApiParam(value = "" ) TapiConnectivityGetconnectiondetailsInputBodyparam tapiConnectivityGetconnectiondetailsInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsGetConnectionDetailsPost(tapiConnectivityGetconnectiondetailsInputBodyParam,securityContext);
    }
    @POST
    @Path("/get-connectivity-service-details/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiConnectivityGetConnectivityServiceDetails.class, tags={ "tapi-connectivity", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiConnectivityGetConnectivityServiceDetails.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsGetConnectivityServiceDetailsPost(@ApiParam(value = "" ) TapiConnectivityGetconnectivityservicedetailsInputBodyparam tapiConnectivityGetconnectivityservicedetailsInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsGetConnectivityServiceDetailsPost(tapiConnectivityGetconnectivityservicedetailsInputBodyParam,securityContext);
    }
    @POST
    @Path("/get-connectivity-service-list/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiConnectivityGetConnectivityServiceList.class, tags={ "tapi-connectivity", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiConnectivityGetConnectivityServiceList.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsGetConnectivityServiceListPost(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsGetConnectivityServiceListPost(securityContext);
    }
    @POST
    @Path("/get-link-details/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiTopologyGetLinkDetails.class, tags={ "tapi-topology", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiTopologyGetLinkDetails.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsGetLinkDetailsPost(@ApiParam(value = "" ) TapiTopologyGetlinkdetailsInputBodyparam tapiTopologyGetlinkdetailsInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsGetLinkDetailsPost(tapiTopologyGetlinkdetailsInputBodyParam,securityContext);
    }
    @POST
    @Path("/get-meg/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiOamGetMeg.class, tags={ "tapi-oam", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiOamGetMeg.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsGetMegPost(@ApiParam(value = "" ) TapiOamGetmegInputBodyparam tapiOamGetmegInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsGetMegPost(tapiOamGetmegInputBodyParam,securityContext);
    }
    @POST
    @Path("/get-node-details/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiTopologyGetNodeDetails.class, tags={ "tapi-topology", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiTopologyGetNodeDetails.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsGetNodeDetailsPost(@ApiParam(value = "" ) TapiTopologyGetnodedetailsInputBodyparam tapiTopologyGetnodedetailsInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsGetNodeDetailsPost(tapiTopologyGetnodedetailsInputBodyParam,securityContext);
    }
    @POST
    @Path("/get-node-edge-point-details/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiTopologyGetNodeEdgePointDetails.class, tags={ "tapi-topology", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiTopologyGetNodeEdgePointDetails.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsGetNodeEdgePointDetailsPost(@ApiParam(value = "" ) TapiTopologyGetnodeedgepointdetailsInputBodyparam tapiTopologyGetnodeedgepointdetailsInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsGetNodeEdgePointDetailsPost(tapiTopologyGetnodeedgepointdetailsInputBodyParam,securityContext);
    }
    @POST
    @Path("/get-notification-list/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiNotificationGetNotificationList.class, tags={ "tapi-notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiNotificationGetNotificationList.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsGetNotificationListPost(@ApiParam(value = "" ) TapiNotificationGetnotificationlistInputBodyparam tapiNotificationGetnotificationlistInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsGetNotificationListPost(tapiNotificationGetnotificationlistInputBodyParam,securityContext);
    }
    @POST
    @Path("/get-notification-subscription-service-details/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiNotificationGetNotificationSubscriptionServiceDetails.class, tags={ "tapi-notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiNotificationGetNotificationSubscriptionServiceDetails.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsGetNotificationSubscriptionServiceDetailsPost(@ApiParam(value = "" ) TapiNotificationGetnotificationsubscriptionservicedetailsInputBodyparam tapiNotificationGetnotificationsubscriptionservicedetailsInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsGetNotificationSubscriptionServiceDetailsPost(tapiNotificationGetnotificationsubscriptionservicedetailsInputBodyParam,securityContext);
    }
    @POST
    @Path("/get-notification-subscription-service-list/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiNotificationGetNotificationSubscriptionServiceList.class, tags={ "tapi-notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiNotificationGetNotificationSubscriptionServiceList.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsGetNotificationSubscriptionServiceListPost(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsGetNotificationSubscriptionServiceListPost(securityContext);
    }
    @POST
    @Path("/get-oam-job/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiOamGetOamJob.class, tags={ "tapi-oam", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiOamGetOamJob.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsGetOamJobPost(@ApiParam(value = "" ) TapiOamGetoamjobInputBodyparam tapiOamGetoamjobInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsGetOamJobPost(tapiOamGetoamjobInputBodyParam,securityContext);
    }
    @POST
    @Path("/get-oam-service-end-point/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiOamGetOamServiceEndPoint.class, tags={ "tapi-oam", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiOamGetOamServiceEndPoint.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsGetOamServiceEndPointPost(@ApiParam(value = "" ) TapiOamGetoamserviceendpointInputBodyparam tapiOamGetoamserviceendpointInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsGetOamServiceEndPointPost(tapiOamGetoamserviceendpointInputBodyParam,securityContext);
    }
    @POST
    @Path("/get-oam-service-list/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiOamGetOamServiceList.class, tags={ "tapi-oam", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiOamGetOamServiceList.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsGetOamServiceListPost(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsGetOamServiceListPost(securityContext);
    }
    @POST
    @Path("/get-oam-service/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiOamGetOamService.class, tags={ "tapi-oam", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiOamGetOamService.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsGetOamServicePost(@ApiParam(value = "" ) TapiOamGetoamserviceInputBodyparam tapiOamGetoamserviceInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsGetOamServicePost(tapiOamGetoamserviceInputBodyParam,securityContext);
    }
    @POST
    @Path("/get-service-interface-point-details/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiCommonGetServiceInterfacePointDetails.class, tags={ "tapi-common", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiCommonGetServiceInterfacePointDetails.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsGetServiceInterfacePointDetailsPost(@ApiParam(value = "" ) TapiCommonGetserviceinterfacepointdetailsInputBodyparam tapiCommonGetserviceinterfacepointdetailsInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsGetServiceInterfacePointDetailsPost(tapiCommonGetserviceinterfacepointdetailsInputBodyParam,securityContext);
    }
    @POST
    @Path("/get-service-interface-point-list/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiCommonGetServiceInterfacePointList.class, tags={ "tapi-common", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiCommonGetServiceInterfacePointList.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsGetServiceInterfacePointListPost(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsGetServiceInterfacePointListPost(securityContext);
    }
    @POST
    @Path("/get-supported-notification-types/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiNotificationGetSupportedNotificationTypes.class, tags={ "tapi-notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiNotificationGetSupportedNotificationTypes.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsGetSupportedNotificationTypesPost(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsGetSupportedNotificationTypesPost(securityContext);
    }
    @POST
    @Path("/get-topology-details/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiTopologyGetTopologyDetails.class, tags={ "tapi-topology", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiTopologyGetTopologyDetails.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsGetTopologyDetailsPost(@ApiParam(value = "" ) TapiTopologyGettopologydetailsInputBodyparam tapiTopologyGettopologydetailsInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsGetTopologyDetailsPost(tapiTopologyGettopologydetailsInputBodyParam,securityContext);
    }
    @POST
    @Path("/get-topology-list/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiTopologyGetTopologyList.class, tags={ "tapi-topology", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiTopologyGetTopologyList.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsGetTopologyListPost(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsGetTopologyListPost(securityContext);
    }
    @POST
    @Path("/get-virtual-network-service-details/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiVirtualNetworkGetVirtualNetworkServiceDetails.class, tags={ "tapi-virtual-network", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiVirtualNetworkGetVirtualNetworkServiceDetails.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsGetVirtualNetworkServiceDetailsPost(@ApiParam(value = "" ) TapiVirtualNetworkGetvirtualnetworkservicedetailsInputBodyparam tapiVirtualNetworkGetvirtualnetworkservicedetailsInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsGetVirtualNetworkServiceDetailsPost(tapiVirtualNetworkGetvirtualnetworkservicedetailsInputBodyParam,securityContext);
    }
    @POST
    @Path("/get-virtual-network-service-list/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiVirtualNetworkGetVirtualNetworkServiceList.class, tags={ "tapi-virtual-network", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiVirtualNetworkGetVirtualNetworkServiceList.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsGetVirtualNetworkServiceListPost(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsGetVirtualNetworkServiceListPost(securityContext);
    }
    @POST
    @Path("/optimize-p-2-p-path/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiPathComputationOptimizeP2PPath.class, tags={ "tapi-path-computation", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiPathComputationOptimizeP2PPath.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsOptimizeP2PPathPost(@ApiParam(value = "" ) TapiPathComputationOptimizep2ppathInputBodyparam tapiPathComputationOptimizep2ppathInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsOptimizeP2PPathPost(tapiPathComputationOptimizep2ppathInputBodyParam,securityContext);
    }
    @POST
    @Path("/update-connectivity-service/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiConnectivityUpdateConnectivityService.class, tags={ "tapi-connectivity", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiConnectivityUpdateConnectivityService.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsUpdateConnectivityServicePost(@ApiParam(value = "" ) TapiConnectivityUpdateconnectivityserviceInputBodyparam tapiConnectivityUpdateconnectivityserviceInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsUpdateConnectivityServicePost(tapiConnectivityUpdateconnectivityserviceInputBodyParam,securityContext);
    }
    @POST
    @Path("/update-notification-subscription-service/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiNotificationUpdateNotificationSubscriptionService.class, tags={ "tapi-notification", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiNotificationUpdateNotificationSubscriptionService.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsUpdateNotificationSubscriptionServicePost(@ApiParam(value = "" ) TapiNotificationUpdatenotificationsubscriptionserviceInputBodyparam tapiNotificationUpdatenotificationsubscriptionserviceInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsUpdateNotificationSubscriptionServicePost(tapiNotificationUpdatenotificationsubscriptionserviceInputBodyParam,securityContext);
    }
    @POST
    @Path("/update-oam-job/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiOamUpdateOamJob.class, tags={ "tapi-oam", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiOamUpdateOamJob.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsUpdateOamJobPost(@ApiParam(value = "" ) TapiOamUpdateoamjobInputBodyparam tapiOamUpdateoamjobInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsUpdateOamJobPost(tapiOamUpdateoamjobInputBodyParam,securityContext);
    }
    @POST
    @Path("/update-oam-service-end-point/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiOamUpdateOamServiceEndPoint.class, tags={ "tapi-oam", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiOamUpdateOamServiceEndPoint.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsUpdateOamServiceEndPointPost(@ApiParam(value = "" ) TapiOamUpdateoamserviceendpointInputBodyparam tapiOamUpdateoamserviceendpointInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsUpdateOamServiceEndPointPost(tapiOamUpdateoamserviceendpointInputBodyParam,securityContext);
    }
    @POST
    @Path("/update-oam-service/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TapiOamUpdateOamService.class, tags={ "tapi-oam", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Correct response", response = TapiOamUpdateOamService.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsUpdateOamServicePost(@ApiParam(value = "" ) TapiOamUpdateoamserviceInputBodyparam tapiOamUpdateoamserviceInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsUpdateOamServicePost(tapiOamUpdateoamserviceInputBodyParam,securityContext);
    }
    @POST
    @Path("/update-service-interface-point/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={ "tapi-common", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "No response", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Internal error", response = Void.class) })
    public Response operationsUpdateServiceInterfacePointPost(@ApiParam(value = "" ) TapiCommonUpdateserviceinterfacepointInputBodyparam tapiCommonUpdateserviceinterfacepointInputBodyParam
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.operationsUpdateServiceInterfacePointPost(tapiCommonUpdateserviceinterfacepointInputBodyParam,securityContext);
    }
}
