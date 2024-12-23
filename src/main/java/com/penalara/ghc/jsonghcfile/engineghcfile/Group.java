
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
 * Group
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "refFrame",
    "frameTemplate",
    "numStudents",
    "freeAfternoons",
    "notGaps",
    "gapsAlwaysInNonPreferred"
})
public class Group {

    /**
     * Group identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Group identifier.")
    private String id;
    /**
     * Group's frame identifier.
     * (Required)
     * 
     */
    @JsonProperty("refFrame")
    @JsonPropertyDescription("Group's frame identifier.")
    private String refFrame;
    /**
     * FrameTemplate
     * <p>
     * Templates with frame sections assignment preferences.
     * 
     */
    @JsonProperty("frameTemplate")
    @JsonPropertyDescription("Templates with frame sections assignment preferences.")
    private List<SectionPreference> frameTemplate = new ArrayList<SectionPreference>();
    /**
     * Number of students in the group.
     * 
     */
    @JsonProperty("numStudents")
    @JsonPropertyDescription("Number of students in the group.")
    private Integer numStudents;
    /**
     * Stric number of free afternoons for the group.
     * 
     */
    @JsonProperty("freeAfternoons")
    @JsonPropertyDescription("Stric number of free afternoons for the group.")
    private Integer freeAfternoons;
    /**
     * ConditionType
     * <p>
     * Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("notGaps")
    @JsonPropertyDescription("Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.")
    private ConditionType notGaps;
    /**
     * This indicates whether the engine should be in the positions marked as non-preferred in the template for free intervals or gaps.
     * 
     */
    @JsonProperty("gapsAlwaysInNonPreferred")
    @JsonPropertyDescription("This indicates whether the engine should be in the positions marked as non-preferred in the template for free intervals or gaps.")
    private Boolean gapsAlwaysInNonPreferred;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Group identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Group identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Group's frame identifier.
     * (Required)
     * 
     */
    @JsonProperty("refFrame")
    public String getRefFrame() {
        return refFrame;
    }

    /**
     * Group's frame identifier.
     * (Required)
     * 
     */
    @JsonProperty("refFrame")
    public void setRefFrame(String refFrame) {
        this.refFrame = refFrame;
    }

    /**
     * FrameTemplate
     * <p>
     * Templates with frame sections assignment preferences.
     * 
     */
    @JsonProperty("frameTemplate")
    public List<SectionPreference> getFrameTemplate() {
        return frameTemplate;
    }

    /**
     * FrameTemplate
     * <p>
     * Templates with frame sections assignment preferences.
     * 
     */
    @JsonProperty("frameTemplate")
    public void setFrameTemplate(List<SectionPreference> frameTemplate) {
        this.frameTemplate = frameTemplate;
    }

    /**
     * Number of students in the group.
     * 
     */
    @JsonProperty("numStudents")
    public Integer getNumStudents() {
        return numStudents;
    }

    /**
     * Number of students in the group.
     * 
     */
    @JsonProperty("numStudents")
    public void setNumStudents(Integer numStudents) {
        this.numStudents = numStudents;
    }

    /**
     * Stric number of free afternoons for the group.
     * 
     */
    @JsonProperty("freeAfternoons")
    public Integer getFreeAfternoons() {
        return freeAfternoons;
    }

    /**
     * Stric number of free afternoons for the group.
     * 
     */
    @JsonProperty("freeAfternoons")
    public void setFreeAfternoons(Integer freeAfternoons) {
        this.freeAfternoons = freeAfternoons;
    }

    /**
     * ConditionType
     * <p>
     * Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("notGaps")
    public ConditionType getNotGaps() {
        return notGaps;
    }

    /**
     * ConditionType
     * <p>
     * Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("notGaps")
    public void setNotGaps(ConditionType notGaps) {
        this.notGaps = notGaps;
    }

    /**
     * This indicates whether the engine should be in the positions marked as non-preferred in the template for free intervals or gaps.
     * 
     */
    @JsonProperty("gapsAlwaysInNonPreferred")
    public Boolean getGapsAlwaysInNonPreferred() {
        return gapsAlwaysInNonPreferred;
    }

    /**
     * This indicates whether the engine should be in the positions marked as non-preferred in the template for free intervals or gaps.
     * 
     */
    @JsonProperty("gapsAlwaysInNonPreferred")
    public void setGapsAlwaysInNonPreferred(Boolean gapsAlwaysInNonPreferred) {
        this.gapsAlwaysInNonPreferred = gapsAlwaysInNonPreferred;
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
