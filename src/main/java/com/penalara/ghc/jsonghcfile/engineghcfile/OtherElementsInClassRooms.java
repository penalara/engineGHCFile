
package com.penalara.ghc.jsonghcfile.engineghcfile;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OtherElementsInClassRooms
 * <p>
 * It contains interrelated elements that are present in the session in addition to the main ones.If a subject reference is not included, or of the other elements of the session (teacher and/or group), the relationship is understood by default with the corresponding main element of the session.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "refSubject",
    "refTeacher",
    "refGroup",
    "refTask"
})
public class OtherElementsInClassRooms {

    /**
     * SubjectReference
     * <p>
     * Identifier name of other subject in the classroom.
     * 
     */
    @JsonProperty("refSubject")
    @JsonPropertyDescription("Identifier name of other subject in the classroom.")
    private String refSubject;
    /**
     * TeacherReference
     * <p>
     * Identifier name of other teacher in the classroom.
     * 
     */
    @JsonProperty("refTeacher")
    @JsonPropertyDescription("Identifier name of other teacher in the classroom.")
    private String refTeacher;
    /**
     * GroupReferenceType
     * <p>
     * Contains the reference to a group of the session, and optionally, the number of students of the group that attend the session.
     * 
     */
    @JsonProperty("refGroup")
    @JsonPropertyDescription("Contains the reference to a group of the session, and optionally, the number of students of the group that attend the session.")
    private GroupReferenceType refGroup;
    /**
     * TaskReference
     * <p>
     * Identifier name of the task of the other teacher.
     * 
     */
    @JsonProperty("refTask")
    @JsonPropertyDescription("Identifier name of the task of the other teacher.")
    private String refTask;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * SubjectReference
     * <p>
     * Identifier name of other subject in the classroom.
     * 
     */
    @JsonProperty("refSubject")
    public String getRefSubject() {
        return refSubject;
    }

    /**
     * SubjectReference
     * <p>
     * Identifier name of other subject in the classroom.
     * 
     */
    @JsonProperty("refSubject")
    public void setRefSubject(String refSubject) {
        this.refSubject = refSubject;
    }

    /**
     * TeacherReference
     * <p>
     * Identifier name of other teacher in the classroom.
     * 
     */
    @JsonProperty("refTeacher")
    public String getRefTeacher() {
        return refTeacher;
    }

    /**
     * TeacherReference
     * <p>
     * Identifier name of other teacher in the classroom.
     * 
     */
    @JsonProperty("refTeacher")
    public void setRefTeacher(String refTeacher) {
        this.refTeacher = refTeacher;
    }

    /**
     * GroupReferenceType
     * <p>
     * Contains the reference to a group of the session, and optionally, the number of students of the group that attend the session.
     * 
     */
    @JsonProperty("refGroup")
    public GroupReferenceType getRefGroup() {
        return refGroup;
    }

    /**
     * GroupReferenceType
     * <p>
     * Contains the reference to a group of the session, and optionally, the number of students of the group that attend the session.
     * 
     */
    @JsonProperty("refGroup")
    public void setRefGroup(GroupReferenceType refGroup) {
        this.refGroup = refGroup;
    }

    /**
     * TaskReference
     * <p>
     * Identifier name of the task of the other teacher.
     * 
     */
    @JsonProperty("refTask")
    public String getRefTask() {
        return refTask;
    }

    /**
     * TaskReference
     * <p>
     * Identifier name of the task of the other teacher.
     * 
     */
    @JsonProperty("refTask")
    public void setRefTask(String refTask) {
        this.refTask = refTask;
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
