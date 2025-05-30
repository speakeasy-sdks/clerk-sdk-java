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

public class GetEmailAddressRequestBuilder {

    private String emailAddressId;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetEmailAddress sdk;

    public GetEmailAddressRequestBuilder(SDKMethodInterfaces.MethodCallGetEmailAddress sdk) {
        this.sdk = sdk;
    }

    public GetEmailAddressRequestBuilder emailAddressId(String emailAddressId) {
        Utils.checkNotNull(emailAddressId, "emailAddressId");
        this.emailAddressId = emailAddressId;
        return this;
    }
                
    public GetEmailAddressRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetEmailAddressRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetEmailAddressResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.get(
            emailAddressId,
            options);
    }
}
