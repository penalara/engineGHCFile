
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
 * DifferentDays
 * <p>
 * Conditions on this and another class unit cannot coincide on the same day.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "refSesions",
    "daysSetting"
})
public class DifferentDays {

    /**
     * RefSesions
     * <p>
     *  Sessions identifiers which class units should not be assigned on the same day.
     * (Required)
     * 
     */
    @JsonProperty("refSesions")
    @JsonPropertyDescription(" Sessions identifiers which class units should not be assigned on the same day.")
    private List<Integer> refSesions = new ArrayList<Integer>();
    /**
     * Keep the same position each week or period for the class units.
     * 
     */
    @JsonProperty("daysSetting")
    @JsonPropertyDescription("Keep the same position each week or period for the class units.")
    private DifferentDays.DaysSetting daysSetting = DifferentDays.DaysSetting.fromValue("indifferentDaysPreferred");

    /**
     * No args constructor for use in serialization
     * 
     */
    public DifferentDays() {
    }

    /**
     * 
     * @param refSesions
     *     RefSesions.  Sessions identifiers which class units should not be assigned on the same day.
     * @param daysSetting
     *     Keep the same position each week or period for the class units.
     */
    public DifferentDays(List<Integer> refSesions, DifferentDays.DaysSetting daysSetting) {
        super();
        this.refSesions = refSesions;
        this.daysSetting = daysSetting;
    }

    /**
     * RefSesions
     * <p>
     *  Sessions identifiers which class units should not be assigned on the same day.
     * (Required)
     * 
     */
    @JsonProperty("refSesions")
    public List<Integer> getRefSesions() {
        return refSesions;
    }

    /**
     * RefSesions
     * <p>
     *  Sessions identifiers which class units should not be assigned on the same day.
     * (Required)
     * 
     */
    @JsonProperty("refSesions")
    public void setRefSesions(List<Integer> refSesions) {
        this.refSesions = refSesions;
    }

    /**
     * Keep the same position each week or period for the class units.
     * 
     */
    @JsonProperty("daysSetting")
    public DifferentDays.DaysSetting getDaysSetting() {
        return daysSetting;
    }

    /**
     * Keep the same position each week or period for the class units.
     * 
     */
    @JsonProperty("daysSetting")
    public void setDaysSetting(DifferentDays.DaysSetting daysSetting) {
        this.daysSetting = daysSetting;
    }


    /**
     * Keep the same position each week or period for the class units.
     * 
     */
    public enum DaysSetting {

        NON_CONSECUTIVE_DAYS_PREFERRED("nonConsecutiveDaysPreferred"),
        INDIFFERENT_DAYS_PREFERRED("indifferentDaysPreferred"),
        STRICT_NON_CONSECUTIVE_DAYS("strictNonConsecutiveDays"),
        STRICT_CONSECUTIVE_DAYS("strictConsecutiveDays");
        private final String value;
        private final static Map<String, DifferentDays.DaysSetting> CONSTANTS = new HashMap<String, DifferentDays.DaysSetting>();

        static {
            for (DifferentDays.DaysSetting c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DaysSetting(String value) {
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
        public static DifferentDays.DaysSetting fromValue(String value) {
            DifferentDays.DaysSetting constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
