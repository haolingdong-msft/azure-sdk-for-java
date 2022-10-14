// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.nginx.models.NginxConfigurationPackage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class NginxConfigurationPackageTests {
    @Test
    public void testDeserialize() {
        NginxConfigurationPackage model =
            BinaryData.fromString("{\"data\":\"czdzev\"}").toObject(NginxConfigurationPackage.class);
        Assertions.assertEquals("czdzev", model.data());
    }

    @Test
    public void testSerialize() {
        NginxConfigurationPackage model = new NginxConfigurationPackage().withData("czdzev");
        model = BinaryData.fromObject(model).toObject(NginxConfigurationPackage.class);
        Assertions.assertEquals("czdzev", model.data());
    }
}
