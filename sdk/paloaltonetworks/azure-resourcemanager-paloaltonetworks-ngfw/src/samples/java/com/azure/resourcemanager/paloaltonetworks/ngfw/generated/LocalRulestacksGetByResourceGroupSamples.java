// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

/** Samples for LocalRulestacks GetByResourceGroup. */
public final class LocalRulestacksGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/LocalRulestacks_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: LocalRulestacks_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to NgfwManager.
     */
    public static void localRulestacksGetMaximumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.NgfwManager manager) {
        manager.localRulestacks().getByResourceGroupWithResponse("rgopenapi", "lrs1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/LocalRulestacks_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: LocalRulestacks_Get_MinimumSet_Gen.
     *
     * @param manager Entry point to NgfwManager.
     */
    public static void localRulestacksGetMinimumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.NgfwManager manager) {
        manager.localRulestacks().getByResourceGroupWithResponse("rgopenapi", "lrs1", com.azure.core.util.Context.NONE);
    }
}
