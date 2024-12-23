
package com.penalara.ghc.jsonghcfile.engineghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * VariablePeriods
 * <p>
 * The total of the class units of the distribution are allocation between the periods.Properties 'weeklyStable' and 'weeklyVariable' are mutually exclusive.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timing",
    "maximunTimeInPeriod",
    "minimnunTimeInPeriod"
})
public class VariablePeriods {

    /**
     * TimeAllocation
     * <p>
     * Contains the specification of how the total time must be allocated within the days of the framework and should be distributed across the period or periods.Only one property must be specified.
     * (Required)
     * 
     */
    @JsonProperty("timing")
    @JsonPropertyDescription("Contains the specification of how the total time must be allocated within the days of the framework and should be distributed across the period or periods.")
    private TimeAllocation timing;
    /**
     * Maximum number of minutes to be allocated in each Period. If not defined, it is considered that there is no maximum limit.
     * 
     */
    @JsonProperty("maximunTimeInPeriod")
    @JsonPropertyDescription("Maximum number of minutes to be allocated in each Period. If not defined, it is considered that there is no maximum limit.")
    private Integer maximunTimeInPeriod;
    /**
     * Minimum number of minutes to be allocated in each Period.
     * 
     */
    @JsonProperty("minimnunTimeInPeriod")
    @JsonPropertyDescription("Minimum number of minutes to be allocated in each Period.")
    private Integer minimnunTimeInPeriod = 0;

    /**
     * TimeAllocation
     * <p>
     * Contains the specification of how the total time must be allocated within the days of the framework and should be distributed across the period or periods.Only one property must be specified.
     * (Required)
     * 
     */
    @JsonProperty("timing")
    public TimeAllocation getTiming() {
        return timing;
    }

    /**
     * TimeAllocation
     * <p>
     * Contains the specification of how the total time must be allocated within the days of the framework and should be distributed across the period or periods.Only one property must be specified.
     * (Required)
     * 
     */
    @JsonProperty("timing")
    public void setTiming(TimeAllocation timing) {
        this.timing = timing;
    }

    /**
     * Maximum number of minutes to be allocated in each Period. If not defined, it is considered that there is no maximum limit.
     * 
     */
    @JsonProperty("maximunTimeInPeriod")
    public Integer getMaximunTimeInPeriod() {
        return maximunTimeInPeriod;
    }

    /**
     * Maximum number of minutes to be allocated in each Period. If not defined, it is considered that there is no maximum limit.
     * 
     */
    @JsonProperty("maximunTimeInPeriod")
    public void setMaximunTimeInPeriod(Integer maximunTimeInPeriod) {
        this.maximunTimeInPeriod = maximunTimeInPeriod;
    }

    /**
     * Minimum number of minutes to be allocated in each Period.
     * 
     */
    @JsonProperty("minimnunTimeInPeriod")
    public Integer getMinimnunTimeInPeriod() {
        return minimnunTimeInPeriod;
    }

    /**
     * Minimum number of minutes to be allocated in each Period.
     * 
     */
    @JsonProperty("minimnunTimeInPeriod")
    public void setMinimnunTimeInPeriod(Integer minimnunTimeInPeriod) {
        this.minimnunTimeInPeriod = minimnunTimeInPeriod;
    }

}
