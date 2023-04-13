
package com.penalara.ghc.jsonghcfile.engineghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NonClassSessionSettings
 * <p>
 * Settings of the meeting.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "computeForMaxMinOccupancy",
    "samePositionEveryPeriod"
})
public class NonClassSessionSettings {

    /**
     *  It indicates whether the class unit counts for the maximum and minimum daily teacher occupancy. By default, the engine computes class units with students.
     * 
     */
    @JsonProperty("computeForMaxMinOccupancy")
    @JsonPropertyDescription(" It indicates whether the class unit counts for the maximum and minimum daily teacher occupancy. By default, the engine computes class units with students.")
    private Boolean computeForMaxMinOccupancy = false;
    /**
     * SamePositionEveryPeriod
     * <p>
     * Keep the same position every week or period for the class units.
     * 
     */
    @JsonProperty("samePositionEveryPeriod")
    @JsonPropertyDescription("Keep the same position every week or period for the class units.")
    private SamePositionEveryPeriod samePositionEveryPeriod = SamePositionEveryPeriod.fromValue("ignore");

    /**
     *  It indicates whether the class unit counts for the maximum and minimum daily teacher occupancy. By default, the engine computes class units with students.
     * 
     */
    @JsonProperty("computeForMaxMinOccupancy")
    public Boolean getComputeForMaxMinOccupancy() {
        return computeForMaxMinOccupancy;
    }

    /**
     *  It indicates whether the class unit counts for the maximum and minimum daily teacher occupancy. By default, the engine computes class units with students.
     * 
     */
    @JsonProperty("computeForMaxMinOccupancy")
    public void setComputeForMaxMinOccupancy(Boolean computeForMaxMinOccupancy) {
        this.computeForMaxMinOccupancy = computeForMaxMinOccupancy;
    }

    /**
     * SamePositionEveryPeriod
     * <p>
     * Keep the same position every week or period for the class units.
     * 
     */
    @JsonProperty("samePositionEveryPeriod")
    public SamePositionEveryPeriod getSamePositionEveryPeriod() {
        return samePositionEveryPeriod;
    }

    /**
     * SamePositionEveryPeriod
     * <p>
     * Keep the same position every week or period for the class units.
     * 
     */
    @JsonProperty("samePositionEveryPeriod")
    public void setSamePositionEveryPeriod(SamePositionEveryPeriod samePositionEveryPeriod) {
        this.samePositionEveryPeriod = samePositionEveryPeriod;
    }

}
