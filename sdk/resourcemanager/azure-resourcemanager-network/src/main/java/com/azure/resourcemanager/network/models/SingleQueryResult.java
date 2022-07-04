// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The SingleQueryResult model. */
@Fluent
public final class SingleQueryResult {
    /*
     * The ID of the signature
     */
    @JsonProperty(value = "signatureId")
    private Integer signatureId;

    /*
     * The current mode enforced, 0 - Disabled, 1 - Alert, 2 -Deny
     */
    @JsonProperty(value = "mode")
    private FirewallPolicyIdpsSignatureMode mode;

    /*
     * Describes the severity of signature: 1 - Low, 2 - Medium, 3 - High
     */
    @JsonProperty(value = "severity")
    private FirewallPolicyIdpsSignatureSeverity severity;

    /*
     * Describes in which direction signature is being enforced: 0 - Inbound, 1
     * - OutBound, 2 - Bidirectional
     */
    @JsonProperty(value = "direction")
    private FirewallPolicyIdpsSignatureDirection direction;

    /*
     * Describes the groups the signature belongs to
     */
    @JsonProperty(value = "group")
    private String group;

    /*
     * Describes what is the signature enforces
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Describes the protocol the signatures is being enforced in
     */
    @JsonProperty(value = "protocol")
    private String protocol;

    /*
     * Describes the list of source ports related to this signature
     */
    @JsonProperty(value = "sourcePorts")
    private List<String> sourcePorts;

    /*
     * Describes the list of destination ports related to this signature
     */
    @JsonProperty(value = "destinationPorts")
    private List<String> destinationPorts;

    /*
     * Describes the last updated time of the signature (provided from 3rd
     * party vendor)
     */
    @JsonProperty(value = "lastUpdated")
    private String lastUpdated;

    /*
     * Describes if this override is inherited from base policy or not
     */
    @JsonProperty(value = "inheritedFromParentPolicy")
    private Boolean inheritedFromParentPolicy;

    /**
     * Get the signatureId property: The ID of the signature.
     *
     * @return the signatureId value.
     */
    public Integer signatureId() {
        return this.signatureId;
    }

    /**
     * Set the signatureId property: The ID of the signature.
     *
     * @param signatureId the signatureId value to set.
     * @return the SingleQueryResult object itself.
     */
    public SingleQueryResult withSignatureId(Integer signatureId) {
        this.signatureId = signatureId;
        return this;
    }

    /**
     * Get the mode property: The current mode enforced, 0 - Disabled, 1 - Alert, 2 -Deny.
     *
     * @return the mode value.
     */
    public FirewallPolicyIdpsSignatureMode mode() {
        return this.mode;
    }

    /**
     * Set the mode property: The current mode enforced, 0 - Disabled, 1 - Alert, 2 -Deny.
     *
     * @param mode the mode value to set.
     * @return the SingleQueryResult object itself.
     */
    public SingleQueryResult withMode(FirewallPolicyIdpsSignatureMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the severity property: Describes the severity of signature: 1 - Low, 2 - Medium, 3 - High.
     *
     * @return the severity value.
     */
    public FirewallPolicyIdpsSignatureSeverity severity() {
        return this.severity;
    }

    /**
     * Set the severity property: Describes the severity of signature: 1 - Low, 2 - Medium, 3 - High.
     *
     * @param severity the severity value to set.
     * @return the SingleQueryResult object itself.
     */
    public SingleQueryResult withSeverity(FirewallPolicyIdpsSignatureSeverity severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get the direction property: Describes in which direction signature is being enforced: 0 - Inbound, 1 - OutBound,
     * 2 - Bidirectional.
     *
     * @return the direction value.
     */
    public FirewallPolicyIdpsSignatureDirection direction() {
        return this.direction;
    }

    /**
     * Set the direction property: Describes in which direction signature is being enforced: 0 - Inbound, 1 - OutBound,
     * 2 - Bidirectional.
     *
     * @param direction the direction value to set.
     * @return the SingleQueryResult object itself.
     */
    public SingleQueryResult withDirection(FirewallPolicyIdpsSignatureDirection direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Get the group property: Describes the groups the signature belongs to.
     *
     * @return the group value.
     */
    public String group() {
        return this.group;
    }

    /**
     * Set the group property: Describes the groups the signature belongs to.
     *
     * @param group the group value to set.
     * @return the SingleQueryResult object itself.
     */
    public SingleQueryResult withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * Get the description property: Describes what is the signature enforces.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Describes what is the signature enforces.
     *
     * @param description the description value to set.
     * @return the SingleQueryResult object itself.
     */
    public SingleQueryResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the protocol property: Describes the protocol the signatures is being enforced in.
     *
     * @return the protocol value.
     */
    public String protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: Describes the protocol the signatures is being enforced in.
     *
     * @param protocol the protocol value to set.
     * @return the SingleQueryResult object itself.
     */
    public SingleQueryResult withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the sourcePorts property: Describes the list of source ports related to this signature.
     *
     * @return the sourcePorts value.
     */
    public List<String> sourcePorts() {
        return this.sourcePorts;
    }

    /**
     * Set the sourcePorts property: Describes the list of source ports related to this signature.
     *
     * @param sourcePorts the sourcePorts value to set.
     * @return the SingleQueryResult object itself.
     */
    public SingleQueryResult withSourcePorts(List<String> sourcePorts) {
        this.sourcePorts = sourcePorts;
        return this;
    }

    /**
     * Get the destinationPorts property: Describes the list of destination ports related to this signature.
     *
     * @return the destinationPorts value.
     */
    public List<String> destinationPorts() {
        return this.destinationPorts;
    }

    /**
     * Set the destinationPorts property: Describes the list of destination ports related to this signature.
     *
     * @param destinationPorts the destinationPorts value to set.
     * @return the SingleQueryResult object itself.
     */
    public SingleQueryResult withDestinationPorts(List<String> destinationPorts) {
        this.destinationPorts = destinationPorts;
        return this;
    }

    /**
     * Get the lastUpdated property: Describes the last updated time of the signature (provided from 3rd party vendor).
     *
     * @return the lastUpdated value.
     */
    public String lastUpdated() {
        return this.lastUpdated;
    }

    /**
     * Set the lastUpdated property: Describes the last updated time of the signature (provided from 3rd party vendor).
     *
     * @param lastUpdated the lastUpdated value to set.
     * @return the SingleQueryResult object itself.
     */
    public SingleQueryResult withLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    /**
     * Get the inheritedFromParentPolicy property: Describes if this override is inherited from base policy or not.
     *
     * @return the inheritedFromParentPolicy value.
     */
    public Boolean inheritedFromParentPolicy() {
        return this.inheritedFromParentPolicy;
    }

    /**
     * Set the inheritedFromParentPolicy property: Describes if this override is inherited from base policy or not.
     *
     * @param inheritedFromParentPolicy the inheritedFromParentPolicy value to set.
     * @return the SingleQueryResult object itself.
     */
    public SingleQueryResult withInheritedFromParentPolicy(Boolean inheritedFromParentPolicy) {
        this.inheritedFromParentPolicy = inheritedFromParentPolicy;
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
