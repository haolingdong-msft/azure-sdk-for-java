// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.orbital.models.SpacecraftLink;
import com.azure.resourcemanager.orbital.models.SpacecraftsPropertiesProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of Spacecraft Resource Properties. */
@Fluent
public final class SpacecraftsProperties {
    /*
     * The current state of the resource's creation, deletion, or modification.
     */
    @JsonProperty(value = "provisioningState")
    private SpacecraftsPropertiesProvisioningState provisioningState;

    /*
     * NORAD ID of the spacecraft.
     */
    @JsonProperty(value = "noradId", required = true)
    private String noradId;

    /*
     * Title line of the two-line element set (TLE).
     */
    @JsonProperty(value = "titleLine")
    private String titleLine;

    /*
     * Line 1 of the two-line element set (TLE).
     */
    @JsonProperty(value = "tleLine1")
    private String tleLine1;

    /*
     * Line 2 of the two-line element set (TLE).
     */
    @JsonProperty(value = "tleLine2")
    private String tleLine2;

    /*
     * Immutable list of Spacecraft links.
     */
    @JsonProperty(value = "links")
    private List<SpacecraftLink> links;

    /**
     * Get the provisioningState property: The current state of the resource's creation, deletion, or modification.
     *
     * @return the provisioningState value.
     */
    public SpacecraftsPropertiesProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The current state of the resource's creation, deletion, or modification.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the SpacecraftsProperties object itself.
     */
    public SpacecraftsProperties withProvisioningState(SpacecraftsPropertiesProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the noradId property: NORAD ID of the spacecraft.
     *
     * @return the noradId value.
     */
    public String noradId() {
        return this.noradId;
    }

    /**
     * Set the noradId property: NORAD ID of the spacecraft.
     *
     * @param noradId the noradId value to set.
     * @return the SpacecraftsProperties object itself.
     */
    public SpacecraftsProperties withNoradId(String noradId) {
        this.noradId = noradId;
        return this;
    }

    /**
     * Get the titleLine property: Title line of the two-line element set (TLE).
     *
     * @return the titleLine value.
     */
    public String titleLine() {
        return this.titleLine;
    }

    /**
     * Set the titleLine property: Title line of the two-line element set (TLE).
     *
     * @param titleLine the titleLine value to set.
     * @return the SpacecraftsProperties object itself.
     */
    public SpacecraftsProperties withTitleLine(String titleLine) {
        this.titleLine = titleLine;
        return this;
    }

    /**
     * Get the tleLine1 property: Line 1 of the two-line element set (TLE).
     *
     * @return the tleLine1 value.
     */
    public String tleLine1() {
        return this.tleLine1;
    }

    /**
     * Set the tleLine1 property: Line 1 of the two-line element set (TLE).
     *
     * @param tleLine1 the tleLine1 value to set.
     * @return the SpacecraftsProperties object itself.
     */
    public SpacecraftsProperties withTleLine1(String tleLine1) {
        this.tleLine1 = tleLine1;
        return this;
    }

    /**
     * Get the tleLine2 property: Line 2 of the two-line element set (TLE).
     *
     * @return the tleLine2 value.
     */
    public String tleLine2() {
        return this.tleLine2;
    }

    /**
     * Set the tleLine2 property: Line 2 of the two-line element set (TLE).
     *
     * @param tleLine2 the tleLine2 value to set.
     * @return the SpacecraftsProperties object itself.
     */
    public SpacecraftsProperties withTleLine2(String tleLine2) {
        this.tleLine2 = tleLine2;
        return this;
    }

    /**
     * Get the links property: Immutable list of Spacecraft links.
     *
     * @return the links value.
     */
    public List<SpacecraftLink> links() {
        return this.links;
    }

    /**
     * Set the links property: Immutable list of Spacecraft links.
     *
     * @param links the links value to set.
     * @return the SpacecraftsProperties object itself.
     */
    public SpacecraftsProperties withLinks(List<SpacecraftLink> links) {
        this.links = links;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (noradId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property noradId in model SpacecraftsProperties"));
        }
        if (links() != null) {
            links().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SpacecraftsProperties.class);
}
