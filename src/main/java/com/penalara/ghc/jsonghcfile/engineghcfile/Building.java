
package com.penalara.ghc.jsonghcfile.engineghcfile;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Building
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "distances"
})
public class Building {

    /**
     * Building identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Building identifier.")
    private String id;
    /**
     * Distances
     * <p>
     * Distance in minutes to another school building.
     * 
     */
    @JsonProperty("distances")
    @JsonPropertyDescription("Distance in minutes to another school building.")
    private List<Distance> distances = new ArrayList<Distance>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Building() {
    }

    /**
     * 
     * @param distances
     *     Distances. Distance in minutes to another school building.
     * @param id
     *     Building identifier.
     */
    public Building(String id, List<Distance> distances) {
        super();
        this.id = id;
        this.distances = distances;
    }

    /**
     * Building identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Building identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Distances
     * <p>
     * Distance in minutes to another school building.
     * 
     */
    @JsonProperty("distances")
    public List<Distance> getDistances() {
        return distances;
    }

    /**
     * Distances
     * <p>
     * Distance in minutes to another school building.
     * 
     */
    @JsonProperty("distances")
    public void setDistances(List<Distance> distances) {
        this.distances = distances;
    }

}
