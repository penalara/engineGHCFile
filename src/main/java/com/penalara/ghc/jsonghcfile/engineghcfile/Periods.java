
package com.penalara.ghc.jsonghcfile.engineghcfile;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Periods
 * <p>
 * Weeks or periods with different assignments which contains the timetable.If there are no defined periods, the engine will create a single period with all the days of the timetable.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "followedPeriods",
    "periodsList"
})
public class Periods {

    /**
     * FollowedPeriods
     * <p>
     * It indicates whether periods or weeks consider the last day of the previous period or week as consecutive days with the first day of the following period or week.
     * 
     */
    @JsonProperty("followedPeriods")
    @JsonPropertyDescription("It indicates whether periods or weeks consider the last day of the previous period or week as consecutive days with the first day of the following period or week.")
    private Boolean followedPeriods = false;
    /**
     * PeriodsList
     * <p>
     * List of periods.
     * (Required)
     * 
     */
    @JsonProperty("periodsList")
    @JsonPropertyDescription("List of periods.")
    private List<Period> periodsList = new ArrayList<Period>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Periods() {
    }

    /**
     * 
     * @param followedPeriods
     *     FollowedPeriods. It indicates whether periods or weeks consider the last day of the previous period or week as consecutive days with the first day of the following period or week.
     * @param periodsList
     *     PeriodsList. List of periods.
     */
    public Periods(Boolean followedPeriods, List<Period> periodsList) {
        super();
        this.followedPeriods = followedPeriods;
        this.periodsList = periodsList;
    }

    /**
     * FollowedPeriods
     * <p>
     * It indicates whether periods or weeks consider the last day of the previous period or week as consecutive days with the first day of the following period or week.
     * 
     */
    @JsonProperty("followedPeriods")
    public Boolean getFollowedPeriods() {
        return followedPeriods;
    }

    /**
     * FollowedPeriods
     * <p>
     * It indicates whether periods or weeks consider the last day of the previous period or week as consecutive days with the first day of the following period or week.
     * 
     */
    @JsonProperty("followedPeriods")
    public void setFollowedPeriods(Boolean followedPeriods) {
        this.followedPeriods = followedPeriods;
    }

    /**
     * PeriodsList
     * <p>
     * List of periods.
     * (Required)
     * 
     */
    @JsonProperty("periodsList")
    public List<Period> getPeriodsList() {
        return periodsList;
    }

    /**
     * PeriodsList
     * <p>
     * List of periods.
     * (Required)
     * 
     */
    @JsonProperty("periodsList")
    public void setPeriodsList(List<Period> periodsList) {
        this.periodsList = periodsList;
    }

}
