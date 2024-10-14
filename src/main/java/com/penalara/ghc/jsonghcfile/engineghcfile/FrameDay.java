
package com.penalara.ghc.jsonghcfile.engineghcfile;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
     * Timetable cells where class units are located.
     * (Required)
     * 
     */
    @JsonProperty("sections")
    @JsonPropertyDescription("Timetable cells where class units are located.")
    private List<Section> sections = new ArrayList<Section>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

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
     * Timetable cells where class units are located.
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
     * Timetable cells where class units are located.
     * (Required)
     * 
     */
    @JsonProperty("sections")
    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
