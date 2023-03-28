
package com.penalara.ghc.jsonghcfile.engineinput;

import java.util.ArrayList;
import java.util.List;
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
    "weeklyStable",
    "weeklyVariable",
    "maximunTimeInPeriod",
    "minimnunTimeInPeriod"
})
public class VariablePeriods {

    /**
     * WeeklyStable
     * <p>
     * It contains only one possible weekly distribution. Each value is a assignation day.
     * 
     */
    @JsonProperty("weeklyStable")
    @JsonPropertyDescription("It contains only one possible weekly distribution. Each value is a assignation day.")
    private List<Integer> weeklyStable = new ArrayList<Integer>();
    /**
     * WeeklyVariable
     * <p>
     * It defines the distribution as a number of sections per week and a maximum range of sections per day.
     * 
     */
    @JsonProperty("weeklyVariable")
    @JsonPropertyDescription("It defines the distribution as a number of sections per week and a maximum range of sections per day.")
    private WeeklyVariable weeklyVariable;
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
     * No args constructor for use in serialization
     * 
     */
    public VariablePeriods() {
    }

    /**
     * 
     * @param maximunTimeInPeriod
     *     Maximum number of minutes to be allocated in each Period. If not defined, it is considered that there is no maximum limit.
     * @param minimnunTimeInPeriod
     *     Minimum number of minutes to be allocated in each Period.
     */
    public VariablePeriods(List<Integer> weeklyStable, WeeklyVariable weeklyVariable, Integer maximunTimeInPeriod, Integer minimnunTimeInPeriod) {
        super();
        this.weeklyStable = weeklyStable;
        this.weeklyVariable = weeklyVariable;
        this.maximunTimeInPeriod = maximunTimeInPeriod;
        this.minimnunTimeInPeriod = minimnunTimeInPeriod;
    }

    /**
     * WeeklyStable
     * <p>
     * It contains only one possible weekly distribution. Each value is a assignation day.
     * 
     */
    @JsonProperty("weeklyStable")
    public List<Integer> getWeeklyStable() {
        return weeklyStable;
    }

    /**
     * WeeklyStable
     * <p>
     * It contains only one possible weekly distribution. Each value is a assignation day.
     * 
     */
    @JsonProperty("weeklyStable")
    public void setWeeklyStable(List<Integer> weeklyStable) {
        this.weeklyStable = weeklyStable;
    }

    /**
     * WeeklyVariable
     * <p>
     * It defines the distribution as a number of sections per week and a maximum range of sections per day.
     * 
     */
    @JsonProperty("weeklyVariable")
    public WeeklyVariable getWeeklyVariable() {
        return weeklyVariable;
    }

    /**
     * WeeklyVariable
     * <p>
     * It defines the distribution as a number of sections per week and a maximum range of sections per day.
     * 
     */
    @JsonProperty("weeklyVariable")
    public void setWeeklyVariable(WeeklyVariable weeklyVariable) {
        this.weeklyVariable = weeklyVariable;
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
