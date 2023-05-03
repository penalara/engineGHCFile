
package com.penalara.ghc.jsonghcfile.engineghcfile;

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

}
