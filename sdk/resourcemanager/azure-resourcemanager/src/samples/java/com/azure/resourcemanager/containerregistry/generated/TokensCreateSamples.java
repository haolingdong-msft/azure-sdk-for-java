// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

import com.azure.resourcemanager.containerregistry.fluent.models.TokenInner;
import com.azure.resourcemanager.containerregistry.models.TokenCertificate;
import com.azure.resourcemanager.containerregistry.models.TokenCertificateName;
import com.azure.resourcemanager.containerregistry.models.TokenCredentialsProperties;
import com.azure.resourcemanager.containerregistry.models.TokenStatus;
import java.util.Arrays;

/** Samples for Tokens Create. */
public final class TokensCreateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/TokenCreate.json
     */
    /**
     * Sample code: TokenCreate.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void tokenCreate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .containerRegistries()
            .manager()
            .serviceClient()
            .getTokens()
            .create(
                "myResourceGroup",
                "myRegistry",
                "myToken",
                new TokenInner()
                    .withScopeMapId(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.ContainerRegistry/registries/myRegistry/scopeMaps/myScopeMap")
                    .withCredentials(
                        new TokenCredentialsProperties()
                            .withCertificates(
                                Arrays
                                    .asList(
                                        new TokenCertificate()
                                            .withName(TokenCertificateName.CERTIFICATE1)
                                            .withEncodedPemCertificate("fakeTokenPlaceholder"))))
                    .withStatus(TokenStatus.DISABLED),
                com.azure.core.util.Context.NONE);
    }
}
