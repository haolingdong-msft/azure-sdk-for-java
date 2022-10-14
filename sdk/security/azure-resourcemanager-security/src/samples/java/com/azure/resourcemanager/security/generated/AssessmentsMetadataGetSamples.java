// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.Context;

/** Samples for AssessmentsMetadata Get. */
public final class AssessmentsMetadataGetSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2021-06-01/examples/AssessmentsMetadata/GetAssessmentsMetadata_example.json
     */
    /**
     * Sample code: Get security assessment metadata.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getSecurityAssessmentMetadata(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.assessmentsMetadatas().getWithResponse("21300918-b2e3-0346-785f-c77ff57d243b", Context.NONE);
    }
}
