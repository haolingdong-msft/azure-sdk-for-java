// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.models.VpnPacketCaptureStopParameters;

/** Samples for VirtualNetworkGatewayConnections StopPacketCapture. */
public final class VirtualNetworkGatewayConnectionsStopPacketCaptureSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-08-01/examples/VirtualNetworkGatewayConnectionStopPacketCapture.json
     */
    /**
     * Sample code: Stop packet capture on virtual network gateway connection.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void stopPacketCaptureOnVirtualNetworkGatewayConnection(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getVirtualNetworkGatewayConnections()
            .stopPacketCapture(
                "rg1",
                "vpngwcn1",
                new VpnPacketCaptureStopParameters()
                    .withSasUrl(
                        "https://teststorage.blob.core.windows.net/?sv=2018-03-28&ss=bfqt&srt=sco&sp=rwdlacup&se=2019-09-13T07:44:05Z&st=2019-09-06T23:44:05Z&spr=https&sig=V1h9D1riltvZMI69d6ihENnFo%2FrCvTqGgjO2lf%2FVBhE%3D"),
                Context.NONE);
    }
}
