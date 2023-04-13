
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
 * GroupReferenceType
 * <p>
 * Contains the reference to a group of the session, and optionally, the number of students of the group that attend the session.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "refIdGroup",
    "numStudents"
})
public class GroupReferenceType {

    /**
     * Group identifier.
     * (Required)
     * 
     */
    @JsonProperty("refIdGroup")
    @JsonPropertyDescription("Group identifier.")
    private String refIdGroup;
    /**
     * Custom number of students that are in the class units. If it is not specified, the engine defaults to the value of the Group object.
     * 
     */
    @JsonProperty("numStudents")
    @JsonPropertyDescription("Custom number of students that are in the class units. If it is not specified, the engine defaults to the value of the Group object.")
    private Integer numStudents;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Group identifier.
     * (Required)
     * 
     */
    @JsonProperty("refIdGroup")
    public String getRefIdGroup() {
        return refIdGroup;
    }

    /**
     * Group identifier.
     * (Required)
     * 
     */
    @JsonProperty("refIdGroup")
    public void setRefIdGroup(String refIdGroup) {
        this.refIdGroup = refIdGroup;
    }

    /**
     * Custom number of students that are in the class units. If it is not specified, the engine defaults to the value of the Group object.
     * 
     */
    @JsonProperty("numStudents")
    public Integer getNumStudents() {
        return numStudents;
    }

    /**
     * Custom number of students that are in the class units. If it is not specified, the engine defaults to the value of the Group object.
     * 
     */
    @JsonProperty("numStudents")
    public void setNumStudents(Integer numStudents) {
        this.numStudents = numStudents;
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
