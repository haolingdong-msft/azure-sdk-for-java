// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.managedapplications.fluent.models.ApplicationInner;
import java.util.Map;

/** An immutable client-side representation of Application. */
public interface Application {
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
     * Gets the managedBy property: ID of the resource that manages this resource.
     *
     * @return the managedBy value.
     */
    String managedBy();

    /**
     * Gets the sku property: The SKU of the resource.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the identity property: The identity of the resource.
     *
     * @return the identity value.
     */
    Identity identity();

    /**
     * Gets the plan property: The plan information.
     *
     * @return the plan value.
     */
    Plan plan();

    /**
     * Gets the kind property: The kind of the managed application. Allowed values are MarketPlace and ServiceCatalog.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the managedResourceGroupId property: The managed resource group Id.
     *
     * @return the managedResourceGroupId value.
     */
    String managedResourceGroupId();

    /**
     * Gets the applicationDefinitionId property: The fully qualified path of managed application definition Id.
     *
     * @return the applicationDefinitionId value.
     */
    String applicationDefinitionId();

    /**
     * Gets the parameters property: Name and value pairs that define the managed application parameters. It can be a
     * JObject or a well formed JSON string.
     *
     * @return the parameters value.
     */
    Object parameters();

    /**
     * Gets the outputs property: Name and value pairs that define the managed application outputs.
     *
     * @return the outputs value.
     */
    Object outputs();

    /**
     * Gets the provisioningState property: The managed application provisioning state.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

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
     * Gets the inner com.azure.resourcemanager.managedapplications.fluent.models.ApplicationInner object.
     *
     * @return the inner object.
     */
    ApplicationInner innerModel();

