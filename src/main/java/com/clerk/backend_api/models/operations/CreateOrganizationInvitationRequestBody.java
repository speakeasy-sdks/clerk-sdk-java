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
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

public class CreateOrganizationInvitationRequestBody {

    /**
     * The email address of the new member that is going to be invited to the organization
     */
    @JsonProperty("email_address")
    private String emailAddress;

    /**
     * The ID of the user that invites the new member to the organization.
     * Must be an administrator in the organization.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("inviter_user_id")
    private JsonNullable<String> inviterUserId;

    /**
     * The role of the new member in the organization
     */
    @JsonProperty("role")
    private String role;

    /**
     * Metadata saved on the organization invitation, read-only from the Frontend API and fully accessible (read/write) from the Backend API.
     * When the organization invitation is accepted, the metadata will be transferred to the newly created organization membership.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("public_metadata")
    private JsonNullable<? extends Map<String, Object>> publicMetadata;

    /**
     * Metadata saved on the organization invitation, fully accessible (read/write) from the Backend API but not visible from the Frontend API.
     * When the organization invitation is accepted, the metadata will be transferred to the newly created organization membership.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("private_metadata")
    private JsonNullable<? extends Map<String, Object>> privateMetadata;

    /**
     * Optional URL that the invitee will be redirected to once they accept the invitation by clicking the join link in the invitation email.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("redirect_url")
    private JsonNullable<String> redirectUrl;

    /**
     * The number of days the invitation will be valid for. By default, the invitation has a 30 days expire.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expires_in_days")
    private JsonNullable<Long> expiresInDays;

    @JsonCreator
    public CreateOrganizationInvitationRequestBody(
            @JsonProperty("email_address") String emailAddress,
            @JsonProperty("inviter_user_id") JsonNullable<String> inviterUserId,
            @JsonProperty("role") String role,
            @JsonProperty("public_metadata") JsonNullable<? extends Map<String, Object>> publicMetadata,
            @JsonProperty("private_metadata") JsonNullable<? extends Map<String, Object>> privateMetadata,
            @JsonProperty("redirect_url") JsonNullable<String> redirectUrl,
            @JsonProperty("expires_in_days") JsonNullable<Long> expiresInDays) {
        Utils.checkNotNull(emailAddress, "emailAddress");
        Utils.checkNotNull(inviterUserId, "inviterUserId");
        Utils.checkNotNull(role, "role");
        Utils.checkNotNull(publicMetadata, "publicMetadata");
        Utils.checkNotNull(privateMetadata, "privateMetadata");
        Utils.checkNotNull(redirectUrl, "redirectUrl");
        Utils.checkNotNull(expiresInDays, "expiresInDays");
        this.emailAddress = emailAddress;
        this.inviterUserId = inviterUserId;
        this.role = role;
        this.publicMetadata = publicMetadata;
        this.privateMetadata = privateMetadata;
        this.redirectUrl = redirectUrl;
        this.expiresInDays = expiresInDays;
    }
    
    public CreateOrganizationInvitationRequestBody(
            String emailAddress,
            String role) {
        this(emailAddress, JsonNullable.undefined(), role, JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The email address of the new member that is going to be invited to the organization
     */
    @JsonIgnore
    public String emailAddress() {
        return emailAddress;
    }

    /**
     * The ID of the user that invites the new member to the organization.
     * Must be an administrator in the organization.
     */
    @JsonIgnore
    public JsonNullable<String> inviterUserId() {
        return inviterUserId;
    }

    /**
     * The role of the new member in the organization
     */
    @JsonIgnore
    public String role() {
        return role;
    }

    /**
     * Metadata saved on the organization invitation, read-only from the Frontend API and fully accessible (read/write) from the Backend API.
     * When the organization invitation is accepted, the metadata will be transferred to the newly created organization membership.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Map<String, Object>> publicMetadata() {
        return (JsonNullable<Map<String, Object>>) publicMetadata;
    }

    /**
     * Metadata saved on the organization invitation, fully accessible (read/write) from the Backend API but not visible from the Frontend API.
     * When the organization invitation is accepted, the metadata will be transferred to the newly created organization membership.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Map<String, Object>> privateMetadata() {
        return (JsonNullable<Map<String, Object>>) privateMetadata;
    }

    /**
     * Optional URL that the invitee will be redirected to once they accept the invitation by clicking the join link in the invitation email.
     */
    @JsonIgnore
    public JsonNullable<String> redirectUrl() {
        return redirectUrl;
    }

