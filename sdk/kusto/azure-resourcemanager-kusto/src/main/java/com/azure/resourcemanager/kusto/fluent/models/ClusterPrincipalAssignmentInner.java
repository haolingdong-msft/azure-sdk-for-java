// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.kusto.models.ClusterPrincipalRole;
import com.azure.resourcemanager.kusto.models.PrincipalType;
import com.azure.resourcemanager.kusto.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Class representing a cluster principal assignment. */
@Fluent
public final class ClusterPrincipalAssignmentInner extends ProxyResource {
    /*
     * The cluster principal.
     */
    @JsonProperty(value = "properties")
    private ClusterPrincipalProperties innerProperties;

    /** Creates an instance of ClusterPrincipalAssignmentInner class. */
    public ClusterPrincipalAssignmentInner() {
    }

    /**
     * Get the innerProperties property: The cluster principal.
     *
     * @return the innerProperties value.
     */
    private ClusterPrincipalProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the principalId property: The principal ID assigned to the cluster principal. It can be a user email,
     * application ID, or security group name.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.innerProperties() == null ? null : this.innerProperties().principalId();
    }

    /**
     * Set the principalId property: The principal ID assigned to the cluster principal. It can be a user email,
     * application ID, or security group name.
     *
     * @param principalId the principalId value to set.
     * @return the ClusterPrincipalAssignmentInner object itself.
     */
    public ClusterPrincipalAssignmentInner withPrincipalId(String principalId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterPrincipalProperties();
        }
        this.innerProperties().withPrincipalId(principalId);
        return this;
    }

    /**
     * Get the role property: Cluster principal role.
     *
     * @return the role value.
     */
    public ClusterPrincipalRole role() {
        return this.innerProperties() == null ? null : this.innerProperties().role();
    }

    /**
     * Set the role property: Cluster principal role.
     *
     * @param role the role value to set.
     * @return the ClusterPrincipalAssignmentInner object itself.
     */
    public ClusterPrincipalAssignmentInner withRole(ClusterPrincipalRole role) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterPrincipalProperties();
        }
        this.innerProperties().withRole(role);
        return this;
    }

    /**
     * Get the tenantId property: The tenant id of the principal.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantId();
    }

    /**
     * Set the tenantId property: The tenant id of the principal.
     *
     * @param tenantId the tenantId value to set.
     * @return the ClusterPrincipalAssignmentInner object itself.
     */
    public ClusterPrincipalAssignmentInner withTenantId(String tenantId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterPrincipalProperties();
        }
        this.innerProperties().withTenantId(tenantId);
        return this;
    }

    /**
     * Get the principalType property: Principal type.
     *
     * @return the principalType value.
     */
    public PrincipalType principalType() {
        return this.innerProperties() == null ? null : this.innerProperties().principalType();
    }

    /**
     * Set the principalType property: Principal type.
     *
     * @param principalType the principalType value to set.
     * @return the ClusterPrincipalAssignmentInner object itself.
     */
    public ClusterPrincipalAssignmentInner withPrincipalType(PrincipalType principalType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterPrincipalProperties();
        }
        this.innerProperties().withPrincipalType(principalType);
        return this;
    }

    /**
     * Get the tenantName property: The tenant name of the principal.
     *
     * @return the tenantName value.
     */
    public String tenantName() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantName();
    }

    /**
     * Get the principalName property: The principal name.
     *
     * @return the principalName value.
     */
    public String principalName() {
        return this.innerProperties() == null ? null : this.innerProperties().principalName();
    }

    /**
     * Get the provisioningState property: The provisioned state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the aadObjectId property: The service principal object id in AAD (Azure active directory).
     *
     * @return the aadObjectId value.
     */
    public String aadObjectId() {
        return this.innerProperties() == null ? null : this.innerProperties().aadObjectId();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
