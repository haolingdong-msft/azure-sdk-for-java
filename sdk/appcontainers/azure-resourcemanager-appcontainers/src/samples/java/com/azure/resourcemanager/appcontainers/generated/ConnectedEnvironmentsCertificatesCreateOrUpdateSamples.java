// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.fluent.models.CertificateInner;
import com.azure.resourcemanager.appcontainers.models.CertificateProperties;

/** Samples for ConnectedEnvironmentsCertificates CreateOrUpdate. */
public final class ConnectedEnvironmentsCertificatesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/preview/2022-06-01-preview/examples/ConnectedEnvironmentsCertificate_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or Update Certificate.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void createOrUpdateCertificate(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .connectedEnvironmentsCertificates()
            .createOrUpdateWithResponse(
                "examplerg",
                "testcontainerenv",
                "certificate-firendly-name",
                new CertificateInner()
                    .withLocation("East US")
                    .withProperties(
                        new CertificateProperties()
                            .withPassword("private key password")
                            .withValue("PFX-or-PEM-blob".getBytes())),
                Context.NONE);
    }
}
