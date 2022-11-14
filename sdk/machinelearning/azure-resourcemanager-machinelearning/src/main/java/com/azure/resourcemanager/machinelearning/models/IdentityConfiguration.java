// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Base definition for identity configuration. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "identityType",
    defaultImpl = IdentityConfiguration.class)
@JsonTypeName("IdentityConfiguration")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AMLToken", value = AmlToken.class),
    @JsonSubTypes.Type(name = "Managed", value = ManagedIdentity.class),
    @JsonSubTypes.Type(name = "UserIdentity", value = UserIdentity.class)
})
@Immutable
public class IdentityConfiguration {
    /** Creates an instance of IdentityConfiguration class. */
    public IdentityConfiguration() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
