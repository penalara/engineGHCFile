
package com.penalara.ghc.jsonghcfile.engineghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Distance
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "refBuilding",
    "minutes"
})
public class Distance {

    /**
     * Identifier of the other building that refers to the distance.
     * (Required)
     * 
     */
    @JsonProperty("refBuilding")
    @JsonPropertyDescription("Identifier of the other building that refers to the distance.")
    private String refBuilding;
    /**
     * Distance in minutes from the building of the referred building.
     * (Required)
     * 
     */
    @JsonProperty("minutes")
    @JsonPropertyDescription("Distance in minutes from the building of the referred building.")
    private Integer minutes;

    /**
     * Identifier of the other building that refers to the distance.
     * (Required)
     * 
     */
    @JsonProperty("refBuilding")
    public String getRefBuilding() {
        return refBuilding;
    }

    /**
     * Identifier of the other building that refers to the distance.
     * (Required)
     * 
     */
    @JsonProperty("refBuilding")
    public void setRefBuilding(String refBuilding) {
        this.refBuilding = refBuilding;
    }

    /**
     * Distance in minutes from the building of the referred building.
     * (Required)
     * 
     */
    @JsonProperty("minutes")
    public Integer getMinutes() {
        return minutes;
    }

    /**
     * Distance in minutes from the building of the referred building.
     * (Required)
     * 
     */
    @JsonProperty("minutes")
    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

}
