// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.VolumeMount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VolumeMountTests {
    @Test
    public void testDeserialize() {
        VolumeMount model =
            BinaryData
                .fromString("{\"volumeName\":\"btkuwhh\",\"mountPath\":\"ykojoxafnndlpic\"}")
                .toObject(VolumeMount.class);
        Assertions.assertEquals("btkuwhh", model.volumeName());
        Assertions.assertEquals("ykojoxafnndlpic", model.mountPath());
    }

    @Test
    public void testSerialize() {
        VolumeMount model = new VolumeMount().withVolumeName("btkuwhh").withMountPath("ykojoxafnndlpic");
        model = BinaryData.fromObject(model).toObject(VolumeMount.class);
        Assertions.assertEquals("btkuwhh", model.volumeName());
        Assertions.assertEquals("ykojoxafnndlpic", model.mountPath());
    }
}
