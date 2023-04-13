
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
 * Session
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "refFrame",
    "refMainTask",
    "refMainTeacher",
    "refMainSubject",
    "refMainGroup",
    "otherElementsInClassRooms",
    "distribution",
    "sessionClassRooms",
    "frameTemplate",
    "sessionSettings",
    "sessionRelations"
})
public class Session {

    /**
     * Session identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Session identifier.")
    private Integer id;
    /**
     * Session's frame identifier.
     * (Required)
     * 
     */
    @JsonProperty("refFrame")
    @JsonPropertyDescription("Session's frame identifier.")
    private String refFrame;
    /**
     * RefMainTask
     * <p>
     * Main Task identifier.
     * (Required)
     * 
     */
    @JsonProperty("refMainTask")
    @JsonPropertyDescription("Main Task identifier.")
    private String refMainTask;
    /**
     * RefMainTeacher
     * <p>
     * Main Teacher identifier.
     * (Required)
     * 
     */
    @JsonProperty("refMainTeacher")
    @JsonPropertyDescription("Main Teacher identifier.")
    private String refMainTeacher;
    /**
     * RefMainSubject
     * <p>
     * Identifier name of the main subject.
     * (Required)
     * 
     */
    @JsonProperty("refMainSubject")
    @JsonPropertyDescription("Identifier name of the main subject.")
    private String refMainSubject;
    /**
     * GroupReferenceType
     * <p>
     * Contains the reference to a group of the session, and optionally, the number of students of the group that attend the session.
     * (Required)
     * 
     */
    @JsonProperty("refMainGroup")
    @JsonPropertyDescription("Contains the reference to a group of the session, and optionally, the number of students of the group that attend the session.")
    private GroupReferenceType refMainGroup;
    /**
     * OtherElementsInClassRoomsList
     * <p>
     * List of other time elements in the classroom related to each other.
     * 
     */
    @JsonProperty("otherElementsInClassRooms")
    @JsonPropertyDescription("List of other time elements in the classroom related to each other.")
    private List<OtherElementsInClassRooms> otherElementsInClassRooms = new ArrayList<OtherElementsInClassRooms>();
    /**
     * Distribution
     * <p>
     * It contains information on how the class units of the session are distributed throughout the week. It must contain only one element between 'stablePeriods' and 'variablePeriods'.The 'periods' property is required if there is more than one period in the timetable. The 'stablePeriods' and 'variablePeriods' properties are mutually exclusive.
     * (Required)
     * 
     */
    @JsonProperty("distribution")
    @JsonPropertyDescription("It contains information on how the class units of the session are distributed throughout the week. It must contain only one element between 'stablePeriods' and 'variablePeriods'.")
    private Distribution distribution;
    /**
     * SessionClassRooms
     * <p>
     * It contains the information about the classrooms for the class units. At least one classroom is required for the class units.
     * (Required)
     * 
     */
    @JsonProperty("sessionClassRooms")
    @JsonPropertyDescription("It contains the information about the classrooms for the class units. At least one classroom is required for the class units.")
    private SessionClassRooms sessionClassRooms;
    /**
     * SessionFrameTemplate
     * <p>
     * Complete template of preferences.It have non-preferred sections.
     * 
     */
    @JsonProperty("frameTemplate")
    @JsonPropertyDescription("Complete template of preferences.")
    private List<SessionSectionPreference> frameTemplate = new ArrayList<SessionSectionPreference>();
    /**
     * SessionSettings
     * <p>
     * Conditions on the position of the class unit.
     * 
     */
    @JsonProperty("sessionSettings")
    @JsonPropertyDescription("Conditions on the position of the class unit.")
    private SessionSettings sessionSettings;
    /**
     * SessionRelations
     * <p>
     * It contains information on the relationships between this and other class units. These conditions can only apply to class units with students.
     * 
     */
    @JsonProperty("sessionRelations")
    @JsonPropertyDescription("It contains information on the relationships between this and other class units. These conditions can only apply to class units with students.")
    private SessionRelations sessionRelations;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Session identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * Session identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Session's frame identifier.
     * (Required)
     * 
     */
    @JsonProperty("refFrame")
    public String getRefFrame() {
        return refFrame;
    }

    /**
     * Session's frame identifier.
     * (Required)
     * 
     */
    @JsonProperty("refFrame")
    public void setRefFrame(String refFrame) {
        this.refFrame = refFrame;
    }

    /**
     * RefMainTask
     * <p>
     * Main Task identifier.
     * (Required)
     * 
     */
    @JsonProperty("refMainTask")
    public String getRefMainTask() {
        return refMainTask;
    }

    /**
     * RefMainTask
     * <p>
     * Main Task identifier.
     * (Required)
     * 
     */
    @JsonProperty("refMainTask")
    public void setRefMainTask(String refMainTask) {
        this.refMainTask = refMainTask;
    }

    /**
     * RefMainTeacher
     * <p>
     * Main Teacher identifier.
     * (Required)
     * 
     */
    @JsonProperty("refMainTeacher")
    public String getRefMainTeacher() {
        return refMainTeacher;
    }

