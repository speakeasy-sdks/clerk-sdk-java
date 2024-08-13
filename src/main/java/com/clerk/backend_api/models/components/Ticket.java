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


public class Ticket {

    @JsonProperty("status")
    private TicketVerificationStatus status;

    @JsonProperty("strategy")
    private TicketVerificationStrategy strategy;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attempts")
    private JsonNullable<Long> attempts;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expire_at")
    private JsonNullable<Long> expireAt;

    @JsonCreator
    public Ticket(
            @JsonProperty("status") TicketVerificationStatus status,
            @JsonProperty("strategy") TicketVerificationStrategy strategy,
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
    
    public Ticket(
            TicketVerificationStatus status,
            TicketVerificationStrategy strategy) {
        this(status, strategy, JsonNullable.undefined(), JsonNullable.undefined());
    }

    @JsonIgnore
    public TicketVerificationStatus status() {
        return status;
    }

    @JsonIgnore
    public TicketVerificationStrategy strategy() {
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

    public Ticket withStatus(TicketVerificationStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public Ticket withStrategy(TicketVerificationStrategy strategy) {
        Utils.checkNotNull(strategy, "strategy");
        this.strategy = strategy;
        return this;
    }

    public Ticket withAttempts(long attempts) {
        Utils.checkNotNull(attempts, "attempts");
        this.attempts = JsonNullable.of(attempts);
        return this;
    }

    public Ticket withAttempts(JsonNullable<Long> attempts) {
        Utils.checkNotNull(attempts, "attempts");
        this.attempts = attempts;
        return this;
    }

    public Ticket withExpireAt(long expireAt) {
        Utils.checkNotNull(expireAt, "expireAt");
        this.expireAt = JsonNullable.of(expireAt);
        return this;
    }

    public Ticket withExpireAt(JsonNullable<Long> expireAt) {
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
        Ticket other = (Ticket) o;
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
        return Utils.toString(Ticket.class,
                "status", status,
                "strategy", strategy,
                "attempts", attempts,
                "expireAt", expireAt);
    }
    
    public final static class Builder {
 
        private TicketVerificationStatus status;
 
        private TicketVerificationStrategy strategy;
 
        private JsonNullable<Long> attempts = JsonNullable.undefined();
 
        private JsonNullable<Long> expireAt = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder status(TicketVerificationStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder strategy(TicketVerificationStrategy strategy) {
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
        
        public Ticket build() {
            return new Ticket(
                status,
                strategy,
                attempts,
                expireAt);
        }
    }
}

