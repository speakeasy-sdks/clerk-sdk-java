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
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class ResponseBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("object")
    private Optional<String> object;

    /**
     * External account ID
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("external_account_id")
    private Optional<String> externalAccountId;

    /**
     * The unique ID of the user in the external provider's system
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("provider_user_id")
    private Optional<String> providerUserId;

    /**
     * The access token
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("token")
    private Optional<String> token;

    /**
     * The ID of the provider
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("provider")
    private Optional<String> provider;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("public_metadata")
    private Optional<? extends Map<String, Object>> publicMetadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("label")
    private JsonNullable<String> label;

    /**
     * The list of scopes that the token is valid for.
     * Only present for OAuth 2.0 tokens.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("scopes")
    private Optional<? extends List<String>> scopes;

    /**
     * The token secret. Only present for OAuth 1.0 tokens.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("token_secret")
    private Optional<String> tokenSecret;

    /**
     * Unix timestamp of the access token expiration.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expires_at")
    private JsonNullable<Long> expiresAt;

    @JsonCreator
    public ResponseBody(
            @JsonProperty("object") Optional<String> object,
            @JsonProperty("external_account_id") Optional<String> externalAccountId,
            @JsonProperty("provider_user_id") Optional<String> providerUserId,
            @JsonProperty("token") Optional<String> token,
            @JsonProperty("provider") Optional<String> provider,
            @JsonProperty("public_metadata") Optional<? extends Map<String, Object>> publicMetadata,
            @JsonProperty("label") JsonNullable<String> label,
            @JsonProperty("scopes") Optional<? extends List<String>> scopes,
            @JsonProperty("token_secret") Optional<String> tokenSecret,
            @JsonProperty("expires_at") JsonNullable<Long> expiresAt) {
        Utils.checkNotNull(object, "object");
        Utils.checkNotNull(externalAccountId, "externalAccountId");
        Utils.checkNotNull(providerUserId, "providerUserId");
        Utils.checkNotNull(token, "token");
        Utils.checkNotNull(provider, "provider");
        Utils.checkNotNull(publicMetadata, "publicMetadata");
        Utils.checkNotNull(label, "label");
        Utils.checkNotNull(scopes, "scopes");
        Utils.checkNotNull(tokenSecret, "tokenSecret");
        Utils.checkNotNull(expiresAt, "expiresAt");
        this.object = object;
        this.externalAccountId = externalAccountId;
        this.providerUserId = providerUserId;
        this.token = token;
        this.provider = provider;
        this.publicMetadata = publicMetadata;
        this.label = label;
        this.scopes = scopes;
        this.tokenSecret = tokenSecret;
        this.expiresAt = expiresAt;
    }
    
    public ResponseBody() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), JsonNullable.undefined());
    }

    @JsonIgnore
    public Optional<String> object() {
        return object;
    }

    /**
     * External account ID
     */
    @JsonIgnore
    public Optional<String> externalAccountId() {
        return externalAccountId;
    }

    /**
     * The unique ID of the user in the external provider's system
     */
    @JsonIgnore
    public Optional<String> providerUserId() {
        return providerUserId;
    }

    /**
     * The access token
     */
    @JsonIgnore
    public Optional<String> token() {
        return token;
    }

    /**
     * The ID of the provider
     */
    @JsonIgnore
    public Optional<String> provider() {
        return provider;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> publicMetadata() {
        return (Optional<Map<String, Object>>) publicMetadata;
    }

    @JsonIgnore
    public JsonNullable<String> label() {
        return label;
    }

    /**
     * The list of scopes that the token is valid for.
     * Only present for OAuth 2.0 tokens.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> scopes() {
        return (Optional<List<String>>) scopes;
    }

    /**
     * The token secret. Only present for OAuth 1.0 tokens.
     */
    @JsonIgnore
    public Optional<String> tokenSecret() {
        return tokenSecret;
    }

    /**
     * Unix timestamp of the access token expiration.
     */
    @JsonIgnore
    public JsonNullable<Long> expiresAt() {
        return expiresAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ResponseBody withObject(String object) {
        Utils.checkNotNull(object, "object");
        this.object = Optional.ofNullable(object);
        return this;
    }

    public ResponseBody withObject(Optional<String> object) {
        Utils.checkNotNull(object, "object");
        this.object = object;
        return this;
    }

    /**
     * External account ID
     */
    public ResponseBody withExternalAccountId(String externalAccountId) {
        Utils.checkNotNull(externalAccountId, "externalAccountId");
        this.externalAccountId = Optional.ofNullable(externalAccountId);
        return this;
    }

    /**
     * External account ID
     */
    public ResponseBody withExternalAccountId(Optional<String> externalAccountId) {
        Utils.checkNotNull(externalAccountId, "externalAccountId");
        this.externalAccountId = externalAccountId;
        return this;
    }

    /**
     * The unique ID of the user in the external provider's system
     */
    public ResponseBody withProviderUserId(String providerUserId) {
        Utils.checkNotNull(providerUserId, "providerUserId");
        this.providerUserId = Optional.ofNullable(providerUserId);
        return this;
    }

    /**
     * The unique ID of the user in the external provider's system
     */
    public ResponseBody withProviderUserId(Optional<String> providerUserId) {
        Utils.checkNotNull(providerUserId, "providerUserId");
        this.providerUserId = providerUserId;
        return this;
    }

    /**
     * The access token
     */
    public ResponseBody withToken(String token) {
        Utils.checkNotNull(token, "token");
        this.token = Optional.ofNullable(token);
        return this;
    }

    /**
     * The access token
     */
    public ResponseBody withToken(Optional<String> token) {
        Utils.checkNotNull(token, "token");
        this.token = token;
        return this;
    }

    /**
     * The ID of the provider
     */
    public ResponseBody withProvider(String provider) {
        Utils.checkNotNull(provider, "provider");
        this.provider = Optional.ofNullable(provider);
        return this;
    }

    /**
     * The ID of the provider
     */
    public ResponseBody withProvider(Optional<String> provider) {
        Utils.checkNotNull(provider, "provider");
        this.provider = provider;
        return this;
    }

    public ResponseBody withPublicMetadata(Map<String, Object> publicMetadata) {
        Utils.checkNotNull(publicMetadata, "publicMetadata");
        this.publicMetadata = Optional.ofNullable(publicMetadata);
        return this;
    }

    public ResponseBody withPublicMetadata(Optional<? extends Map<String, Object>> publicMetadata) {
        Utils.checkNotNull(publicMetadata, "publicMetadata");
        this.publicMetadata = publicMetadata;
        return this;
    }

    public ResponseBody withLabel(String label) {
        Utils.checkNotNull(label, "label");
        this.label = JsonNullable.of(label);
        return this;
    }

    public ResponseBody withLabel(JsonNullable<String> label) {
        Utils.checkNotNull(label, "label");
        this.label = label;
        return this;
    }

    /**
     * The list of scopes that the token is valid for.
     * Only present for OAuth 2.0 tokens.
     */
    public ResponseBody withScopes(List<String> scopes) {
        Utils.checkNotNull(scopes, "scopes");
        this.scopes = Optional.ofNullable(scopes);
        return this;
    }

    /**
     * The list of scopes that the token is valid for.
     * Only present for OAuth 2.0 tokens.
     */
    public ResponseBody withScopes(Optional<? extends List<String>> scopes) {
        Utils.checkNotNull(scopes, "scopes");
        this.scopes = scopes;
        return this;
    }

    /**
     * The token secret. Only present for OAuth 1.0 tokens.
     */
    public ResponseBody withTokenSecret(String tokenSecret) {
        Utils.checkNotNull(tokenSecret, "tokenSecret");
        this.tokenSecret = Optional.ofNullable(tokenSecret);
        return this;
    }

    /**
     * The token secret. Only present for OAuth 1.0 tokens.
     */
    public ResponseBody withTokenSecret(Optional<String> tokenSecret) {
        Utils.checkNotNull(tokenSecret, "tokenSecret");
        this.tokenSecret = tokenSecret;
        return this;
    }

    /**
     * Unix timestamp of the access token expiration.
     */
    public ResponseBody withExpiresAt(long expiresAt) {
        Utils.checkNotNull(expiresAt, "expiresAt");
        this.expiresAt = JsonNullable.of(expiresAt);
        return this;
    }

    /**
     * Unix timestamp of the access token expiration.
     */
    public ResponseBody withExpiresAt(JsonNullable<Long> expiresAt) {
        Utils.checkNotNull(expiresAt, "expiresAt");
        this.expiresAt = expiresAt;
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
        ResponseBody other = (ResponseBody) o;
        return 
            Objects.deepEquals(this.object, other.object) &&
            Objects.deepEquals(this.externalAccountId, other.externalAccountId) &&
            Objects.deepEquals(this.providerUserId, other.providerUserId) &&
            Objects.deepEquals(this.token, other.token) &&
            Objects.deepEquals(this.provider, other.provider) &&
            Objects.deepEquals(this.publicMetadata, other.publicMetadata) &&
            Objects.deepEquals(this.label, other.label) &&
            Objects.deepEquals(this.scopes, other.scopes) &&
            Objects.deepEquals(this.tokenSecret, other.tokenSecret) &&
            Objects.deepEquals(this.expiresAt, other.expiresAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            object,
            externalAccountId,
            providerUserId,
            token,
            provider,
            publicMetadata,
            label,
            scopes,
            tokenSecret,
            expiresAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ResponseBody.class,
                "object", object,
                "externalAccountId", externalAccountId,
                "providerUserId", providerUserId,
                "token", token,
                "provider", provider,
                "publicMetadata", publicMetadata,
                "label", label,
                "scopes", scopes,
                "tokenSecret", tokenSecret,
                "expiresAt", expiresAt);
    }
    
    public final static class Builder {
 
        private Optional<String> object = Optional.empty();
 
        private Optional<String> externalAccountId = Optional.empty();
 
        private Optional<String> providerUserId = Optional.empty();
 
        private Optional<String> token = Optional.empty();
 
        private Optional<String> provider = Optional.empty();
 
        private Optional<? extends Map<String, Object>> publicMetadata = Optional.empty();
 
        private JsonNullable<String> label = JsonNullable.undefined();
 
        private Optional<? extends List<String>> scopes = Optional.empty();
 
        private Optional<String> tokenSecret = Optional.empty();
 
        private JsonNullable<Long> expiresAt = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder object(String object) {
            Utils.checkNotNull(object, "object");
            this.object = Optional.ofNullable(object);
            return this;
        }

        public Builder object(Optional<String> object) {
            Utils.checkNotNull(object, "object");
            this.object = object;
            return this;
        }

        /**
         * External account ID
         */
        public Builder externalAccountId(String externalAccountId) {
            Utils.checkNotNull(externalAccountId, "externalAccountId");
            this.externalAccountId = Optional.ofNullable(externalAccountId);
            return this;
        }

        /**
         * External account ID
         */
        public Builder externalAccountId(Optional<String> externalAccountId) {
            Utils.checkNotNull(externalAccountId, "externalAccountId");
            this.externalAccountId = externalAccountId;
            return this;
        }

        /**
         * The unique ID of the user in the external provider's system
         */
        public Builder providerUserId(String providerUserId) {
            Utils.checkNotNull(providerUserId, "providerUserId");
            this.providerUserId = Optional.ofNullable(providerUserId);
            return this;
        }

        /**
         * The unique ID of the user in the external provider's system
         */
        public Builder providerUserId(Optional<String> providerUserId) {
            Utils.checkNotNull(providerUserId, "providerUserId");
            this.providerUserId = providerUserId;
            return this;
        }

        /**
         * The access token
         */
        public Builder token(String token) {
            Utils.checkNotNull(token, "token");
            this.token = Optional.ofNullable(token);
            return this;
        }

        /**
         * The access token
         */
        public Builder token(Optional<String> token) {
            Utils.checkNotNull(token, "token");
            this.token = token;
            return this;
        }

        /**
         * The ID of the provider
         */
        public Builder provider(String provider) {
            Utils.checkNotNull(provider, "provider");
            this.provider = Optional.ofNullable(provider);
            return this;
        }

        /**
         * The ID of the provider
         */
        public Builder provider(Optional<String> provider) {
            Utils.checkNotNull(provider, "provider");
            this.provider = provider;
            return this;
        }

        public Builder publicMetadata(Map<String, Object> publicMetadata) {
            Utils.checkNotNull(publicMetadata, "publicMetadata");
            this.publicMetadata = Optional.ofNullable(publicMetadata);
            return this;
        }

        public Builder publicMetadata(Optional<? extends Map<String, Object>> publicMetadata) {
            Utils.checkNotNull(publicMetadata, "publicMetadata");
            this.publicMetadata = publicMetadata;
            return this;
        }

        public Builder label(String label) {
            Utils.checkNotNull(label, "label");
            this.label = JsonNullable.of(label);
            return this;
        }

        public Builder label(JsonNullable<String> label) {
            Utils.checkNotNull(label, "label");
            this.label = label;
            return this;
        }

        /**
         * The list of scopes that the token is valid for.
         * Only present for OAuth 2.0 tokens.
         */
        public Builder scopes(List<String> scopes) {
            Utils.checkNotNull(scopes, "scopes");
            this.scopes = Optional.ofNullable(scopes);
            return this;
        }

        /**
         * The list of scopes that the token is valid for.
         * Only present for OAuth 2.0 tokens.
         */
        public Builder scopes(Optional<? extends List<String>> scopes) {
            Utils.checkNotNull(scopes, "scopes");
            this.scopes = scopes;
            return this;
        }

        /**
         * The token secret. Only present for OAuth 1.0 tokens.
         */
        public Builder tokenSecret(String tokenSecret) {
            Utils.checkNotNull(tokenSecret, "tokenSecret");
            this.tokenSecret = Optional.ofNullable(tokenSecret);
            return this;
        }

        /**
         * The token secret. Only present for OAuth 1.0 tokens.
         */
        public Builder tokenSecret(Optional<String> tokenSecret) {
            Utils.checkNotNull(tokenSecret, "tokenSecret");
            this.tokenSecret = tokenSecret;
            return this;
        }

        /**
         * Unix timestamp of the access token expiration.
         */
        public Builder expiresAt(long expiresAt) {
            Utils.checkNotNull(expiresAt, "expiresAt");
            this.expiresAt = JsonNullable.of(expiresAt);
            return this;
        }

        /**
         * Unix timestamp of the access token expiration.
         */
        public Builder expiresAt(JsonNullable<Long> expiresAt) {
            Utils.checkNotNull(expiresAt, "expiresAt");
            this.expiresAt = expiresAt;
            return this;
        }
        
        public ResponseBody build() {
            return new ResponseBody(
                object,
                externalAccountId,
                providerUserId,
                token,
                provider,
                publicMetadata,
                label,
                scopes,
                tokenSecret,
                expiresAt);
        }
    }
}

