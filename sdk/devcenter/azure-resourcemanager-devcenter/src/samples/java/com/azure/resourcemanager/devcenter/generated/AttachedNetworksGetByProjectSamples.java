// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.Context;

/** Samples for AttachedNetworks GetByProject. */
public final class AttachedNetworksGetByProjectSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/preview/2022-09-01-preview/examples/AttachedNetworks_GetByProject.json
     */
    /**
     * Sample code: AttachedNetworks_GetByProject.
     *
     * @param manager Entry point to DevCenterManager.
     */
    public static void attachedNetworksGetByProject(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager.attachedNetworks().getByProjectWithResponse("rg1", "{projectName}", "network-uswest3", Context.NONE);
    }
}
