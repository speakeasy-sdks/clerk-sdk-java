/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.models.errors.SDKError;
import com.clerk.backend_api.utils.LazySingletonValue;
import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Long;
import java.lang.String;
import java.util.Optional;
import java.util.stream.Stream;

public class ListOrganizationMembershipsRequestBuilder {

    private String organizationId;
    private Optional<Long> limit = Utils.readDefaultOrConstValue(
                            "limit",
                            "10",
                            new TypeReference<Optional<Long>>() {});
    private Optional<Long> offset = Utils.readDefaultOrConstValue(
                            "offset",
                            "0",
                            new TypeReference<Optional<Long>>() {});
    private Optional<String> orderBy = Optional.empty();
    private final SDKMethodInterfaces.MethodCallListOrganizationMemberships sdk;

    public ListOrganizationMembershipsRequestBuilder(SDKMethodInterfaces.MethodCallListOrganizationMemberships sdk) {
        this.sdk = sdk;
    }

    public ListOrganizationMembershipsRequestBuilder organizationId(java.lang.String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }
                
    public ListOrganizationMembershipsRequestBuilder limit(long limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.of(limit);
        return this;
    }

    public ListOrganizationMembershipsRequestBuilder limit(java.util.Optional<java.lang.Long> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }
                
    public ListOrganizationMembershipsRequestBuilder offset(long offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = Optional.of(offset);
        return this;
    }

    public ListOrganizationMembershipsRequestBuilder offset(java.util.Optional<java.lang.Long> offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = offset;
        return this;
    }
                
    public ListOrganizationMembershipsRequestBuilder orderBy(java.lang.String orderBy) {
        Utils.checkNotNull(orderBy, "orderBy");
        this.orderBy = Optional.of(orderBy);
        return this;
    }

    public ListOrganizationMembershipsRequestBuilder orderBy(java.util.Optional<java.lang.String> orderBy) {
        Utils.checkNotNull(orderBy, "orderBy");
        this.orderBy = orderBy;
        return this;
    }

    public ListOrganizationMembershipsResponse call() throws Exception {
        if (limit == null) {
            limit = _SINGLETON_VALUE_Limit.value();
        }
        if (offset == null) {
            offset = _SINGLETON_VALUE_Offset.value();
        }

        return sdk.list(
            organizationId,
            limit,
            offset,
            orderBy);
    }
    
    /**
     * Returns a stream that performs next page calls till no more pages
     * are returned. Unlike the {@link #call()} method this method will
     * throw an {@link SDKError} if any page retrieval has an HTTP status 
     * code >= 300 (Note that 3XX is not an error range but will need 
     * special handling by the user if for example the HTTP client is 
     * not configured to follow redirects).
     * 
     * @throws {@link SDKError} if HTTP status code >= 300 is encountered
     **/  
    public Stream<ListOrganizationMembershipsResponse> callAsStream() {
        return Utils.stream(() -> Optional.of(call()), x -> {
            if (x.statusCode() >= 300) {
                byte[] body = Utils.toByteArrayAndClose(x.rawResponse().body());
                throw new SDKError(x.rawResponse(), x.statusCode(), x.contentType(), body);
            } else {
                return x.next();
            }
        });
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
