
package com.penalara.ghc.jsonghcfile.engineghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AfternoonFreePartTimes
 * <p>
 * Afternoons off.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "strict",
    "preferable"
})
public class AfternoonFreePartTimes {

    /**
     * Strict number of afternoons off..
     * 
     */
    @JsonProperty("strict")
    @JsonPropertyDescription("Strict number of afternoons off..")
    private Integer strict;
    /**
     * Preferable number of afternoons off.
     * 
     */
    @JsonProperty("preferable")
    @JsonPropertyDescription("Preferable number of afternoons off.")
    private Integer preferable;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AfternoonFreePartTimes() {
    }

    /**
     * 
     * @param preferable
     *     Preferable number of afternoons off.
     * @param strict
     *     Strict number of afternoons off..
     */
    public AfternoonFreePartTimes(Integer strict, Integer preferable) {
        super();
        this.strict = strict;
        this.preferable = preferable;
    }

    /**
     * Strict number of afternoons off..
     * 
     */
    @JsonProperty("strict")
    public Integer getStrict() {
        return strict;
    }

    /**
     * Strict number of afternoons off..
     * 
     */
    @JsonProperty("strict")
    public void setStrict(Integer strict) {
        this.strict = strict;
    }

    /**
     * Preferable number of afternoons off.
     * 
     */
    @JsonProperty("preferable")
    public Integer getPreferable() {
        return preferable;
    }

    /**
     * Preferable number of afternoons off.
     * 
     */
    @JsonProperty("preferable")
    public void setPreferable(Integer preferable) {
        this.preferable = preferable;
    }

}
