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
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * VerifyClientRequestBody - Parameters.
 */

public class VerifyClientRequestBody {

    /**
     * A JWT Token that represents the active client.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("token")
    private Optional<String> token;

    @JsonCreator
    public VerifyClientRequestBody(
            @JsonProperty("token") Optional<String> token) {
        Utils.checkNotNull(token, "token");
        this.token = token;
    }
    
    public VerifyClientRequestBody() {
        this(Optional.empty());
    }

    /**
     * A JWT Token that represents the active client.
     */
    @JsonIgnore
    public Optional<String> token() {
        return token;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A JWT Token that represents the active client.
     */
    public VerifyClientRequestBody withToken(String token) {
        Utils.checkNotNull(token, "token");
        this.token = Optional.ofNullable(token);
        return this;
    }

    /**
     * A JWT Token that represents the active client.
     */
    public VerifyClientRequestBody withToken(Optional<String> token) {
        Utils.checkNotNull(token, "token");
        this.token = token;
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
        VerifyClientRequestBody other = (VerifyClientRequestBody) o;
        return 
            Objects.deepEquals(this.token, other.token);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            token);
    }
    
    @Override
    public String toString() {
        return Utils.toString(VerifyClientRequestBody.class,
                "token", token);
    }
    
    public final static class Builder {
 
        private Optional<String> token = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A JWT Token that represents the active client.
         */
        public Builder token(String token) {
            Utils.checkNotNull(token, "token");
            this.token = Optional.ofNullable(token);
            return this;
        }

        /**
         * A JWT Token that represents the active client.
         */
        public Builder token(Optional<String> token) {
            Utils.checkNotNull(token, "token");
            this.token = token;
            return this;
        }
        
        public VerifyClientRequestBody build() {
            return new VerifyClientRequestBody(
                token);
        }
    }
}

