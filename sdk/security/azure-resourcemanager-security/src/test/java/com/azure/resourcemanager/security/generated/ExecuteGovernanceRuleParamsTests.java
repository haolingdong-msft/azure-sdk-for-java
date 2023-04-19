// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.ExecuteGovernanceRuleParams;
import org.junit.jupiter.api.Assertions;

public final class ExecuteGovernanceRuleParamsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExecuteGovernanceRuleParams model =
            BinaryData.fromString("{\"override\":true}").toObject(ExecuteGovernanceRuleParams.class);
        Assertions.assertEquals(true, model.override());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExecuteGovernanceRuleParams model = new ExecuteGovernanceRuleParams().withOverride(true);
        model = BinaryData.fromObject(model).toObject(ExecuteGovernanceRuleParams.class);
        Assertions.assertEquals(true, model.override());
    }
}
