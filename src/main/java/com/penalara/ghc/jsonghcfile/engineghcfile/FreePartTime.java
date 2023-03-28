
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
     * No args constructor for use in serialization
     * 
     */
    public FreePartTime() {
    }

    /**
     * 
     * @param mornings
     *     MorningsFreePartTimes. Mornings off.
     * @param afternoons
     *     AfternoonFreePartTimes. Afternoons off.
     * @param indistinctly
     *     IndistinctlyFreePartTimes. Free mornings or evenings indistinctly.
     */
    public FreePartTime(MorningsFreePartTimes mornings, AfternoonFreePartTimes afternoons, IndistinctlyFreePartTimes indistinctly) {
        super();
        this.mornings = mornings;
        this.afternoons = afternoons;
        this.indistinctly = indistinctly;
    }

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
