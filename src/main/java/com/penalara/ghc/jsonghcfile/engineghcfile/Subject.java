
package com.penalara.ghc.jsonghcfile.engineghcfile;

import java.util.ArrayList;
import java.util.List;
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

    /**
     * No args constructor for use in serialization
     * 
     */
    public Subject() {
    }

    /**
     * 
     * @param isStudentMentoring
     *     It indicates whether the subject is a tutorial.
     * @param id
     *     Subject identifier.
     */
    public Subject(String id, Boolean isStudentMentoring, List<SectionPreference> frameTemplate) {
        super();
        this.id = id;
        this.isStudentMentoring = isStudentMentoring;
        this.frameTemplate = frameTemplate;
    }

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

}
