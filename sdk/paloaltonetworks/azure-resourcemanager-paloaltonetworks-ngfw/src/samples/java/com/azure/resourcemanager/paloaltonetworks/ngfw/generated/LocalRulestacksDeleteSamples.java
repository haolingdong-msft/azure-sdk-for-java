// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

/** Samples for LocalRulestacks Delete. */
public final class LocalRulestacksDeleteSamples {
    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/LocalRulestacks_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: LocalRulestacks_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to NgfwManager.
     */
    public static void localRulestacksDeleteMaximumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.NgfwManager manager) {
        manager.localRulestacks().delete("rgopenapi", "lrs1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/LocalRulestacks_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: LocalRulestacks_Delete_MinimumSet_Gen.
     *
     * @param manager Entry point to NgfwManager.
     */
    public static void localRulestacksDeleteMinimumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.NgfwManager manager) {
        manager.localRulestacks().delete("rgopenapi", "lrs1", com.azure.core.util.Context.NONE);
    }
}
