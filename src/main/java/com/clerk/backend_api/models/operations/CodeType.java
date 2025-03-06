/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.clerk.backend_api.models.operations;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
public enum CodeType {
    TOTP("totp"),
    BACKUP_CODE("backup_code");

    @JsonValue
    private final String value;

    private CodeType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<CodeType> fromValue(String value) {
        for (CodeType o: CodeType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
