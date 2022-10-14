// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.SecurityPartnerProviderConnectionStatus;
import com.azure.resourcemanager.network.models.SecurityProviderName;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the Security Partner Provider. */
@Fluent
public final class SecurityPartnerProviderPropertiesFormat {
    /*
     * The provisioning state of the Security Partner Provider resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The security provider name.
     */
    @JsonProperty(value = "securityProviderName")
    private SecurityProviderName securityProviderName;

    /*
     * The connection status with the Security Partner Provider.
     */
    @JsonProperty(value = "connectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private SecurityPartnerProviderConnectionStatus connectionStatus;

    /*
     * The virtualHub to which the Security Partner Provider belongs.
     */
    @JsonProperty(value = "virtualHub")
    private SubResource virtualHub;

    /** Creates an instance of SecurityPartnerProviderPropertiesFormat class. */
    public SecurityPartnerProviderPropertiesFormat() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the Security Partner Provider resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the securityProviderName property: The security provider name.
     *
     * @return the securityProviderName value.
     */
    public SecurityProviderName securityProviderName() {
        return this.securityProviderName;
    }

    /**
     * Set the securityProviderName property: The security provider name.
     *
     * @param securityProviderName the securityProviderName value to set.
     * @return the SecurityPartnerProviderPropertiesFormat object itself.
     */
    public SecurityPartnerProviderPropertiesFormat withSecurityProviderName(SecurityProviderName securityProviderName) {
        this.securityProviderName = securityProviderName;
        return this;
    }

    /**
     * Get the connectionStatus property: The connection status with the Security Partner Provider.
     *
     * @return the connectionStatus value.
     */
    public SecurityPartnerProviderConnectionStatus connectionStatus() {
        return this.connectionStatus;
    }

    /**
     * Get the virtualHub property: The virtualHub to which the Security Partner Provider belongs.
     *
     * @return the virtualHub value.
     */
    public SubResource virtualHub() {
        return this.virtualHub;
    }

    /**
     * Set the virtualHub property: The virtualHub to which the Security Partner Provider belongs.
     *
     * @param virtualHub the virtualHub value to set.
     * @return the SecurityPartnerProviderPropertiesFormat object itself.
     */
    public SecurityPartnerProviderPropertiesFormat withVirtualHub(SubResource virtualHub) {
        this.virtualHub = virtualHub;
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
