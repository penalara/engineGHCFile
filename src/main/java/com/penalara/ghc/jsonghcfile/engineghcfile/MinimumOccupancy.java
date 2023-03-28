
package com.penalara.ghc.jsonghcfile.engineghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.penalara.ghc.jsonghcfile.engineinput.OcupationSettingType;
import com.penalara.ghc.jsonghcfile.engineinput.RestrictionType;


/**
 * MinimumOccupancy
 * <p>
 * Minimum teaching time of the teacher with students and other non-teaching activities indicated as eligible for calculation.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "restriction",
    "setting"
})
public class MinimumOccupancy {

    /**
     * RestrictionType
     * <p>
     * Indicate whether the incompatibility is a strict, ignore, preferred (strong optimization weight) or accordingToRule (weight according to optimization rule).
     * 
     */
    @JsonProperty("restriction")
    @JsonPropertyDescription("Indicate whether the incompatibility is a strict, ignore, preferred (strong optimization weight) or accordingToRule (weight according to optimization rule).")
    private RestrictionType restriction;
    /**
     * OcupationSettingType
     * <p>
     * Indicates whether the automatic calculation of the value must be adjusted to higher or lower. The adjustment will set with the duration of the greater section.
     * 
     */
    @JsonProperty("setting")
    @JsonPropertyDescription("Indicates whether the automatic calculation of the value must be adjusted to higher or lower. The adjustment will set with the duration of the greater section.")
    private OcupationSettingType setting;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MinimumOccupancy() {
    }

    public MinimumOccupancy(RestrictionType restriction, OcupationSettingType setting) {
        super();
        this.restriction = restriction;
        this.setting = setting;
    }

    /**
     * RestrictionType
     * <p>
     * Indicate whether the incompatibility is a strict, ignore, preferred (strong optimization weight) or accordingToRule (weight according to optimization rule).
     * 
     */
    @JsonProperty("restriction")
    public RestrictionType getRestriction() {
        return restriction;
    }

    /**
     * RestrictionType
     * <p>
     * Indicate whether the incompatibility is a strict, ignore, preferred (strong optimization weight) or accordingToRule (weight according to optimization rule).
     * 
     */
    @JsonProperty("restriction")
    public void setRestriction(RestrictionType restriction) {
        this.restriction = restriction;
    }

    /**
     * OcupationSettingType
     * <p>
     * Indicates whether the automatic calculation of the value must be adjusted to higher or lower. The adjustment will set with the duration of the greater section.
     * 
     */
    @JsonProperty("setting")
    public OcupationSettingType getSetting() {
        return setting;
    }

    /**
     * OcupationSettingType
     * <p>
     * Indicates whether the automatic calculation of the value must be adjusted to higher or lower. The adjustment will set with the duration of the greater section.
     * 
     */
    @JsonProperty("setting")
    public void setSetting(OcupationSettingType setting) {
        this.setting = setting;
    }

}
