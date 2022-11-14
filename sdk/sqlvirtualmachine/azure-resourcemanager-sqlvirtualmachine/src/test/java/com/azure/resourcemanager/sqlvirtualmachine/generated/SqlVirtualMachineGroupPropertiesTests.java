// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sqlvirtualmachine.fluent.models.SqlVirtualMachineGroupProperties;
import com.azure.resourcemanager.sqlvirtualmachine.models.ClusterSubnetType;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlVmGroupImageSku;
import com.azure.resourcemanager.sqlvirtualmachine.models.WsfcDomainProfile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SqlVirtualMachineGroupPropertiesTests {
    @Test
    public void testDeserialize() {
        SqlVirtualMachineGroupProperties model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"g\",\"sqlImageOffer\":\"tnwu\",\"sqlImageSku\":\"Developer\",\"scaleType\":\"HA\",\"clusterManagerType\":\"WSFC\",\"clusterConfiguration\":\"Domainful\",\"wsfcDomainProfile\":{\"domainFqdn\":\"ckyfih\",\"ouPath\":\"idf\",\"clusterBootstrapAccount\":\"wdzuhtymwisd\",\"clusterOperatorAccount\":\"thwxmnteiwaopvkm\",\"sqlServiceAccount\":\"c\",\"fileShareWitnessPath\":\"xdcu\",\"storageAccountUrl\":\"fsrpymzidnse\",\"storageAccountPrimaryKey\":\"fakeStorageAccountPrimaryKeyPlaceholder\",\"clusterSubnetType\":\"MultiSubnet\"}}")
                .toObject(SqlVirtualMachineGroupProperties.class);
        Assertions.assertEquals("tnwu", model.sqlImageOffer());
        Assertions.assertEquals(SqlVmGroupImageSku.DEVELOPER, model.sqlImageSku());
        Assertions.assertEquals("ckyfih", model.wsfcDomainProfile().domainFqdn());
        Assertions.assertEquals("idf", model.wsfcDomainProfile().ouPath());
        Assertions.assertEquals("wdzuhtymwisd", model.wsfcDomainProfile().clusterBootstrapAccount());
        Assertions.assertEquals("thwxmnteiwaopvkm", model.wsfcDomainProfile().clusterOperatorAccount());
        Assertions.assertEquals("c", model.wsfcDomainProfile().sqlServiceAccount());
        Assertions.assertEquals("xdcu", model.wsfcDomainProfile().fileShareWitnessPath());
        Assertions.assertEquals("fsrpymzidnse", model.wsfcDomainProfile().storageAccountUrl());
        Assertions.assertEquals("fakeStorageAccountPrimaryKeyPlaceholder", model.wsfcDomainProfile().storageAccountPrimaryKey());
        Assertions.assertEquals(ClusterSubnetType.MULTI_SUBNET, model.wsfcDomainProfile().clusterSubnetType());
    }

    @Test
    public void testSerialize() {
        SqlVirtualMachineGroupProperties model =
            new SqlVirtualMachineGroupProperties()
                .withSqlImageOffer("tnwu")
                .withSqlImageSku(SqlVmGroupImageSku.DEVELOPER)
                .withWsfcDomainProfile(
                    new WsfcDomainProfile()
                        .withDomainFqdn("ckyfih")
                        .withOuPath("idf")
                        .withClusterBootstrapAccount("wdzuhtymwisd")
                        .withClusterOperatorAccount("thwxmnteiwaopvkm")
                        .withSqlServiceAccount("c")
                        .withFileShareWitnessPath("xdcu")
                        .withStorageAccountUrl("fsrpymzidnse")
                        .withStorageAccountPrimaryKey("fakeStorageAccountPrimaryKeyPlaceholder")
                        .withClusterSubnetType(ClusterSubnetType.MULTI_SUBNET));
        model = BinaryData.fromObject(model).toObject(SqlVirtualMachineGroupProperties.class);
        Assertions.assertEquals("tnwu", model.sqlImageOffer());
        Assertions.assertEquals(SqlVmGroupImageSku.DEVELOPER, model.sqlImageSku());
        Assertions.assertEquals("ckyfih", model.wsfcDomainProfile().domainFqdn());
        Assertions.assertEquals("idf", model.wsfcDomainProfile().ouPath());
        Assertions.assertEquals("wdzuhtymwisd", model.wsfcDomainProfile().clusterBootstrapAccount());
        Assertions.assertEquals("thwxmnteiwaopvkm", model.wsfcDomainProfile().clusterOperatorAccount());
        Assertions.assertEquals("c", model.wsfcDomainProfile().sqlServiceAccount());
        Assertions.assertEquals("xdcu", model.wsfcDomainProfile().fileShareWitnessPath());
        Assertions.assertEquals("fsrpymzidnse", model.wsfcDomainProfile().storageAccountUrl());
        Assertions.assertEquals("fakeStorageAccountPrimaryKeyPlaceholder", model.wsfcDomainProfile().storageAccountPrimaryKey());
        Assertions.assertEquals(ClusterSubnetType.MULTI_SUBNET, model.wsfcDomainProfile().clusterSubnetType());
    }
}
