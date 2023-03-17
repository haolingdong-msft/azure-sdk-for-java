// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.Dimension;
import org.junit.jupiter.api.Assertions;

public final class DimensionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Dimension model =
            BinaryData
                .fromString("{\"name\":\"ifiyipjxsqwpgrj\",\"displayName\":\"norcjxvsnbyxqab\"}")
                .toObject(Dimension.class);
        Assertions.assertEquals("ifiyipjxsqwpgrj", model.name());
        Assertions.assertEquals("norcjxvsnbyxqab", model.displayName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Dimension model = new Dimension().withName("ifiyipjxsqwpgrj").withDisplayName("norcjxvsnbyxqab");
        model = BinaryData.fromObject(model).toObject(Dimension.class);
        Assertions.assertEquals("ifiyipjxsqwpgrj", model.name());
        Assertions.assertEquals("norcjxvsnbyxqab", model.displayName());
    }
}
