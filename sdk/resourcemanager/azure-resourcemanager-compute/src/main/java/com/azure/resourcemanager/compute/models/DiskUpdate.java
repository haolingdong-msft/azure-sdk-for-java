// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.compute.fluent.models.DiskUpdateProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Disk update resource. */
@Fluent
public final class DiskUpdate {
    /*
     * Disk resource update properties.
     */
    @JsonProperty(value = "properties")
    private DiskUpdateProperties innerProperties;

    /*
     * Resource tags
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * The disks sku name. Can be Standard_LRS, Premium_LRS, StandardSSD_LRS, UltraSSD_LRS, Premium_ZRS,
     * StandardSSD_ZRS, or PremiumV2_LRS.
     */
    @JsonProperty(value = "sku")
    private DiskSku sku;

    /**
     * Get the innerProperties property: Disk resource update properties.
     *
     * @return the innerProperties value.
     */
    private DiskUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the sku property: The disks sku name. Can be Standard_LRS, Premium_LRS, StandardSSD_LRS, UltraSSD_LRS,
     * Premium_ZRS, StandardSSD_ZRS, or PremiumV2_LRS.
     *
     * @return the sku value.
     */
    public DiskSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The disks sku name. Can be Standard_LRS, Premium_LRS, StandardSSD_LRS, UltraSSD_LRS,
     * Premium_ZRS, StandardSSD_ZRS, or PremiumV2_LRS.
     *
     * @param sku the sku value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withSku(DiskSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the osType property: the Operating System type.
     *
     * @return the osType value.
     */
    public OperatingSystemTypes osType() {
        return this.innerProperties() == null ? null : this.innerProperties().osType();
    }

    /**
     * Set the osType property: the Operating System type.
     *
     * @param osType the osType value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withOsType(OperatingSystemTypes osType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskUpdateProperties();
        }
        this.innerProperties().withOsType(osType);
        return this;
    }

    /**
     * Get the diskSizeGB property: If creationData.createOption is Empty, this field is mandatory and it indicates the
     * size of the disk to create. If this field is present for updates or creation with other options, it indicates a
     * resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's
     * size.
     *
     * @return the diskSizeGB value.
     */
    public Integer diskSizeGB() {
        return this.innerProperties() == null ? null : this.innerProperties().diskSizeGB();
    }

    /**
     * Set the diskSizeGB property: If creationData.createOption is Empty, this field is mandatory and it indicates the
     * size of the disk to create. If this field is present for updates or creation with other options, it indicates a
     * resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's
     * size.
     *
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withDiskSizeGB(Integer diskSizeGB) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskUpdateProperties();
        }
        this.innerProperties().withDiskSizeGB(diskSizeGB);
        return this;
    }

    /**
     * Get the encryptionSettingsCollection property: Encryption settings collection used be Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     *
     * @return the encryptionSettingsCollection value.
     */
    public EncryptionSettingsCollection encryptionSettingsCollection() {
        return this.innerProperties() == null ? null : this.innerProperties().encryptionSettingsCollection();
    }

    /**
     * Set the encryptionSettingsCollection property: Encryption settings collection used be Azure Disk Encryption, can
     * contain multiple encryption settings per disk or snapshot.
     *
     * @param encryptionSettingsCollection the encryptionSettingsCollection value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withEncryptionSettingsCollection(EncryptionSettingsCollection encryptionSettingsCollection) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskUpdateProperties();
        }
        this.innerProperties().withEncryptionSettingsCollection(encryptionSettingsCollection);
        return this;
    }

    /**
     * Get the diskIopsReadWrite property: The number of IOPS allowed for this disk; only settable for UltraSSD disks.
     * One operation can transfer between 4k and 256k bytes.
     *
     * @return the diskIopsReadWrite value.
     */
    public Long diskIopsReadWrite() {
        return this.innerProperties() == null ? null : this.innerProperties().diskIopsReadWrite();
    }

    /**
     * Set the diskIopsReadWrite property: The number of IOPS allowed for this disk; only settable for UltraSSD disks.
     * One operation can transfer between 4k and 256k bytes.
     *
     * @param diskIopsReadWrite the diskIopsReadWrite value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withDiskIopsReadWrite(Long diskIopsReadWrite) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskUpdateProperties();
        }
        this.innerProperties().withDiskIopsReadWrite(diskIopsReadWrite);
        return this;
    }

    /**
     * Get the diskMBpsReadWrite property: The bandwidth allowed for this disk; only settable for UltraSSD disks. MBps
     * means millions of bytes per second - MB here uses the ISO notation, of powers of 10.
     *
     * @return the diskMBpsReadWrite value.
     */
    public Long diskMBpsReadWrite() {
        return this.innerProperties() == null ? null : this.innerProperties().diskMBpsReadWrite();
    }

    /**
     * Set the diskMBpsReadWrite property: The bandwidth allowed for this disk; only settable for UltraSSD disks. MBps
     * means millions of bytes per second - MB here uses the ISO notation, of powers of 10.
     *
     * @param diskMBpsReadWrite the diskMBpsReadWrite value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withDiskMBpsReadWrite(Long diskMBpsReadWrite) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskUpdateProperties();
        }
        this.innerProperties().withDiskMBpsReadWrite(diskMBpsReadWrite);
        return this;
    }

    /**
     * Get the diskIopsReadOnly property: The total number of IOPS that will be allowed across all VMs mounting the
     * shared disk as ReadOnly. One operation can transfer between 4k and 256k bytes.
     *
     * @return the diskIopsReadOnly value.
     */
    public Long diskIopsReadOnly() {
        return this.innerProperties() == null ? null : this.innerProperties().diskIopsReadOnly();
    }

    /**
     * Set the diskIopsReadOnly property: The total number of IOPS that will be allowed across all VMs mounting the
     * shared disk as ReadOnly. One operation can transfer between 4k and 256k bytes.
     *
     * @param diskIopsReadOnly the diskIopsReadOnly value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withDiskIopsReadOnly(Long diskIopsReadOnly) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskUpdateProperties();
        }
        this.innerProperties().withDiskIopsReadOnly(diskIopsReadOnly);
        return this;
    }

    /**
     * Get the diskMBpsReadOnly property: The total throughput (MBps) that will be allowed across all VMs mounting the
     * shared disk as ReadOnly. MBps means millions of bytes per second - MB here uses the ISO notation, of powers of
     * 10.
     *
     * @return the diskMBpsReadOnly value.
     */
    public Long diskMBpsReadOnly() {
        return this.innerProperties() == null ? null : this.innerProperties().diskMBpsReadOnly();
    }

    /**
     * Set the diskMBpsReadOnly property: The total throughput (MBps) that will be allowed across all VMs mounting the
     * shared disk as ReadOnly. MBps means millions of bytes per second - MB here uses the ISO notation, of powers of
     * 10.
     *
     * @param diskMBpsReadOnly the diskMBpsReadOnly value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withDiskMBpsReadOnly(Long diskMBpsReadOnly) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskUpdateProperties();
        }
        this.innerProperties().withDiskMBpsReadOnly(diskMBpsReadOnly);
        return this;
    }

    /**
     * Get the maxShares property: The maximum number of VMs that can attach to the disk at the same time. Value greater
     * than one indicates a disk that can be mounted on multiple VMs at the same time.
     *
     * @return the maxShares value.
     */
    public Integer maxShares() {
        return this.innerProperties() == null ? null : this.innerProperties().maxShares();
    }

    /**
     * Set the maxShares property: The maximum number of VMs that can attach to the disk at the same time. Value greater
     * than one indicates a disk that can be mounted on multiple VMs at the same time.
     *
     * @param maxShares the maxShares value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withMaxShares(Integer maxShares) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskUpdateProperties();
        }
        this.innerProperties().withMaxShares(maxShares);
        return this;
    }

    /**
     * Get the encryption property: Encryption property can be used to encrypt data at rest with customer managed keys
     * or platform managed keys.
     *
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.innerProperties() == null ? null : this.innerProperties().encryption();
    }

    /**
     * Set the encryption property: Encryption property can be used to encrypt data at rest with customer managed keys
     * or platform managed keys.
     *
     * @param encryption the encryption value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withEncryption(Encryption encryption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskUpdateProperties();
        }
        this.innerProperties().withEncryption(encryption);
        return this;
    }

    /**
     * Get the networkAccessPolicy property: Policy for accessing the disk via network.
     *
     * @return the networkAccessPolicy value.
     */
    public NetworkAccessPolicy networkAccessPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().networkAccessPolicy();
    }

