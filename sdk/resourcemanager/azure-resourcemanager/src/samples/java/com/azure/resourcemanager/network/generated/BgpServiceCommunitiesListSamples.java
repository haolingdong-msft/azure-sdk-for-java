// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for BgpServiceCommunities List. */
public final class BgpServiceCommunitiesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-08-01/examples/ServiceCommunityList.json
     */
    /**
     * Sample code: ServiceCommunityList.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void serviceCommunityList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getBgpServiceCommunities().list(Context.NONE);
    }
}
