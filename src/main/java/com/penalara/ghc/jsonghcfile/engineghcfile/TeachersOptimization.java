
package com.penalara.ghc.jsonghcfile.engineghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TeachersOptimization
 * <p>
 * It contains options related to optimisable conditions for teachers.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "teacherIncompatibities",
    "uniformDailyDistribution",
    "excessContinuousTeaching",
    "excessPermanence",
    "continuousSessionsWithGroup",
    "onCallSectionsOnBorders"
})
public class TeachersOptimization {

    /**
     * It indicates the weight of the teacher's incompatibilities that can be optimised.
     * 
     */
    @JsonProperty("teacherIncompatibities")
    @JsonPropertyDescription("It indicates the weight of the teacher's incompatibilities that can be optimised.")
    private Integer teacherIncompatibities = 3;
    /**
     * It indicates the weight of placing a teacher's class units in a non-uniform way during the week.
     * 
     */
    @JsonProperty("uniformDailyDistribution")
    @JsonPropertyDescription("It indicates the weight of placing a teacher's class units in a non-uniform way during the week.")
    private Integer uniformDailyDistribution = 3;
    /**
     * It indicates the weight of placing more continuous class units than those declared in the settings.
     * 
     */
    @JsonProperty("excessContinuousTeaching")
    @JsonPropertyDescription("It indicates the weight of placing more continuous class units than those declared in the settings.")
    private Integer excessContinuousTeaching = 2;
    /**
     * It indicates the weight of assigning more daily or weekly stay than the declared in the settings.
     * 
     */
    @JsonProperty("excessPermanence")
    @JsonPropertyDescription("It indicates the weight of assigning more daily or weekly stay than the declared in the settings.")
    private Integer excessPermanence = 2;
    /**
     * It indicates the weight of having consecutive class units taught to the same group.
     * 
     */
    @JsonProperty("continuousSessionsWithGroup")
    @JsonPropertyDescription("It indicates the weight of having consecutive class units taught to the same group.")
    private Integer continuousSessionsWithGroup = 1;
    /**
     * It indicates the weight of the teacher being assigned an on-call hour within the limits of his or her timetable, thus trying to fit it into the gaps in his or her class units.
     * 
     */
    @JsonProperty("onCallSectionsOnBorders")
    @JsonPropertyDescription("It indicates the weight of the teacher being assigned an on-call hour within the limits of his or her timetable, thus trying to fit it into the gaps in his or her class units.")
    private Integer onCallSectionsOnBorders = 1;

    /**
     * It indicates the weight of the teacher's incompatibilities that can be optimised.
     * 
     */
    @JsonProperty("teacherIncompatibities")
    public Integer getTeacherIncompatibities() {
        return teacherIncompatibities;
    }

    /**
     * It indicates the weight of the teacher's incompatibilities that can be optimised.
     * 
     */
    @JsonProperty("teacherIncompatibities")
    public void setTeacherIncompatibities(Integer teacherIncompatibities) {
        this.teacherIncompatibities = teacherIncompatibities;
    }

    /**
     * It indicates the weight of placing a teacher's class units in a non-uniform way during the week.
     * 
     */
    @JsonProperty("uniformDailyDistribution")
    public Integer getUniformDailyDistribution() {
        return uniformDailyDistribution;
    }

    /**
     * It indicates the weight of placing a teacher's class units in a non-uniform way during the week.
     * 
     */
    @JsonProperty("uniformDailyDistribution")
    public void setUniformDailyDistribution(Integer uniformDailyDistribution) {
        this.uniformDailyDistribution = uniformDailyDistribution;
    }

    /**
     * It indicates the weight of placing more continuous class units than those declared in the settings.
     * 
     */
    @JsonProperty("excessContinuousTeaching")
    public Integer getExcessContinuousTeaching() {
        return excessContinuousTeaching;
    }

    /**
     * It indicates the weight of placing more continuous class units than those declared in the settings.
     * 
     */
    @JsonProperty("excessContinuousTeaching")
    public void setExcessContinuousTeaching(Integer excessContinuousTeaching) {
        this.excessContinuousTeaching = excessContinuousTeaching;
    }

    /**
     * It indicates the weight of assigning more daily or weekly stay than the declared in the settings.
     * 
     */
    @JsonProperty("excessPermanence")
    public Integer getExcessPermanence() {
        return excessPermanence;
    }

    /**
     * It indicates the weight of assigning more daily or weekly stay than the declared in the settings.
     * 
     */
    @JsonProperty("excessPermanence")
    public void setExcessPermanence(Integer excessPermanence) {
        this.excessPermanence = excessPermanence;
    }

    /**
     * It indicates the weight of having consecutive class units taught to the same group.
     * 
     */
    @JsonProperty("continuousSessionsWithGroup")
    public Integer getContinuousSessionsWithGroup() {
        return continuousSessionsWithGroup;
    }

    /**
     * It indicates the weight of having consecutive class units taught to the same group.
     * 
     */
    @JsonProperty("continuousSessionsWithGroup")
    public void setContinuousSessionsWithGroup(Integer continuousSessionsWithGroup) {
        this.continuousSessionsWithGroup = continuousSessionsWithGroup;
    }

    /**
     * It indicates the weight of the teacher being assigned an on-call hour within the limits of his or her timetable, thus trying to fit it into the gaps in his or her class units.
     * 
     */
    @JsonProperty("onCallSectionsOnBorders")
    public Integer getOnCallSectionsOnBorders() {
        return onCallSectionsOnBorders;
    }

    /**
     * It indicates the weight of the teacher being assigned an on-call hour within the limits of his or her timetable, thus trying to fit it into the gaps in his or her class units.
     * 
     */
    @JsonProperty("onCallSectionsOnBorders")
    public void setOnCallSectionsOnBorders(Integer onCallSectionsOnBorders) {
        this.onCallSectionsOnBorders = onCallSectionsOnBorders;
    }

}
