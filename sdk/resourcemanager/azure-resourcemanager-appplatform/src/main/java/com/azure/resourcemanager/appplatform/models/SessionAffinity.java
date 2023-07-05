// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SessionAffinity. */
public final class SessionAffinity extends ExpandableStringEnum<SessionAffinity> {
    /** Static value Cookie for SessionAffinity. */
    public static final SessionAffinity COOKIE = fromString("Cookie");

    /** Static value None for SessionAffinity. */
    public static final SessionAffinity NONE = fromString("None");

    /**
     * Creates or finds a SessionAffinity from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SessionAffinity.
     */
    @JsonCreator
    public static SessionAffinity fromString(String name) {
        return fromString(name, SessionAffinity.class);
    }

    /**
     * Gets known SessionAffinity values.
     *
     * @return known SessionAffinity values.
     */
    public static Collection<SessionAffinity> values() {
        return values(SessionAffinity.class);
    }
}
