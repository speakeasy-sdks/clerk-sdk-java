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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
/**
 * AllowlistIdentifier - Success
 */

public class AllowlistIdentifier {

    /**
     * String representing the object's type. Objects of the same type share the same value.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("object")
    private Optional<? extends AllowlistIdentifierObject> object;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("invitation_id")
    private Optional<String> invitationId;

    /**
     * An email address or a phone number.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("identifier")
    private Optional<String> identifier;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("identifier_type")
    private Optional<? extends IdentifierType> identifierType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("instance_id")
    private Optional<String> instanceId;

    /**
     * Unix timestamp of creation
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<Long> createdAt;

    /**
     * Unix timestamp of last update.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private Optional<Long> updatedAt;

    @JsonCreator
    public AllowlistIdentifier(
            @JsonProperty("object") Optional<? extends AllowlistIdentifierObject> object,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("invitation_id") Optional<String> invitationId,
            @JsonProperty("identifier") Optional<String> identifier,
            @JsonProperty("identifier_type") Optional<? extends IdentifierType> identifierType,
            @JsonProperty("instance_id") Optional<String> instanceId,
            @JsonProperty("created_at") Optional<Long> createdAt,
            @JsonProperty("updated_at") Optional<Long> updatedAt) {
        Utils.checkNotNull(object, "object");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(invitationId, "invitationId");
        Utils.checkNotNull(identifier, "identifier");
        Utils.checkNotNull(identifierType, "identifierType");
        Utils.checkNotNull(instanceId, "instanceId");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.object = object;
        this.id = id;
        this.invitationId = invitationId;
        this.identifier = identifier;
        this.identifierType = identifierType;
        this.instanceId = instanceId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    
    public AllowlistIdentifier() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * String representing the object's type. Objects of the same type share the same value.
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AllowlistIdentifierObject> object() {
        return (Optional<AllowlistIdentifierObject>) object;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> invitationId() {
        return invitationId;
    }

    /**
     * An email address or a phone number.
     * 
     */
    @JsonIgnore
    public Optional<String> identifier() {
        return identifier;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<IdentifierType> identifierType() {
        return (Optional<IdentifierType>) identifierType;
    }

    @JsonIgnore
    public Optional<String> instanceId() {
        return instanceId;
    }

    /**
     * Unix timestamp of creation
     * 
     */
    @JsonIgnore
    public Optional<Long> createdAt() {
        return createdAt;
    }

    /**
     * Unix timestamp of last update.
     * 
     */
    @JsonIgnore
    public Optional<Long> updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * String representing the object's type. Objects of the same type share the same value.
     * 
     */
    public AllowlistIdentifier withObject(AllowlistIdentifierObject object) {
        Utils.checkNotNull(object, "object");
        this.object = Optional.ofNullable(object);
        return this;
    }

    /**
     * String representing the object's type. Objects of the same type share the same value.
     * 
     */
    public AllowlistIdentifier withObject(Optional<? extends AllowlistIdentifierObject> object) {
        Utils.checkNotNull(object, "object");
        this.object = object;
        return this;
    }

    public AllowlistIdentifier withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public AllowlistIdentifier withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public AllowlistIdentifier withInvitationId(String invitationId) {
        Utils.checkNotNull(invitationId, "invitationId");
        this.invitationId = Optional.ofNullable(invitationId);
        return this;
    }

    public AllowlistIdentifier withInvitationId(Optional<String> invitationId) {
        Utils.checkNotNull(invitationId, "invitationId");
        this.invitationId = invitationId;
        return this;
    }

    /**
     * An email address or a phone number.
     * 
     */
    public AllowlistIdentifier withIdentifier(String identifier) {
        Utils.checkNotNull(identifier, "identifier");
        this.identifier = Optional.ofNullable(identifier);
        return this;
    }

    /**
     * An email address or a phone number.
     * 
     */
    public AllowlistIdentifier withIdentifier(Optional<String> identifier) {
        Utils.checkNotNull(identifier, "identifier");
        this.identifier = identifier;
        return this;
    }

    public AllowlistIdentifier withIdentifierType(IdentifierType identifierType) {
        Utils.checkNotNull(identifierType, "identifierType");
        this.identifierType = Optional.ofNullable(identifierType);
        return this;
    }

    public AllowlistIdentifier withIdentifierType(Optional<? extends IdentifierType> identifierType) {
        Utils.checkNotNull(identifierType, "identifierType");
        this.identifierType = identifierType;
        return this;
    }

    public AllowlistIdentifier withInstanceId(String instanceId) {
        Utils.checkNotNull(instanceId, "instanceId");
        this.instanceId = Optional.ofNullable(instanceId);
        return this;
    }

    public AllowlistIdentifier withInstanceId(Optional<String> instanceId) {
        Utils.checkNotNull(instanceId, "instanceId");
        this.instanceId = instanceId;
        return this;
    }

    /**
     * Unix timestamp of creation
     * 
     */
    public AllowlistIdentifier withCreatedAt(long createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    /**
     * Unix timestamp of creation
     * 
     */
    public AllowlistIdentifier withCreatedAt(Optional<Long> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Unix timestamp of last update.
     * 
     */
    public AllowlistIdentifier withUpdatedAt(long updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    /**
     * Unix timestamp of last update.
     * 
     */
    public AllowlistIdentifier withUpdatedAt(Optional<Long> updatedAt) {
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
        AllowlistIdentifier other = (AllowlistIdentifier) o;
        return 
            Objects.deepEquals(this.object, other.object) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.invitationId, other.invitationId) &&
            Objects.deepEquals(this.identifier, other.identifier) &&
            Objects.deepEquals(this.identifierType, other.identifierType) &&
            Objects.deepEquals(this.instanceId, other.instanceId) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            object,
            id,
            invitationId,
            identifier,
            identifierType,
            instanceId,
            createdAt,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AllowlistIdentifier.class,
                "object", object,
                "id", id,
                "invitationId", invitationId,
                "identifier", identifier,
                "identifierType", identifierType,
                "instanceId", instanceId,
                "createdAt", createdAt,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private Optional<? extends AllowlistIdentifierObject> object = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> invitationId = Optional.empty();
 
        private Optional<String> identifier = Optional.empty();
 
        private Optional<? extends IdentifierType> identifierType = Optional.empty();
 
        private Optional<String> instanceId = Optional.empty();
 
        private Optional<Long> createdAt = Optional.empty();
 
        private Optional<Long> updatedAt = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * String representing the object's type. Objects of the same type share the same value.
         * 
         */
        public Builder object(AllowlistIdentifierObject object) {
            Utils.checkNotNull(object, "object");
            this.object = Optional.ofNullable(object);
            return this;
        }

        /**
         * String representing the object's type. Objects of the same type share the same value.
         * 
         */
        public Builder object(Optional<? extends AllowlistIdentifierObject> object) {
            Utils.checkNotNull(object, "object");
            this.object = object;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder invitationId(String invitationId) {
            Utils.checkNotNull(invitationId, "invitationId");
            this.invitationId = Optional.ofNullable(invitationId);
            return this;
        }

        public Builder invitationId(Optional<String> invitationId) {
            Utils.checkNotNull(invitationId, "invitationId");
            this.invitationId = invitationId;
            return this;
        }

        /**
         * An email address or a phone number.
         * 
         */
        public Builder identifier(String identifier) {
            Utils.checkNotNull(identifier, "identifier");
            this.identifier = Optional.ofNullable(identifier);
            return this;
        }

        /**
         * An email address or a phone number.
         * 
         */
        public Builder identifier(Optional<String> identifier) {
            Utils.checkNotNull(identifier, "identifier");
            this.identifier = identifier;
            return this;
        }

        public Builder identifierType(IdentifierType identifierType) {
            Utils.checkNotNull(identifierType, "identifierType");
            this.identifierType = Optional.ofNullable(identifierType);
            return this;
        }

        public Builder identifierType(Optional<? extends IdentifierType> identifierType) {
            Utils.checkNotNull(identifierType, "identifierType");
            this.identifierType = identifierType;
            return this;
        }

        public Builder instanceId(String instanceId) {
            Utils.checkNotNull(instanceId, "instanceId");
            this.instanceId = Optional.ofNullable(instanceId);
            return this;
        }

        public Builder instanceId(Optional<String> instanceId) {
            Utils.checkNotNull(instanceId, "instanceId");
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Unix timestamp of creation
         * 
         */
        public Builder createdAt(long createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        /**
         * Unix timestamp of creation
         * 
         */
        public Builder createdAt(Optional<Long> createdAt) {
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
            this.updatedAt = Optional.ofNullable(updatedAt);
            return this;
        }

        /**
         * Unix timestamp of last update.
         * 
         */
        public Builder updatedAt(Optional<Long> updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }
        
        public AllowlistIdentifier build() {
            return new AllowlistIdentifier(
                object,
                id,
                invitationId,
                identifier,
                identifierType,
                instanceId,
                createdAt,
                updatedAt);
        }
    }
}

