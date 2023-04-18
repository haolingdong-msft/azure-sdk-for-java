// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

/** Samples for FqdnListLocalRulestack Get. */
public final class FqdnListLocalRulestackGetSamples {
    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/FqdnListLocalRulestack_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: FqdnListLocalRulestack_Get_MinimumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void fqdnListLocalRulestackGetMinimumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager
            .fqdnListLocalRulestacks()
            .getWithResponse("rgopenapi", "lrs1", "armid1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/FqdnListLocalRulestack_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: FqdnListLocalRulestack_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void fqdnListLocalRulestackGetMaximumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager
            .fqdnListLocalRulestacks()
            .getWithResponse("rgopenapi", "lrs1", "armid1", com.azure.core.util.Context.NONE);
    }
}
