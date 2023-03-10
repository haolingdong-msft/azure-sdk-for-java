// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

/** Samples for StreamingEndpoints AsyncOperation. */
public final class StreamingEndpointsAsyncOperationSamples {
    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/Streaming/stable/2022-11-01/examples/async-operation-result.json
     */
    /**
     * Sample code: Get the streaming endpoint operation status.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void getTheStreamingEndpointOperationStatus(
        com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager
            .streamingEndpoints()
            .asyncOperationWithResponse(
                "mediaresources",
                "slitestmedia10",
                "62e4d893-d233-4005-988e-a428d9f77076",
                com.azure.core.util.Context.NONE);
    }
}
