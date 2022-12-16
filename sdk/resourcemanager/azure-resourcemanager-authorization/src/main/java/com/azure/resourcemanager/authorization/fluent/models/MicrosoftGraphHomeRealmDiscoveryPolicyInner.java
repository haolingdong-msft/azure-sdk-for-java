// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * homeRealmDiscoveryPolicy
 *
 * <p>Represents an Azure Active Directory object. The directoryObject type is the base type for many other directory
 * entity types.
 */
@Fluent
public final class MicrosoftGraphHomeRealmDiscoveryPolicyInner extends MicrosoftGraphStsPolicy {
    /*
     * Represents an Azure Active Directory object. The directoryObject type is the base type for many other directory
     * entity types.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphHomeRealmDiscoveryPolicyInner class. */
    public MicrosoftGraphHomeRealmDiscoveryPolicyInner() {
    }

    /**
     * Get the additionalProperties property: Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphHomeRealmDiscoveryPolicyInner object itself.
     */
    public MicrosoftGraphHomeRealmDiscoveryPolicyInner withAdditionalProperties(
        Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphHomeRealmDiscoveryPolicyInner withDefinition(List<String> definition) {
        super.withDefinition(definition);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphHomeRealmDiscoveryPolicyInner withIsOrganizationDefault(Boolean isOrganizationDefault) {
        super.withIsOrganizationDefault(isOrganizationDefault);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphHomeRealmDiscoveryPolicyInner withAppliesTo(
        List<MicrosoftGraphDirectoryObjectInner> appliesTo) {
        super.withAppliesTo(appliesTo);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphHomeRealmDiscoveryPolicyInner withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphHomeRealmDiscoveryPolicyInner withDisplayName(String displayName) {
        super.withDisplayName(displayName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphHomeRealmDiscoveryPolicyInner withDeletedDateTime(OffsetDateTime deletedDateTime) {
        super.withDeletedDateTime(deletedDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphHomeRealmDiscoveryPolicyInner withId(String id) {
        super.withId(id);
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
