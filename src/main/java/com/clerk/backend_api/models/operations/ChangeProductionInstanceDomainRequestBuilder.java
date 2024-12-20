/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Utils;

public class ChangeProductionInstanceDomainRequestBuilder {

    private ChangeProductionInstanceDomainRequestBody request;
    private final SDKMethodInterfaces.MethodCallChangeProductionInstanceDomain sdk;

    public ChangeProductionInstanceDomainRequestBuilder(SDKMethodInterfaces.MethodCallChangeProductionInstanceDomain sdk) {
        this.sdk = sdk;
    }

    public ChangeProductionInstanceDomainRequestBuilder request(ChangeProductionInstanceDomainRequestBody request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ChangeProductionInstanceDomainResponse call() throws Exception {

        return sdk.changeProductionInstanceDomain(
            request);
    }
}
