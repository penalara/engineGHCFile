
package com.penalara.ghc.jsonghcfile.engineghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DailyOcupation
 * <p>
 * Maximum and minimum values of teaching or activity time for teachers. This object indicates the type of condition (strict or weighting) and whether the automatic calculation in minutes in the engine should be set.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "allowFreeDays",
    "minimumTeaching",
    "maximumTeaching",
    "minimumOccupancy",
    "maximumOccupancy"
})
public class DailyOcupation {

    /**
     * It indicates whether checking of minimums is omitted in the case of non-assigned days. Forbidden days are never checked.
     * 
     */
    @JsonProperty("allowFreeDays")
    @JsonPropertyDescription("It indicates whether checking of minimums is omitted in the case of non-assigned days. Forbidden days are never checked.")
    private Boolean allowFreeDays;
    /**
     * ConditionOcupancy
     * <p>
     * Indicates the condition type, the total minutes, the variation with the asisted time and if the ocupancy also takes the free days or not
     * 
     */
    @JsonProperty("minimumTeaching")
    @JsonPropertyDescription("Indicates the condition type, the total minutes, the variation with the asisted time and if the ocupancy also takes the free days or not")
    private ConditionOcupancy minimumTeaching;
    /**
     * ConditionOcupancy
     * <p>
     * Indicates the condition type, the total minutes, the variation with the asisted time and if the ocupancy also takes the free days or not
     * 
     */
    @JsonProperty("maximumTeaching")
    @JsonPropertyDescription("Indicates the condition type, the total minutes, the variation with the asisted time and if the ocupancy also takes the free days or not")
    private ConditionOcupancy maximumTeaching;
    /**
     * ConditionOcupancy
     * <p>
     * Indicates the condition type, the total minutes, the variation with the asisted time and if the ocupancy also takes the free days or not
     * 
     */
    @JsonProperty("minimumOccupancy")
    @JsonPropertyDescription("Indicates the condition type, the total minutes, the variation with the asisted time and if the ocupancy also takes the free days or not")
    private ConditionOcupancy minimumOccupancy;
    /**
     * ConditionOcupancy
     * <p>
     * Indicates the condition type, the total minutes, the variation with the asisted time and if the ocupancy also takes the free days or not
     * 
     */
    @JsonProperty("maximumOccupancy")
    @JsonPropertyDescription("Indicates the condition type, the total minutes, the variation with the asisted time and if the ocupancy also takes the free days or not")
    private ConditionOcupancy maximumOccupancy;

    /**
     * It indicates whether checking of minimums is omitted in the case of non-assigned days. Forbidden days are never checked.
     * 
     */
    @JsonProperty("allowFreeDays")
    public Boolean getAllowFreeDays() {
        return allowFreeDays;
    }

    /**
     * It indicates whether checking of minimums is omitted in the case of non-assigned days. Forbidden days are never checked.
     * 
     */
    @JsonProperty("allowFreeDays")
    public void setAllowFreeDays(Boolean allowFreeDays) {
        this.allowFreeDays = allowFreeDays;
    }

    /**
     * ConditionOcupancy
     * <p>
     * Indicates the condition type, the total minutes, the variation with the asisted time and if the ocupancy also takes the free days or not
     * 
     */
    @JsonProperty("minimumTeaching")
    public ConditionOcupancy getMinimumTeaching() {
        return minimumTeaching;
    }

    /**
     * ConditionOcupancy
     * <p>
     * Indicates the condition type, the total minutes, the variation with the asisted time and if the ocupancy also takes the free days or not
     * 
     */
    @JsonProperty("minimumTeaching")
    public void setMinimumTeaching(ConditionOcupancy minimumTeaching) {
        this.minimumTeaching = minimumTeaching;
    }

    /**
     * ConditionOcupancy
     * <p>
     * Indicates the condition type, the total minutes, the variation with the asisted time and if the ocupancy also takes the free days or not
     * 
     */
    @JsonProperty("maximumTeaching")
    public ConditionOcupancy getMaximumTeaching() {
        return maximumTeaching;
    }

    /**
     * ConditionOcupancy
     * <p>
     * Indicates the condition type, the total minutes, the variation with the asisted time and if the ocupancy also takes the free days or not
     * 
     */
    @JsonProperty("maximumTeaching")
    public void setMaximumTeaching(ConditionOcupancy maximumTeaching) {
        this.maximumTeaching = maximumTeaching;
    }

    /**
     * ConditionOcupancy
     * <p>
     * Indicates the condition type, the total minutes, the variation with the asisted time and if the ocupancy also takes the free days or not
     * 
     */
    @JsonProperty("minimumOccupancy")
    public ConditionOcupancy getMinimumOccupancy() {
        return minimumOccupancy;
    }

    /**
     * ConditionOcupancy
     * <p>
     * Indicates the condition type, the total minutes, the variation with the asisted time and if the ocupancy also takes the free days or not
     * 
     */
    @JsonProperty("minimumOccupancy")
    public void setMinimumOccupancy(ConditionOcupancy minimumOccupancy) {
        this.minimumOccupancy = minimumOccupancy;
    }

    /**
     * ConditionOcupancy
     * <p>
     * Indicates the condition type, the total minutes, the variation with the asisted time and if the ocupancy also takes the free days or not
     * 
     */
    @JsonProperty("maximumOccupancy")
    public ConditionOcupancy getMaximumOccupancy() {
        return maximumOccupancy;
    }

    /**
     * ConditionOcupancy
     * <p>
     * Indicates the condition type, the total minutes, the variation with the asisted time and if the ocupancy also takes the free days or not
     * 
     */
    @JsonProperty("maximumOccupancy")
    public void setMaximumOccupancy(ConditionOcupancy maximumOccupancy) {
        this.maximumOccupancy = maximumOccupancy;
    }

}
