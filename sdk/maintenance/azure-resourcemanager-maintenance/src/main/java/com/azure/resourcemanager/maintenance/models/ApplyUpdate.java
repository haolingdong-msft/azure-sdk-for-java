// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.maintenance.fluent.models.ApplyUpdateInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of ApplyUpdate. */
public interface ApplyUpdate {
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
     * Gets the status property: The status.
     *
     * @return the status value.
     */
    UpdateStatus status();

    /**
     * Gets the resourceId property: The resourceId.
     *
     * @return the resourceId value.
     */
    String resourceId();

    /**
     * Gets the lastUpdateTime property: Last Update time.
     *
     * @return the lastUpdateTime value.
     */
    OffsetDateTime lastUpdateTime();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the inner com.azure.resourcemanager.maintenance.fluent.models.ApplyUpdateInner object.
     *
     * @return the inner object.
     */
    ApplyUpdateInner innerModel();
}
