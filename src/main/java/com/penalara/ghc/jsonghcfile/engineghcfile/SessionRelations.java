
package com.penalara.ghc.jsonghcfile.engineghcfile;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SessionRelations
 * <p>
 * It contains information on the relationships between this and other class units. These conditions can only apply to class units with students.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "refSimultaneusGroup",
    "differentDays",
    "consecutiveGroup",
    "nonConsecutiveSessions",
    "nonSimultaneus",
    "previousTo",
    "afterTo",
    "maximumSeparationTo",
    "minimumSeparationTo"
})
public class SessionRelations {

    /**
     * RefSimultaneusGroup
     * <p>
     * Identifier of the group of simultaneous class units of the subject. Indicates that the class units are to be taught at the same time as the group class units. 
     * 
     */
    @JsonProperty("refSimultaneusGroup")
    @JsonPropertyDescription("Identifier of the group of simultaneous class units of the subject. Indicates that the class units are to be taught at the same time as the group class units. ")
    private Integer refSimultaneusGroup;
    /**
     * DifferentDays
     * <p>
     * Conditions on this and another class unit cannot coincide on the same day.
     * 
     */
    @JsonProperty("differentDays")
    @JsonPropertyDescription("Conditions on this and another class unit cannot coincide on the same day.")
    private DifferentDays differentDays;
    /**
     * ConsecutiveGroup
     * <p>
     * Contains the references of a continuous sessions group.
     * 
     */
    @JsonProperty("consecutiveGroup")
    @JsonPropertyDescription("Contains the references of a continuous sessions group.")
    private ConsecutiveGroup consecutiveGroup;
    /**
     * NonConsecutiveSessions
     * <p>
     * Identifiers of the sessions which class units must not be consecutive. This is a strict condition.
     * 
     */
    @JsonProperty("nonConsecutiveSessions")
    @JsonPropertyDescription("Identifiers of the sessions which class units must not be consecutive. This is a strict condition.")
    private List<Integer> nonConsecutiveSessions = new ArrayList<Integer>();
    /**
     * NonSimultaneus
     * <p>
     * Identifiers of the sessions that they should not be assigned at the same time. It is a strict condition.
     * 
     */
    @JsonProperty("nonSimultaneus")
    @JsonPropertyDescription("Identifiers of the sessions that they should not be assigned at the same time. It is a strict condition.")
    private List<Integer> nonSimultaneus = new ArrayList<Integer>();
    /**
     * PreviousTo
     * <p>
     * This indicates that this class unit must be allocated on a previous day to the class units in the list. This is a strict condition.
     * 
     */
    @JsonProperty("previousTo")
    @JsonPropertyDescription("This indicates that this class unit must be allocated on a previous day to the class units in the list. This is a strict condition.")
    private List<Integer> previousTo = new ArrayList<Integer>();
    /**
     * AfterTo
     * <p>
     * This indicates that this class unit must be allocated on a subsequent day to the class units in the list. This is a strict condition.
     * 
     */
    @JsonProperty("afterTo")
    @JsonPropertyDescription("This indicates that this class unit must be allocated on a subsequent day to the class units in the list. This is a strict condition.")
    private List<Integer> afterTo = new ArrayList<Integer>();
    /**
     * MaximumSeparationTo
     * <p>
     * It contains class units to be taught within a maximum number of days of the current class units.
     * 
     */
    @JsonProperty("maximumSeparationTo")
    @JsonPropertyDescription("It contains class units to be taught within a maximum number of days of the current class units.")
    private List<MaximumSeparationToSession> maximumSeparationTo = new ArrayList<MaximumSeparationToSession>();
    /**
     * MinimumSeparationTo
     * <p>
     * It contains class units that must be taught at least a minimum number of days apart from the current class unit. .
     * 
     */
    @JsonProperty("minimumSeparationTo")
    @JsonPropertyDescription("It contains class units that must be taught at least a minimum number of days apart from the current class unit. .")
    private List<MinimumSeparationToSession> minimumSeparationTo = new ArrayList<MinimumSeparationToSession>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SessionRelations() {
    }