    /**
     * RefMainTeacher
     * <p>
     * Main Teacher identifier.
     * (Required)
     * 
     */
    @JsonProperty("refMainTeacher")
    public void setRefMainTeacher(String refMainTeacher) {
        this.refMainTeacher = refMainTeacher;
    }

    /**
     * RefMainSubject
     * <p>
     * Identifier name of the main subject.
     * (Required)
     * 
     */
    @JsonProperty("refMainSubject")
    public String getRefMainSubject() {
        return refMainSubject;
    }

    /**
     * RefMainSubject
     * <p>
     * Identifier name of the main subject.
     * (Required)
     * 
     */
    @JsonProperty("refMainSubject")
    public void setRefMainSubject(String refMainSubject) {
        this.refMainSubject = refMainSubject;
    }

    /**
     * GroupReferenceType
     * <p>
     * Contains the reference to a group of the session, and optionally, the number of students of the group that attend the session.
     * (Required)
     * 
     */
    @JsonProperty("refMainGroup")
    public GroupReferenceType getRefMainGroup() {
        return refMainGroup;
    }

    /**
     * GroupReferenceType
     * <p>
     * Contains the reference to a group of the session, and optionally, the number of students of the group that attend the session.
     * (Required)
     * 
     */
    @JsonProperty("refMainGroup")
    public void setRefMainGroup(GroupReferenceType refMainGroup) {
        this.refMainGroup = refMainGroup;
    }

    /**
     * OtherElementsInClassRoomsList
     * <p>
     * List of other time elements in the classroom related to each other.
     * 
     */
    @JsonProperty("otherElementsInClassRooms")
    public List<OtherElementsInClassRooms> getOtherElementsInClassRooms() {
        return otherElementsInClassRooms;
    }

    /**
     * OtherElementsInClassRoomsList
     * <p>
     * List of other time elements in the classroom related to each other.
     * 
     */
    @JsonProperty("otherElementsInClassRooms")
    public void setOtherElementsInClassRooms(List<OtherElementsInClassRooms> otherElementsInClassRooms) {
        this.otherElementsInClassRooms = otherElementsInClassRooms;
    }

    /**
     * Distribution
     * <p>
     * It contains information on how the class units of the session are distributed throughout the week. It must contain only one element between 'stablePeriods' and 'variablePeriods'.The 'periods' property is required if there is more than one period in the timetable. The 'stablePeriods' and 'variablePeriods' properties are mutually exclusive.
     * (Required)
     * 
     */
    @JsonProperty("distribution")
    public Distribution getDistribution() {
        return distribution;
    }

    /**
     * Distribution
     * <p>
     * It contains information on how the class units of the session are distributed throughout the week. It must contain only one element between 'stablePeriods' and 'variablePeriods'.The 'periods' property is required if there is more than one period in the timetable. The 'stablePeriods' and 'variablePeriods' properties are mutually exclusive.
     * (Required)
     * 
     */
    @JsonProperty("distribution")
    public void setDistribution(Distribution distribution) {
        this.distribution = distribution;
    }

    /**
     * SessionClassRooms
     * <p>
     * It contains the information about the classrooms for the class units. At least one classroom is required for the class units.
     * (Required)
     * 
     */
    @JsonProperty("sessionClassRooms")
    public SessionClassRooms getSessionClassRooms() {
        return sessionClassRooms;
    }

    /**
     * SessionClassRooms
     * <p>
     * It contains the information about the classrooms for the class units. At least one classroom is required for the class units.
     * (Required)
     * 
     */
    @JsonProperty("sessionClassRooms")
    public void setSessionClassRooms(SessionClassRooms sessionClassRooms) {
        this.sessionClassRooms = sessionClassRooms;
    }

    /**
     * SessionFrameTemplate
     * <p>
     * Complete template of preferences.It have non-preferred sections.
     * 
     */
    @JsonProperty("frameTemplate")
    public List<SessionSectionPreference> getFrameTemplate() {
        return frameTemplate;
    }

    /**
     * SessionFrameTemplate
     * <p>
     * Complete template of preferences.It have non-preferred sections.
     * 
     */
    @JsonProperty("frameTemplate")
    public void setFrameTemplate(List<SessionSectionPreference> frameTemplate) {
        this.frameTemplate = frameTemplate;
    }

    /**
     * SessionSettings
     * <p>
     * Conditions on the position of the class unit.
     * 
     */
    @JsonProperty("sessionSettings")
    public SessionSettings getSessionSettings() {
        return sessionSettings;
    }

    /**
     * SessionSettings
     * <p>
     * Conditions on the position of the class unit.
     * 
     */
    @JsonProperty("sessionSettings")
    public void setSessionSettings(SessionSettings sessionSettings) {
        this.sessionSettings = sessionSettings;
    }

    /**
     * SessionRelations
     * <p>
     * It contains information on the relationships between this and other class units. These conditions can only apply to class units with students.
     * 
     */
    @JsonProperty("sessionRelations")
    public SessionRelations getSessionRelations() {
        return sessionRelations;
    }

    /**
     * SessionRelations
     * <p>
     * It contains information on the relationships between this and other class units. These conditions can only apply to class units with students.
     * 
     */
    @JsonProperty("sessionRelations")
    public void setSessionRelations(SessionRelations sessionRelations) {
        this.sessionRelations = sessionRelations;
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
