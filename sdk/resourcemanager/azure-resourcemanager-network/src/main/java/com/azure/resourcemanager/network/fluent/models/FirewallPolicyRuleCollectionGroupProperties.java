// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.FirewallPolicyRuleCollection;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of the rule collection group. */
@Fluent
public final class FirewallPolicyRuleCollectionGroupProperties {
    /*
     * Priority of the Firewall Policy Rule Collection Group resource.
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /*
     * Group of Firewall Policy rule collections.
     */
    @JsonProperty(value = "ruleCollections")
    private List<FirewallPolicyRuleCollection> ruleCollections;

    /*
     * The provisioning state of the firewall policy rule collection group resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /** Creates an instance of FirewallPolicyRuleCollectionGroupProperties class. */
    public FirewallPolicyRuleCollectionGroupProperties() {
    }

    /**
     * Get the priority property: Priority of the Firewall Policy Rule Collection Group resource.
     *
     * @return the priority value.
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Priority of the Firewall Policy Rule Collection Group resource.
     *
     * @param priority the priority value to set.
     * @return the FirewallPolicyRuleCollectionGroupProperties object itself.
     */
    public FirewallPolicyRuleCollectionGroupProperties withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the ruleCollections property: Group of Firewall Policy rule collections.
     *
     * @return the ruleCollections value.
     */
    public List<FirewallPolicyRuleCollection> ruleCollections() {
        return this.ruleCollections;
    }

    /**
     * Set the ruleCollections property: Group of Firewall Policy rule collections.
     *
     * @param ruleCollections the ruleCollections value to set.
     * @return the FirewallPolicyRuleCollectionGroupProperties object itself.
     */
    public FirewallPolicyRuleCollectionGroupProperties withRuleCollections(
        List<FirewallPolicyRuleCollection> ruleCollections) {
        this.ruleCollections = ruleCollections;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the firewall policy rule collection group resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ruleCollections() != null) {
            ruleCollections().forEach(e -> e.validate());
        }
    }
}
