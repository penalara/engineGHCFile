
package com.penalara.ghc.jsonghcfile.engineghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TimetableGaps
 * <p>
 * It contains options related to timetable-gaps weights.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "groupGaps",
    "teacherGaps"
})
public class TimetableGaps {

    /**
     * It indicates the weight given to the fact of leaving gaps in groups' timetables.
     * 
     */
    @JsonProperty("groupGaps")
    @JsonPropertyDescription("It indicates the weight given to the fact of leaving gaps in groups' timetables.")
    private Integer groupGaps = 5;
    /**
     * It indicates the weight given to the fact of leaving gaps in teachers' timetables.
     * 
     */
    @JsonProperty("teacherGaps")
    @JsonPropertyDescription("It indicates the weight given to the fact of leaving gaps in teachers' timetables.")
    private Integer teacherGaps = 2;

    /**
     * It indicates the weight given to the fact of leaving gaps in groups' timetables.
     * 
     */
    @JsonProperty("groupGaps")
    public Integer getGroupGaps() {
        return groupGaps;
    }

    /**
     * It indicates the weight given to the fact of leaving gaps in groups' timetables.
     * 
     */
    @JsonProperty("groupGaps")
    public void setGroupGaps(Integer groupGaps) {
        this.groupGaps = groupGaps;
    }

    /**
     * It indicates the weight given to the fact of leaving gaps in teachers' timetables.
     * 
     */
    @JsonProperty("teacherGaps")
    public Integer getTeacherGaps() {
        return teacherGaps;
    }

    /**
     * It indicates the weight given to the fact of leaving gaps in teachers' timetables.
     * 
     */
    @JsonProperty("teacherGaps")
    public void setTeacherGaps(Integer teacherGaps) {
        this.teacherGaps = teacherGaps;
    }

}
