// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.resourcemanager.cognitiveservices.models.CommitmentPeriod;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentPlanProperties;
import com.azure.resourcemanager.cognitiveservices.models.HostingModel;
import com.azure.resourcemanager.cognitiveservices.models.Sku;

/** Samples for CommitmentPlans CreateOrUpdatePlan. */
public final class CommitmentPlansCreateOrUpdatePlanSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/stable/2022-12-01/examples/CreateSharedCommitmentPlan.json
     */
    /**
     * Sample code: Create Commitment Plan.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void createCommitmentPlan(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager
            .commitmentPlans()
            .definePlan("commitmentPlanName")
            .withExistingResourceGroup("resourceGroupName")
            .withRegion("West US")
            .withKind("SpeechServices")
            .withSku(new Sku().withName("S0"))
            .withProperties(
                new CommitmentPlanProperties()
                    .withHostingModel(HostingModel.WEB)
                    .withPlanType("STT")
                    .withCurrent(new CommitmentPeriod().withTier("T1"))
                    .withAutoRenew(true))
            .create();
    }
}
