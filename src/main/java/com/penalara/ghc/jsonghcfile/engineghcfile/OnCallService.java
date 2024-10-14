
package com.penalara.ghc.jsonghcfile.engineghcfile;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OnCallService
 * <p>
 * On-call service of teachers who supervise the free time of students.Property 'refPeriods' is required if there are more than one period in the timetable.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "refFrame",
    "refPeriods",
    "refTask",
    "inBreak",
    "teachersEachSection",
    "refTeachers",
    "frameTemplate",
    "refBuilding",
    "settings"
})
public class OnCallService {

    /**
     * On-Call service identifier.This identifier can not be equals to any session identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("On-Call service identifier.")
    private String id;
    /**
     * Identifier of the frame where the service will be set.
     * (Required)
     * 
     */
    @JsonProperty("refFrame")
    @JsonPropertyDescription("Identifier of the frame where the service will be set.")
    private String refFrame;
    /**
     * RefPeriods
     * <p>
     * List of Periods when the service must be set.
     * 
     */
    @JsonProperty("refPeriods")
    @JsonPropertyDescription("List of Periods when the service must be set.")
    private List<String> refPeriods = new ArrayList<String>();
    /**
     * Task identifier.
     * (Required)
     * 
     */
    @JsonProperty("refTask")
    @JsonPropertyDescription("Task identifier.")
    private String refTask;
    /**
     * It indicates whether it is a break supervision.
     * 
     */
    @JsonProperty("inBreak")
    @JsonPropertyDescription("It indicates whether it is a break supervision.")
    private Boolean inBreak = false;
    /**
     * TeachersEachSection
     * <p>
     * Information about number of teacher in all sections.The value 'byDefault' shall be used for all sections, if the field 'bySection' is not informed. This value is also used when a section is not informed in 'bySection'.
     * (Required)
     * 
     */
    @JsonProperty("teachersEachSection")
    @JsonPropertyDescription("Information about number of teacher in all sections.")
    private TeachersEachSection teachersEachSection;
    /**
     * RefTeachersOnCall
     * <p>
     * List of teachers who in the service.
     * (Required)
     * 
     */
    @JsonProperty("refTeachers")
    @JsonPropertyDescription("List of teachers who in the service.")
    private List<RefTeacher> refTeachers = new ArrayList<RefTeacher>();
    /**
     * OnCallTemplate
     * <p>
     * Template with teacher's preferences in the on-call service.
     * 
     */
    @JsonProperty("frameTemplate")
    @JsonPropertyDescription("Template with teacher's preferences in the on-call service.")
    private List<OnCallSectionPreference> frameTemplate = new ArrayList<OnCallSectionPreference>();
    /**
     * Identifier of the building where the service is located. It is used to know the transfer time and the number of transfers between buildings for teachers.
     * 
     */
    @JsonProperty("refBuilding")
    @JsonPropertyDescription("Identifier of the building where the service is located. It is used to know the transfer time and the number of transfers between buildings for teachers.")
    private String refBuilding;
    /**
     * NonClassSessionSettings
     * <p>
     * Settings of the meeting.
     * 
     */
    @JsonProperty("settings")
    @JsonPropertyDescription("Settings of the meeting.")
    private NonClassSessionSettings settings;

    /**
     * On-Call service identifier.This identifier can not be equals to any session identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * On-Call service identifier.This identifier can not be equals to any session identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Identifier of the frame where the service will be set.
     * (Required)
     * 
     */
    @JsonProperty("refFrame")
    public String getRefFrame() {
        return refFrame;
    }

    /**
     * Identifier of the frame where the service will be set.
     * (Required)
     * 
     */
    @JsonProperty("refFrame")
    public void setRefFrame(String refFrame) {
        this.refFrame = refFrame;
    }

    /**
     * RefPeriods
     * <p>
     * List of Periods when the service must be set.
     * 
     */
    @JsonProperty("refPeriods")
    public List<String> getRefPeriods() {
        return refPeriods;
    }

