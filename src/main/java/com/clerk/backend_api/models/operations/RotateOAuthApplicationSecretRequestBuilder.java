/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Options;
import com.clerk.backend_api.utils.RetryConfig;
import com.clerk.backend_api.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class RotateOAuthApplicationSecretRequestBuilder {

    private String oauthApplicationId;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallRotateOAuthApplicationSecret sdk;

    public RotateOAuthApplicationSecretRequestBuilder(SDKMethodInterfaces.MethodCallRotateOAuthApplicationSecret sdk) {
        this.sdk = sdk;
    }

    public RotateOAuthApplicationSecretRequestBuilder oauthApplicationId(String oauthApplicationId) {
        Utils.checkNotNull(oauthApplicationId, "oauthApplicationId");
        this.oauthApplicationId = oauthApplicationId;
        return this;
    }
                
    public RotateOAuthApplicationSecretRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public RotateOAuthApplicationSecretRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public RotateOAuthApplicationSecretResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.rotateSecret(
            oauthApplicationId,
            options);
    }
}
