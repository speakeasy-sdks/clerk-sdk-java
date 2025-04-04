/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Options;
import com.clerk.backend_api.utils.RetryConfig;
import com.clerk.backend_api.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class UpdateEmailAddressRequestBuilder {

    private String emailAddressId;
    private Optional<? extends UpdateEmailAddressRequestBody> requestBody = Optional.empty();
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallUpdateEmailAddress sdk;

    public UpdateEmailAddressRequestBuilder(SDKMethodInterfaces.MethodCallUpdateEmailAddress sdk) {
        this.sdk = sdk;
    }

    public UpdateEmailAddressRequestBuilder emailAddressId(String emailAddressId) {
        Utils.checkNotNull(emailAddressId, "emailAddressId");
        this.emailAddressId = emailAddressId;
        return this;
    }
                
    public UpdateEmailAddressRequestBuilder requestBody(UpdateEmailAddressRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = Optional.of(requestBody);
        return this;
    }

    public UpdateEmailAddressRequestBuilder requestBody(Optional<? extends UpdateEmailAddressRequestBody> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }
                
    public UpdateEmailAddressRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public UpdateEmailAddressRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public UpdateEmailAddressResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.update(
            emailAddressId,
            requestBody,
            options);
    }
}
