/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.clerk.backend_api.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
public enum WaitlistEntryStatus {
    PENDING("pending"),
    INVITED("invited"),
    REJECTED("rejected"),
    COMPLETED("completed");

    @JsonValue
    private final String value;

    private WaitlistEntryStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<WaitlistEntryStatus> fromValue(String value) {
        for (WaitlistEntryStatus o: WaitlistEntryStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
