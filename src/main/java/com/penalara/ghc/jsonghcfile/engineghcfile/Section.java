
package com.penalara.ghc.jsonghcfile.engineghcfile;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Section
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "index",
    "entryTime",
    "exitTime",
    "duration",
    "type",
    "allowed"
})
public class Section {

    /**
     * Index built into the day where the section is located.
     * (Required)
     * 
     */
    @JsonProperty("index")
    @JsonPropertyDescription("Index built into the day where the section is located.")
    private Integer index;
    /**
     * Start time of the section.
     * (Required)
     * 
     */
    @JsonProperty("entryTime")
    @JsonPropertyDescription("Start time of the section.")
    private String entryTime;
    /**
     * End time of the section.
     * (Required)
     * 
     */
    @JsonProperty("exitTime")
    @JsonPropertyDescription("End time of the section.")
    private String exitTime;
    /**
     * It indicates the duration (real or proportional) of the section in minutes.This indicates the duration of the section that the engine will use to assign class units. It can be the actual duration between check-in and check-out, or it can be a proportional time to simplify (hour, half hour, three-quarters of an hour...). The distribution of class units will be consistent with this duration.
     * (Required)
     * 
     */
    @JsonProperty("duration")
    @JsonPropertyDescription("It indicates the duration (real or proportional) of the section in minutes.")
    private Integer duration;
    /**
     * SectionType
     * <p>
     * Kind of section.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Kind of section.")
    private Section.SectionType type;
    /**
     * It indicates if the section is available to assign.
     * 
     */
    @JsonProperty("allowed")
    @JsonPropertyDescription("It indicates if the section is available to assign.")
    private Boolean allowed = true;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Section() {
    }

    /**
     * 
     * @param duration
     *     It indicates the duration (real or proportional) of the section in minutes.
     * @param entryTime
     *     Start time of the section.
     * @param exitTime
     *     End time of the section.
     * @param allowed
     *     It indicates if the section is available to assign.
     * @param index
     *     Index built into the day where the section is located.
     * @param type
     *     SectionType. Kind of section.
     */
    public Section(Integer index, String entryTime, String exitTime, Integer duration, Section.SectionType type, Boolean allowed) {
        super();
        this.index = index;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
        this.duration = duration;
        this.type = type;
        this.allowed = allowed;
    }

    /**
     * Index built into the day where the section is located.
     * (Required)
     * 
     */
    @JsonProperty("index")
    public Integer getIndex() {
        return index;
    }

    /**
     * Index built into the day where the section is located.
     * (Required)
     * 
     */
    @JsonProperty("index")
    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * Start time of the section.
     * (Required)
     * 
     */
    @JsonProperty("entryTime")
    public String getEntryTime() {
        return entryTime;
    }

    /**
     * Start time of the section.
     * (Required)
     * 
     */
    @JsonProperty("entryTime")
    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    /**
     * End time of the section.
     * (Required)
     * 
     */
    @JsonProperty("exitTime")
    public String getExitTime() {
        return exitTime;
    }

    /**
     * End time of the section.
     * (Required)
     * 
     */
    @JsonProperty("exitTime")
    public void setExitTime(String exitTime) {
        this.exitTime = exitTime;
    }

    /**
     * It indicates the duration (real or proportional) of the section in minutes.This indicates the duration of the section that the engine will use to assign class units. It can be the actual duration between check-in and check-out, or it can be a proportional time to simplify (hour, half hour, three-quarters of an hour...). The distribution of class units will be consistent with this duration.
     * (Required)
     * 
     */
    @JsonProperty("duration")
    public Integer getDuration() {
        return duration;
    }

    /**
     * It indicates the duration (real or proportional) of the section in minutes.This indicates the duration of the section that the engine will use to assign class units. It can be the actual duration between check-in and check-out, or it can be a proportional time to simplify (hour, half hour, three-quarters of an hour...). The distribution of class units will be consistent with this duration.
     * (Required)
     * 
     */
    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * SectionType
     * <p>
     * Kind of section.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Section.SectionType getType() {
        return type;
    }

    /**
     * SectionType
     * <p>
     * Kind of section.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Section.SectionType type) {
        this.type = type;
    }

    /**
     * It indicates if the section is available to assign.
     * 
     */
    @JsonProperty("allowed")
    public Boolean getAllowed() {
        return allowed;
    }

    /**
     * It indicates if the section is available to assign.
     * 
     */
    @JsonProperty("allowed")
    public void setAllowed(Boolean allowed) {
        this.allowed = allowed;
    }


    /**
     * SectionType
     * <p>
     * Kind of section.
     * 
     */
    public enum SectionType {

        TEACHING("teaching"),
        BREAK("break"),
        MIDDAY("midday");
        private final String value;
        private final static Map<String, Section.SectionType> CONSTANTS = new HashMap<String, Section.SectionType>();

        static {
            for (Section.SectionType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SectionType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Section.SectionType fromValue(String value) {
            Section.SectionType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
