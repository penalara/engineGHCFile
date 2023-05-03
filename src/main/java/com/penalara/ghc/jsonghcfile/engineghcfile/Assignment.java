
package com.penalara.ghc.jsonghcfile.engineghcfile;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Assignment
 * <p>
 * Object with list of each type of session can be assigned in the section (teaching session, meetings, complementary activities, on call services).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "teachingSessions",
    "meetings",
    "complementaryActivities",
    "onCallServices"
})
public class Assignment {

    /**
     * TeachingSessions
     * <p>
     * List of teaching sessions assigned in the section.
     * 
     */
    @JsonProperty("teachingSessions")
    @JsonPropertyDescription("List of teaching sessions assigned in the section.")
    private List<AssignedTeachingSession> teachingSessions = new ArrayList<AssignedTeachingSession>();
    /**
     * AssignedMeetings
     * <p>
     * List of meetings assigned in the section.
     * 
     */
    @JsonProperty("meetings")
    @JsonPropertyDescription("List of meetings assigned in the section.")
    private List<AssignedMeeting> meetings = new ArrayList<AssignedMeeting>();
    /**
     * ComplementaryActivitiesAssigned
     * <p>
     * List of meetings assigned in the section.
     * 
     */
    @JsonProperty("complementaryActivities")
    @JsonPropertyDescription("List of meetings assigned in the section.")
    private List<AssignedComplementary> complementaryActivities = new ArrayList<AssignedComplementary>();
    /**
     * OnCallServices
     * <p>
     * List of teaching on call hours assigned in the section.
     * 
     */
    @JsonProperty("onCallServices")
    @JsonPropertyDescription("List of teaching on call hours assigned in the section.")
    private List<AssignedOnCallService> onCallServices = new ArrayList<AssignedOnCallService>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * TeachingSessions
     * <p>
     * List of teaching sessions assigned in the section.
     * 
     */
    @JsonProperty("teachingSessions")
    public List<AssignedTeachingSession> getTeachingSessions() {
        return teachingSessions;
    }

    /**
     * TeachingSessions
     * <p>
     * List of teaching sessions assigned in the section.
     * 
     */
    @JsonProperty("teachingSessions")
    public void setTeachingSessions(List<AssignedTeachingSession> teachingSessions) {
        this.teachingSessions = teachingSessions;
    }

    /**
     * AssignedMeetings
     * <p>
     * List of meetings assigned in the section.
     * 
     */
    @JsonProperty("meetings")
    public List<AssignedMeeting> getMeetings() {
        return meetings;
    }

    /**
     * AssignedMeetings
     * <p>
     * List of meetings assigned in the section.
     * 
     */
    @JsonProperty("meetings")
    public void setMeetings(List<AssignedMeeting> meetings) {
        this.meetings = meetings;
    }

    /**
     * ComplementaryActivitiesAssigned
     * <p>
     * List of meetings assigned in the section.
     * 
     */
    @JsonProperty("complementaryActivities")
    public List<AssignedComplementary> getComplementaryActivities() {
        return complementaryActivities;
    }

    /**
     * ComplementaryActivitiesAssigned
     * <p>
     * List of meetings assigned in the section.
     * 
     */
    @JsonProperty("complementaryActivities")
    public void setComplementaryActivities(List<AssignedComplementary> complementaryActivities) {
        this.complementaryActivities = complementaryActivities;
    }

    /**
     * OnCallServices
     * <p>
     * List of teaching on call hours assigned in the section.
     * 
     */
    @JsonProperty("onCallServices")
    public List<AssignedOnCallService> getOnCallServices() {
        return onCallServices;
    }

    /**
     * OnCallServices
     * <p>
     * List of teaching on call hours assigned in the section.
     * 
     */
    @JsonProperty("onCallServices")
    public void setOnCallServices(List<AssignedOnCallService> onCallServices) {
        this.onCallServices = onCallServices;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
