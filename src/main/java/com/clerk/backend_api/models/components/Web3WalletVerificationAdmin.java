/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.components;


import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class Web3WalletVerificationAdmin {

    @JsonProperty("status")
    private AdminVerificationWeb3WalletStatus status;

    @JsonProperty("strategy")
    private AdminVerificationWeb3WalletStrategy strategy;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attempts")
    private JsonNullable<Long> attempts;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expire_at")
    private JsonNullable<Long> expireAt;

    @JsonCreator
    public Web3WalletVerificationAdmin(
            @JsonProperty("status") AdminVerificationWeb3WalletStatus status,
            @JsonProperty("strategy") AdminVerificationWeb3WalletStrategy strategy,
            @JsonProperty("attempts") JsonNullable<Long> attempts,
            @JsonProperty("expire_at") JsonNullable<Long> expireAt) {
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(strategy, "strategy");
        Utils.checkNotNull(attempts, "attempts");
        Utils.checkNotNull(expireAt, "expireAt");
        this.status = status;
        this.strategy = strategy;
        this.attempts = attempts;
        this.expireAt = expireAt;
    }
    
    public Web3WalletVerificationAdmin(
            AdminVerificationWeb3WalletStatus status,
            AdminVerificationWeb3WalletStrategy strategy) {
        this(status, strategy, JsonNullable.undefined(), JsonNullable.undefined());
    }

    @JsonIgnore
    public AdminVerificationWeb3WalletStatus status() {
        return status;
    }

    @JsonIgnore
    public AdminVerificationWeb3WalletStrategy strategy() {
        return strategy;
    }

    @JsonIgnore
    public JsonNullable<Long> attempts() {
        return attempts;
    }

    @JsonIgnore
    public JsonNullable<Long> expireAt() {
        return expireAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Web3WalletVerificationAdmin withStatus(AdminVerificationWeb3WalletStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public Web3WalletVerificationAdmin withStrategy(AdminVerificationWeb3WalletStrategy strategy) {
        Utils.checkNotNull(strategy, "strategy");
        this.strategy = strategy;
        return this;
    }

    public Web3WalletVerificationAdmin withAttempts(long attempts) {
        Utils.checkNotNull(attempts, "attempts");
        this.attempts = JsonNullable.of(attempts);
        return this;
    }

    public Web3WalletVerificationAdmin withAttempts(JsonNullable<Long> attempts) {
        Utils.checkNotNull(attempts, "attempts");
        this.attempts = attempts;
        return this;
    }

    public Web3WalletVerificationAdmin withExpireAt(long expireAt) {
        Utils.checkNotNull(expireAt, "expireAt");
        this.expireAt = JsonNullable.of(expireAt);
        return this;
    }

    public Web3WalletVerificationAdmin withExpireAt(JsonNullable<Long> expireAt) {
        Utils.checkNotNull(expireAt, "expireAt");
        this.expireAt = expireAt;
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
        Web3WalletVerificationAdmin other = (Web3WalletVerificationAdmin) o;
        return 
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.strategy, other.strategy) &&
            Objects.deepEquals(this.attempts, other.attempts) &&
            Objects.deepEquals(this.expireAt, other.expireAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            status,
            strategy,
            attempts,
            expireAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Web3WalletVerificationAdmin.class,
                "status", status,
                "strategy", strategy,
                "attempts", attempts,
                "expireAt", expireAt);
    }
    
    public final static class Builder {
 
        private AdminVerificationWeb3WalletStatus status;
 
        private AdminVerificationWeb3WalletStrategy strategy;
 
        private JsonNullable<Long> attempts = JsonNullable.undefined();
 
        private JsonNullable<Long> expireAt = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder status(AdminVerificationWeb3WalletStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder strategy(AdminVerificationWeb3WalletStrategy strategy) {
            Utils.checkNotNull(strategy, "strategy");
            this.strategy = strategy;
            return this;
        }

        public Builder attempts(long attempts) {
            Utils.checkNotNull(attempts, "attempts");
            this.attempts = JsonNullable.of(attempts);
            return this;
        }

        public Builder attempts(JsonNullable<Long> attempts) {
            Utils.checkNotNull(attempts, "attempts");
            this.attempts = attempts;
            return this;
        }

        public Builder expireAt(long expireAt) {
            Utils.checkNotNull(expireAt, "expireAt");
            this.expireAt = JsonNullable.of(expireAt);
            return this;
        }

        public Builder expireAt(JsonNullable<Long> expireAt) {
            Utils.checkNotNull(expireAt, "expireAt");
            this.expireAt = expireAt;
            return this;
        }
        
        public Web3WalletVerificationAdmin build() {
            return new Web3WalletVerificationAdmin(
                status,
                strategy,
                attempts,
                expireAt);
        }
    }
}

