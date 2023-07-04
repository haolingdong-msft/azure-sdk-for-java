// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.loadtesting.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** File info. */
@Immutable
public final class FileInfo {
    /*
     * File URL.
     */
    @Generated
    @JsonProperty(value = "url")
    private String url;

    /*
     * Name of the file.
     */
    @Generated
    @JsonProperty(value = "fileName")
    private String fileName;

    /*
     * File type
     */
    @Generated
    @JsonProperty(value = "fileType")
    private FileType fileType;

    /*
     * Expiry time of the file (ISO 8601 literal format)
     */
    @Generated
    @JsonProperty(value = "expireDateTime")
    private OffsetDateTime expireDateTime;

    /*
     * Validation status of the file
     */
    @Generated
    @JsonProperty(value = "validationStatus")
    private FileStatus validationStatus;

    /*
     * Validation failure error details
     */
    @Generated
    @JsonProperty(value = "validationFailureDetails")
    private String validationFailureDetails;

    /** Creates an instance of FileInfo class. */
    @Generated
    private FileInfo() {}

    /**
     * Get the url property: File URL.
     *
     * @return the url value.
     */
    @Generated
    public String getUrl() {
        return this.url;
    }

    /**
     * Get the fileName property: Name of the file.
     *
     * @return the fileName value.
     */
    @Generated
    public String getFileName() {
        return this.fileName;
    }

    /**
     * Get the fileType property: File type.
     *
     * @return the fileType value.
     */
    @Generated
    public FileType getFileType() {
        return this.fileType;
    }

    /**
     * Get the expireDateTime property: Expiry time of the file (ISO 8601 literal format).
     *
     * @return the expireDateTime value.
     */
    @Generated
    public OffsetDateTime getExpireDateTime() {
        return this.expireDateTime;
    }

    /**
     * Get the validationStatus property: Validation status of the file.
     *
     * @return the validationStatus value.
     */
    @Generated
    public FileStatus getValidationStatus() {
        return this.validationStatus;
    }

    /**
     * Get the validationFailureDetails property: Validation failure error details.
     *
     * @return the validationFailureDetails value.
     */
    @Generated
    public String getValidationFailureDetails() {
        return this.validationFailureDetails;
    }
}
