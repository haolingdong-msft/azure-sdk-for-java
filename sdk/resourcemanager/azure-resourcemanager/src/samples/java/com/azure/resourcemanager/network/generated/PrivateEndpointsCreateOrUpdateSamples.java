// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.ApplicationSecurityGroupInner;
import com.azure.resourcemanager.network.fluent.models.PrivateEndpointInner;
import com.azure.resourcemanager.network.fluent.models.SubnetInner;
import com.azure.resourcemanager.network.models.PrivateEndpointIpConfiguration;
import com.azure.resourcemanager.network.models.PrivateLinkServiceConnection;
import java.util.Arrays;

/** Samples for PrivateEndpoints CreateOrUpdate. */
public final class PrivateEndpointsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-08-01/examples/PrivateEndpointCreateWithASG.json
     */
    /**
     * Sample code: Create private endpoint with application security groups.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createPrivateEndpointWithApplicationSecurityGroups(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getPrivateEndpoints()
            .createOrUpdate(
                "rg1",
                "testPe",
                new PrivateEndpointInner()
                    .withLocation("eastus2euap")
                    .withSubnet(
                        new SubnetInner()
                            .withId(
                                "/subscriptions/subId/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/myVnet/subnets/mySubnet"))
                    .withPrivateLinkServiceConnections(
                        Arrays
                            .asList(
                                new PrivateLinkServiceConnection()
                                    .withPrivateLinkServiceId(
                                        "/subscriptions/subId/resourceGroups/rg1/providers/Microsoft.Network/privateLinkServices/testPls")
                                    .withGroupIds(Arrays.asList("groupIdFromResource"))
                                    .withRequestMessage("Please approve my connection.")))
                    .withApplicationSecurityGroups(
                        Arrays
                            .asList(
                                new ApplicationSecurityGroupInner()
                                    .withId(
                                        "/subscriptions/subId/resourceGroups/rg1/provders/Microsoft.Network/applicationSecurityGroup/asg1"))),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-08-01/examples/PrivateEndpointCreate.json
     */
    /**
     * Sample code: Create private endpoint.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createPrivateEndpoint(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getPrivateEndpoints()
            .createOrUpdate(
                "rg1",
                "testPe",
                new PrivateEndpointInner()
                    .withLocation("eastus2euap")
                    .withSubnet(
                        new SubnetInner()
                            .withId(
                                "/subscriptions/subId/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/myVnet/subnets/mySubnet"))
                    .withPrivateLinkServiceConnections(
                        Arrays
                            .asList(
                                new PrivateLinkServiceConnection()
                                    .withPrivateLinkServiceId(
                                        "/subscriptions/subId/resourceGroups/rg1/providers/Microsoft.Network/privateLinkServices/testPls")
                                    .withGroupIds(Arrays.asList("groupIdFromResource"))
                                    .withRequestMessage("Please approve my connection.")))
                    .withIpConfigurations(
                        Arrays
                            .asList(
                                new PrivateEndpointIpConfiguration()
                                    .withName("pestaticconfig")
                                    .withGroupId("file")
                                    .withMemberName("file")
                                    .withPrivateIpAddress("192.168.0.6")))
                    .withCustomNetworkInterfaceName("testPeNic"),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-08-01/examples/PrivateEndpointCreateForManualApproval.json
     */
    /**
     * Sample code: Create private endpoint with manual approval connection.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createPrivateEndpointWithManualApprovalConnection(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getPrivateEndpoints()
            .createOrUpdate(
                "rg1",
                "testPe",
                new PrivateEndpointInner()
                    .withLocation("eastus")
                    .withSubnet(
                        new SubnetInner()
                            .withId(
                                "/subscriptions/subId/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/myVnet/subnets/mySubnet"))
                    .withManualPrivateLinkServiceConnections(
                        Arrays
                            .asList(
                                new PrivateLinkServiceConnection()
                                    .withPrivateLinkServiceId(
                                        "/subscriptions/subId/resourceGroups/rg1/providers/Microsoft.Network/privateLinkServices/testPls")
                                    .withGroupIds(Arrays.asList("groupIdFromResource"))
                                    .withRequestMessage("Please manually approve my connection.")))
                    .withIpConfigurations(
                        Arrays
                            .asList(
                                new PrivateEndpointIpConfiguration()
                                    .withName("pestaticconfig")
                                    .withGroupId("file")
                                    .withMemberName("file")
                                    .withPrivateIpAddress("192.168.0.5")))
                    .withCustomNetworkInterfaceName("testPeNic"),
                Context.NONE);
    }
}
