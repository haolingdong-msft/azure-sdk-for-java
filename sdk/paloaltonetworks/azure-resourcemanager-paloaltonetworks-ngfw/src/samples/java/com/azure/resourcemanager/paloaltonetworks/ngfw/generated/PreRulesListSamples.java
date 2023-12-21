// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

/**
 * Samples for PreRules List.
 */
public final class PreRulesListSamples {
    /*
     * x-ms-original-file:
     * specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/stable/2023-09-01/examples/
     * PreRules_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: PreRules_List_MinimumSet_Gen.
     * 
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void
        preRulesListMinimumSetGen(com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.preRules().list("lrs1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/stable/2023-09-01/examples/
     * PreRules_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: PreRules_List_MaximumSet_Gen.
     * 
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void
        preRulesListMaximumSetGen(com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.preRules().list("lrs1", com.azure.core.util.Context.NONE);
    }
}
