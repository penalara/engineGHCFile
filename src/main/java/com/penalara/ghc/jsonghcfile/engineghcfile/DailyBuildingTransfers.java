
package com.penalara.ghc.jsonghcfile.engineghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DailyBuildingTransfers
 * <p>
 * Maximum number of movements between buildings that the teacher can make per day.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "strict",
    "preferable"
})
public class DailyBuildingTransfers {

    /**
     * Strict maximum number of movements per day.
     * 
     */
    @JsonProperty("strict")
    @JsonPropertyDescription("Strict maximum number of movements per day.")
    private Integer strict;
    /**
     * Maximum number of movements per day that can be weighted/preferred.
     * 
     */
    @JsonProperty("preferable")
    @JsonPropertyDescription("Maximum number of movements per day that can be weighted/preferred.")
    private Integer preferable;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DailyBuildingTransfers() {
    }

    /**
     * 
     * @param preferable
     *     Maximum number of movements per day that can be weighted/preferred.
     * @param strict
     *     Strict maximum number of movements per day.
     */
    public DailyBuildingTransfers(Integer strict, Integer preferable) {
        super();
        this.strict = strict;
        this.preferable = preferable;
    }

    /**
     * Strict maximum number of movements per day.
     * 
     */
    @JsonProperty("strict")
    public Integer getStrict() {
        return strict;
    }

    /**
     * Strict maximum number of movements per day.
     * 
     */
    @JsonProperty("strict")
    public void setStrict(Integer strict) {
        this.strict = strict;
    }

    /**
     * Maximum number of movements per day that can be weighted/preferred.
     * 
     */
    @JsonProperty("preferable")
    public Integer getPreferable() {
        return preferable;
    }

    /**
     * Maximum number of movements per day that can be weighted/preferred.
     * 
     */
    @JsonProperty("preferable")
    public void setPreferable(Integer preferable) {
        this.preferable = preferable;
    }

}
