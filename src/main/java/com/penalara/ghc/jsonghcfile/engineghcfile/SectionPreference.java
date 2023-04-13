
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
 * SectionPreference
 * <p>
 * Template with a section assignment preference.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "day",
    "index",
    "frame",
    "type"
})
public class SectionPreference {

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
     * SectionPreferenceTypeWithOutPreset
     * <p>
     * Element availability to be assigned to the section.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Element availability to be assigned to the section.")
    private SectionPreference.SectionPreferenceTypeWithOutPreset type;
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
     * SectionPreferenceTypeWithOutPreset
     * <p>
     * Element availability to be assigned to the section.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public SectionPreference.SectionPreferenceTypeWithOutPreset getType() {
        return type;
    }

    /**
     * SectionPreferenceTypeWithOutPreset
     * <p>
     * Element availability to be assigned to the section.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(SectionPreference.SectionPreferenceTypeWithOutPreset type) {
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
     * SectionPreferenceTypeWithOutPreset
     * <p>
     * Element availability to be assigned to the section.
     * 
     */
    public enum SectionPreferenceTypeWithOutPreset {

        BANNED("banned"),
        STRONG_NON_PREFERRED("strong-non-preferred"),
        WEAK_NON_PREFERRED("weak-non-preferred");
        private final String value;
        private final static Map<String, SectionPreference.SectionPreferenceTypeWithOutPreset> CONSTANTS = new HashMap<String, SectionPreference.SectionPreferenceTypeWithOutPreset>();

        static {
            for (SectionPreference.SectionPreferenceTypeWithOutPreset c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SectionPreferenceTypeWithOutPreset(String value) {
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
        public static SectionPreference.SectionPreferenceTypeWithOutPreset fromValue(String value) {
            SectionPreference.SectionPreferenceTypeWithOutPreset constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
