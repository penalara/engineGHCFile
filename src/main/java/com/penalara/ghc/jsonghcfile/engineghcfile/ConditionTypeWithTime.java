
package com.penalara.ghc.jsonghcfile.engineghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ConditionTypeWithTime
 * <p>
 * Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "minutes"
})
public class ConditionTypeWithTime {

    /**
     * ConditionType
     * <p>
     * Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.")
    private ConditionType type;
    /**
     * Custom time in minutes for condition.
     * 
     */
    @JsonProperty("minutes")
    @JsonPropertyDescription("Custom time in minutes for condition.")
    private Integer minutes;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ConditionTypeWithTime() {
    }

    /**
     * 
     * @param minutes
     *     Custom time in minutes for condition.
     */
    public ConditionTypeWithTime(ConditionType type, Integer minutes) {
        super();
        this.type = type;
        this.minutes = minutes;
    }

    /**
     * ConditionType
     * <p>
     * Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public ConditionType getType() {
        return type;
    }

    /**
     * ConditionType
     * <p>
     * Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(ConditionType type) {
        this.type = type;
    }

    /**
     * Custom time in minutes for condition.
     * 
     */
    @JsonProperty("minutes")
    public Integer getMinutes() {
        return minutes;
    }

    /**
     * Custom time in minutes for condition.
     * 
     */
    @JsonProperty("minutes")
    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

}
