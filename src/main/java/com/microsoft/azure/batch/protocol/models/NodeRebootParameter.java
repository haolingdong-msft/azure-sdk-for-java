/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Options for rebooting a compute node.
 */
public class NodeRebootParameter {
    /**
     * When to reboot the compute node and what to do with currently running
     * tasks.
     * Values are:
     *
     * requeue - Terminate running task processes and requeue the tasks. The
     * tasks will run again when a node is available. Restart the node as soon
     * as tasks have been terminated.
     * terminate - Terminate running tasks. The tasks will not run again.
     * Restart the node as soon as tasks have been terminated.
     * taskcompletion - Allow currently running tasks to complete. Schedule no
     * new tasks while waiting. Restart the node when all tasks have completed.
     * retaineddata - Allow currently running tasks to complete, then wait for
     * all task data retention periods to expire. Schedule no new tasks while
     * waiting. Restart the node when all task retention periods have expired.
     *
     * The default value is requeue. Possible values include: 'requeue',
     * 'terminate', 'taskCompletion', 'retainedData'.
     */
    @JsonProperty(value = "nodeRebootOption")
    private ComputeNodeRebootOption nodeRebootOption;

    /**
     * Get the nodeRebootOption value.
     *
     * @return the nodeRebootOption value
     */
    public ComputeNodeRebootOption nodeRebootOption() {
        return this.nodeRebootOption;
    }

    /**
     * Set the nodeRebootOption value.
     *
     * @param nodeRebootOption the nodeRebootOption value to set
     * @return the NodeRebootParameter object itself.
     */
    public NodeRebootParameter withNodeRebootOption(ComputeNodeRebootOption nodeRebootOption) {
        this.nodeRebootOption = nodeRebootOption;
        return this;
    }

}
