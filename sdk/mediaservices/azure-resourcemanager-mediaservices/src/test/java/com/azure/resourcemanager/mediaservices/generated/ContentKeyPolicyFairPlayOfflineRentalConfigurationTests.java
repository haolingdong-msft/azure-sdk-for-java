// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicyFairPlayOfflineRentalConfiguration;
import org.junit.jupiter.api.Assertions;

public final class ContentKeyPolicyFairPlayOfflineRentalConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContentKeyPolicyFairPlayOfflineRentalConfiguration model =
            BinaryData
                .fromString(
                    "{\"playbackDurationSeconds\":6751784121052191451,\"storageDurationSeconds\":3372671534162877362}")
                .toObject(ContentKeyPolicyFairPlayOfflineRentalConfiguration.class);
        Assertions.assertEquals(6751784121052191451L, model.playbackDurationSeconds());
        Assertions.assertEquals(3372671534162877362L, model.storageDurationSeconds());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ContentKeyPolicyFairPlayOfflineRentalConfiguration model =
            new ContentKeyPolicyFairPlayOfflineRentalConfiguration()
                .withPlaybackDurationSeconds(6751784121052191451L)
                .withStorageDurationSeconds(3372671534162877362L);
        model = BinaryData.fromObject(model).toObject(ContentKeyPolicyFairPlayOfflineRentalConfiguration.class);
        Assertions.assertEquals(6751784121052191451L, model.playbackDurationSeconds());
        Assertions.assertEquals(3372671534162877362L, model.storageDurationSeconds());
    }
}
