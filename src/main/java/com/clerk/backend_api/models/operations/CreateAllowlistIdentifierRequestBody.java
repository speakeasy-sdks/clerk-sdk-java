/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.operations;


import com.clerk.backend_api.utils.LazySingletonValue;
import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class CreateAllowlistIdentifierRequestBody {

    /**
     * The identifier to be added in the allow-list.
     * This can be an email address, a phone number or a web3 wallet.
     */
    @JsonProperty("identifier")
    private String identifier;

    /**
     * This flag denotes whether the given identifier will receive an invitation to join the application.
     * Note that this only works for email address and phone number identifiers.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("notify")
    private Optional<Boolean> notify_;

    @JsonCreator
    public CreateAllowlistIdentifierRequestBody(
            @JsonProperty("identifier") String identifier,
            @JsonProperty("notify") Optional<Boolean> notify_) {
        Utils.checkNotNull(identifier, "identifier");
        Utils.checkNotNull(notify_, "notify_");
        this.identifier = identifier;
        this.notify_ = notify_;
    }
    
    public CreateAllowlistIdentifierRequestBody(
            String identifier) {
        this(identifier, Optional.empty());
    }

    /**
     * The identifier to be added in the allow-list.
     * This can be an email address, a phone number or a web3 wallet.
     */
    @JsonIgnore
    public String identifier() {
        return identifier;
    }

    /**
     * This flag denotes whether the given identifier will receive an invitation to join the application.
     * Note that this only works for email address and phone number identifiers.
     */
    @JsonIgnore
    public Optional<Boolean> notify_() {
        return notify_;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The identifier to be added in the allow-list.
     * This can be an email address, a phone number or a web3 wallet.
     */
    public CreateAllowlistIdentifierRequestBody withIdentifier(String identifier) {
        Utils.checkNotNull(identifier, "identifier");
        this.identifier = identifier;
        return this;
    }

    /**
     * This flag denotes whether the given identifier will receive an invitation to join the application.
     * Note that this only works for email address and phone number identifiers.
     */
    public CreateAllowlistIdentifierRequestBody withNotify(boolean notify_) {
        Utils.checkNotNull(notify_, "notify_");
        this.notify_ = Optional.ofNullable(notify_);
        return this;
    }

    /**
     * This flag denotes whether the given identifier will receive an invitation to join the application.
     * Note that this only works for email address and phone number identifiers.
     */
    public CreateAllowlistIdentifierRequestBody withNotify(Optional<Boolean> notify_) {
        Utils.checkNotNull(notify_, "notify_");
        this.notify_ = notify_;
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
        CreateAllowlistIdentifierRequestBody other = (CreateAllowlistIdentifierRequestBody) o;
        return 
            Objects.deepEquals(this.identifier, other.identifier) &&
            Objects.deepEquals(this.notify_, other.notify_);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            identifier,
            notify_);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateAllowlistIdentifierRequestBody.class,
                "identifier", identifier,
                "notify_", notify_);
    }
    
    public final static class Builder {
 
        private String identifier;
 
        private Optional<Boolean> notify_;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The identifier to be added in the allow-list.
         * This can be an email address, a phone number or a web3 wallet.
         */
        public Builder identifier(String identifier) {
            Utils.checkNotNull(identifier, "identifier");
            this.identifier = identifier;
            return this;
        }

        /**
         * This flag denotes whether the given identifier will receive an invitation to join the application.
         * Note that this only works for email address and phone number identifiers.
         */
        public Builder notify_(boolean notify_) {
            Utils.checkNotNull(notify_, "notify_");
            this.notify_ = Optional.ofNullable(notify_);
            return this;
        }

        /**
         * This flag denotes whether the given identifier will receive an invitation to join the application.
         * Note that this only works for email address and phone number identifiers.
         */
        public Builder notify_(Optional<Boolean> notify_) {
            Utils.checkNotNull(notify_, "notify_");
            this.notify_ = notify_;
            return this;
        }
        
        public CreateAllowlistIdentifierRequestBody build() {
            if (notify_ == null) {
                notify_ = _SINGLETON_VALUE_Notify.value();
            }            return new CreateAllowlistIdentifierRequestBody(
                identifier,
                notify_);
        }

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_Notify =
                new LazySingletonValue<>(
                        "notify",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});
    }
}

