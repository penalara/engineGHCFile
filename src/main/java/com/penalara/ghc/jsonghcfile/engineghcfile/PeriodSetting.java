
package com.penalara.ghc.jsonghcfile.engineghcfile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PeriodSetting
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "refPeriod",
    "weeklyStay",
    "dailyStay",
    "avoidGapsBetweenSesions",
    "maxContinuousTeaching",
    "avoidClassesAroundBreak",
    "freeTimes",
    "freePartTimes",
    "incompatibilities",
    "dailyOcupation",
    "middayReference",
    "dailyBuildingTransfers"
})
public class PeriodSetting {

    /**
     * Identifier of the period to which the settings affect.
     * (Required)
     * 
     */
    @JsonProperty("refPeriod")
    @JsonPropertyDescription("Identifier\u00a0of\u00a0the\u00a0period\u00a0to\u00a0which\u00a0the\u00a0settings\u00a0affect.")
    private String refPeriod;
    /**
     * WeeklyStay
     * <p>
     * It indicates the maximum preferential and strict teacher's stay, for the weekly stay that the teacher can be in the academic institution.
     * 
     */
    @JsonProperty("weeklyStay")
    @JsonPropertyDescription("It indicates the maximum preferential and strict teacher's stay, for the weekly stay that the teacher can be in the academic institution.")
    private WeeklyStay weeklyStay;
    /**
     * DailyStay
     * <p>
     * This indicates the maximum preferential and strict time of stay of the teacher, for the daily stay that the teacher can be in the educational institution.
     * 
     */
    @JsonProperty("dailyStay")
    @JsonPropertyDescription("This indicates the maximum preferential and strict time of stay of the teacher, for the daily stay that the teacher can be in the educational institution.")
    private DailyStay dailyStay;
    /**
     * It indicates whether gaps between class units for the teacher should be avoided. This is a weighting condition.If did not specify, the engine will assign a true value.
     * 
     */
    @JsonProperty("avoidGapsBetweenSesions")
    @JsonPropertyDescription("It indicates whether gaps between class units for the teacher should be avoided. This is a weighting condition.")
    private Boolean avoidGapsBetweenSesions;
    /**
     * MaxContinuousTeaching
     * <p>
     * It indicates the maximum continuous time of class units, which are allowed without having a gap or a non-class units between them.
     * 
     */
    @JsonProperty("maxContinuousTeaching")
    @JsonPropertyDescription("It indicates the maximum continuous time of class units, which are allowed without having a gap or a non-class units between them.")
    private MaxContinuousTeaching maxContinuousTeaching;
    /**
     * It indicates whether the existence of class units on both sides of a playground supervision taught by this teacher will be penalised.
     * 
     */
    @JsonProperty("avoidClassesAroundBreak")
    @JsonPropertyDescription("It indicates whether the existence of class units on both sides of a playground supervision taught by this teacher will be penalised.")
    private Boolean avoidClassesAroundBreak = false;
    /**
     * FreeTimes
     * <p>
     * It contains the free time spaces that the teacher must have.
     * 
     */
    @JsonProperty("freeTimes")
    @JsonPropertyDescription("It contains the free time spaces that the teacher must have.")
    private FreeTimes freeTimes;
    /**
     * FreePartTime
     * <p>
     * Free half-time periods .
     * 
     */
    @JsonProperty("freePartTimes")
    @JsonPropertyDescription("Free half-time periods .")
    private FreePartTime freePartTimes;
    /**
     * Incompatibilities
     * <p>
     * It contains the teacher's incompatibilities on the allocation of class units and rest periods.
     * 
     */
    @JsonProperty("incompatibilities")
    @JsonPropertyDescription("It contains the teacher's incompatibilities on the allocation of class units and rest periods.")
    private Incompatibilities incompatibilities;
    /**
     * DailyOcupation
     * <p>
     * Maximum and minimum values of teaching or activity time for teachers. This object indicates the type of condition (strict or weighting) and whether the automatic calculation in minutes in the engine should be set.
     * 
     */
    @JsonProperty("dailyOcupation")
    @JsonPropertyDescription("Maximum and minimum values of teaching or activity time for teachers. This object indicates the type of condition (strict or weighting) and whether the automatic calculation in minutes in the engine should be set.")
    private DailyOcupation dailyOcupation;
    /**
     * MiddayReference
     * <p>
     * It indicate the frame where the teacher takes noon pause.
     * 
     */
    @JsonProperty("middayReference")
    @JsonPropertyDescription("It indicate the frame where the teacher takes noon pause.")
    private MiddayReference middayReference;
    /**
     * DailyBuildingTransfers
     * <p>
     * Maximum number of movements between buildings that the teacher can make per day.
     * 
     */
    @JsonProperty("dailyBuildingTransfers")
    @JsonPropertyDescription("Maximum number of movements between buildings that the teacher can make per day.")
    private DailyBuildingTransfers dailyBuildingTransfers;

