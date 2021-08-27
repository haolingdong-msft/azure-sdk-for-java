// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.models.ApplicationGatewayLoadDistributionPolicyPropertiesFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Load Distribution Policy of an application gateway. */
@Fluent
public final class ApplicationGatewayLoadDistributionPolicy extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayLoadDistributionPolicy.class);

    /*
     * Properties of the application gateway load distribution policy.
     */
    @JsonProperty(value = "properties")
    private ApplicationGatewayLoadDistributionPolicyPropertiesFormat innerProperties;

    /*
     * Name of the load distribution policy that is unique within an
     * Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the innerProperties property: Properties of the application gateway load distribution policy.
     *
     * @return the innerProperties value.
     */
    private ApplicationGatewayLoadDistributionPolicyPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of the load distribution policy that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the load distribution policy that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayLoadDistributionPolicy object itself.
     */
    public ApplicationGatewayLoadDistributionPolicy withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationGatewayLoadDistributionPolicy withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the loadDistributionTargets property: Load Distribution Targets resource of an application gateway.
     *
     * @return the loadDistributionTargets value.
     */
    public List<ApplicationGatewayLoadDistributionTarget> loadDistributionTargets() {
        return this.innerProperties() == null ? null : this.innerProperties().loadDistributionTargets();
    }

    /**
     * Set the loadDistributionTargets property: Load Distribution Targets resource of an application gateway.
     *
     * @param loadDistributionTargets the loadDistributionTargets value to set.
     * @return the ApplicationGatewayLoadDistributionPolicy object itself.
     */
    public ApplicationGatewayLoadDistributionPolicy withLoadDistributionTargets(
        List<ApplicationGatewayLoadDistributionTarget> loadDistributionTargets) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayLoadDistributionPolicyPropertiesFormat();
        }
        this.innerProperties().withLoadDistributionTargets(loadDistributionTargets);
        return this;
    }

    /**
     * Get the loadDistributionAlgorithm property: Load Distribution Targets resource of an application gateway.
     *
     * @return the loadDistributionAlgorithm value.
     */
    public ApplicationGatewayLoadDistributionAlgorithm loadDistributionAlgorithm() {
        return this.innerProperties() == null ? null : this.innerProperties().loadDistributionAlgorithm();
    }

    /**
     * Set the loadDistributionAlgorithm property: Load Distribution Targets resource of an application gateway.
     *
     * @param loadDistributionAlgorithm the loadDistributionAlgorithm value to set.
     * @return the ApplicationGatewayLoadDistributionPolicy object itself.
     */
    public ApplicationGatewayLoadDistributionPolicy withLoadDistributionAlgorithm(
        ApplicationGatewayLoadDistributionAlgorithm loadDistributionAlgorithm) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayLoadDistributionPolicyPropertiesFormat();
        }
        this.innerProperties().withLoadDistributionAlgorithm(loadDistributionAlgorithm);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the Load Distribution Policy resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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
