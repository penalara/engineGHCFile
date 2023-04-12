
package com.penalara.ghc.jsonghcfile.engineghcfile;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * SamePositionEveryPeriod
 * <p>
 * Keep the same position every week or period for the class units.
 * 
 */
public enum SamePositionEveryPeriod {

    IGNORE("ignore"),
    ATTEMPT("attempt"),
    AVOID("avoid"),
    STRICT("strict"),
    FORBIDDEN("forbidden");
    private final String value;
    private final static Map<String, SamePositionEveryPeriod> CONSTANTS = new HashMap<String, SamePositionEveryPeriod>();

    static {
        for (SamePositionEveryPeriod c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    SamePositionEveryPeriod(String value) {
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
    public static SamePositionEveryPeriod fromValue(String value) {
        SamePositionEveryPeriod constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
