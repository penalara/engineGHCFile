
package com.penalara.ghc.jsonghcfile.engineghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SessionsOptimization
 * <p>
 * It contains options related to optimisable conditions for sessions.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nonPreferredClassRoom",
    "samePositionEveryPeriod",
    "consecutiveDays",
    "bordersTimetable",
    "afternoonOrAfterBreakClasses",
    "sameHourSessionClasses",
    "classRoomsChanges"
})
public class SessionsOptimization {

    /**
     * It indicates the weight if the class units are configured with a preferred classroom and with a set of alternative classrooms, the weight placed in one of the alternative classrooms will be penalised.
     * 
     */
    @JsonProperty("nonPreferredClassRoom")
    @JsonPropertyDescription("It indicates the weight if the class units are configured with a preferred classroom and with a set of alternative classrooms, the weight placed in one of the alternative classrooms will be penalised.")
    private Integer nonPreferredClassRoom = 3;
    /**
     * It indicates the weight of placing the entities of a class unit belonging to several periods in the same positions or not (also affects on-call services).
     * 
     */
    @JsonProperty("samePositionEveryPeriod")
    @JsonPropertyDescription("It indicates the weight of placing the entities of a class unit belonging to several periods in the same positions or not (also affects on-call services).")
    private Integer samePositionEveryPeriod = 1;
    /**
     * It indicates the weight of the condition that has been set in each case on the properties of each class unit to place two or three class units, that is, all of them on consecutive days.
     * 
     */
    @JsonProperty("consecutiveDays")
    @JsonPropertyDescription("It indicates the weight of the condition that has been set in each case on the properties of each class unit to place two or three class units, that is, all of them on consecutive days.")
    private Integer consecutiveDays = 3;
    /**
     * It indicates the weight of the class units assigned at the ends of the timetable.
     * 
     */
    @JsonProperty("bordersTimetable")
    @JsonPropertyDescription("It indicates the weight of the class units assigned at the ends of the timetable.")
    private Integer bordersTimetable = 2;
    /**
     * It indicates the weight of the penalty of having class units after the last break or in the afternoon.
     * 
     */
    @JsonProperty("afternoonOrAfterBreakClasses")
    @JsonPropertyDescription("It indicates the weight of the penalty of having class units after the last break or in the afternoon.")
    private Integer afternoonOrAfterBreakClasses = 3;
    /**
     * It indicates the weight of the penalty for not complying with the preference allocation on consecutive days.
     * 
     */
    @JsonProperty("sameHourSessionClasses")
    @JsonPropertyDescription("It indicates the weight of the penalty for not complying with the preference allocation on consecutive days.")
    private Integer sameHourSessionClasses = 3;
    /**
     * It indicates the weight of all class units of each subject not taught in the same classroom, and also to avoid classroom changes of groups. This means a change of classrooms of a group only between consecutive intervals, not those divided by a break.
     * 
     */
    @JsonProperty("classRoomsChanges")
    @JsonPropertyDescription("It indicates the weight of all class units of each subject not taught in the same classroom, and also to avoid classroom changes of groups. This means a change of classrooms of a group only between consecutive intervals, not those divided by a break.")
    private Integer classRoomsChanges = 3;

    /**
     * It indicates the weight if the class units are configured with a preferred classroom and with a set of alternative classrooms, the weight placed in one of the alternative classrooms will be penalised.
     * 
     */
    @JsonProperty("nonPreferredClassRoom")
    public Integer getNonPreferredClassRoom() {
        return nonPreferredClassRoom;
    }

    /**
     * It indicates the weight if the class units are configured with a preferred classroom and with a set of alternative classrooms, the weight placed in one of the alternative classrooms will be penalised.
     * 
     */
    @JsonProperty("nonPreferredClassRoom")
    public void setNonPreferredClassRoom(Integer nonPreferredClassRoom) {
        this.nonPreferredClassRoom = nonPreferredClassRoom;
    }

    /**
     * It indicates the weight of placing the entities of a class unit belonging to several periods in the same positions or not (also affects on-call services).
     * 
     */
    @JsonProperty("samePositionEveryPeriod")
    public Integer getSamePositionEveryPeriod() {
        return samePositionEveryPeriod;
    }

    /**
     * It indicates the weight of placing the entities of a class unit belonging to several periods in the same positions or not (also affects on-call services).
     * 
     */
    @JsonProperty("samePositionEveryPeriod")
    public void setSamePositionEveryPeriod(Integer samePositionEveryPeriod) {
        this.samePositionEveryPeriod = samePositionEveryPeriod;
    }

    /**
     * It indicates the weight of the condition that has been set in each case on the properties of each class unit to place two or three class units, that is, all of them on consecutive days.
     * 
     */
    @JsonProperty("consecutiveDays")
    public Integer getConsecutiveDays() {
        return consecutiveDays;
    }

    /**
     * It indicates the weight of the condition that has been set in each case on the properties of each class unit to place two or three class units, that is, all of them on consecutive days.
     * 
     */
    @JsonProperty("consecutiveDays")
    public void setConsecutiveDays(Integer consecutiveDays) {
        this.consecutiveDays = consecutiveDays;
    }

    /**
     * It indicates the weight of the class units assigned at the ends of the timetable.
     * 
     */
    @JsonProperty("bordersTimetable")
    public Integer getBordersTimetable() {
        return bordersTimetable;
    }

    /**
     * It indicates the weight of the class units assigned at the ends of the timetable.
     * 
     */
    @JsonProperty("bordersTimetable")
    public void setBordersTimetable(Integer bordersTimetable) {
        this.bordersTimetable = bordersTimetable;
    }

    /**
     * It indicates the weight of the penalty of having class units after the last break or in the afternoon.
     * 
     */
    @JsonProperty("afternoonOrAfterBreakClasses")
    public Integer getAfternoonOrAfterBreakClasses() {
        return afternoonOrAfterBreakClasses;
    }

    /**
     * It indicates the weight of the penalty of having class units after the last break or in the afternoon.
     * 
     */
    @JsonProperty("afternoonOrAfterBreakClasses")
    public void setAfternoonOrAfterBreakClasses(Integer afternoonOrAfterBreakClasses) {
        this.afternoonOrAfterBreakClasses = afternoonOrAfterBreakClasses;
    }

    /**
     * It indicates the weight of the penalty for not complying with the preference allocation on consecutive days.
     * 
     */
    @JsonProperty("sameHourSessionClasses")
    public Integer getSameHourSessionClasses() {
        return sameHourSessionClasses;
    }

    /**
     * It indicates the weight of the penalty for not complying with the preference allocation on consecutive days.
     * 
     */
    @JsonProperty("sameHourSessionClasses")
    public void setSameHourSessionClasses(Integer sameHourSessionClasses) {
        this.sameHourSessionClasses = sameHourSessionClasses;
    }

    /**
     * It indicates the weight of all class units of each subject not taught in the same classroom, and also to avoid classroom changes of groups. This means a change of classrooms of a group only between consecutive intervals, not those divided by a break.
     * 
     */
    @JsonProperty("classRoomsChanges")
    public Integer getClassRoomsChanges() {
        return classRoomsChanges;
    }

    /**
     * It indicates the weight of all class units of each subject not taught in the same classroom, and also to avoid classroom changes of groups. This means a change of classrooms of a group only between consecutive intervals, not those divided by a break.
     * 
     */
    @JsonProperty("classRoomsChanges")
    public void setClassRoomsChanges(Integer classRoomsChanges) {
        this.classRoomsChanges = classRoomsChanges;
    }

}
