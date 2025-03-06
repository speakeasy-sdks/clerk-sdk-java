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

public class DeleteAllowlistIdentifierRequest {

    /**
     * The ID of the identifier to delete from the allow-list
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=identifier_id")
    private String identifierId;

    @JsonCreator
    public DeleteAllowlistIdentifierRequest(
            String identifierId) {
        Utils.checkNotNull(identifierId, "identifierId");
        this.identifierId = identifierId;
    }

    /**
     * The ID of the identifier to delete from the allow-list
     */
    @JsonIgnore
    public String identifierId() {
        return identifierId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the identifier to delete from the allow-list
     */
    public DeleteAllowlistIdentifierRequest withIdentifierId(String identifierId) {
        Utils.checkNotNull(identifierId, "identifierId");
        this.identifierId = identifierId;
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
        DeleteAllowlistIdentifierRequest other = (DeleteAllowlistIdentifierRequest) o;
        return 
            Objects.deepEquals(this.identifierId, other.identifierId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            identifierId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteAllowlistIdentifierRequest.class,
                "identifierId", identifierId);
    }
    
    public final static class Builder {
 
        private String identifierId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the identifier to delete from the allow-list
         */
        public Builder identifierId(String identifierId) {
            Utils.checkNotNull(identifierId, "identifierId");
            this.identifierId = identifierId;
            return this;
        }
        
        public DeleteAllowlistIdentifierRequest build() {
            return new DeleteAllowlistIdentifierRequest(
                identifierId);
        }
    }
}

