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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class ErrorClerkError {

    @JsonProperty("message")
    private String message;

    @JsonProperty("long_message")
    private String longMessage;

    @JsonProperty("code")
    private String code;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("meta")
    private Optional<? extends ErrorMeta> meta;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("clerk_trace_id")
    private Optional<String> clerkTraceId;

    @JsonCreator
    public ErrorClerkError(
            @JsonProperty("message") String message,
            @JsonProperty("long_message") String longMessage,
            @JsonProperty("code") String code,
            @JsonProperty("meta") Optional<? extends ErrorMeta> meta,
            @JsonProperty("clerk_trace_id") Optional<String> clerkTraceId) {
        Utils.checkNotNull(message, "message");
        Utils.checkNotNull(longMessage, "longMessage");
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(meta, "meta");
        Utils.checkNotNull(clerkTraceId, "clerkTraceId");
        this.message = message;
        this.longMessage = longMessage;
        this.code = code;
        this.meta = meta;
        this.clerkTraceId = clerkTraceId;
    }
    
    public ErrorClerkError(
            String message,
            String longMessage,
            String code) {
        this(message, longMessage, code, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String message() {
        return message;
    }

    @JsonIgnore
    public String longMessage() {
        return longMessage;
    }

    @JsonIgnore
    public String code() {
        return code;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ErrorMeta> meta() {
        return (Optional<ErrorMeta>) meta;
    }

    @JsonIgnore
    public Optional<String> clerkTraceId() {
        return clerkTraceId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ErrorClerkError withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
        return this;
    }

    public ErrorClerkError withLongMessage(String longMessage) {
        Utils.checkNotNull(longMessage, "longMessage");
        this.longMessage = longMessage;
        return this;
    }

    public ErrorClerkError withCode(String code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    public ErrorClerkError withMeta(ErrorMeta meta) {
        Utils.checkNotNull(meta, "meta");
        this.meta = Optional.ofNullable(meta);
        return this;
    }

    public ErrorClerkError withMeta(Optional<? extends ErrorMeta> meta) {
        Utils.checkNotNull(meta, "meta");
        this.meta = meta;
        return this;
    }

    public ErrorClerkError withClerkTraceId(String clerkTraceId) {
        Utils.checkNotNull(clerkTraceId, "clerkTraceId");
        this.clerkTraceId = Optional.ofNullable(clerkTraceId);
        return this;
    }

    public ErrorClerkError withClerkTraceId(Optional<String> clerkTraceId) {
        Utils.checkNotNull(clerkTraceId, "clerkTraceId");
        this.clerkTraceId = clerkTraceId;
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
        ErrorClerkError other = (ErrorClerkError) o;
        return 
            Objects.deepEquals(this.message, other.message) &&
            Objects.deepEquals(this.longMessage, other.longMessage) &&
            Objects.deepEquals(this.code, other.code) &&
            Objects.deepEquals(this.meta, other.meta) &&
            Objects.deepEquals(this.clerkTraceId, other.clerkTraceId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            message,
            longMessage,
            code,
            meta,
            clerkTraceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ErrorClerkError.class,
                "message", message,
                "longMessage", longMessage,
                "code", code,
                "meta", meta,
                "clerkTraceId", clerkTraceId);
    }
    
    public final static class Builder {
 
        private String message;
 
        private String longMessage;
 
        private String code;
 
        private Optional<? extends ErrorMeta> meta = Optional.empty();
 
        private Optional<String> clerkTraceId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder message(String message) {
            Utils.checkNotNull(message, "message");
            this.message = message;
            return this;
        }

        public Builder longMessage(String longMessage) {
            Utils.checkNotNull(longMessage, "longMessage");
            this.longMessage = longMessage;
            return this;
        }

        public Builder code(String code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
            return this;
        }

        public Builder meta(ErrorMeta meta) {
            Utils.checkNotNull(meta, "meta");
            this.meta = Optional.ofNullable(meta);
            return this;
        }

        public Builder meta(Optional<? extends ErrorMeta> meta) {
            Utils.checkNotNull(meta, "meta");
            this.meta = meta;
            return this;
        }

        public Builder clerkTraceId(String clerkTraceId) {
            Utils.checkNotNull(clerkTraceId, "clerkTraceId");
            this.clerkTraceId = Optional.ofNullable(clerkTraceId);
            return this;
        }

        public Builder clerkTraceId(Optional<String> clerkTraceId) {
            Utils.checkNotNull(clerkTraceId, "clerkTraceId");
            this.clerkTraceId = clerkTraceId;
            return this;
        }
        
        public ErrorClerkError build() {
            return new ErrorClerkError(
                message,
                longMessage,
                code,
                meta,
                clerkTraceId);
        }
    }
}

