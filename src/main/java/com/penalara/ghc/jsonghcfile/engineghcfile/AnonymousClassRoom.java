
package com.penalara.ghc.jsonghcfile.engineghcfile;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AnonymousClassRoom
 * <p>
 * Object with anonymous classrooms created in a set of classrooms.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "refClassRoomsSet",
    "classRoomsCreated"
})
public class AnonymousClassRoom {

    /**
     * Identifier of the ClassRooms group.
     * (Required)
     * 
     */
    @JsonProperty("refClassRoomsSet")
    @JsonPropertyDescription("Identifier of the ClassRooms group.")
    private String refClassRoomsSet;
    /**
     * ListOfAnonymousRooms
     * <p>
     * List of anonymous classroom created in one set of classrooms.
     * (Required)
     * 
     */
    @JsonProperty("classRoomsCreated")
    @JsonPropertyDescription("List of anonymous classroom created in one set of classrooms.")
    private List<String> classRoomsCreated = new ArrayList<String>();

    /**
     * Identifier of the ClassRooms group.
     * (Required)
     * 
     */
    @JsonProperty("refClassRoomsSet")
    public String getRefClassRoomsSet() {
        return refClassRoomsSet;
    }

    /**
     * Identifier of the ClassRooms group.
     * (Required)
     * 
     */
    @JsonProperty("refClassRoomsSet")
    public void setRefClassRoomsSet(String refClassRoomsSet) {
        this.refClassRoomsSet = refClassRoomsSet;
    }

    /**
     * ListOfAnonymousRooms
     * <p>
     * List of anonymous classroom created in one set of classrooms.
     * (Required)
     * 
     */
    @JsonProperty("classRoomsCreated")
    public List<String> getClassRoomsCreated() {
        return classRoomsCreated;
    }

    /**
     * ListOfAnonymousRooms
     * <p>
     * List of anonymous classroom created in one set of classrooms.
     * (Required)
     * 
     */
    @JsonProperty("classRoomsCreated")
    public void setClassRoomsCreated(List<String> classRoomsCreated) {
        this.classRoomsCreated = classRoomsCreated;
    }

}
