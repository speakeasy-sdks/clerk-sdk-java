/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.clerk.backend_api.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
public enum BlocklistIdentifierIdentifierType {
    EMAIL_ADDRESS("email_address"),
    PHONE_NUMBER("phone_number"),
    WEB3_WALLET("web3_wallet");

    @JsonValue
    private final String value;

    private BlocklistIdentifierIdentifierType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<BlocklistIdentifierIdentifierType> fromValue(String value) {
        for (BlocklistIdentifierIdentifierType o: BlocklistIdentifierIdentifierType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
