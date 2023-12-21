// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mobilenetwork.fluent.models.PacketCoreControlPlaneInner;
import com.azure.resourcemanager.mobilenetwork.models.AsyncOperationStatus;
import com.azure.resourcemanager.mobilenetwork.models.BillingSku;
import com.azure.resourcemanager.mobilenetwork.models.CoreNetworkType;
import com.azure.resourcemanager.mobilenetwork.models.DiagnosticsUploadConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.EventHubConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.IdentityAndTagsObject;
import com.azure.resourcemanager.mobilenetwork.models.Installation;
import com.azure.resourcemanager.mobilenetwork.models.InterfaceProperties;
import com.azure.resourcemanager.mobilenetwork.models.LocalDiagnosticsAccessConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.ManagedServiceIdentity;
import com.azure.resourcemanager.mobilenetwork.models.PacketCoreControlPlane;
import com.azure.resourcemanager.mobilenetwork.models.PacketCoreControlPlaneCollectDiagnosticsPackage;
import com.azure.resourcemanager.mobilenetwork.models.PlatformConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.ProvisioningState;
import com.azure.resourcemanager.mobilenetwork.models.SignalingConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.SiteResourceId;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class PacketCoreControlPlaneImpl
    implements PacketCoreControlPlane, PacketCoreControlPlane.Definition, PacketCoreControlPlane.Update {
    private PacketCoreControlPlaneInner innerObject;

    private final com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ManagedServiceIdentity identity() {
        return this.innerModel().identity();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Installation installation() {
        return this.innerModel().installation();
    }

    public List<SiteResourceId> sites() {
        List<SiteResourceId> inner = this.innerModel().sites();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public PlatformConfiguration platform() {
        return this.innerModel().platform();
    }

    public CoreNetworkType coreNetworkTechnology() {
        return this.innerModel().coreNetworkTechnology();
    }

    public String version() {
        return this.innerModel().version();
    }

    public String installedVersion() {
        return this.innerModel().installedVersion();
    }

    public String rollbackVersion() {
        return this.innerModel().rollbackVersion();
    }

    public InterfaceProperties controlPlaneAccessInterface() {
        return this.innerModel().controlPlaneAccessInterface();
    }

    public List<String> controlPlaneAccessVirtualIpv4Addresses() {
        List<String> inner = this.innerModel().controlPlaneAccessVirtualIpv4Addresses();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public BillingSku sku() {
        return this.innerModel().sku();
    }

    public Integer ueMtu() {
        return this.innerModel().ueMtu();
    }

    public LocalDiagnosticsAccessConfiguration localDiagnosticsAccess() {
        return this.innerModel().localDiagnosticsAccess();
    }

    public DiagnosticsUploadConfiguration diagnosticsUpload() {
        return this.innerModel().diagnosticsUpload();
    }

    public EventHubConfiguration eventHub() {
        return this.innerModel().eventHub();
    }

    public SignalingConfiguration signaling() {
        return this.innerModel().signaling();
    }

    public Object interopSettings() {
        return this.innerModel().interopSettings();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public PacketCoreControlPlaneInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String packetCoreControlPlaneName;

    private IdentityAndTagsObject updateParameters;

    public PacketCoreControlPlaneImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public PacketCoreControlPlane create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPacketCoreControlPlanes()
                .createOrUpdate(resourceGroupName, packetCoreControlPlaneName, this.innerModel(), Context.NONE);
        return this;
    }

    public PacketCoreControlPlane create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPacketCoreControlPlanes()
                .createOrUpdate(resourceGroupName, packetCoreControlPlaneName, this.innerModel(), context);
        return this;
    }

    PacketCoreControlPlaneImpl(
        String name, com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager) {
        this.innerObject = new PacketCoreControlPlaneInner();
        this.serviceManager = serviceManager;
        this.packetCoreControlPlaneName = name;
    }

    public PacketCoreControlPlaneImpl update() {
        this.updateParameters = new IdentityAndTagsObject();
        return this;
    }

    public PacketCoreControlPlane apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPacketCoreControlPlanes()
                .updateTagsWithResponse(resourceGroupName, packetCoreControlPlaneName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public PacketCoreControlPlane apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPacketCoreControlPlanes()
                .updateTagsWithResponse(resourceGroupName, packetCoreControlPlaneName, updateParameters, context)
                .getValue();
        return this;
    }

    PacketCoreControlPlaneImpl(
        PacketCoreControlPlaneInner innerObject,
        com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.packetCoreControlPlaneName = Utils.getValueFromIdByName(innerObject.id(), "packetCoreControlPlanes");
    }

    public PacketCoreControlPlane refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPacketCoreControlPlanes()
                .getByResourceGroupWithResponse(resourceGroupName, packetCoreControlPlaneName, Context.NONE)
                .getValue();
        return this;
    }

    public PacketCoreControlPlane refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPacketCoreControlPlanes()
                .getByResourceGroupWithResponse(resourceGroupName, packetCoreControlPlaneName, context)
                .getValue();
        return this;
    }

    public AsyncOperationStatus rollback() {
        return serviceManager.packetCoreControlPlanes().rollback(resourceGroupName, packetCoreControlPlaneName);
    }

    public AsyncOperationStatus rollback(Context context) {
        return serviceManager
            .packetCoreControlPlanes()
            .rollback(resourceGroupName, packetCoreControlPlaneName, context);
    }

    public AsyncOperationStatus reinstall() {
        return serviceManager.packetCoreControlPlanes().reinstall(resourceGroupName, packetCoreControlPlaneName);
    }

    public AsyncOperationStatus reinstall(Context context) {
        return serviceManager
            .packetCoreControlPlanes()
            .reinstall(resourceGroupName, packetCoreControlPlaneName, context);
    }

    public AsyncOperationStatus collectDiagnosticsPackage(PacketCoreControlPlaneCollectDiagnosticsPackage parameters) {
        return serviceManager
            .packetCoreControlPlanes()
            .collectDiagnosticsPackage(resourceGroupName, packetCoreControlPlaneName, parameters);
    }

    public AsyncOperationStatus collectDiagnosticsPackage(
        PacketCoreControlPlaneCollectDiagnosticsPackage parameters, Context context) {
        return serviceManager
            .packetCoreControlPlanes()
            .collectDiagnosticsPackage(resourceGroupName, packetCoreControlPlaneName, parameters, context);
    }

    public PacketCoreControlPlaneImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public PacketCoreControlPlaneImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public PacketCoreControlPlaneImpl withSites(List<SiteResourceId> sites) {
        this.innerModel().withSites(sites);
        return this;
    }

    public PacketCoreControlPlaneImpl withPlatform(PlatformConfiguration platform) {
        this.innerModel().withPlatform(platform);
        return this;
    }

    public PacketCoreControlPlaneImpl withControlPlaneAccessInterface(InterfaceProperties controlPlaneAccessInterface) {
        this.innerModel().withControlPlaneAccessInterface(controlPlaneAccessInterface);
        return this;
    }

    public PacketCoreControlPlaneImpl withSku(BillingSku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public PacketCoreControlPlaneImpl withLocalDiagnosticsAccess(
        LocalDiagnosticsAccessConfiguration localDiagnosticsAccess) {
        this.innerModel().withLocalDiagnosticsAccess(localDiagnosticsAccess);
        return this;
    }

    public PacketCoreControlPlaneImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public PacketCoreControlPlaneImpl withIdentity(ManagedServiceIdentity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateParameters.withIdentity(identity);
            return this;
        }
    }

    public PacketCoreControlPlaneImpl withInstallation(Installation installation) {
        this.innerModel().withInstallation(installation);
        return this;
    }

    public PacketCoreControlPlaneImpl withCoreNetworkTechnology(CoreNetworkType coreNetworkTechnology) {
        this.innerModel().withCoreNetworkTechnology(coreNetworkTechnology);
        return this;
    }

    public PacketCoreControlPlaneImpl withVersion(String version) {
        this.innerModel().withVersion(version);
        return this;
    }

    public PacketCoreControlPlaneImpl withControlPlaneAccessVirtualIpv4Addresses(
        List<String> controlPlaneAccessVirtualIpv4Addresses) {
        this.innerModel().withControlPlaneAccessVirtualIpv4Addresses(controlPlaneAccessVirtualIpv4Addresses);
        return this;
    }

    public PacketCoreControlPlaneImpl withUeMtu(Integer ueMtu) {
        this.innerModel().withUeMtu(ueMtu);
        return this;
    }

    public PacketCoreControlPlaneImpl withDiagnosticsUpload(DiagnosticsUploadConfiguration diagnosticsUpload) {
        this.innerModel().withDiagnosticsUpload(diagnosticsUpload);
        return this;
    }

    public PacketCoreControlPlaneImpl withEventHub(EventHubConfiguration eventHub) {
        this.innerModel().withEventHub(eventHub);
        return this;
    }

    public PacketCoreControlPlaneImpl withSignaling(SignalingConfiguration signaling) {
        this.innerModel().withSignaling(signaling);
        return this;
    }

    public PacketCoreControlPlaneImpl withInteropSettings(Object interopSettings) {
        this.innerModel().withInteropSettings(interopSettings);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
