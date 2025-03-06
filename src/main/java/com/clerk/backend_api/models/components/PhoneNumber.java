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
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * PhoneNumber - Success
 */

public class PhoneNumber {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * String representing the object's type. Objects of the same type share the same value.
     * 
     */
    @JsonProperty("object")
    private PhoneNumberObject object;

    @JsonProperty("phone_number")
    private String phoneNumber;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reserved_for_second_factor")
    private Optional<Boolean> reservedForSecondFactor;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("default_second_factor")
    private Optional<Boolean> defaultSecondFactor;

    @JsonProperty("reserved")
    private boolean reserved;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("verification")
    private Optional<? extends PhoneNumberVerification> verification;

    @JsonProperty("linked_to")
    private List<IdentificationLink> linkedTo;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("backup_codes")
    private JsonNullable<? extends List<String>> backupCodes;

    /**
     * Unix timestamp of creation
     * 
     */
    @JsonProperty("created_at")
    private long createdAt;

    /**
     * Unix timestamp of creation
     * 
     */
    @JsonProperty("updated_at")
    private long updatedAt;

    @JsonCreator
    public PhoneNumber(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("object") PhoneNumberObject object,
            @JsonProperty("phone_number") String phoneNumber,
            @JsonProperty("reserved_for_second_factor") Optional<Boolean> reservedForSecondFactor,
            @JsonProperty("default_second_factor") Optional<Boolean> defaultSecondFactor,
            @JsonProperty("reserved") boolean reserved,
            @JsonProperty("verification") Optional<? extends PhoneNumberVerification> verification,
            @JsonProperty("linked_to") List<IdentificationLink> linkedTo,
            @JsonProperty("backup_codes") JsonNullable<? extends List<String>> backupCodes,
            @JsonProperty("created_at") long createdAt,
            @JsonProperty("updated_at") long updatedAt) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(object, "object");
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        Utils.checkNotNull(reservedForSecondFactor, "reservedForSecondFactor");
        Utils.checkNotNull(defaultSecondFactor, "defaultSecondFactor");
        Utils.checkNotNull(reserved, "reserved");
        Utils.checkNotNull(verification, "verification");
        Utils.checkNotNull(linkedTo, "linkedTo");
        Utils.checkNotNull(backupCodes, "backupCodes");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.id = id;
        this.object = object;
        this.phoneNumber = phoneNumber;
        this.reservedForSecondFactor = reservedForSecondFactor;
        this.defaultSecondFactor = defaultSecondFactor;
        this.reserved = reserved;
        this.verification = verification;
        this.linkedTo = linkedTo;
        this.backupCodes = backupCodes;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    
    public PhoneNumber(
            PhoneNumberObject object,
            String phoneNumber,
            boolean reserved,
            List<IdentificationLink> linkedTo,
            long createdAt,
            long updatedAt) {
        this(Optional.empty(), object, phoneNumber, Optional.empty(), Optional.empty(), reserved, Optional.empty(), linkedTo, JsonNullable.undefined(), createdAt, updatedAt);
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * String representing the object's type. Objects of the same type share the same value.
     * 
     */
    @JsonIgnore
    public PhoneNumberObject object() {
        return object;
    }

    @JsonIgnore
    public String phoneNumber() {
        return phoneNumber;
    }

    @JsonIgnore
    public Optional<Boolean> reservedForSecondFactor() {
        return reservedForSecondFactor;
    }

    @JsonIgnore
    public Optional<Boolean> defaultSecondFactor() {
        return defaultSecondFactor;
    }

    @JsonIgnore
    public boolean reserved() {
        return reserved;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PhoneNumberVerification> verification() {
        return (Optional<PhoneNumberVerification>) verification;
    }

    @JsonIgnore
    public List<IdentificationLink> linkedTo() {
        return linkedTo;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<String>> backupCodes() {
        return (JsonNullable<List<String>>) backupCodes;
    }

    /**
     * Unix timestamp of creation
     * 
     */
    @JsonIgnore
    public long createdAt() {
        return createdAt;
    }

    /**
     * Unix timestamp of creation
     * 
     */
    @JsonIgnore
    public long updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PhoneNumber withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public PhoneNumber withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * String representing the object's type. Objects of the same type share the same value.
     * 
     */
    public PhoneNumber withObject(PhoneNumberObject object) {
        Utils.checkNotNull(object, "object");
        this.object = object;
        return this;
    }

    public PhoneNumber withPhoneNumber(String phoneNumber) {
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        this.phoneNumber = phoneNumber;
        return this;
    }

    public PhoneNumber withReservedForSecondFactor(boolean reservedForSecondFactor) {
        Utils.checkNotNull(reservedForSecondFactor, "reservedForSecondFactor");
        this.reservedForSecondFactor = Optional.ofNullable(reservedForSecondFactor);
        return this;
    }

    public PhoneNumber withReservedForSecondFactor(Optional<Boolean> reservedForSecondFactor) {
        Utils.checkNotNull(reservedForSecondFactor, "reservedForSecondFactor");
        this.reservedForSecondFactor = reservedForSecondFactor;
        return this;
    }

    public PhoneNumber withDefaultSecondFactor(boolean defaultSecondFactor) {
        Utils.checkNotNull(defaultSecondFactor, "defaultSecondFactor");
        this.defaultSecondFactor = Optional.ofNullable(defaultSecondFactor);
        return this;
    }

    public PhoneNumber withDefaultSecondFactor(Optional<Boolean> defaultSecondFactor) {
        Utils.checkNotNull(defaultSecondFactor, "defaultSecondFactor");
        this.defaultSecondFactor = defaultSecondFactor;
        return this;
    }

    public PhoneNumber withReserved(boolean reserved) {
        Utils.checkNotNull(reserved, "reserved");
        this.reserved = reserved;
        return this;
    }

    public PhoneNumber withVerification(PhoneNumberVerification verification) {
        Utils.checkNotNull(verification, "verification");
        this.verification = Optional.ofNullable(verification);
        return this;
    }

    public PhoneNumber withVerification(Optional<? extends PhoneNumberVerification> verification) {
        Utils.checkNotNull(verification, "verification");
        this.verification = verification;
        return this;
    }

    public PhoneNumber withLinkedTo(List<IdentificationLink> linkedTo) {
        Utils.checkNotNull(linkedTo, "linkedTo");
        this.linkedTo = linkedTo;
        return this;
    }

    public PhoneNumber withBackupCodes(List<String> backupCodes) {
        Utils.checkNotNull(backupCodes, "backupCodes");
        this.backupCodes = JsonNullable.of(backupCodes);
        return this;
    }

    public PhoneNumber withBackupCodes(JsonNullable<? extends List<String>> backupCodes) {
        Utils.checkNotNull(backupCodes, "backupCodes");
        this.backupCodes = backupCodes;
        return this;
    }

    /**
     * Unix timestamp of creation
     * 
     */
    public PhoneNumber withCreatedAt(long createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Unix timestamp of creation
     * 
     */
    public PhoneNumber withUpdatedAt(long updatedAt) {
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
        PhoneNumber other = (PhoneNumber) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.object, other.object) &&
            Objects.deepEquals(this.phoneNumber, other.phoneNumber) &&
            Objects.deepEquals(this.reservedForSecondFactor, other.reservedForSecondFactor) &&
            Objects.deepEquals(this.defaultSecondFactor, other.defaultSecondFactor) &&
            Objects.deepEquals(this.reserved, other.reserved) &&
            Objects.deepEquals(this.verification, other.verification) &&
            Objects.deepEquals(this.linkedTo, other.linkedTo) &&
            Objects.deepEquals(this.backupCodes, other.backupCodes) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            object,
            phoneNumber,
            reservedForSecondFactor,
            defaultSecondFactor,
            reserved,
            verification,
            linkedTo,
            backupCodes,
            createdAt,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PhoneNumber.class,
                "id", id,
                "object", object,
                "phoneNumber", phoneNumber,
                "reservedForSecondFactor", reservedForSecondFactor,
                "defaultSecondFactor", defaultSecondFactor,
                "reserved", reserved,
                "verification", verification,
                "linkedTo", linkedTo,
                "backupCodes", backupCodes,
                "createdAt", createdAt,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private PhoneNumberObject object;
 
        private String phoneNumber;
 
        private Optional<Boolean> reservedForSecondFactor = Optional.empty();
 
        private Optional<Boolean> defaultSecondFactor = Optional.empty();
 
        private Boolean reserved;
 
        private Optional<? extends PhoneNumberVerification> verification = Optional.empty();
 
        private List<IdentificationLink> linkedTo;
 
        private JsonNullable<? extends List<String>> backupCodes = JsonNullable.undefined();
 
        private Long createdAt;
 
        private Long updatedAt;  
        
        private Builder() {
          // force use of static builder() method
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

        /**
         * String representing the object's type. Objects of the same type share the same value.
         * 
         */
        public Builder object(PhoneNumberObject object) {
            Utils.checkNotNull(object, "object");
            this.object = object;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            Utils.checkNotNull(phoneNumber, "phoneNumber");
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder reservedForSecondFactor(boolean reservedForSecondFactor) {
            Utils.checkNotNull(reservedForSecondFactor, "reservedForSecondFactor");
            this.reservedForSecondFactor = Optional.ofNullable(reservedForSecondFactor);
            return this;
        }

        public Builder reservedForSecondFactor(Optional<Boolean> reservedForSecondFactor) {
            Utils.checkNotNull(reservedForSecondFactor, "reservedForSecondFactor");
            this.reservedForSecondFactor = reservedForSecondFactor;
            return this;
        }

        public Builder defaultSecondFactor(boolean defaultSecondFactor) {
            Utils.checkNotNull(defaultSecondFactor, "defaultSecondFactor");
            this.defaultSecondFactor = Optional.ofNullable(defaultSecondFactor);
            return this;
        }

        public Builder defaultSecondFactor(Optional<Boolean> defaultSecondFactor) {
            Utils.checkNotNull(defaultSecondFactor, "defaultSecondFactor");
            this.defaultSecondFactor = defaultSecondFactor;
            return this;
        }

        public Builder reserved(boolean reserved) {
            Utils.checkNotNull(reserved, "reserved");
            this.reserved = reserved;
            return this;
        }

        public Builder verification(PhoneNumberVerification verification) {
            Utils.checkNotNull(verification, "verification");
            this.verification = Optional.ofNullable(verification);
            return this;
        }

        public Builder verification(Optional<? extends PhoneNumberVerification> verification) {
            Utils.checkNotNull(verification, "verification");
            this.verification = verification;
            return this;
        }

        public Builder linkedTo(List<IdentificationLink> linkedTo) {
            Utils.checkNotNull(linkedTo, "linkedTo");
            this.linkedTo = linkedTo;
            return this;
        }

        public Builder backupCodes(List<String> backupCodes) {
            Utils.checkNotNull(backupCodes, "backupCodes");
            this.backupCodes = JsonNullable.of(backupCodes);
            return this;
        }

        public Builder backupCodes(JsonNullable<? extends List<String>> backupCodes) {
            Utils.checkNotNull(backupCodes, "backupCodes");
            this.backupCodes = backupCodes;
            return this;
        }

        /**
         * Unix timestamp of creation
         * 
         */
        public Builder createdAt(long createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Unix timestamp of creation
         * 
         */
        public Builder updatedAt(long updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }
        
        public PhoneNumber build() {
            return new PhoneNumber(
                id,
                object,
                phoneNumber,
                reservedForSecondFactor,
                defaultSecondFactor,
                reserved,
                verification,
                linkedTo,
                backupCodes,
                createdAt,
                updatedAt);
        }
    }
}

