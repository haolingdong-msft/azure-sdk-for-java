// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Path rule of URL path map of an application gateway. */
@Fluent
public final class ApplicationGatewayPathRuleInner extends SubResource {
    /*
     * Properties of the application gateway path rule.
     */
    @JsonProperty(value = "properties")
    private ApplicationGatewayPathRulePropertiesFormat innerProperties;

    /*
     * Name of the path rule that is unique within an Application Gateway.
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

    /** Creates an instance of ApplicationGatewayPathRuleInner class. */
    public ApplicationGatewayPathRuleInner() {
    }

    /**
     * Get the innerProperties property: Properties of the application gateway path rule.
     *
     * @return the innerProperties value.
     */
    private ApplicationGatewayPathRulePropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of the path rule that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the path rule that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayPathRuleInner object itself.
     */
    public ApplicationGatewayPathRuleInner withName(String name) {
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
    public ApplicationGatewayPathRuleInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the paths property: Path rules of URL path map.
     *
     * @return the paths value.
     */
    public List<String> paths() {
        return this.innerProperties() == null ? null : this.innerProperties().paths();
    }

    /**
     * Set the paths property: Path rules of URL path map.
     *
     * @param paths the paths value to set.
     * @return the ApplicationGatewayPathRuleInner object itself.
     */
    public ApplicationGatewayPathRuleInner withPaths(List<String> paths) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPathRulePropertiesFormat();
        }
        this.innerProperties().withPaths(paths);
        return this;
    }

    /**
     * Get the backendAddressPool property: Backend address pool resource of URL path map path rule.
     *
     * @return the backendAddressPool value.
     */
    public SubResource backendAddressPool() {
        return this.innerProperties() == null ? null : this.innerProperties().backendAddressPool();
    }

    /**
     * Set the backendAddressPool property: Backend address pool resource of URL path map path rule.
     *
     * @param backendAddressPool the backendAddressPool value to set.
     * @return the ApplicationGatewayPathRuleInner object itself.
     */
    public ApplicationGatewayPathRuleInner withBackendAddressPool(SubResource backendAddressPool) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPathRulePropertiesFormat();
        }
        this.innerProperties().withBackendAddressPool(backendAddressPool);
        return this;
    }

    /**
     * Get the backendHttpSettings property: Backend http settings resource of URL path map path rule.
     *
     * @return the backendHttpSettings value.
     */
    public SubResource backendHttpSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().backendHttpSettings();
    }

    /**
     * Set the backendHttpSettings property: Backend http settings resource of URL path map path rule.
     *
     * @param backendHttpSettings the backendHttpSettings value to set.
     * @return the ApplicationGatewayPathRuleInner object itself.
     */
    public ApplicationGatewayPathRuleInner withBackendHttpSettings(SubResource backendHttpSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPathRulePropertiesFormat();
        }
        this.innerProperties().withBackendHttpSettings(backendHttpSettings);
        return this;
    }

    /**
     * Get the redirectConfiguration property: Redirect configuration resource of URL path map path rule.
     *
     * @return the redirectConfiguration value.
     */
    public SubResource redirectConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().redirectConfiguration();
    }

    /**
     * Set the redirectConfiguration property: Redirect configuration resource of URL path map path rule.
     *
     * @param redirectConfiguration the redirectConfiguration value to set.
     * @return the ApplicationGatewayPathRuleInner object itself.
     */
    public ApplicationGatewayPathRuleInner withRedirectConfiguration(SubResource redirectConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPathRulePropertiesFormat();
        }
        this.innerProperties().withRedirectConfiguration(redirectConfiguration);
        return this;
    }

    /**
     * Get the rewriteRuleSet property: Rewrite rule set resource of URL path map path rule.
     *
     * @return the rewriteRuleSet value.
     */
    public SubResource rewriteRuleSet() {
        return this.innerProperties() == null ? null : this.innerProperties().rewriteRuleSet();
    }

    /**
     * Set the rewriteRuleSet property: Rewrite rule set resource of URL path map path rule.
     *
     * @param rewriteRuleSet the rewriteRuleSet value to set.
     * @return the ApplicationGatewayPathRuleInner object itself.
     */
    public ApplicationGatewayPathRuleInner withRewriteRuleSet(SubResource rewriteRuleSet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPathRulePropertiesFormat();
        }
        this.innerProperties().withRewriteRuleSet(rewriteRuleSet);
        return this;
    }

    /**
     * Get the loadDistributionPolicy property: Load Distribution Policy resource of URL path map path rule.
     *
     * @return the loadDistributionPolicy value.
     */
    public SubResource loadDistributionPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().loadDistributionPolicy();
    }

    /**
     * Set the loadDistributionPolicy property: Load Distribution Policy resource of URL path map path rule.
     *
     * @param loadDistributionPolicy the loadDistributionPolicy value to set.
     * @return the ApplicationGatewayPathRuleInner object itself.
     */
    public ApplicationGatewayPathRuleInner withLoadDistributionPolicy(SubResource loadDistributionPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPathRulePropertiesFormat();
        }
        this.innerProperties().withLoadDistributionPolicy(loadDistributionPolicy);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the path rule resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the firewallPolicy property: Reference to the FirewallPolicy resource.
     *
     * @return the firewallPolicy value.
     */
    public SubResource firewallPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().firewallPolicy();
    }

    /**
     * Set the firewallPolicy property: Reference to the FirewallPolicy resource.
     *
     * @param firewallPolicy the firewallPolicy value to set.
     * @return the ApplicationGatewayPathRuleInner object itself.
     */
    public ApplicationGatewayPathRuleInner withFirewallPolicy(SubResource firewallPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayPathRulePropertiesFormat();
        }
        this.innerProperties().withFirewallPolicy(firewallPolicy);
        return this;
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
