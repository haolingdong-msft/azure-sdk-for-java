// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.costmanagement.fluent.models.ViewInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of View. */
public interface View {
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
     * Gets the etag property: eTag of the resource. To handle concurrent update scenario, this field will be used to
     * determine whether the user is updating the latest version or not.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the displayName property: User input name of the view. Required.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the scope property: Cost Management scope to save the view on. This includes
     * 'subscriptions/{subscriptionId}' for subscription scope,
     * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
     * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
     * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department scope,
     * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}' for
     * EnrollmentAccount scope,
     * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     * BillingProfile scope,
     * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for
     * InvoiceSection scope, 'providers/Microsoft.Management/managementGroups/{managementGroupId}' for Management Group
     * scope, '/providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}' for
     * ExternalBillingAccount scope, and
     * '/providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}' for ExternalSubscription
     * scope.
     *
     * @return the scope value.
     */
    String scope();

    /**
     * Gets the createdOn property: Date the user created this view.
     *
     * @return the createdOn value.
     */
    OffsetDateTime createdOn();

    /**
     * Gets the modifiedOn property: Date when the user last modified this view.
     *
     * @return the modifiedOn value.
     */
    OffsetDateTime modifiedOn();

    /**
     * Gets the dateRange property: Date range of the current view.
     *
     * @return the dateRange value.
     */
    String dateRange();

    /**
     * Gets the currency property: Currency of the current view.
     *
     * @return the currency value.
     */
    String currency();

    /**
     * Gets the chart property: Chart type of the main view in Cost Analysis. Required.
     *
     * @return the chart value.
     */
    ChartType chart();

    /**
     * Gets the accumulated property: Show costs accumulated over time.
     *
     * @return the accumulated value.
     */
    AccumulatedType accumulated();

    /**
     * Gets the metric property: Metric to use when displaying costs.
     *
     * @return the metric value.
     */
    MetricType metric();

    /**
     * Gets the kpis property: List of KPIs to show in Cost Analysis UI.
     *
     * @return the kpis value.
     */
    List<KpiProperties> kpis();

    /**
     * Gets the pivots property: Configuration of 3 sub-views in the Cost Analysis UI.
     *
     * @return the pivots value.
     */
    List<PivotProperties> pivots();

    /**
     * Gets the typePropertiesType property: The type of the report. Usage represents actual usage, forecast represents
     * forecasted data and UsageAndForecast represents both usage and forecasted data. Actual usage and forecasted data
     * can be differentiated based on dates.
     *
     * @return the typePropertiesType value.
     */
    ReportType typePropertiesType();

    /**
     * Gets the timeframe property: The time frame for pulling data for the report. If custom, then a specific time
     * period must be provided.
     *
     * @return the timeframe value.
     */
    ReportTimeframeType timeframe();

    /**
     * Gets the timePeriod property: Has time period for pulling data for the report.
     *
     * @return the timePeriod value.
     */
    ReportConfigTimePeriod timePeriod();

    /**
     * Gets the dataSet property: Has definition for data in this report config.
     *
     * @return the dataSet value.
     */
    ReportConfigDataset dataSet();

    /**
     * Gets the includeMonetaryCommitment property: If true, report includes monetary commitment.
     *
     * @return the includeMonetaryCommitment value.
     */
    Boolean includeMonetaryCommitment();

    /**
     * Gets the inner com.azure.resourcemanager.costmanagement.fluent.models.ViewInner object.
     *
     * @return the inner object.
     */
    ViewInner innerModel();

    /** The entirety of the View definition. */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithScopeStage, DefinitionStages.WithCreate {
    }
    /** The View definition stages. */
    interface DefinitionStages {
        /** The first stage of the View definition. */
        interface Blank extends WithScopeStage {
        }
        /** The stage of the View definition allowing to specify parent resource. */
        interface WithScopeStage {
            /**
             * Specifies scope.
             *
             * @param scope The scope associated with view operations. This includes 'subscriptions/{subscriptionId}'
             *     for subscription scope, 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for
             *     resourceGroup scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing
             *     Account scope,
             *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for
             *     Department scope,
             *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
             *     for EnrollmentAccount scope,
             *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}'
             *     for BillingProfile scope,
             *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}'
             *     for InvoiceSection scope, 'providers/Microsoft.Management/managementGroups/{managementGroupId}' for
             *     Management Group scope,
             *     'providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}' for
             *     External Billing Account scope and
             *     'providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}' for External
             *     Subscription scope.
             * @return the next definition stage.
             */
            WithCreate withExistingScope(String scope);
        }
        /**
         * The stage of the View definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithEtag,
                DefinitionStages.WithDisplayName,
                DefinitionStages.WithScope,
                DefinitionStages.WithChart,
                DefinitionStages.WithAccumulated,
                DefinitionStages.WithMetric,
                DefinitionStages.WithKpis,
                DefinitionStages.WithPivots,
                DefinitionStages.WithTypePropertiesType,
                DefinitionStages.WithTimeframe,
                DefinitionStages.WithTimePeriod,
                DefinitionStages.WithDataSet,
                DefinitionStages.WithIncludeMonetaryCommitment {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            View create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            View create(Context context);
        }
        /** The stage of the View definition allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: eTag of the resource. To handle concurrent update scenario, this field will
             * be used to determine whether the user is updating the latest version or not..
             *
             * @param etag eTag of the resource. To handle concurrent update scenario, this field will be used to
             *     determine whether the user is updating the latest version or not.
             * @return the next definition stage.
             */
            WithCreate withEtag(String etag);
        }
        /** The stage of the View definition allowing to specify displayName. */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: User input name of the view. Required..
             *
             * @param displayName User input name of the view. Required.
             * @return the next definition stage.
             */
            WithCreate withDisplayName(String displayName);
        }
        /** The stage of the View definition allowing to specify scope. */
        interface WithScope {
            /**
             * Specifies the scope property: Cost Management scope to save the view on. This includes
             * 'subscriptions/{subscriptionId}' for subscription scope,
             * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
             * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
             * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for
             * Department scope,
             * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
             * for EnrollmentAccount scope,
             * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
             * BillingProfile scope,
             * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for
             * InvoiceSection scope, 'providers/Microsoft.Management/managementGroups/{managementGroupId}' for
             * Management Group scope,
             * '/providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}' for
             * ExternalBillingAccount scope, and
             * '/providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}' for
             * ExternalSubscription scope..
             *
             * @param scope Cost Management scope to save the view on. This includes 'subscriptions/{subscriptionId}'
             *     for subscription scope, 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for
             *     resourceGroup scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing
             *     Account scope,
             *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for
             *     Department scope,
             *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
             *     for EnrollmentAccount scope,
             *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}'
             *     for BillingProfile scope,
             *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}'
             *     for InvoiceSection scope, 'providers/Microsoft.Management/managementGroups/{managementGroupId}' for
             *     Management Group scope,
             *     '/providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}' for
             *     ExternalBillingAccount scope, and
             *     '/providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}' for
             *     ExternalSubscription scope.
             * @return the next definition stage.
             */
            WithCreate withScope(String scope);
        }
        /** The stage of the View definition allowing to specify chart. */
        interface WithChart {
            /**
             * Specifies the chart property: Chart type of the main view in Cost Analysis. Required..
             *
             * @param chart Chart type of the main view in Cost Analysis. Required.
             * @return the next definition stage.
             */
            WithCreate withChart(ChartType chart);
        }
        /** The stage of the View definition allowing to specify accumulated. */
        interface WithAccumulated {
            /**
             * Specifies the accumulated property: Show costs accumulated over time..
             *
             * @param accumulated Show costs accumulated over time.
             * @return the next definition stage.
             */
            WithCreate withAccumulated(AccumulatedType accumulated);
        }
        /** The stage of the View definition allowing to specify metric. */
        interface WithMetric {
            /**
             * Specifies the metric property: Metric to use when displaying costs..
             *
             * @param metric Metric to use when displaying costs.
             * @return the next definition stage.
             */
            WithCreate withMetric(MetricType metric);
        }
        /** The stage of the View definition allowing to specify kpis. */
        interface WithKpis {
            /**
             * Specifies the kpis property: List of KPIs to show in Cost Analysis UI..
             *
             * @param kpis List of KPIs to show in Cost Analysis UI.
             * @return the next definition stage.
             */
            WithCreate withKpis(List<KpiProperties> kpis);
        }
        /** The stage of the View definition allowing to specify pivots. */
        interface WithPivots {
            /**
             * Specifies the pivots property: Configuration of 3 sub-views in the Cost Analysis UI..
             *
             * @param pivots Configuration of 3 sub-views in the Cost Analysis UI.
             * @return the next definition stage.
             */
            WithCreate withPivots(List<PivotProperties> pivots);
        }
        /** The stage of the View definition allowing to specify typePropertiesType. */
        interface WithTypePropertiesType {
            /**
             * Specifies the typePropertiesType property: The type of the report. Usage represents actual usage,
             * forecast represents forecasted data and UsageAndForecast represents both usage and forecasted data.
             * Actual usage and forecasted data can be differentiated based on dates..
             *
             * @param typePropertiesType The type of the report. Usage represents actual usage, forecast represents
             *     forecasted data and UsageAndForecast represents both usage and forecasted data. Actual usage and
             *     forecasted data can be differentiated based on dates.
             * @return the next definition stage.
             */
            WithCreate withTypePropertiesType(ReportType typePropertiesType);
        }
        /** The stage of the View definition allowing to specify timeframe. */
        interface WithTimeframe {
            /**
             * Specifies the timeframe property: The time frame for pulling data for the report. If custom, then a
             * specific time period must be provided..
             *
             * @param timeframe The time frame for pulling data for the report. If custom, then a specific time period
             *     must be provided.
             * @return the next definition stage.
             */
            WithCreate withTimeframe(ReportTimeframeType timeframe);
        }
        /** The stage of the View definition allowing to specify timePeriod. */
        interface WithTimePeriod {
            /**
             * Specifies the timePeriod property: Has time period for pulling data for the report..
             *
             * @param timePeriod Has time period for pulling data for the report.
             * @return the next definition stage.
             */
            WithCreate withTimePeriod(ReportConfigTimePeriod timePeriod);
        }
        /** The stage of the View definition allowing to specify dataSet. */
        interface WithDataSet {
            /**
             * Specifies the dataSet property: Has definition for data in this report config..
             *
             * @param dataSet Has definition for data in this report config.
             * @return the next definition stage.
             */
            WithCreate withDataSet(ReportConfigDataset dataSet);
        }
        /** The stage of the View definition allowing to specify includeMonetaryCommitment. */
        interface WithIncludeMonetaryCommitment {
            /**
             * Specifies the includeMonetaryCommitment property: If true, report includes monetary commitment..
             *
             * @param includeMonetaryCommitment If true, report includes monetary commitment.
             * @return the next definition stage.
             */
            WithCreate withIncludeMonetaryCommitment(Boolean includeMonetaryCommitment);
        }
    }
    /**
     * Begins update for the View resource.
     *
     * @return the stage of resource update.
     */
    View.Update update();

    /** The template for View update. */
    interface Update
        extends UpdateStages.WithEtag,
            UpdateStages.WithDisplayName,
            UpdateStages.WithScope,
            UpdateStages.WithChart,
            UpdateStages.WithAccumulated,
            UpdateStages.WithMetric,
            UpdateStages.WithKpis,
            UpdateStages.WithPivots,
            UpdateStages.WithTypePropertiesType,
            UpdateStages.WithTimeframe,
            UpdateStages.WithTimePeriod,
            UpdateStages.WithDataSet,
            UpdateStages.WithIncludeMonetaryCommitment {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        View apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        View apply(Context context);
    }
    /** The View update stages. */
    interface UpdateStages {
        /** The stage of the View update allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: eTag of the resource. To handle concurrent update scenario, this field will
             * be used to determine whether the user is updating the latest version or not..
             *
             * @param etag eTag of the resource. To handle concurrent update scenario, this field will be used to
             *     determine whether the user is updating the latest version or not.
             * @return the next definition stage.
             */
            Update withEtag(String etag);
        }
        /** The stage of the View update allowing to specify displayName. */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: User input name of the view. Required..
             *
             * @param displayName User input name of the view. Required.
             * @return the next definition stage.
             */
            Update withDisplayName(String displayName);
        }
        /** The stage of the View update allowing to specify scope. */
        interface WithScope {
            /**
             * Specifies the scope property: Cost Management scope to save the view on. This includes
             * 'subscriptions/{subscriptionId}' for subscription scope,
             * 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope,
             * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope,
             * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for
             * Department scope,
             * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
             * for EnrollmentAccount scope,
             * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
             * BillingProfile scope,
             * 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for
             * InvoiceSection scope, 'providers/Microsoft.Management/managementGroups/{managementGroupId}' for
             * Management Group scope,
             * '/providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}' for
             * ExternalBillingAccount scope, and
             * '/providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}' for
             * ExternalSubscription scope..
             *
             * @param scope Cost Management scope to save the view on. This includes 'subscriptions/{subscriptionId}'
             *     for subscription scope, 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for
             *     resourceGroup scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing
             *     Account scope,
             *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for
             *     Department scope,
             *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
             *     for EnrollmentAccount scope,
             *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}'
             *     for BillingProfile scope,
             *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}'
             *     for InvoiceSection scope, 'providers/Microsoft.Management/managementGroups/{managementGroupId}' for
             *     Management Group scope,
             *     '/providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}' for
             *     ExternalBillingAccount scope, and
             *     '/providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}' for
             *     ExternalSubscription scope.
             * @return the next definition stage.
             */
            Update withScope(String scope);
        }
        /** The stage of the View update allowing to specify chart. */
        interface WithChart {
            /**
             * Specifies the chart property: Chart type of the main view in Cost Analysis. Required..
             *
             * @param chart Chart type of the main view in Cost Analysis. Required.
             * @return the next definition stage.
             */
            Update withChart(ChartType chart);
        }
        /** The stage of the View update allowing to specify accumulated. */
        interface WithAccumulated {
            /**
             * Specifies the accumulated property: Show costs accumulated over time..
             *
             * @param accumulated Show costs accumulated over time.
             * @return the next definition stage.
             */
            Update withAccumulated(AccumulatedType accumulated);
        }
        /** The stage of the View update allowing to specify metric. */
        interface WithMetric {
            /**
             * Specifies the metric property: Metric to use when displaying costs..
             *
             * @param metric Metric to use when displaying costs.
             * @return the next definition stage.
             */
            Update withMetric(MetricType metric);
        }
        /** The stage of the View update allowing to specify kpis. */
        interface WithKpis {
            /**
             * Specifies the kpis property: List of KPIs to show in Cost Analysis UI..
             *
             * @param kpis List of KPIs to show in Cost Analysis UI.
             * @return the next definition stage.
             */
            Update withKpis(List<KpiProperties> kpis);
        }
        /** The stage of the View update allowing to specify pivots. */
        interface WithPivots {
            /**
             * Specifies the pivots property: Configuration of 3 sub-views in the Cost Analysis UI..
             *
             * @param pivots Configuration of 3 sub-views in the Cost Analysis UI.
             * @return the next definition stage.
             */
            Update withPivots(List<PivotProperties> pivots);
        }
        /** The stage of the View update allowing to specify typePropertiesType. */
        interface WithTypePropertiesType {
            /**
             * Specifies the typePropertiesType property: The type of the report. Usage represents actual usage,
             * forecast represents forecasted data and UsageAndForecast represents both usage and forecasted data.
             * Actual usage and forecasted data can be differentiated based on dates..
             *
             * @param typePropertiesType The type of the report. Usage represents actual usage, forecast represents
             *     forecasted data and UsageAndForecast represents both usage and forecasted data. Actual usage and
             *     forecasted data can be differentiated based on dates.
             * @return the next definition stage.
             */
            Update withTypePropertiesType(ReportType typePropertiesType);
        }
        /** The stage of the View update allowing to specify timeframe. */
        interface WithTimeframe {
            /**
             * Specifies the timeframe property: The time frame for pulling data for the report. If custom, then a
             * specific time period must be provided..
             *
             * @param timeframe The time frame for pulling data for the report. If custom, then a specific time period
             *     must be provided.
             * @return the next definition stage.
             */
            Update withTimeframe(ReportTimeframeType timeframe);
        }
        /** The stage of the View update allowing to specify timePeriod. */
        interface WithTimePeriod {
            /**
             * Specifies the timePeriod property: Has time period for pulling data for the report..
             *
             * @param timePeriod Has time period for pulling data for the report.
             * @return the next definition stage.
             */
            Update withTimePeriod(ReportConfigTimePeriod timePeriod);
        }
        /** The stage of the View update allowing to specify dataSet. */
        interface WithDataSet {
            /**
             * Specifies the dataSet property: Has definition for data in this report config..
             *
             * @param dataSet Has definition for data in this report config.
             * @return the next definition stage.
             */
            Update withDataSet(ReportConfigDataset dataSet);
        }
        /** The stage of the View update allowing to specify includeMonetaryCommitment. */
        interface WithIncludeMonetaryCommitment {
            /**
             * Specifies the includeMonetaryCommitment property: If true, report includes monetary commitment..
             *
             * @param includeMonetaryCommitment If true, report includes monetary commitment.
             * @return the next definition stage.
             */
            Update withIncludeMonetaryCommitment(Boolean includeMonetaryCommitment);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    View refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    View refresh(Context context);
}
