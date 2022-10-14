// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.kusto.fluent.models.ManagedPrivateEndpointInner;

/** An immutable client-side representation of ManagedPrivateEndpoint. */
public interface ManagedPrivateEndpoint {
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
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the privateLinkResourceId property: The ARM resource ID of the resource for which the managed private
     * endpoint is created.
     *
     * @return the privateLinkResourceId value.
     */
    String privateLinkResourceId();

    /**
     * Gets the privateLinkResourceRegion property: The region of the resource to which the managed private endpoint is
     * created.
     *
     * @return the privateLinkResourceRegion value.
     */
    String privateLinkResourceRegion();

    /**
     * Gets the groupId property: The groupId in which the managed private endpoint is created.
     *
     * @return the groupId value.
     */
    String groupId();

    /**
     * Gets the requestMessage property: The user request message.
     *
     * @return the requestMessage value.
     */
    String requestMessage();

    /**
     * Gets the provisioningState property: The provisioned state of the resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.kusto.fluent.models.ManagedPrivateEndpointInner object.
     *
     * @return the inner object.
     */
    ManagedPrivateEndpointInner innerModel();

    /** The entirety of the ManagedPrivateEndpoint definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The ManagedPrivateEndpoint definition stages. */
    interface DefinitionStages {
        /** The first stage of the ManagedPrivateEndpoint definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ManagedPrivateEndpoint definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, clusterName.
             *
             * @param resourceGroupName The name of the resource group containing the Kusto cluster.
             * @param clusterName The name of the Kusto cluster.
             * @return the next definition stage.
             */
            WithCreate withExistingCluster(String resourceGroupName, String clusterName);
        }
        /**
         * The stage of the ManagedPrivateEndpoint definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithPrivateLinkResourceId,
                DefinitionStages.WithPrivateLinkResourceRegion,
                DefinitionStages.WithGroupId,
                DefinitionStages.WithRequestMessage {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ManagedPrivateEndpoint create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ManagedPrivateEndpoint create(Context context);
        }
        /** The stage of the ManagedPrivateEndpoint definition allowing to specify privateLinkResourceId. */
        interface WithPrivateLinkResourceId {
            /**
             * Specifies the privateLinkResourceId property: The ARM resource ID of the resource for which the managed
             * private endpoint is created..
             *
             * @param privateLinkResourceId The ARM resource ID of the resource for which the managed private endpoint
             *     is created.
             * @return the next definition stage.
             */
            WithCreate withPrivateLinkResourceId(String privateLinkResourceId);
        }
        /** The stage of the ManagedPrivateEndpoint definition allowing to specify privateLinkResourceRegion. */
        interface WithPrivateLinkResourceRegion {
            /**
             * Specifies the privateLinkResourceRegion property: The region of the resource to which the managed private
             * endpoint is created..
             *
             * @param privateLinkResourceRegion The region of the resource to which the managed private endpoint is
             *     created.
             * @return the next definition stage.
             */
            WithCreate withPrivateLinkResourceRegion(String privateLinkResourceRegion);
        }
        /** The stage of the ManagedPrivateEndpoint definition allowing to specify groupId. */
        interface WithGroupId {
            /**
             * Specifies the groupId property: The groupId in which the managed private endpoint is created..
             *
             * @param groupId The groupId in which the managed private endpoint is created.
             * @return the next definition stage.
             */
            WithCreate withGroupId(String groupId);
        }
        /** The stage of the ManagedPrivateEndpoint definition allowing to specify requestMessage. */
        interface WithRequestMessage {
            /**
             * Specifies the requestMessage property: The user request message..
             *
             * @param requestMessage The user request message.
             * @return the next definition stage.
             */
            WithCreate withRequestMessage(String requestMessage);
        }
    }
    /**
     * Begins update for the ManagedPrivateEndpoint resource.
     *
     * @return the stage of resource update.
     */
    ManagedPrivateEndpoint.Update update();

    /** The template for ManagedPrivateEndpoint update. */
    interface Update
        extends UpdateStages.WithPrivateLinkResourceId,
            UpdateStages.WithPrivateLinkResourceRegion,
            UpdateStages.WithGroupId,
            UpdateStages.WithRequestMessage {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ManagedPrivateEndpoint apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ManagedPrivateEndpoint apply(Context context);
    }
    /** The ManagedPrivateEndpoint update stages. */
    interface UpdateStages {
        /** The stage of the ManagedPrivateEndpoint update allowing to specify privateLinkResourceId. */
        interface WithPrivateLinkResourceId {
            /**
             * Specifies the privateLinkResourceId property: The ARM resource ID of the resource for which the managed
             * private endpoint is created..
             *
             * @param privateLinkResourceId The ARM resource ID of the resource for which the managed private endpoint
             *     is created.
             * @return the next definition stage.
             */
            Update withPrivateLinkResourceId(String privateLinkResourceId);
        }
        /** The stage of the ManagedPrivateEndpoint update allowing to specify privateLinkResourceRegion. */
        interface WithPrivateLinkResourceRegion {
            /**
             * Specifies the privateLinkResourceRegion property: The region of the resource to which the managed private
             * endpoint is created..
             *
             * @param privateLinkResourceRegion The region of the resource to which the managed private endpoint is
             *     created.
             * @return the next definition stage.
             */
            Update withPrivateLinkResourceRegion(String privateLinkResourceRegion);
        }
        /** The stage of the ManagedPrivateEndpoint update allowing to specify groupId. */
        interface WithGroupId {
            /**
             * Specifies the groupId property: The groupId in which the managed private endpoint is created..
             *
             * @param groupId The groupId in which the managed private endpoint is created.
             * @return the next definition stage.
             */
            Update withGroupId(String groupId);
        }
        /** The stage of the ManagedPrivateEndpoint update allowing to specify requestMessage. */
        interface WithRequestMessage {
            /**
             * Specifies the requestMessage property: The user request message..
             *
             * @param requestMessage The user request message.
             * @return the next definition stage.
             */
            Update withRequestMessage(String requestMessage);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ManagedPrivateEndpoint refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ManagedPrivateEndpoint refresh(Context context);
}
