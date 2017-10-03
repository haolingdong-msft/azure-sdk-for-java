/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The set of changes to be made to a pool.
 */
public class PoolUpdatePropertiesParameter {
    /**
     * A task to run on each compute node as it joins the pool. The task runs
     * when the node is added to the pool or when the node is restarted.
     * If this element is present, it overwrites any existing start task. If
     * omitted, any existing start task is removed from the pool.
     */
    @JsonProperty(value = "startTask")
    private StartTask startTask;

    /**
     * A list of certificates to be installed on each compute node in the pool.
     * This list replaces any existing certificate references configured on the
     * pool. If you specify an empty collection, any existing certificate
     * references are removed from the pool. For Windows compute nodes, the
     * Batch service installs the certificates to the specified certificate
     * store and location. For Linux compute nodes, the certificates are stored
     * in a directory inside the task working directory and an environment
     * variable AZ_BATCH_CERTIFICATES_DIR is supplied to the task to query for
     * this location. For certificates with visibility of 'remoteUser', a
     * 'certs' directory is created in the user's home directory (e.g.,
     * /home/{user-name}/certs) and certificates are placed in that directory.
     */
    @JsonProperty(value = "certificateReferences", required = true)
    private List<CertificateReference> certificateReferences;

    /**
     * A list of application packages to be installed on each compute node in
     * the pool.
     * The list replaces any existing application package references on the
     * pool. Changes to application package references affect all new compute
     * nodes joining the pool, but do not affect compute nodes that are already
     * in the pool until they are rebooted or reimaged. If omitted, or if you
     * specify an empty collection, any existing application packages
     * references are removed from the pool.
     */
    @JsonProperty(value = "applicationPackageReferences", required = true)
    private List<ApplicationPackageReference> applicationPackageReferences;

    /**
     * A list of name-value pairs associated with the pool as metadata.
     * This list replaces any existing metadata configured on the pool. If
     * omitted, or if you specify an empty collection, any existing metadata is
     * removed from the pool.
     */
    @JsonProperty(value = "metadata", required = true)
    private List<MetadataItem> metadata;

    /**
     * Get the startTask value.
     *
     * @return the startTask value
     */
    public StartTask startTask() {
        return this.startTask;
    }

    /**
     * Set the startTask value.
     *
     * @param startTask the startTask value to set
     * @return the PoolUpdatePropertiesParameter object itself.
     */
    public PoolUpdatePropertiesParameter withStartTask(StartTask startTask) {
        this.startTask = startTask;
        return this;
    }

    /**
     * Get the certificateReferences value.
     *
     * @return the certificateReferences value
     */
    public List<CertificateReference> certificateReferences() {
        return this.certificateReferences;
    }

    /**
     * Set the certificateReferences value.
     *
     * @param certificateReferences the certificateReferences value to set
     * @return the PoolUpdatePropertiesParameter object itself.
     */
    public PoolUpdatePropertiesParameter withCertificateReferences(List<CertificateReference> certificateReferences) {
        this.certificateReferences = certificateReferences;
        return this;
    }

    /**
     * Get the applicationPackageReferences value.
     *
     * @return the applicationPackageReferences value
     */
    public List<ApplicationPackageReference> applicationPackageReferences() {
        return this.applicationPackageReferences;
    }

    /**
     * Set the applicationPackageReferences value.
     *
     * @param applicationPackageReferences the applicationPackageReferences value to set
     * @return the PoolUpdatePropertiesParameter object itself.
     */
    public PoolUpdatePropertiesParameter withApplicationPackageReferences(List<ApplicationPackageReference> applicationPackageReferences) {
        this.applicationPackageReferences = applicationPackageReferences;
        return this;
    }

    /**
     * Get the metadata value.
     *
     * @return the metadata value
     */
    public List<MetadataItem> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set
     * @return the PoolUpdatePropertiesParameter object itself.
     */
    public PoolUpdatePropertiesParameter withMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
        return this;
    }

}