    /**
     * Identifier of the period to which the settings affect.
     * (Required)
     * 
     */
    @JsonProperty("refPeriod")
    public String getRefPeriod() {
        return refPeriod;
    }

    /**
     * Identifier of the period to which the settings affect.
     * (Required)
     * 
     */
    @JsonProperty("refPeriod")
    public void setRefPeriod(String refPeriod) {
        this.refPeriod = refPeriod;
    }

    /**
     * WeeklyStay
     * <p>
     * It indicates the maximum preferential and strict teacher's stay, for the weekly stay that the teacher can be in the academic institution.
     * 
     */
    @JsonProperty("weeklyStay")
    public WeeklyStay getWeeklyStay() {
        return weeklyStay;
    }

    /**
     * WeeklyStay
     * <p>
     * It indicates the maximum preferential and strict teacher's stay, for the weekly stay that the teacher can be in the academic institution.
     * 
     */
    @JsonProperty("weeklyStay")
    public void setWeeklyStay(WeeklyStay weeklyStay) {
        this.weeklyStay = weeklyStay;
    }

    /**
     * DailyStay
     * <p>
     * This indicates the maximum preferential and strict time of stay of the teacher, for the daily stay that the teacher can be in the educational institution.
     * 
     */
    @JsonProperty("dailyStay")
    public DailyStay getDailyStay() {
        return dailyStay;
    }

    /**
     * DailyStay
     * <p>
     * This indicates the maximum preferential and strict time of stay of the teacher, for the daily stay that the teacher can be in the educational institution.
     * 
     */
    @JsonProperty("dailyStay")
    public void setDailyStay(DailyStay dailyStay) {
        this.dailyStay = dailyStay;
    }

    /**
     * It indicates whether gaps between class units for the teacher should be avoided. This is a weighting condition.If did not specify, the engine will assign a true value.
     * 
     */
    @JsonProperty("avoidGapsBetweenSesions")
    public Boolean getAvoidGapsBetweenSesions() {
        return avoidGapsBetweenSesions;
    }

    /**
     * It indicates whether gaps between class units for the teacher should be avoided. This is a weighting condition.If did not specify, the engine will assign a true value.
     * 
     */
    @JsonProperty("avoidGapsBetweenSesions")
    public void setAvoidGapsBetweenSesions(Boolean avoidGapsBetweenSesions) {
        this.avoidGapsBetweenSesions = avoidGapsBetweenSesions;
    }

    /**
     * MaxContinuousTeaching
     * <p>
     * It indicates the maximum continuous time of class units, which are allowed without having a gap or a non-class units between them.
     * 
     */
    @JsonProperty("maxContinuousTeaching")
    public MaxContinuousTeaching getMaxContinuousTeaching() {
        return maxContinuousTeaching;
    }

    /**
     * MaxContinuousTeaching
     * <p>
     * It indicates the maximum continuous time of class units, which are allowed without having a gap or a non-class units between them.
     * 
     */
    @JsonProperty("maxContinuousTeaching")
    public void setMaxContinuousTeaching(MaxContinuousTeaching maxContinuousTeaching) {
        this.maxContinuousTeaching = maxContinuousTeaching;
    }

