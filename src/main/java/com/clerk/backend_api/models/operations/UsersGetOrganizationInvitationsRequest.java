/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.clerk.backend_api.models.operations;
import com.clerk.backend_api.utils.LazySingletonValue;
import com.clerk.backend_api.utils.SpeakeasyMetadata;
import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class UsersGetOrganizationInvitationsRequest {

    /**
     * The ID of the user whose organization invitations we want to retrieve
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=user_id")
    private String userId;

    /**
     * Applies a limit to the number of results returned.
     * Can be used for paginating the results together with `offset`.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    private Optional<Long> limit;

    /**
     * Skip the first `offset` results when paginating.
     * Needs to be an integer greater or equal to zero.
     * To be used in conjunction with `limit`.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    private Optional<Long> offset;

    /**
     * Filter organization invitations based on their status
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=status")
    private Optional<? extends QueryParamStatus> status;

    @JsonCreator
    public UsersGetOrganizationInvitationsRequest(
            String userId,
            Optional<Long> limit,
            Optional<Long> offset,
            Optional<? extends QueryParamStatus> status) {
        Utils.checkNotNull(userId, "userId");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(offset, "offset");
        Utils.checkNotNull(status, "status");
        this.userId = userId;
        this.limit = limit;
        this.offset = offset;
        this.status = status;
    }
    
    public UsersGetOrganizationInvitationsRequest(
            String userId) {
        this(userId, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The ID of the user whose organization invitations we want to retrieve
     */
    @JsonIgnore
    public String userId() {
        return userId;
    }

    /**
     * Applies a limit to the number of results returned.
     * Can be used for paginating the results together with `offset`.
     */
    @JsonIgnore
    public Optional<Long> limit() {
        return limit;
    }

    /**
     * Skip the first `offset` results when paginating.
     * Needs to be an integer greater or equal to zero.
     * To be used in conjunction with `limit`.
     */
    @JsonIgnore
    public Optional<Long> offset() {
        return offset;
    }

    /**
     * Filter organization invitations based on their status
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<QueryParamStatus> status() {
        return (Optional<QueryParamStatus>) status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the user whose organization invitations we want to retrieve
     */
    public UsersGetOrganizationInvitationsRequest withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    /**
     * Applies a limit to the number of results returned.
     * Can be used for paginating the results together with `offset`.
     */
    public UsersGetOrganizationInvitationsRequest withLimit(long limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    /**
     * Applies a limit to the number of results returned.
     * Can be used for paginating the results together with `offset`.
     */
    public UsersGetOrganizationInvitationsRequest withLimit(Optional<Long> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    /**
     * Skip the first `offset` results when paginating.
     * Needs to be an integer greater or equal to zero.
     * To be used in conjunction with `limit`.
     */
    public UsersGetOrganizationInvitationsRequest withOffset(long offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = Optional.ofNullable(offset);
        return this;
    }

    /**
     * Skip the first `offset` results when paginating.
     * Needs to be an integer greater or equal to zero.
     * To be used in conjunction with `limit`.
     */
    public UsersGetOrganizationInvitationsRequest withOffset(Optional<Long> offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = offset;
        return this;
    }

    /**
     * Filter organization invitations based on their status
     */
    public UsersGetOrganizationInvitationsRequest withStatus(QueryParamStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * Filter organization invitations based on their status
     */
    public UsersGetOrganizationInvitationsRequest withStatus(Optional<? extends QueryParamStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        UsersGetOrganizationInvitationsRequest other = (UsersGetOrganizationInvitationsRequest) o;
        return 
            Objects.deepEquals(this.userId, other.userId) &&
            Objects.deepEquals(this.limit, other.limit) &&
            Objects.deepEquals(this.offset, other.offset) &&
            Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            userId,
            limit,
            offset,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UsersGetOrganizationInvitationsRequest.class,
                "userId", userId,
                "limit", limit,
                "offset", offset,
                "status", status);
    }
    
    public final static class Builder {
 
        private String userId;
 
        private Optional<Long> limit;
 
        private Optional<Long> offset;
 
        private Optional<? extends QueryParamStatus> status = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the user whose organization invitations we want to retrieve
         */
        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }

        /**
         * Applies a limit to the number of results returned.
         * Can be used for paginating the results together with `offset`.
         */
        public Builder limit(long limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = Optional.ofNullable(limit);
            return this;
        }

        /**
         * Applies a limit to the number of results returned.
         * Can be used for paginating the results together with `offset`.
         */
        public Builder limit(Optional<Long> limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = limit;
            return this;
        }

        /**
         * Skip the first `offset` results when paginating.
         * Needs to be an integer greater or equal to zero.
         * To be used in conjunction with `limit`.
         */
        public Builder offset(long offset) {
            Utils.checkNotNull(offset, "offset");
            this.offset = Optional.ofNullable(offset);
            return this;
        }

        /**
         * Skip the first `offset` results when paginating.
         * Needs to be an integer greater or equal to zero.
         * To be used in conjunction with `limit`.
         */
        public Builder offset(Optional<Long> offset) {
            Utils.checkNotNull(offset, "offset");
            this.offset = offset;
            return this;
        }

        /**
         * Filter organization invitations based on their status
         */
        public Builder status(QueryParamStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * Filter organization invitations based on their status
         */
        public Builder status(Optional<? extends QueryParamStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public UsersGetOrganizationInvitationsRequest build() {
            if (limit == null) {
                limit = _SINGLETON_VALUE_Limit.value();
            }
            if (offset == null) {
                offset = _SINGLETON_VALUE_Offset.value();
            }            return new UsersGetOrganizationInvitationsRequest(
                userId,
                limit,
                offset,
                status);
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
}

