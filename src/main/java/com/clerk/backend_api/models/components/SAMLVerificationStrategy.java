/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum SAMLVerificationStrategy {
    SAML("saml");

    @JsonValue
    private final String value;

    private SAMLVerificationStrategy(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SAMLVerificationStrategy> fromValue(String value) {
        for (SAMLVerificationStrategy o: SAMLVerificationStrategy.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
