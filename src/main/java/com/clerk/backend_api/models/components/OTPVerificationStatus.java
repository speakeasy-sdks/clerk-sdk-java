/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.clerk.backend_api.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
public enum OTPVerificationStatus {
    UNVERIFIED("unverified"),
    VERIFIED("verified"),
    FAILED("failed"),
    EXPIRED("expired");

    @JsonValue
    private final String value;

    private OTPVerificationStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<OTPVerificationStatus> fromValue(String value) {
        for (OTPVerificationStatus o: OTPVerificationStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
