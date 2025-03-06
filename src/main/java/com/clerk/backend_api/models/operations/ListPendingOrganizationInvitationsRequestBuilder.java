/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.LazySingletonValue;
import com.clerk.backend_api.utils.Options;
import com.clerk.backend_api.utils.RetryConfig;
import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Long;
import java.lang.String;
import java.util.Optional;

public class ListPendingOrganizationInvitationsRequestBuilder {

    private String organizationId;
    private Optional<Long> limit = Utils.readDefaultOrConstValue(
                            "limit",
                            "10",
                            new TypeReference<Optional<Long>>() {});
    private Optional<Long> offset = Utils.readDefaultOrConstValue(
                            "offset",
                            "0",
                            new TypeReference<Optional<Long>>() {});
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallListPendingOrganizationInvitations sdk;

    public ListPendingOrganizationInvitationsRequestBuilder(SDKMethodInterfaces.MethodCallListPendingOrganizationInvitations sdk) {
        this.sdk = sdk;
    }

    public ListPendingOrganizationInvitationsRequestBuilder organizationId(String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }
                
    public ListPendingOrganizationInvitationsRequestBuilder limit(long limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.of(limit);
        return this;
    }

    public ListPendingOrganizationInvitationsRequestBuilder limit(Optional<Long> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }
                
    public ListPendingOrganizationInvitationsRequestBuilder offset(long offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = Optional.of(offset);
        return this;
    }

    public ListPendingOrganizationInvitationsRequestBuilder offset(Optional<Long> offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = offset;
        return this;
    }
                
    public ListPendingOrganizationInvitationsRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public ListPendingOrganizationInvitationsRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public ListPendingOrganizationInvitationsResponse call() throws Exception {
        if (limit == null) {
            limit = _SINGLETON_VALUE_Limit.value();
        }
        if (offset == null) {
            offset = _SINGLETON_VALUE_Offset.value();
        }        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.listPending(
            organizationId,
            limit,
            offset,
            options);
    }

    private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_Limit =
            new LazySingletonValue<>(
                    "limit",
                    "10",
                    new TypeReference<Optional<Long>>() {});

    private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_Offset =
            new LazySingletonValue<>(
                    "offset",
                    "0",
                    new TypeReference<Optional<Long>>() {});
}
