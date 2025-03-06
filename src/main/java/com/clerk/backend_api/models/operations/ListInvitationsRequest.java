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
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class ListInvitationsRequest {

    /**
     * Filter invitations based on their status
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=status")
    private Optional<? extends ListInvitationsQueryParamStatus> status;

    /**
     * Filter invitations based on their `email_address` or `id`
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=query")
    private Optional<String> query;

    /**
     * Allows to return organizations in a particular order.
     * At the moment, you can order the returned organizations either by their `name`, `created_at` or `members_count`.
     * In order to specify the direction, you can use the `+/-` symbols prepended in the property to order by.
     * For example, if you want organizations to be returned in descending order according to their `created_at` property, you can use `-created_at`.
     * If you don't use `+` or `-`, then `+` is implied.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=order_by")
    private Optional<String> orderBy;

    /**
     * Whether to paginate the results.
     * If true, the results will be paginated.
     * If false, the results will not be paginated.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=paginated")
    private Optional<Boolean> paginated;

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

    @JsonCreator
    public ListInvitationsRequest(
            Optional<? extends ListInvitationsQueryParamStatus> status,
            Optional<String> query,
            Optional<String> orderBy,
            Optional<Boolean> paginated,
            Optional<Long> limit,
            Optional<Long> offset) {
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(query, "query");
        Utils.checkNotNull(orderBy, "orderBy");
        Utils.checkNotNull(paginated, "paginated");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(offset, "offset");
        this.status = status;
        this.query = query;
        this.orderBy = orderBy;
        this.paginated = paginated;
        this.limit = limit;
        this.offset = offset;
    }
    
    public ListInvitationsRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Filter invitations based on their status
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ListInvitationsQueryParamStatus> status() {
        return (Optional<ListInvitationsQueryParamStatus>) status;
    }

    /**
     * Filter invitations based on their `email_address` or `id`
     */
    @JsonIgnore
    public Optional<String> query() {
        return query;
    }

    /**
     * Allows to return organizations in a particular order.
     * At the moment, you can order the returned organizations either by their `name`, `created_at` or `members_count`.
     * In order to specify the direction, you can use the `+/-` symbols prepended in the property to order by.
     * For example, if you want organizations to be returned in descending order according to their `created_at` property, you can use `-created_at`.
     * If you don't use `+` or `-`, then `+` is implied.
     */
    @JsonIgnore
    public Optional<String> orderBy() {
        return orderBy;
    }

    /**
     * Whether to paginate the results.
     * If true, the results will be paginated.
     * If false, the results will not be paginated.
     */
    @JsonIgnore
    public Optional<Boolean> paginated() {
        return paginated;
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

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Filter invitations based on their status
     */
    public ListInvitationsRequest withStatus(ListInvitationsQueryParamStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * Filter invitations based on their status
     */
    public ListInvitationsRequest withStatus(Optional<? extends ListInvitationsQueryParamStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Filter invitations based on their `email_address` or `id`
     */
    public ListInvitationsRequest withQuery(String query) {
        Utils.checkNotNull(query, "query");
        this.query = Optional.ofNullable(query);
        return this;
    }

    /**
     * Filter invitations based on their `email_address` or `id`
     */
    public ListInvitationsRequest withQuery(Optional<String> query) {
        Utils.checkNotNull(query, "query");
        this.query = query;
        return this;
    }

    /**
     * Allows to return organizations in a particular order.
     * At the moment, you can order the returned organizations either by their `name`, `created_at` or `members_count`.
     * In order to specify the direction, you can use the `+/-` symbols prepended in the property to order by.
     * For example, if you want organizations to be returned in descending order according to their `created_at` property, you can use `-created_at`.
     * If you don't use `+` or `-`, then `+` is implied.
     */
    public ListInvitationsRequest withOrderBy(String orderBy) {
        Utils.checkNotNull(orderBy, "orderBy");
        this.orderBy = Optional.ofNullable(orderBy);
        return this;
    }

    /**
     * Allows to return organizations in a particular order.
     * At the moment, you can order the returned organizations either by their `name`, `created_at` or `members_count`.
     * In order to specify the direction, you can use the `+/-` symbols prepended in the property to order by.
     * For example, if you want organizations to be returned in descending order according to their `created_at` property, you can use `-created_at`.
     * If you don't use `+` or `-`, then `+` is implied.
     */
    public ListInvitationsRequest withOrderBy(Optional<String> orderBy) {
        Utils.checkNotNull(orderBy, "orderBy");
        this.orderBy = orderBy;
        return this;
    }

    /**
     * Whether to paginate the results.
     * If true, the results will be paginated.
     * If false, the results will not be paginated.
     */
    public ListInvitationsRequest withPaginated(boolean paginated) {
        Utils.checkNotNull(paginated, "paginated");
        this.paginated = Optional.ofNullable(paginated);
        return this;
    }

    /**
     * Whether to paginate the results.
     * If true, the results will be paginated.
     * If false, the results will not be paginated.
     */
    public ListInvitationsRequest withPaginated(Optional<Boolean> paginated) {
        Utils.checkNotNull(paginated, "paginated");
        this.paginated = paginated;
        return this;
    }

    /**
     * Applies a limit to the number of results returned.
     * Can be used for paginating the results together with `offset`.
     */
    public ListInvitationsRequest withLimit(long limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    /**
     * Applies a limit to the number of results returned.
     * Can be used for paginating the results together with `offset`.
     */
    public ListInvitationsRequest withLimit(Optional<Long> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    /**
     * Skip the first `offset` results when paginating.
     * Needs to be an integer greater or equal to zero.
     * To be used in conjunction with `limit`.
     */
    public ListInvitationsRequest withOffset(long offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = Optional.ofNullable(offset);
        return this;
    }

    /**
     * Skip the first `offset` results when paginating.
     * Needs to be an integer greater or equal to zero.
     * To be used in conjunction with `limit`.
     */
    public ListInvitationsRequest withOffset(Optional<Long> offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = offset;
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
        ListInvitationsRequest other = (ListInvitationsRequest) o;
        return 
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.query, other.query) &&
            Objects.deepEquals(this.orderBy, other.orderBy) &&
            Objects.deepEquals(this.paginated, other.paginated) &&
            Objects.deepEquals(this.limit, other.limit) &&
            Objects.deepEquals(this.offset, other.offset);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            status,
            query,
            orderBy,
            paginated,
            limit,
            offset);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListInvitationsRequest.class,
                "status", status,
                "query", query,
                "orderBy", orderBy,
                "paginated", paginated,
                "limit", limit,
                "offset", offset);
    }
    
    public final static class Builder {
 
        private Optional<? extends ListInvitationsQueryParamStatus> status = Optional.empty();
 
        private Optional<String> query = Optional.empty();
 
        private Optional<String> orderBy = Optional.empty();
 
        private Optional<Boolean> paginated = Optional.empty();
 
        private Optional<Long> limit;
 
        private Optional<Long> offset;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Filter invitations based on their status
         */
        public Builder status(ListInvitationsQueryParamStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * Filter invitations based on their status
         */
        public Builder status(Optional<? extends ListInvitationsQueryParamStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * Filter invitations based on their `email_address` or `id`
         */
        public Builder query(String query) {
            Utils.checkNotNull(query, "query");
            this.query = Optional.ofNullable(query);
            return this;
        }

        /**
         * Filter invitations based on their `email_address` or `id`
         */
        public Builder query(Optional<String> query) {
            Utils.checkNotNull(query, "query");
            this.query = query;
            return this;
        }

        /**
         * Allows to return organizations in a particular order.
         * At the moment, you can order the returned organizations either by their `name`, `created_at` or `members_count`.
         * In order to specify the direction, you can use the `+/-` symbols prepended in the property to order by.
         * For example, if you want organizations to be returned in descending order according to their `created_at` property, you can use `-created_at`.
         * If you don't use `+` or `-`, then `+` is implied.
         */
        public Builder orderBy(String orderBy) {
            Utils.checkNotNull(orderBy, "orderBy");
            this.orderBy = Optional.ofNullable(orderBy);
            return this;
        }

        /**
         * Allows to return organizations in a particular order.
         * At the moment, you can order the returned organizations either by their `name`, `created_at` or `members_count`.
         * In order to specify the direction, you can use the `+/-` symbols prepended in the property to order by.
         * For example, if you want organizations to be returned in descending order according to their `created_at` property, you can use `-created_at`.
         * If you don't use `+` or `-`, then `+` is implied.
         */
        public Builder orderBy(Optional<String> orderBy) {
            Utils.checkNotNull(orderBy, "orderBy");
            this.orderBy = orderBy;
            return this;
        }

        /**
         * Whether to paginate the results.
         * If true, the results will be paginated.
         * If false, the results will not be paginated.
         */
        public Builder paginated(boolean paginated) {
            Utils.checkNotNull(paginated, "paginated");
            this.paginated = Optional.ofNullable(paginated);
            return this;
        }

        /**
         * Whether to paginate the results.
         * If true, the results will be paginated.
         * If false, the results will not be paginated.
         */
        public Builder paginated(Optional<Boolean> paginated) {
            Utils.checkNotNull(paginated, "paginated");
            this.paginated = paginated;
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
        
        public ListInvitationsRequest build() {
            if (limit == null) {
                limit = _SINGLETON_VALUE_Limit.value();
            }
            if (offset == null) {
                offset = _SINGLETON_VALUE_Offset.value();
            }            return new ListInvitationsRequest(
                status,
                query,
                orderBy,
                paginated,
                limit,
                offset);
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

