
package com.penalara.ghc.jsonghcfile.engineghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * VariablePeriods
 * <p>
 * The total of the class units of the distribution are divided between the periods.Properties 'weeklyStable' and 'weeklyVariable' are mutually exclusive.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "totalTime",
    "maximunTimeInPeriod",
    "minimnunTimeInPeriod"
})
public class VariablePeriods {

    /**
     * Total number of minutes must asigned the sesion
     * 
     */
    @JsonProperty("totalTime")
    @JsonPropertyDescription("Total number of minutes must asigned the sesion")
    private Integer totalTime = 0;
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
     * Total number of minutes must asigned the sesion
     * 
     */
    @JsonProperty("totalTime")
    public Integer getTotalTime() {
        return totalTime;
    }

    /**
     * Total number of minutes must asigned the sesion
     * 
     */
    @JsonProperty("totalTime")
    public void setTotalTime(Integer totalTime) {
        this.totalTime = totalTime;
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
