// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.resourcemanager.appservice.fluent.models.AppServiceCertificateInner;
import com.azure.resourcemanager.appservice.models.AppServiceCertificateOrderPatchResource;
import com.azure.resourcemanager.appservice.models.CertificateProductType;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for AppServiceCertificateOrders Update.
 */
public final class AppServiceCertificateOrdersUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.CertificateRegistration/stable/2023-01-01/examples/
     * UpdateAppServiceCertificateOrder.json
     */
    /**
     * Sample code: Update Certificate order.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateCertificateOrder(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps().manager().serviceClient().getAppServiceCertificateOrders().updateWithResponse("testrg123",
            "SampleCertificateOrderName",
            new AppServiceCertificateOrderPatchResource()
                .withCertificates(mapOf("SampleCertName1",
                    new AppServiceCertificateInner()
                        .withKeyVaultId("fakeTokenPlaceholder").withKeyVaultSecretName("fakeTokenPlaceholder"),
                    "SampleCertName2",
                    new AppServiceCertificateInner().withKeyVaultId("fakeTokenPlaceholder")
                        .withKeyVaultSecretName("fakeTokenPlaceholder")))
                .withDistinguishedName("CN=SampleCustomDomain.com").withValidityInYears(2).withKeySize(2048)
                .withProductType(CertificateProductType.STANDARD_DOMAIN_VALIDATED_SSL).withAutoRenew(true),
            com.azure.core.util.Context.NONE);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
