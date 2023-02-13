// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Destination of the view data. This is optional. Currently only CSV format is supported. */
@Fluent
public final class FileDestination {
    /*
     * Destination of the view data. Currently only CSV format is supported.
     */
    @JsonProperty(value = "fileFormats")
    private List<FileFormat> fileFormats;

    /** Creates an instance of FileDestination class. */
    public FileDestination() {
    }

    /**
     * Get the fileFormats property: Destination of the view data. Currently only CSV format is supported.
     *
     * @return the fileFormats value.
     */
    public List<FileFormat> fileFormats() {
        return this.fileFormats;
    }

    /**
     * Set the fileFormats property: Destination of the view data. Currently only CSV format is supported.
     *
     * @param fileFormats the fileFormats value to set.
     * @return the FileDestination object itself.
     */
    public FileDestination withFileFormats(List<FileFormat> fileFormats) {
        this.fileFormats = fileFormats;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
