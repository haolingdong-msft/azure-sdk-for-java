// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.resourcemanager.applicationinsights.fluent.models.ApplicationInsightsComponentAvailableFeaturesInner;
import java.util.List;

/** An immutable client-side representation of ApplicationInsightsComponentAvailableFeatures. */
public interface ApplicationInsightsComponentAvailableFeatures {
    /**
     * Gets the result property: A list of Application Insights component feature.
     *
     * @return the result value.
     */
    List<ApplicationInsightsComponentFeature> result();

    /**
     * Gets the inner
     * com.azure.resourcemanager.applicationinsights.fluent.models.ApplicationInsightsComponentAvailableFeaturesInner
     * object.
     *
     * @return the inner object.
     */
    ApplicationInsightsComponentAvailableFeaturesInner innerModel();
}
