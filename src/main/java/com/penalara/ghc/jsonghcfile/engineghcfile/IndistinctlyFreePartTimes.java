
package com.penalara.ghc.jsonghcfile.engineghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * IndistinctlyFreePartTimes
 * <p>
 * Free mornings or evenings indistinctly.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "strict",
    "preferable"
})
public class IndistinctlyFreePartTimes {

    /**
     * Strict number of mornings or afternoons indistinctly off.
     * 
     */
    @JsonProperty("strict")
    @JsonPropertyDescription("Strict number of mornings or afternoons indistinctly off.")
    private Integer strict;
    /**
     * Preferable number of mornings or afternoons indistinctly off.
     * 
     */
    @JsonProperty("preferable")
    @JsonPropertyDescription("Preferable number of mornings or afternoons indistinctly off.")
    private Integer preferable;

    /**
     * No args constructor for use in serialization
     * 
     */
    public IndistinctlyFreePartTimes() {
    }

    /**
     * 
     * @param preferable
     *     Preferable number of mornings or afternoons indistinctly off.
     * @param strict
     *     Strict number of mornings or afternoons indistinctly off.
     */
    public IndistinctlyFreePartTimes(Integer strict, Integer preferable) {
        super();
        this.strict = strict;
        this.preferable = preferable;
    }

    /**
     * Strict number of mornings or afternoons indistinctly off.
     * 
     */
    @JsonProperty("strict")
    public Integer getStrict() {
        return strict;
    }

    /**
     * Strict number of mornings or afternoons indistinctly off.
     * 
     */
    @JsonProperty("strict")
    public void setStrict(Integer strict) {
        this.strict = strict;
    }

    /**
     * Preferable number of mornings or afternoons indistinctly off.
     * 
     */
    @JsonProperty("preferable")
    public Integer getPreferable() {
        return preferable;
    }

    /**
     * Preferable number of mornings or afternoons indistinctly off.
     * 
     */
    @JsonProperty("preferable")
    public void setPreferable(Integer preferable) {
        this.preferable = preferable;
    }

}
