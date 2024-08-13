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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class CreateOrganizationRequestBody {

    /**
     * The name of the new organization
     */
    @JsonProperty("name")
    private String name;

    /**
     * The ID of the User who will become the administrator for the new organization
     */
    @JsonProperty("created_by")
    private String createdBy;

    /**
     * Metadata saved on the organization, accessible only from the Backend API
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("private_metadata")
    private Optional<? extends CreateOrganizationPrivateMetadata> privateMetadata;

    /**
     * Metadata saved on the organization, read-only from the Frontend API and fully accessible (read/write) from the Backend API
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("public_metadata")
    private Optional<? extends CreateOrganizationPublicMetadata> publicMetadata;

    /**
     * A slug for the new organization.
     * Can contain only lowercase alphanumeric characters and the dash "-".
     * Must be unique for the instance.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("slug")
    private Optional<String> slug;

    /**
     * The maximum number of memberships allowed for this organization
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_allowed_memberships")
    private Optional<Long> maxAllowedMemberships;

    @JsonCreator
    public CreateOrganizationRequestBody(
            @JsonProperty("name") String name,
            @JsonProperty("created_by") String createdBy,
            @JsonProperty("private_metadata") Optional<? extends CreateOrganizationPrivateMetadata> privateMetadata,
            @JsonProperty("public_metadata") Optional<? extends CreateOrganizationPublicMetadata> publicMetadata,
            @JsonProperty("slug") Optional<String> slug,
            @JsonProperty("max_allowed_memberships") Optional<Long> maxAllowedMemberships) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(createdBy, "createdBy");
        Utils.checkNotNull(privateMetadata, "privateMetadata");
        Utils.checkNotNull(publicMetadata, "publicMetadata");
        Utils.checkNotNull(slug, "slug");
        Utils.checkNotNull(maxAllowedMemberships, "maxAllowedMemberships");
        this.name = name;
        this.createdBy = createdBy;
        this.privateMetadata = privateMetadata;
        this.publicMetadata = publicMetadata;
        this.slug = slug;
        this.maxAllowedMemberships = maxAllowedMemberships;
    }
    
    public CreateOrganizationRequestBody(
            String name,
            String createdBy) {
        this(name, createdBy, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The name of the new organization
     */
    @JsonIgnore
    public String name() {
        return name;
    }

    /**
     * The ID of the User who will become the administrator for the new organization
     */
    @JsonIgnore
    public String createdBy() {
        return createdBy;
    }

    /**
     * Metadata saved on the organization, accessible only from the Backend API
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CreateOrganizationPrivateMetadata> privateMetadata() {
        return (Optional<CreateOrganizationPrivateMetadata>) privateMetadata;
    }

    /**
     * Metadata saved on the organization, read-only from the Frontend API and fully accessible (read/write) from the Backend API
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CreateOrganizationPublicMetadata> publicMetadata() {
        return (Optional<CreateOrganizationPublicMetadata>) publicMetadata;
    }

    /**
     * A slug for the new organization.
     * Can contain only lowercase alphanumeric characters and the dash "-".
     * Must be unique for the instance.
     */
    @JsonIgnore
    public Optional<String> slug() {
        return slug;
    }

    /**
     * The maximum number of memberships allowed for this organization
     */
    @JsonIgnore
    public Optional<Long> maxAllowedMemberships() {
        return maxAllowedMemberships;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the new organization
     */
    public CreateOrganizationRequestBody withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The ID of the User who will become the administrator for the new organization
     */
    public CreateOrganizationRequestBody withCreatedBy(String createdBy) {
        Utils.checkNotNull(createdBy, "createdBy");
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Metadata saved on the organization, accessible only from the Backend API
     */
    public CreateOrganizationRequestBody withPrivateMetadata(CreateOrganizationPrivateMetadata privateMetadata) {
        Utils.checkNotNull(privateMetadata, "privateMetadata");
        this.privateMetadata = Optional.ofNullable(privateMetadata);
        return this;
    }

    /**
     * Metadata saved on the organization, accessible only from the Backend API
     */
    public CreateOrganizationRequestBody withPrivateMetadata(Optional<? extends CreateOrganizationPrivateMetadata> privateMetadata) {
        Utils.checkNotNull(privateMetadata, "privateMetadata");
        this.privateMetadata = privateMetadata;
        return this;
    }

    /**
     * Metadata saved on the organization, read-only from the Frontend API and fully accessible (read/write) from the Backend API
     */
    public CreateOrganizationRequestBody withPublicMetadata(CreateOrganizationPublicMetadata publicMetadata) {
        Utils.checkNotNull(publicMetadata, "publicMetadata");
        this.publicMetadata = Optional.ofNullable(publicMetadata);
        return this;
    }

    /**
     * Metadata saved on the organization, read-only from the Frontend API and fully accessible (read/write) from the Backend API
     */
    public CreateOrganizationRequestBody withPublicMetadata(Optional<? extends CreateOrganizationPublicMetadata> publicMetadata) {
        Utils.checkNotNull(publicMetadata, "publicMetadata");
        this.publicMetadata = publicMetadata;
        return this;
    }

    /**
     * A slug for the new organization.
     * Can contain only lowercase alphanumeric characters and the dash "-".
     * Must be unique for the instance.
     */
    public CreateOrganizationRequestBody withSlug(String slug) {
        Utils.checkNotNull(slug, "slug");
        this.slug = Optional.ofNullable(slug);
        return this;
    }

    /**
     * A slug for the new organization.
     * Can contain only lowercase alphanumeric characters and the dash "-".
     * Must be unique for the instance.
     */
    public CreateOrganizationRequestBody withSlug(Optional<String> slug) {
        Utils.checkNotNull(slug, "slug");
        this.slug = slug;
        return this;
    }

    /**
     * The maximum number of memberships allowed for this organization
     */
    public CreateOrganizationRequestBody withMaxAllowedMemberships(long maxAllowedMemberships) {
        Utils.checkNotNull(maxAllowedMemberships, "maxAllowedMemberships");
        this.maxAllowedMemberships = Optional.ofNullable(maxAllowedMemberships);
        return this;
    }

    /**
     * The maximum number of memberships allowed for this organization
     */
    public CreateOrganizationRequestBody withMaxAllowedMemberships(Optional<Long> maxAllowedMemberships) {
        Utils.checkNotNull(maxAllowedMemberships, "maxAllowedMemberships");
        this.maxAllowedMemberships = maxAllowedMemberships;
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
        CreateOrganizationRequestBody other = (CreateOrganizationRequestBody) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.createdBy, other.createdBy) &&
            Objects.deepEquals(this.privateMetadata, other.privateMetadata) &&
            Objects.deepEquals(this.publicMetadata, other.publicMetadata) &&
            Objects.deepEquals(this.slug, other.slug) &&
            Objects.deepEquals(this.maxAllowedMemberships, other.maxAllowedMemberships);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            createdBy,
            privateMetadata,
            publicMetadata,
            slug,
            maxAllowedMemberships);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateOrganizationRequestBody.class,
                "name", name,
                "createdBy", createdBy,
                "privateMetadata", privateMetadata,
                "publicMetadata", publicMetadata,
                "slug", slug,
                "maxAllowedMemberships", maxAllowedMemberships);
    }
    
    public final static class Builder {
 
        private String name;
 
        private String createdBy;
 
        private Optional<? extends CreateOrganizationPrivateMetadata> privateMetadata = Optional.empty();
 
        private Optional<? extends CreateOrganizationPublicMetadata> publicMetadata = Optional.empty();
 
        private Optional<String> slug = Optional.empty();
 
        private Optional<Long> maxAllowedMemberships = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The name of the new organization
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * The ID of the User who will become the administrator for the new organization
         */
        public Builder createdBy(String createdBy) {
            Utils.checkNotNull(createdBy, "createdBy");
            this.createdBy = createdBy;
            return this;
        }

        /**
         * Metadata saved on the organization, accessible only from the Backend API
         */
        public Builder privateMetadata(CreateOrganizationPrivateMetadata privateMetadata) {
            Utils.checkNotNull(privateMetadata, "privateMetadata");
            this.privateMetadata = Optional.ofNullable(privateMetadata);
            return this;
        }

        /**
         * Metadata saved on the organization, accessible only from the Backend API
         */
        public Builder privateMetadata(Optional<? extends CreateOrganizationPrivateMetadata> privateMetadata) {
            Utils.checkNotNull(privateMetadata, "privateMetadata");
            this.privateMetadata = privateMetadata;
            return this;
        }

        /**
         * Metadata saved on the organization, read-only from the Frontend API and fully accessible (read/write) from the Backend API
         */
        public Builder publicMetadata(CreateOrganizationPublicMetadata publicMetadata) {
            Utils.checkNotNull(publicMetadata, "publicMetadata");
            this.publicMetadata = Optional.ofNullable(publicMetadata);
            return this;
        }

        /**
         * Metadata saved on the organization, read-only from the Frontend API and fully accessible (read/write) from the Backend API
         */
        public Builder publicMetadata(Optional<? extends CreateOrganizationPublicMetadata> publicMetadata) {
            Utils.checkNotNull(publicMetadata, "publicMetadata");
            this.publicMetadata = publicMetadata;
            return this;
        }

        /**
         * A slug for the new organization.
         * Can contain only lowercase alphanumeric characters and the dash "-".
         * Must be unique for the instance.
         */
        public Builder slug(String slug) {
            Utils.checkNotNull(slug, "slug");
            this.slug = Optional.ofNullable(slug);
            return this;
        }

        /**
         * A slug for the new organization.
         * Can contain only lowercase alphanumeric characters and the dash "-".
         * Must be unique for the instance.
         */
        public Builder slug(Optional<String> slug) {
            Utils.checkNotNull(slug, "slug");
            this.slug = slug;
            return this;
        }

        /**
         * The maximum number of memberships allowed for this organization
         */
        public Builder maxAllowedMemberships(long maxAllowedMemberships) {
            Utils.checkNotNull(maxAllowedMemberships, "maxAllowedMemberships");
            this.maxAllowedMemberships = Optional.ofNullable(maxAllowedMemberships);
            return this;
        }

        /**
         * The maximum number of memberships allowed for this organization
         */
        public Builder maxAllowedMemberships(Optional<Long> maxAllowedMemberships) {
            Utils.checkNotNull(maxAllowedMemberships, "maxAllowedMemberships");
            this.maxAllowedMemberships = maxAllowedMemberships;
            return this;
        }
        
        public CreateOrganizationRequestBody build() {
            return new CreateOrganizationRequestBody(
                name,
                createdBy,
                privateMetadata,
                publicMetadata,
                slug,
                maxAllowedMemberships);
        }
    }
}