    /**
     * 
     * @param differentDays
     *     DifferentDays. Conditions on this and another class unit cannot coincide on the same day.
     * @param nonSimultaneus
     *     NonSimultaneus. Identifiers of the sessions that they should not be assigned at the same time. It is a strict condition.
     * @param previousTo
     *     PreviousTo. This indicates that this class unit must be allocated on a previous day to the class units in the list. This is a strict condition.
     * @param consecutiveGroup
     *     ConsecutiveGroup. Contains the references of a continuous sessions group.
     * @param minimumSeparationTo
     *     MinimumSeparationTo. It contains class units that must be taught at least a minimum number of days apart from the current class unit. .
     * @param afterTo
     *     AfterTo. This indicates that this class unit must be allocated on a subsequent day to the class units in the list. This is a strict condition.
     * @param refSimultaneusGroup
     *     RefSimultaneusGroup. Identifier of the group of simultaneous class units of the subject. Indicates that the class units are to be taught at the same time as the group class units. .
     * @param nonConsecutiveSessions
     *     NonConsecutiveSessions. Identifiers of the sessions which class units must not be consecutive. This is a strict condition.
     * @param maximumSeparationTo
     *     MaximumSeparationTo. It contains class units to be taught within a maximum number of days of the current class units.
     */
    public SessionRelations(Integer refSimultaneusGroup, DifferentDays differentDays, ConsecutiveGroup consecutiveGroup, List<Integer> nonConsecutiveSessions, List<Integer> nonSimultaneus, List<Integer> previousTo, List<Integer> afterTo, List<MaximumSeparationToSession> maximumSeparationTo, List<MinimumSeparationToSession> minimumSeparationTo) {
        super();
        this.refSimultaneusGroup = refSimultaneusGroup;
        this.differentDays = differentDays;
        this.consecutiveGroup = consecutiveGroup;
        this.nonConsecutiveSessions = nonConsecutiveSessions;
        this.nonSimultaneus = nonSimultaneus;
        this.previousTo = previousTo;
        this.afterTo = afterTo;
        this.maximumSeparationTo = maximumSeparationTo;
        this.minimumSeparationTo = minimumSeparationTo;
    }

    /**
     * RefSimultaneusGroup
     * <p>
     * Identifier of the group of simultaneous class units of the subject. Indicates that the class units are to be taught at the same time as the group class units. 
     * 
     */
    @JsonProperty("refSimultaneusGroup")
    public Integer getRefSimultaneusGroup() {
        return refSimultaneusGroup;
    }

    /**
     * RefSimultaneusGroup
     * <p>
     * Identifier of the group of simultaneous class units of the subject. Indicates that the class units are to be taught at the same time as the group class units. 
     * 
     */
    @JsonProperty("refSimultaneusGroup")
    public void setRefSimultaneusGroup(Integer refSimultaneusGroup) {
        this.refSimultaneusGroup = refSimultaneusGroup;
    }

    /**
     * DifferentDays
     * <p>
     * Conditions on this and another class unit cannot coincide on the same day.
     * 
     */
    @JsonProperty("differentDays")
    public DifferentDays getDifferentDays() {
        return differentDays;
    }

    /**
     * DifferentDays
     * <p>
     * Conditions on this and another class unit cannot coincide on the same day.
     * 
     */
    @JsonProperty("differentDays")
    public void setDifferentDays(DifferentDays differentDays) {
        this.differentDays = differentDays;
    }

    /**
     * ConsecutiveGroup
     * <p>
     * Contains the references of a continuous sessions group.
     * 
     */
    @JsonProperty("consecutiveGroup")
    public ConsecutiveGroup getConsecutiveGroup() {
        return consecutiveGroup;
    }

    /**
     * ConsecutiveGroup
     * <p>
     * Contains the references of a continuous sessions group.
     * 
     */
    @JsonProperty("consecutiveGroup")
    public void setConsecutiveGroup(ConsecutiveGroup consecutiveGroup) {
        this.consecutiveGroup = consecutiveGroup;
    }

