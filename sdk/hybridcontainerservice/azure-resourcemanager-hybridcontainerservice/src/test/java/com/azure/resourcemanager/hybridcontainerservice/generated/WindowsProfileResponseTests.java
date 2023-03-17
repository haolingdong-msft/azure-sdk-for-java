// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.models.LicenseType;
import com.azure.resourcemanager.hybridcontainerservice.models.WindowsProfileResponse;
import org.junit.jupiter.api.Assertions;

public final class WindowsProfileResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WindowsProfileResponse model =
            BinaryData
                .fromString("{\"adminUsername\":\"fmppe\",\"enableCsiProxy\":false,\"licenseType\":\"Windows_Server\"}")
                .toObject(WindowsProfileResponse.class);
        Assertions.assertEquals("fmppe", model.adminUsername());
        Assertions.assertEquals(false, model.enableCsiProxy());
        Assertions.assertEquals(LicenseType.WINDOWS_SERVER, model.licenseType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WindowsProfileResponse model =
            new WindowsProfileResponse()
                .withAdminUsername("fmppe")
                .withEnableCsiProxy(false)
                .withLicenseType(LicenseType.WINDOWS_SERVER);
        model = BinaryData.fromObject(model).toObject(WindowsProfileResponse.class);
        Assertions.assertEquals("fmppe", model.adminUsername());
        Assertions.assertEquals(false, model.enableCsiProxy());
        Assertions.assertEquals(LicenseType.WINDOWS_SERVER, model.licenseType());
    }
}
