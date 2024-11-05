/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Utils;
import java.lang.String;

public class DeleteOrganizationDomainRequestBuilder {

    private String organizationId;
    private String domainId;
    private final SDKMethodInterfaces.MethodCallDeleteOrganizationDomain sdk;

    public DeleteOrganizationDomainRequestBuilder(SDKMethodInterfaces.MethodCallDeleteOrganizationDomain sdk) {
        this.sdk = sdk;
    }

    public DeleteOrganizationDomainRequestBuilder organizationId(java.lang.String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }

    public DeleteOrganizationDomainRequestBuilder domainId(java.lang.String domainId) {
        Utils.checkNotNull(domainId, "domainId");
        this.domainId = domainId;
        return this;
    }

    public DeleteOrganizationDomainResponse call() throws Exception {

        return sdk.delete(
            organizationId,
            domainId);
    }
}