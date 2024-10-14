
package com.penalara.ghc.jsonghcfile.engineghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NonPreferredPositionsOptimization
 * <p>
 * It contains options related to allocation in non-preferred sections.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "inGroups",
    "inTeachers",
    "inSubjectsAndTask",
    "inSessions"
})
public class NonPreferredPositionsOptimization {

    /**
     * It indicates the weight to be placed in a non-preferential section of a group.
     * 
     */
    @JsonProperty("inGroups")
    @JsonPropertyDescription("It indicates the weight to be placed in a non-preferential section of a group.")
    private Integer inGroups = 4;
    /**
     * It indicates the weight to be placed in a non-preferential section of a teacher.
     * 
     */
    @JsonProperty("inTeachers")
    @JsonPropertyDescription("It indicates the weight to be placed in a non-preferential section of a teacher.")
    private Integer inTeachers = 3;
    /**
     * It indicates the weight to be placed in a non-preferential section of a subject or a task.
     * 
     */
    @JsonProperty("inSubjectsAndTask")
    @JsonPropertyDescription("It indicates the weight to be placed in a non-preferential section of a subject or a task.")
    private Integer inSubjectsAndTask = 1;
    /**
     * Indicates the weight to be placed in a non-preferential section of a session.
     * 
     */
    @JsonProperty("inSessions")
    @JsonPropertyDescription("Indicates the weight to be placed in a non-preferential section of a session.")
    private Integer inSessions = 2;

    /**
     * It indicates the weight to be placed in a non-preferential section of a group.
     * 
     */
    @JsonProperty("inGroups")
    public Integer getInGroups() {
        return inGroups;
    }

    /**
     * It indicates the weight to be placed in a non-preferential section of a group.
     * 
     */
    @JsonProperty("inGroups")
    public void setInGroups(Integer inGroups) {
        this.inGroups = inGroups;
    }

    /**
     * It indicates the weight to be placed in a non-preferential section of a teacher.
     * 
     */
    @JsonProperty("inTeachers")
    public Integer getInTeachers() {
        return inTeachers;
    }

    /**
     * It indicates the weight to be placed in a non-preferential section of a teacher.
     * 
     */
    @JsonProperty("inTeachers")
    public void setInTeachers(Integer inTeachers) {
        this.inTeachers = inTeachers;
    }

    /**
     * It indicates the weight to be placed in a non-preferential section of a subject or a task.
     * 
     */
    @JsonProperty("inSubjectsAndTask")
    public Integer getInSubjectsAndTask() {
        return inSubjectsAndTask;
    }

    /**
     * It indicates the weight to be placed in a non-preferential section of a subject or a task.
     * 
     */
    @JsonProperty("inSubjectsAndTask")
    public void setInSubjectsAndTask(Integer inSubjectsAndTask) {
        this.inSubjectsAndTask = inSubjectsAndTask;
    }

    /**
     * Indicates the weight to be placed in a non-preferential section of a session.
     * 
     */
    @JsonProperty("inSessions")
    public Integer getInSessions() {
        return inSessions;
    }

    /**
     * Indicates the weight to be placed in a non-preferential section of a session.
     * 
     */
    @JsonProperty("inSessions")
    public void setInSessions(Integer inSessions) {
        this.inSessions = inSessions;
    }

}
