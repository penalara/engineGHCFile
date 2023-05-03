
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
 * AssignedComplementary
 * <p>
 * Teacher's complementary activity assigned in the timetable.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "refComplementary",
    "refClassRomms"
})
public class AssignedComplementary {

    /**
     * Identifier of the Complementary Activity assigned.
     * (Required)
     * 
     */
    @JsonProperty("refComplementary")
    @JsonPropertyDescription("Identifier of the Complementary Activity assigned.")
    private Integer refComplementary;
    /**
     * RefclassRomms
     * <p>
     * List of classrooms assigned to teach the class unit.
     * 
     */
    @JsonProperty("refClassRomms")
    @JsonPropertyDescription("List of classrooms assigned to teach the class unit.")
    private List<String> refClassRomms = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Identifier of the Complementary Activity assigned.
     * (Required)
     * 
     */
    @JsonProperty("refComplementary")
    public Integer getRefComplementary() {
        return refComplementary;
    }

    /**
     * Identifier of the Complementary Activity assigned.
     * (Required)
     * 
     */
    @JsonProperty("refComplementary")
    public void setRefComplementary(Integer refComplementary) {
        this.refComplementary = refComplementary;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
