// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ContactProfilesPropertiesProvisioningState. */
public final class ContactProfilesPropertiesProvisioningState
    extends ExpandableStringEnum<ContactProfilesPropertiesProvisioningState> {
    /** Static value Creating for ContactProfilesPropertiesProvisioningState. */
    public static final ContactProfilesPropertiesProvisioningState CREATING = fromString("Creating");

    /** Static value Succeeded for ContactProfilesPropertiesProvisioningState. */
    public static final ContactProfilesPropertiesProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for ContactProfilesPropertiesProvisioningState. */
    public static final ContactProfilesPropertiesProvisioningState FAILED = fromString("Failed");

    /** Static value Canceled for ContactProfilesPropertiesProvisioningState. */
    public static final ContactProfilesPropertiesProvisioningState CANCELED = fromString("Canceled");

    /** Static value Updating for ContactProfilesPropertiesProvisioningState. */
    public static final ContactProfilesPropertiesProvisioningState UPDATING = fromString("Updating");

    /** Static value Deleting for ContactProfilesPropertiesProvisioningState. */
    public static final ContactProfilesPropertiesProvisioningState DELETING = fromString("Deleting");

    /**
     * Creates or finds a ContactProfilesPropertiesProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ContactProfilesPropertiesProvisioningState.
     */
    @JsonCreator
    public static ContactProfilesPropertiesProvisioningState fromString(String name) {
        return fromString(name, ContactProfilesPropertiesProvisioningState.class);
    }

    /**
     * Gets known ContactProfilesPropertiesProvisioningState values.
     *
     * @return known ContactProfilesPropertiesProvisioningState values.
     */
    public static Collection<ContactProfilesPropertiesProvisioningState> values() {
        return values(ContactProfilesPropertiesProvisioningState.class);
    }
}
