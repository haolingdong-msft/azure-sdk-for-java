// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.L2IsolationDomainInner;
import java.util.Map;

/** An immutable client-side representation of L2IsolationDomain. */
public interface L2IsolationDomain {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the networkFabricId property: ARM Resource ID of the Network Fabric.
     *
     * @return the networkFabricId value.
     */
    String networkFabricId();

    /**
     * Gets the vlanId property: Vlan Identifier of the Network Fabric. Example: 501.
     *
     * @return the vlanId value.
     */
    int vlanId();

    /**
     * Gets the mtu property: Maximum transmission unit. Default value is 1500.
     *
     * @return the mtu value.
     */
    Integer mtu();

    /**
     * Gets the configurationState property: Configuration state of the resource.
     *
     * @return the configurationState value.
     */
    ConfigurationState configurationState();

    /**
     * Gets the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the administrativeState property: Administrative state of the resource.
     *
     * @return the administrativeState value.
     */
    AdministrativeState administrativeState();

    /**
     * Gets the annotation property: Switch configuration description.
     *
     * @return the annotation value.
     */
    String annotation();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.managednetworkfabric.fluent.models.L2IsolationDomainInner object.
     *
     * @return the inner object.
     */
    L2IsolationDomainInner innerModel();

    /** The entirety of the L2IsolationDomain definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithNetworkFabricId,
            DefinitionStages.WithVlanId,
            DefinitionStages.WithCreate {
    }

    /** The L2IsolationDomain definition stages. */
    interface DefinitionStages {
        /** The first stage of the L2IsolationDomain definition. */
        interface Blank extends WithLocation {
        }

        /** The stage of the L2IsolationDomain definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /** The stage of the L2IsolationDomain definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithNetworkFabricId withExistingResourceGroup(String resourceGroupName);
        }

        /** The stage of the L2IsolationDomain definition allowing to specify networkFabricId. */
        interface WithNetworkFabricId {
            /**
             * Specifies the networkFabricId property: ARM Resource ID of the Network Fabric..
             *
             * @param networkFabricId ARM Resource ID of the Network Fabric.
             * @return the next definition stage.
             */
            WithVlanId withNetworkFabricId(String networkFabricId);
        }

        /** The stage of the L2IsolationDomain definition allowing to specify vlanId. */
        interface WithVlanId {
            /**
             * Specifies the vlanId property: Vlan Identifier of the Network Fabric. Example: 501..
             *
             * @param vlanId Vlan Identifier of the Network Fabric. Example: 501.
             * @return the next definition stage.
             */
            WithCreate withVlanId(int vlanId);
        }

        /**
         * The stage of the L2IsolationDomain definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithMtu, DefinitionStages.WithAnnotation {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            L2IsolationDomain create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            L2IsolationDomain create(Context context);
        }

        /** The stage of the L2IsolationDomain definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /** The stage of the L2IsolationDomain definition allowing to specify mtu. */
        interface WithMtu {
            /**
             * Specifies the mtu property: Maximum transmission unit. Default value is 1500..
             *
             * @param mtu Maximum transmission unit. Default value is 1500.
             * @return the next definition stage.
             */
            WithCreate withMtu(Integer mtu);
        }

        /** The stage of the L2IsolationDomain definition allowing to specify annotation. */
        interface WithAnnotation {
            /**
             * Specifies the annotation property: Switch configuration description..
             *
             * @param annotation Switch configuration description.
             * @return the next definition stage.
             */
            WithCreate withAnnotation(String annotation);
        }
    }

    /**
     * Begins update for the L2IsolationDomain resource.
     *
     * @return the stage of resource update.
     */
    L2IsolationDomain.Update update();

    /** The template for L2IsolationDomain update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithMtu, UpdateStages.WithAnnotation {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        L2IsolationDomain apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        L2IsolationDomain apply(Context context);
    }

    /** The L2IsolationDomain update stages. */
    interface UpdateStages {
        /** The stage of the L2IsolationDomain update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /** The stage of the L2IsolationDomain update allowing to specify mtu. */
        interface WithMtu {
            /**
             * Specifies the mtu property: Maximum transmission unit. Default value is 1500..
             *
             * @param mtu Maximum transmission unit. Default value is 1500.
             * @return the next definition stage.
             */
            Update withMtu(Integer mtu);
        }

        /** The stage of the L2IsolationDomain update allowing to specify annotation. */
        interface WithAnnotation {
            /**
             * Specifies the annotation property: Switch configuration description..
             *
             * @param annotation Switch configuration description.
             * @return the next definition stage.
             */
            Update withAnnotation(String annotation);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    L2IsolationDomain refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    L2IsolationDomain refresh(Context context);

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Enables isolation domain across the fabric or on specified racks.
     *
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response for device updates.
     */
    CommonPostActionResponseForDeviceUpdate updateAdministrativeState(UpdateAdministrativeState body);

    /**
     * Implements the operation to the underlying resources.
     *
     * <p>Enables isolation domain across the fabric or on specified racks.
     *
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response for device updates.
     */
    CommonPostActionResponseForDeviceUpdate updateAdministrativeState(UpdateAdministrativeState body, Context context);

    /**
     * Validates the configuration of the resources.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the action validate configuration.
     */
    ValidateConfigurationResponse validateConfiguration();

    /**
     * Validates the configuration of the resources.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the action validate configuration.
     */
    ValidateConfigurationResponse validateConfiguration(Context context);

    /**
     * Execute the commit on the resources.
     *
     * <p>Commits the configuration of the given resources.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response for the state updates.
     */
    CommonPostActionResponseForStateUpdate commitConfiguration();

    /**
     * Execute the commit on the resources.
     *
     * <p>Commits the configuration of the given resources.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response for the state updates.
     */
    CommonPostActionResponseForStateUpdate commitConfiguration(Context context);
}
