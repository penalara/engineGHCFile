
package com.penalara.ghc.jsonghcfile.engineinput;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * ConditionType
 * <p>
 * Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.
 * 
 */
public enum ConditionType {

    IGNORE("ignore"),
    AVOID("avoid"),
    STRICT("strict");
    private final String value;
    private final static Map<String, ConditionType> CONSTANTS = new HashMap<String, ConditionType>();

    static {
        for (ConditionType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ConditionType(String value) {
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
    public static ConditionType fromValue(String value) {
        ConditionType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
