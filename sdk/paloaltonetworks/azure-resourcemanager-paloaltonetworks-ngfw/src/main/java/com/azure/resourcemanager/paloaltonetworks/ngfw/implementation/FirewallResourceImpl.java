// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.FirewallResourceInner;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.LogSettingsInner;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.AzureResourceManagerManagedIdentityProperties;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.BooleanEnum;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.DnsSettings;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.FirewallResource;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.FirewallResourceUpdate;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.FirewallResourceUpdateProperties;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.FrontendSetting;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.GlobalRulestackInfo;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.LogSettings;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.MarketplaceDetails;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.NetworkProfile;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.PanoramaConfig;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.PlanData;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ProvisioningState;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.RulestackDetails;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.SupportInfo;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class FirewallResourceImpl
    implements FirewallResource, FirewallResource.Definition, FirewallResource.Update {
    private FirewallResourceInner innerObject;

    private final com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager;

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

    public AzureResourceManagerManagedIdentityProperties identity() {
        return this.innerModel().identity();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String panEtag() {
        return this.innerModel().panEtag();
    }

    public NetworkProfile networkProfile() {
        return this.innerModel().networkProfile();
    }

    public BooleanEnum isPanoramaManaged() {
        return this.innerModel().isPanoramaManaged();
    }

    public PanoramaConfig panoramaConfig() {
        return this.innerModel().panoramaConfig();
    }

    public RulestackDetails associatedRulestack() {
        return this.innerModel().associatedRulestack();
    }

    public DnsSettings dnsSettings() {
        return this.innerModel().dnsSettings();
    }

    public List<FrontendSetting> frontEndSettings() {
        List<FrontendSetting> inner = this.innerModel().frontEndSettings();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public PlanData planData() {
        return this.innerModel().planData();
    }

    public MarketplaceDetails marketplaceDetails() {
        return this.innerModel().marketplaceDetails();
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

    public FirewallResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String firewallName;

    private FirewallResourceUpdate updateProperties;

    public FirewallResourceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public FirewallResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFirewalls()
                .createOrUpdate(resourceGroupName, firewallName, this.innerModel(), Context.NONE);
        return this;
    }

    public FirewallResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFirewalls()
                .createOrUpdate(resourceGroupName, firewallName, this.innerModel(), context);
        return this;
    }

    FirewallResourceImpl(
        String name, com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager) {
        this.innerObject = new FirewallResourceInner();
        this.serviceManager = serviceManager;
        this.firewallName = name;
    }

    public FirewallResourceImpl update() {
        this.updateProperties = new FirewallResourceUpdate();
        return this;
    }

    public FirewallResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFirewalls()
                .updateWithResponse(resourceGroupName, firewallName, updateProperties, Context.NONE)
                .getValue();
        return this;
    }

    public FirewallResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFirewalls()
                .updateWithResponse(resourceGroupName, firewallName, updateProperties, context)
                .getValue();
        return this;
    }

    FirewallResourceImpl(
        FirewallResourceInner innerObject,
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.firewallName = Utils.getValueFromIdByName(innerObject.id(), "firewalls");
    }

    public FirewallResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFirewalls()
                .getByResourceGroupWithResponse(resourceGroupName, firewallName, Context.NONE)
                .getValue();
        return this;
    }

    public FirewallResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFirewalls()
                .getByResourceGroupWithResponse(resourceGroupName, firewallName, context)
                .getValue();
        return this;
    }

    public Response<GlobalRulestackInfo> getGlobalRulestackWithResponse(Context context) {
        return serviceManager.firewalls().getGlobalRulestackWithResponse(resourceGroupName, firewallName, context);
    }

    public GlobalRulestackInfo getGlobalRulestack() {
        return serviceManager.firewalls().getGlobalRulestack(resourceGroupName, firewallName);
    }

    public Response<LogSettings> getLogProfileWithResponse(Context context) {
        return serviceManager.firewalls().getLogProfileWithResponse(resourceGroupName, firewallName, context);
    }

    public LogSettings getLogProfile() {
        return serviceManager.firewalls().getLogProfile(resourceGroupName, firewallName);
    }

    public Response<SupportInfo> getSupportInfoWithResponse(String email, Context context) {
        return serviceManager.firewalls().getSupportInfoWithResponse(resourceGroupName, firewallName, email, context);
    }

    public SupportInfo getSupportInfo() {
        return serviceManager.firewalls().getSupportInfo(resourceGroupName, firewallName);
    }

    public Response<Void> saveLogProfileWithResponse(LogSettingsInner logSettings, Context context) {
        return serviceManager
            .firewalls()
            .saveLogProfileWithResponse(resourceGroupName, firewallName, logSettings, context);
    }

    public void saveLogProfile() {
        serviceManager.firewalls().saveLogProfile(resourceGroupName, firewallName);
    }

    public FirewallResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public FirewallResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public FirewallResourceImpl withNetworkProfile(NetworkProfile networkProfile) {
        this.innerModel().withNetworkProfile(networkProfile);
        return this;
    }

    public FirewallResourceImpl withDnsSettings(DnsSettings dnsSettings) {
        this.innerModel().withDnsSettings(dnsSettings);
        return this;
    }

    public FirewallResourceImpl withPlanData(PlanData planData) {
        this.innerModel().withPlanData(planData);
        return this;
    }

    public FirewallResourceImpl withMarketplaceDetails(MarketplaceDetails marketplaceDetails) {
        this.innerModel().withMarketplaceDetails(marketplaceDetails);
        return this;
    }

    public FirewallResourceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateProperties.withTags(tags);
            return this;
        }
    }

    public FirewallResourceImpl withIdentity(AzureResourceManagerManagedIdentityProperties identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateProperties.withIdentity(identity);
            return this;
        }
    }

    public FirewallResourceImpl withPanEtag(String panEtag) {
        this.innerModel().withPanEtag(panEtag);
        return this;
    }

    public FirewallResourceImpl withIsPanoramaManaged(BooleanEnum isPanoramaManaged) {
        this.innerModel().withIsPanoramaManaged(isPanoramaManaged);
        return this;
    }

    public FirewallResourceImpl withPanoramaConfig(PanoramaConfig panoramaConfig) {
        this.innerModel().withPanoramaConfig(panoramaConfig);
        return this;
    }

    public FirewallResourceImpl withAssociatedRulestack(RulestackDetails associatedRulestack) {
        this.innerModel().withAssociatedRulestack(associatedRulestack);
        return this;
    }

    public FirewallResourceImpl withFrontEndSettings(List<FrontendSetting> frontEndSettings) {
        this.innerModel().withFrontEndSettings(frontEndSettings);
        return this;
    }

    public FirewallResourceImpl withProperties(FirewallResourceUpdateProperties properties) {
        this.updateProperties.withProperties(properties);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
