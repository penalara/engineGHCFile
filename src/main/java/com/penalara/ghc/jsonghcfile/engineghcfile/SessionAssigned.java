
package com.penalara.ghc.jsonghcfile.engineghcfile;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SessionAssigned
 * <p>
 * Class unit or on call hour assigned in the timetable.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "refSesion",
    "refClassRomms",
    "refTeachers"
})
public class SessionAssigned {

    /**
     * Identifier of the session in the input file.
     * (Required)
     * 
     */
    @JsonProperty("refSesion")
    @JsonPropertyDescription("Identifier of the session in the input file.")
    private Integer refSesion;
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
     * RefTeachers
     * <p>
     * List of teachers assigned to the class unit.
     * 
     */
    @JsonProperty("refTeachers")
    @JsonPropertyDescription("List of teachers assigned to the class unit.")
    private List<String> refTeachers = new ArrayList<String>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SessionAssigned() {
    }

    /**
     * 
     * @param refTeachers
     *     RefTeachers. List of teachers assigned to the class unit.
     * @param refClassRomms
     *     RefclassRomms. List of classrooms assigned to teach the class unit.
     * @param refSesion
     *     Identifier of the session in the input file.
     */
    public SessionAssigned(Integer refSesion, List<String> refClassRomms, List<String> refTeachers) {
        super();
        this.refSesion = refSesion;
        this.refClassRomms = refClassRomms;
        this.refTeachers = refTeachers;
    }

    /**
     * Identifier of the session in the input file.
     * (Required)
     * 
     */
    @JsonProperty("refSesion")
    public Integer getRefSesion() {
        return refSesion;
    }

    /**
     * Identifier of the session in the input file.
     * (Required)
     * 
     */
    @JsonProperty("refSesion")
    public void setRefSesion(Integer refSesion) {
        this.refSesion = refSesion;
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

    /**
     * RefTeachers
     * <p>
     * List of teachers assigned to the class unit.
     * 
     */
    @JsonProperty("refTeachers")
    public List<String> getRefTeachers() {
        return refTeachers;
    }

    /**
     * RefTeachers
     * <p>
     * List of teachers assigned to the class unit.
     * 
     */
    @JsonProperty("refTeachers")
    public void setRefTeachers(List<String> refTeachers) {
        this.refTeachers = refTeachers;
    }

}