    /**
     * The number of days the invitation will be valid for. By default, the invitation has a 30 days expire.
     */
    @JsonIgnore
    public JsonNullable<Long> expiresInDays() {
        return expiresInDays;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The email address of the new member that is going to be invited to the organization
     */
    public CreateOrganizationInvitationRequestBody withEmailAddress(String emailAddress) {
        Utils.checkNotNull(emailAddress, "emailAddress");
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * The ID of the user that invites the new member to the organization.
     * Must be an administrator in the organization.
     */
    public CreateOrganizationInvitationRequestBody withInviterUserId(String inviterUserId) {
        Utils.checkNotNull(inviterUserId, "inviterUserId");
        this.inviterUserId = JsonNullable.of(inviterUserId);
        return this;
    }

    /**
     * The ID of the user that invites the new member to the organization.
     * Must be an administrator in the organization.
     */
    public CreateOrganizationInvitationRequestBody withInviterUserId(JsonNullable<String> inviterUserId) {
        Utils.checkNotNull(inviterUserId, "inviterUserId");
        this.inviterUserId = inviterUserId;
        return this;
    }

    /**
     * The role of the new member in the organization
     */
    public CreateOrganizationInvitationRequestBody withRole(String role) {
        Utils.checkNotNull(role, "role");
        this.role = role;
        return this;
    }

    /**
     * Metadata saved on the organization invitation, read-only from the Frontend API and fully accessible (read/write) from the Backend API.
     * When the organization invitation is accepted, the metadata will be transferred to the newly created organization membership.
     */
    public CreateOrganizationInvitationRequestBody withPublicMetadata(Map<String, Object> publicMetadata) {
        Utils.checkNotNull(publicMetadata, "publicMetadata");
        this.publicMetadata = JsonNullable.of(publicMetadata);
        return this;
    }

    /**
     * Metadata saved on the organization invitation, read-only from the Frontend API and fully accessible (read/write) from the Backend API.
     * When the organization invitation is accepted, the metadata will be transferred to the newly created organization membership.
     */
    public CreateOrganizationInvitationRequestBody withPublicMetadata(JsonNullable<? extends Map<String, Object>> publicMetadata) {
        Utils.checkNotNull(publicMetadata, "publicMetadata");
        this.publicMetadata = publicMetadata;
        return this;
    }

    /**
     * Metadata saved on the organization invitation, fully accessible (read/write) from the Backend API but not visible from the Frontend API.
     * When the organization invitation is accepted, the metadata will be transferred to the newly created organization membership.
     */
    public CreateOrganizationInvitationRequestBody withPrivateMetadata(Map<String, Object> privateMetadata) {
        Utils.checkNotNull(privateMetadata, "privateMetadata");
        this.privateMetadata = JsonNullable.of(privateMetadata);
        return this;
    }

    /**
     * Metadata saved on the organization invitation, fully accessible (read/write) from the Backend API but not visible from the Frontend API.
     * When the organization invitation is accepted, the metadata will be transferred to the newly created organization membership.
     */
    public CreateOrganizationInvitationRequestBody withPrivateMetadata(JsonNullable<? extends Map<String, Object>> privateMetadata) {
        Utils.checkNotNull(privateMetadata, "privateMetadata");
        this.privateMetadata = privateMetadata;
        return this;
    }

    /**
     * Optional URL that the invitee will be redirected to once they accept the invitation by clicking the join link in the invitation email.
     */
    public CreateOrganizationInvitationRequestBody withRedirectUrl(String redirectUrl) {
        Utils.checkNotNull(redirectUrl, "redirectUrl");
        this.redirectUrl = JsonNullable.of(redirectUrl);
        return this;
    }

    /**
     * Optional URL that the invitee will be redirected to once they accept the invitation by clicking the join link in the invitation email.
     */
    public CreateOrganizationInvitationRequestBody withRedirectUrl(JsonNullable<String> redirectUrl) {
        Utils.checkNotNull(redirectUrl, "redirectUrl");
        this.redirectUrl = redirectUrl;
        return this;
    }

    /**
     * The number of days the invitation will be valid for. By default, the invitation has a 30 days expire.
     */
    public CreateOrganizationInvitationRequestBody withExpiresInDays(long expiresInDays) {
        Utils.checkNotNull(expiresInDays, "expiresInDays");
        this.expiresInDays = JsonNullable.of(expiresInDays);
        return this;
    }

    /**
     * The number of days the invitation will be valid for. By default, the invitation has a 30 days expire.
     */
    public CreateOrganizationInvitationRequestBody withExpiresInDays(JsonNullable<Long> expiresInDays) {
        Utils.checkNotNull(expiresInDays, "expiresInDays");
        this.expiresInDays = expiresInDays;
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
        CreateOrganizationInvitationRequestBody other = (CreateOrganizationInvitationRequestBody) o;
        return 
            Objects.deepEquals(this.emailAddress, other.emailAddress) &&
            Objects.deepEquals(this.inviterUserId, other.inviterUserId) &&
            Objects.deepEquals(this.role, other.role) &&
            Objects.deepEquals(this.publicMetadata, other.publicMetadata) &&
            Objects.deepEquals(this.privateMetadata, other.privateMetadata) &&
            Objects.deepEquals(this.redirectUrl, other.redirectUrl) &&
            Objects.deepEquals(this.expiresInDays, other.expiresInDays);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            emailAddress,
            inviterUserId,
            role,
            publicMetadata,
            privateMetadata,
            redirectUrl,
            expiresInDays);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateOrganizationInvitationRequestBody.class,
                "emailAddress", emailAddress,
                "inviterUserId", inviterUserId,
                "role", role,
                "publicMetadata", publicMetadata,
                "privateMetadata", privateMetadata,
                "redirectUrl", redirectUrl,
                "expiresInDays", expiresInDays);
    }
    
