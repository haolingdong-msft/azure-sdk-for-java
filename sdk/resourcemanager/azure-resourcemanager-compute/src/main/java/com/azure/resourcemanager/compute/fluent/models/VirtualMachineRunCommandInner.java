// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.compute.models.RunCommandInputParameter;
import com.azure.resourcemanager.compute.models.VirtualMachineRunCommandInstanceView;
import com.azure.resourcemanager.compute.models.VirtualMachineRunCommandScriptSource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Describes a Virtual Machine run command. */
@Fluent
public final class VirtualMachineRunCommandInner extends Resource {
    /*
     * Describes the properties of a Virtual Machine run command.
     */
    @JsonProperty(value = "properties")
    private VirtualMachineRunCommandProperties innerProperties;

    /** Creates an instance of VirtualMachineRunCommandInner class. */
    public VirtualMachineRunCommandInner() {
    }

    /**
     * Get the innerProperties property: Describes the properties of a Virtual Machine run command.
     *
     * @return the innerProperties value.
     */
    private VirtualMachineRunCommandProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualMachineRunCommandInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualMachineRunCommandInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the source property: The source of the run command script.
     *
     * @return the source value.
     */
    public VirtualMachineRunCommandScriptSource source() {
        return this.innerProperties() == null ? null : this.innerProperties().source();
    }

    /**
     * Set the source property: The source of the run command script.
     *
     * @param source the source value to set.
     * @return the VirtualMachineRunCommandInner object itself.
     */
    public VirtualMachineRunCommandInner withSource(VirtualMachineRunCommandScriptSource source) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineRunCommandProperties();
        }
        this.innerProperties().withSource(source);
        return this;
    }

    /**
     * Get the parameters property: The parameters used by the script.
     *
     * @return the parameters value.
     */
    public List<RunCommandInputParameter> parameters() {
        return this.innerProperties() == null ? null : this.innerProperties().parameters();
    }

    /**
     * Set the parameters property: The parameters used by the script.
     *
     * @param parameters the parameters value to set.
     * @return the VirtualMachineRunCommandInner object itself.
     */
    public VirtualMachineRunCommandInner withParameters(List<RunCommandInputParameter> parameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineRunCommandProperties();
        }
        this.innerProperties().withParameters(parameters);
        return this;
    }

    /**
     * Get the protectedParameters property: The parameters used by the script.
     *
     * @return the protectedParameters value.
     */
    public List<RunCommandInputParameter> protectedParameters() {
        return this.innerProperties() == null ? null : this.innerProperties().protectedParameters();
    }

    /**
     * Set the protectedParameters property: The parameters used by the script.
     *
     * @param protectedParameters the protectedParameters value to set.
     * @return the VirtualMachineRunCommandInner object itself.
     */
    public VirtualMachineRunCommandInner withProtectedParameters(List<RunCommandInputParameter> protectedParameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineRunCommandProperties();
        }
        this.innerProperties().withProtectedParameters(protectedParameters);
        return this;
    }

    /**
     * Get the asyncExecution property: Optional. If set to true, provisioning will complete as soon as the script
     * starts and will not wait for script to complete.
     *
     * @return the asyncExecution value.
     */
    public Boolean asyncExecution() {
        return this.innerProperties() == null ? null : this.innerProperties().asyncExecution();
    }

    /**
     * Set the asyncExecution property: Optional. If set to true, provisioning will complete as soon as the script
     * starts and will not wait for script to complete.
     *
     * @param asyncExecution the asyncExecution value to set.
     * @return the VirtualMachineRunCommandInner object itself.
     */
    public VirtualMachineRunCommandInner withAsyncExecution(Boolean asyncExecution) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineRunCommandProperties();
        }
        this.innerProperties().withAsyncExecution(asyncExecution);
        return this;
    }

    /**
     * Get the runAsUser property: Specifies the user account on the VM when executing the run command.
     *
     * @return the runAsUser value.
     */
    public String runAsUser() {
        return this.innerProperties() == null ? null : this.innerProperties().runAsUser();
    }

    /**
     * Set the runAsUser property: Specifies the user account on the VM when executing the run command.
     *
     * @param runAsUser the runAsUser value to set.
     * @return the VirtualMachineRunCommandInner object itself.
     */
    public VirtualMachineRunCommandInner withRunAsUser(String runAsUser) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineRunCommandProperties();
        }
        this.innerProperties().withRunAsUser(runAsUser);
        return this;
    }

    /**
     * Get the runAsPassword property: Specifies the user account password on the VM when executing the run command.
     *
     * @return the runAsPassword value.
     */
    public String runAsPassword() {
        return this.innerProperties() == null ? null : this.innerProperties().runAsPassword();
    }

    /**
     * Set the runAsPassword property: Specifies the user account password on the VM when executing the run command.
     *
     * @param runAsPassword the runAsPassword value to set.
     * @return the VirtualMachineRunCommandInner object itself.
     */
    public VirtualMachineRunCommandInner withRunAsPassword(String runAsPassword) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineRunCommandProperties();
        }
        this.innerProperties().withRunAsPassword(runAsPassword);
        return this;
    }

    /**
     * Get the timeoutInSeconds property: The timeout in seconds to execute the run command.
     *
     * @return the timeoutInSeconds value.
     */
    public Integer timeoutInSeconds() {
        return this.innerProperties() == null ? null : this.innerProperties().timeoutInSeconds();
    }

    /**
     * Set the timeoutInSeconds property: The timeout in seconds to execute the run command.
     *
     * @param timeoutInSeconds the timeoutInSeconds value to set.
     * @return the VirtualMachineRunCommandInner object itself.
     */
    public VirtualMachineRunCommandInner withTimeoutInSeconds(Integer timeoutInSeconds) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineRunCommandProperties();
        }
        this.innerProperties().withTimeoutInSeconds(timeoutInSeconds);
        return this;
    }

    /**
     * Get the outputBlobUri property: Specifies the Azure storage blob where script output stream will be uploaded.
     *
     * @return the outputBlobUri value.
     */
    public String outputBlobUri() {
        return this.innerProperties() == null ? null : this.innerProperties().outputBlobUri();
    }

    /**
     * Set the outputBlobUri property: Specifies the Azure storage blob where script output stream will be uploaded.
     *
     * @param outputBlobUri the outputBlobUri value to set.
     * @return the VirtualMachineRunCommandInner object itself.
     */
    public VirtualMachineRunCommandInner withOutputBlobUri(String outputBlobUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineRunCommandProperties();
        }
        this.innerProperties().withOutputBlobUri(outputBlobUri);
        return this;
    }

    /**
     * Get the errorBlobUri property: Specifies the Azure storage blob where script error stream will be uploaded.
     *
     * @return the errorBlobUri value.
     */
    public String errorBlobUri() {
        return this.innerProperties() == null ? null : this.innerProperties().errorBlobUri();
    }

    /**
     * Set the errorBlobUri property: Specifies the Azure storage blob where script error stream will be uploaded.
     *
     * @param errorBlobUri the errorBlobUri value to set.
     * @return the VirtualMachineRunCommandInner object itself.
     */
    public VirtualMachineRunCommandInner withErrorBlobUri(String errorBlobUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineRunCommandProperties();
        }
        this.innerProperties().withErrorBlobUri(errorBlobUri);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the instanceView property: The virtual machine run command instance view.
     *
     * @return the instanceView value.
     */
    public VirtualMachineRunCommandInstanceView instanceView() {
        return this.innerProperties() == null ? null : this.innerProperties().instanceView();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
