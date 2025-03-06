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
import org.openapitools.jackson.nullable.JsonNullable;

public class UpdateSignUpRequestBody {

    /**
     * The ID of the guest attempting to sign up as used in your external systems or your previous authentication solution.
     * This will be copied to the resulting user when the sign-up is completed.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("external_id")
    private JsonNullable<String> externalId;

    /**
     * If true, the sign-up will be marked as a custom action.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_action")
    private JsonNullable<Boolean> customAction;

    @JsonCreator
    public UpdateSignUpRequestBody(
            @JsonProperty("external_id") JsonNullable<String> externalId,
            @JsonProperty("custom_action") JsonNullable<Boolean> customAction) {
        Utils.checkNotNull(externalId, "externalId");
        Utils.checkNotNull(customAction, "customAction");
        this.externalId = externalId;
        this.customAction = customAction;
    }
    
    public UpdateSignUpRequestBody() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The ID of the guest attempting to sign up as used in your external systems or your previous authentication solution.
     * This will be copied to the resulting user when the sign-up is completed.
     */
    @JsonIgnore
    public JsonNullable<String> externalId() {
        return externalId;
    }

    /**
     * If true, the sign-up will be marked as a custom action.
     */
    @JsonIgnore
    public JsonNullable<Boolean> customAction() {
        return customAction;
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

    /**
     * If true, the sign-up will be marked as a custom action.
     */
    public UpdateSignUpRequestBody withCustomAction(boolean customAction) {
        Utils.checkNotNull(customAction, "customAction");
        this.customAction = JsonNullable.of(customAction);
        return this;
    }

    /**
     * If true, the sign-up will be marked as a custom action.
     */
    public UpdateSignUpRequestBody withCustomAction(JsonNullable<Boolean> customAction) {
        Utils.checkNotNull(customAction, "customAction");
        this.customAction = customAction;
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
            Objects.deepEquals(this.externalId, other.externalId) &&
            Objects.deepEquals(this.customAction, other.customAction);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            externalId,
            customAction);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateSignUpRequestBody.class,
                "externalId", externalId,
                "customAction", customAction);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> externalId = JsonNullable.undefined();
 
        private JsonNullable<Boolean> customAction = JsonNullable.undefined();  
        
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

        /**
         * If true, the sign-up will be marked as a custom action.
         */
        public Builder customAction(boolean customAction) {
            Utils.checkNotNull(customAction, "customAction");
            this.customAction = JsonNullable.of(customAction);
            return this;
        }

        /**
         * If true, the sign-up will be marked as a custom action.
         */
        public Builder customAction(JsonNullable<Boolean> customAction) {
            Utils.checkNotNull(customAction, "customAction");
            this.customAction = customAction;
            return this;
        }
        
        public UpdateSignUpRequestBody build() {
            return new UpdateSignUpRequestBody(
                externalId,
                customAction);
        }
    }
}

