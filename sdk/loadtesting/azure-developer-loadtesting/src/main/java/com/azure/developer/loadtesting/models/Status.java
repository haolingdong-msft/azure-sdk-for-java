// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.loadtesting.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Status. */
public final class Status extends ExpandableStringEnum<Status> {
    /** Test run request is accepted. */
    @Generated public static final Status ACCEPTED = fromString("ACCEPTED");

    /** Test run is not yet started. */
    @Generated public static final Status NOTSTARTED = fromString("NOTSTARTED");

    /** Test run is getting provision. */
    @Generated public static final Status PROVISIONING = fromString("PROVISIONING");

    /** Test run is provisioned. */
    @Generated public static final Status PROVISIONED = fromString("PROVISIONED");

    /** Test run is getting configure. */
    @Generated public static final Status CONFIGURING = fromString("CONFIGURING");

    /** Test run configuration is done. */
    @Generated public static final Status CONFIGURED = fromString("CONFIGURED");

    /** Test run has started executing. */
    @Generated public static final Status EXECUTING = fromString("EXECUTING");

    /** Test run has been executed. */
    @Generated public static final Status EXECUTED = fromString("EXECUTED");

    /** Test run is getting deprovision. */
    @Generated public static final Status DEPROVISIONING = fromString("DEPROVISIONING");

    /** Test run request is deprovisioned. */
    @Generated public static final Status DEPROVISIONED = fromString("DEPROVISIONED");

    /** Test run request is finished. */
    @Generated public static final Status DONE = fromString("DONE");

    /** Test run request is getting cancelled. */
    @Generated public static final Status CANCELLING = fromString("CANCELLING");

    /** Test run request is cancelled. */
    @Generated public static final Status CANCELLED = fromString("CANCELLED");

    /** Test run request is failed. */
    @Generated public static final Status FAILED = fromString("FAILED");

    /** Test run JMX file is validated. */
    @Generated public static final Status VALIDATION_SUCCESS = fromString("VALIDATION_SUCCESS");

    /** Test run JMX file validation is failed. */
    @Generated public static final Status VALIDATION_FAILURE = fromString("VALIDATION_FAILURE");

    /**
     * Creates a new instance of Status value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public Status() {}

    /**
     * Creates or finds a Status from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Status.
     */
    @Generated
    @JsonCreator
    public static Status fromString(String name) {
        return fromString(name, Status.class);
    }

    /**
     * Gets known Status values.
     *
     * @return known Status values.
     */
    @Generated
    public static Collection<Status> values() {
        return values(Status.class);
    }
}
