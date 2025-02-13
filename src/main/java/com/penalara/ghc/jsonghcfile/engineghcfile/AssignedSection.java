
package com.penalara.ghc.jsonghcfile.engineghcfile;

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
    "startTime",
    "endTime",
    "assignment"
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
     * Start time of the section with a fictional index where sessions are assigned
     * 
     */
    @JsonProperty("startTime")
    @JsonPropertyDescription("Start time of the section with a fictional index where sessions are assigned")
    private String startTime;
    /**
     * Start time of the section with a fictional index where sessions are assigned
     * 
     */
    @JsonProperty("endTime")
    @JsonPropertyDescription("Start time of the section with a fictional index where sessions are assigned")
    private String endTime;
    /**
     * Assignment
     * <p>
     * Object with list of each type of session can be assigned in the section (teaching session, meetings, complementary activities, on call services).
     * (Required)
     * 
     */
    @JsonProperty("assignment")
    @JsonPropertyDescription("Object with list of each type of session can be assigned in the section (teaching session, meetings, complementary activities, on call services).")
    private Assignment assignment;

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
     * Start time of the section with a fictional index where sessions are assigned
     * 
     */
    @JsonProperty("startTime")
    public String getStartTime() {
        return startTime;
    }

    /**
     * Start time of the section with a fictional index where sessions are assigned
     * 
     */
    @JsonProperty("startTime")
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * Start time of the section with a fictional index where sessions are assigned
     * 
     */
    @JsonProperty("endTime")
    public String getEndTime() {
        return endTime;
    }

    /**
     * Start time of the section with a fictional index where sessions are assigned
     * 
     */
    @JsonProperty("endTime")
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * Assignment
     * <p>
     * Object with list of each type of session can be assigned in the section (teaching session, meetings, complementary activities, on call services).
     * (Required)
     * 
     */
    @JsonProperty("assignment")
    public Assignment getAssignment() {
        return assignment;
    }

    /**
     * Assignment
     * <p>
     * Object with list of each type of session can be assigned in the section (teaching session, meetings, complementary activities, on call services).
     * (Required)
     * 
     */
    @JsonProperty("assignment")
    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

}