    /**
     * RefPeriods
     * <p>
     * List of Periods when the service must be set.
     * 
     */
    @JsonProperty("refPeriods")
    public void setRefPeriods(List<String> refPeriods) {
        this.refPeriods = refPeriods;
    }

    /**
     * Task identifier.
     * (Required)
     * 
     */
    @JsonProperty("refTask")
    public String getRefTask() {
        return refTask;
    }

    /**
     * Task identifier.
     * (Required)
     * 
     */
    @JsonProperty("refTask")
    public void setRefTask(String refTask) {
        this.refTask = refTask;
    }

    /**
     * It indicates whether it is a break supervision.
     * 
     */
    @JsonProperty("inBreak")
    public Boolean getInBreak() {
        return inBreak;
    }

    /**
     * It indicates whether it is a break supervision.
     * 
     */
    @JsonProperty("inBreak")
    public void setInBreak(Boolean inBreak) {
        this.inBreak = inBreak;
    }

    /**
     * TeachersEachSection
     * <p>
     * Information about number of teacher in all sections.The value 'byDefault' shall be used for all sections, if the field 'bySection' is not informed. This value is also used when a section is not informed in 'bySection'.
     * (Required)
     * 
     */
    @JsonProperty("teachersEachSection")
    public TeachersEachSection getTeachersEachSection() {
        return teachersEachSection;
    }

    /**
     * TeachersEachSection
     * <p>
     * Information about number of teacher in all sections.The value 'byDefault' shall be used for all sections, if the field 'bySection' is not informed. This value is also used when a section is not informed in 'bySection'.
     * (Required)
     * 
     */
    @JsonProperty("teachersEachSection")
    public void setTeachersEachSection(TeachersEachSection teachersEachSection) {
        this.teachersEachSection = teachersEachSection;
    }

    /**
     * RefTeachersOnCall
     * <p>
     * List of teachers who in the service.
     * (Required)
     * 
     */
    @JsonProperty("refTeachers")
    public List<RefTeacher> getRefTeachers() {
        return refTeachers;
    }

    /**
     * RefTeachersOnCall
     * <p>
     * List of teachers who in the service.
     * (Required)
     * 
     */
    @JsonProperty("refTeachers")
    public void setRefTeachers(List<RefTeacher> refTeachers) {
        this.refTeachers = refTeachers;
    }

    /**
     * OnCallTemplate
     * <p>
     * Template with teacher's preferences in the on-call service.
     * 
     */
    @JsonProperty("frameTemplate")
    public List<OnCallSectionPreference> getFrameTemplate() {
        return frameTemplate;
    }

    /**
     * OnCallTemplate
     * <p>
     * Template with teacher's preferences in the on-call service.
     * 
     */
    @JsonProperty("frameTemplate")
    public void setFrameTemplate(List<OnCallSectionPreference> frameTemplate) {
        this.frameTemplate = frameTemplate;
    }

    /**
     * Identifier of the building where the service is located. It is used to know the transfer time and the number of transfers between buildings for teachers.
     * 
     */
    @JsonProperty("refBuilding")
    public String getRefBuilding() {
        return refBuilding;
    }

    /**
     * Identifier of the building where the service is located. It is used to know the transfer time and the number of transfers between buildings for teachers.
     * 
     */
    @JsonProperty("refBuilding")
    public void setRefBuilding(String refBuilding) {
        this.refBuilding = refBuilding;
    }

    /**
     * NonClassSessionSettings
     * <p>
     * Settings of the meeting.
     * 
     */
    @JsonProperty("settings")
    public NonClassSessionSettings getSettings() {
        return settings;
    }

    /**
     * NonClassSessionSettings
     * <p>
     * Settings of the meeting.
     * 
     */
    @JsonProperty("settings")
    public void setSettings(NonClassSessionSettings settings) {
        this.settings = settings;
    }

}
