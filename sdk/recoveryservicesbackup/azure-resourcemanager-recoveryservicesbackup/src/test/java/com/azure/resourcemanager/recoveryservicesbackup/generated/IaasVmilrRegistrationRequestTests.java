// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.IaasVmilrRegistrationRequest;
import org.junit.jupiter.api.Assertions;

public final class IaasVmilrRegistrationRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IaasVmilrRegistrationRequest model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"IaasVMILRRegistrationRequest\",\"recoveryPointId\":\"qg\",\"virtualMachineId\":\"fnozoeoqbvjh\",\"initiatorName\":\"f\",\"renewExistingRegistration\":false}")
                .toObject(IaasVmilrRegistrationRequest.class);
        Assertions.assertEquals("qg", model.recoveryPointId());
        Assertions.assertEquals("fnozoeoqbvjh", model.virtualMachineId());
        Assertions.assertEquals("f", model.initiatorName());
        Assertions.assertEquals(false, model.renewExistingRegistration());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IaasVmilrRegistrationRequest model =
            new IaasVmilrRegistrationRequest()
                .withRecoveryPointId("qg")
                .withVirtualMachineId("fnozoeoqbvjh")
                .withInitiatorName("f")
                .withRenewExistingRegistration(false);
        model = BinaryData.fromObject(model).toObject(IaasVmilrRegistrationRequest.class);
        Assertions.assertEquals("qg", model.recoveryPointId());
        Assertions.assertEquals("fnozoeoqbvjh", model.virtualMachineId());
        Assertions.assertEquals("f", model.initiatorName());
        Assertions.assertEquals(false, model.renewExistingRegistration());
    }
}
