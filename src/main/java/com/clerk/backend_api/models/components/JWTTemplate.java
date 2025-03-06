/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.clerk.backend_api.models.components;
import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
/**
 * JWTTemplate - List of JWT templates
 */

public class JWTTemplate {

    @JsonProperty("object")
    private JWTTemplateObject object;

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("claims")
    private Claims claims;

    @JsonProperty("lifetime")
    private long lifetime;

    @JsonProperty("allowed_clock_skew")
    private long allowedClockSkew;

    @JsonProperty("custom_signing_key")
    private boolean customSigningKey;

    @JsonProperty("signing_algorithm")
    private String signingAlgorithm;

    /**
     * Unix timestamp of creation.
     * 
     */
    @JsonProperty("created_at")
    private long createdAt;

    /**
     * Unix timestamp of last update.
     * 
     */
    @JsonProperty("updated_at")
    private long updatedAt;

    @JsonCreator
    public JWTTemplate(
            @JsonProperty("object") JWTTemplateObject object,
            @JsonProperty("id") String id,
            @JsonProperty("name") String name,
            @JsonProperty("claims") Claims claims,
            @JsonProperty("lifetime") long lifetime,
            @JsonProperty("allowed_clock_skew") long allowedClockSkew,
            @JsonProperty("custom_signing_key") boolean customSigningKey,
            @JsonProperty("signing_algorithm") String signingAlgorithm,
            @JsonProperty("created_at") long createdAt,
            @JsonProperty("updated_at") long updatedAt) {
        Utils.checkNotNull(object, "object");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(claims, "claims");
        Utils.checkNotNull(lifetime, "lifetime");
        Utils.checkNotNull(allowedClockSkew, "allowedClockSkew");
        Utils.checkNotNull(customSigningKey, "customSigningKey");
        Utils.checkNotNull(signingAlgorithm, "signingAlgorithm");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.object = object;
        this.id = id;
        this.name = name;
        this.claims = claims;
        this.lifetime = lifetime;
        this.allowedClockSkew = allowedClockSkew;
        this.customSigningKey = customSigningKey;
        this.signingAlgorithm = signingAlgorithm;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @JsonIgnore
    public JWTTemplateObject object() {
        return object;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public Claims claims() {
        return claims;
    }

    @JsonIgnore
    public long lifetime() {
        return lifetime;
    }

    @JsonIgnore
    public long allowedClockSkew() {
        return allowedClockSkew;
    }

    @JsonIgnore
    public boolean customSigningKey() {
        return customSigningKey;
    }

    @JsonIgnore
    public String signingAlgorithm() {
        return signingAlgorithm;
    }

    /**
     * Unix timestamp of creation.
     * 
     */
    @JsonIgnore
    public long createdAt() {
        return createdAt;
    }

    /**
     * Unix timestamp of last update.
     * 
     */
    @JsonIgnore
    public long updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public JWTTemplate withObject(JWTTemplateObject object) {
        Utils.checkNotNull(object, "object");
        this.object = object;
        return this;
    }

    public JWTTemplate withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public JWTTemplate withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public JWTTemplate withClaims(Claims claims) {
        Utils.checkNotNull(claims, "claims");
        this.claims = claims;
        return this;
    }

    public JWTTemplate withLifetime(long lifetime) {
        Utils.checkNotNull(lifetime, "lifetime");
        this.lifetime = lifetime;
        return this;
    }

    public JWTTemplate withAllowedClockSkew(long allowedClockSkew) {
        Utils.checkNotNull(allowedClockSkew, "allowedClockSkew");
        this.allowedClockSkew = allowedClockSkew;
        return this;
    }

    public JWTTemplate withCustomSigningKey(boolean customSigningKey) {
        Utils.checkNotNull(customSigningKey, "customSigningKey");
        this.customSigningKey = customSigningKey;
        return this;
    }

    public JWTTemplate withSigningAlgorithm(String signingAlgorithm) {
        Utils.checkNotNull(signingAlgorithm, "signingAlgorithm");
        this.signingAlgorithm = signingAlgorithm;
        return this;
    }

    /**
     * Unix timestamp of creation.
     * 
     */
    public JWTTemplate withCreatedAt(long createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Unix timestamp of last update.
     * 
     */
    public JWTTemplate withUpdatedAt(long updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
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
        JWTTemplate other = (JWTTemplate) o;
        return 
            Objects.deepEquals(this.object, other.object) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.claims, other.claims) &&
            Objects.deepEquals(this.lifetime, other.lifetime) &&
            Objects.deepEquals(this.allowedClockSkew, other.allowedClockSkew) &&
            Objects.deepEquals(this.customSigningKey, other.customSigningKey) &&
            Objects.deepEquals(this.signingAlgorithm, other.signingAlgorithm) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            object,
            id,
            name,
            claims,
            lifetime,
            allowedClockSkew,
            customSigningKey,
            signingAlgorithm,
            createdAt,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(JWTTemplate.class,
                "object", object,
                "id", id,
                "name", name,
                "claims", claims,
                "lifetime", lifetime,
                "allowedClockSkew", allowedClockSkew,
                "customSigningKey", customSigningKey,
                "signingAlgorithm", signingAlgorithm,
                "createdAt", createdAt,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private JWTTemplateObject object;
 
        private String id;
 
        private String name;
 
        private Claims claims;
 
        private Long lifetime;
 
        private Long allowedClockSkew;
 
        private Boolean customSigningKey;
 
        private String signingAlgorithm;
 
        private Long createdAt;
 
        private Long updatedAt;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder object(JWTTemplateObject object) {
            Utils.checkNotNull(object, "object");
            this.object = object;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder claims(Claims claims) {
            Utils.checkNotNull(claims, "claims");
            this.claims = claims;
            return this;
        }

        public Builder lifetime(long lifetime) {
            Utils.checkNotNull(lifetime, "lifetime");
            this.lifetime = lifetime;
            return this;
        }

        public Builder allowedClockSkew(long allowedClockSkew) {
            Utils.checkNotNull(allowedClockSkew, "allowedClockSkew");
            this.allowedClockSkew = allowedClockSkew;
            return this;
        }

        public Builder customSigningKey(boolean customSigningKey) {
            Utils.checkNotNull(customSigningKey, "customSigningKey");
            this.customSigningKey = customSigningKey;
            return this;
        }

        public Builder signingAlgorithm(String signingAlgorithm) {
            Utils.checkNotNull(signingAlgorithm, "signingAlgorithm");
            this.signingAlgorithm = signingAlgorithm;
            return this;
        }

        /**
         * Unix timestamp of creation.
         * 
         */
        public Builder createdAt(long createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Unix timestamp of last update.
         * 
         */
        public Builder updatedAt(long updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }
        
        public JWTTemplate build() {
            return new JWTTemplate(
                object,
                id,
                name,
                claims,
                lifetime,
                allowedClockSkew,
                customSigningKey,
                signingAlgorithm,
                createdAt,
                updatedAt);
        }
    }
}

