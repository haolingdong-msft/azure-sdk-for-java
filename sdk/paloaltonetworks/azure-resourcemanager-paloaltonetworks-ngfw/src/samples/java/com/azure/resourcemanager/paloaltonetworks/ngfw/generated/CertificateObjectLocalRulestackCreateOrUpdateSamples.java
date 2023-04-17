// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.resourcemanager.paloaltonetworks.ngfw.models.BooleanEnum;

/** Samples for CertificateObjectLocalRulestack CreateOrUpdate. */
public final class CertificateObjectLocalRulestackCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/CertificateObjectLocalRulestack_CreateOrUpdate_MinimumSet_Gen.json
     */
    /**
     * Sample code: CertificateObjectLocalRulestack_CreateOrUpdate_MinimumSet_Gen.
     *
     * @param manager Entry point to NgfwManager.
     */
    public static void certificateObjectLocalRulestackCreateOrUpdateMinimumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.NgfwManager manager) {
        manager
            .certificateObjectLocalRulestacks()
            .define("armid1")
            .withExistingLocalRulestack("rgopenapi", "lrs1")
            .withCertificateSelfSigned(BooleanEnum.TRUE)
            .create();
    }

    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/CertificateObjectLocalRulestack_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: CertificateObjectLocalRulestack_CreateOrUpdate_MaximumSet_Gen.
     *
     * @param manager Entry point to NgfwManager.
     */
    public static void certificateObjectLocalRulestackCreateOrUpdateMaximumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.NgfwManager manager) {
        manager
            .certificateObjectLocalRulestacks()
            .define("armid1")
            .withExistingLocalRulestack("rgopenapi", "lrs1")
            .withCertificateSelfSigned(BooleanEnum.TRUE)
            .withCertificateSignerResourceId("")
            .withAuditComment("comment")
            .withDescription("description")
            .withEtag("2bf4a339-294d-4c25-b0b2-ef649e9f5c27")
            .create();
    }
}
