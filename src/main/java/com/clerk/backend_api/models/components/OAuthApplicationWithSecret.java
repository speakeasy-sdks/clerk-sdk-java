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
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class OAuthApplicationWithSecret {

    @JsonProperty("object")
    private OAuthApplicationWithSecretObject object;

    @JsonProperty("id")
    private String id;

    @JsonProperty("instance_id")
    private String instanceId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("client_id")
    private String clientId;

    @JsonProperty("public")
    private boolean public_;

    @JsonProperty("scopes")
    private String scopes;

    @JsonProperty("callback_url")
    private String callbackUrl;

    @JsonProperty("authorize_url")
    private String authorizeUrl;

    @JsonProperty("token_fetch_url")
    private String tokenFetchUrl;

    @JsonProperty("user_info_url")
    private String userInfoUrl;

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

    /**
     * Empty if public client.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("client_secret")
    private Optional<String> clientSecret;

    @JsonCreator
    public OAuthApplicationWithSecret(
            @JsonProperty("object") OAuthApplicationWithSecretObject object,
            @JsonProperty("id") String id,
            @JsonProperty("instance_id") String instanceId,
            @JsonProperty("name") String name,
            @JsonProperty("client_id") String clientId,
            @JsonProperty("public") boolean public_,
            @JsonProperty("scopes") String scopes,
            @JsonProperty("callback_url") String callbackUrl,
            @JsonProperty("authorize_url") String authorizeUrl,
            @JsonProperty("token_fetch_url") String tokenFetchUrl,
            @JsonProperty("user_info_url") String userInfoUrl,
            @JsonProperty("created_at") long createdAt,
            @JsonProperty("updated_at") long updatedAt,
            @JsonProperty("client_secret") Optional<String> clientSecret) {
        Utils.checkNotNull(object, "object");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(instanceId, "instanceId");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(public_, "public_");
        Utils.checkNotNull(scopes, "scopes");
        Utils.checkNotNull(callbackUrl, "callbackUrl");
        Utils.checkNotNull(authorizeUrl, "authorizeUrl");
        Utils.checkNotNull(tokenFetchUrl, "tokenFetchUrl");
        Utils.checkNotNull(userInfoUrl, "userInfoUrl");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.object = object;
        this.id = id;
        this.instanceId = instanceId;
        this.name = name;
        this.clientId = clientId;
        this.public_ = public_;
        this.scopes = scopes;
        this.callbackUrl = callbackUrl;
        this.authorizeUrl = authorizeUrl;
        this.tokenFetchUrl = tokenFetchUrl;
        this.userInfoUrl = userInfoUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.clientSecret = clientSecret;
    }
    
    public OAuthApplicationWithSecret(
            OAuthApplicationWithSecretObject object,
            String id,
            String instanceId,
            String name,
            String clientId,
            boolean public_,
            String scopes,
            String callbackUrl,
            String authorizeUrl,
            String tokenFetchUrl,
            String userInfoUrl,
            long createdAt,
            long updatedAt) {
        this(object, id, instanceId, name, clientId, public_, scopes, callbackUrl, authorizeUrl, tokenFetchUrl, userInfoUrl, createdAt, updatedAt, Optional.empty());
    }

    @JsonIgnore
    public OAuthApplicationWithSecretObject object() {
        return object;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public String instanceId() {
        return instanceId;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    @JsonIgnore
    public boolean public_() {
        return public_;
    }

    @JsonIgnore
    public String scopes() {
        return scopes;
    }

    @JsonIgnore
    public String callbackUrl() {
        return callbackUrl;
    }

    @JsonIgnore
    public String authorizeUrl() {
        return authorizeUrl;
    }

    @JsonIgnore
    public String tokenFetchUrl() {
        return tokenFetchUrl;
    }

    @JsonIgnore
    public String userInfoUrl() {
        return userInfoUrl;
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

    /**
     * Empty if public client.
     * 
     */
    @JsonIgnore
    public Optional<String> clientSecret() {
        return clientSecret;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public OAuthApplicationWithSecret withObject(OAuthApplicationWithSecretObject object) {
        Utils.checkNotNull(object, "object");
        this.object = object;
        return this;
    }

    public OAuthApplicationWithSecret withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public OAuthApplicationWithSecret withInstanceId(String instanceId) {
        Utils.checkNotNull(instanceId, "instanceId");
        this.instanceId = instanceId;
        return this;
    }

    public OAuthApplicationWithSecret withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public OAuthApplicationWithSecret withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    public OAuthApplicationWithSecret withPublic(boolean public_) {
        Utils.checkNotNull(public_, "public_");
        this.public_ = public_;
        return this;
    }

    public OAuthApplicationWithSecret withScopes(String scopes) {
        Utils.checkNotNull(scopes, "scopes");
        this.scopes = scopes;
        return this;
    }

    public OAuthApplicationWithSecret withCallbackUrl(String callbackUrl) {
        Utils.checkNotNull(callbackUrl, "callbackUrl");
        this.callbackUrl = callbackUrl;
        return this;
    }

    public OAuthApplicationWithSecret withAuthorizeUrl(String authorizeUrl) {
        Utils.checkNotNull(authorizeUrl, "authorizeUrl");
        this.authorizeUrl = authorizeUrl;
        return this;
    }

    public OAuthApplicationWithSecret withTokenFetchUrl(String tokenFetchUrl) {
        Utils.checkNotNull(tokenFetchUrl, "tokenFetchUrl");
        this.tokenFetchUrl = tokenFetchUrl;
        return this;
    }

    public OAuthApplicationWithSecret withUserInfoUrl(String userInfoUrl) {
        Utils.checkNotNull(userInfoUrl, "userInfoUrl");
        this.userInfoUrl = userInfoUrl;
        return this;
    }

    /**
     * Unix timestamp of creation.
     * 
     */
    public OAuthApplicationWithSecret withCreatedAt(long createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Unix timestamp of last update.
     * 
     */
    public OAuthApplicationWithSecret withUpdatedAt(long updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Empty if public client.
     * 
     */
    public OAuthApplicationWithSecret withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = Optional.ofNullable(clientSecret);
        return this;
    }

    /**
     * Empty if public client.
     * 
     */
    public OAuthApplicationWithSecret withClientSecret(Optional<String> clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
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
        OAuthApplicationWithSecret other = (OAuthApplicationWithSecret) o;
        return 
            Objects.deepEquals(this.object, other.object) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.instanceId, other.instanceId) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.clientId, other.clientId) &&
            Objects.deepEquals(this.public_, other.public_) &&
            Objects.deepEquals(this.scopes, other.scopes) &&
            Objects.deepEquals(this.callbackUrl, other.callbackUrl) &&
            Objects.deepEquals(this.authorizeUrl, other.authorizeUrl) &&
            Objects.deepEquals(this.tokenFetchUrl, other.tokenFetchUrl) &&
            Objects.deepEquals(this.userInfoUrl, other.userInfoUrl) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            Objects.deepEquals(this.clientSecret, other.clientSecret);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            object,
            id,
            instanceId,
            name,
            clientId,
            public_,
            scopes,
            callbackUrl,
            authorizeUrl,
            tokenFetchUrl,
            userInfoUrl,
            createdAt,
            updatedAt,
            clientSecret);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OAuthApplicationWithSecret.class,
                "object", object,
                "id", id,
                "instanceId", instanceId,
                "name", name,
                "clientId", clientId,
                "public_", public_,
                "scopes", scopes,
                "callbackUrl", callbackUrl,
                "authorizeUrl", authorizeUrl,
                "tokenFetchUrl", tokenFetchUrl,
                "userInfoUrl", userInfoUrl,
                "createdAt", createdAt,
                "updatedAt", updatedAt,
                "clientSecret", clientSecret);
    }
    
    public final static class Builder {
 
        private OAuthApplicationWithSecretObject object;
 
        private String id;
 
        private String instanceId;
 
        private String name;
 
        private String clientId;
 
        private Boolean public_;
 
        private String scopes;
 
        private String callbackUrl;
 
        private String authorizeUrl;
 
        private String tokenFetchUrl;
 
        private String userInfoUrl;
 
        private Long createdAt;
 
        private Long updatedAt;
 
        private Optional<String> clientSecret = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder object(OAuthApplicationWithSecretObject object) {
            Utils.checkNotNull(object, "object");
            this.object = object;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder instanceId(String instanceId) {
            Utils.checkNotNull(instanceId, "instanceId");
            this.instanceId = instanceId;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        public Builder public_(boolean public_) {
            Utils.checkNotNull(public_, "public_");
            this.public_ = public_;
            return this;
        }

        public Builder scopes(String scopes) {
            Utils.checkNotNull(scopes, "scopes");
            this.scopes = scopes;
            return this;
        }

        public Builder callbackUrl(String callbackUrl) {
            Utils.checkNotNull(callbackUrl, "callbackUrl");
            this.callbackUrl = callbackUrl;
            return this;
        }

        public Builder authorizeUrl(String authorizeUrl) {
            Utils.checkNotNull(authorizeUrl, "authorizeUrl");
            this.authorizeUrl = authorizeUrl;
            return this;
        }

        public Builder tokenFetchUrl(String tokenFetchUrl) {
            Utils.checkNotNull(tokenFetchUrl, "tokenFetchUrl");
            this.tokenFetchUrl = tokenFetchUrl;
            return this;
        }

        public Builder userInfoUrl(String userInfoUrl) {
            Utils.checkNotNull(userInfoUrl, "userInfoUrl");
            this.userInfoUrl = userInfoUrl;
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

        /**
         * Empty if public client.
         * 
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = Optional.ofNullable(clientSecret);
            return this;
        }

        /**
         * Empty if public client.
         * 
         */
        public Builder clientSecret(Optional<String> clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }
        
        public OAuthApplicationWithSecret build() {
            return new OAuthApplicationWithSecret(
                object,
                id,
                instanceId,
                name,
                clientId,
                public_,
                scopes,
                callbackUrl,
                authorizeUrl,
                tokenFetchUrl,
                userInfoUrl,
                createdAt,
                updatedAt,
                clientSecret);
        }
    }
}

