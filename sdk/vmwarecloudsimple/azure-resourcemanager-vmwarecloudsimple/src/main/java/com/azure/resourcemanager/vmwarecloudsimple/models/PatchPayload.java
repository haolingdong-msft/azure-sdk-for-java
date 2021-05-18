// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** General patch payload modal. */
@Fluent
public final class PatchPayload {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PatchPayload.class);

    /*
     * The tags key:value pairs
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the tags property: The tags key:value pairs.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags key:value pairs.
     *
     * @param tags the tags value to set.
     * @return the PatchPayload object itself.
     */
    public PatchPayload withTags(Map<String, String> tags) {
        this.tags = tags;
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
