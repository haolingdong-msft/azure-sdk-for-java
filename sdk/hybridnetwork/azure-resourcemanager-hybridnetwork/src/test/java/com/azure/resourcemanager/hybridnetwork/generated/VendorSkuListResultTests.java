// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridnetwork.fluent.models.VendorSkuInner;
import com.azure.resourcemanager.hybridnetwork.models.NetworkFunctionType;
import com.azure.resourcemanager.hybridnetwork.models.SkuDeploymentMode;
import com.azure.resourcemanager.hybridnetwork.models.SkuType;
import com.azure.resourcemanager.hybridnetwork.models.VendorSkuListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VendorSkuListResultTests {
    @Test
    public void testDeserialize() {
        VendorSkuListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"Canceled\",\"skuType\":\"EvolvedPacketCore\",\"deploymentMode\":\"Azure\",\"networkFunctionType\":\"ContainerizedNetworkFunction\",\"preview\":false},\"id\":\"qweykhmenev\",\"name\":\"yexfwh\",\"type\":\"bcibvyvdcsitynn\"},{\"properties\":{\"provisioningState\":\"Accepted\",\"skuType\":\"SDWAN\",\"deploymentMode\":\"Unknown\",\"networkFunctionType\":\"VirtualNetworkFunction\",\"preview\":false},\"id\":\"ypvhezrkg\",\"name\":\"hcjrefovgmk\",\"type\":\"sle\"},{\"properties\":{\"provisioningState\":\"Failed\",\"skuType\":\"Firewall\",\"deploymentMode\":\"Unknown\",\"networkFunctionType\":\"ContainerizedNetworkFunction\",\"preview\":false},\"id\":\"jcrcczsqpjhvmda\",\"name\":\"v\",\"type\":\"ysou\"}],\"nextLink\":\"e\"}")
                .toObject(VendorSkuListResult.class);
        Assertions.assertEquals(SkuType.EVOLVED_PACKET_CORE, model.value().get(0).skuType());
        Assertions.assertEquals(SkuDeploymentMode.AZURE, model.value().get(0).deploymentMode());
        Assertions
            .assertEquals(
                NetworkFunctionType.CONTAINERIZED_NETWORK_FUNCTION, model.value().get(0).networkFunctionType());
        Assertions.assertEquals(false, model.value().get(0).preview());
    }

    @Test
    public void testSerialize() {
        VendorSkuListResult model =
            new VendorSkuListResult()
                .withValue(
                    Arrays
                        .asList(
                            new VendorSkuInner()
                                .withSkuType(SkuType.EVOLVED_PACKET_CORE)
                                .withDeploymentMode(SkuDeploymentMode.AZURE)
                                .withNetworkFunctionType(NetworkFunctionType.CONTAINERIZED_NETWORK_FUNCTION)
                                .withPreview(false),
                            new VendorSkuInner()
                                .withSkuType(SkuType.SDWAN)
                                .withDeploymentMode(SkuDeploymentMode.UNKNOWN)
                                .withNetworkFunctionType(NetworkFunctionType.VIRTUAL_NETWORK_FUNCTION)
                                .withPreview(false),
                            new VendorSkuInner()
                                .withSkuType(SkuType.FIREWALL)
                                .withDeploymentMode(SkuDeploymentMode.UNKNOWN)
                                .withNetworkFunctionType(NetworkFunctionType.CONTAINERIZED_NETWORK_FUNCTION)
                                .withPreview(false)));
        model = BinaryData.fromObject(model).toObject(VendorSkuListResult.class);
        Assertions.assertEquals(SkuType.EVOLVED_PACKET_CORE, model.value().get(0).skuType());
        Assertions.assertEquals(SkuDeploymentMode.AZURE, model.value().get(0).deploymentMode());
        Assertions
            .assertEquals(
                NetworkFunctionType.CONTAINERIZED_NETWORK_FUNCTION, model.value().get(0).networkFunctionType());
        Assertions.assertEquals(false, model.value().get(0).preview());
    }
}