    /**
     * NonConsecutiveSessions
     * <p>
     * Identifiers of the sessions which class units must not be consecutive. This is a strict condition.
     * 
     */
    @JsonProperty("nonConsecutiveSessions")
    public List<Integer> getNonConsecutiveSessions() {
        return nonConsecutiveSessions;
    }

    /**
     * NonConsecutiveSessions
     * <p>
     * Identifiers of the sessions which class units must not be consecutive. This is a strict condition.
     * 
     */
    @JsonProperty("nonConsecutiveSessions")
    public void setNonConsecutiveSessions(List<Integer> nonConsecutiveSessions) {
        this.nonConsecutiveSessions = nonConsecutiveSessions;
    }

    /**
     * NonSimultaneus
     * <p>
     * Identifiers of the sessions that they should not be assigned at the same time. It is a strict condition.
     * 
     */
    @JsonProperty("nonSimultaneus")
    public List<Integer> getNonSimultaneus() {
        return nonSimultaneus;
    }

    /**
     * NonSimultaneus
     * <p>
     * Identifiers of the sessions that they should not be assigned at the same time. It is a strict condition.
     * 
     */
    @JsonProperty("nonSimultaneus")
    public void setNonSimultaneus(List<Integer> nonSimultaneus) {
        this.nonSimultaneus = nonSimultaneus;
    }

    /**
     * PreviousTo
     * <p>
     * This indicates that this class unit must be allocated on a previous day to the class units in the list. This is a strict condition.
     * 
     */
    @JsonProperty("previousTo")
    public List<Integer> getPreviousTo() {
        return previousTo;
    }

    /**
     * PreviousTo
     * <p>
     * This indicates that this class unit must be allocated on a previous day to the class units in the list. This is a strict condition.
     * 
     */
    @JsonProperty("previousTo")
    public void setPreviousTo(List<Integer> previousTo) {
        this.previousTo = previousTo;
    }

    /**
     * AfterTo
     * <p>
     * This indicates that this class unit must be allocated on a subsequent day to the class units in the list. This is a strict condition.
     * 
     */
    @JsonProperty("afterTo")
    public List<Integer> getAfterTo() {
        return afterTo;
    }

    /**
     * AfterTo
     * <p>
     * This indicates that this class unit must be allocated on a subsequent day to the class units in the list. This is a strict condition.
     * 
     */
    @JsonProperty("afterTo")
    public void setAfterTo(List<Integer> afterTo) {
        this.afterTo = afterTo;
    }

    /**
     * MaximumSeparationTo
     * <p>
     * It contains class units to be taught within a maximum number of days of the current class units.
     * 
     */
    @JsonProperty("maximumSeparationTo")
    public List<MaximumSeparationToSession> getMaximumSeparationTo() {
        return maximumSeparationTo;
    }

    /**
     * MaximumSeparationTo
     * <p>
     * It contains class units to be taught within a maximum number of days of the current class units.
     * 
     */
    @JsonProperty("maximumSeparationTo")
    public void setMaximumSeparationTo(List<MaximumSeparationToSession> maximumSeparationTo) {
        this.maximumSeparationTo = maximumSeparationTo;
    }

    /**
     * MinimumSeparationTo
     * <p>
     * It contains class units that must be taught at least a minimum number of days apart from the current class unit. .
     * 
     */
    @JsonProperty("minimumSeparationTo")
    public List<MinimumSeparationToSession> getMinimumSeparationTo() {
        return minimumSeparationTo;
    }

    /**
     * MinimumSeparationTo
     * <p>
     * It contains class units that must be taught at least a minimum number of days apart from the current class unit. .
     * 
     */
    @JsonProperty("minimumSeparationTo")
    public void setMinimumSeparationTo(List<MinimumSeparationToSession> minimumSeparationTo) {
        this.minimumSeparationTo = minimumSeparationTo;
    }

}
