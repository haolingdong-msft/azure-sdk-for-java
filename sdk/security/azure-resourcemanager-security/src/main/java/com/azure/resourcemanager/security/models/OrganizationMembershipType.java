// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The multi cloud account's membership type in the organization. */
public final class OrganizationMembershipType extends ExpandableStringEnum<OrganizationMembershipType> {
    /** Static value Member for OrganizationMembershipType. */
    public static final OrganizationMembershipType MEMBER = fromString("Member");

    /** Static value Organization for OrganizationMembershipType. */
    public static final OrganizationMembershipType ORGANIZATION = fromString("Organization");

    /**
     * Creates or finds a OrganizationMembershipType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OrganizationMembershipType.
     */
    @JsonCreator
    public static OrganizationMembershipType fromString(String name) {
        return fromString(name, OrganizationMembershipType.class);
    }

    /**
     * Gets known OrganizationMembershipType values.
     *
     * @return known OrganizationMembershipType values.
     */
    public static Collection<OrganizationMembershipType> values() {
        return values(OrganizationMembershipType.class);
    }
}
