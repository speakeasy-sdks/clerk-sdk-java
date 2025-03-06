/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.clerk.backend_api.models.operations;
import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class UpdateProductionInstanceDomainRequestBody {

    /**
     * The new home URL of the production instance e.g. https://www.example.com
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("home_url")
    private Optional<String> homeUrl;

    /**
     * Whether the domain is a secondary app.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_secondary")
    private Optional<Boolean> isSecondary;

    @JsonCreator
    public UpdateProductionInstanceDomainRequestBody(
            @JsonProperty("home_url") Optional<String> homeUrl,
            @JsonProperty("is_secondary") Optional<Boolean> isSecondary) {
        Utils.checkNotNull(homeUrl, "homeUrl");
        Utils.checkNotNull(isSecondary, "isSecondary");
        this.homeUrl = homeUrl;
        this.isSecondary = isSecondary;
    }
    
    public UpdateProductionInstanceDomainRequestBody() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * The new home URL of the production instance e.g. https://www.example.com
     */
    @JsonIgnore
    public Optional<String> homeUrl() {
        return homeUrl;
    }

    /**
     * Whether the domain is a secondary app.
     */
    @JsonIgnore
    public Optional<Boolean> isSecondary() {
        return isSecondary;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The new home URL of the production instance e.g. https://www.example.com
     */
    public UpdateProductionInstanceDomainRequestBody withHomeUrl(String homeUrl) {
        Utils.checkNotNull(homeUrl, "homeUrl");
        this.homeUrl = Optional.ofNullable(homeUrl);
        return this;
    }

    /**
     * The new home URL of the production instance e.g. https://www.example.com
     */
    public UpdateProductionInstanceDomainRequestBody withHomeUrl(Optional<String> homeUrl) {
        Utils.checkNotNull(homeUrl, "homeUrl");
        this.homeUrl = homeUrl;
        return this;
    }

    /**
     * Whether the domain is a secondary app.
     */
    public UpdateProductionInstanceDomainRequestBody withIsSecondary(boolean isSecondary) {
        Utils.checkNotNull(isSecondary, "isSecondary");
        this.isSecondary = Optional.ofNullable(isSecondary);
        return this;
    }

    /**
     * Whether the domain is a secondary app.
     */
    public UpdateProductionInstanceDomainRequestBody withIsSecondary(Optional<Boolean> isSecondary) {
        Utils.checkNotNull(isSecondary, "isSecondary");
        this.isSecondary = isSecondary;
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
        UpdateProductionInstanceDomainRequestBody other = (UpdateProductionInstanceDomainRequestBody) o;
        return 
            Objects.deepEquals(this.homeUrl, other.homeUrl) &&
            Objects.deepEquals(this.isSecondary, other.isSecondary);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            homeUrl,
            isSecondary);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateProductionInstanceDomainRequestBody.class,
                "homeUrl", homeUrl,
                "isSecondary", isSecondary);
    }
    
    public final static class Builder {
 
        private Optional<String> homeUrl = Optional.empty();
 
        private Optional<Boolean> isSecondary = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The new home URL of the production instance e.g. https://www.example.com
         */
        public Builder homeUrl(String homeUrl) {
            Utils.checkNotNull(homeUrl, "homeUrl");
            this.homeUrl = Optional.ofNullable(homeUrl);
            return this;
        }

        /**
         * The new home URL of the production instance e.g. https://www.example.com
         */
        public Builder homeUrl(Optional<String> homeUrl) {
            Utils.checkNotNull(homeUrl, "homeUrl");
            this.homeUrl = homeUrl;
            return this;
        }

        /**
         * Whether the domain is a secondary app.
         */
        public Builder isSecondary(boolean isSecondary) {
            Utils.checkNotNull(isSecondary, "isSecondary");
            this.isSecondary = Optional.ofNullable(isSecondary);
            return this;
        }

        /**
         * Whether the domain is a secondary app.
         */
        public Builder isSecondary(Optional<Boolean> isSecondary) {
            Utils.checkNotNull(isSecondary, "isSecondary");
            this.isSecondary = isSecondary;
            return this;
        }
        
        public UpdateProductionInstanceDomainRequestBody build() {
            return new UpdateProductionInstanceDomainRequestBody(
                homeUrl,
                isSecondary);
        }
    }
}

