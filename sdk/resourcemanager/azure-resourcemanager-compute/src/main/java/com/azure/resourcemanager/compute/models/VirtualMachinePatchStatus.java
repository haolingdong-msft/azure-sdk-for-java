// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The status of virtual machine patch operations.
 */
@Fluent
public final class VirtualMachinePatchStatus implements JsonSerializable<VirtualMachinePatchStatus> {
    /*
     * The available patch summary of the latest assessment operation for the virtual machine.
     */
    private AvailablePatchSummary availablePatchSummary;

    /*
     * The installation summary of the latest installation operation for the virtual machine.
     */
    private LastPatchInstallationSummary lastPatchInstallationSummary;

    /*
     * The enablement status of the specified patchMode
     */
    private List<InstanceViewStatus> configurationStatuses;

    /**
     * Creates an instance of VirtualMachinePatchStatus class.
     */
    public VirtualMachinePatchStatus() {
    }

    /**
     * Get the availablePatchSummary property: The available patch summary of the latest assessment operation for the
     * virtual machine.
     * 
     * @return the availablePatchSummary value.
     */
    public AvailablePatchSummary availablePatchSummary() {
        return this.availablePatchSummary;
    }

    /**
     * Set the availablePatchSummary property: The available patch summary of the latest assessment operation for the
     * virtual machine.
     * 
     * @param availablePatchSummary the availablePatchSummary value to set.
     * @return the VirtualMachinePatchStatus object itself.
     */
    public VirtualMachinePatchStatus withAvailablePatchSummary(AvailablePatchSummary availablePatchSummary) {
        this.availablePatchSummary = availablePatchSummary;
        return this;
    }

    /**
     * Get the lastPatchInstallationSummary property: The installation summary of the latest installation operation for
     * the virtual machine.
     * 
     * @return the lastPatchInstallationSummary value.
     */
    public LastPatchInstallationSummary lastPatchInstallationSummary() {
        return this.lastPatchInstallationSummary;
    }

    /**
     * Set the lastPatchInstallationSummary property: The installation summary of the latest installation operation for
     * the virtual machine.
     * 
     * @param lastPatchInstallationSummary the lastPatchInstallationSummary value to set.
     * @return the VirtualMachinePatchStatus object itself.
     */
    public VirtualMachinePatchStatus
        withLastPatchInstallationSummary(LastPatchInstallationSummary lastPatchInstallationSummary) {
        this.lastPatchInstallationSummary = lastPatchInstallationSummary;
        return this;
    }

    /**
     * Get the configurationStatuses property: The enablement status of the specified patchMode.
     * 
     * @return the configurationStatuses value.
     */
    public List<InstanceViewStatus> configurationStatuses() {
        return this.configurationStatuses;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (availablePatchSummary() != null) {
            availablePatchSummary().validate();
        }
        if (lastPatchInstallationSummary() != null) {
            lastPatchInstallationSummary().validate();
        }
        if (configurationStatuses() != null) {
            configurationStatuses().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("availablePatchSummary", this.availablePatchSummary);
        jsonWriter.writeJsonField("lastPatchInstallationSummary", this.lastPatchInstallationSummary);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualMachinePatchStatus from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualMachinePatchStatus if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualMachinePatchStatus.
     */
    public static VirtualMachinePatchStatus fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualMachinePatchStatus deserializedVirtualMachinePatchStatus = new VirtualMachinePatchStatus();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("availablePatchSummary".equals(fieldName)) {
                    deserializedVirtualMachinePatchStatus.availablePatchSummary
                        = AvailablePatchSummary.fromJson(reader);
                } else if ("lastPatchInstallationSummary".equals(fieldName)) {
                    deserializedVirtualMachinePatchStatus.lastPatchInstallationSummary
                        = LastPatchInstallationSummary.fromJson(reader);
                } else if ("configurationStatuses".equals(fieldName)) {
                    List<InstanceViewStatus> configurationStatuses
                        = reader.readArray(reader1 -> InstanceViewStatus.fromJson(reader1));
                    deserializedVirtualMachinePatchStatus.configurationStatuses = configurationStatuses;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualMachinePatchStatus;
        });
    }
}
