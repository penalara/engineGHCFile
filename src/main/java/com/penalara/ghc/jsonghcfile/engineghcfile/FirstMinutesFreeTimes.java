
package com.penalara.ghc.jsonghcfile.engineghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * FirstMinutesFreeTimes
 * <p>
 * Teacher's free intervals at the beginning of the day.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "strictDays",
    "preferredDays",
    "minutes"
})
public class FirstMinutesFreeTimes {

    /**
     * Strict number of days on which the teacher must have the interval free at the beginning of the day.
     * 
     */
    @JsonProperty("strictDays")
    @JsonPropertyDescription("Strict number of days on which the teacher must have the interval free at the beginning of the day.")
    private Integer strictDays = 0;
    /**
     * Preferred number of days on which the teacher should have the interval free at the beginning of the day.
     * 
     */
    @JsonProperty("preferredDays")
    @JsonPropertyDescription("Preferred number of days on which the teacher should have the interval free at the beginning of the day.")
    private Integer preferredDays = 0;
    /**
     * Minutes of free time at the beginning of the day.
     * (Required)
     * 
     */
    @JsonProperty("minutes")
    @JsonPropertyDescription("Minutes of free time at the beginning of the day.")
    private Integer minutes;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FirstMinutesFreeTimes() {
    }

    /**
     * 
     * @param minutes
     *     Minutes of free time at the beginning of the day.
     * @param strictDays
     *     Strict number of days on which the teacher must have the interval free at the beginning of the day.
     * @param preferredDays
     *     Preferred number of days on which the teacher should have the interval free at the beginning of the day.
     */
    public FirstMinutesFreeTimes(Integer strictDays, Integer preferredDays, Integer minutes) {
        super();
        this.strictDays = strictDays;
        this.preferredDays = preferredDays;
        this.minutes = minutes;
    }

    /**
     * Strict number of days on which the teacher must have the interval free at the beginning of the day.
     * 
     */
    @JsonProperty("strictDays")
    public Integer getStrictDays() {
        return strictDays;
    }

    /**
     * Strict number of days on which the teacher must have the interval free at the beginning of the day.
     * 
     */
    @JsonProperty("strictDays")
    public void setStrictDays(Integer strictDays) {
        this.strictDays = strictDays;
    }

    /**
     * Preferred number of days on which the teacher should have the interval free at the beginning of the day.
     * 
     */
    @JsonProperty("preferredDays")
    public Integer getPreferredDays() {
        return preferredDays;
    }

    /**
     * Preferred number of days on which the teacher should have the interval free at the beginning of the day.
     * 
     */
    @JsonProperty("preferredDays")
    public void setPreferredDays(Integer preferredDays) {
        this.preferredDays = preferredDays;
    }

    /**
     * Minutes of free time at the beginning of the day.
     * (Required)
     * 
     */
    @JsonProperty("minutes")
    public Integer getMinutes() {
        return minutes;
    }

    /**
     * Minutes of free time at the beginning of the day.
     * (Required)
     * 
     */
    @JsonProperty("minutes")
    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

}
