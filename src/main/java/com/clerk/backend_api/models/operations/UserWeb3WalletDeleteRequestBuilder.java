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

public class UserWeb3WalletDeleteRequestBuilder {

    private String userId;
    private String web3WalletIdentificationId;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallUserWeb3WalletDelete sdk;

    public UserWeb3WalletDeleteRequestBuilder(SDKMethodInterfaces.MethodCallUserWeb3WalletDelete sdk) {
        this.sdk = sdk;
    }

    public UserWeb3WalletDeleteRequestBuilder userId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    public UserWeb3WalletDeleteRequestBuilder web3WalletIdentificationId(String web3WalletIdentificationId) {
        Utils.checkNotNull(web3WalletIdentificationId, "web3WalletIdentificationId");
        this.web3WalletIdentificationId = web3WalletIdentificationId;
        return this;
    }
                
    public UserWeb3WalletDeleteRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public UserWeb3WalletDeleteRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public UserWeb3WalletDeleteResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.deleteWeb3Wallet(
            userId,
            web3WalletIdentificationId,
            options);
    }
}
