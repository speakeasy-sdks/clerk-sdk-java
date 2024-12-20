/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * EmailAddressObject - String representing the object's type. Objects of the same type share the same value.
 * 
 */
public enum EmailAddressObject {
    EMAIL_ADDRESS("email_address");

    @JsonValue
    private final String value;

    private EmailAddressObject(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<EmailAddressObject> fromValue(String value) {
        for (EmailAddressObject o: EmailAddressObject.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
