// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The protocol of the end point. If 'Tcp' is specified, a received ACK is required for the probe to be successful. If
 * 'Http' or 'Https' is specified, a 200 OK response from the specifies URI is required for the probe to be successful.
 */
public final class ProbeProtocol extends ExpandableStringEnum<ProbeProtocol> {
    /**
     * Static value Http for ProbeProtocol.
     */
    public static final ProbeProtocol HTTP = fromString("Http");

    /**
     * Static value Tcp for ProbeProtocol.
     */
    public static final ProbeProtocol TCP = fromString("Tcp");

    /**
     * Static value Https for ProbeProtocol.
     */
    public static final ProbeProtocol HTTPS = fromString("Https");

    /**
     * Creates a new instance of ProbeProtocol value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ProbeProtocol() {
    }

    /**
     * Creates or finds a ProbeProtocol from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ProbeProtocol.
     */
    @JsonCreator
    public static ProbeProtocol fromString(String name) {
        return fromString(name, ProbeProtocol.class);
    }

    /**
     * Gets known ProbeProtocol values.
     * 
     * @return known ProbeProtocol values.
     */
    public static Collection<ProbeProtocol> values() {
        return values(ProbeProtocol.class);
    }
}
