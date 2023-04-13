
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
 * ClassRoomSet
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "rooms",
    "anonymousRooms"
})
public class ClassRoomSet {

    /**
     * ClassRooms group identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("ClassRooms group identifier.")
    private String id;
    /**
     * ClassRoomEntries
     * <p>
     * Classrooms identifiers which contain the group.
     * (Required)
     * 
     */
    @JsonProperty("rooms")
    @JsonPropertyDescription("Classrooms identifiers\u00a0which\u00a0contain\u00a0the\u00a0group.")
    private List<String> rooms = new ArrayList<String>();
    /**
     * Number of non-specific defined classrooms that the group contains.
     * 
     */
    @JsonProperty("anonymousRooms")
    @JsonPropertyDescription("Number of non-specific defined classrooms that the group contains.")
    private Integer anonymousRooms = 0;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * ClassRooms group identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ClassRooms group identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * ClassRoomEntries
     * <p>
     * Classrooms identifiers which contain the group.
     * (Required)
     * 
     */
    @JsonProperty("rooms")
    public List<String> getRooms() {
        return rooms;
    }

    /**
     * ClassRoomEntries
     * <p>
     * Classrooms identifiers which contain the group.
     * (Required)
     * 
     */
    @JsonProperty("rooms")
    public void setRooms(List<String> rooms) {
        this.rooms = rooms;
    }

    /**
     * Number of non-specific defined classrooms that the group contains.
     * 
     */
    @JsonProperty("anonymousRooms")
    public Integer getAnonymousRooms() {
        return anonymousRooms;
    }

    /**
     * Number of non-specific defined classrooms that the group contains.
     * 
     */
    @JsonProperty("anonymousRooms")
    public void setAnonymousRooms(Integer anonymousRooms) {
        this.anonymousRooms = anonymousRooms;
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
