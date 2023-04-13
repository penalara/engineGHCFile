
package com.penalara.ghc.jsonghcfile.engineghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * FreeTimes
 * <p>
 * It contains the free time spaces that the teacher must have.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fullDay",
    "firstMinutes",
    "lastMinutes",
    "consecutiveAnyTime"
})
public class FreeTimes {

    /**
     * FullDaysFreeTimes
     * <p>
     * Teacher's full days of free time.
     * 
     */
    @JsonProperty("fullDay")
    @JsonPropertyDescription("Teacher's full days of free time.")
    private FullDaysFreeTimes fullDay;
    /**
     * FirstMinutesFreeTimes
     * <p>
     * Teacher's free intervals at the beginning of the day.
     * 
     */
    @JsonProperty("firstMinutes")
    @JsonPropertyDescription("Teacher's free intervals at the beginning of the day.")
    private FirstMinutesFreeTimes firstMinutes;
    /**
     * LastMinutesFreeTimes
     * <p>
     * Teacher's free intervals at the end of the day.
     * 
     */
    @JsonProperty("lastMinutes")
    @JsonPropertyDescription("Teacher's free intervals at the end of the day.")
    private LastMinutesFreeTimes lastMinutes;
    /**
     * ConsecutiveAnyTimeFreeTimes
     * <p>
     * Teacher's free intervals at any time of the day.
     * 
     */
    @JsonProperty("consecutiveAnyTime")
    @JsonPropertyDescription("Teacher's free intervals at any time of the day.")
    private ConsecutiveAnyTimeFreeTimes consecutiveAnyTime;

    /**
     * FullDaysFreeTimes
     * <p>
     * Teacher's full days of free time.
     * 
     */
    @JsonProperty("fullDay")
    public FullDaysFreeTimes getFullDay() {
        return fullDay;
    }

    /**
     * FullDaysFreeTimes
     * <p>
     * Teacher's full days of free time.
     * 
     */
    @JsonProperty("fullDay")
    public void setFullDay(FullDaysFreeTimes fullDay) {
        this.fullDay = fullDay;
    }

    /**
     * FirstMinutesFreeTimes
     * <p>
     * Teacher's free intervals at the beginning of the day.
     * 
     */
    @JsonProperty("firstMinutes")
    public FirstMinutesFreeTimes getFirstMinutes() {
        return firstMinutes;
    }

    /**
     * FirstMinutesFreeTimes
     * <p>
     * Teacher's free intervals at the beginning of the day.
     * 
     */
    @JsonProperty("firstMinutes")
    public void setFirstMinutes(FirstMinutesFreeTimes firstMinutes) {
        this.firstMinutes = firstMinutes;
    }

    /**
     * LastMinutesFreeTimes
     * <p>
     * Teacher's free intervals at the end of the day.
     * 
     */
    @JsonProperty("lastMinutes")
    public LastMinutesFreeTimes getLastMinutes() {
        return lastMinutes;
    }

    /**
     * LastMinutesFreeTimes
     * <p>
     * Teacher's free intervals at the end of the day.
     * 
     */
    @JsonProperty("lastMinutes")
    public void setLastMinutes(LastMinutesFreeTimes lastMinutes) {
        this.lastMinutes = lastMinutes;
    }

    /**
     * ConsecutiveAnyTimeFreeTimes
     * <p>
     * Teacher's free intervals at any time of the day.
     * 
     */
    @JsonProperty("consecutiveAnyTime")
    public ConsecutiveAnyTimeFreeTimes getConsecutiveAnyTime() {
        return consecutiveAnyTime;
    }

    /**
     * ConsecutiveAnyTimeFreeTimes
     * <p>
     * Teacher's free intervals at any time of the day.
     * 
     */
    @JsonProperty("consecutiveAnyTime")
    public void setConsecutiveAnyTime(ConsecutiveAnyTimeFreeTimes consecutiveAnyTime) {
        this.consecutiveAnyTime = consecutiveAnyTime;
    }

}
