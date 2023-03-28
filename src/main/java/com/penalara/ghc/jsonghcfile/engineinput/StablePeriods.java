
package com.penalara.ghc.jsonghcfile.engineinput;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * StablePeriods
 * <p>
 * The distribution of the class unit of the session is the same in each period.Only one property must be specified.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "weeklyStable",
    "weeklyVariable",
    "weeklyCustom"
})
public class StablePeriods {

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
     * WeeklyCustom
     * <p>
     * It contains an array of 'WeeklyStable' distributions.
     * 
     */
    @JsonProperty("weeklyCustom")
    @JsonPropertyDescription("It contains an array of 'WeeklyStable' distributions.")
    private List<List<Integer>> weeklyCustom = new ArrayList<List<Integer>>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public StablePeriods() {
    }

    /**
     * 
     * @param weeklyCustom
     *     WeeklyCustom. It contains an array of 'WeeklyStable' distributions.
     */
    public StablePeriods(List<Integer> weeklyStable, WeeklyVariable weeklyVariable, List<List<Integer>> weeklyCustom) {
        super();
        this.weeklyStable = weeklyStable;
        this.weeklyVariable = weeklyVariable;
        this.weeklyCustom = weeklyCustom;
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
     * WeeklyCustom
     * <p>
     * It contains an array of 'WeeklyStable' distributions.
     * 
     */
    @JsonProperty("weeklyCustom")
    public List<List<Integer>> getWeeklyCustom() {
        return weeklyCustom;
    }

    /**
     * WeeklyCustom
     * <p>
     * It contains an array of 'WeeklyStable' distributions.
     * 
     */
    @JsonProperty("weeklyCustom")
    public void setWeeklyCustom(List<List<Integer>> weeklyCustom) {
        this.weeklyCustom = weeklyCustom;
    }

}
