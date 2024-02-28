
package com.penalara.ghc.jsonghcfile.engineghcfile;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ConditionOcupancy
 * <p>
 * Indicates the condition type, the total minutes, the variation with the asisted time and if the ocupancy also takes the free days or not
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "minutes",
    "isAssisted",
    "variationTime"
})
public class ConditionOcupancy {

    /**
     * ConditionType
     * <p>
     * Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.")
    private ConditionType type;
    /**
     * Custom total time in minutes for the ocupancy.
     * 
     */
    @JsonProperty("minutes")
    @JsonPropertyDescription("Custom total time in minutes for the ocupancy.")
    private Integer minutes;
    /**
     * Indicates if the field is assigned manualy or with the assisted mode
     * 
     */
    @JsonProperty("isAssisted")
    @JsonPropertyDescription("Indicates if the field is assigned manualy or with the assisted mode")
    private Boolean isAssisted;
    /**
     * time in minutes you add to the assisted time so you generate the total time
     * 
     */
    @JsonProperty("variationTime")
    @JsonPropertyDescription("time in minutes you add to the assisted time so you generate the total time")
    private Integer variationTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * ConditionType
     * <p>
     * Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("type")
    public ConditionType getType() {
        return type;
    }

    /**
     * ConditionType
     * <p>
     * Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("type")
    public void setType(ConditionType type) {
        this.type = type;
    }

    /**
     * Custom total time in minutes for the ocupancy.
     * 
     */
    @JsonProperty("minutes")
    public Integer getMinutes() {
        return minutes;
    }

    /**
     * Custom total time in minutes for the ocupancy.
     * 
     */
    @JsonProperty("minutes")
    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    /**
     * Indicates if the field is assigned manualy or with the assisted mode
     * 
     */
    @JsonProperty("isAssisted")
    public Boolean getIsAssisted() {
        return isAssisted;
    }

    /**
     * Indicates if the field is assigned manualy or with the assisted mode
     * 
     */
    @JsonProperty("isAssisted")
    public void setIsAssisted(Boolean isAssisted) {
        this.isAssisted = isAssisted;
    }

    /**
     * time in minutes you add to the assisted time so you generate the total time
     * 
     */
    @JsonProperty("variationTime")
    public Integer getVariationTime() {
        return variationTime;
    }

    /**
     * time in minutes you add to the assisted time so you generate the total time
     * 
     */
    @JsonProperty("variationTime")
    public void setVariationTime(Integer variationTime) {
        this.variationTime = variationTime;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
