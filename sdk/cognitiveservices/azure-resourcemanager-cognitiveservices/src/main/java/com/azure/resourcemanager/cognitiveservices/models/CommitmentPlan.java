// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cognitiveservices.fluent.models.CommitmentPlanInner;

/** An immutable client-side representation of CommitmentPlan. */
public interface CommitmentPlan {
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
     * Gets the etag property: Resource Etag.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the properties property: Properties of Cognitive Services account commitment plan.
     *
     * @return the properties value.
     */
    CommitmentPlanProperties properties();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.cognitiveservices.fluent.models.CommitmentPlanInner object.
     *
     * @return the inner object.
     */
    CommitmentPlanInner innerModel();

    /** The entirety of the CommitmentPlan definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The CommitmentPlan definition stages. */
    interface DefinitionStages {
        /** The first stage of the CommitmentPlan definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the CommitmentPlan definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param accountName The name of Cognitive Services account.
             * @return the next definition stage.
             */
            WithCreate withExistingAccount(String resourceGroupName, String accountName);
        }
        /**
         * The stage of the CommitmentPlan definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            CommitmentPlan create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            CommitmentPlan create(Context context);
        }
        /** The stage of the CommitmentPlan definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties of Cognitive Services account commitment plan..
             *
             * @param properties Properties of Cognitive Services account commitment plan.
             * @return the next definition stage.
             */
            WithCreate withProperties(CommitmentPlanProperties properties);
        }
    }
    /**
     * Begins update for the CommitmentPlan resource.
     *
     * @return the stage of resource update.
     */
    CommitmentPlan.Update update();

    /** The template for CommitmentPlan update. */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        CommitmentPlan apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        CommitmentPlan apply(Context context);
    }
    /** The CommitmentPlan update stages. */
    interface UpdateStages {
        /** The stage of the CommitmentPlan update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties of Cognitive Services account commitment plan..
             *
             * @param properties Properties of Cognitive Services account commitment plan.
             * @return the next definition stage.
             */
            Update withProperties(CommitmentPlanProperties properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    CommitmentPlan refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    CommitmentPlan refresh(Context context);
}
