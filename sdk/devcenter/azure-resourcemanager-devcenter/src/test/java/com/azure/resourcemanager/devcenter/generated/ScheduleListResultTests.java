// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.ScheduleListResult;
import org.junit.jupiter.api.Test;

public final class ScheduleListResultTests {
    @Test
    public void testDeserialize() {
        ScheduleListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"dlmkkzevdl\",\"type\":\"StopDevBox\",\"frequency\":\"Daily\",\"time\":\"dsttwvo\",\"timeZone\":\"bbejdcngqqm\",\"state\":\"Enabled\"},\"id\":\"fgmjzrwrdgrt\",\"name\":\"aenuuz\",\"type\":\"opbminrfdw\"},{\"properties\":{\"provisioningState\":\"hhziuief\",\"type\":\"StopDevBox\",\"frequency\":\"Daily\",\"time\":\"smlmzqhoftrm\",\"timeZone\":\"qu\",\"state\":\"Disabled\"},\"id\":\"icslfaoq\",\"name\":\"piyylhalnswhccsp\",\"type\":\"kaivwit\"},{\"properties\":{\"provisioningState\":\"ywuggwoluhcz\",\"type\":\"StopDevBox\",\"frequency\":\"Daily\",\"time\":\"i\",\"timeZone\":\"brgz\",\"state\":\"Disabled\"},\"id\":\"weyp\",\"name\":\"w\",\"type\":\"xggicccnxqhuexmk\"}],\"nextLink\":\"lstvlzywe\"}")
                .toObject(ScheduleListResult.class);
    }

    @Test
    public void testSerialize() {
        ScheduleListResult model = new ScheduleListResult();
        model = BinaryData.fromObject(model).toObject(ScheduleListResult.class);
    }
}
