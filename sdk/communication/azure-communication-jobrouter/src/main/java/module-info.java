// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

module com.azure.communication.jobrouter {
    requires transitive com.azure.core;
    requires transitive com.azure.json;
    requires com.azure.communication.common;
    exports com.azure.communication.jobrouter;
    exports com.azure.communication.jobrouter.models;
    opens com.azure.communication.jobrouter.implementation.models to com.azure.core;
    opens com.azure.communication.jobrouter.models to com.azure.core;
    opens com.azure.communication.jobrouter.implementation.models to com.azure.core, com.fasterxml.jackson.databind;
    opens com.azure.communication.jobrouter.models to com.azure.core, com.fasterxml.jackson.databind;
}
