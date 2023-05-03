
package com.penalara.ghc.jsonghcfile.engineghcfile;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AssignedOnCallService
 * <p>
 * Call hour assigned in the timetable.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "refOnCall",
    "refTeacher"
})
public class AssignedOnCallService {

    /**
     * Identifier of the teaching session assigned.
     * (Required)
     * 
     */
    @JsonProperty("refOnCall")
    @JsonPropertyDescription("Identifier of the teaching session assigned.")
    private String refOnCall;
    /**
     * RefTeachers
     * <p>
     * Teacher assigned in section on call service.
     * (Required)
     * 
     */
    @JsonProperty("refTeacher")
    @JsonPropertyDescription("Teacher assigned in section on call service.")
    private String refTeacher;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Identifier of the teaching session assigned.
     * (Required)
     * 
     */
    @JsonProperty("refOnCall")
    public String getRefOnCall() {
        return refOnCall;
    }

    /**
     * Identifier of the teaching session assigned.
     * (Required)
     * 
     */
    @JsonProperty("refOnCall")
    public void setRefOnCall(String refOnCall) {
        this.refOnCall = refOnCall;
    }

    /**
     * RefTeachers
     * <p>
     * Teacher assigned in section on call service.
     * (Required)
     * 
     */
    @JsonProperty("refTeacher")
    public String getRefTeacher() {
        return refTeacher;
    }

    /**
     * RefTeachers
     * <p>
     * Teacher assigned in section on call service.
     * (Required)
     * 
     */
    @JsonProperty("refTeacher")
    public void setRefTeacher(String refTeacher) {
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
