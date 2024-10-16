
package com.penalara.ghc.jsonghcfile.engineghcfile;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TimeAllocation
 * <p>
 * Contains the specification of how the total time must be allocated within the days of the framework and should be distributed across the period or periods.Only one property must be specified.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "stableTiming",
    "variableTiming"
})
public class TimeAllocation {

    /**
     * StableTiming
     * <p>
     * It contains the fixed way of allocating time across the days of the period.
     * 
     */
    @JsonProperty("stableTiming")
    @JsonPropertyDescription("It contains the fixed way of allocating time across the days of the period.")
    private List<Integer> stableTiming = new ArrayList<Integer>();
    /**
     * VariableTiming
     * <p>
     * It defines the allocating time as a total of time, maximum and minimun range of sections per day.
     * 
     */
    @JsonProperty("variableTiming")
    @JsonPropertyDescription("It defines the allocating time as a total of time, maximum and minimun range of sections per day.")
    private VariableTiming variableTiming;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * StableTiming
     * <p>
     * It contains the fixed way of allocating time across the days of the period.
     * 
     */
    @JsonProperty("stableTiming")
    public List<Integer> getStableTiming() {
        return stableTiming;
    }

    /**
     * StableTiming
     * <p>
     * It contains the fixed way of allocating time across the days of the period.
     * 
     */
    @JsonProperty("stableTiming")
    public void setStableTiming(List<Integer> stableTiming) {
        this.stableTiming = stableTiming;
    }

    /**
     * VariableTiming
     * <p>
     * It defines the allocating time as a total of time, maximum and minimun range of sections per day.
     * 
     */
    @JsonProperty("variableTiming")
    public VariableTiming getVariableTiming() {
        return variableTiming;
    }

    /**
     * VariableTiming
     * <p>
     * It defines the allocating time as a total of time, maximum and minimun range of sections per day.
     * 
     */
    @JsonProperty("variableTiming")
    public void setVariableTiming(VariableTiming variableTiming) {
        this.variableTiming = variableTiming;
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
