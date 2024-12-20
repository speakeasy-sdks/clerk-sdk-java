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
import org.openapitools.jackson.nullable.JsonNullable;


public class UpdateSignUpRequestBody {

    /**
     * The ID of the guest attempting to sign up as used in your external systems or your previous authentication solution.
     * This will be copied to the resulting user when the sign-up is completed.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("external_id")
    private JsonNullable<String> externalId;

    @JsonCreator
    public UpdateSignUpRequestBody(
            @JsonProperty("external_id") JsonNullable<String> externalId) {
        Utils.checkNotNull(externalId, "externalId");
        this.externalId = externalId;
    }
    
    public UpdateSignUpRequestBody() {
        this(JsonNullable.undefined());
    }

    /**
     * The ID of the guest attempting to sign up as used in your external systems or your previous authentication solution.
     * This will be copied to the resulting user when the sign-up is completed.
     */
    @JsonIgnore
    public JsonNullable<String> externalId() {
        return externalId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the guest attempting to sign up as used in your external systems or your previous authentication solution.
     * This will be copied to the resulting user when the sign-up is completed.
     */
    public UpdateSignUpRequestBody withExternalId(String externalId) {
        Utils.checkNotNull(externalId, "externalId");
        this.externalId = JsonNullable.of(externalId);
        return this;
    }

    /**
     * The ID of the guest attempting to sign up as used in your external systems or your previous authentication solution.
     * This will be copied to the resulting user when the sign-up is completed.
     */
    public UpdateSignUpRequestBody withExternalId(JsonNullable<String> externalId) {
        Utils.checkNotNull(externalId, "externalId");
        this.externalId = externalId;
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
        UpdateSignUpRequestBody other = (UpdateSignUpRequestBody) o;
        return 
            Objects.deepEquals(this.externalId, other.externalId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            externalId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateSignUpRequestBody.class,
                "externalId", externalId);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> externalId = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the guest attempting to sign up as used in your external systems or your previous authentication solution.
         * This will be copied to the resulting user when the sign-up is completed.
         */
        public Builder externalId(String externalId) {
            Utils.checkNotNull(externalId, "externalId");
            this.externalId = JsonNullable.of(externalId);
            return this;
        }

        /**
         * The ID of the guest attempting to sign up as used in your external systems or your previous authentication solution.
         * This will be copied to the resulting user when the sign-up is completed.
         */
        public Builder externalId(JsonNullable<String> externalId) {
            Utils.checkNotNull(externalId, "externalId");
            this.externalId = externalId;
            return this;
        }
        
        public UpdateSignUpRequestBody build() {
            return new UpdateSignUpRequestBody(
                externalId);
        }
    }
}

