/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Utils;
import java.lang.String;

public class LockUserRequestBuilder {

    private String userId;
    private final SDKMethodInterfaces.MethodCallLockUser sdk;

    public LockUserRequestBuilder(SDKMethodInterfaces.MethodCallLockUser sdk) {
        this.sdk = sdk;
    }

    public LockUserRequestBuilder userId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    public LockUserResponse call() throws Exception {

        return sdk.lock(
            userId);
    }
}
