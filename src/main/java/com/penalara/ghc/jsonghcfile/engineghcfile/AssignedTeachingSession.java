
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
 * AssignedTeachingSession
 * <p>
 * Class unit or on call hour assigned in the timetable.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "refSession",
    "refClassRomms",
    "refTeacher"
})
public class AssignedTeachingSession {

    /**
     * Identifier of the teaching session assigned.
     * 
     */
    @JsonProperty("refSession")
    @JsonPropertyDescription("Identifier of the teaching session assigned.")
    private Integer refSession;
    /**
     * RefclassRomms
     * <p>
     * List of classrooms assigned to teach the class unit.
     * (Required)
     * 
     */
    @JsonProperty("refClassRomms")
    @JsonPropertyDescription("List of classrooms assigned to teach the class unit.")
    private List<String> refClassRomms = new ArrayList<String>();
    /**
     * RefTeachers
     * <p>
     * List of teachers assigned to the class unit.
     * 
     */
    @JsonProperty("refTeacher")
    @JsonPropertyDescription("List of teachers assigned to the class unit.")
    private List<String> refTeacher = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Identifier of the teaching session assigned.
     * 
     */
    @JsonProperty("refSession")
    public Integer getRefSession() {
        return refSession;
    }

    /**
     * Identifier of the teaching session assigned.
     * 
     */
    @JsonProperty("refSession")
    public void setRefSession(Integer refSession) {
        this.refSession = refSession;
    }

    /**
     * RefclassRomms
     * <p>
     * List of classrooms assigned to teach the class unit.
     * (Required)
     * 
     */
    @JsonProperty("refClassRomms")
    public List<String> getRefClassRomms() {
        return refClassRomms;
    }

    /**
     * RefclassRomms
     * <p>
     * List of classrooms assigned to teach the class unit.
     * (Required)
     * 
     */
    @JsonProperty("refClassRomms")
    public void setRefClassRomms(List<String> refClassRomms) {
        this.refClassRomms = refClassRomms;
    }

    /**
     * RefTeachers
     * <p>
     * List of teachers assigned to the class unit.
     * 
     */
    @JsonProperty("refTeacher")
    public List<String> getRefTeacher() {
        return refTeacher;
    }

    /**
     * RefTeachers
     * <p>
     * List of teachers assigned to the class unit.
     * 
     */
    @JsonProperty("refTeacher")
    public void setRefTeacher(List<String> refTeacher) {
        this.refTeacher = refTeacher;
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
