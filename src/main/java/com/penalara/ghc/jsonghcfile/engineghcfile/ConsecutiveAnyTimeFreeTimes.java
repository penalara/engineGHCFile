
package com.penalara.ghc.jsonghcfile.engineghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ConsecutiveAnyTimeFreeTimes
 * <p>
 * Teacher's free intervals at any time of the day.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "strictDays",
    "preferredDays",
    "minutes"
})
public class ConsecutiveAnyTimeFreeTimes {

    /**
     * Strict number of days on which the teacher must have the interval free. 
     * 
     */
    @JsonProperty("strictDays")
    @JsonPropertyDescription("Strict number of days on which the teacher must have the interval free. ")
    private Integer strictDays = 0;
    /**
     * Preferred number of days on which the teacher should have the interval free. 
     * 
     */
    @JsonProperty("preferredDays")
    @JsonPropertyDescription("Preferred number of days on which the teacher should have the interval free. ")
    private Integer preferredDays = 0;
    /**
     * Minutes of free time interval.
     * (Required)
     * 
     */
    @JsonProperty("minutes")
    @JsonPropertyDescription("Minutes of free time interval.")
    private Integer minutes;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ConsecutiveAnyTimeFreeTimes() {
    }

    /**
     * 
     * @param minutes
     *     Minutes of free time interval.
     * @param strictDays
     *     Strict number of days on which the teacher must have the interval free. .
     * @param preferredDays
     *     Preferred number of days on which the teacher should have the interval free. .
     */
    public ConsecutiveAnyTimeFreeTimes(Integer strictDays, Integer preferredDays, Integer minutes) {
        super();
        this.strictDays = strictDays;
        this.preferredDays = preferredDays;
        this.minutes = minutes;
    }

    /**
     * Strict number of days on which the teacher must have the interval free. 
     * 
     */
    @JsonProperty("strictDays")
    public Integer getStrictDays() {
        return strictDays;
    }

    /**
     * Strict number of days on which the teacher must have the interval free. 
     * 
     */
    @JsonProperty("strictDays")
    public void setStrictDays(Integer strictDays) {
        this.strictDays = strictDays;
    }

    /**
     * Preferred number of days on which the teacher should have the interval free. 
     * 
     */
    @JsonProperty("preferredDays")
    public Integer getPreferredDays() {
        return preferredDays;
    }

    /**
     * Preferred number of days on which the teacher should have the interval free. 
     * 
     */
    @JsonProperty("preferredDays")
    public void setPreferredDays(Integer preferredDays) {
        this.preferredDays = preferredDays;
    }

    /**
     * Minutes of free time interval.
     * (Required)
     * 
     */
    @JsonProperty("minutes")
    public Integer getMinutes() {
        return minutes;
    }

    /**
     * Minutes of free time interval.
     * (Required)
     * 
     */
    @JsonProperty("minutes")
    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

}
