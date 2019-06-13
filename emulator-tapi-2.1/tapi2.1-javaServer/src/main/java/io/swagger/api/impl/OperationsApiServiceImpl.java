package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

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

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class OperationsApiServiceImpl extends OperationsApiService {
    @Override
    public Response operationsComputeP2PPathPost(TapiPathComputationComputep2ppathInputBodyparam tapiPathComputationComputep2ppathInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsCreateConnectivityServicePost(TapiConnectivityCreateconnectivityserviceInputBodyparam tapiConnectivityCreateconnectivityserviceInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsCreateNotificationSubscriptionServicePost(TapiNotificationCreatenotificationsubscriptionserviceInputBodyparam tapiNotificationCreatenotificationsubscriptionserviceInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsCreateOamJobPost(TapiOamCreateoamjobInputBodyparam tapiOamCreateoamjobInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsCreateOamServiceEndPointPost(TapiOamCreateoamserviceendpointInputBodyparam tapiOamCreateoamserviceendpointInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsCreateOamServicePost(TapiOamCreateoamserviceInputBodyparam tapiOamCreateoamserviceInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsCreateVirtualNetworkServicePost(TapiVirtualNetworkCreatevirtualnetworkserviceInputBodyparam tapiVirtualNetworkCreatevirtualnetworkserviceInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsDeleteConnectivityServicePost(TapiConnectivityDeleteconnectivityserviceInputBodyparam tapiConnectivityDeleteconnectivityserviceInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsDeleteNotificationSubscriptionServicePost(TapiNotificationDeletenotificationsubscriptionserviceInputBodyparam tapiNotificationDeletenotificationsubscriptionserviceInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsDeleteOamJobPost(TapiOamDeleteoamjobInputBodyparam tapiOamDeleteoamjobInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsDeleteOamServiceEndPointPost(TapiOamDeleteoamserviceendpointInputBodyparam tapiOamDeleteoamserviceendpointInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsDeleteOamServicePost(TapiOamDeleteoamserviceInputBodyparam tapiOamDeleteoamserviceInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsDeleteP2PPathPost(TapiPathComputationDeletep2ppathInputBodyparam tapiPathComputationDeletep2ppathInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsDeleteVirtualNetworkServicePost(TapiVirtualNetworkDeletevirtualnetworkserviceInputBodyparam tapiVirtualNetworkDeletevirtualnetworkserviceInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsGetConnectionDetailsPost(TapiConnectivityGetconnectiondetailsInputBodyparam tapiConnectivityGetconnectiondetailsInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsGetConnectivityServiceDetailsPost(TapiConnectivityGetconnectivityservicedetailsInputBodyparam tapiConnectivityGetconnectivityservicedetailsInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsGetConnectivityServiceListPost(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsGetLinkDetailsPost(TapiTopologyGetlinkdetailsInputBodyparam tapiTopologyGetlinkdetailsInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsGetMegPost(TapiOamGetmegInputBodyparam tapiOamGetmegInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsGetNodeDetailsPost(TapiTopologyGetnodedetailsInputBodyparam tapiTopologyGetnodedetailsInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsGetNodeEdgePointDetailsPost(TapiTopologyGetnodeedgepointdetailsInputBodyparam tapiTopologyGetnodeedgepointdetailsInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsGetNotificationListPost(TapiNotificationGetnotificationlistInputBodyparam tapiNotificationGetnotificationlistInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsGetNotificationSubscriptionServiceDetailsPost(TapiNotificationGetnotificationsubscriptionservicedetailsInputBodyparam tapiNotificationGetnotificationsubscriptionservicedetailsInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsGetNotificationSubscriptionServiceListPost(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsGetOamJobPost(TapiOamGetoamjobInputBodyparam tapiOamGetoamjobInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsGetOamServiceEndPointPost(TapiOamGetoamserviceendpointInputBodyparam tapiOamGetoamserviceendpointInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsGetOamServiceListPost(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsGetOamServicePost(TapiOamGetoamserviceInputBodyparam tapiOamGetoamserviceInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsGetServiceInterfacePointDetailsPost(TapiCommonGetserviceinterfacepointdetailsInputBodyparam tapiCommonGetserviceinterfacepointdetailsInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsGetServiceInterfacePointListPost(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsGetSupportedNotificationTypesPost(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsGetTopologyDetailsPost(TapiTopologyGettopologydetailsInputBodyparam tapiTopologyGettopologydetailsInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsGetTopologyListPost(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsGetVirtualNetworkServiceDetailsPost(TapiVirtualNetworkGetvirtualnetworkservicedetailsInputBodyparam tapiVirtualNetworkGetvirtualnetworkservicedetailsInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsGetVirtualNetworkServiceListPost(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsOptimizeP2PPathPost(TapiPathComputationOptimizep2ppathInputBodyparam tapiPathComputationOptimizep2ppathInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsUpdateConnectivityServicePost(TapiConnectivityUpdateconnectivityserviceInputBodyparam tapiConnectivityUpdateconnectivityserviceInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsUpdateNotificationSubscriptionServicePost(TapiNotificationUpdatenotificationsubscriptionserviceInputBodyparam tapiNotificationUpdatenotificationsubscriptionserviceInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsUpdateOamJobPost(TapiOamUpdateoamjobInputBodyparam tapiOamUpdateoamjobInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsUpdateOamServiceEndPointPost(TapiOamUpdateoamserviceendpointInputBodyparam tapiOamUpdateoamserviceendpointInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsUpdateOamServicePost(TapiOamUpdateoamserviceInputBodyparam tapiOamUpdateoamserviceInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response operationsUpdateServiceInterfacePointPost(TapiCommonUpdateserviceinterfacepointInputBodyparam tapiCommonUpdateserviceinterfacepointInputBodyParam, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
