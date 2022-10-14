// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Multi subnet ip configuration for an availability group listener. */
@Fluent
public final class MultiSubnetIpConfiguration {
    /*
     * Private IP address.
     */
    @JsonProperty(value = "privateIpAddress", required = true)
    private PrivateIpAddress privateIpAddress;

    /*
     * SQL virtual machine instance resource id that are enrolled into the availability group listener.
     */
    @JsonProperty(value = "sqlVirtualMachineInstance", required = true)
    private String sqlVirtualMachineInstance;

    /**
     * Get the privateIpAddress property: Private IP address.
     *
     * @return the privateIpAddress value.
     */
    public PrivateIpAddress privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Set the privateIpAddress property: Private IP address.
     *
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the MultiSubnetIpConfiguration object itself.
     */
    public MultiSubnetIpConfiguration withPrivateIpAddress(PrivateIpAddress privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * Get the sqlVirtualMachineInstance property: SQL virtual machine instance resource id that are enrolled into the
     * availability group listener.
     *
     * @return the sqlVirtualMachineInstance value.
     */
    public String sqlVirtualMachineInstance() {
        return this.sqlVirtualMachineInstance;
    }

    /**
     * Set the sqlVirtualMachineInstance property: SQL virtual machine instance resource id that are enrolled into the
     * availability group listener.
     *
     * @param sqlVirtualMachineInstance the sqlVirtualMachineInstance value to set.
     * @return the MultiSubnetIpConfiguration object itself.
     */
    public MultiSubnetIpConfiguration withSqlVirtualMachineInstance(String sqlVirtualMachineInstance) {
        this.sqlVirtualMachineInstance = sqlVirtualMachineInstance;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateIpAddress() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property privateIpAddress in model MultiSubnetIpConfiguration"));
        } else {
            privateIpAddress().validate();
        }
        if (sqlVirtualMachineInstance() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sqlVirtualMachineInstance in model MultiSubnetIpConfiguration"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MultiSubnetIpConfiguration.class);
}
