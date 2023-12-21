// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a connection monitor output destination.
 */
@Fluent
public final class ConnectionMonitorOutput {
    /*
     * Connection monitor output destination type. Currently, only "Workspace" is supported.
     */
    @JsonProperty(value = "type")
    private OutputType type;

    /*
     * Describes the settings for producing output into a log analytics workspace.
     */
    @JsonProperty(value = "workspaceSettings")
    private ConnectionMonitorWorkspaceSettings workspaceSettings;

    /**
     * Creates an instance of ConnectionMonitorOutput class.
     */
    public ConnectionMonitorOutput() {
    }

    /**
     * Get the type property: Connection monitor output destination type. Currently, only "Workspace" is supported.
     * 
     * @return the type value.
     */
    public OutputType type() {
        return this.type;
    }

    /**
     * Set the type property: Connection monitor output destination type. Currently, only "Workspace" is supported.
     * 
     * @param type the type value to set.
     * @return the ConnectionMonitorOutput object itself.
     */
    public ConnectionMonitorOutput withType(OutputType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the workspaceSettings property: Describes the settings for producing output into a log analytics workspace.
     * 
     * @return the workspaceSettings value.
     */
    public ConnectionMonitorWorkspaceSettings workspaceSettings() {
        return this.workspaceSettings;
    }

    /**
     * Set the workspaceSettings property: Describes the settings for producing output into a log analytics workspace.
     * 
     * @param workspaceSettings the workspaceSettings value to set.
     * @return the ConnectionMonitorOutput object itself.
     */
    public ConnectionMonitorOutput withWorkspaceSettings(ConnectionMonitorWorkspaceSettings workspaceSettings) {
        this.workspaceSettings = workspaceSettings;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (workspaceSettings() != null) {
            workspaceSettings().validate();
        }
    }
}