    /**
     * Set the networkAccessPolicy property: Policy for accessing the disk via network.
     *
     * @param networkAccessPolicy the networkAccessPolicy value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withNetworkAccessPolicy(NetworkAccessPolicy networkAccessPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskUpdateProperties();
        }
        this.innerProperties().withNetworkAccessPolicy(networkAccessPolicy);
        return this;
    }

    /**
     * Get the diskAccessId property: ARM id of the DiskAccess resource for using private endpoints on disks.
     *
     * @return the diskAccessId value.
     */
    public String diskAccessId() {
        return this.innerProperties() == null ? null : this.innerProperties().diskAccessId();
    }

    /**
     * Set the diskAccessId property: ARM id of the DiskAccess resource for using private endpoints on disks.
     *
     * @param diskAccessId the diskAccessId value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withDiskAccessId(String diskAccessId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskUpdateProperties();
        }
        this.innerProperties().withDiskAccessId(diskAccessId);
        return this;
    }

    /**
     * Get the tier property: Performance tier of the disk (e.g, P4, S10) as described here:
     * https://azure.microsoft.com/en-us/pricing/details/managed-disks/. Does not apply to Ultra disks.
     *
     * @return the tier value.
     */
    public String tier() {
        return this.innerProperties() == null ? null : this.innerProperties().tier();
    }

