// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.synapse.fluent.models.WorkspacePatchProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Workspace patch details. */
@Fluent
public final class WorkspacePatchInfo {
    /*
     * Resource tags
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * The identity of the workspace
     */
    @JsonProperty(value = "identity")
    private ManagedIdentity identity;

    /*
     * Workspace patch properties
     */
    @JsonProperty(value = "properties")
    private WorkspacePatchProperties innerProperties;

    /** Creates an instance of WorkspacePatchInfo class. */
    public WorkspacePatchInfo() {
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the WorkspacePatchInfo object itself.
     */
    public WorkspacePatchInfo withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the identity property: The identity of the workspace.
     *
     * @return the identity value.
     */
    public ManagedIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the workspace.
     *
     * @param identity the identity value to set.
     * @return the WorkspacePatchInfo object itself.
     */
    public WorkspacePatchInfo withIdentity(ManagedIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the innerProperties property: Workspace patch properties.
     *
     * @return the innerProperties value.
     */
    private WorkspacePatchProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the sqlAdministratorLoginPassword property: SQL administrator login password.
     *
     * @return the sqlAdministratorLoginPassword value.
     */
    public String sqlAdministratorLoginPassword() {
        return this.innerProperties() == null ? null : this.innerProperties().sqlAdministratorLoginPassword();
    }

    /**
     * Set the sqlAdministratorLoginPassword property: SQL administrator login password.
     *
     * @param sqlAdministratorLoginPassword the sqlAdministratorLoginPassword value to set.
     * @return the WorkspacePatchInfo object itself.
     */
    public WorkspacePatchInfo withSqlAdministratorLoginPassword(String sqlAdministratorLoginPassword) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkspacePatchProperties();
        }
        this.innerProperties().withSqlAdministratorLoginPassword(sqlAdministratorLoginPassword);
        return this;
    }

    /**
     * Get the managedVirtualNetworkSettings property: Managed Virtual Network Settings.
     *
     * @return the managedVirtualNetworkSettings value.
     */
    public ManagedVirtualNetworkSettings managedVirtualNetworkSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().managedVirtualNetworkSettings();
    }

    /**
     * Set the managedVirtualNetworkSettings property: Managed Virtual Network Settings.
     *
     * @param managedVirtualNetworkSettings the managedVirtualNetworkSettings value to set.
     * @return the WorkspacePatchInfo object itself.
     */
    public WorkspacePatchInfo withManagedVirtualNetworkSettings(
        ManagedVirtualNetworkSettings managedVirtualNetworkSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkspacePatchProperties();
        }
        this.innerProperties().withManagedVirtualNetworkSettings(managedVirtualNetworkSettings);
        return this;
    }

    /**
     * Get the workspaceRepositoryConfiguration property: Git integration settings.
     *
     * @return the workspaceRepositoryConfiguration value.
     */
    public WorkspaceRepositoryConfiguration workspaceRepositoryConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().workspaceRepositoryConfiguration();
    }

    /**
     * Set the workspaceRepositoryConfiguration property: Git integration settings.
     *
     * @param workspaceRepositoryConfiguration the workspaceRepositoryConfiguration value to set.
     * @return the WorkspacePatchInfo object itself.
     */
    public WorkspacePatchInfo withWorkspaceRepositoryConfiguration(
        WorkspaceRepositoryConfiguration workspaceRepositoryConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkspacePatchProperties();
        }
        this.innerProperties().withWorkspaceRepositoryConfiguration(workspaceRepositoryConfiguration);
        return this;
    }

    /**
     * Get the purviewConfiguration property: Purview Configuration.
     *
     * @return the purviewConfiguration value.
     */
    public PurviewConfiguration purviewConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().purviewConfiguration();
    }

    /**
     * Set the purviewConfiguration property: Purview Configuration.
     *
     * @param purviewConfiguration the purviewConfiguration value to set.
     * @return the WorkspacePatchInfo object itself.
     */
    public WorkspacePatchInfo withPurviewConfiguration(PurviewConfiguration purviewConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkspacePatchProperties();
        }
        this.innerProperties().withPurviewConfiguration(purviewConfiguration);
        return this;
    }

    /**
     * Get the provisioningState property: Resource provisioning state.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the encryption property: The encryption details of the workspace.
     *
     * @return the encryption value.
     */
    public EncryptionDetails encryption() {
        return this.innerProperties() == null ? null : this.innerProperties().encryption();
    }

    /**
     * Set the encryption property: The encryption details of the workspace.
     *
     * @param encryption the encryption value to set.
     * @return the WorkspacePatchInfo object itself.
     */
    public WorkspacePatchInfo withEncryption(EncryptionDetails encryption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkspacePatchProperties();
        }
        this.innerProperties().withEncryption(encryption);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Enable or Disable public network access to workspace.
     *
     * @return the publicNetworkAccess value.
     */
    public WorkspacePublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: Enable or Disable public network access to workspace.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the WorkspacePatchInfo object itself.
     */
    public WorkspacePatchInfo withPublicNetworkAccess(WorkspacePublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkspacePatchProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
