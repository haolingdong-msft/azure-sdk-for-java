// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.redisenterprise.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.redisenterprise.models.PrivateEndpoint;
import com.azure.resourcemanager.redisenterprise.models.PrivateEndpointConnectionListResult;
import com.azure.resourcemanager.redisenterprise.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.redisenterprise.models.PrivateLinkServiceConnectionState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"privateEndpoint\":{\"id\":\"dehxnltyfsoppu\"},\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"nzwdejba\",\"actionsRequired\":\"rxzdmohctbqvudwx\"},\"provisioningState\":\"Creating\"},\"id\":\"nvowgujju\",\"name\":\"wdkcglhsl\",\"type\":\"zj\"},{\"properties\":{\"privateEndpoint\":{\"id\":\"dtjixhb\"},\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"qweykhmenev\",\"actionsRequired\":\"exfwhy\"},\"provisioningState\":\"Succeeded\"},\"id\":\"bvyvdcsity\",\"name\":\"naamde\",\"type\":\"tehfiqscjeypvh\"}]}")
            .toObject(PrivateEndpointConnectionListResult.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.PENDING,
            model.value().get(0).privateLinkServiceConnectionState().status());
        Assertions.assertEquals("nzwdejba", model.value().get(0).privateLinkServiceConnectionState().description());
        Assertions.assertEquals("rxzdmohctbqvudwx",
            model.value().get(0).privateLinkServiceConnectionState().actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionListResult model
            = new PrivateEndpointConnectionListResult()
                .withValue(Arrays.asList(
                    new PrivateEndpointConnectionInner().withPrivateEndpoint(new PrivateEndpoint())
                        .withPrivateLinkServiceConnectionState(new PrivateLinkServiceConnectionState()
                            .withStatus(PrivateEndpointServiceConnectionStatus.PENDING)
                            .withDescription("nzwdejba")
                            .withActionsRequired("rxzdmohctbqvudwx")),
                    new PrivateEndpointConnectionInner().withPrivateEndpoint(new PrivateEndpoint())
                        .withPrivateLinkServiceConnectionState(new PrivateLinkServiceConnectionState()
                            .withStatus(PrivateEndpointServiceConnectionStatus.REJECTED)
                            .withDescription("qweykhmenev")
                            .withActionsRequired("exfwhy"))));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionListResult.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.PENDING,
            model.value().get(0).privateLinkServiceConnectionState().status());
        Assertions.assertEquals("nzwdejba", model.value().get(0).privateLinkServiceConnectionState().description());
        Assertions.assertEquals("rxzdmohctbqvudwx",
            model.value().get(0).privateLinkServiceConnectionState().actionsRequired());
    }
}
