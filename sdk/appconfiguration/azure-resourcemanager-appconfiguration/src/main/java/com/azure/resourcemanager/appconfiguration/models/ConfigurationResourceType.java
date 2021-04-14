// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ConfigurationResourceType. */
public final class ConfigurationResourceType extends ExpandableStringEnum<ConfigurationResourceType> {
    /** Static value Microsoft.AppConfiguration/configurationStores for ConfigurationResourceType. */
    public static final ConfigurationResourceType MICROSOFT_APP_CONFIGURATION_CONFIGURATION_STORES =
        fromString("Microsoft.AppConfiguration/configurationStores");

    /**
     * Creates or finds a ConfigurationResourceType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ConfigurationResourceType.
     */
    @JsonCreator
    public static ConfigurationResourceType fromString(String name) {
        return fromString(name, ConfigurationResourceType.class);
    }

    /** @return known ConfigurationResourceType values. */
    public static Collection<ConfigurationResourceType> values() {
        return values(ConfigurationResourceType.class);
    }
}
