/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Options;
import com.clerk.backend_api.utils.RetryConfig;
import com.clerk.backend_api.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class DeleteDomainRequestBuilder {

    private String domainId;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallDeleteDomain sdk;

    public DeleteDomainRequestBuilder(SDKMethodInterfaces.MethodCallDeleteDomain sdk) {
        this.sdk = sdk;
    }

    public DeleteDomainRequestBuilder domainId(String domainId) {
        Utils.checkNotNull(domainId, "domainId");
        this.domainId = domainId;
        return this;
    }
                
    public DeleteDomainRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public DeleteDomainRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public DeleteDomainResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.delete(
            domainId,
            options);
    }
}