    public final static class Builder {
 
        private String emailAddress;
 
        private JsonNullable<String> inviterUserId = JsonNullable.undefined();
 
        private String role;
 
        private JsonNullable<? extends Map<String, Object>> publicMetadata = JsonNullable.undefined();
 
        private JsonNullable<? extends Map<String, Object>> privateMetadata = JsonNullable.undefined();
 
        private JsonNullable<String> redirectUrl = JsonNullable.undefined();
 
        private JsonNullable<Long> expiresInDays = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The email address of the new member that is going to be invited to the organization
         */
        public Builder emailAddress(String emailAddress) {
            Utils.checkNotNull(emailAddress, "emailAddress");
            this.emailAddress = emailAddress;
            return this;
        }

        /**
         * The ID of the user that invites the new member to the organization.
         * Must be an administrator in the organization.
         */
        public Builder inviterUserId(String inviterUserId) {
            Utils.checkNotNull(inviterUserId, "inviterUserId");
            this.inviterUserId = JsonNullable.of(inviterUserId);
            return this;
        }

        /**
         * The ID of the user that invites the new member to the organization.
         * Must be an administrator in the organization.
         */
        public Builder inviterUserId(JsonNullable<String> inviterUserId) {
            Utils.checkNotNull(inviterUserId, "inviterUserId");
            this.inviterUserId = inviterUserId;
            return this;
        }

        /**
         * The role of the new member in the organization
         */
        public Builder role(String role) {
            Utils.checkNotNull(role, "role");
            this.role = role;
            return this;
        }

        /**
         * Metadata saved on the organization invitation, read-only from the Frontend API and fully accessible (read/write) from the Backend API.
         * When the organization invitation is accepted, the metadata will be transferred to the newly created organization membership.
         */
        public Builder publicMetadata(Map<String, Object> publicMetadata) {
            Utils.checkNotNull(publicMetadata, "publicMetadata");
            this.publicMetadata = JsonNullable.of(publicMetadata);
            return this;
        }

        /**
         * Metadata saved on the organization invitation, read-only from the Frontend API and fully accessible (read/write) from the Backend API.
         * When the organization invitation is accepted, the metadata will be transferred to the newly created organization membership.
         */
        public Builder publicMetadata(JsonNullable<? extends Map<String, Object>> publicMetadata) {
            Utils.checkNotNull(publicMetadata, "publicMetadata");
            this.publicMetadata = publicMetadata;
            return this;
        }

        /**
         * Metadata saved on the organization invitation, fully accessible (read/write) from the Backend API but not visible from the Frontend API.
         * When the organization invitation is accepted, the metadata will be transferred to the newly created organization membership.
         */
        public Builder privateMetadata(Map<String, Object> privateMetadata) {
            Utils.checkNotNull(privateMetadata, "privateMetadata");
            this.privateMetadata = JsonNullable.of(privateMetadata);
            return this;
        }

        /**
         * Metadata saved on the organization invitation, fully accessible (read/write) from the Backend API but not visible from the Frontend API.
         * When the organization invitation is accepted, the metadata will be transferred to the newly created organization membership.
         */
        public Builder privateMetadata(JsonNullable<? extends Map<String, Object>> privateMetadata) {
            Utils.checkNotNull(privateMetadata, "privateMetadata");
            this.privateMetadata = privateMetadata;
            return this;
        }

        /**
         * Optional URL that the invitee will be redirected to once they accept the invitation by clicking the join link in the invitation email.
         */
        public Builder redirectUrl(String redirectUrl) {
            Utils.checkNotNull(redirectUrl, "redirectUrl");
            this.redirectUrl = JsonNullable.of(redirectUrl);
            return this;
        }

        /**
         * Optional URL that the invitee will be redirected to once they accept the invitation by clicking the join link in the invitation email.
         */
        public Builder redirectUrl(JsonNullable<String> redirectUrl) {
            Utils.checkNotNull(redirectUrl, "redirectUrl");
            this.redirectUrl = redirectUrl;
            return this;
        }

        /**
         * The number of days the invitation will be valid for. By default, the invitation has a 30 days expire.
         */
        public Builder expiresInDays(long expiresInDays) {
            Utils.checkNotNull(expiresInDays, "expiresInDays");
            this.expiresInDays = JsonNullable.of(expiresInDays);
            return this;
        }

        /**
         * The number of days the invitation will be valid for. By default, the invitation has a 30 days expire.
         */
        public Builder expiresInDays(JsonNullable<Long> expiresInDays) {
            Utils.checkNotNull(expiresInDays, "expiresInDays");
            this.expiresInDays = expiresInDays;
            return this;
        }
        
        public CreateOrganizationInvitationRequestBody build() {
            return new CreateOrganizationInvitationRequestBody(
                emailAddress,
                inviterUserId,
                role,
                publicMetadata,
                privateMetadata,
                redirectUrl,
                expiresInDays);
        }
    }
}

