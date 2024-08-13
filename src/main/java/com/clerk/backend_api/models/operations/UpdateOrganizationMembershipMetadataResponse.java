/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;


import com.clerk.backend_api.models.components.OrganizationMembership;
import com.clerk.backend_api.utils.Response;
import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;


public class UpdateOrganizationMembershipMetadataResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * Success
     */
    private Optional<? extends OrganizationMembership> organizationMembership;

    @JsonCreator
    public UpdateOrganizationMembershipMetadataResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends OrganizationMembership> organizationMembership) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(organizationMembership, "organizationMembership");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.organizationMembership = organizationMembership;
    }
    
    public UpdateOrganizationMembershipMetadataResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty());
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * Success
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OrganizationMembership> organizationMembership() {
        return (Optional<OrganizationMembership>) organizationMembership;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public UpdateOrganizationMembershipMetadataResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public UpdateOrganizationMembershipMetadataResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public UpdateOrganizationMembershipMetadataResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Success
     */
    public UpdateOrganizationMembershipMetadataResponse withOrganizationMembership(OrganizationMembership organizationMembership) {
        Utils.checkNotNull(organizationMembership, "organizationMembership");
        this.organizationMembership = Optional.ofNullable(organizationMembership);
        return this;
    }

    /**
     * Success
     */
    public UpdateOrganizationMembershipMetadataResponse withOrganizationMembership(Optional<? extends OrganizationMembership> organizationMembership) {
        Utils.checkNotNull(organizationMembership, "organizationMembership");
        this.organizationMembership = organizationMembership;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateOrganizationMembershipMetadataResponse other = (UpdateOrganizationMembershipMetadataResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.organizationMembership, other.organizationMembership);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            organizationMembership);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateOrganizationMembershipMetadataResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "organizationMembership", organizationMembership);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends OrganizationMembership> organizationMembership = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }

        /**
         * Success
         */
        public Builder organizationMembership(OrganizationMembership organizationMembership) {
            Utils.checkNotNull(organizationMembership, "organizationMembership");
            this.organizationMembership = Optional.ofNullable(organizationMembership);
            return this;
        }

        /**
         * Success
         */
        public Builder organizationMembership(Optional<? extends OrganizationMembership> organizationMembership) {
            Utils.checkNotNull(organizationMembership, "organizationMembership");
            this.organizationMembership = organizationMembership;
            return this;
        }
        
        public UpdateOrganizationMembershipMetadataResponse build() {
            return new UpdateOrganizationMembershipMetadataResponse(
                contentType,
                statusCode,
                rawResponse,
                organizationMembership);
        }
    }
}

