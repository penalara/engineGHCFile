
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
     * MinimumTeaching
     * <p>
     * Minimum teaching time of the teacher with students.
     * 
     */
    @JsonProperty("minimumTeaching")
    @JsonPropertyDescription("Minimum teaching time of the teacher with students.")
    private MinimumTeaching minimumTeaching;
    /**
     * MaximumTeaching
     * <p>
     * Minimum teaching time of the teacher with students.
     * 
     */
    @JsonProperty("maximumTeaching")
    @JsonPropertyDescription("Minimum teaching time of the teacher with students.")
    private MaximumTeaching maximumTeaching;
    /**
     * MinimumOccupancy
     * <p>
     * Minimum teaching time of the teacher with students and other non-teaching activities indicated as eligible for calculation.
     * 
     */
    @JsonProperty("minimumOccupancy")
    @JsonPropertyDescription("Minimum teaching time of the teacher with students and other non-teaching activities indicated as eligible for calculation.")
    private MinimumOccupancy minimumOccupancy;
    /**
     * MaximumOccupancy
     * <p>
     * Maximum teaching time of the teacher with students and other non-teaching activities indicated as eligible for calculation.
     * 
     */
    @JsonProperty("maximumOccupancy")
    @JsonPropertyDescription("Maximum teaching time of the teacher with students and other non-teaching activities indicated as eligible for calculation.")
    private MaximumOccupancy maximumOccupancy;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DailyOcupation() {
    }

    /**
     * 
     * @param allowFreeDays
     *     It indicates whether checking of minimums is omitted in the case of non-assigned days. Forbidden days are never checked.
     * @param minimumOccupancy
     *     MinimumOccupancy. Minimum teaching time of the teacher with students and other non-teaching activities indicated as eligible for calculation.
     * @param maximumOccupancy
     *     MaximumOccupancy. Maximum teaching time of the teacher with students and other non-teaching activities indicated as eligible for calculation.
     * @param minimumTeaching
     *     MinimumTeaching. Minimum teaching time of the teacher with students.
     * @param maximumTeaching
     *     MaximumTeaching. Minimum teaching time of the teacher with students.
     */
    public DailyOcupation(Boolean allowFreeDays, MinimumTeaching minimumTeaching, MaximumTeaching maximumTeaching, MinimumOccupancy minimumOccupancy, MaximumOccupancy maximumOccupancy) {
        super();
        this.allowFreeDays = allowFreeDays;
        this.minimumTeaching = minimumTeaching;
        this.maximumTeaching = maximumTeaching;
        this.minimumOccupancy = minimumOccupancy;
        this.maximumOccupancy = maximumOccupancy;
    }

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
     * MinimumTeaching
     * <p>
     * Minimum teaching time of the teacher with students.
     * 
     */
    @JsonProperty("minimumTeaching")
    public MinimumTeaching getMinimumTeaching() {
        return minimumTeaching;
    }

    /**
     * MinimumTeaching
     * <p>
     * Minimum teaching time of the teacher with students.
     * 
     */
    @JsonProperty("minimumTeaching")
    public void setMinimumTeaching(MinimumTeaching minimumTeaching) {
        this.minimumTeaching = minimumTeaching;
    }

    /**
     * MaximumTeaching
     * <p>
     * Minimum teaching time of the teacher with students.
     * 
     */
    @JsonProperty("maximumTeaching")
    public MaximumTeaching getMaximumTeaching() {
        return maximumTeaching;
    }

    /**
     * MaximumTeaching
     * <p>
     * Minimum teaching time of the teacher with students.
     * 
     */
    @JsonProperty("maximumTeaching")
    public void setMaximumTeaching(MaximumTeaching maximumTeaching) {
        this.maximumTeaching = maximumTeaching;
    }

    /**
     * MinimumOccupancy
     * <p>
     * Minimum teaching time of the teacher with students and other non-teaching activities indicated as eligible for calculation.
     * 
     */
    @JsonProperty("minimumOccupancy")
    public MinimumOccupancy getMinimumOccupancy() {
        return minimumOccupancy;
    }

    /**
     * MinimumOccupancy
     * <p>
     * Minimum teaching time of the teacher with students and other non-teaching activities indicated as eligible for calculation.
     * 
     */
    @JsonProperty("minimumOccupancy")
    public void setMinimumOccupancy(MinimumOccupancy minimumOccupancy) {
        this.minimumOccupancy = minimumOccupancy;
    }

    /**
     * MaximumOccupancy
     * <p>
     * Maximum teaching time of the teacher with students and other non-teaching activities indicated as eligible for calculation.
     * 
     */
    @JsonProperty("maximumOccupancy")
    public MaximumOccupancy getMaximumOccupancy() {
        return maximumOccupancy;
    }

    /**
     * MaximumOccupancy
     * <p>
     * Maximum teaching time of the teacher with students and other non-teaching activities indicated as eligible for calculation.
     * 
     */
    @JsonProperty("maximumOccupancy")
    public void setMaximumOccupancy(MaximumOccupancy maximumOccupancy) {
        this.maximumOccupancy = maximumOccupancy;
    }

}
