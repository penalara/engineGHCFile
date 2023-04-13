
package com.penalara.ghc.jsonghcfile.engineghcfile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * SessionClassRooms
 * <p>
 * It contains the information about the classrooms for the class units. At least one classroom is required for the class units.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "classRoomsToAssign",
    "capacityPreference",
    "capacityType"
})
public class SessionClassRooms {

    /**
     * ClassRoomsToAssign
     * <p>
     * List of classrooms to the session. Each object in the list represent one classroom that must be assigned.
     * (Required)
     * 
     */
    @JsonProperty("classRoomsToAssign")
    @JsonPropertyDescription("List of classrooms to the session. Each object in the list represent one classroom that must be assigned.")
    private List<RefClassRoomToAssign> classRoomsToAssign = new ArrayList<RefClassRoomToAssign>();
    /**
     * Preference on whether the engine should assess the capacity of the classroom to allocate each class unit.
     * 
     */
    @JsonProperty("capacityPreference")
    @JsonPropertyDescription("Preference on whether the engine should assess the capacity of the classroom to allocate each class unit.")
    private SessionClassRooms.CapacityPreference capacityPreference = SessionClassRooms.CapacityPreference.fromValue("ignore");
    /**
     * It indicates whether all students in the class units should fit in each classroom, or in the amount of all classrooms.
     * 
     */
    @JsonProperty("capacityType")
    @JsonPropertyDescription("It indicates whether all students in the class units should fit in each classroom, or in the amount of all classrooms.")
    private SessionClassRooms.CapacityType capacityType = SessionClassRooms.CapacityType.fromValue("individual");

    /**
     * ClassRoomsToAssign
     * <p>
     * List of classrooms to the session. Each object in the list represent one classroom that must be assigned.
     * (Required)
     * 
     */
    @JsonProperty("classRoomsToAssign")
    public List<RefClassRoomToAssign> getClassRoomsToAssign() {
        return classRoomsToAssign;
    }

    /**
     * ClassRoomsToAssign
     * <p>
     * List of classrooms to the session. Each object in the list represent one classroom that must be assigned.
     * (Required)
     * 
     */
    @JsonProperty("classRoomsToAssign")
    public void setClassRoomsToAssign(List<RefClassRoomToAssign> classRoomsToAssign) {
        this.classRoomsToAssign = classRoomsToAssign;
    }

    /**
     * Preference on whether the engine should assess the capacity of the classroom to allocate each class unit.
     * 
     */
    @JsonProperty("capacityPreference")
    public SessionClassRooms.CapacityPreference getCapacityPreference() {
        return capacityPreference;
    }

    /**
     * Preference on whether the engine should assess the capacity of the classroom to allocate each class unit.
     * 
     */
    @JsonProperty("capacityPreference")
    public void setCapacityPreference(SessionClassRooms.CapacityPreference capacityPreference) {
        this.capacityPreference = capacityPreference;
    }

    /**
     * It indicates whether all students in the class units should fit in each classroom, or in the amount of all classrooms.
     * 
     */
    @JsonProperty("capacityType")
    public SessionClassRooms.CapacityType getCapacityType() {
        return capacityType;
    }

    /**
     * It indicates whether all students in the class units should fit in each classroom, or in the amount of all classrooms.
     * 
     */
    @JsonProperty("capacityType")
    public void setCapacityType(SessionClassRooms.CapacityType capacityType) {
        this.capacityType = capacityType;
    }


    /**
     * Preference on whether the engine should assess the capacity of the classroom to allocate each class unit.
     * 
     */
    public enum CapacityPreference {

        ATTEMPT("attempt"),
        STRICT("strict"),
        IGNORE("ignore");
        private final String value;
        private final static Map<String, SessionClassRooms.CapacityPreference> CONSTANTS = new HashMap<String, SessionClassRooms.CapacityPreference>();

        static {
            for (SessionClassRooms.CapacityPreference c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        CapacityPreference(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static SessionClassRooms.CapacityPreference fromValue(String value) {
            SessionClassRooms.CapacityPreference constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * It indicates whether all students in the class units should fit in each classroom, or in the amount of all classrooms.
     * 
     */
    public enum CapacityType {

        INDIVIDUAL("individual"),
        COLLECTIVE("collective");
        private final String value;
        private final static Map<String, SessionClassRooms.CapacityType> CONSTANTS = new HashMap<String, SessionClassRooms.CapacityType>();

        static {
            for (SessionClassRooms.CapacityType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        CapacityType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static SessionClassRooms.CapacityType fromValue(String value) {
            SessionClassRooms.CapacityType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