    /** The entirety of the Application definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithKind,
            DefinitionStages.WithManagedResourceGroupId,
            DefinitionStages.WithCreate {
    }
    /** The Application definition stages. */
    interface DefinitionStages {
        /** The first stage of the Application definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Application definition allowing to specify location. */
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
        /** The stage of the Application definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithKind withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the Application definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: The kind of the managed application. Allowed values are MarketPlace and
             * ServiceCatalog..
             *
             * @param kind The kind of the managed application. Allowed values are MarketPlace and ServiceCatalog.
             * @return the next definition stage.
             */
            WithManagedResourceGroupId withKind(String kind);
        }
        /** The stage of the Application definition allowing to specify managedResourceGroupId. */
        interface WithManagedResourceGroupId {
            /**
             * Specifies the managedResourceGroupId property: The managed resource group Id..
             *
             * @param managedResourceGroupId The managed resource group Id.
             * @return the next definition stage.
             */
            WithCreate withManagedResourceGroupId(String managedResourceGroupId);
        }
        /**
         * The stage of the Application definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithManagedBy,
                DefinitionStages.WithSku,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithPlan,
                DefinitionStages.WithApplicationDefinitionId,
                DefinitionStages.WithParameters {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Application create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Application create(Context context);
        }
        /** The stage of the Application definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Application definition allowing to specify managedBy. */
        interface WithManagedBy {
            /**
             * Specifies the managedBy property: ID of the resource that manages this resource..
             *
             * @param managedBy ID of the resource that manages this resource.
             * @return the next definition stage.
             */
            WithCreate withManagedBy(String managedBy);
        }
        /** The stage of the Application definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The SKU of the resource..
             *
             * @param sku The SKU of the resource.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }
        /** The stage of the Application definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the resource..
             *
             * @param identity The identity of the resource.
             * @return the next definition stage.
             */
            WithCreate withIdentity(Identity identity);
        }
        /** The stage of the Application definition allowing to specify plan. */
        interface WithPlan {
            /**
             * Specifies the plan property: The plan information..
             *
             * @param plan The plan information.
             * @return the next definition stage.
             */
            WithCreate withPlan(Plan plan);
        }
        /** The stage of the Application definition allowing to specify applicationDefinitionId. */
        interface WithApplicationDefinitionId {
            /**
             * Specifies the applicationDefinitionId property: The fully qualified path of managed application
             * definition Id..
             *
             * @param applicationDefinitionId The fully qualified path of managed application definition Id.
             * @return the next definition stage.
             */
            WithCreate withApplicationDefinitionId(String applicationDefinitionId);
        }
        /** The stage of the Application definition allowing to specify parameters. */
        interface WithParameters {
            /**
             * Specifies the parameters property: Name and value pairs that define the managed application parameters.
             * It can be a JObject or a well formed JSON string..
             *
             * @param parameters Name and value pairs that define the managed application parameters. It can be a
             *     JObject or a well formed JSON string.
             * @return the next definition stage.
             */
            WithCreate withParameters(Object parameters);
        }
    }
    /**
     * Begins update for the Application resource.
     *
     * @return the stage of resource update.
     */
    Application.Update update();

    /** The template for Application update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithManagedBy,
            UpdateStages.WithSku,
            UpdateStages.WithIdentity,
            UpdateStages.WithPlan,
            UpdateStages.WithKind,
            UpdateStages.WithManagedResourceGroupId,
            UpdateStages.WithApplicationDefinitionId,
            UpdateStages.WithParameters {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Application apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Application apply(Context context);
    }
    /** The Application update stages. */
    interface UpdateStages {
        /** The stage of the Application update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Application update allowing to specify managedBy. */
        interface WithManagedBy {
            /**
             * Specifies the managedBy property: ID of the resource that manages this resource..
             *
             * @param managedBy ID of the resource that manages this resource.
             * @return the next definition stage.
             */
            Update withManagedBy(String managedBy);
        }
        /** The stage of the Application update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The SKU of the resource..
             *
             * @param sku The SKU of the resource.
             * @return the next definition stage.
             */
            Update withSku(Sku sku);
        }
        /** The stage of the Application update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the resource..
             *
             * @param identity The identity of the resource.
             * @return the next definition stage.
             */
            Update withIdentity(Identity identity);
        }
        /** The stage of the Application update allowing to specify plan. */
        interface WithPlan {
            /**
             * Specifies the plan property: The plan information..
             *
             * @param plan The plan information.
             * @return the next definition stage.
             */
            Update withPlan(PlanPatchable plan);
        }
        /** The stage of the Application update allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: The kind of the managed application. Allowed values are MarketPlace and
             * ServiceCatalog..
             *
             * @param kind The kind of the managed application. Allowed values are MarketPlace and ServiceCatalog.
             * @return the next definition stage.
             */
            Update withKind(String kind);
        }
        /** The stage of the Application update allowing to specify managedResourceGroupId. */
        interface WithManagedResourceGroupId {
            /**
             * Specifies the managedResourceGroupId property: The managed resource group Id..
             *
             * @param managedResourceGroupId The managed resource group Id.
             * @return the next definition stage.
             */
            Update withManagedResourceGroupId(String managedResourceGroupId);
        }
        /** The stage of the Application update allowing to specify applicationDefinitionId. */
        interface WithApplicationDefinitionId {
            /**
             * Specifies the applicationDefinitionId property: The fully qualified path of managed application
             * definition Id..
             *
             * @param applicationDefinitionId The fully qualified path of managed application definition Id.
             * @return the next definition stage.
             */
            Update withApplicationDefinitionId(String applicationDefinitionId);
        }
        /** The stage of the Application update allowing to specify parameters. */
        interface WithParameters {
            /**
             * Specifies the parameters property: Name and value pairs that define the managed application parameters.
             * It can be a JObject or a well formed JSON string..
             *
             * @param parameters Name and value pairs that define the managed application parameters. It can be a
             *     JObject or a well formed JSON string.
             * @return the next definition stage.
             */
            Update withParameters(Object parameters);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Application refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Application refresh(Context context);
}
