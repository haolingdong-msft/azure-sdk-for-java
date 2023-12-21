// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Creates a particular correlation between services.
 */
@Fluent
public final class ServiceCorrelationDescription {
    /*
     * The ServiceCorrelationScheme which describes the relationship between this service and the service specified via
     * ServiceName.
     */
    @JsonProperty(value = "scheme", required = true)
    private ServiceCorrelationScheme scheme;

    /*
     * The name of the service that the correlation relationship is established with.
     */
    @JsonProperty(value = "serviceName", required = true)
    private String serviceName;

    /**
     * Creates an instance of ServiceCorrelationDescription class.
     */
    public ServiceCorrelationDescription() {
    }

    /**
     * Get the scheme property: The ServiceCorrelationScheme which describes the relationship between this service and
     * the service specified via ServiceName.
     * 
     * @return the scheme value.
     */
    public ServiceCorrelationScheme scheme() {
        return this.scheme;
    }

    /**
     * Set the scheme property: The ServiceCorrelationScheme which describes the relationship between this service and
     * the service specified via ServiceName.
     * 
     * @param scheme the scheme value to set.
     * @return the ServiceCorrelationDescription object itself.
     */
    public ServiceCorrelationDescription withScheme(ServiceCorrelationScheme scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * Get the serviceName property: The name of the service that the correlation relationship is established with.
     * 
     * @return the serviceName value.
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: The name of the service that the correlation relationship is established with.
     * 
     * @param serviceName the serviceName value to set.
     * @return the ServiceCorrelationDescription object itself.
     */
    public ServiceCorrelationDescription withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (scheme() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property scheme in model ServiceCorrelationDescription"));
        }
        if (serviceName() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property serviceName in model ServiceCorrelationDescription"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServiceCorrelationDescription.class);
}
