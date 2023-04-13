
package com.penalara.ghc.jsonghcfile.engineghcfile;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AssignedSection
 * <p>
 * Section with one class units (or on call hours) assigned.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "refFrame",
    "day",
    "realIndex",
    "fictionalIndex",
    "sessionsAssigned"
})
public class AssignedSection {

    /**
     * Frame timetable section with assignment.
     * (Required)
     * 
     */
    @JsonProperty("refFrame")
    @JsonPropertyDescription("Frame timetable section with assignment.")
    private String refFrame;
    /**
     * Day of the week when the section is located.
     * (Required)
     * 
     */
    @JsonProperty("day")
    @JsonPropertyDescription("Day of the week when the section is located.")
    private Integer day;
    /**
     * Position on the day, of the real section, in the frame.
     * (Required)
     * 
     */
    @JsonProperty("realIndex")
    @JsonPropertyDescription("Position on the day, of the real section, in the frame.")
    private Integer realIndex;
    /**
     * Position on the day, of the fictional section, in the frame.The engine make the fictional sections, as a division of Real Sections.
     * (Required)
     * 
     */
    @JsonProperty("fictionalIndex")
    @JsonPropertyDescription("Position on the day, of the fictional section, in the frame.")
    private Integer fictionalIndex;
    /**
     * SessionsAssigned
     * <p>
     * List of class units and on call hours assigned in the section.
     * (Required)
     * 
     */
    @JsonProperty("sessionsAssigned")
    @JsonPropertyDescription("List of class units and on call hours assigned in the section.")
    private List<SessionAssigned> sessionsAssigned = new ArrayList<SessionAssigned>();

    /**
     * Frame timetable section with assignment.
     * (Required)
     * 
     */
    @JsonProperty("refFrame")
    public String getRefFrame() {
        return refFrame;
    }

    /**
     * Frame timetable section with assignment.
     * (Required)
     * 
     */
    @JsonProperty("refFrame")
    public void setRefFrame(String refFrame) {
        this.refFrame = refFrame;
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
     * Position on the day, of the real section, in the frame.
     * (Required)
     * 
     */
    @JsonProperty("realIndex")
    public Integer getRealIndex() {
        return realIndex;
    }

    /**
     * Position on the day, of the real section, in the frame.
     * (Required)
     * 
     */
    @JsonProperty("realIndex")
    public void setRealIndex(Integer realIndex) {
        this.realIndex = realIndex;
    }

    /**
     * Position on the day, of the fictional section, in the frame.The engine make the fictional sections, as a division of Real Sections.
     * (Required)
     * 
     */
    @JsonProperty("fictionalIndex")
    public Integer getFictionalIndex() {
        return fictionalIndex;
    }

    /**
     * Position on the day, of the fictional section, in the frame.The engine make the fictional sections, as a division of Real Sections.
     * (Required)
     * 
     */
    @JsonProperty("fictionalIndex")
    public void setFictionalIndex(Integer fictionalIndex) {
        this.fictionalIndex = fictionalIndex;
    }

    /**
     * SessionsAssigned
     * <p>
     * List of class units and on call hours assigned in the section.
     * (Required)
     * 
     */
    @JsonProperty("sessionsAssigned")
    public List<SessionAssigned> getSessionsAssigned() {
        return sessionsAssigned;
    }

    /**
     * SessionsAssigned
     * <p>
     * List of class units and on call hours assigned in the section.
     * (Required)
     * 
     */
    @JsonProperty("sessionsAssigned")
    public void setSessionsAssigned(List<SessionAssigned> sessionsAssigned) {
        this.sessionsAssigned = sessionsAssigned;
    }

}
