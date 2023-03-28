
package com.penalara.ghc.jsonghcfile.engineghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * MorningsFreePartTimes
 * <p>
 * Mornings off.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "strict",
    "preferable"
})
public class MorningsFreePartTimes {

    /**
     * Strict number of mornings off.
     * 
     */
    @JsonProperty("strict")
    @JsonPropertyDescription("Strict number of mornings off.")
    private Integer strict;
    /**
     * Preferable number of mornings off.
     * 
     */
    @JsonProperty("preferable")
    @JsonPropertyDescription("Preferable number of mornings off.")
    private Integer preferable;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MorningsFreePartTimes() {
    }

    /**
     * 
     * @param preferable
     *     Preferable number of mornings off.
     * @param strict
     *     Strict number of mornings off.
     */
    public MorningsFreePartTimes(Integer strict, Integer preferable) {
        super();
        this.strict = strict;
        this.preferable = preferable;
    }

    /**
     * Strict number of mornings off.
     * 
     */
    @JsonProperty("strict")
    public Integer getStrict() {
        return strict;
    }

    /**
     * Strict number of mornings off.
     * 
     */
    @JsonProperty("strict")
    public void setStrict(Integer strict) {
        this.strict = strict;
    }

    /**
     * Preferable number of mornings off.
     * 
     */
    @JsonProperty("preferable")
    public Integer getPreferable() {
        return preferable;
    }

    /**
     * Preferable number of mornings off.
     * 
     */
    @JsonProperty("preferable")
    public void setPreferable(Integer preferable) {
        this.preferable = preferable;
    }

}
