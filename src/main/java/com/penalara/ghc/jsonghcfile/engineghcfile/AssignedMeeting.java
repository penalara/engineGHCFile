
package com.penalara.ghc.jsonghcfile.engineghcfile;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AssignedMeeting
 * <p>
 * Meeting of teachers assigned in the timetable.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "refMeeting",
    "refClassRomms"
})
public class AssignedMeeting {

    /**
     * Identifier of the meeting assigned.
     * (Required)
     * 
     */
    @JsonProperty("refMeeting")
    @JsonPropertyDescription("Identifier of the meeting assigned.")
    private String refMeeting;
    /**
     * RefclassRomms
     * <p>
     * List of classrooms assigned to teach the class unit.
     * 
     */
    @JsonProperty("refClassRomms")
    @JsonPropertyDescription("List of classrooms assigned to teach the class unit.")
    private List<String> refClassRomms = new ArrayList<String>();

    /**
     * Identifier of the meeting assigned.
     * (Required)
     * 
     */
    @JsonProperty("refMeeting")
    public String getRefMeeting() {
        return refMeeting;
    }

    /**
     * Identifier of the meeting assigned.
     * (Required)
     * 
     */
    @JsonProperty("refMeeting")
    public void setRefMeeting(String refMeeting) {
        this.refMeeting = refMeeting;
    }

    /**
     * RefclassRomms
     * <p>
     * List of classrooms assigned to teach the class unit.
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
     * 
     */
    @JsonProperty("refClassRomms")
    public void setRefClassRomms(List<String> refClassRomms) {
        this.refClassRomms = refClassRomms;
    }

}
