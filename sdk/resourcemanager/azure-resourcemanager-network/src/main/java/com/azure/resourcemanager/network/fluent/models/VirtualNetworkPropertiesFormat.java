// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.AddressSpace;
import com.azure.resourcemanager.network.models.DhcpOptions;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.VirtualNetworkBgpCommunities;
import com.azure.resourcemanager.network.models.VirtualNetworkEncryption;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of the virtual network. */
@Fluent
public final class VirtualNetworkPropertiesFormat {
    /*
     * The AddressSpace that contains an array of IP address ranges that can be used by subnets.
     */
    @JsonProperty(value = "addressSpace")
    private AddressSpace addressSpace;

    /*
     * The dhcpOptions that contains an array of DNS servers available to VMs deployed in the virtual network.
     */
    @JsonProperty(value = "dhcpOptions")
    private DhcpOptions dhcpOptions;

    /*
     * The FlowTimeout value (in minutes) for the Virtual Network
     */
    @JsonProperty(value = "flowTimeoutInMinutes")
    private Integer flowTimeoutInMinutes;

    /*
     * A list of subnets in a Virtual Network.
     */
    @JsonProperty(value = "subnets")
    private List<SubnetInner> subnets;

    /*
     * A list of peerings in a Virtual Network.
     */
    @JsonProperty(value = "virtualNetworkPeerings")
    private List<VirtualNetworkPeeringInner> virtualNetworkPeerings;

