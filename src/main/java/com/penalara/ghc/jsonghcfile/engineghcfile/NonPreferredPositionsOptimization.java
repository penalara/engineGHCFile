
package com.penalara.ghc.jsonghcfile.engineghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NonPreferredPositionsOptimization
 * <p>
 * It contains options related to allocation in non-preferred sections.
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
     * It indicates the weight to be placed in a non-preferential section of a group.
     * 
     */
    @JsonProperty("inGroups")
    @JsonPropertyDescription("It indicates\u00a0the\u00a0weight\u00a0to\u00a0be\u00a0placed\u00a0in\u00a0a\u00a0non-preferential\u00a0section\u00a0of\u00a0a\u00a0group.")
    private Integer inGroups = 4;
    /**
     * It indicates the weight to be placed in a non-preferential section of a teacher.
     * 
     */
    @JsonProperty("inTeachers")
    @JsonPropertyDescription("It indicates\u00a0the\u00a0weight\u00a0to\u00a0be\u00a0placed\u00a0in\u00a0a\u00a0non-preferential\u00a0section\u00a0of\u00a0a\u00a0teacher.")
    private Integer inTeachers = 3;
    /**
     * It indicates the weight to be placed in a non-preferential section of a subject or a task.
     * 
     */
    @JsonProperty("inSubjectsAndTask")
    @JsonPropertyDescription("It indicates\u00a0the\u00a0weight\u00a0to\u00a0be\u00a0placed\u00a0in\u00a0a\u00a0non-preferential\u00a0section\u00a0of\u00a0a\u00a0subject\u00a0or\u00a0a\u00a0task.")
    private Integer inSubjectsAndTask = 1;
    /**
     * Indicates the weight to be placed in a non-preferential section of a session.
     * 
     */
    @JsonProperty("inSessions")
    @JsonPropertyDescription("Indicates the weight to be placed in a non-preferential section of a session.")
    private Integer inSessions = 2;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NonPreferredPositionsOptimization() {
    }

    /**
     * 
     * @param inGroups
     *     It indicates the weight to be placed in a non-preferential section of a group.
     * @param inSessions
     *     Indicates the weight to be placed in a non-preferential section of a session.
     * @param inSubjectsAndTask
     *     It indicates the weight to be placed in a non-preferential section of a subject or a task.
     * @param inTeachers
     *     It indicates the weight to be placed in a non-preferential section of a teacher.
     */
    public NonPreferredPositionsOptimization(Integer inGroups, Integer inTeachers, Integer inSubjectsAndTask, Integer inSessions) {
        super();
        this.inGroups = inGroups;
        this.inTeachers = inTeachers;
        this.inSubjectsAndTask = inSubjectsAndTask;
        this.inSessions = inSessions;
    }

    /**
     * It indicates the weight to be placed in a non-preferential section of a group.
     * 
     */
    @JsonProperty("inGroups")
    public Integer getInGroups() {
        return inGroups;
    }

    /**
     * It indicates the weight to be placed in a non-preferential section of a group.
     * 
     */
    @JsonProperty("inGroups")
    public void setInGroups(Integer inGroups) {
        this.inGroups = inGroups;
    }

    /**
     * It indicates the weight to be placed in a non-preferential section of a teacher.
     * 
     */
    @JsonProperty("inTeachers")
    public Integer getInTeachers() {
        return inTeachers;
    }

    /**
     * It indicates the weight to be placed in a non-preferential section of a teacher.
     * 
     */
    @JsonProperty("inTeachers")
    public void setInTeachers(Integer inTeachers) {
        this.inTeachers = inTeachers;
    }

    /**
     * It indicates the weight to be placed in a non-preferential section of a subject or a task.
     * 
     */
    @JsonProperty("inSubjectsAndTask")
    public Integer getInSubjectsAndTask() {
        return inSubjectsAndTask;
    }

    /**
     * It indicates the weight to be placed in a non-preferential section of a subject or a task.
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
