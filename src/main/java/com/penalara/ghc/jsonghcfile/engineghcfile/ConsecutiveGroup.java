
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
 * ConsecutiveGroup
 * <p>
 * Contains the references of a continuous sessions group.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "refSessions",
    "order",
    "allowBreakBetweenSessions"
})
public class ConsecutiveGroup {

    /**
     * Continuous sessions group identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Continuous sessions group identifier.")
    private Integer id;
    /**
     * SessionRefs
     * <p>
     * List of the consecutive sessions. Must contain the sesion itself and the proper order of continuity (see 'order' property).
     * (Required)
     * 
     */
    @JsonProperty("refSessions")
    @JsonPropertyDescription("List of the consecutive sessions. Must contain the sesion itself and the proper order of continuity (see 'order' property).")
    private List<Integer> refSessions = new ArrayList<Integer>();
    /**
     * Indicates if the sessions must be 'ordered', 'unordered' or 'sameDay'  (it does not matter as long as they are allocated on the same day).
     * 
     */
    @JsonProperty("order")
    @JsonPropertyDescription("Indicates if the sessions must be 'ordered', 'unordered' or 'sameDay'  (it does not matter as long as they are allocated on the same day).")
    private ConsecutiveGroup.Order order = ConsecutiveGroup.Order.fromValue("unordered");
    /**
     * Indicates if break between sessions is allowed to keep the relation.
     * 
     */
    @JsonProperty("allowBreakBetweenSessions")
    @JsonPropertyDescription("Indicates if break between sessions is allowed to keep the relation.")
    private Boolean allowBreakBetweenSessions = false;

    /**
     * Continuous sessions group identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * Continuous sessions group identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * SessionRefs
     * <p>
     * List of the consecutive sessions. Must contain the sesion itself and the proper order of continuity (see 'order' property).
     * (Required)
     * 
     */
    @JsonProperty("refSessions")
    public List<Integer> getRefSessions() {
        return refSessions;
    }

    /**
     * SessionRefs
     * <p>
     * List of the consecutive sessions. Must contain the sesion itself and the proper order of continuity (see 'order' property).
     * (Required)
     * 
     */
    @JsonProperty("refSessions")
    public void setRefSessions(List<Integer> refSessions) {
        this.refSessions = refSessions;
    }

    /**
     * Indicates if the sessions must be 'ordered', 'unordered' or 'sameDay'  (it does not matter as long as they are allocated on the same day).
     * 
     */
    @JsonProperty("order")
    public ConsecutiveGroup.Order getOrder() {
        return order;
    }

    /**
     * Indicates if the sessions must be 'ordered', 'unordered' or 'sameDay'  (it does not matter as long as they are allocated on the same day).
     * 
     */
    @JsonProperty("order")
    public void setOrder(ConsecutiveGroup.Order order) {
        this.order = order;
    }

    /**
     * Indicates if break between sessions is allowed to keep the relation.
     * 
     */
    @JsonProperty("allowBreakBetweenSessions")
    public Boolean getAllowBreakBetweenSessions() {
        return allowBreakBetweenSessions;
    }

    /**
     * Indicates if break between sessions is allowed to keep the relation.
     * 
     */
    @JsonProperty("allowBreakBetweenSessions")
    public void setAllowBreakBetweenSessions(Boolean allowBreakBetweenSessions) {
        this.allowBreakBetweenSessions = allowBreakBetweenSessions;
    }


    /**
     * Indicates if the sessions must be 'ordered', 'unordered' or 'sameDay'  (it does not matter as long as they are allocated on the same day).
     * 
     */
    public enum Order {

        UNORDERED("unordered"),
        ORDERED("ordered"),
        SAME_DAY("sameDay");
        private final String value;
        private final static Map<String, ConsecutiveGroup.Order> CONSTANTS = new HashMap<String, ConsecutiveGroup.Order>();

        static {
            for (ConsecutiveGroup.Order c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Order(String value) {
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
        public static ConsecutiveGroup.Order fromValue(String value) {
            ConsecutiveGroup.Order constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
