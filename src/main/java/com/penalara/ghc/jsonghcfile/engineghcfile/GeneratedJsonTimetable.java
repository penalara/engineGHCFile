
package com.penalara.ghc.jsonghcfile.engineghcfile;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GeneratedJsonTimetable
 * <p>
 * Object with timetable specification resolved.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "anonymousClassRooms",
    "assignedSections",
    "additionalProperties"
})
public class GeneratedJsonTimetable {

    /**
     * SetOfAnonymousClassRooms
     * <p>
     * Collection with anonymous classrooms created by the engine. The classrooms are grouped by set of classrooms.
     * 
     */
    @JsonProperty("anonymousClassRooms")
    @JsonPropertyDescription("Collection with anonymous classrooms created by the engine. The classrooms are grouped by set of classrooms.")
    private List<AnonymousClassRoom> anonymousClassRooms = new ArrayList<AnonymousClassRoom>();
    /**
     * AssignedSections
     * <p>
     * List of sections assigned in the Timetable.
     * (Required)
     * 
     */
    @JsonProperty("assignedSections")
    @JsonPropertyDescription("List of sections assigned in the Timetable.")
    private List<AssignedSection> assignedSections = new ArrayList<AssignedSection>();
    @JsonProperty("additionalProperties")
    private Object additionalProperties;

    /**
     * SetOfAnonymousClassRooms
     * <p>
     * Collection with anonymous classrooms created by the engine. The classrooms are grouped by set of classrooms.
     * 
     */
    @JsonProperty("anonymousClassRooms")
    public List<AnonymousClassRoom> getAnonymousClassRooms() {
        return anonymousClassRooms;
    }

    /**
     * SetOfAnonymousClassRooms
     * <p>
     * Collection with anonymous classrooms created by the engine. The classrooms are grouped by set of classrooms.
     * 
     */
    @JsonProperty("anonymousClassRooms")
    public void setAnonymousClassRooms(List<AnonymousClassRoom> anonymousClassRooms) {
        this.anonymousClassRooms = anonymousClassRooms;
    }

    /**
     * AssignedSections
     * <p>
     * List of sections assigned in the Timetable.
     * (Required)
     * 
     */
    @JsonProperty("assignedSections")
    public List<AssignedSection> getAssignedSections() {
        return assignedSections;
    }

    /**
     * AssignedSections
     * <p>
     * List of sections assigned in the Timetable.
     * (Required)
     * 
     */
    @JsonProperty("assignedSections")
    public void setAssignedSections(List<AssignedSection> assignedSections) {
        this.assignedSections = assignedSections;
    }

    @JsonProperty("additionalProperties")
    public Object getAdditionalProperties() {
        return additionalProperties;
    }

    @JsonProperty("additionalProperties")
    public void setAdditionalProperties(Object additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

}
