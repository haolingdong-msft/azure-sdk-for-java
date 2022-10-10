// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.FirewallPolicyRuleCollectionGroupInner;
import com.azure.resourcemanager.network.models.ApplicationRule;
import com.azure.resourcemanager.network.models.FirewallPolicyFilterRuleCollection;
import com.azure.resourcemanager.network.models.FirewallPolicyFilterRuleCollectionAction;
import com.azure.resourcemanager.network.models.FirewallPolicyFilterRuleCollectionActionType;
import com.azure.resourcemanager.network.models.FirewallPolicyNatRuleCollection;
import com.azure.resourcemanager.network.models.FirewallPolicyNatRuleCollectionAction;
import com.azure.resourcemanager.network.models.FirewallPolicyNatRuleCollectionActionType;
import com.azure.resourcemanager.network.models.FirewallPolicyRuleApplicationProtocol;
import com.azure.resourcemanager.network.models.FirewallPolicyRuleApplicationProtocolType;
import com.azure.resourcemanager.network.models.FirewallPolicyRuleNetworkProtocol;
import com.azure.resourcemanager.network.models.NatRule;
import com.azure.resourcemanager.network.models.NetworkRule;
import java.util.Arrays;

/** Samples for FirewallPolicyRuleCollectionGroups CreateOrUpdate. */
public final class FirewallPolicyRuleCollectionGroupsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/FirewallPolicyRuleCollectionGroupPut.json
     */
    /**
     * Sample code: Create FirewallPolicyRuleCollectionGroup.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createFirewallPolicyRuleCollectionGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getFirewallPolicyRuleCollectionGroups()
            .createOrUpdate(
                "rg1",
                "firewallPolicy",
                "ruleCollectionGroup1",
                new FirewallPolicyRuleCollectionGroupInner()
                    .withPriority(100)
                    .withRuleCollections(
                        Arrays
                            .asList(
                                new FirewallPolicyFilterRuleCollection()
                                    .withName("Example-Filter-Rule-Collection")
                                    .withPriority(100)
                                    .withAction(
                                        new FirewallPolicyFilterRuleCollectionAction()
                                            .withType(FirewallPolicyFilterRuleCollectionActionType.DENY))
                                    .withRules(
                                        Arrays
                                            .asList(
                                                new NetworkRule()
                                                    .withName("network-rule1")
                                                    .withIpProtocols(
                                                        Arrays.asList(FirewallPolicyRuleNetworkProtocol.TCP))
                                                    .withSourceAddresses(Arrays.asList("10.1.25.0/24"))
                                                    .withDestinationAddresses(Arrays.asList("*"))
                                                    .withDestinationPorts(Arrays.asList("*")))))),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/FirewallPolicyRuleCollectionGroupWithIpGroupsPut.json
     */
    /**
     * Sample code: Create FirewallPolicyRuleCollectionGroup With IpGroups.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createFirewallPolicyRuleCollectionGroupWithIpGroups(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getFirewallPolicyRuleCollectionGroups()
            .createOrUpdate(
                "rg1",
                "firewallPolicy",
                "ruleCollectionGroup1",
                new FirewallPolicyRuleCollectionGroupInner()
                    .withPriority(110)
                    .withRuleCollections(
                        Arrays
                            .asList(
                                new FirewallPolicyFilterRuleCollection()
                                    .withName("Example-Filter-Rule-Collection")
                                    .withAction(
                                        new FirewallPolicyFilterRuleCollectionAction()
                                            .withType(FirewallPolicyFilterRuleCollectionActionType.DENY))
                                    .withRules(
                                        Arrays
                                            .asList(
                                                new NetworkRule()
                                                    .withName("network-1")
                                                    .withIpProtocols(
                                                        Arrays.asList(FirewallPolicyRuleNetworkProtocol.TCP))
                                                    .withDestinationPorts(Arrays.asList("*"))
                                                    .withSourceIpGroups(
                                                        Arrays
                                                            .asList(
                                                                "/subscriptions/subid/providers/Microsoft.Network/resourceGroup/rg1/ipGroups/ipGroups1"))
                                                    .withDestinationIpGroups(
                                                        Arrays
                                                            .asList(
                                                                "/subscriptions/subid/providers/Microsoft.Network/resourceGroup/rg1/ipGroups/ipGroups2")))))),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/FirewallPolicyRuleCollectionGroupWithWebCategoriesPut.json
     */
    /**
     * Sample code: Create FirewallPolicyRuleCollectionGroup With Web Categories.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createFirewallPolicyRuleCollectionGroupWithWebCategories(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getFirewallPolicyRuleCollectionGroups()
            .createOrUpdate(
                "rg1",
                "firewallPolicy",
                "ruleCollectionGroup1",
                new FirewallPolicyRuleCollectionGroupInner()
                    .withPriority(110)
                    .withRuleCollections(
                        Arrays
                            .asList(
                                new FirewallPolicyFilterRuleCollection()
                                    .withName("Example-Filter-Rule-Collection")
                                    .withAction(
                                        new FirewallPolicyFilterRuleCollectionAction()
                                            .withType(FirewallPolicyFilterRuleCollectionActionType.DENY))
                                    .withRules(
                                        Arrays
                                            .asList(
                                                new ApplicationRule()
                                                    .withName("rule1")
                                                    .withDescription("Deny inbound rule")
                                                    .withSourceAddresses(Arrays.asList("216.58.216.164", "10.0.0.0/24"))
                                                    .withProtocols(
                                                        Arrays
                                                            .asList(
                                                                new FirewallPolicyRuleApplicationProtocol()
                                                                    .withProtocolType(
                                                                        FirewallPolicyRuleApplicationProtocolType.HTTPS)
                                                                    .withPort(443)))
                                                    .withWebCategories(Arrays.asList("Hacking")))))),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/FirewallPolicyNatRuleCollectionGroupPut.json
     */
    /**
     * Sample code: Create FirewallPolicyNatRuleCollectionGroup.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createFirewallPolicyNatRuleCollectionGroup(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getFirewallPolicyRuleCollectionGroups()
            .createOrUpdate(
                "rg1",
                "firewallPolicy",
                "ruleCollectionGroup1",
                new FirewallPolicyRuleCollectionGroupInner()
                    .withPriority(100)
                    .withRuleCollections(
                        Arrays
                            .asList(
                                new FirewallPolicyNatRuleCollection()
                                    .withName("Example-Nat-Rule-Collection")
                                    .withPriority(100)
                                    .withAction(
                                        new FirewallPolicyNatRuleCollectionAction()
                                            .withType(FirewallPolicyNatRuleCollectionActionType.DNAT))
                                    .withRules(
                                        Arrays
                                            .asList(
                                                new NatRule()
                                                    .withName("nat-rule1")
                                                    .withIpProtocols(
                                                        Arrays
                                                            .asList(
                                                                FirewallPolicyRuleNetworkProtocol.TCP,
                                                                FirewallPolicyRuleNetworkProtocol.UDP))
                                                    .withSourceAddresses(Arrays.asList("2.2.2.2"))
                                                    .withDestinationAddresses(Arrays.asList("152.23.32.23"))
                                                    .withDestinationPorts(Arrays.asList("8080"))
                                                    .withTranslatedPort("8080")
                                                    .withSourceIpGroups(Arrays.asList())
                                                    .withTranslatedFqdn("internalhttp.server.net"))))),
                Context.NONE);
    }
}
