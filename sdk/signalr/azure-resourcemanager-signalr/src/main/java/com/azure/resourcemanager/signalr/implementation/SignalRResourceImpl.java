// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.signalr.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.signalr.fluent.models.SharedPrivateLinkResourceInner;
import com.azure.resourcemanager.signalr.fluent.models.SignalRResourceInner;
import com.azure.resourcemanager.signalr.models.ManagedIdentity;
import com.azure.resourcemanager.signalr.models.PrivateEndpointConnection;
import com.azure.resourcemanager.signalr.models.ProvisioningState;
import com.azure.resourcemanager.signalr.models.RegenerateKeyParameters;
import com.azure.resourcemanager.signalr.models.ResourceLogConfiguration;
import com.azure.resourcemanager.signalr.models.ResourceSku;
import com.azure.resourcemanager.signalr.models.ServerlessUpstreamSettings;
import com.azure.resourcemanager.signalr.models.ServiceKind;
import com.azure.resourcemanager.signalr.models.SharedPrivateLinkResource;
import com.azure.resourcemanager.signalr.models.SignalRCorsSettings;
import com.azure.resourcemanager.signalr.models.SignalRFeature;
import com.azure.resourcemanager.signalr.models.SignalRKeys;
import com.azure.resourcemanager.signalr.models.SignalRNetworkACLs;
import com.azure.resourcemanager.signalr.models.SignalRResource;
import com.azure.resourcemanager.signalr.models.SignalRTlsSettings;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class SignalRResourceImpl implements SignalRResource, SignalRResource.Definition, SignalRResource.Update {
    private SignalRResourceInner innerObject;

    private final com.azure.resourcemanager.signalr.SignalRManager serviceManager;

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

    public ResourceSku sku() {
        return this.innerModel().sku();
    }

    public ServiceKind kind() {
        return this.innerModel().kind();
    }

    public ManagedIdentity identity() {
        return this.innerModel().identity();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String externalIp() {
        return this.innerModel().externalIp();
    }

    public String hostname() {
        return this.innerModel().hostname();
    }

    public Integer publicPort() {
        return this.innerModel().publicPort();
    }

    public Integer serverPort() {
        return this.innerModel().serverPort();
    }

    public String version() {
        return this.innerModel().version();
    }

    public List<PrivateEndpointConnection> privateEndpointConnections() {
        List<PrivateEndpointConnectionInner> inner = this.innerModel().privateEndpointConnections();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<SharedPrivateLinkResource> sharedPrivateLinkResources() {
        List<SharedPrivateLinkResourceInner> inner = this.innerModel().sharedPrivateLinkResources();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new SharedPrivateLinkResourceImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public SignalRTlsSettings tls() {
        return this.innerModel().tls();
    }

    public String hostnamePrefix() {
        return this.innerModel().hostnamePrefix();
    }

    public List<SignalRFeature> features() {
        List<SignalRFeature> inner = this.innerModel().features();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ResourceLogConfiguration resourceLogConfiguration() {
        return this.innerModel().resourceLogConfiguration();
    }

    public SignalRCorsSettings cors() {
        return this.innerModel().cors();
    }

    public ServerlessUpstreamSettings upstream() {
        return this.innerModel().upstream();
    }

    public SignalRNetworkACLs networkACLs() {
        return this.innerModel().networkACLs();
    }

    public String publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
    }

    public Boolean disableLocalAuth() {
        return this.innerModel().disableLocalAuth();
    }

    public Boolean disableAadAuth() {
        return this.innerModel().disableAadAuth();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public SignalRResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.signalr.SignalRManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String resourceName;

    public SignalRResourceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public SignalRResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSignalRs()
                .createOrUpdate(resourceGroupName, resourceName, this.innerModel(), Context.NONE);
        return this;
    }

    public SignalRResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSignalRs()
                .createOrUpdate(resourceGroupName, resourceName, this.innerModel(), context);
        return this;
    }

    SignalRResourceImpl(String name, com.azure.resourcemanager.signalr.SignalRManager serviceManager) {
        this.innerObject = new SignalRResourceInner();
        this.serviceManager = serviceManager;
        this.resourceName = name;
    }

    public SignalRResourceImpl update() {
        return this;
    }

    public SignalRResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSignalRs()
                .update(resourceGroupName, resourceName, this.innerModel(), Context.NONE);
        return this;
    }

    public SignalRResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSignalRs()
                .update(resourceGroupName, resourceName, this.innerModel(), context);
        return this;
    }

    SignalRResourceImpl(
        SignalRResourceInner innerObject, com.azure.resourcemanager.signalr.SignalRManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.resourceName = Utils.getValueFromIdByName(innerObject.id(), "signalR");
    }

    public SignalRResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSignalRs()
                .getByResourceGroupWithResponse(resourceGroupName, resourceName, Context.NONE)
                .getValue();
        return this;
    }

    public SignalRResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSignalRs()
                .getByResourceGroupWithResponse(resourceGroupName, resourceName, context)
                .getValue();
        return this;
    }

    public SignalRKeys listKeys() {
        return serviceManager.signalRs().listKeys(resourceGroupName, resourceName);
    }

    public Response<SignalRKeys> listKeysWithResponse(Context context) {
        return serviceManager.signalRs().listKeysWithResponse(resourceGroupName, resourceName, context);
    }

    public SignalRKeys regenerateKey(RegenerateKeyParameters parameters) {
        return serviceManager.signalRs().regenerateKey(resourceGroupName, resourceName, parameters);
    }

    public SignalRKeys regenerateKey(RegenerateKeyParameters parameters, Context context) {
        return serviceManager.signalRs().regenerateKey(resourceGroupName, resourceName, parameters, context);
    }

    public void restart() {
        serviceManager.signalRs().restart(resourceGroupName, resourceName);
    }

    public void restart(Context context) {
        serviceManager.signalRs().restart(resourceGroupName, resourceName, context);
    }

    public SignalRResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public SignalRResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public SignalRResourceImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public SignalRResourceImpl withSku(ResourceSku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public SignalRResourceImpl withKind(ServiceKind kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public SignalRResourceImpl withIdentity(ManagedIdentity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public SignalRResourceImpl withTls(SignalRTlsSettings tls) {
        this.innerModel().withTls(tls);
        return this;
    }

    public SignalRResourceImpl withFeatures(List<SignalRFeature> features) {
        this.innerModel().withFeatures(features);
        return this;
    }

    public SignalRResourceImpl withResourceLogConfiguration(ResourceLogConfiguration resourceLogConfiguration) {
        this.innerModel().withResourceLogConfiguration(resourceLogConfiguration);
        return this;
    }

    public SignalRResourceImpl withCors(SignalRCorsSettings cors) {
        this.innerModel().withCors(cors);
        return this;
    }

    public SignalRResourceImpl withUpstream(ServerlessUpstreamSettings upstream) {
        this.innerModel().withUpstream(upstream);
        return this;
    }

    public SignalRResourceImpl withNetworkACLs(SignalRNetworkACLs networkACLs) {
        this.innerModel().withNetworkACLs(networkACLs);
        return this;
    }

    public SignalRResourceImpl withPublicNetworkAccess(String publicNetworkAccess) {
        this.innerModel().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    public SignalRResourceImpl withDisableLocalAuth(Boolean disableLocalAuth) {
        this.innerModel().withDisableLocalAuth(disableLocalAuth);
        return this;
    }

    public SignalRResourceImpl withDisableAadAuth(Boolean disableAadAuth) {
        this.innerModel().withDisableAadAuth(disableAadAuth);
        return this;
    }
}
