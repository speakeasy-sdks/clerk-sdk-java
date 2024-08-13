/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Utils;

public class GetTemplateListRequestBuilder {

    private TemplateType templateType;
    private final SDKMethodInterfaces.MethodCallGetTemplateList sdk;

    public GetTemplateListRequestBuilder(SDKMethodInterfaces.MethodCallGetTemplateList sdk) {
        this.sdk = sdk;
    }

    public GetTemplateListRequestBuilder templateType(com.clerk.backend_api.models.operations.TemplateType templateType) {
        Utils.checkNotNull(templateType, "templateType");
        this.templateType = templateType;
        return this;
    }

    public GetTemplateListResponse call() throws Exception {

        return sdk.list(
            templateType);
    }
}
