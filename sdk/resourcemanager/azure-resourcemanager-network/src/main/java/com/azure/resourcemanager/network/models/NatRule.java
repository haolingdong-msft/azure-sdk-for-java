// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Rule of type nat. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ruleType")
@JsonTypeName("NatRule")
@Fluent
public final class NatRule extends FirewallPolicyRule {
    /*
     * Array of FirewallPolicyRuleNetworkProtocols.
     */
    @JsonProperty(value = "ipProtocols")
    private List<FirewallPolicyRuleNetworkProtocol> ipProtocols;

    /*
     * List of source IP addresses for this rule.
     */
    @JsonProperty(value = "sourceAddresses")
    private List<String> sourceAddresses;

    /*
     * List of destination IP addresses or Service Tags.
     */
    @JsonProperty(value = "destinationAddresses")
    private List<String> destinationAddresses;

    /*
     * List of destination ports.
     */
    @JsonProperty(value = "destinationPorts")
    private List<String> destinationPorts;

    /*
     * The translated address for this NAT rule.
     */
    @JsonProperty(value = "translatedAddress")
    private String translatedAddress;

    /*
     * The translated port for this NAT rule.
     */
    @JsonProperty(value = "translatedPort")
    private String translatedPort;

    /*
     * List of source IpGroups for this rule.
     */
    @JsonProperty(value = "sourceIpGroups")
    private List<String> sourceIpGroups;

    /*
     * The translated FQDN for this NAT rule.
     */
    @JsonProperty(value = "translatedFqdn")
    private String translatedFqdn;

    /** Creates an instance of NatRule class. */
    public NatRule() {
    }

    /**
     * Get the ipProtocols property: Array of FirewallPolicyRuleNetworkProtocols.
     *
     * @return the ipProtocols value.
     */
    public List<FirewallPolicyRuleNetworkProtocol> ipProtocols() {
        return this.ipProtocols;
    }

    /**
     * Set the ipProtocols property: Array of FirewallPolicyRuleNetworkProtocols.
     *
     * @param ipProtocols the ipProtocols value to set.
     * @return the NatRule object itself.
     */
    public NatRule withIpProtocols(List<FirewallPolicyRuleNetworkProtocol> ipProtocols) {
        this.ipProtocols = ipProtocols;
        return this;
    }

    /**
     * Get the sourceAddresses property: List of source IP addresses for this rule.
     *
     * @return the sourceAddresses value.
     */
    public List<String> sourceAddresses() {
        return this.sourceAddresses;
    }

    /**
     * Set the sourceAddresses property: List of source IP addresses for this rule.
     *
     * @param sourceAddresses the sourceAddresses value to set.
     * @return the NatRule object itself.
     */
    public NatRule withSourceAddresses(List<String> sourceAddresses) {
        this.sourceAddresses = sourceAddresses;
        return this;
    }

    /**
     * Get the destinationAddresses property: List of destination IP addresses or Service Tags.
     *
     * @return the destinationAddresses value.
     */
    public List<String> destinationAddresses() {
        return this.destinationAddresses;
    }

    /**
     * Set the destinationAddresses property: List of destination IP addresses or Service Tags.
     *
     * @param destinationAddresses the destinationAddresses value to set.
     * @return the NatRule object itself.
     */
    public NatRule withDestinationAddresses(List<String> destinationAddresses) {
        this.destinationAddresses = destinationAddresses;
        return this;
    }

    /**
     * Get the destinationPorts property: List of destination ports.
     *
     * @return the destinationPorts value.
     */
    public List<String> destinationPorts() {
        return this.destinationPorts;
    }

    /**
     * Set the destinationPorts property: List of destination ports.
     *
     * @param destinationPorts the destinationPorts value to set.
     * @return the NatRule object itself.
     */
    public NatRule withDestinationPorts(List<String> destinationPorts) {
        this.destinationPorts = destinationPorts;
        return this;
    }

    /**
     * Get the translatedAddress property: The translated address for this NAT rule.
     *
     * @return the translatedAddress value.
     */
    public String translatedAddress() {
        return this.translatedAddress;
    }

    /**
     * Set the translatedAddress property: The translated address for this NAT rule.
     *
     * @param translatedAddress the translatedAddress value to set.
     * @return the NatRule object itself.
     */
    public NatRule withTranslatedAddress(String translatedAddress) {
        this.translatedAddress = translatedAddress;
        return this;
    }

    /**
     * Get the translatedPort property: The translated port for this NAT rule.
     *
     * @return the translatedPort value.
     */
    public String translatedPort() {
        return this.translatedPort;
    }

    /**
     * Set the translatedPort property: The translated port for this NAT rule.
     *
     * @param translatedPort the translatedPort value to set.
     * @return the NatRule object itself.
     */
    public NatRule withTranslatedPort(String translatedPort) {
        this.translatedPort = translatedPort;
        return this;
    }

    /**
     * Get the sourceIpGroups property: List of source IpGroups for this rule.
     *
     * @return the sourceIpGroups value.
     */
    public List<String> sourceIpGroups() {
        return this.sourceIpGroups;
    }

    /**
     * Set the sourceIpGroups property: List of source IpGroups for this rule.
     *
     * @param sourceIpGroups the sourceIpGroups value to set.
     * @return the NatRule object itself.
     */
    public NatRule withSourceIpGroups(List<String> sourceIpGroups) {
        this.sourceIpGroups = sourceIpGroups;
        return this;
    }

    /**
     * Get the translatedFqdn property: The translated FQDN for this NAT rule.
     *
     * @return the translatedFqdn value.
     */
    public String translatedFqdn() {
        return this.translatedFqdn;
    }

    /**
     * Set the translatedFqdn property: The translated FQDN for this NAT rule.
     *
     * @param translatedFqdn the translatedFqdn value to set.
     * @return the NatRule object itself.
     */
    public NatRule withTranslatedFqdn(String translatedFqdn) {
        this.translatedFqdn = translatedFqdn;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NatRule withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NatRule withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
