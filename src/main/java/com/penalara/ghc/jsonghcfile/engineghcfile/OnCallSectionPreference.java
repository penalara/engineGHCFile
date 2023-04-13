
package com.penalara.ghc.jsonghcfile.engineghcfile;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * OnCallSectionPreference
 * <p>
 * Template with a teacher section assignment preference about the service.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "day",
    "index",
    "frame",
    "type"
})
public class OnCallSectionPreference {

    /**
     * Day of the week when is located the section.
     * (Required)
     * 
     */
    @JsonProperty("day")
    @JsonPropertyDescription("Day of the week when is located the section.")
    private Integer day;
    /**
     * Index inside the day where is located the section.
     * (Required)
     * 
     */
    @JsonProperty("index")
    @JsonPropertyDescription("Index inside the day where is located the section.")
    private Integer index;
    /**
     * Identifier name of the frame.
     * (Required)
     * 
     */
    @JsonProperty("frame")
    @JsonPropertyDescription("Identifier name of the frame.")
    private String frame;
    /**
     * SectionPreferenceTypeBannedPreset
     * <p>
     * Teacher availability to be assigned to the section.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Teacher availability to be assigned to the section.")
    private OnCallSectionPreference.SectionPreferenceTypeBannedPreset type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Day of the week when is located the section.
     * (Required)
     * 
     */
    @JsonProperty("day")
    public Integer getDay() {
        return day;
    }

    /**
     * Day of the week when is located the section.
     * (Required)
     * 
     */
    @JsonProperty("day")
    public void setDay(Integer day) {
        this.day = day;
    }

    /**
     * Index inside the day where is located the section.
     * (Required)
     * 
     */
    @JsonProperty("index")
    public Integer getIndex() {
        return index;
    }

    /**
     * Index inside the day where is located the section.
     * (Required)
     * 
     */
    @JsonProperty("index")
    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * Identifier name of the frame.
     * (Required)
     * 
     */
    @JsonProperty("frame")
    public String getFrame() {
        return frame;
    }

    /**
     * Identifier name of the frame.
     * (Required)
     * 
     */
    @JsonProperty("frame")
    public void setFrame(String frame) {
        this.frame = frame;
    }

    /**
     * SectionPreferenceTypeBannedPreset
     * <p>
     * Teacher availability to be assigned to the section.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public OnCallSectionPreference.SectionPreferenceTypeBannedPreset getType() {
        return type;
    }

    /**
     * SectionPreferenceTypeBannedPreset
     * <p>
     * Teacher availability to be assigned to the section.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(OnCallSectionPreference.SectionPreferenceTypeBannedPreset type) {
        this.type = type;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


    /**
     * SectionPreferenceTypeBannedPreset
     * <p>
     * Teacher availability to be assigned to the section.
     * 
     */
    public enum SectionPreferenceTypeBannedPreset {

        BANNED("banned"),
        PRESET("preset");
        private final String value;
        private final static Map<String, OnCallSectionPreference.SectionPreferenceTypeBannedPreset> CONSTANTS = new HashMap<String, OnCallSectionPreference.SectionPreferenceTypeBannedPreset>();

        static {
            for (OnCallSectionPreference.SectionPreferenceTypeBannedPreset c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SectionPreferenceTypeBannedPreset(String value) {
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
        public static OnCallSectionPreference.SectionPreferenceTypeBannedPreset fromValue(String value) {
            OnCallSectionPreference.SectionPreferenceTypeBannedPreset constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
