// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.qumulo.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.qumulo.models.FileSystemResourceUpdateProperties;
import com.azure.resourcemanager.qumulo.models.MarketplaceDetails;
import com.azure.resourcemanager.qumulo.models.UserDetails;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class FileSystemResourceUpdatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FileSystemResourceUpdateProperties model =
            BinaryData
                .fromString(
                    "{\"marketplaceDetails\":{\"marketplaceSubscriptionId\":\"wjfeusnhutjel\",\"planId\":\"mrldhu\",\"offerId\":\"jzzd\",\"publisherId\":\"tqxhocdgeab\",\"marketplaceSubscriptionStatus\":\"PendingFulfillmentStart\"},\"userDetails\":{\"email\":\"uticndvkaozwyif\"},\"delegatedSubnetId\":\"hxh\",\"clusterLoginUrl\":\"okftyxolniwpwcuk\",\"privateIPs\":[\"giawx\",\"lryplwckbasyy\",\"nddhsgcbacph\",\"jkot\"]}")
                .toObject(FileSystemResourceUpdateProperties.class);
        Assertions.assertEquals("wjfeusnhutjel", model.marketplaceDetails().marketplaceSubscriptionId());
        Assertions.assertEquals("mrldhu", model.marketplaceDetails().planId());
        Assertions.assertEquals("jzzd", model.marketplaceDetails().offerId());
        Assertions.assertEquals("tqxhocdgeab", model.marketplaceDetails().publisherId());
        Assertions.assertEquals("uticndvkaozwyif", model.userDetails().email());
        Assertions.assertEquals("hxh", model.delegatedSubnetId());
        Assertions.assertEquals("okftyxolniwpwcuk", model.clusterLoginUrl());
        Assertions.assertEquals("giawx", model.privateIPs().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FileSystemResourceUpdateProperties model =
            new FileSystemResourceUpdateProperties()
                .withMarketplaceDetails(
                    new MarketplaceDetails()
                        .withMarketplaceSubscriptionId("wjfeusnhutjel")
                        .withPlanId("mrldhu")
                        .withOfferId("jzzd")
                        .withPublisherId("tqxhocdgeab"))
                .withUserDetails(new UserDetails().withEmail("uticndvkaozwyif"))
                .withDelegatedSubnetId("hxh")
                .withClusterLoginUrl("okftyxolniwpwcuk")
                .withPrivateIPs(Arrays.asList("giawx", "lryplwckbasyy", "nddhsgcbacph", "jkot"));
        model = BinaryData.fromObject(model).toObject(FileSystemResourceUpdateProperties.class);
        Assertions.assertEquals("wjfeusnhutjel", model.marketplaceDetails().marketplaceSubscriptionId());
        Assertions.assertEquals("mrldhu", model.marketplaceDetails().planId());
        Assertions.assertEquals("jzzd", model.marketplaceDetails().offerId());
        Assertions.assertEquals("tqxhocdgeab", model.marketplaceDetails().publisherId());
        Assertions.assertEquals("uticndvkaozwyif", model.userDetails().email());
        Assertions.assertEquals("hxh", model.delegatedSubnetId());
        Assertions.assertEquals("okftyxolniwpwcuk", model.clusterLoginUrl());
        Assertions.assertEquals("giawx", model.privateIPs().get(0));
    }
}
