/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.clerk.backend_api.models.operations;
import com.clerk.backend_api.utils.SpeakeasyMetadata;
import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class DeleteUserProfileImageRequest {

    /**
     * The ID of the user to delete the profile image for
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=user_id")
    private String userId;

    @JsonCreator
    public DeleteUserProfileImageRequest(
            String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
    }

    /**
     * The ID of the user to delete the profile image for
     */
    @JsonIgnore
    public String userId() {
        return userId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the user to delete the profile image for
     */
    public DeleteUserProfileImageRequest withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
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
        DeleteUserProfileImageRequest other = (DeleteUserProfileImageRequest) o;
        return 
            Objects.deepEquals(this.userId, other.userId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            userId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteUserProfileImageRequest.class,
                "userId", userId);
    }
    
    public final static class Builder {
 
        private String userId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the user to delete the profile image for
         */
        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }
        
        public DeleteUserProfileImageRequest build() {
            return new DeleteUserProfileImageRequest(
                userId);
        }
    }
}

