
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
 * Complementary
 * <p>
 * Service of teacher`s complementary activity.It is incompatible set at same time refClassRoomToAssign and refBuilding.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "refFrame",
    "refTask",
    "refTeacher",
    "distribution",
    "frameTemplate",
    "refClassRoomToAssign",
    "refBuilding",
    "settings"
})
public class Complementary {

    /**
     * Session identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Session identifier.")
    private String id;
    /**
     * Session's frame identifier.
     * (Required)
     * 
     */
    @JsonProperty("refFrame")
    @JsonPropertyDescription("Session's frame identifier.")
    private String refFrame;
    /**
     * RefTask
     * <p>
     * Task identifier.
     * (Required)
     * 
     */
    @JsonProperty("refTask")
    @JsonPropertyDescription("Task identifier.")
    private String refTask;
    /**
     * RefTeacher
     * <p>
     * Teacher identifier.
     * (Required)
     * 
     */
    @JsonProperty("refTeacher")
    @JsonPropertyDescription("Teacher identifier.")
    private String refTeacher;
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
     * SessionFrameTemplate
     * <p>
     * Complete template of preferences.It have non-preferred sections.
     * 
     */
    @JsonProperty("frameTemplate")
    @JsonPropertyDescription("Complete template of preferences.")
    private List<SessionSectionPreference> frameTemplate = new ArrayList<SessionSectionPreference>();
    /**
     * RefClassRoomToAssign
     * <p>
     * Object, with classrooms and/or set of classrooms, where the engine should assign classroom to each class unit of the session.
     * 
     */
    @JsonProperty("refClassRoomToAssign")
    @JsonPropertyDescription("Object, with classrooms and/or set of classrooms, where the engine should assign classroom to each class unit of the session.")
    private RefClassRoomToAssign refClassRoomToAssign;
    /**
     * Building identifier of the building where the class unit takes place. This is used to know the moving time and the number of moves between buildings for teachers without specifying a classroom.It is incompatible with the other properties of 'sessionClassRooms' object.
     * 
     */
    @JsonProperty("refBuilding")
    @JsonPropertyDescription("Building identifier of the building where the class unit takes place. This is used to know the moving time and the number of moves between buildings for teachers without specifying a classroom.")
    private String refBuilding;
    /**
     * NonClassSessionSettings
     * <p>
     * Settings of the meeting.
     * 
     */
    @JsonProperty("settings")
    @JsonPropertyDescription("Settings of the meeting.")
    private NonClassSessionSettings settings;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Session identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Session identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
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
     * RefTask
     * <p>
     * Task identifier.
     * (Required)
     * 
     */
    @JsonProperty("refTask")
    public String getRefTask() {
        return refTask;
    }

    /**
     * RefTask
     * <p>
     * Task identifier.
     * (Required)
     * 
     */
    @JsonProperty("refTask")
    public void setRefTask(String refTask) {
        this.refTask = refTask;
    }

    /**
     * RefTeacher
     * <p>
     * Teacher identifier.
     * (Required)
     * 
     */
    @JsonProperty("refTeacher")
    public String getRefTeacher() {
        return refTeacher;
    }

    /**
     * RefTeacher
     * <p>
     * Teacher identifier.
     * (Required)
     * 
     */
    @JsonProperty("refTeacher")
    public void setRefTeacher(String refTeacher) {
        this.refTeacher = refTeacher;
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
     * RefClassRoomToAssign
     * <p>
     * Object, with classrooms and/or set of classrooms, where the engine should assign classroom to each class unit of the session.
     * 
     */
    @JsonProperty("refClassRoomToAssign")
    public RefClassRoomToAssign getRefClassRoomToAssign() {
        return refClassRoomToAssign;
    }

    /**
     * RefClassRoomToAssign
     * <p>
     * Object, with classrooms and/or set of classrooms, where the engine should assign classroom to each class unit of the session.
     * 
     */
    @JsonProperty("refClassRoomToAssign")
    public void setRefClassRoomToAssign(RefClassRoomToAssign refClassRoomToAssign) {
        this.refClassRoomToAssign = refClassRoomToAssign;
    }

    /**
     * Building identifier of the building where the class unit takes place. This is used to know the moving time and the number of moves between buildings for teachers without specifying a classroom.It is incompatible with the other properties of 'sessionClassRooms' object.
     * 
     */
    @JsonProperty("refBuilding")
    public String getRefBuilding() {
        return refBuilding;
    }

    /**
     * Building identifier of the building where the class unit takes place. This is used to know the moving time and the number of moves between buildings for teachers without specifying a classroom.It is incompatible with the other properties of 'sessionClassRooms' object.
     * 
     */
    @JsonProperty("refBuilding")
    public void setRefBuilding(String refBuilding) {
        this.refBuilding = refBuilding;
    }

    /**
     * NonClassSessionSettings
     * <p>
     * Settings of the meeting.
     * 
     */
    @JsonProperty("settings")
    public NonClassSessionSettings getSettings() {
        return settings;
    }

    /**
     * NonClassSessionSettings
     * <p>
     * Settings of the meeting.
     * 
     */
    @JsonProperty("settings")
    public void setSettings(NonClassSessionSettings settings) {
        this.settings = settings;
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
