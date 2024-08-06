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

/**
 * Describes the properties of the Virtual Machine for which the restore point was created. The properties provided are
 * a subset and the snapshot of the overall Virtual Machine properties captured at the time of the restore point
 * creation.
 */
@Fluent
public final class RestorePointSourceMetadata implements JsonSerializable<RestorePointSourceMetadata> {
    /*
     * Gets the hardware profile.
     */
    private HardwareProfile hardwareProfile;

    /*
     * Gets the storage profile.
     */
    private RestorePointSourceVMStorageProfile storageProfile;

    /*
     * Gets the OS profile.
     */
    private OSProfile osProfile;

    /*
     * Gets the diagnostics profile.
     */
    private DiagnosticsProfile diagnosticsProfile;

    /*
     * Gets the license type, which is for bring your own license scenario.
     */
    private String licenseType;

    /*
     * Gets the virtual machine unique id.
     */
    private String vmId;

    /*
     * Gets the security profile.
     */
    private SecurityProfile securityProfile;

    /*
     * Location of the VM from which the restore point was created.
     */
    private String location;

    /*
     * UserData associated with the source VM for which restore point is captured, which is a base-64 encoded value.
     */
    private String userData;

    /*
     * HyperVGeneration of the source VM for which restore point is captured.
     */
    private HyperVGenerationTypes hyperVGeneration;

    /**
     * Creates an instance of RestorePointSourceMetadata class.
     */
    public RestorePointSourceMetadata() {
    }

    /**
     * Get the hardwareProfile property: Gets the hardware profile.
     * 
     * @return the hardwareProfile value.
     */
    public HardwareProfile hardwareProfile() {
        return this.hardwareProfile;
    }

    /**
     * Get the storageProfile property: Gets the storage profile.
     * 
     * @return the storageProfile value.
     */
    public RestorePointSourceVMStorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile property: Gets the storage profile.
     * 
     * @param storageProfile the storageProfile value to set.
     * @return the RestorePointSourceMetadata object itself.
     */
    public RestorePointSourceMetadata withStorageProfile(RestorePointSourceVMStorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the osProfile property: Gets the OS profile.
     * 
     * @return the osProfile value.
     */
    public OSProfile osProfile() {
        return this.osProfile;
    }

    /**
     * Get the diagnosticsProfile property: Gets the diagnostics profile.
     * 
     * @return the diagnosticsProfile value.
     */
    public DiagnosticsProfile diagnosticsProfile() {
        return this.diagnosticsProfile;
    }

    /**
     * Get the licenseType property: Gets the license type, which is for bring your own license scenario.
     * 
     * @return the licenseType value.
     */
    public String licenseType() {
        return this.licenseType;
    }

    /**
     * Get the vmId property: Gets the virtual machine unique id.
     * 
     * @return the vmId value.
     */
    public String vmId() {
        return this.vmId;
    }

    /**
     * Get the securityProfile property: Gets the security profile.
     * 
     * @return the securityProfile value.
     */
    public SecurityProfile securityProfile() {
        return this.securityProfile;
    }

    /**
     * Get the location property: Location of the VM from which the restore point was created.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the userData property: UserData associated with the source VM for which restore point is captured, which is a
     * base-64 encoded value.
     * 
     * @return the userData value.
     */
    public String userData() {
        return this.userData;
    }

    /**
     * Get the hyperVGeneration property: HyperVGeneration of the source VM for which restore point is captured.
     * 
     * @return the hyperVGeneration value.
     */
    public HyperVGenerationTypes hyperVGeneration() {
        return this.hyperVGeneration;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hardwareProfile() != null) {
            hardwareProfile().validate();
        }
        if (storageProfile() != null) {
            storageProfile().validate();
        }
        if (osProfile() != null) {
            osProfile().validate();
        }
        if (diagnosticsProfile() != null) {
            diagnosticsProfile().validate();
        }
        if (securityProfile() != null) {
            securityProfile().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("storageProfile", this.storageProfile);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RestorePointSourceMetadata from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RestorePointSourceMetadata if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RestorePointSourceMetadata.
     */
    public static RestorePointSourceMetadata fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RestorePointSourceMetadata deserializedRestorePointSourceMetadata = new RestorePointSourceMetadata();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("hardwareProfile".equals(fieldName)) {
                    deserializedRestorePointSourceMetadata.hardwareProfile = HardwareProfile.fromJson(reader);
                } else if ("storageProfile".equals(fieldName)) {
                    deserializedRestorePointSourceMetadata.storageProfile
                        = RestorePointSourceVMStorageProfile.fromJson(reader);
                } else if ("osProfile".equals(fieldName)) {
                    deserializedRestorePointSourceMetadata.osProfile = OSProfile.fromJson(reader);
                } else if ("diagnosticsProfile".equals(fieldName)) {
                    deserializedRestorePointSourceMetadata.diagnosticsProfile = DiagnosticsProfile.fromJson(reader);
                } else if ("licenseType".equals(fieldName)) {
                    deserializedRestorePointSourceMetadata.licenseType = reader.getString();
                } else if ("vmId".equals(fieldName)) {
                    deserializedRestorePointSourceMetadata.vmId = reader.getString();
                } else if ("securityProfile".equals(fieldName)) {
                    deserializedRestorePointSourceMetadata.securityProfile = SecurityProfile.fromJson(reader);
                } else if ("location".equals(fieldName)) {
                    deserializedRestorePointSourceMetadata.location = reader.getString();
                } else if ("userData".equals(fieldName)) {
                    deserializedRestorePointSourceMetadata.userData = reader.getString();
                } else if ("hyperVGeneration".equals(fieldName)) {
                    deserializedRestorePointSourceMetadata.hyperVGeneration
                        = HyperVGenerationTypes.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRestorePointSourceMetadata;
        });
    }
}
