
package com.penalara.ghc.jsonghcfile.engineghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EngineSettings
 * <p>
 * Customised engine configuration parameters.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "teacherBalance",
    "countGapsAroundMidday"
})
public class EngineSettings {

    /**
     * It indicates whether the optimiser should balance the timetables of different teachers, to avoid very bad timetables for a particular teacher.
     * 
     */
    @JsonProperty("teacherBalance")
    @JsonPropertyDescription("It indicates whether the optimiser should balance the timetables of different teachers, to avoid very bad timetables for a particular teacher.")
    private Boolean teacherBalance = true;
    /**
     * It indicates, in the case of a split day (with a noon pause), that the unoccupied intervals between the morning and afternoon class units should be counted. This option affects the weighting in the teacher's optimisation of the gaps in their timetable.
     * 
     */
    @JsonProperty("countGapsAroundMidday")
    @JsonPropertyDescription("It indicates, in the case of a split day (with a noon pause), that the unoccupied intervals between the morning and afternoon class units should be counted. This option affects the weighting in the teacher's optimisation of the gaps in their timetable.")
    private Boolean countGapsAroundMidday = true;

    /**
     * It indicates whether the optimiser should balance the timetables of different teachers, to avoid very bad timetables for a particular teacher.
     * 
     */
    @JsonProperty("teacherBalance")
    public Boolean getTeacherBalance() {
        return teacherBalance;
    }

    /**
     * It indicates whether the optimiser should balance the timetables of different teachers, to avoid very bad timetables for a particular teacher.
     * 
     */
    @JsonProperty("teacherBalance")
    public void setTeacherBalance(Boolean teacherBalance) {
        this.teacherBalance = teacherBalance;
    }

    /**
     * It indicates, in the case of a split day (with a noon pause), that the unoccupied intervals between the morning and afternoon class units should be counted. This option affects the weighting in the teacher's optimisation of the gaps in their timetable.
     * 
     */
    @JsonProperty("countGapsAroundMidday")
    public Boolean getCountGapsAroundMidday() {
        return countGapsAroundMidday;
    }

    /**
     * It indicates, in the case of a split day (with a noon pause), that the unoccupied intervals between the morning and afternoon class units should be counted. This option affects the weighting in the teacher's optimisation of the gaps in their timetable.
     * 
     */
    @JsonProperty("countGapsAroundMidday")
    public void setCountGapsAroundMidday(Boolean countGapsAroundMidday) {
        this.countGapsAroundMidday = countGapsAroundMidday;
    }

}
