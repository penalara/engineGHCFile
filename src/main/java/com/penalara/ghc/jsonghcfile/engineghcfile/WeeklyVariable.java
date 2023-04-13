
package com.penalara.ghc.jsonghcfile.engineghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * WeeklyVariable
 * <p>
 * It defines the distribution as a number of sections per week and a maximum range of sections per day.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "minutesAmount",
    "maxMinutesDaily",
    "minMinutesDaily",
    "avoidMaxDuration",
    "avoidMinDuration",
    "allowDiscontinuity"
})
public class WeeklyVariable {

    /**
     * Total of session's weekly minutes.
     * (Required)
     * 
     */
    @JsonProperty("minutesAmount")
    @JsonPropertyDescription("Total of session's weekly minutes.")
    private Integer minutesAmount;
    /**
     * Maximum of minutes per day.
     * (Required)
     * 
     */
    @JsonProperty("maxMinutesDaily")
    @JsonPropertyDescription("Maximum of minutes per day.")
    private Integer maxMinutesDaily;
    /**
     * Minimun of minutes per day.
     * 
     */
    @JsonProperty("minMinutesDaily")
    @JsonPropertyDescription("Minimun of minutes per day.")
    private Integer minMinutesDaily;
    /**
     * It indicates the preference for class units of maximum duration.
     * 
     */
    @JsonProperty("avoidMaxDuration")
    @JsonPropertyDescription("It indicates the preference for class units of maximum duration.")
    private Boolean avoidMaxDuration = false;
    /**
     * It indicates the preference for class units of minimun duration.
     * 
     */
    @JsonProperty("avoidMinDuration")
    @JsonPropertyDescription("It indicates the preference for class units of minimun duration.")
    private Boolean avoidMinDuration = false;
    /**
     * It indicates whether discontinuous sections are allowed, that is, having sections of other class units or breaks in between them.
     * 
     */
    @JsonProperty("allowDiscontinuity")
    @JsonPropertyDescription("It indicates whether discontinuous sections are allowed, that is, having sections of other class units or breaks in between them.")
    private Boolean allowDiscontinuity = false;

    /**
     * Total of session's weekly minutes.
     * (Required)
     * 
     */
    @JsonProperty("minutesAmount")
    public Integer getMinutesAmount() {
        return minutesAmount;
    }

    /**
     * Total of session's weekly minutes.
     * (Required)
     * 
     */
    @JsonProperty("minutesAmount")
    public void setMinutesAmount(Integer minutesAmount) {
        this.minutesAmount = minutesAmount;
    }

    /**
     * Maximum of minutes per day.
     * (Required)
     * 
     */
    @JsonProperty("maxMinutesDaily")
    public Integer getMaxMinutesDaily() {
        return maxMinutesDaily;
    }

    /**
     * Maximum of minutes per day.
     * (Required)
     * 
     */
    @JsonProperty("maxMinutesDaily")
    public void setMaxMinutesDaily(Integer maxMinutesDaily) {
        this.maxMinutesDaily = maxMinutesDaily;
    }

    /**
     * Minimun of minutes per day.
     * 
     */
    @JsonProperty("minMinutesDaily")
    public Integer getMinMinutesDaily() {
        return minMinutesDaily;
    }

    /**
     * Minimun of minutes per day.
     * 
     */
    @JsonProperty("minMinutesDaily")
    public void setMinMinutesDaily(Integer minMinutesDaily) {
        this.minMinutesDaily = minMinutesDaily;
    }

    /**
     * It indicates the preference for class units of maximum duration.
     * 
     */
    @JsonProperty("avoidMaxDuration")
    public Boolean getAvoidMaxDuration() {
        return avoidMaxDuration;
    }

    /**
     * It indicates the preference for class units of maximum duration.
     * 
     */
    @JsonProperty("avoidMaxDuration")
    public void setAvoidMaxDuration(Boolean avoidMaxDuration) {
        this.avoidMaxDuration = avoidMaxDuration;
    }

    /**
     * It indicates the preference for class units of minimun duration.
     * 
     */
    @JsonProperty("avoidMinDuration")
    public Boolean getAvoidMinDuration() {
        return avoidMinDuration;
    }

    /**
     * It indicates the preference for class units of minimun duration.
     * 
     */
    @JsonProperty("avoidMinDuration")
    public void setAvoidMinDuration(Boolean avoidMinDuration) {
        this.avoidMinDuration = avoidMinDuration;
    }

    /**
     * It indicates whether discontinuous sections are allowed, that is, having sections of other class units or breaks in between them.
     * 
     */
    @JsonProperty("allowDiscontinuity")
    public Boolean getAllowDiscontinuity() {
        return allowDiscontinuity;
    }

    /**
     * It indicates whether discontinuous sections are allowed, that is, having sections of other class units or breaks in between them.
     * 
     */
    @JsonProperty("allowDiscontinuity")
    public void setAllowDiscontinuity(Boolean allowDiscontinuity) {
        this.allowDiscontinuity = allowDiscontinuity;
    }

}
