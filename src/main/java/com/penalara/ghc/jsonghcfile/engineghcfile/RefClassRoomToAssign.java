
package com.penalara.ghc.jsonghcfile.engineghcfile;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RefClassRoomToAssign
 * <p>
 * Object, with classrooms and/or set of classrooms, where the engine should assign classroom to each class unit of the session.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "classRoom",
    "classRoomsSetsList"
})
public class RefClassRoomToAssign {

    /**
     * ClassRoomRef
     * <p>
     * Classroom identifier.
     * 
     */
    @JsonProperty("classRoom")
    @JsonPropertyDescription("Classroom identifier.")
    private String classRoom;
    /**
     * ClassRoomsSetsList
     * <p>
     * Classroom set list where one classroom could be taken to assign to session.
     * 
     */
    @JsonProperty("classRoomsSetsList")
    @JsonPropertyDescription("Classroom set list where one classroom could be taken to assign to session.")
    private List<String> classRoomsSetsList = new ArrayList<String>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public RefClassRoomToAssign() {
    }

    /**
     * 
     * @param classRoomsSetsList
     *     ClassRoomsSetsList. Classroom set list where one classroom could be taken to assign to session.
     * @param classRoom
     *     ClassRoomRef. Classroom identifier.
     */
    public RefClassRoomToAssign(String classRoom, List<String> classRoomsSetsList) {
        super();
        this.classRoom = classRoom;
        this.classRoomsSetsList = classRoomsSetsList;
    }

    /**
     * ClassRoomRef
     * <p>
     * Classroom identifier.
     * 
     */
    @JsonProperty("classRoom")
    public String getClassRoom() {
        return classRoom;
    }

    /**
     * ClassRoomRef
     * <p>
     * Classroom identifier.
     * 
     */
    @JsonProperty("classRoom")
    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    /**
     * ClassRoomsSetsList
     * <p>
     * Classroom set list where one classroom could be taken to assign to session.
     * 
     */
    @JsonProperty("classRoomsSetsList")
    public List<String> getClassRoomsSetsList() {
        return classRoomsSetsList;
    }

    /**
     * ClassRoomsSetsList
     * <p>
     * Classroom set list where one classroom could be taken to assign to session.
     * 
     */
    @JsonProperty("classRoomsSetsList")
    public void setClassRoomsSetsList(List<String> classRoomsSetsList) {
        this.classRoomsSetsList = classRoomsSetsList;
    }

}
