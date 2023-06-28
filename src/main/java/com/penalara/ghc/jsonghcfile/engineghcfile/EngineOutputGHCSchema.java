
package com.penalara.ghc.jsonghcfile.engineghcfile;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EngineOutputGHCSchema
 * <p>
 * Schema document to format in Json the timetable created by PenalaraGHC.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "date",
    "weight",
    "timetable"
})
public class EngineOutputGHCSchema {

    /**
     * JsonGenerationDate
     * <p>
     * Date of result creation.
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("Date of result creation.")
    private Date date;
    /**
     * ResultWeight
     * <p>
     * Weight of the result according to the non-mandatory conditions not fulfilled.
     * (Required)
     * 
     */
    @JsonProperty("weight")
    @JsonPropertyDescription("Weight of the result according to the non-mandatory conditions not fulfilled.")
    private Integer weight;
    /**
     * GeneratedJsonTimetable
     * <p>
     * Object with timetable specification resolved.
     * (Required)
     * 
     */
    @JsonProperty("timetable")
    @JsonPropertyDescription("Object with timetable specification resolved.")
    private GeneratedJsonTimetable timetable;

    /**
     * JsonGenerationDate
     * <p>
     * Date of result creation.
     * 
     */
    @JsonProperty("date")
    public Date getDate() {
        return date;
    }

    /**
     * JsonGenerationDate
     * <p>
     * Date of result creation.
     * 
     */
    @JsonProperty("date")
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * ResultWeight
     * <p>
     * Weight of the result according to the non-mandatory conditions not fulfilled.
     * (Required)
     * 
     */
    @JsonProperty("weight")
    public Integer getWeight() {
        return weight;
    }

    /**
     * ResultWeight
     * <p>
     * Weight of the result according to the non-mandatory conditions not fulfilled.
     * (Required)
     * 
     */
    @JsonProperty("weight")
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * GeneratedJsonTimetable
     * <p>
     * Object with timetable specification resolved.
     * (Required)
     * 
     */
    @JsonProperty("timetable")
    public GeneratedJsonTimetable getTimetable() {
        return timetable;
    }

    /**
     * GeneratedJsonTimetable
     * <p>
     * Object with timetable specification resolved.
     * (Required)
     * 
     */
    @JsonProperty("timetable")
    public void setTimetable(GeneratedJsonTimetable timetable) {
        this.timetable = timetable;
    }

}
