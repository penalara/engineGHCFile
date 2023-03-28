
package com.penalara.ghc.jsonghcfile.engineghcfile;

import java.util.ArrayList;
import java.util.List;
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

    /**
     * No args constructor for use in serialization
     * 
     */
    public ClassRoomSet() {
    }

    /**
     * 
     * @param anonymousRooms
     *     Number of non-specific defined classrooms that the group contains.
     * @param rooms
     *     ClassRoomEntries. Classrooms identifiers which contain the group.
     * @param id
     *     ClassRooms group identifier.
     */
    public ClassRoomSet(String id, List<String> rooms, Integer anonymousRooms) {
        super();
        this.id = id;
        this.rooms = rooms;
        this.anonymousRooms = anonymousRooms;
    }

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

}
