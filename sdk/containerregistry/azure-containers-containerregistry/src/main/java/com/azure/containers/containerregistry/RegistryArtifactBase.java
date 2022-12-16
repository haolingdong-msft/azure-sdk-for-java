// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry;

import com.azure.containers.containerregistry.implementation.AzureContainerRegistryImpl;
import com.azure.containers.containerregistry.implementation.AzureContainerRegistryImplBuilder;
import com.azure.containers.containerregistry.implementation.ContainerRegistriesImpl;
import com.azure.core.http.HttpPipeline;
import com.azure.core.util.logging.ClientLogger;

import java.net.MalformedURLException;
import java.net.URL;

class RegistryArtifactBase {
    private static final ClientLogger LOGGER = new ClientLogger(RegistryArtifactBase.class);
    private final String fullyQualifiedReference;
    private final String endpoint;
    private final String repositoryName;

    /**
     * Service client instance.
     */
    protected final ContainerRegistriesImpl serviceClient;

    /**
     * Tag or digest.
     */
    protected final String tagOrDigest;

    /**
     * Digest.
     */
    protected String digest;

    RegistryArtifactBase(String repositoryName, String tagOrDigest, HttpPipeline httpPipeline, String endpoint, String version) {
        if (repositoryName == null) {
            throw LOGGER.logExceptionAsError(new NullPointerException("'repositoryName' can't be null"));
        }

        if (repositoryName.isEmpty()) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException("'repositoryName' can't be empty"));
        }

        if (tagOrDigest == null) {
            throw LOGGER.logExceptionAsError(new NullPointerException("'digest' can't be null"));
        }

        if (tagOrDigest.isEmpty()) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException("'digest' can't be empty"));
        }

        AzureContainerRegistryImpl registryImpl = new AzureContainerRegistryImplBuilder()
            .pipeline(httpPipeline)
            .url(endpoint)
            .apiVersion(version)
            .buildClient();

        this.endpoint = endpoint;
        this.repositoryName = repositoryName;
        this.tagOrDigest = tagOrDigest;

        try {
            URL endpointUrl = new URL(endpoint);
            this.fullyQualifiedReference = endpointUrl.getHost() + "/" + this.repositoryName + (isDigest(tagOrDigest) ? "@" : ":") + tagOrDigest;
        } catch (MalformedURLException ex) {
            // This will not happen.
            throw LOGGER.logExceptionAsWarning(new IllegalArgumentException("'endpoint' must be a valid URL", ex));
        }

        this.serviceClient = registryImpl.getContainerRegistries();
    }

    /**
     * Gets the Azure Container Registry service endpoint for the current instance.
     * @return The service endpoint for the current instance.
     */
    public String getRegistryEndpoint() {
        return this.endpoint;
    }

    /**
     * Gets the fully qualified reference for the current instance.
     * The fully qualifiedName is of the form 'registryName/repositoryName@digest'
     * or 'registryName/repositoryName:tag' based on the docker naming convention and whether
     * tag or digest was supplied to the constructor.
     * @return Fully qualified reference of the current instance.
     * */
    public String getFullyQualifiedReference() {

        return this.fullyQualifiedReference;
    }

    /**
     * Gets the repository name for the current instance.
     * Gets the repository name for the current instance.
     * @return Name of the repository for the current instance.
     * */
    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * Checks if string represents tag or digest.
     *
     * @param tagOrDigest string to check
     * @return true if digest, false otherwise.
     */
    protected boolean isDigest(String tagOrDigest) {
        return tagOrDigest.contains(":");
    }
}
