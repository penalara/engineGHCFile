
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
    "refTeachers"
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
     * Optional. List of teachers assigned to the class unit. If the field is not informed, the teachers configured in the session are taken. The first is always the main teacher. It is used only in the case that alternative teachers have been configured.
     * 
     */
    @JsonProperty("refTeachers")
    @JsonPropertyDescription("Optional. List of teachers assigned to the class unit. If the field is not informed, the teachers configured in the session are taken. The first is always the main teacher. It is used only in the case that alternative teachers have been configured.")
    private List<String> refTeachers = new ArrayList<String>();

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
     * Optional. List of teachers assigned to the class unit. If the field is not informed, the teachers configured in the session are taken. The first is always the main teacher. It is used only in the case that alternative teachers have been configured.
     * 
     */
    @JsonProperty("refTeachers")
    public List<String> getRefTeachers() {
        return refTeachers;
    }

    /**
     * RefTeachers
     * <p>
     * Optional. List of teachers assigned to the class unit. If the field is not informed, the teachers configured in the session are taken. The first is always the main teacher. It is used only in the case that alternative teachers have been configured.
     * 
     */
    @JsonProperty("refTeachers")
    public void setRefTeachers(List<String> refTeachers) {
        this.refTeachers = refTeachers;
    }

}
