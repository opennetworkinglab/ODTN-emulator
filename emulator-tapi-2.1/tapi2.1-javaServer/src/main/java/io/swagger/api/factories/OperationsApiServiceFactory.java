package io.swagger.api.factories;

import io.swagger.api.OperationsApiService;
import io.swagger.api.impl.OperationsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class OperationsApiServiceFactory {
    private final static OperationsApiService service = new OperationsApiServiceImpl();

    public static OperationsApiService getOperationsApi() {
        return service;
    }
}
