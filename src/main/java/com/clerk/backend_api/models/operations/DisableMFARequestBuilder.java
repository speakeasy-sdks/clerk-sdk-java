/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Utils;
import java.lang.String;

public class DisableMFARequestBuilder {

    private String userId;
    private final SDKMethodInterfaces.MethodCallDisableMFA sdk;

    public DisableMFARequestBuilder(SDKMethodInterfaces.MethodCallDisableMFA sdk) {
        this.sdk = sdk;
    }

    public DisableMFARequestBuilder userId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    public DisableMFAResponse call() throws Exception {

        return sdk.disableMFA(
            userId);
    }
}
