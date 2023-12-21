// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabric.models.ServerCertificateCommonName;
import com.azure.resourcemanager.servicefabric.models.ServerCertificateCommonNames;
import com.azure.resourcemanager.servicefabric.models.StoreName;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ServerCertificateCommonNamesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServerCertificateCommonNames model = BinaryData.fromString(
            "{\"commonNames\":[{\"certificateCommonName\":\"azlobcufpdznrbt\",\"certificateIssuerThumbprint\":\"qqjnqgl\"},{\"certificateCommonName\":\"qgn\",\"certificateIssuerThumbprint\":\"foooj\"},{\"certificateCommonName\":\"wifsq\",\"certificateIssuerThumbprint\":\"saagdf\"}],\"x509StoreName\":\"AuthRoot\"}")
            .toObject(ServerCertificateCommonNames.class);
        Assertions.assertEquals("azlobcufpdznrbt", model.commonNames().get(0).certificateCommonName());
        Assertions.assertEquals("qqjnqgl", model.commonNames().get(0).certificateIssuerThumbprint());
        Assertions.assertEquals(StoreName.AUTH_ROOT, model.x509StoreName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServerCertificateCommonNames model = new ServerCertificateCommonNames().withCommonNames(Arrays.asList(
            new ServerCertificateCommonName().withCertificateCommonName("azlobcufpdznrbt")
                .withCertificateIssuerThumbprint("qqjnqgl"),
            new ServerCertificateCommonName().withCertificateCommonName("qgn").withCertificateIssuerThumbprint("foooj"),
            new ServerCertificateCommonName().withCertificateCommonName("wifsq")
                .withCertificateIssuerThumbprint("saagdf")))
            .withX509StoreName(StoreName.AUTH_ROOT);
        model = BinaryData.fromObject(model).toObject(ServerCertificateCommonNames.class);
        Assertions.assertEquals("azlobcufpdznrbt", model.commonNames().get(0).certificateCommonName());
        Assertions.assertEquals("qqjnqgl", model.commonNames().get(0).certificateIssuerThumbprint());
        Assertions.assertEquals(StoreName.AUTH_ROOT, model.x509StoreName());
    }
}
