/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * EnrollmentMode - Mode of enrollment for the domain
 */
public enum EnrollmentMode {
    MANUAL_INVITATION("manual_invitation"),
    AUTOMATIC_INVITATION("automatic_invitation"),
    AUTOMATIC_SUGGESTION("automatic_suggestion");

    @JsonValue
    private final String value;

    private EnrollmentMode(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
