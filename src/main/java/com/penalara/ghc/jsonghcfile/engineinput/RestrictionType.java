
package com.penalara.ghc.jsonghcfile.engineinput;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * RestrictionType
 * <p>
 * Indicate whether the incompatibility is a strict, ignore, preferred (strong optimization weight) or accordingToRule (weight according to optimization rule).
 * 
 */
public enum RestrictionType {

    IGNORE("ignore"),
    STRICT("strict"),
    PREFERRED("preferred"),
    ACCORDING_TO_RULE("accordingToRule");
    private final String value;
    private final static Map<String, RestrictionType> CONSTANTS = new HashMap<String, RestrictionType>();

    static {
        for (RestrictionType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    RestrictionType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static RestrictionType fromValue(String value) {
        RestrictionType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
