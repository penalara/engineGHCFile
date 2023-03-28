
package com.penalara.ghc.jsonghcfile.engineghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * BannedSectionPreference
 * <p>
 * Template with only banned section assignment preference.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "day",
    "index",
    "frame"
})
public class BannedSectionPreference {

    /**
     * Day of the week when the section is located.
     * (Required)
     * 
     */
    @JsonProperty("day")
    @JsonPropertyDescription("Day of the week when the section is located.")
    private Integer day;
    /**
     * Index built into the day where the section is located.
     * (Required)
     * 
     */
    @JsonProperty("index")
    @JsonPropertyDescription("Index built into the day where the section is located.")
    private Integer index;
    /**
     * Frame identifier.
     * (Required)
     * 
     */
    @JsonProperty("frame")
    @JsonPropertyDescription("Frame identifier.")
    private String frame;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BannedSectionPreference() {
    }

    /**
     * 
     * @param index
     *     Index built into the day where the section is located.
     * @param day
     *     Day of the week when the section is located.
     * @param frame
     *     Frame identifier.
     */
    public BannedSectionPreference(Integer day, Integer index, String frame) {
        super();
        this.day = day;
        this.index = index;
        this.frame = frame;
    }

    /**
     * Day of the week when the section is located.
     * (Required)
     * 
     */
    @JsonProperty("day")
    public Integer getDay() {
        return day;
    }

    /**
     * Day of the week when the section is located.
     * (Required)
     * 
     */
    @JsonProperty("day")
    public void setDay(Integer day) {
        this.day = day;
    }

    /**
     * Index built into the day where the section is located.
     * (Required)
     * 
     */
    @JsonProperty("index")
    public Integer getIndex() {
        return index;
    }

    /**
     * Index built into the day where the section is located.
     * (Required)
     * 
     */
    @JsonProperty("index")
    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * Frame identifier.
     * (Required)
     * 
     */
    @JsonProperty("frame")
    public String getFrame() {
        return frame;
    }

    /**
     * Frame identifier.
     * (Required)
     * 
     */
    @JsonProperty("frame")
    public void setFrame(String frame) {
        this.frame = frame;
    }

}
