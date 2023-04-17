// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

/** Samples for Firewalls ListByResourceGroup. */
public final class FirewallsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/Firewalls_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: Firewalls_ListByResourceGroup_MaximumSet_Gen.
     *
     * @param manager Entry point to NgfwManager.
     */
    public static void firewallsListByResourceGroupMaximumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.NgfwManager manager) {
        manager.firewalls().listByResourceGroup("firewall-rg", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/Firewalls_ListByResourceGroup_MinimumSet_Gen.json
     */
    /**
     * Sample code: Firewalls_ListByResourceGroup_MinimumSet_Gen.
     *
     * @param manager Entry point to NgfwManager.
     */
    public static void firewallsListByResourceGroupMinimumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.NgfwManager manager) {
        manager.firewalls().listByResourceGroup("firewall-rg", com.azure.core.util.Context.NONE);
    }
}
