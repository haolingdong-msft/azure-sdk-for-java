// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Result of the post subvolume and action is to get metadata of the subvolume. */
@Fluent
public final class SubvolumeModelInner {
    /*
     * Resource Id
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Resource name
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Resource type
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * It represents the minimal properties of the subvolume.
     */
    @JsonProperty(value = "properties")
    private SubvolumeModelProperties innerProperties;

    /** Creates an instance of SubvolumeModelInner class. */
    public SubvolumeModelInner() {
    }

    /**
     * Get the id property: Resource Id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: Resource name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the innerProperties property: It represents the minimal properties of the subvolume.
     *
     * @return the innerProperties value.
     */
    private SubvolumeModelProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the path property: path
     *
     * <p>Path to the subvolume.
     *
     * @return the path value.
     */
    public String path() {
        return this.innerProperties() == null ? null : this.innerProperties().path();
    }

    /**
     * Set the path property: path
     *
     * <p>Path to the subvolume.
     *
     * @param path the path value to set.
     * @return the SubvolumeModelInner object itself.
     */
    public SubvolumeModelInner withPath(String path) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubvolumeModelProperties();
        }
        this.innerProperties().withPath(path);
        return this;
    }

    /**
     * Get the parentPath property: parentpath
     *
     * <p>Path to the parent subvolume.
     *
     * @return the parentPath value.
     */
    public String parentPath() {
        return this.innerProperties() == null ? null : this.innerProperties().parentPath();
    }

    /**
     * Set the parentPath property: parentpath
     *
     * <p>Path to the parent subvolume.
     *
     * @param parentPath the parentPath value to set.
     * @return the SubvolumeModelInner object itself.
     */
    public SubvolumeModelInner withParentPath(String parentPath) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubvolumeModelProperties();
        }
        this.innerProperties().withParentPath(parentPath);
        return this;
    }

    /**
     * Get the size property: size
     *
     * <p>Size of subvolume.
     *
     * @return the size value.
     */
    public Long size() {
        return this.innerProperties() == null ? null : this.innerProperties().size();
    }

    /**
     * Set the size property: size
     *
     * <p>Size of subvolume.
     *
     * @param size the size value to set.
     * @return the SubvolumeModelInner object itself.
     */
    public SubvolumeModelInner withSize(Long size) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubvolumeModelProperties();
        }
        this.innerProperties().withSize(size);
        return this;
    }

    /**
     * Get the bytesUsed property: bytesUsed
     *
     * <p>Bytes used.
     *
     * @return the bytesUsed value.
     */
    public Long bytesUsed() {
        return this.innerProperties() == null ? null : this.innerProperties().bytesUsed();
    }

    /**
     * Set the bytesUsed property: bytesUsed
     *
     * <p>Bytes used.
     *
     * @param bytesUsed the bytesUsed value to set.
     * @return the SubvolumeModelInner object itself.
     */
    public SubvolumeModelInner withBytesUsed(Long bytesUsed) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubvolumeModelProperties();
        }
        this.innerProperties().withBytesUsed(bytesUsed);
        return this;
    }

    /**
     * Get the permissions property: permissions
     *
     * <p>Permissions of the subvolume.
     *
     * @return the permissions value.
     */
    public String permissions() {
        return this.innerProperties() == null ? null : this.innerProperties().permissions();
    }

    /**
     * Set the permissions property: permissions
     *
     * <p>Permissions of the subvolume.
     *
     * @param permissions the permissions value to set.
     * @return the SubvolumeModelInner object itself.
     */
    public SubvolumeModelInner withPermissions(String permissions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubvolumeModelProperties();
        }
        this.innerProperties().withPermissions(permissions);
        return this;
    }

    /**
     * Get the creationTimestamp property: creationTimeStamp
     *
     * <p>Creation time and date.
     *
     * @return the creationTimestamp value.
     */
    public OffsetDateTime creationTimestamp() {
        return this.innerProperties() == null ? null : this.innerProperties().creationTimestamp();
    }

    /**
     * Set the creationTimestamp property: creationTimeStamp
     *
     * <p>Creation time and date.
     *
     * @param creationTimestamp the creationTimestamp value to set.
     * @return the SubvolumeModelInner object itself.
     */
    public SubvolumeModelInner withCreationTimestamp(OffsetDateTime creationTimestamp) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubvolumeModelProperties();
        }
        this.innerProperties().withCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * Get the accessedTimestamp property: accessedTimeStamp
     *
     * <p>Most recent access time and date.
     *
     * @return the accessedTimestamp value.
     */
    public OffsetDateTime accessedTimestamp() {
        return this.innerProperties() == null ? null : this.innerProperties().accessedTimestamp();
    }

    /**
     * Set the accessedTimestamp property: accessedTimeStamp
     *
     * <p>Most recent access time and date.
     *
     * @param accessedTimestamp the accessedTimestamp value to set.
     * @return the SubvolumeModelInner object itself.
     */
    public SubvolumeModelInner withAccessedTimestamp(OffsetDateTime accessedTimestamp) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubvolumeModelProperties();
        }
        this.innerProperties().withAccessedTimestamp(accessedTimestamp);
        return this;
    }

    /**
     * Get the modifiedTimestamp property: modifiedTimeStamp
     *
     * <p>Most recent modification time and date.
     *
     * @return the modifiedTimestamp value.
     */
    public OffsetDateTime modifiedTimestamp() {
        return this.innerProperties() == null ? null : this.innerProperties().modifiedTimestamp();
    }

    /**
     * Set the modifiedTimestamp property: modifiedTimeStamp
     *
     * <p>Most recent modification time and date.
     *
     * @param modifiedTimestamp the modifiedTimestamp value to set.
     * @return the SubvolumeModelInner object itself.
     */
    public SubvolumeModelInner withModifiedTimestamp(OffsetDateTime modifiedTimestamp) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubvolumeModelProperties();
        }
        this.innerProperties().withModifiedTimestamp(modifiedTimestamp);
        return this;
    }

    /**
     * Get the changedTimestamp property: changedTimeStamp
     *
     * <p>Most recent change time and date.
     *
     * @return the changedTimestamp value.
     */
    public OffsetDateTime changedTimestamp() {
        return this.innerProperties() == null ? null : this.innerProperties().changedTimestamp();
    }

    /**
     * Set the changedTimestamp property: changedTimeStamp
     *
     * <p>Most recent change time and date.
     *
     * @param changedTimestamp the changedTimestamp value to set.
     * @return the SubvolumeModelInner object itself.
     */
    public SubvolumeModelInner withChangedTimestamp(OffsetDateTime changedTimestamp) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubvolumeModelProperties();
        }
        this.innerProperties().withChangedTimestamp(changedTimestamp);
        return this;
    }

    /**
     * Get the provisioningState property: Azure lifecycle management.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: Azure lifecycle management.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the SubvolumeModelInner object itself.
     */
    public SubvolumeModelInner withProvisioningState(String provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubvolumeModelProperties();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
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
