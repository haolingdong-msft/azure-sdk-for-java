// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.resourcemanager.security.fluent.models.MdeOnboardingDataInner;

/** An immutable client-side representation of MdeOnboardingData. */
public interface MdeOnboardingData {
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
     * Gets the onboardingPackageWindows property: The onboarding package used to onboard Windows machines to MDE, coded
     * in base64. This can also be used for onboarding using the dedicated VM Extension.
     *
     * @return the onboardingPackageWindows value.
     */
    byte[] onboardingPackageWindows();

    /**
     * Gets the onboardingPackageLinux property: The onboarding package used to onboard Linux machines to MDE, coded in
     * base64. This can also be used for onboarding using the dedicated VM Extension.
     *
     * @return the onboardingPackageLinux value.
     */
    byte[] onboardingPackageLinux();

    /**
     * Gets the inner com.azure.resourcemanager.security.fluent.models.MdeOnboardingDataInner object.
     *
     * @return the inner object.
     */
    MdeOnboardingDataInner innerModel();
}
