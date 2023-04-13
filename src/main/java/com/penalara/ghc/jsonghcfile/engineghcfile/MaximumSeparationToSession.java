
package com.penalara.ghc.jsonghcfile.engineghcfile;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * MaximumSeparationToSession
 * <p>
 * It contains the session identifier of the class unit to be taught with a number of days in between, and maximum days.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "refSessions",
    "days"
})
public class MaximumSeparationToSession {

    /**
     * SessionRefs
     * <p>
     * List of sessions references.
     * (Required)
     * 
     */
    @JsonProperty("refSessions")
    @JsonPropertyDescription("List of sessions references.")
    private List<Integer> refSessions = new ArrayList<Integer>();
    /**
     * Days of separation condition.
     * (Required)
     * 
     */
    @JsonProperty("days")
    @JsonPropertyDescription("Days of separation condition.")
    private Integer days;

    /**
     * SessionRefs
     * <p>
     * List of sessions references.
     * (Required)
     * 
     */
    @JsonProperty("refSessions")
    public List<Integer> getRefSessions() {
        return refSessions;
    }

    /**
     * SessionRefs
     * <p>
     * List of sessions references.
     * (Required)
     * 
     */
    @JsonProperty("refSessions")
    public void setRefSessions(List<Integer> refSessions) {
        this.refSessions = refSessions;
    }

    /**
     * Days of separation condition.
     * (Required)
     * 
     */
    @JsonProperty("days")
    public Integer getDays() {
        return days;
    }

    /**
     * Days of separation condition.
     * (Required)
     * 
     */
    @JsonProperty("days")
    public void setDays(Integer days) {
        this.days = days;
    }

}
