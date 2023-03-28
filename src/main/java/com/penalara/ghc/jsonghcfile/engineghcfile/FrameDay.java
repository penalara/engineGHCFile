
package com.penalara.ghc.jsonghcfile.engineghcfile;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * FrameDay
 * <p>
 * Day with its sections.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "day",
    "sections"
})
public class FrameDay {

    /**
     * Day of the week.
     * (Required)
     * 
     */
    @JsonProperty("day")
    @JsonPropertyDescription("Day of the week.")
    private Integer day;
    /**
     * Sections
     * <p>
     * Timetable cells where class units are located.
     * (Required)
     * 
     */
    @JsonProperty("sections")
    @JsonPropertyDescription("Timetable\u00a0cells\u00a0where class units\u00a0are\u00a0located.")
    private List<Section> sections = new ArrayList<Section>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public FrameDay() {
    }

    /**
     * 
     * @param day
     *     Day of the week.
     * @param sections
     *     Sections. Timetable cells where class units are located.
     */
    public FrameDay(Integer day, List<Section> sections) {
        super();
        this.day = day;
        this.sections = sections;
    }

    /**
     * Day of the week.
     * (Required)
     * 
     */
    @JsonProperty("day")
    public Integer getDay() {
        return day;
    }

    /**
     * Day of the week.
     * (Required)
     * 
     */
    @JsonProperty("day")
    public void setDay(Integer day) {
        this.day = day;
    }

    /**
     * Sections
     * <p>
     * Timetable cells where class units are located.
     * (Required)
     * 
     */
    @JsonProperty("sections")
    public List<Section> getSections() {
        return sections;
    }

    /**
     * Sections
     * <p>
     * Timetable cells where class units are located.
     * (Required)
     * 
     */
    @JsonProperty("sections")
    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

}
