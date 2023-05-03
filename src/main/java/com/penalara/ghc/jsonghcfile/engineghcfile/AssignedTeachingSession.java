
package com.penalara.ghc.jsonghcfile.engineghcfile;

import java.util.ArrayList;
import java.util.List;
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
     * RefMainTeacher
     * <p>
     * Identifier of the MAIN teacher of the session in the input file.
     * 
     */
    @JsonProperty("refTeacher")
    @JsonPropertyDescription("Identifier of the MAIN teacher of the session in the input file.")
    private String refTeacher;

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
     * RefMainTeacher
     * <p>
     * Identifier of the MAIN teacher of the session in the input file.
     * 
     */
    @JsonProperty("refTeacher")
    public String getRefTeacher() {
        return refTeacher;
    }

    /**
     * RefMainTeacher
     * <p>
     * Identifier of the MAIN teacher of the session in the input file.
     * 
     */
    @JsonProperty("refTeacher")
    public void setRefTeacher(String refTeacher) {
        this.refTeacher = refTeacher;
    }

}