    /**
     * Set the tier property: Performance tier of the disk (e.g, P4, S10) as described here:
     * https://azure.microsoft.com/en-us/pricing/details/managed-disks/. Does not apply to Ultra disks.
     *
     * @param tier the tier value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withTier(String tier) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskUpdateProperties();
        }
        this.innerProperties().withTier(tier);
        return this;
    }

    /**
     * Get the burstingEnabled property: Set to true to enable bursting beyond the provisioned performance target of the
     * disk. Bursting is disabled by default. Does not apply to Ultra disks.
     *
     * @return the burstingEnabled value.
     */
    public Boolean burstingEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().burstingEnabled();
    }

    /**
     * Set the burstingEnabled property: Set to true to enable bursting beyond the provisioned performance target of the
     * disk. Bursting is disabled by default. Does not apply to Ultra disks.
     *
     * @param burstingEnabled the burstingEnabled value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withBurstingEnabled(Boolean burstingEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskUpdateProperties();
        }
        this.innerProperties().withBurstingEnabled(burstingEnabled);
        return this;
    }

    /**
     * Get the purchasePlan property: Purchase plan information to be added on the OS disk.
     *
     * @return the purchasePlan value.
     */
    public PurchasePlanAutoGenerated purchasePlan() {
        return this.innerProperties() == null ? null : this.innerProperties().purchasePlan();
    }

    /**
     * Set the purchasePlan property: Purchase plan information to be added on the OS disk.
     *
     * @param purchasePlan the purchasePlan value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withPurchasePlan(PurchasePlanAutoGenerated purchasePlan) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskUpdateProperties();
        }
        this.innerProperties().withPurchasePlan(purchasePlan);
        return this;
    }

    /**
     * Get the supportedCapabilities property: List of supported capabilities to be added on the OS disk.
     *
     * @return the supportedCapabilities value.
     */
    public SupportedCapabilities supportedCapabilities() {
        return this.innerProperties() == null ? null : this.innerProperties().supportedCapabilities();
    }

    /**
     * Set the supportedCapabilities property: List of supported capabilities to be added on the OS disk.
     *
     * @param supportedCapabilities the supportedCapabilities value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withSupportedCapabilities(SupportedCapabilities supportedCapabilities) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskUpdateProperties();
        }
        this.innerProperties().withSupportedCapabilities(supportedCapabilities);
        return this;
    }

    /**
     * Get the propertyUpdatesInProgress property: Properties of the disk for which update is pending.
     *
     * @return the propertyUpdatesInProgress value.
     */
    public PropertyUpdatesInProgress propertyUpdatesInProgress() {
        return this.innerProperties() == null ? null : this.innerProperties().propertyUpdatesInProgress();
    }

    /**
     * Get the supportsHibernation property: Indicates the OS on a disk supports hibernation.
     *
     * @return the supportsHibernation value.
     */
    public Boolean supportsHibernation() {
        return this.innerProperties() == null ? null : this.innerProperties().supportsHibernation();
    }

    /**
     * Set the supportsHibernation property: Indicates the OS on a disk supports hibernation.
     *
     * @param supportsHibernation the supportsHibernation value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withSupportsHibernation(Boolean supportsHibernation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskUpdateProperties();
        }
        this.innerProperties().withSupportsHibernation(supportsHibernation);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Policy for controlling export on the disk.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: Policy for controlling export on the disk.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskUpdateProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the dataAccessAuthMode property: Additional authentication requirements when exporting or uploading to a disk
     * or snapshot.
     *
     * @return the dataAccessAuthMode value.
     */
    public DataAccessAuthMode dataAccessAuthMode() {
        return this.innerProperties() == null ? null : this.innerProperties().dataAccessAuthMode();
    }

    /**
     * Set the dataAccessAuthMode property: Additional authentication requirements when exporting or uploading to a disk
     * or snapshot.
     *
     * @param dataAccessAuthMode the dataAccessAuthMode value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withDataAccessAuthMode(DataAccessAuthMode dataAccessAuthMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskUpdateProperties();
        }
        this.innerProperties().withDataAccessAuthMode(dataAccessAuthMode);
        return this;
    }

    /**
     * Get the optimizedForFrequentAttach property: Setting this property to true improves reliability and performance
     * of data disks that are frequently (more than 5 times a day) by detached from one virtual machine and attached to
     * another. This property should not be set for disks that are not detached and attached frequently as it causes the
     * disks to not align with the fault domain of the virtual machine.
     *
     * @return the optimizedForFrequentAttach value.
     */
    public Boolean optimizedForFrequentAttach() {
        return this.innerProperties() == null ? null : this.innerProperties().optimizedForFrequentAttach();
    }

    /**
     * Set the optimizedForFrequentAttach property: Setting this property to true improves reliability and performance
     * of data disks that are frequently (more than 5 times a day) by detached from one virtual machine and attached to
     * another. This property should not be set for disks that are not detached and attached frequently as it causes the
     * disks to not align with the fault domain of the virtual machine.
     *
     * @param optimizedForFrequentAttach the optimizedForFrequentAttach value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withOptimizedForFrequentAttach(Boolean optimizedForFrequentAttach) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiskUpdateProperties();
        }
        this.innerProperties().withOptimizedForFrequentAttach(optimizedForFrequentAttach);
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
        if (sku() != null) {
            sku().validate();
        }
    }
}
