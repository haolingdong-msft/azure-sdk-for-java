// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

/** Samples for KustoPools ListLanguageExtensions. */
public final class KustoPoolsListLanguageExtensionsSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/preview/2021-06-01-preview/examples/KustoPoolLanguageExtensionsList.json
     */
    /**
     * Sample code: KustoPoolListLanguageExtensions.
     *
     * @param manager Entry point to SynapseManager.
     */
    public static void kustoPoolListLanguageExtensions(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager
            .kustoPools()
            .listLanguageExtensions(
                "kustorptest", "kustoclusterrptest4", "kustorptest", com.azure.core.util.Context.NONE);
    }
}
