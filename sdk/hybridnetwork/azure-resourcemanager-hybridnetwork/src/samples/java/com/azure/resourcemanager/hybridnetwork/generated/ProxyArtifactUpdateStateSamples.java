// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.resourcemanager.hybridnetwork.models.ArtifactChangeState;
import com.azure.resourcemanager.hybridnetwork.models.ArtifactChangeStateProperties;
import com.azure.resourcemanager.hybridnetwork.models.ArtifactState;

/**
 * Samples for ProxyArtifact UpdateState.
 */
public final class ProxyArtifactUpdateStateSamples {
    /*
     * x-ms-original-file:
     * specification/hybridnetwork/resource-manager/Microsoft.HybridNetwork/stable/2023-09-01/examples/PureProxyArtifact
     * /ArtifactChangeState.json
     */
    /**
     * Sample code: Update an artifact state.
     * 
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void updateAnArtifactState(com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) {
        manager.proxyArtifacts().updateState("TestResourceGroup", "TestPublisher", "TestArtifactStoreName", "fedrbac",
            "1.0.0",
            new ArtifactChangeState()
                .withProperties(new ArtifactChangeStateProperties().withArtifactState(ArtifactState.DEPRECATED)),
            com.azure.core.util.Context.NONE);
    }
}
