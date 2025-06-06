/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.clerk.backend_api.models.components;

import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * OrganizationInvitations
 * 
 * <p>A list of organization invitations
 */
public class OrganizationInvitations {

    @JsonProperty("data")
    private List<OrganizationInvitation> data;

    /**
     * Total number of organization invitations
     */
    @JsonProperty("total_count")
    private long totalCount;

    @JsonCreator
    public OrganizationInvitations(
            @JsonProperty("data") List<OrganizationInvitation> data,
            @JsonProperty("total_count") long totalCount) {
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(totalCount, "totalCount");
        this.data = data;
        this.totalCount = totalCount;
    }

    @JsonIgnore
    public List<OrganizationInvitation> data() {
        return data;
    }

    /**
     * Total number of organization invitations
     */
    @JsonIgnore
    public long totalCount() {
        return totalCount;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public OrganizationInvitations withData(List<OrganizationInvitation> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    /**
     * Total number of organization invitations
     */
    public OrganizationInvitations withTotalCount(long totalCount) {
        Utils.checkNotNull(totalCount, "totalCount");
        this.totalCount = totalCount;
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
        OrganizationInvitations other = (OrganizationInvitations) o;
        return 
            Objects.deepEquals(this.data, other.data) &&
            Objects.deepEquals(this.totalCount, other.totalCount);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            data,
            totalCount);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OrganizationInvitations.class,
                "data", data,
                "totalCount", totalCount);
    }
    
    public final static class Builder {
 
        private List<OrganizationInvitation> data;
 
        private Long totalCount;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(List<OrganizationInvitation> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        /**
         * Total number of organization invitations
         */
        public Builder totalCount(long totalCount) {
            Utils.checkNotNull(totalCount, "totalCount");
            this.totalCount = totalCount;
            return this;
        }
        
        public OrganizationInvitations build() {
            return new OrganizationInvitations(
                data,
                totalCount);
        }
    }
}
