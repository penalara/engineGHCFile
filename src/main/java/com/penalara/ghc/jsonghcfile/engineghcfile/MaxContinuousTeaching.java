
package com.penalara.ghc.jsonghcfile.engineghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * MaxContinuousTeaching
 * <p>
 * It indicates the maximum continuous time of class units, which are allowed without having a gap or a non-class units between them.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "minutes",
    "minBreak"
})
public class MaxContinuousTeaching {

    /**
     * ConditionType
     * <p>
     * Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.")
    private ConditionType type;
    /**
     * Maximum continuous teaching time in minutes.
     * 
     */
    @JsonProperty("minutes")
    @JsonPropertyDescription("Maximum continuous teaching time in minutes.")
    private Integer minutes;
    /**
     * Minimum time period to be considered as break time If not specified, the engine will assign the general value or the default time of 30 minutes.
     * 
     */
    @JsonProperty("minBreak")
    @JsonPropertyDescription("Minimum time period to be considered as break time")
    private Integer minBreak;

    /**
     * ConditionType
     * <p>
     * Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.
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
     * 
     */
    @JsonProperty("type")
    public void setType(ConditionType type) {
        this.type = type;
    }

    /**
     * Maximum continuous teaching time in minutes.
     * 
     */
    @JsonProperty("minutes")
    public Integer getMinutes() {
        return minutes;
    }

    /**
     * Maximum continuous teaching time in minutes.
     * 
     */
    @JsonProperty("minutes")
    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    /**
     * Minimum time period to be considered as break time If not specified, the engine will assign the general value or the default time of 30 minutes.
     * 
     */
    @JsonProperty("minBreak")
    public Integer getMinBreak() {
        return minBreak;
    }

    /**
     * Minimum time period to be considered as break time If not specified, the engine will assign the general value or the default time of 30 minutes.
     * 
     */
    @JsonProperty("minBreak")
    public void setMinBreak(Integer minBreak) {
        this.minBreak = minBreak;
    }

}
