
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
 * Subject
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "isStudentMentoring",
    "frameTemplate"
})
public class Subject {

    /**
     * Subject identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Subject identifier.")
    private String id;
    /**
     * It indicates whether the subject is a tutorial.
     * 
     */
    @JsonProperty("isStudentMentoring")
    @JsonPropertyDescription("It indicates whether the subject is a tutorial.")
    private Boolean isStudentMentoring = false;
    /**
     * FrameTemplate
     * <p>
     * Templates with frame sections assignment preferences.
     * 
     */
    @JsonProperty("frameTemplate")
    @JsonPropertyDescription("Templates with frame sections assignment preferences.")
    private List<SectionPreference> frameTemplate = new ArrayList<SectionPreference>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Subject identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Subject identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * It indicates whether the subject is a tutorial.
     * 
     */
    @JsonProperty("isStudentMentoring")
    public Boolean getIsStudentMentoring() {
        return isStudentMentoring;
    }

    /**
     * It indicates whether the subject is a tutorial.
     * 
     */
    @JsonProperty("isStudentMentoring")
    public void setIsStudentMentoring(Boolean isStudentMentoring) {
        this.isStudentMentoring = isStudentMentoring;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
