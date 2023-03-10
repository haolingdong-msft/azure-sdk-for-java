// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.H265VideoLayer;
import org.junit.jupiter.api.Assertions;

public final class H265VideoLayerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        H265VideoLayer model =
            BinaryData
                .fromString(
                    "{\"bitrate\":316416057,\"maxBitrate\":1651090930,\"bFrames\":1264679400,\"frameRate\":\"ao\",\"slices\":886290907,\"adaptiveBFrame\":false,\"width\":\"yyysfgdotcubi\",\"height\":\"uipwoqonmacje\",\"label\":\"izsh\"}")
                .toObject(H265VideoLayer.class);
        Assertions.assertEquals("yyysfgdotcubi", model.width());
        Assertions.assertEquals("uipwoqonmacje", model.height());
        Assertions.assertEquals("izsh", model.label());
        Assertions.assertEquals(316416057, model.bitrate());
        Assertions.assertEquals(1651090930, model.maxBitrate());
        Assertions.assertEquals(1264679400, model.bFrames());
        Assertions.assertEquals("ao", model.frameRate());
        Assertions.assertEquals(886290907, model.slices());
        Assertions.assertEquals(false, model.adaptiveBFrame());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        H265VideoLayer model =
            new H265VideoLayer()
                .withWidth("yyysfgdotcubi")
                .withHeight("uipwoqonmacje")
                .withLabel("izsh")
                .withBitrate(316416057)
                .withMaxBitrate(1651090930)
                .withBFrames(1264679400)
                .withFrameRate("ao")
                .withSlices(886290907)
                .withAdaptiveBFrame(false);
        model = BinaryData.fromObject(model).toObject(H265VideoLayer.class);
        Assertions.assertEquals("yyysfgdotcubi", model.width());
        Assertions.assertEquals("uipwoqonmacje", model.height());
        Assertions.assertEquals("izsh", model.label());
        Assertions.assertEquals(316416057, model.bitrate());
        Assertions.assertEquals(1651090930, model.maxBitrate());
        Assertions.assertEquals(1264679400, model.bFrames());
        Assertions.assertEquals("ao", model.frameRate());
        Assertions.assertEquals(886290907, model.slices());
        Assertions.assertEquals(false, model.adaptiveBFrame());
    }
}
