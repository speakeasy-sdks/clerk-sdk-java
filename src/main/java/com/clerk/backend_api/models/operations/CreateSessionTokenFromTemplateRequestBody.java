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
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

public class CreateSessionTokenFromTemplateRequestBody {

    /**
     * Use this parameter to override the JWT token lifetime.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expires_in_seconds")
    private JsonNullable<Double> expiresInSeconds;

    @JsonCreator
    public CreateSessionTokenFromTemplateRequestBody(
            @JsonProperty("expires_in_seconds") JsonNullable<Double> expiresInSeconds) {
        Utils.checkNotNull(expiresInSeconds, "expiresInSeconds");
        this.expiresInSeconds = expiresInSeconds;
    }
    
    public CreateSessionTokenFromTemplateRequestBody() {
        this(JsonNullable.undefined());
    }

    /**
     * Use this parameter to override the JWT token lifetime.
     */
    @JsonIgnore
    public JsonNullable<Double> expiresInSeconds() {
        return expiresInSeconds;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Use this parameter to override the JWT token lifetime.
     */
    public CreateSessionTokenFromTemplateRequestBody withExpiresInSeconds(double expiresInSeconds) {
        Utils.checkNotNull(expiresInSeconds, "expiresInSeconds");
        this.expiresInSeconds = JsonNullable.of(expiresInSeconds);
        return this;
    }

    /**
     * Use this parameter to override the JWT token lifetime.
     */
    public CreateSessionTokenFromTemplateRequestBody withExpiresInSeconds(JsonNullable<Double> expiresInSeconds) {
        Utils.checkNotNull(expiresInSeconds, "expiresInSeconds");
        this.expiresInSeconds = expiresInSeconds;
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
        CreateSessionTokenFromTemplateRequestBody other = (CreateSessionTokenFromTemplateRequestBody) o;
        return 
            Objects.deepEquals(this.expiresInSeconds, other.expiresInSeconds);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            expiresInSeconds);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateSessionTokenFromTemplateRequestBody.class,
                "expiresInSeconds", expiresInSeconds);
    }
    
    public final static class Builder {
 
        private JsonNullable<Double> expiresInSeconds = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Use this parameter to override the JWT token lifetime.
         */
        public Builder expiresInSeconds(double expiresInSeconds) {
            Utils.checkNotNull(expiresInSeconds, "expiresInSeconds");
            this.expiresInSeconds = JsonNullable.of(expiresInSeconds);
            return this;
        }

        /**
         * Use this parameter to override the JWT token lifetime.
         */
        public Builder expiresInSeconds(JsonNullable<Double> expiresInSeconds) {
            Utils.checkNotNull(expiresInSeconds, "expiresInSeconds");
            this.expiresInSeconds = expiresInSeconds;
            return this;
        }
        
        public CreateSessionTokenFromTemplateRequestBody build() {
            return new CreateSessionTokenFromTemplateRequestBody(
                expiresInSeconds);
        }
    }
}

