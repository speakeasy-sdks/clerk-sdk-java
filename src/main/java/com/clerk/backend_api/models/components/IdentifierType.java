/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.clerk.backend_api.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
public enum IdentifierType {
    EMAIL_ADDRESS("email_address"),
    PHONE_NUMBER("phone_number"),
    WEB3_WALLET("web3_wallet");

    @JsonValue
    private final String value;

    private IdentifierType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<IdentifierType> fromValue(String value) {
        for (IdentifierType o: IdentifierType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