    /**
     * It indicates whether the existence of class units on both sides of a playground supervision taught by this teacher will be penalised.
     * 
     */
    @JsonProperty("avoidClassesAroundBreak")
    public Boolean getAvoidClassesAroundBreak() {
        return avoidClassesAroundBreak;
    }

    /**
     * It indicates whether the existence of class units on both sides of a playground supervision taught by this teacher will be penalised.
     * 
     */
    @JsonProperty("avoidClassesAroundBreak")
    public void setAvoidClassesAroundBreak(Boolean avoidClassesAroundBreak) {
        this.avoidClassesAroundBreak = avoidClassesAroundBreak;
    }

    /**
     * FreeTimes
     * <p>
     * It contains the free time spaces that the teacher must have.
     * 
     */
    @JsonProperty("freeTimes")
    public FreeTimes getFreeTimes() {
        return freeTimes;
    }

    /**
     * FreeTimes
     * <p>
     * It contains the free time spaces that the teacher must have.
     * 
     */
    @JsonProperty("freeTimes")
    public void setFreeTimes(FreeTimes freeTimes) {
        this.freeTimes = freeTimes;
    }

    /**
     * FreePartTime
     * <p>
     * Free half-time periods .
     * 
     */
    @JsonProperty("freePartTimes")
    public FreePartTime getFreePartTimes() {
        return freePartTimes;
    }

    /**
     * FreePartTime
     * <p>
     * Free half-time periods .
     * 
     */
    @JsonProperty("freePartTimes")
    public void setFreePartTimes(FreePartTime freePartTimes) {
        this.freePartTimes = freePartTimes;
    }

    /**
     * Incompatibilities
     * <p>
     * It contains the teacher's incompatibilities on the allocation of class units and rest periods.
     * 
     */
    @JsonProperty("incompatibilities")
    public Incompatibilities getIncompatibilities() {
        return incompatibilities;
    }

    /**
     * Incompatibilities
     * <p>
     * It contains the teacher's incompatibilities on the allocation of class units and rest periods.
     * 
     */
    @JsonProperty("incompatibilities")
    public void setIncompatibilities(Incompatibilities incompatibilities) {
        this.incompatibilities = incompatibilities;
    }

    /**
     * DailyOcupation
     * <p>
     * Maximum and minimum values of teaching or activity time for teachers. This object indicates the type of condition (strict or weighting) and whether the automatic calculation in minutes in the engine should be set.
     * 
     */
    @JsonProperty("dailyOcupation")
    public DailyOcupation getDailyOcupation() {
        return dailyOcupation;
    }

    /**
     * DailyOcupation
     * <p>
     * Maximum and minimum values of teaching or activity time for teachers. This object indicates the type of condition (strict or weighting) and whether the automatic calculation in minutes in the engine should be set.
     * 
     */
    @JsonProperty("dailyOcupation")
    public void setDailyOcupation(DailyOcupation dailyOcupation) {
        this.dailyOcupation = dailyOcupation;
    }

    /**
     * MiddayReference
     * <p>
     * It indicate the frame where the teacher takes noon pause.
     * 
     */
    @JsonProperty("middayReference")
    public MiddayReference getMiddayReference() {
        return middayReference;
    }

    /**
     * MiddayReference
     * <p>
     * It indicate the frame where the teacher takes noon pause.
     * 
     */
    @JsonProperty("middayReference")
    public void setMiddayReference(MiddayReference middayReference) {
        this.middayReference = middayReference;
    }

    /**
     * DailyBuildingTransfers
     * <p>
     * Maximum number of movements between buildings that the teacher can make per day.
     * 
     */
    @JsonProperty("dailyBuildingTransfers")
    public DailyBuildingTransfers getDailyBuildingTransfers() {
        return dailyBuildingTransfers;
    }

    /**
     * DailyBuildingTransfers
     * <p>
     * Maximum number of movements between buildings that the teacher can make per day.
     * 
     */
    @JsonProperty("dailyBuildingTransfers")
    public void setDailyBuildingTransfers(DailyBuildingTransfers dailyBuildingTransfers) {
        this.dailyBuildingTransfers = dailyBuildingTransfers;
    }

}
