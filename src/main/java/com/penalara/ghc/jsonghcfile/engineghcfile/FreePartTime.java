
package com.penalara.ghc.jsonghcfile.engineghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * FreePartTime
 * <p>
 * Free half-time periods .
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "mornings",
    "afternoons",
    "indistinctly"
})
public class FreePartTime {

    /**
     * MorningsFreePartTimes
     * <p>
     * Mornings off.
     * 
     */
    @JsonProperty("mornings")
    @JsonPropertyDescription("Mornings off.")
    private MorningsFreePartTimes mornings;
    /**
     * AfternoonFreePartTimes
     * <p>
     * Afternoons off.
     * 
     */
    @JsonProperty("afternoons")
    @JsonPropertyDescription("Afternoons off.")
    private AfternoonFreePartTimes afternoons;
    /**
     * IndistinctlyFreePartTimes
     * <p>
     * Free mornings or evenings indistinctly.
     * 
     */
    @JsonProperty("indistinctly")
    @JsonPropertyDescription("Free mornings or evenings indistinctly.")
    private IndistinctlyFreePartTimes indistinctly;

    /**
     * MorningsFreePartTimes
     * <p>
     * Mornings off.
     * 
     */
    @JsonProperty("mornings")
    public MorningsFreePartTimes getMornings() {
        return mornings;
    }

    /**
     * MorningsFreePartTimes
     * <p>
     * Mornings off.
     * 
     */
    @JsonProperty("mornings")
    public void setMornings(MorningsFreePartTimes mornings) {
        this.mornings = mornings;
    }

    /**
     * AfternoonFreePartTimes
     * <p>
     * Afternoons off.
     * 
     */
    @JsonProperty("afternoons")
    public AfternoonFreePartTimes getAfternoons() {
        return afternoons;
    }

    /**
     * AfternoonFreePartTimes
     * <p>
     * Afternoons off.
     * 
     */
    @JsonProperty("afternoons")
    public void setAfternoons(AfternoonFreePartTimes afternoons) {
        this.afternoons = afternoons;
    }

    /**
     * IndistinctlyFreePartTimes
     * <p>
     * Free mornings or evenings indistinctly.
     * 
     */
    @JsonProperty("indistinctly")
    public IndistinctlyFreePartTimes getIndistinctly() {
        return indistinctly;
    }

    /**
     * IndistinctlyFreePartTimes
     * <p>
     * Free mornings or evenings indistinctly.
     * 
     */
    @JsonProperty("indistinctly")
    public void setIndistinctly(IndistinctlyFreePartTimes indistinctly) {
        this.indistinctly = indistinctly;
    }

}
