// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for WebApps GetPrivateLinkResourcesSlot.
 */
public final class WebAppsGetPrivateLinkResourcesSlotSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2023-01-01/examples/GetSitePrivateLinkResourcesSlot.json
     */
    /**
     * Sample code: Get private link resources of a site.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getPrivateLinkResourcesOfASite(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps().manager().serviceClient().getWebApps().getPrivateLinkResourcesSlotWithResponse("rg", "testSite",
            "stage", com.azure.core.util.Context.NONE);
    }
}
