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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * InvitationRevoked - Success
 */

public class InvitationRevoked {

    @JsonProperty("object")
    private InvitationRevokedObject object;

    @JsonProperty("id")
    private String id;

    @JsonProperty("email_address")
    private String emailAddress;

    @JsonProperty("public_metadata")
    private Map<String, Object> publicMetadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("revoked")
    private Optional<Boolean> revoked;

    @JsonProperty("status")
    private InvitationRevokedStatus status;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url")
    private Optional<String> url;

    /**
     * Unix timestamp of expiration.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expires_at")
    private JsonNullable<Long> expiresAt;

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
    public InvitationRevoked(
            @JsonProperty("object") InvitationRevokedObject object,
            @JsonProperty("id") String id,
            @JsonProperty("email_address") String emailAddress,
            @JsonProperty("public_metadata") Map<String, Object> publicMetadata,
            @JsonProperty("revoked") Optional<Boolean> revoked,
            @JsonProperty("status") InvitationRevokedStatus status,
            @JsonProperty("url") Optional<String> url,
            @JsonProperty("expires_at") JsonNullable<Long> expiresAt,
            @JsonProperty("created_at") long createdAt,
            @JsonProperty("updated_at") long updatedAt) {
        Utils.checkNotNull(object, "object");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(emailAddress, "emailAddress");
        publicMetadata = Utils.emptyMapIfNull(publicMetadata);
        Utils.checkNotNull(revoked, "revoked");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(url, "url");
        Utils.checkNotNull(expiresAt, "expiresAt");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.object = object;
        this.id = id;
        this.emailAddress = emailAddress;
        this.publicMetadata = publicMetadata;
        this.revoked = revoked;
        this.status = status;
        this.url = url;
        this.expiresAt = expiresAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    
    public InvitationRevoked(
            InvitationRevokedObject object,
            String id,
            String emailAddress,
            Map<String, Object> publicMetadata,
            InvitationRevokedStatus status,
            long createdAt,
            long updatedAt) {
        this(object, id, emailAddress, publicMetadata, Optional.empty(), status, Optional.empty(), JsonNullable.undefined(), createdAt, updatedAt);
    }

    @JsonIgnore
    public InvitationRevokedObject object() {
        return object;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public String emailAddress() {
        return emailAddress;
    }

    @JsonIgnore
    public Map<String, Object> publicMetadata() {
        return publicMetadata;
    }

    @JsonIgnore
    public Optional<Boolean> revoked() {
        return revoked;
    }

    @JsonIgnore
    public InvitationRevokedStatus status() {
        return status;
    }

    @JsonIgnore
    public Optional<String> url() {
        return url;
    }

    /**
     * Unix timestamp of expiration.
     * 
     */
    @JsonIgnore
    public JsonNullable<Long> expiresAt() {
        return expiresAt;
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

    public InvitationRevoked withObject(InvitationRevokedObject object) {
        Utils.checkNotNull(object, "object");
        this.object = object;
        return this;
    }

    public InvitationRevoked withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public InvitationRevoked withEmailAddress(String emailAddress) {
        Utils.checkNotNull(emailAddress, "emailAddress");
        this.emailAddress = emailAddress;
        return this;
    }

    public InvitationRevoked withPublicMetadata(Map<String, Object> publicMetadata) {
        Utils.checkNotNull(publicMetadata, "publicMetadata");
        this.publicMetadata = publicMetadata;
        return this;
    }

    public InvitationRevoked withRevoked(boolean revoked) {
        Utils.checkNotNull(revoked, "revoked");
        this.revoked = Optional.ofNullable(revoked);
        return this;
    }

    public InvitationRevoked withRevoked(Optional<Boolean> revoked) {
        Utils.checkNotNull(revoked, "revoked");
        this.revoked = revoked;
        return this;
    }

    public InvitationRevoked withStatus(InvitationRevokedStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public InvitationRevoked withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = Optional.ofNullable(url);
        return this;
    }

    public InvitationRevoked withUrl(Optional<String> url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
        return this;
    }

    /**
     * Unix timestamp of expiration.
     * 
     */
    public InvitationRevoked withExpiresAt(long expiresAt) {
        Utils.checkNotNull(expiresAt, "expiresAt");
        this.expiresAt = JsonNullable.of(expiresAt);
        return this;
    }

    /**
     * Unix timestamp of expiration.
     * 
     */
    public InvitationRevoked withExpiresAt(JsonNullable<Long> expiresAt) {
        Utils.checkNotNull(expiresAt, "expiresAt");
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     * Unix timestamp of creation.
     * 
     */
    public InvitationRevoked withCreatedAt(long createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Unix timestamp of last update.
     * 
     */
    public InvitationRevoked withUpdatedAt(long updatedAt) {
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
        InvitationRevoked other = (InvitationRevoked) o;
        return 
            Objects.deepEquals(this.object, other.object) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.emailAddress, other.emailAddress) &&
            Objects.deepEquals(this.publicMetadata, other.publicMetadata) &&
            Objects.deepEquals(this.revoked, other.revoked) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.url, other.url) &&
            Objects.deepEquals(this.expiresAt, other.expiresAt) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            object,
            id,
            emailAddress,
            publicMetadata,
            revoked,
            status,
            url,
            expiresAt,
            createdAt,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(InvitationRevoked.class,
                "object", object,
                "id", id,
                "emailAddress", emailAddress,
                "publicMetadata", publicMetadata,
                "revoked", revoked,
                "status", status,
                "url", url,
                "expiresAt", expiresAt,
                "createdAt", createdAt,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private InvitationRevokedObject object;
 
        private String id;
 
        private String emailAddress;
 
        private Map<String, Object> publicMetadata;
 
        private Optional<Boolean> revoked = Optional.empty();
 
        private InvitationRevokedStatus status;
 
        private Optional<String> url = Optional.empty();
 
        private JsonNullable<Long> expiresAt = JsonNullable.undefined();
 
        private Long createdAt;
 
        private Long updatedAt;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder object(InvitationRevokedObject object) {
            Utils.checkNotNull(object, "object");
            this.object = object;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder emailAddress(String emailAddress) {
            Utils.checkNotNull(emailAddress, "emailAddress");
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder publicMetadata(Map<String, Object> publicMetadata) {
            Utils.checkNotNull(publicMetadata, "publicMetadata");
            this.publicMetadata = publicMetadata;
            return this;
        }

        public Builder revoked(boolean revoked) {
            Utils.checkNotNull(revoked, "revoked");
            this.revoked = Optional.ofNullable(revoked);
            return this;
        }

        public Builder revoked(Optional<Boolean> revoked) {
            Utils.checkNotNull(revoked, "revoked");
            this.revoked = revoked;
            return this;
        }

        public Builder status(InvitationRevokedStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = Optional.ofNullable(url);
            return this;
        }

        public Builder url(Optional<String> url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }

        /**
         * Unix timestamp of expiration.
         * 
         */
        public Builder expiresAt(long expiresAt) {
            Utils.checkNotNull(expiresAt, "expiresAt");
            this.expiresAt = JsonNullable.of(expiresAt);
            return this;
        }

        /**
         * Unix timestamp of expiration.
         * 
         */
        public Builder expiresAt(JsonNullable<Long> expiresAt) {
            Utils.checkNotNull(expiresAt, "expiresAt");
            this.expiresAt = expiresAt;
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
        
        public InvitationRevoked build() {
            return new InvitationRevoked(
                object,
                id,
                emailAddress,
                publicMetadata,
                revoked,
                status,
                url,
                expiresAt,
                createdAt,
                updatedAt);
        }
    }
}

