/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.clerk.backend_api.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * SAMLAccountObject - String representing the object's type. Objects of the same type share the same value.
 * 
 */
public enum SAMLAccountObject {
    SAML_ACCOUNT("saml_account");

    @JsonValue
    private final String value;

    private SAMLAccountObject(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SAMLAccountObject> fromValue(String value) {
        for (SAMLAccountObject o: SAMLAccountObject.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
