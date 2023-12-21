// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

/**
 * Samples for CaCertificates Delete.
 */
public final class CaCertificatesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2023-12-15-preview/examples/
     * CaCertificates_Delete.json
     */
    /**
     * Sample code: CaCertificates_Delete.
     * 
     * @param manager Entry point to EventGridManager.
     */
    public static void caCertificatesDelete(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager.caCertificates().delete("examplerg", "exampleNamespaceName1", "exampleCACertificateName1",
            com.azure.core.util.Context.NONE);
    }
}
