/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;


import com.clerk.backend_api.utils.SpeakeasyMetadata;
import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class GetOrganizationRequest {

    /**
     * The ID or slug of the organization
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organization_id")
    private String organizationId;

    /**
     * Flag to denote whether or not the organization's members count should be included in the response.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=include_members_count")
    private Optional<Boolean> includeMembersCount;

    @JsonCreator
    public GetOrganizationRequest(
            String organizationId,
            Optional<Boolean> includeMembersCount) {
        Utils.checkNotNull(organizationId, "organizationId");
        Utils.checkNotNull(includeMembersCount, "includeMembersCount");
        this.organizationId = organizationId;
        this.includeMembersCount = includeMembersCount;
    }
    
    public GetOrganizationRequest(
            String organizationId) {
        this(organizationId, Optional.empty());
    }

    /**
     * The ID or slug of the organization
     */
    @JsonIgnore
    public String organizationId() {
        return organizationId;
    }

    /**
     * Flag to denote whether or not the organization's members count should be included in the response.
     */
    @JsonIgnore
    public Optional<Boolean> includeMembersCount() {
        return includeMembersCount;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID or slug of the organization
     */
    public GetOrganizationRequest withOrganizationId(String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }

    /**
     * Flag to denote whether or not the organization's members count should be included in the response.
     */
    public GetOrganizationRequest withIncludeMembersCount(boolean includeMembersCount) {
        Utils.checkNotNull(includeMembersCount, "includeMembersCount");
        this.includeMembersCount = Optional.ofNullable(includeMembersCount);
        return this;
    }

    /**
     * Flag to denote whether or not the organization's members count should be included in the response.
     */
    public GetOrganizationRequest withIncludeMembersCount(Optional<Boolean> includeMembersCount) {
        Utils.checkNotNull(includeMembersCount, "includeMembersCount");
        this.includeMembersCount = includeMembersCount;
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
        GetOrganizationRequest other = (GetOrganizationRequest) o;
        return 
            Objects.deepEquals(this.organizationId, other.organizationId) &&
            Objects.deepEquals(this.includeMembersCount, other.includeMembersCount);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            organizationId,
            includeMembersCount);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetOrganizationRequest.class,
                "organizationId", organizationId,
                "includeMembersCount", includeMembersCount);
    }
    
    public final static class Builder {
 
        private String organizationId;
 
        private Optional<Boolean> includeMembersCount = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID or slug of the organization
         */
        public Builder organizationId(String organizationId) {
            Utils.checkNotNull(organizationId, "organizationId");
            this.organizationId = organizationId;
            return this;
        }

        /**
         * Flag to denote whether or not the organization's members count should be included in the response.
         */
        public Builder includeMembersCount(boolean includeMembersCount) {
            Utils.checkNotNull(includeMembersCount, "includeMembersCount");
            this.includeMembersCount = Optional.ofNullable(includeMembersCount);
            return this;
        }

        /**
         * Flag to denote whether or not the organization's members count should be included in the response.
         */
        public Builder includeMembersCount(Optional<Boolean> includeMembersCount) {
            Utils.checkNotNull(includeMembersCount, "includeMembersCount");
            this.includeMembersCount = includeMembersCount;
            return this;
        }
        
        public GetOrganizationRequest build() {
            return new GetOrganizationRequest(
                organizationId,
                includeMembersCount);
        }
    }
}

