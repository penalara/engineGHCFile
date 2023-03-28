
package com.penalara.ghc.jsonghcfile.engineghcfile;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * FileMetadata
 * <p>
 * Information about the file.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "versionJson",
    "createdDate",
    "lastModifiedDate",
    "refUser",
    "source",
    "fullMode"
})
public class FileMetadata {

    /**
     * TimetableName
     * <p>
     * Name of the Timetable
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the Timetable")
    private String name;
    /**
     * SchemaVersion
     * <p>
     * Version of multiplatformGHCSchema used
     * (Required)
     * 
     */
    @JsonProperty("versionJson")
    @JsonPropertyDescription("Version of multiplatformGHCSchema used")
    private String versionJson;
    /**
     * JsonCreatedDate
     * <p>
     * Json generation date.
     * (Required)
     * 
     */
    @JsonProperty("createdDate")
    @JsonPropertyDescription("Json generation date.")
    private Date createdDate;
    /**
     * JsonGenerationDate
     * <p>
     * Json last modification date.
     * (Required)
     * 
     */
    @JsonProperty("lastModifiedDate")
    @JsonPropertyDescription("Json last modification date.")
    private Date lastModifiedDate;
    /**
     * UserReference
     * <p>
     * Contains a user reference who owns the file.
     * (Required)
     * 
     */
    @JsonProperty("refUser")
    @JsonPropertyDescription("Contains a user reference who owns the file.")
    private String refUser;
    /**
     * SourceModule
     * <p>
     * Indicates the GHCMultiplatform module that generated the file.
     * (Required)
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("Indicates the GHCMultiplatform module that generated the file.")
    private FileMetadata.SourceModule source;
    /**
     * FullPlannerMode
     * <p>
     * Indicates if the planner must use the full mode.
     * 
     */
    @JsonProperty("fullMode")
    @JsonPropertyDescription("Indicates if the planner must use the full mode.")
    private Boolean fullMode = false;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FileMetadata() {
    }

    /**
     * 
     * @param fullMode
     *     FullPlannerMode. Indicates if the planner must use the full mode.
     * @param createdDate
     *     JsonCreatedDate. Json generation date.
     * @param lastModifiedDate
     *     JsonGenerationDate. Json last modification date.
     * @param name
     *     TimetableName. Name of the Timetable.
     * @param refUser
     *     UserReference. Contains a user reference who owns the file.
     * @param source
     *     SourceModule. Indicates the GHCMultiplatform module that generated the file.
     * @param versionJson
     *     SchemaVersion. Version of multiplatformGHCSchema used.
     */
    public FileMetadata(String name, String versionJson, Date createdDate, Date lastModifiedDate, String refUser, FileMetadata.SourceModule source, Boolean fullMode) {
        super();
        this.name = name;
        this.versionJson = versionJson;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.refUser = refUser;
        this.source = source;
        this.fullMode = fullMode;
    }

    /**
     * TimetableName
     * <p>
     * Name of the Timetable
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * TimetableName
     * <p>
     * Name of the Timetable
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * SchemaVersion
     * <p>
     * Version of multiplatformGHCSchema used
     * (Required)
     * 
     */
    @JsonProperty("versionJson")
    public String getVersionJson() {
        return versionJson;
    }

    /**
     * SchemaVersion
     * <p>
     * Version of multiplatformGHCSchema used
     * (Required)
     * 
     */
    @JsonProperty("versionJson")
    public void setVersionJson(String versionJson) {
        this.versionJson = versionJson;
    }

    /**
     * JsonCreatedDate
     * <p>
     * Json generation date.
     * (Required)
     * 
     */
    @JsonProperty("createdDate")
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * JsonCreatedDate
     * <p>
     * Json generation date.
     * (Required)
     * 
     */
    @JsonProperty("createdDate")
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * JsonGenerationDate
     * <p>
     * Json last modification date.
     * (Required)
     * 
     */
    @JsonProperty("lastModifiedDate")
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * JsonGenerationDate
     * <p>
     * Json last modification date.
     * (Required)
     * 
     */
    @JsonProperty("lastModifiedDate")
    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * UserReference
     * <p>
     * Contains a user reference who owns the file.
     * (Required)
     * 
     */
    @JsonProperty("refUser")
    public String getRefUser() {
        return refUser;
    }

    /**
     * UserReference
     * <p>
     * Contains a user reference who owns the file.
     * (Required)
     * 
     */
    @JsonProperty("refUser")
    public void setRefUser(String refUser) {
        this.refUser = refUser;
    }

    /**
     * SourceModule
     * <p>
     * Indicates the GHCMultiplatform module that generated the file.
     * (Required)
     * 
     */
    @JsonProperty("source")
    public FileMetadata.SourceModule getSource() {
        return source;
    }

    /**
     * SourceModule
     * <p>
     * Indicates the GHCMultiplatform module that generated the file.
     * (Required)
     * 
     */
    @JsonProperty("source")
    public void setSource(FileMetadata.SourceModule source) {
        this.source = source;
    }

    /**
     * FullPlannerMode
     * <p>
     * Indicates if the planner must use the full mode.
     * 
     */
    @JsonProperty("fullMode")
    public Boolean getFullMode() {
        return fullMode;
    }

    /**
     * FullPlannerMode
     * <p>
     * Indicates if the planner must use the full mode.
     * 
     */
    @JsonProperty("fullMode")
    public void setFullMode(Boolean fullMode) {
        this.fullMode = fullMode;
    }


    /**
     * SourceModule
     * <p>
     * Indicates the GHCMultiplatform module that generated the file.
     * 
     */
    public enum SourceModule {

        HORARIOS("horarios"),
        JE("je");
        private final String value;
        private final static Map<String, FileMetadata.SourceModule> CONSTANTS = new HashMap<String, FileMetadata.SourceModule>();

        static {
            for (FileMetadata.SourceModule c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SourceModule(String value) {
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
        public static FileMetadata.SourceModule fromValue(String value) {
            FileMetadata.SourceModule constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
