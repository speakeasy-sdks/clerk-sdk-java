/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.clerk.backend_api.models.operations;
import com.clerk.backend_api.models.components.SAMLConnections;
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

public class ListSAMLConnectionsResponse implements Response {

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
     * A list of SAML Connections
     */
    private Optional<? extends SAMLConnections> samlConnections;

    @JsonCreator
    public ListSAMLConnectionsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends SAMLConnections> samlConnections) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(samlConnections, "samlConnections");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.samlConnections = samlConnections;
    }
    
    public ListSAMLConnectionsResponse(
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
     * A list of SAML Connections
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SAMLConnections> samlConnections() {
        return (Optional<SAMLConnections>) samlConnections;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public ListSAMLConnectionsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListSAMLConnectionsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListSAMLConnectionsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * A list of SAML Connections
     */
    public ListSAMLConnectionsResponse withSAMLConnections(SAMLConnections samlConnections) {
        Utils.checkNotNull(samlConnections, "samlConnections");
        this.samlConnections = Optional.ofNullable(samlConnections);
        return this;
    }

    /**
     * A list of SAML Connections
     */
    public ListSAMLConnectionsResponse withSAMLConnections(Optional<? extends SAMLConnections> samlConnections) {
        Utils.checkNotNull(samlConnections, "samlConnections");
        this.samlConnections = samlConnections;
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
        ListSAMLConnectionsResponse other = (ListSAMLConnectionsResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.samlConnections, other.samlConnections);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            samlConnections);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListSAMLConnectionsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "samlConnections", samlConnections);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends SAMLConnections> samlConnections = Optional.empty();  
        
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
         * A list of SAML Connections
         */
        public Builder samlConnections(SAMLConnections samlConnections) {
            Utils.checkNotNull(samlConnections, "samlConnections");
            this.samlConnections = Optional.ofNullable(samlConnections);
            return this;
        }

        /**
         * A list of SAML Connections
         */
        public Builder samlConnections(Optional<? extends SAMLConnections> samlConnections) {
            Utils.checkNotNull(samlConnections, "samlConnections");
            this.samlConnections = samlConnections;
            return this;
        }
        
        public ListSAMLConnectionsResponse build() {
            return new ListSAMLConnectionsResponse(
                contentType,
                statusCode,
                rawResponse,
                samlConnections);
        }
    }
}

