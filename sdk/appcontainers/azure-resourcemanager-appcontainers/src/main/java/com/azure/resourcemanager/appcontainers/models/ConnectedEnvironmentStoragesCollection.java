// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.resourcemanager.appcontainers.fluent.models.ConnectedEnvironmentStoragesCollectionInner;
import java.util.List;

/** An immutable client-side representation of ConnectedEnvironmentStoragesCollection. */
public interface ConnectedEnvironmentStoragesCollection {
    /**
     * Gets the value property: Collection of storage resources.
     *
     * @return the value value.
     */
    List<ConnectedEnvironmentStorage> value();

    /**
     * Gets the inner com.azure.resourcemanager.appcontainers.fluent.models.ConnectedEnvironmentStoragesCollectionInner
     * object.
     *
     * @return the inner object.
     */
    ConnectedEnvironmentStoragesCollectionInner innerModel();
}
