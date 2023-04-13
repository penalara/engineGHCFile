
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
     * ConditionTypeWithTime
     * <p>
     * Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("minimumTeaching")
    @JsonPropertyDescription("Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.")
    private ConditionTypeWithTime minimumTeaching;
    /**
     * ConditionTypeWithTime
     * <p>
     * Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("maximumTeaching")
    @JsonPropertyDescription("Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.")
    private ConditionTypeWithTime maximumTeaching;
    /**
     * ConditionTypeWithTime
     * <p>
     * Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("minimumOccupancy")
    @JsonPropertyDescription("Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.")
    private ConditionTypeWithTime minimumOccupancy;
    /**
     * ConditionTypeWithTime
     * <p>
     * Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("maximumOccupancy")
    @JsonPropertyDescription("Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.")
    private ConditionTypeWithTime maximumOccupancy;

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
     * ConditionTypeWithTime
     * <p>
     * Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("minimumTeaching")
    public ConditionTypeWithTime getMinimumTeaching() {
        return minimumTeaching;
    }

    /**
     * ConditionTypeWithTime
     * <p>
     * Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("minimumTeaching")
    public void setMinimumTeaching(ConditionTypeWithTime minimumTeaching) {
        this.minimumTeaching = minimumTeaching;
    }

    /**
     * ConditionTypeWithTime
     * <p>
     * Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("maximumTeaching")
    public ConditionTypeWithTime getMaximumTeaching() {
        return maximumTeaching;
    }

    /**
     * ConditionTypeWithTime
     * <p>
     * Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("maximumTeaching")
    public void setMaximumTeaching(ConditionTypeWithTime maximumTeaching) {
        this.maximumTeaching = maximumTeaching;
    }

    /**
     * ConditionTypeWithTime
     * <p>
     * Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("minimumOccupancy")
    public ConditionTypeWithTime getMinimumOccupancy() {
        return minimumOccupancy;
    }

    /**
     * ConditionTypeWithTime
     * <p>
     * Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("minimumOccupancy")
    public void setMinimumOccupancy(ConditionTypeWithTime minimumOccupancy) {
        this.minimumOccupancy = minimumOccupancy;
    }

    /**
     * ConditionTypeWithTime
     * <p>
     * Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("maximumOccupancy")
    public ConditionTypeWithTime getMaximumOccupancy() {
        return maximumOccupancy;
    }

    /**
     * ConditionTypeWithTime
     * <p>
     * Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("maximumOccupancy")
    public void setMaximumOccupancy(ConditionTypeWithTime maximumOccupancy) {
        this.maximumOccupancy = maximumOccupancy;
    }

}
