// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managednetworkfabric.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The NetworkRack resource definition. */
@Fluent
public final class NetworkRackInner extends Resource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties", required = true)
    private NetworkRackProperties innerProperties = new NetworkRackProperties();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of NetworkRackInner class. */
    public NetworkRackInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private NetworkRackProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public NetworkRackInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetworkRackInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the networkRackSku property: Network Rack SKU name.
     *
     * @return the networkRackSku value.
     */
    public String networkRackSku() {
        return this.innerProperties() == null ? null : this.innerProperties().networkRackSku();
    }

    /**
     * Set the networkRackSku property: Network Rack SKU name.
     *
     * @param networkRackSku the networkRackSku value to set.
     * @return the NetworkRackInner object itself.
     */
    public NetworkRackInner withNetworkRackSku(String networkRackSku) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkRackProperties();
        }
        this.innerProperties().withNetworkRackSku(networkRackSku);
        return this;
    }

    /**
     * Get the networkFabricId property: Network Fabric ARM resource id.
     *
     * @return the networkFabricId value.
     */
    public String networkFabricId() {
        return this.innerProperties() == null ? null : this.innerProperties().networkFabricId();
    }

    /**
     * Set the networkFabricId property: Network Fabric ARM resource id.
     *
     * @param networkFabricId the networkFabricId value to set.
     * @return the NetworkRackInner object itself.
     */
    public NetworkRackInner withNetworkFabricId(String networkFabricId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkRackProperties();
        }
        this.innerProperties().withNetworkFabricId(networkFabricId);
        return this;
    }

    /**
     * Get the networkDevices property: List of network device ARM resource ids.
     *
     * @return the networkDevices value.
     */
    public List<String> networkDevices() {
        return this.innerProperties() == null ? null : this.innerProperties().networkDevices();
    }

    /**
     * Get the provisioningState property: Gets the provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the annotation property: Switch configuration description.
     *
     * @return the annotation value.
     */
    public String annotation() {
        return this.innerProperties() == null ? null : this.innerProperties().annotation();
    }

    /**
     * Set the annotation property: Switch configuration description.
     *
     * @param annotation the annotation value to set.
     * @return the NetworkRackInner object itself.
     */
    public NetworkRackInner withAnnotation(String annotation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkRackProperties();
        }
        this.innerProperties().withAnnotation(annotation);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model NetworkRackInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NetworkRackInner.class);
}
