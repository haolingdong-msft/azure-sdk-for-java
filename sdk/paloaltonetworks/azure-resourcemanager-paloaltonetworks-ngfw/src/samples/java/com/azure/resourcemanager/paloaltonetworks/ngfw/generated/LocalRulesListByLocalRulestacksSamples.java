// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

/** Samples for LocalRules ListByLocalRulestacks. */
public final class LocalRulesListByLocalRulestacksSamples {
    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/LocalRules_ListByLocalRulestacks_MinimumSet_Gen.json
     */
    /**
     * Sample code: LocalRules_ListByLocalRulestacks_MinimumSet_Gen.
     *
     * @param manager Entry point to NgfwManager.
     */
    public static void localRulesListByLocalRulestacksMinimumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.NgfwManager manager) {
        manager.localRules().listByLocalRulestacks("firewall-rg", "lrs1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/LocalRules_ListByLocalRulestacks_MaximumSet_Gen.json
     */
    /**
     * Sample code: LocalRules_ListByLocalRulestacks_MaximumSet_Gen.
     *
     * @param manager Entry point to NgfwManager.
     */
    public static void localRulesListByLocalRulestacksMaximumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.NgfwManager manager) {
        manager.localRules().listByLocalRulestacks("firewall-rg", "lrs1", com.azure.core.util.Context.NONE);
    }
}
