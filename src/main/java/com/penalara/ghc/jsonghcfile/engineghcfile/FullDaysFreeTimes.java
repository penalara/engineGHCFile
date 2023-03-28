
package com.penalara.ghc.jsonghcfile.engineghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * FullDaysFreeTimes
 * <p>
 * Teacher's full days of free time.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "strictDays",
    "preferredDays"
})
public class FullDaysFreeTimes {

    /**
     * Number of strict days when teacher should be free.
     * 
     */
    @JsonProperty("strictDays")
    @JsonPropertyDescription("Number of strict days when teacher should be free.")
    private Integer strictDays = 0;
    /**
     * Number of preferred days when teacher should be free.
     * 
     */
    @JsonProperty("preferredDays")
    @JsonPropertyDescription("Number of preferred days when teacher should be free.")
    private Integer preferredDays = 0;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FullDaysFreeTimes() {
    }

    /**
     * 
     * @param strictDays
     *     Number of strict days when teacher should be free.
     * @param preferredDays
     *     Number of preferred days when teacher should be free.
     */
    public FullDaysFreeTimes(Integer strictDays, Integer preferredDays) {
        super();
        this.strictDays = strictDays;
        this.preferredDays = preferredDays;
    }

    /**
     * Number of strict days when teacher should be free.
     * 
     */
    @JsonProperty("strictDays")
    public Integer getStrictDays() {
        return strictDays;
    }

    /**
     * Number of strict days when teacher should be free.
     * 
     */
    @JsonProperty("strictDays")
    public void setStrictDays(Integer strictDays) {
        this.strictDays = strictDays;
    }

    /**
     * Number of preferred days when teacher should be free.
     * 
     */
    @JsonProperty("preferredDays")
    public Integer getPreferredDays() {
        return preferredDays;
    }

    /**
     * Number of preferred days when teacher should be free.
     * 
     */
    @JsonProperty("preferredDays")
    public void setPreferredDays(Integer preferredDays) {
        this.preferredDays = preferredDays;
    }

}
