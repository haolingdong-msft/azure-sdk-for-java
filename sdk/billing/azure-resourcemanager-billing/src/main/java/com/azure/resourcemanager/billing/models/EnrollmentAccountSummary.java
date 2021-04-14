// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.resourcemanager.billing.fluent.models.EnrollmentAccountSummaryInner;

/** An immutable client-side representation of EnrollmentAccountSummary. */
public interface EnrollmentAccountSummary {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the principalName property: The account owner's principal name.
     *
     * @return the principalName value.
     */
    String principalName();

    /**
     * Gets the inner com.azure.resourcemanager.billing.fluent.models.EnrollmentAccountSummaryInner object.
     *
     * @return the inner object.
     */
    EnrollmentAccountSummaryInner innerModel();
}
