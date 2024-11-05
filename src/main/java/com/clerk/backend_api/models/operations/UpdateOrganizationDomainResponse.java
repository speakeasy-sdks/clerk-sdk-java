/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;


import com.clerk.backend_api.models.components.OrganizationDomain;
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


public class UpdateOrganizationDomainResponse implements Response {

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
     * An organization domain
     */
    private Optional<? extends OrganizationDomain> organizationDomain;

    @JsonCreator
    public UpdateOrganizationDomainResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends OrganizationDomain> organizationDomain) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(organizationDomain, "organizationDomain");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.organizationDomain = organizationDomain;
    }
    
    public UpdateOrganizationDomainResponse(
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
     * An organization domain
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OrganizationDomain> organizationDomain() {
        return (Optional<OrganizationDomain>) organizationDomain;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public UpdateOrganizationDomainResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public UpdateOrganizationDomainResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public UpdateOrganizationDomainResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * An organization domain
     */
    public UpdateOrganizationDomainResponse withOrganizationDomain(OrganizationDomain organizationDomain) {
        Utils.checkNotNull(organizationDomain, "organizationDomain");
        this.organizationDomain = Optional.ofNullable(organizationDomain);
        return this;
    }

    /**
     * An organization domain
     */
    public UpdateOrganizationDomainResponse withOrganizationDomain(Optional<? extends OrganizationDomain> organizationDomain) {
        Utils.checkNotNull(organizationDomain, "organizationDomain");
        this.organizationDomain = organizationDomain;
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
        UpdateOrganizationDomainResponse other = (UpdateOrganizationDomainResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.organizationDomain, other.organizationDomain);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            organizationDomain);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateOrganizationDomainResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "organizationDomain", organizationDomain);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends OrganizationDomain> organizationDomain = Optional.empty();  
        
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
         * An organization domain
         */
        public Builder organizationDomain(OrganizationDomain organizationDomain) {
            Utils.checkNotNull(organizationDomain, "organizationDomain");
            this.organizationDomain = Optional.ofNullable(organizationDomain);
            return this;
        }

        /**
         * An organization domain
         */
        public Builder organizationDomain(Optional<? extends OrganizationDomain> organizationDomain) {
            Utils.checkNotNull(organizationDomain, "organizationDomain");
            this.organizationDomain = organizationDomain;
            return this;
        }
        
        public UpdateOrganizationDomainResponse build() {
            return new UpdateOrganizationDomainResponse(
                contentType,
                statusCode,
                rawResponse,
                organizationDomain);
        }
    }
}

