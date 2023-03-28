
package com.penalara.ghc.jsonghcfile.engineghcfile;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Frame
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "days"
})
public class Frame {

    /**
     * Frame identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Frame identifier.")
    private String id;
    /**
     * Days
     * <p>
     * List of the days in the frame
     * (Required)
     * 
     */
    @JsonProperty("days")
    @JsonPropertyDescription("List of the days in the frame")
    private List<FrameDay> days = new ArrayList<FrameDay>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Frame() {
    }

    /**
     * 
     * @param days
     *     Days. List of the days in the frame.
     * @param id
     *     Frame identifier.
     */
    public Frame(String id, List<FrameDay> days) {
        super();
        this.id = id;
        this.days = days;
    }

    /**
     * Frame identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Frame identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Days
     * <p>
     * List of the days in the frame
     * (Required)
     * 
     */
    @JsonProperty("days")
    public List<FrameDay> getDays() {
        return days;
    }

    /**
     * Days
     * <p>
     * List of the days in the frame
     * (Required)
     * 
     */
    @JsonProperty("days")
    public void setDays(List<FrameDay> days) {
        this.days = days;
    }

}
