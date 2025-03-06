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
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class Web3WalletVerificationAdmin {

    @JsonProperty("status")
    private AdminVerificationWeb3WalletStatus status;

    @JsonProperty("strategy")
    private AdminVerificationWeb3WalletStrategy strategy;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("attempts")
    private Optional<Long> attempts;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("expire_at")
    private Optional<Long> expireAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("verified_at_client")
    private JsonNullable<String> verifiedAtClient;

    @JsonCreator
    public Web3WalletVerificationAdmin(
            @JsonProperty("status") AdminVerificationWeb3WalletStatus status,
            @JsonProperty("strategy") AdminVerificationWeb3WalletStrategy strategy,
            @JsonProperty("attempts") Optional<Long> attempts,
            @JsonProperty("expire_at") Optional<Long> expireAt,
            @JsonProperty("verified_at_client") JsonNullable<String> verifiedAtClient) {
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(strategy, "strategy");
        Utils.checkNotNull(attempts, "attempts");
        Utils.checkNotNull(expireAt, "expireAt");
        Utils.checkNotNull(verifiedAtClient, "verifiedAtClient");
        this.status = status;
        this.strategy = strategy;
        this.attempts = attempts;
        this.expireAt = expireAt;
        this.verifiedAtClient = verifiedAtClient;
    }
    
    public Web3WalletVerificationAdmin(
            AdminVerificationWeb3WalletStatus status,
            AdminVerificationWeb3WalletStrategy strategy) {
        this(status, strategy, Optional.empty(), Optional.empty(), JsonNullable.undefined());
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
    public Optional<Long> attempts() {
        return attempts;
    }

    @JsonIgnore
    public Optional<Long> expireAt() {
        return expireAt;
    }

    @JsonIgnore
    public JsonNullable<String> verifiedAtClient() {
        return verifiedAtClient;
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
        this.attempts = Optional.ofNullable(attempts);
        return this;
    }

    public Web3WalletVerificationAdmin withAttempts(Optional<Long> attempts) {
        Utils.checkNotNull(attempts, "attempts");
        this.attempts = attempts;
        return this;
    }

    public Web3WalletVerificationAdmin withExpireAt(long expireAt) {
        Utils.checkNotNull(expireAt, "expireAt");
        this.expireAt = Optional.ofNullable(expireAt);
        return this;
    }

    public Web3WalletVerificationAdmin withExpireAt(Optional<Long> expireAt) {
        Utils.checkNotNull(expireAt, "expireAt");
        this.expireAt = expireAt;
        return this;
    }

    public Web3WalletVerificationAdmin withVerifiedAtClient(String verifiedAtClient) {
        Utils.checkNotNull(verifiedAtClient, "verifiedAtClient");
        this.verifiedAtClient = JsonNullable.of(verifiedAtClient);
        return this;
    }

    public Web3WalletVerificationAdmin withVerifiedAtClient(JsonNullable<String> verifiedAtClient) {
        Utils.checkNotNull(verifiedAtClient, "verifiedAtClient");
        this.verifiedAtClient = verifiedAtClient;
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
            Objects.deepEquals(this.expireAt, other.expireAt) &&
            Objects.deepEquals(this.verifiedAtClient, other.verifiedAtClient);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            status,
            strategy,
            attempts,
            expireAt,
            verifiedAtClient);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Web3WalletVerificationAdmin.class,
                "status", status,
                "strategy", strategy,
                "attempts", attempts,
                "expireAt", expireAt,
                "verifiedAtClient", verifiedAtClient);
    }
    
    public final static class Builder {
 
        private AdminVerificationWeb3WalletStatus status;
 
        private AdminVerificationWeb3WalletStrategy strategy;
 
        private Optional<Long> attempts = Optional.empty();
 
        private Optional<Long> expireAt = Optional.empty();
 
        private JsonNullable<String> verifiedAtClient = JsonNullable.undefined();  
        
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
            this.attempts = Optional.ofNullable(attempts);
            return this;
        }

        public Builder attempts(Optional<Long> attempts) {
            Utils.checkNotNull(attempts, "attempts");
            this.attempts = attempts;
            return this;
        }

        public Builder expireAt(long expireAt) {
            Utils.checkNotNull(expireAt, "expireAt");
            this.expireAt = Optional.ofNullable(expireAt);
            return this;
        }

        public Builder expireAt(Optional<Long> expireAt) {
            Utils.checkNotNull(expireAt, "expireAt");
            this.expireAt = expireAt;
            return this;
        }

        public Builder verifiedAtClient(String verifiedAtClient) {
            Utils.checkNotNull(verifiedAtClient, "verifiedAtClient");
            this.verifiedAtClient = JsonNullable.of(verifiedAtClient);
            return this;
        }

        public Builder verifiedAtClient(JsonNullable<String> verifiedAtClient) {
            Utils.checkNotNull(verifiedAtClient, "verifiedAtClient");
            this.verifiedAtClient = verifiedAtClient;
            return this;
        }
        
        public Web3WalletVerificationAdmin build() {
            return new Web3WalletVerificationAdmin(
                status,
                strategy,
                attempts,
                expireAt,
                verifiedAtClient);
        }
    }
}

