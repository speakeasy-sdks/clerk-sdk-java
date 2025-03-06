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

public class UpdateEmailAddressRequestBody {

    /**
     * The email address will be marked as verified.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("verified")
    private JsonNullable<Boolean> verified;

    /**
     * Set this email address as the primary email address for the user.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("primary")
    private JsonNullable<Boolean> primary;

    @JsonCreator
    public UpdateEmailAddressRequestBody(
            @JsonProperty("verified") JsonNullable<Boolean> verified,
            @JsonProperty("primary") JsonNullable<Boolean> primary) {
        Utils.checkNotNull(verified, "verified");
        Utils.checkNotNull(primary, "primary");
        this.verified = verified;
        this.primary = primary;
    }
    
    public UpdateEmailAddressRequestBody() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The email address will be marked as verified.
     */
    @JsonIgnore
    public JsonNullable<Boolean> verified() {
        return verified;
    }

    /**
     * Set this email address as the primary email address for the user.
     */
    @JsonIgnore
    public JsonNullable<Boolean> primary() {
        return primary;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The email address will be marked as verified.
     */
    public UpdateEmailAddressRequestBody withVerified(boolean verified) {
        Utils.checkNotNull(verified, "verified");
        this.verified = JsonNullable.of(verified);
        return this;
    }

    /**
     * The email address will be marked as verified.
     */
    public UpdateEmailAddressRequestBody withVerified(JsonNullable<Boolean> verified) {
        Utils.checkNotNull(verified, "verified");
        this.verified = verified;
        return this;
    }

    /**
     * Set this email address as the primary email address for the user.
     */
    public UpdateEmailAddressRequestBody withPrimary(boolean primary) {
        Utils.checkNotNull(primary, "primary");
        this.primary = JsonNullable.of(primary);
        return this;
    }

    /**
     * Set this email address as the primary email address for the user.
     */
    public UpdateEmailAddressRequestBody withPrimary(JsonNullable<Boolean> primary) {
        Utils.checkNotNull(primary, "primary");
        this.primary = primary;
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
        UpdateEmailAddressRequestBody other = (UpdateEmailAddressRequestBody) o;
        return 
            Objects.deepEquals(this.verified, other.verified) &&
            Objects.deepEquals(this.primary, other.primary);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            verified,
            primary);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateEmailAddressRequestBody.class,
                "verified", verified,
                "primary", primary);
    }
    
    public final static class Builder {
 
        private JsonNullable<Boolean> verified = JsonNullable.undefined();
 
        private JsonNullable<Boolean> primary = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The email address will be marked as verified.
         */
        public Builder verified(boolean verified) {
            Utils.checkNotNull(verified, "verified");
            this.verified = JsonNullable.of(verified);
            return this;
        }

        /**
         * The email address will be marked as verified.
         */
        public Builder verified(JsonNullable<Boolean> verified) {
            Utils.checkNotNull(verified, "verified");
            this.verified = verified;
            return this;
        }

        /**
         * Set this email address as the primary email address for the user.
         */
        public Builder primary(boolean primary) {
            Utils.checkNotNull(primary, "primary");
            this.primary = JsonNullable.of(primary);
            return this;
        }

        /**
         * Set this email address as the primary email address for the user.
         */
        public Builder primary(JsonNullable<Boolean> primary) {
            Utils.checkNotNull(primary, "primary");
            this.primary = primary;
            return this;
        }
        
        public UpdateEmailAddressRequestBody build() {
            return new UpdateEmailAddressRequestBody(
                verified,
                primary);
        }
    }
}

