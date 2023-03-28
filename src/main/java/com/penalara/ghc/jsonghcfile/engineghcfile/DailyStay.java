
package com.penalara.ghc.jsonghcfile.engineghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DailyStay
 * <p>
 * This indicates the maximum preferential and strict time of stay of the teacher, for the daily stay that the teacher can be in the educational institution.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "strict",
    "preferable",
    "countAroundMidday"
})
public class DailyStay {

    /**
     * Strict time in minutes of maximum daily stay.
     * 
     */
    @JsonProperty("strict")
    @JsonPropertyDescription("Strict time in minutes of maximum daily stay.")
    private Integer strict;
    /**
     * Ponderable Time in minutes of maximum daily stay.
     * 
     */
    @JsonProperty("preferable")
    @JsonPropertyDescription("Ponderable Time in minutes of maximum daily stay.")
    private Integer preferable;
    /**
     * It indicates, in the case of split shifts, that the unoccupied intervals between the morning and afternoon class units are counted each day.
     * 
     */
    @JsonProperty("countAroundMidday")
    @JsonPropertyDescription("It indicates, in the case of split shifts, that the unoccupied intervals between the morning and afternoon class units are counted each day.")
    private Boolean countAroundMidday = true;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DailyStay() {
    }

    /**
     * 
     * @param preferable
     *     Ponderable Time in minutes of maximum daily stay.
     * @param countAroundMidday
     *     It indicates, in the case of split shifts, that the unoccupied intervals between the morning and afternoon class units are counted each day.
     * @param strict
     *     Strict time in minutes of maximum daily stay.
     */
    public DailyStay(Integer strict, Integer preferable, Boolean countAroundMidday) {
        super();
        this.strict = strict;
        this.preferable = preferable;
        this.countAroundMidday = countAroundMidday;
    }

    /**
     * Strict time in minutes of maximum daily stay.
     * 
     */
    @JsonProperty("strict")
    public Integer getStrict() {
        return strict;
    }

    /**
     * Strict time in minutes of maximum daily stay.
     * 
     */
    @JsonProperty("strict")
    public void setStrict(Integer strict) {
        this.strict = strict;
    }

    /**
     * Ponderable Time in minutes of maximum daily stay.
     * 
     */
    @JsonProperty("preferable")
    public Integer getPreferable() {
        return preferable;
    }

    /**
     * Ponderable Time in minutes of maximum daily stay.
     * 
     */
    @JsonProperty("preferable")
    public void setPreferable(Integer preferable) {
        this.preferable = preferable;
    }

    /**
     * It indicates, in the case of split shifts, that the unoccupied intervals between the morning and afternoon class units are counted each day.
     * 
     */
    @JsonProperty("countAroundMidday")
    public Boolean getCountAroundMidday() {
        return countAroundMidday;
    }

    /**
     * It indicates, in the case of split shifts, that the unoccupied intervals between the morning and afternoon class units are counted each day.
     * 
     */
    @JsonProperty("countAroundMidday")
    public void setCountAroundMidday(Boolean countAroundMidday) {
        this.countAroundMidday = countAroundMidday;
    }

}
