
package com.penalara.ghc.jsonghcfile.engineghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OptimizationWeights
 * <p>
 * This indicates the weights that the weighting options will have for the engine optimisation process. The engine shall apply default values for elements that have not been specified.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timetableGaps",
    "nonPreferredPositions",
    "sessions",
    "teachers"
})
public class OptimizationWeights {

    /**
     * TimetableGaps
     * <p>
     * It contains options related to timetable-gaps weights.
     * 
     */
    @JsonProperty("timetableGaps")
    @JsonPropertyDescription("It contains\u00a0options\u00a0related\u00a0to\u00a0timetable-gaps\u00a0weights.")
    private TimetableGaps timetableGaps;
    /**
     * NonPreferredPositionsOptimization
     * <p>
     * It contains options related to allocation in non-preferred sections.
     * 
     */
    @JsonProperty("nonPreferredPositions")
    @JsonPropertyDescription("It contains\u00a0options\u00a0related\u00a0to\u00a0allocation\u00a0in\u00a0non-preferred\u00a0sections.")
    private NonPreferredPositionsOptimization nonPreferredPositions;
    /**
     * SessionsOptimization
     * <p>
     * It contains options related to optimisable conditions for sessions.
     * 
     */
    @JsonProperty("sessions")
    @JsonPropertyDescription("It contains options related to optimisable conditions for sessions.")
    private SessionsOptimization sessions;
    /**
     * TeachersOptimization
     * <p>
     * It contains options related to optimisable conditions for teachers.
     * 
     */
    @JsonProperty("teachers")
    @JsonPropertyDescription("It contains options related to optimisable conditions for teachers.")
    private TeachersOptimization teachers;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OptimizationWeights() {
    }

    /**
     * 
     * @param sessions
     *     SessionsOptimization. It contains options related to optimisable conditions for sessions.
     * @param nonPreferredPositions
     *     NonPreferredPositionsOptimization. It contains options related to allocation in non-preferred sections.
     * @param timetableGaps
     *     TimetableGaps. It contains options related to timetable-gaps weights.
     * @param teachers
     *     TeachersOptimization. It contains options related to optimisable conditions for teachers.
     */
    public OptimizationWeights(TimetableGaps timetableGaps, NonPreferredPositionsOptimization nonPreferredPositions, SessionsOptimization sessions, TeachersOptimization teachers) {
        super();
        this.timetableGaps = timetableGaps;
        this.nonPreferredPositions = nonPreferredPositions;
        this.sessions = sessions;
        this.teachers = teachers;
    }

    /**
     * TimetableGaps
     * <p>
     * It contains options related to timetable-gaps weights.
     * 
     */
    @JsonProperty("timetableGaps")
    public TimetableGaps getTimetableGaps() {
        return timetableGaps;
    }

    /**
     * TimetableGaps
     * <p>
     * It contains options related to timetable-gaps weights.
     * 
     */
    @JsonProperty("timetableGaps")
    public void setTimetableGaps(TimetableGaps timetableGaps) {
        this.timetableGaps = timetableGaps;
    }

    /**
     * NonPreferredPositionsOptimization
     * <p>
     * It contains options related to allocation in non-preferred sections.
     * 
     */
    @JsonProperty("nonPreferredPositions")
    public NonPreferredPositionsOptimization getNonPreferredPositions() {
        return nonPreferredPositions;
    }

    /**
     * NonPreferredPositionsOptimization
     * <p>
     * It contains options related to allocation in non-preferred sections.
     * 
     */
    @JsonProperty("nonPreferredPositions")
    public void setNonPreferredPositions(NonPreferredPositionsOptimization nonPreferredPositions) {
        this.nonPreferredPositions = nonPreferredPositions;
    }

    /**
     * SessionsOptimization
     * <p>
     * It contains options related to optimisable conditions for sessions.
     * 
     */
    @JsonProperty("sessions")
    public SessionsOptimization getSessions() {
        return sessions;
    }

    /**
     * SessionsOptimization
     * <p>
     * It contains options related to optimisable conditions for sessions.
     * 
     */
    @JsonProperty("sessions")
    public void setSessions(SessionsOptimization sessions) {
        this.sessions = sessions;
    }

    /**
     * TeachersOptimization
     * <p>
     * It contains options related to optimisable conditions for teachers.
     * 
     */
    @JsonProperty("teachers")
    public TeachersOptimization getTeachers() {
        return teachers;
    }

    /**
     * TeachersOptimization
     * <p>
     * It contains options related to optimisable conditions for teachers.
     * 
     */
    @JsonProperty("teachers")
    public void setTeachers(TeachersOptimization teachers) {
        this.teachers = teachers;
    }

}
