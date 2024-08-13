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
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class UpdateJWTTemplateRequestBody {

    /**
     * JWT template name
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    /**
     * JWT template claims in JSON format
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("claims")
    private Optional<? extends UpdateJWTTemplateClaims> claims;

    /**
     * JWT token lifetime
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lifetime")
    private JsonNullable<Double> lifetime;

    /**
     * JWT token allowed clock skew
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allowed_clock_skew")
    private JsonNullable<Double> allowedClockSkew;

    /**
     * Whether a custom signing key/algorithm is also provided for this template
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_signing_key")
    private Optional<Boolean> customSigningKey;

    /**
     * The custom signing algorithm to use when minting JWTs
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("signing_algorithm")
    private JsonNullable<String> signingAlgorithm;

    /**
     * The custom signing private key to use when minting JWTs
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("signing_key")
    private JsonNullable<String> signingKey;

    @JsonCreator
    public UpdateJWTTemplateRequestBody(
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("claims") Optional<? extends UpdateJWTTemplateClaims> claims,
            @JsonProperty("lifetime") JsonNullable<Double> lifetime,
            @JsonProperty("allowed_clock_skew") JsonNullable<Double> allowedClockSkew,
            @JsonProperty("custom_signing_key") Optional<Boolean> customSigningKey,
            @JsonProperty("signing_algorithm") JsonNullable<String> signingAlgorithm,
            @JsonProperty("signing_key") JsonNullable<String> signingKey) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(claims, "claims");
        Utils.checkNotNull(lifetime, "lifetime");
        Utils.checkNotNull(allowedClockSkew, "allowedClockSkew");
        Utils.checkNotNull(customSigningKey, "customSigningKey");
        Utils.checkNotNull(signingAlgorithm, "signingAlgorithm");
        Utils.checkNotNull(signingKey, "signingKey");
        this.name = name;
        this.claims = claims;
        this.lifetime = lifetime;
        this.allowedClockSkew = allowedClockSkew;
        this.customSigningKey = customSigningKey;
        this.signingAlgorithm = signingAlgorithm;
        this.signingKey = signingKey;
    }
    
    public UpdateJWTTemplateRequestBody() {
        this(Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * JWT template name
     */
    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    /**
     * JWT template claims in JSON format
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<UpdateJWTTemplateClaims> claims() {
        return (Optional<UpdateJWTTemplateClaims>) claims;
    }

    /**
     * JWT token lifetime
     */
    @JsonIgnore
    public JsonNullable<Double> lifetime() {
        return lifetime;
    }

    /**
     * JWT token allowed clock skew
     */
    @JsonIgnore
    public JsonNullable<Double> allowedClockSkew() {
        return allowedClockSkew;
    }

    /**
     * Whether a custom signing key/algorithm is also provided for this template
     */
    @JsonIgnore
    public Optional<Boolean> customSigningKey() {
        return customSigningKey;
    }

    /**
     * The custom signing algorithm to use when minting JWTs
     */
    @JsonIgnore
    public JsonNullable<String> signingAlgorithm() {
        return signingAlgorithm;
    }

    /**
     * The custom signing private key to use when minting JWTs
     */
    @JsonIgnore
    public JsonNullable<String> signingKey() {
        return signingKey;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * JWT template name
     */
    public UpdateJWTTemplateRequestBody withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * JWT template name
     */
    public UpdateJWTTemplateRequestBody withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * JWT template claims in JSON format
     */
    public UpdateJWTTemplateRequestBody withClaims(UpdateJWTTemplateClaims claims) {
        Utils.checkNotNull(claims, "claims");
        this.claims = Optional.ofNullable(claims);
        return this;
    }

    /**
     * JWT template claims in JSON format
     */
    public UpdateJWTTemplateRequestBody withClaims(Optional<? extends UpdateJWTTemplateClaims> claims) {
        Utils.checkNotNull(claims, "claims");
        this.claims = claims;
        return this;
    }

    /**
     * JWT token lifetime
     */
    public UpdateJWTTemplateRequestBody withLifetime(double lifetime) {
        Utils.checkNotNull(lifetime, "lifetime");
        this.lifetime = JsonNullable.of(lifetime);
        return this;
    }

    /**
     * JWT token lifetime
     */
    public UpdateJWTTemplateRequestBody withLifetime(JsonNullable<Double> lifetime) {
        Utils.checkNotNull(lifetime, "lifetime");
        this.lifetime = lifetime;
        return this;
    }

    /**
     * JWT token allowed clock skew
     */
    public UpdateJWTTemplateRequestBody withAllowedClockSkew(double allowedClockSkew) {
        Utils.checkNotNull(allowedClockSkew, "allowedClockSkew");
        this.allowedClockSkew = JsonNullable.of(allowedClockSkew);
        return this;
    }

    /**
     * JWT token allowed clock skew
     */
    public UpdateJWTTemplateRequestBody withAllowedClockSkew(JsonNullable<Double> allowedClockSkew) {
        Utils.checkNotNull(allowedClockSkew, "allowedClockSkew");
        this.allowedClockSkew = allowedClockSkew;
        return this;
    }

    /**
     * Whether a custom signing key/algorithm is also provided for this template
     */
    public UpdateJWTTemplateRequestBody withCustomSigningKey(boolean customSigningKey) {
        Utils.checkNotNull(customSigningKey, "customSigningKey");
        this.customSigningKey = Optional.ofNullable(customSigningKey);
        return this;
    }

    /**
     * Whether a custom signing key/algorithm is also provided for this template
     */
    public UpdateJWTTemplateRequestBody withCustomSigningKey(Optional<Boolean> customSigningKey) {
        Utils.checkNotNull(customSigningKey, "customSigningKey");
        this.customSigningKey = customSigningKey;
        return this;
    }

    /**
     * The custom signing algorithm to use when minting JWTs
     */
    public UpdateJWTTemplateRequestBody withSigningAlgorithm(String signingAlgorithm) {
        Utils.checkNotNull(signingAlgorithm, "signingAlgorithm");
        this.signingAlgorithm = JsonNullable.of(signingAlgorithm);
        return this;
    }

    /**
     * The custom signing algorithm to use when minting JWTs
     */
    public UpdateJWTTemplateRequestBody withSigningAlgorithm(JsonNullable<String> signingAlgorithm) {
        Utils.checkNotNull(signingAlgorithm, "signingAlgorithm");
        this.signingAlgorithm = signingAlgorithm;
        return this;
    }

    /**
     * The custom signing private key to use when minting JWTs
     */
    public UpdateJWTTemplateRequestBody withSigningKey(String signingKey) {
        Utils.checkNotNull(signingKey, "signingKey");
        this.signingKey = JsonNullable.of(signingKey);
        return this;
    }

    /**
     * The custom signing private key to use when minting JWTs
     */
    public UpdateJWTTemplateRequestBody withSigningKey(JsonNullable<String> signingKey) {
        Utils.checkNotNull(signingKey, "signingKey");
        this.signingKey = signingKey;
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
        UpdateJWTTemplateRequestBody other = (UpdateJWTTemplateRequestBody) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.claims, other.claims) &&
            Objects.deepEquals(this.lifetime, other.lifetime) &&
            Objects.deepEquals(this.allowedClockSkew, other.allowedClockSkew) &&
            Objects.deepEquals(this.customSigningKey, other.customSigningKey) &&
            Objects.deepEquals(this.signingAlgorithm, other.signingAlgorithm) &&
            Objects.deepEquals(this.signingKey, other.signingKey);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            claims,
            lifetime,
            allowedClockSkew,
            customSigningKey,
            signingAlgorithm,
            signingKey);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateJWTTemplateRequestBody.class,
                "name", name,
                "claims", claims,
                "lifetime", lifetime,
                "allowedClockSkew", allowedClockSkew,
                "customSigningKey", customSigningKey,
                "signingAlgorithm", signingAlgorithm,
                "signingKey", signingKey);
    }
    
    public final static class Builder {
 
        private Optional<String> name = Optional.empty();
 
        private Optional<? extends UpdateJWTTemplateClaims> claims = Optional.empty();
 
        private JsonNullable<Double> lifetime = JsonNullable.undefined();
 
        private JsonNullable<Double> allowedClockSkew = JsonNullable.undefined();
 
        private Optional<Boolean> customSigningKey = Optional.empty();
 
        private JsonNullable<String> signingAlgorithm = JsonNullable.undefined();
 
        private JsonNullable<String> signingKey = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * JWT template name
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * JWT template name
         */
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * JWT template claims in JSON format
         */
        public Builder claims(UpdateJWTTemplateClaims claims) {
            Utils.checkNotNull(claims, "claims");
            this.claims = Optional.ofNullable(claims);
            return this;
        }

        /**
         * JWT template claims in JSON format
         */
        public Builder claims(Optional<? extends UpdateJWTTemplateClaims> claims) {
            Utils.checkNotNull(claims, "claims");
            this.claims = claims;
            return this;
        }

        /**
         * JWT token lifetime
         */
        public Builder lifetime(double lifetime) {
            Utils.checkNotNull(lifetime, "lifetime");
            this.lifetime = JsonNullable.of(lifetime);
            return this;
        }

        /**
         * JWT token lifetime
         */
        public Builder lifetime(JsonNullable<Double> lifetime) {
            Utils.checkNotNull(lifetime, "lifetime");
            this.lifetime = lifetime;
            return this;
        }

        /**
         * JWT token allowed clock skew
         */
        public Builder allowedClockSkew(double allowedClockSkew) {
            Utils.checkNotNull(allowedClockSkew, "allowedClockSkew");
            this.allowedClockSkew = JsonNullable.of(allowedClockSkew);
            return this;
        }

        /**
         * JWT token allowed clock skew
         */
        public Builder allowedClockSkew(JsonNullable<Double> allowedClockSkew) {
            Utils.checkNotNull(allowedClockSkew, "allowedClockSkew");
            this.allowedClockSkew = allowedClockSkew;
            return this;
        }

        /**
         * Whether a custom signing key/algorithm is also provided for this template
         */
        public Builder customSigningKey(boolean customSigningKey) {
            Utils.checkNotNull(customSigningKey, "customSigningKey");
            this.customSigningKey = Optional.ofNullable(customSigningKey);
            return this;
        }

        /**
         * Whether a custom signing key/algorithm is also provided for this template
         */
        public Builder customSigningKey(Optional<Boolean> customSigningKey) {
            Utils.checkNotNull(customSigningKey, "customSigningKey");
            this.customSigningKey = customSigningKey;
            return this;
        }

        /**
         * The custom signing algorithm to use when minting JWTs
         */
        public Builder signingAlgorithm(String signingAlgorithm) {
            Utils.checkNotNull(signingAlgorithm, "signingAlgorithm");
            this.signingAlgorithm = JsonNullable.of(signingAlgorithm);
            return this;
        }

        /**
         * The custom signing algorithm to use when minting JWTs
         */
        public Builder signingAlgorithm(JsonNullable<String> signingAlgorithm) {
            Utils.checkNotNull(signingAlgorithm, "signingAlgorithm");
            this.signingAlgorithm = signingAlgorithm;
            return this;
        }

        /**
         * The custom signing private key to use when minting JWTs
         */
        public Builder signingKey(String signingKey) {
            Utils.checkNotNull(signingKey, "signingKey");
            this.signingKey = JsonNullable.of(signingKey);
            return this;
        }

        /**
         * The custom signing private key to use when minting JWTs
         */
        public Builder signingKey(JsonNullable<String> signingKey) {
            Utils.checkNotNull(signingKey, "signingKey");
            this.signingKey = signingKey;
            return this;
        }
        
        public UpdateJWTTemplateRequestBody build() {
            return new UpdateJWTTemplateRequestBody(
                name,
                claims,
                lifetime,
                allowedClockSkew,
                customSigningKey,
                signingAlgorithm,
                signingKey);
        }
    }
}

