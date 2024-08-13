/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Utils;
import java.util.Optional;

public class UpdateInstanceAuthConfigRequestBuilder {

    private Optional<? extends UpdateInstanceAuthConfigRequestBody> request = Optional.empty();
    private final SDKMethodInterfaces.MethodCallUpdateInstanceAuthConfig sdk;

    public UpdateInstanceAuthConfigRequestBuilder(SDKMethodInterfaces.MethodCallUpdateInstanceAuthConfig sdk) {
        this.sdk = sdk;
    }
                
    public UpdateInstanceAuthConfigRequestBuilder request(com.clerk.backend_api.models.operations.UpdateInstanceAuthConfigRequestBody request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public UpdateInstanceAuthConfigRequestBuilder request(java.util.Optional<? extends com.clerk.backend_api.models.operations.UpdateInstanceAuthConfigRequestBody> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateInstanceAuthConfigResponse call() throws Exception {

        return sdk.updateAuthConfig(
            request);
    }
}
