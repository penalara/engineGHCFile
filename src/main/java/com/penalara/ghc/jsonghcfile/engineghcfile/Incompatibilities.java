
package com.penalara.ghc.jsonghcfile.engineghcfile;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import com.penalara.ghc.jsonghcfile.engineinput.ConditionTypeWithTime;


/**
 * Incompatibilities
 * <p>
 * It contains the teacher's incompatibilities on the allocation of class units and rest periods.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "freeTimeBetweenDayBeforeAndCurrent",
    "freeTimeBetweenEndWeekAndStartWeekDays",
    "freeTimeFirstOrLastHoursDay",
    "doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection",
    "doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection",
    "doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection",
    "doNotFinishAtLastMorningSectionIfHasAfternoonAssignment",
    "doNotStartAtFirstMorningSectionIfHasAfternoonAssignment",
    "freeTimeAroundMidday"
})
public class Incompatibilities {

    /**
     * ConditionTypeWithTime
     * <p>
     * Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("freeTimeBetweenDayBeforeAndCurrent")
    @JsonPropertyDescription("Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.")
    private ConditionTypeWithTime freeTimeBetweenDayBeforeAndCurrent;
    /**
     * ConditionTypeWithTime
     * <p>
     * Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("freeTimeBetweenEndWeekAndStartWeekDays")
    @JsonPropertyDescription("Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.")
    private ConditionTypeWithTime freeTimeBetweenEndWeekAndStartWeekDays;
    /**
     * ConditionTypeWithTime
     * <p>
     * Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("freeTimeFirstOrLastHoursDay")
    @JsonPropertyDescription("Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.")
    private ConditionTypeWithTime freeTimeFirstOrLastHoursDay;
    /**
     * DoNotFinishAtLastAfternoonSection
     * <p>
     * o not finish at the last hour of the evening and start at the first.
     * 
     */
    @JsonProperty("doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection")
    @JsonPropertyDescription("o not finish at the last hour of the evening and start at the first.")
    private Incompatibilities.DoNotFinishAtLastAfternoonSection doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection;
    /**
     * DoNotFinishAtLastMorningSection
     * <p>
     * Do not start at the first hour and finish at the last hour of the morning.
     * 
     */
    @JsonProperty("doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection")
    @JsonPropertyDescription("Do not start at the first hour and finish at the last hour of the morning.")
    private Incompatibilities.DoNotFinishAtLastMorningSection doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection;
    /**
     * DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon
     * <p>
     * Do not finish at the last hour of the morning and start at the first hour of the evening.
     * 
     */
    @JsonProperty("doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection")
    @JsonPropertyDescription("Do not finish at the last hour of the morning and start at the first hour of the evening.")
    private Incompatibilities.DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection;
    /**
     * DoNotFinishAtLastMorningSectionIfHasAfternoon
     * <p>
     * Do not finish at the last hour in the morning and have the evening busy.
     * 
     */
    @JsonProperty("doNotFinishAtLastMorningSectionIfHasAfternoonAssignment")
    @JsonPropertyDescription("Do not finish at the last hour in the morning and have the evening busy.")
    private Incompatibilities.DoNotFinishAtLastMorningSectionIfHasAfternoon doNotFinishAtLastMorningSectionIfHasAfternoonAssignment;
    /**
     * DoNotStartAtFirstMorningSection
     * <p>
     * Do not start at the first hour and keep the evening busy.
     * 
     */
    @JsonProperty("doNotStartAtFirstMorningSectionIfHasAfternoonAssignment")
    @JsonPropertyDescription("Do not start at the first hour and keep the evening busy.")
    private Incompatibilities.DoNotStartAtFirstMorningSection doNotStartAtFirstMorningSectionIfHasAfternoonAssignment;
    /**
     * ConditionTypeWithTime
     * <p>
     * Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("freeTimeAroundMidday")
    @JsonPropertyDescription("Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.")
    private ConditionTypeWithTime freeTimeAroundMidday;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Incompatibilities() {
    }

    /**
     * 
     * @param doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection
     *     DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon. Do not finish at the last hour of the morning and start at the first hour of the evening.
     * @param freeTimeBetweenDayBeforeAndCurrent
     *     FreeTimeBetweenDays. Minutes between departure and arrival of the following day.
     * @param doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection
     *     DoNotFinishAtLastMorningSection. Do not start at the first hour and finish at the last hour of the morning.
     * @param freeTimeFirstOrLastHoursDay
     *     FreeTimeFirstOrLastHoursDay. Minutes of free time at first or last hours of the day.
     * @param doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection
     *     DoNotFinishAtLastAfternoonSection. o not finish at the last hour of the evening and start at the first.
     * @param doNotFinishAtLastMorningSectionIfHasAfternoonAssignment
     *     DoNotFinishAtLastMorningSectionIfHasAfternoon. Do not finish at the last hour in the morning and have the evening busy.
     * @param freeTimeBetweenEndWeekAndStartWeekDays
     *     FreeTimeBetweenWeeksBorders. Minutes between the end time of the last day of the week and the start time of the following week.
     * @param freeTimeAroundMidday
     *     FreeTimeAroundMidday. Do not have less than a custom free time around noon pause.
     * @param doNotStartAtFirstMorningSectionIfHasAfternoonAssignment
     *     DoNotStartAtFirstMorningSection. Do not start at the first hour and keep the evening busy.
     */
    public Incompatibilities(ConditionTypeWithTime freeTimeBetweenDayBeforeAndCurrent, ConditionTypeWithTime freeTimeBetweenEndWeekAndStartWeekDays, ConditionTypeWithTime freeTimeFirstOrLastHoursDay, Incompatibilities.DoNotFinishAtLastAfternoonSection doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection, Incompatibilities.DoNotFinishAtLastMorningSection doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection, Incompatibilities.DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection, Incompatibilities.DoNotFinishAtLastMorningSectionIfHasAfternoon doNotFinishAtLastMorningSectionIfHasAfternoonAssignment, Incompatibilities.DoNotStartAtFirstMorningSection doNotStartAtFirstMorningSectionIfHasAfternoonAssignment, ConditionTypeWithTime freeTimeAroundMidday) {
        super();
        this.freeTimeBetweenDayBeforeAndCurrent = freeTimeBetweenDayBeforeAndCurrent;
        this.freeTimeBetweenEndWeekAndStartWeekDays = freeTimeBetweenEndWeekAndStartWeekDays;
        this.freeTimeFirstOrLastHoursDay = freeTimeFirstOrLastHoursDay;
        this.doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection = doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection;
        this.doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection = doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection;
        this.doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection = doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection;
        this.doNotFinishAtLastMorningSectionIfHasAfternoonAssignment = doNotFinishAtLastMorningSectionIfHasAfternoonAssignment;
        this.doNotStartAtFirstMorningSectionIfHasAfternoonAssignment = doNotStartAtFirstMorningSectionIfHasAfternoonAssignment;
        this.freeTimeAroundMidday = freeTimeAroundMidday;
    }

    /**
     * ConditionTypeWithTime
     * <p>
     * Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("freeTimeBetweenDayBeforeAndCurrent")
    public ConditionTypeWithTime getFreeTimeBetweenDayBeforeAndCurrent() {
        return freeTimeBetweenDayBeforeAndCurrent;
    }

    /**
     * ConditionTypeWithTime
     * <p>
     * Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("freeTimeBetweenDayBeforeAndCurrent")
    public void setFreeTimeBetweenDayBeforeAndCurrent(ConditionTypeWithTime freeTimeBetweenDayBeforeAndCurrent) {
        this.freeTimeBetweenDayBeforeAndCurrent = freeTimeBetweenDayBeforeAndCurrent;
    }

    /**
     * ConditionTypeWithTime
     * <p>
     * Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("freeTimeBetweenEndWeekAndStartWeekDays")
    public ConditionTypeWithTime getFreeTimeBetweenEndWeekAndStartWeekDays() {
        return freeTimeBetweenEndWeekAndStartWeekDays;
    }

    /**
     * ConditionTypeWithTime
     * <p>
     * Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("freeTimeBetweenEndWeekAndStartWeekDays")
    public void setFreeTimeBetweenEndWeekAndStartWeekDays(ConditionTypeWithTime freeTimeBetweenEndWeekAndStartWeekDays) {
        this.freeTimeBetweenEndWeekAndStartWeekDays = freeTimeBetweenEndWeekAndStartWeekDays;
    }

    /**
     * ConditionTypeWithTime
     * <p>
     * Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("freeTimeFirstOrLastHoursDay")
    public ConditionTypeWithTime getFreeTimeFirstOrLastHoursDay() {
        return freeTimeFirstOrLastHoursDay;
    }

    /**
     * ConditionTypeWithTime
     * <p>
     * Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("freeTimeFirstOrLastHoursDay")
    public void setFreeTimeFirstOrLastHoursDay(ConditionTypeWithTime freeTimeFirstOrLastHoursDay) {
        this.freeTimeFirstOrLastHoursDay = freeTimeFirstOrLastHoursDay;
    }

    /**
     * DoNotFinishAtLastAfternoonSection
     * <p>
     * o not finish at the last hour of the evening and start at the first.
     * 
     */
    @JsonProperty("doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection")
    public Incompatibilities.DoNotFinishAtLastAfternoonSection getDoNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection() {
        return doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection;
    }

    /**
     * DoNotFinishAtLastAfternoonSection
     * <p>
     * o not finish at the last hour of the evening and start at the first.
     * 
     */
    @JsonProperty("doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection")
    public void setDoNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection(Incompatibilities.DoNotFinishAtLastAfternoonSection doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection) {
        this.doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection = doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection;
    }

    /**
     * DoNotFinishAtLastMorningSection
     * <p>
     * Do not start at the first hour and finish at the last hour of the morning.
     * 
     */
    @JsonProperty("doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection")
    public Incompatibilities.DoNotFinishAtLastMorningSection getDoNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection() {
        return doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection;
    }

    /**
     * DoNotFinishAtLastMorningSection
     * <p>
     * Do not start at the first hour and finish at the last hour of the morning.
     * 
     */
    @JsonProperty("doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection")
    public void setDoNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection(Incompatibilities.DoNotFinishAtLastMorningSection doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection) {
        this.doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection = doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection;
    }

    /**
     * DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon
     * <p>
     * Do not finish at the last hour of the morning and start at the first hour of the evening.
     * 
     */
    @JsonProperty("doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection")
    public Incompatibilities.DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon getDoNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection() {
        return doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection;
    }

    /**
     * DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon
     * <p>
     * Do not finish at the last hour of the morning and start at the first hour of the evening.
     * 
     */
    @JsonProperty("doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection")
    public void setDoNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection(Incompatibilities.DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection) {
        this.doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection = doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection;
    }

    /**
     * DoNotFinishAtLastMorningSectionIfHasAfternoon
     * <p>
     * Do not finish at the last hour in the morning and have the evening busy.
     * 
     */
    @JsonProperty("doNotFinishAtLastMorningSectionIfHasAfternoonAssignment")
    public Incompatibilities.DoNotFinishAtLastMorningSectionIfHasAfternoon getDoNotFinishAtLastMorningSectionIfHasAfternoonAssignment() {
        return doNotFinishAtLastMorningSectionIfHasAfternoonAssignment;
    }

    /**
     * DoNotFinishAtLastMorningSectionIfHasAfternoon
     * <p>
     * Do not finish at the last hour in the morning and have the evening busy.
     * 
     */
    @JsonProperty("doNotFinishAtLastMorningSectionIfHasAfternoonAssignment")
    public void setDoNotFinishAtLastMorningSectionIfHasAfternoonAssignment(Incompatibilities.DoNotFinishAtLastMorningSectionIfHasAfternoon doNotFinishAtLastMorningSectionIfHasAfternoonAssignment) {
        this.doNotFinishAtLastMorningSectionIfHasAfternoonAssignment = doNotFinishAtLastMorningSectionIfHasAfternoonAssignment;
    }

    /**
     * DoNotStartAtFirstMorningSection
     * <p>
     * Do not start at the first hour and keep the evening busy.
     * 
     */
    @JsonProperty("doNotStartAtFirstMorningSectionIfHasAfternoonAssignment")
    public Incompatibilities.DoNotStartAtFirstMorningSection getDoNotStartAtFirstMorningSectionIfHasAfternoonAssignment() {
        return doNotStartAtFirstMorningSectionIfHasAfternoonAssignment;
    }

    /**
     * DoNotStartAtFirstMorningSection
     * <p>
     * Do not start at the first hour and keep the evening busy.
     * 
     */
    @JsonProperty("doNotStartAtFirstMorningSectionIfHasAfternoonAssignment")
    public void setDoNotStartAtFirstMorningSectionIfHasAfternoonAssignment(Incompatibilities.DoNotStartAtFirstMorningSection doNotStartAtFirstMorningSectionIfHasAfternoonAssignment) {
        this.doNotStartAtFirstMorningSectionIfHasAfternoonAssignment = doNotStartAtFirstMorningSectionIfHasAfternoonAssignment;
    }

    /**
     * ConditionTypeWithTime
     * <p>
     * Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("freeTimeAroundMidday")
    public ConditionTypeWithTime getFreeTimeAroundMidday() {
        return freeTimeAroundMidday;
    }

    /**
     * ConditionTypeWithTime
     * <p>
     * Indicate condition with time wich can be strict, avoid (penalisable in optimisation) or ignored.
     * 
     */
    @JsonProperty("freeTimeAroundMidday")
    public void setFreeTimeAroundMidday(ConditionTypeWithTime freeTimeAroundMidday) {
        this.freeTimeAroundMidday = freeTimeAroundMidday;
    }


    /**
     * DoNotFinishAtLastAfternoonSection
     * <p>
     * o not finish at the last hour of the evening and start at the first.
     * 
     */
    public enum DoNotFinishAtLastAfternoonSection {

        IGNORE("ignore"),
        AVOID("avoid"),
        STRICT("strict");
        private final String value;
        private final static Map<String, Incompatibilities.DoNotFinishAtLastAfternoonSection> CONSTANTS = new HashMap<String, Incompatibilities.DoNotFinishAtLastAfternoonSection>();

        static {
            for (Incompatibilities.DoNotFinishAtLastAfternoonSection c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DoNotFinishAtLastAfternoonSection(String value) {
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
        public static Incompatibilities.DoNotFinishAtLastAfternoonSection fromValue(String value) {
            Incompatibilities.DoNotFinishAtLastAfternoonSection constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * DoNotFinishAtLastMorningSection
     * <p>
     * Do not start at the first hour and finish at the last hour of the morning.
     * 
     */
    public enum DoNotFinishAtLastMorningSection {

        IGNORE("ignore"),
        AVOID("avoid"),
        STRICT("strict");
        private final String value;
        private final static Map<String, Incompatibilities.DoNotFinishAtLastMorningSection> CONSTANTS = new HashMap<String, Incompatibilities.DoNotFinishAtLastMorningSection>();

        static {
            for (Incompatibilities.DoNotFinishAtLastMorningSection c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DoNotFinishAtLastMorningSection(String value) {
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
        public static Incompatibilities.DoNotFinishAtLastMorningSection fromValue(String value) {
            Incompatibilities.DoNotFinishAtLastMorningSection constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * DoNotFinishAtLastMorningSectionIfHasAfternoon
     * <p>
     * Do not finish at the last hour in the morning and have the evening busy.
     * 
     */
    public enum DoNotFinishAtLastMorningSectionIfHasAfternoon {

        IGNORE("ignore"),
        AVOID("avoid"),
        STRICT("strict");
        private final String value;
        private final static Map<String, Incompatibilities.DoNotFinishAtLastMorningSectionIfHasAfternoon> CONSTANTS = new HashMap<String, Incompatibilities.DoNotFinishAtLastMorningSectionIfHasAfternoon>();

        static {
            for (Incompatibilities.DoNotFinishAtLastMorningSectionIfHasAfternoon c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DoNotFinishAtLastMorningSectionIfHasAfternoon(String value) {
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
        public static Incompatibilities.DoNotFinishAtLastMorningSectionIfHasAfternoon fromValue(String value) {
            Incompatibilities.DoNotFinishAtLastMorningSectionIfHasAfternoon constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon
     * <p>
     * Do not finish at the last hour of the morning and start at the first hour of the evening.
     * 
     */
    public enum DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon {

        IGNORE("ignore"),
        AVOID("avoid"),
        STRICT("strict");
        private final String value;
        private final static Map<String, Incompatibilities.DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon> CONSTANTS = new HashMap<String, Incompatibilities.DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon>();

        static {
            for (Incompatibilities.DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon(String value) {
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
        public static Incompatibilities.DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon fromValue(String value) {
            Incompatibilities.DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * DoNotStartAtFirstMorningSection
     * <p>
     * Do not start at the first hour and keep the evening busy.
     * 
     */
    public enum DoNotStartAtFirstMorningSection {

        IGNORE("ignore"),
        AVOID("avoid"),
        STRICT("strict");
        private final String value;
        private final static Map<String, Incompatibilities.DoNotStartAtFirstMorningSection> CONSTANTS = new HashMap<String, Incompatibilities.DoNotStartAtFirstMorningSection>();

        static {
            for (Incompatibilities.DoNotStartAtFirstMorningSection c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DoNotStartAtFirstMorningSection(String value) {
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
        public static Incompatibilities.DoNotStartAtFirstMorningSection fromValue(String value) {
            Incompatibilities.DoNotStartAtFirstMorningSection constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