    /*
     * The resourceGuid property of the Virtual Network resource.
     */
    @JsonProperty(value = "resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The provisioning state of the virtual network resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Indicates if DDoS protection is enabled for all the protected resources in the virtual network. It requires a
     * DDoS protection plan associated with the resource.
     */
    @JsonProperty(value = "enableDdosProtection")
    private Boolean enableDdosProtection;

    /*
     * Indicates if VM protection is enabled for all the subnets in the virtual network.
     */
    @JsonProperty(value = "enableVmProtection")
    private Boolean enableVmProtection;

    /*
     * The DDoS protection plan associated with the virtual network.
     */
    @JsonProperty(value = "ddosProtectionPlan")
    private SubResource ddosProtectionPlan;

    /*
     * Bgp Communities sent over ExpressRoute with each route corresponding to a prefix in this VNET.
     */
    @JsonProperty(value = "bgpCommunities")
    private VirtualNetworkBgpCommunities bgpCommunities;

    /*
     * Indicates if encryption is enabled on virtual network and if VM without encryption is allowed in encrypted VNet.
     */
    @JsonProperty(value = "encryption")
    private VirtualNetworkEncryption encryption;

    /*
     * Array of IpAllocation which reference this VNET.
     */
    @JsonProperty(value = "ipAllocations")
    private List<SubResource> ipAllocations;

    /** Creates an instance of VirtualNetworkPropertiesFormat class. */
    public VirtualNetworkPropertiesFormat() {
    }

    /**
     * Get the addressSpace property: The AddressSpace that contains an array of IP address ranges that can be used by
     * subnets.
     *
     * @return the addressSpace value.
     */
    public AddressSpace addressSpace() {
        return this.addressSpace;
    }

    /**
     * Set the addressSpace property: The AddressSpace that contains an array of IP address ranges that can be used by
     * subnets.
     *
     * @param addressSpace the addressSpace value to set.
     * @return the VirtualNetworkPropertiesFormat object itself.
     */
    public VirtualNetworkPropertiesFormat withAddressSpace(AddressSpace addressSpace) {
        this.addressSpace = addressSpace;
        return this;
    }

    /**
     * Get the dhcpOptions property: The dhcpOptions that contains an array of DNS servers available to VMs deployed in
     * the virtual network.
     *
     * @return the dhcpOptions value.
     */
    public DhcpOptions dhcpOptions() {
        return this.dhcpOptions;
    }

    /**
     * Set the dhcpOptions property: The dhcpOptions that contains an array of DNS servers available to VMs deployed in
     * the virtual network.
     *
     * @param dhcpOptions the dhcpOptions value to set.
     * @return the VirtualNetworkPropertiesFormat object itself.
     */
    public VirtualNetworkPropertiesFormat withDhcpOptions(DhcpOptions dhcpOptions) {
        this.dhcpOptions = dhcpOptions;
        return this;
    }

    /**
     * Get the flowTimeoutInMinutes property: The FlowTimeout value (in minutes) for the Virtual Network.
     *
     * @return the flowTimeoutInMinutes value.
     */
    public Integer flowTimeoutInMinutes() {
        return this.flowTimeoutInMinutes;
    }

    /**
     * Set the flowTimeoutInMinutes property: The FlowTimeout value (in minutes) for the Virtual Network.
     *
     * @param flowTimeoutInMinutes the flowTimeoutInMinutes value to set.
     * @return the VirtualNetworkPropertiesFormat object itself.
     */
    public VirtualNetworkPropertiesFormat withFlowTimeoutInMinutes(Integer flowTimeoutInMinutes) {
        this.flowTimeoutInMinutes = flowTimeoutInMinutes;
        return this;
    }

    /**
     * Get the subnets property: A list of subnets in a Virtual Network.
     *
     * @return the subnets value.
     */
    public List<SubnetInner> subnets() {
        return this.subnets;
    }

    /**
     * Set the subnets property: A list of subnets in a Virtual Network.
     *
     * @param subnets the subnets value to set.
     * @return the VirtualNetworkPropertiesFormat object itself.
     */
    public VirtualNetworkPropertiesFormat withSubnets(List<SubnetInner> subnets) {
        this.subnets = subnets;
        return this;
    }

    /**
     * Get the virtualNetworkPeerings property: A list of peerings in a Virtual Network.
     *
     * @return the virtualNetworkPeerings value.
     */
    public List<VirtualNetworkPeeringInner> virtualNetworkPeerings() {
        return this.virtualNetworkPeerings;
    }

    /**
     * Set the virtualNetworkPeerings property: A list of peerings in a Virtual Network.
     *
     * @param virtualNetworkPeerings the virtualNetworkPeerings value to set.
     * @return the VirtualNetworkPropertiesFormat object itself.
     */
    public VirtualNetworkPropertiesFormat withVirtualNetworkPeerings(
        List<VirtualNetworkPeeringInner> virtualNetworkPeerings) {
        this.virtualNetworkPeerings = virtualNetworkPeerings;
        return this;
    }

    /**
     * Get the resourceGuid property: The resourceGuid property of the Virtual Network resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the virtual network resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the enableDdosProtection property: Indicates if DDoS protection is enabled for all the protected resources in
     * the virtual network. It requires a DDoS protection plan associated with the resource.
     *
     * @return the enableDdosProtection value.
     */
    public Boolean enableDdosProtection() {
        return this.enableDdosProtection;
    }

    /**
     * Set the enableDdosProtection property: Indicates if DDoS protection is enabled for all the protected resources in
     * the virtual network. It requires a DDoS protection plan associated with the resource.
     *
     * @param enableDdosProtection the enableDdosProtection value to set.
     * @return the VirtualNetworkPropertiesFormat object itself.
     */
    public VirtualNetworkPropertiesFormat withEnableDdosProtection(Boolean enableDdosProtection) {
        this.enableDdosProtection = enableDdosProtection;
        return this;
    }

    /**
     * Get the enableVmProtection property: Indicates if VM protection is enabled for all the subnets in the virtual
     * network.
     *
     * @return the enableVmProtection value.
     */
    public Boolean enableVmProtection() {
        return this.enableVmProtection;
    }

    /**
     * Set the enableVmProtection property: Indicates if VM protection is enabled for all the subnets in the virtual
     * network.
     *
     * @param enableVmProtection the enableVmProtection value to set.
     * @return the VirtualNetworkPropertiesFormat object itself.
     */
    public VirtualNetworkPropertiesFormat withEnableVmProtection(Boolean enableVmProtection) {
        this.enableVmProtection = enableVmProtection;
        return this;
    }

    /**
     * Get the ddosProtectionPlan property: The DDoS protection plan associated with the virtual network.
     *
     * @return the ddosProtectionPlan value.
     */
    public SubResource ddosProtectionPlan() {
        return this.ddosProtectionPlan;
    }

    /**
     * Set the ddosProtectionPlan property: The DDoS protection plan associated with the virtual network.
     *
     * @param ddosProtectionPlan the ddosProtectionPlan value to set.
     * @return the VirtualNetworkPropertiesFormat object itself.
     */
    public VirtualNetworkPropertiesFormat withDdosProtectionPlan(SubResource ddosProtectionPlan) {
        this.ddosProtectionPlan = ddosProtectionPlan;
        return this;
    }

    /**
     * Get the bgpCommunities property: Bgp Communities sent over ExpressRoute with each route corresponding to a prefix
     * in this VNET.
     *
     * @return the bgpCommunities value.
     */
    public VirtualNetworkBgpCommunities bgpCommunities() {
        return this.bgpCommunities;
    }

    /**
     * Set the bgpCommunities property: Bgp Communities sent over ExpressRoute with each route corresponding to a prefix
     * in this VNET.
     *
     * @param bgpCommunities the bgpCommunities value to set.
     * @return the VirtualNetworkPropertiesFormat object itself.
     */
    public VirtualNetworkPropertiesFormat withBgpCommunities(VirtualNetworkBgpCommunities bgpCommunities) {
        this.bgpCommunities = bgpCommunities;
        return this;
    }

    /**
     * Get the encryption property: Indicates if encryption is enabled on virtual network and if VM without encryption
     * is allowed in encrypted VNet.
     *
     * @return the encryption value.
     */
    public VirtualNetworkEncryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: Indicates if encryption is enabled on virtual network and if VM without encryption
     * is allowed in encrypted VNet.
     *
     * @param encryption the encryption value to set.
     * @return the VirtualNetworkPropertiesFormat object itself.
     */
    public VirtualNetworkPropertiesFormat withEncryption(VirtualNetworkEncryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the ipAllocations property: Array of IpAllocation which reference this VNET.
     *
     * @return the ipAllocations value.
     */
    public List<SubResource> ipAllocations() {
        return this.ipAllocations;
    }

    /**
     * Set the ipAllocations property: Array of IpAllocation which reference this VNET.
     *
     * @param ipAllocations the ipAllocations value to set.
     * @return the VirtualNetworkPropertiesFormat object itself.
     */
    public VirtualNetworkPropertiesFormat withIpAllocations(List<SubResource> ipAllocations) {
        this.ipAllocations = ipAllocations;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (addressSpace() != null) {
            addressSpace().validate();
        }
        if (dhcpOptions() != null) {
            dhcpOptions().validate();
        }
        if (subnets() != null) {
            subnets().forEach(e -> e.validate());
        }
        if (virtualNetworkPeerings() != null) {
            virtualNetworkPeerings().forEach(e -> e.validate());
        }
        if (bgpCommunities() != null) {
            bgpCommunities().validate();
        }
        if (encryption() != null) {
            encryption().validate();
        }
    }
}
