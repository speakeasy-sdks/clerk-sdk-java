/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.clerk.backend_api.models.components;


import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * BlocklistIdentifierObject - String representing the object's type. Objects of the same type share the same value.
 * 
 */
public enum BlocklistIdentifierObject {
    BLOCKLIST_IDENTIFIER("blocklist_identifier");

    @JsonValue
    private final String value;

    private BlocklistIdentifierObject(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
