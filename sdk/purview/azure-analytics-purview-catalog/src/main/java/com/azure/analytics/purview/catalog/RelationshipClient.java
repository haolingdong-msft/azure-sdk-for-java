// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;

/** Initializes a new instance of the synchronous PurviewCatalogClient type. */
@ServiceClient(builder = RelationshipClientBuilder.class)
public final class RelationshipClient {
    @Generated private final RelationshipAsyncClient client;

    /**
     * Initializes an instance of RelationshipClient class.
     *
     * @param client the async client.
     */
    @Generated
    RelationshipClient(RelationshipAsyncClient client) {
        this.client = client;
    }

    /**
     * Create a new relationship between entities.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     attributes: {
     *         String: Object
     *     }
     *     typeName: String
     *     lastModifiedTS: String
     *     createTime: Float
     *     createdBy: String
     *     end1: {
     *         guid: String
     *         typeName: String
     *         uniqueAttributes: {
     *             String: Object
     *         }
     *     }
     *     end2: (recursive schema, see end2 above)
     *     guid: String
     *     homeId: String
     *     label: String
     *     provenanceType: Float
     *     status: String(ACTIVE/DELETED)
     *     updateTime: Float
     *     updatedBy: String
     *     version: Float
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     attributes: {
     *         String: Object
     *     }
     *     typeName: String
     *     lastModifiedTS: String
     *     createTime: Float
     *     createdBy: String
     *     end1: {
     *         guid: String
     *         typeName: String
     *         uniqueAttributes: {
     *             String: Object
     *         }
     *     }
     *     end2: (recursive schema, see end2 above)
     *     guid: String
     *     homeId: String
     *     label: String
     *     provenanceType: Float
     *     status: String(ACTIVE/DELETED)
     *     updateTime: Float
     *     updatedBy: String
     *     version: Float
     * }
     * }</pre>
     *
     * @param relationship The AtlasRelationship object containing the information for the relationship to be created.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return atlasRelationship along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createWithResponse(BinaryData relationship, RequestOptions requestOptions) {
        return this.client.createWithResponse(relationship, requestOptions).block();
    }

    /**
     * Update an existing relationship between entities.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     attributes: {
     *         String: Object
     *     }
     *     typeName: String
     *     lastModifiedTS: String
     *     createTime: Float
     *     createdBy: String
     *     end1: {
     *         guid: String
     *         typeName: String
     *         uniqueAttributes: {
     *             String: Object
     *         }
     *     }
     *     end2: (recursive schema, see end2 above)
     *     guid: String
     *     homeId: String
     *     label: String
     *     provenanceType: Float
     *     status: String(ACTIVE/DELETED)
     *     updateTime: Float
     *     updatedBy: String
     *     version: Float
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     attributes: {
     *         String: Object
     *     }
     *     typeName: String
     *     lastModifiedTS: String
     *     createTime: Float
     *     createdBy: String
     *     end1: {
     *         guid: String
     *         typeName: String
     *         uniqueAttributes: {
     *             String: Object
     *         }
     *     }
     *     end2: (recursive schema, see end2 above)
     *     guid: String
     *     homeId: String
     *     label: String
     *     provenanceType: Float
     *     status: String(ACTIVE/DELETED)
     *     updateTime: Float
     *     updatedBy: String
     *     version: Float
     * }
     * }</pre>
     *
     * @param relationship The AtlasRelationship object containing the information for the relationship to be created.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return atlasRelationship along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> updateWithResponse(BinaryData relationship, RequestOptions requestOptions) {
        return this.client.updateWithResponse(relationship, requestOptions).block();
    }

    /**
     * Get relationship information between entities by its GUID.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>extendedInfo</td><td>String</td><td>No</td><td>Limits whether includes extended information.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     referredEntities: {
     *         String: {
     *             attributes: {
     *                 String: Object
     *             }
     *             typeName: String
     *             lastModifiedTS: String
     *             classificationNames: [
     *                 String
     *             ]
     *             classifications: [
     *                 {
     *                     attributes: {
     *                         String: Object
     *                     }
     *                     typeName: String
     *                     lastModifiedTS: String
     *                     entityGuid: String
     *                     entityStatus: String(ACTIVE/DELETED)
     *                     removePropagationsOnEntityDelete: Boolean
     *                     validityPeriods: [
     *                         {
     *                             endTime: String
     *                             startTime: String
     *                             timeZone: String
     *                         }
     *                     ]
     *                     source: String
     *                     sourceDetails: {
     *                         String: Object
     *                     }
     *                 }
     *             ]
     *             displayText: String
     *             guid: String
     *             meaningNames: [
     *                 String
     *             ]
     *             meanings: [
     *                 {
     *                     confidence: Integer
     *                     createdBy: String
     *                     description: String
     *                     displayText: String
     *                     expression: String
     *                     relationGuid: String
     *                     source: String
     *                     status: String(DISCOVERED/PROPOSED/IMPORTED/VALIDATED/DEPRECATED/OBSOLETE/OTHER)
     *                     steward: String
     *                     termGuid: String
     *                 }
     *             ]
     *             status: String(ACTIVE/DELETED)
     *         }
     *     }
     *     relationship: {
     *         attributes: {
     *             String: Object
     *         }
     *         typeName: String
     *         lastModifiedTS: String
     *         createTime: Float
     *         createdBy: String
     *         end1: {
     *             guid: String
     *             typeName: String
     *             uniqueAttributes: {
     *                 String: Object
     *             }
     *         }
     *         end2: (recursive schema, see end2 above)
     *         guid: String
     *         homeId: String
     *         label: String
     *         provenanceType: Float
     *         status: String(ACTIVE/DELETED)
     *         updateTime: Float
     *         updatedBy: String
     *         version: Float
     *     }
     * }
     * }</pre>
     *
     * @param guid The globally unique identifier of the relationship.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return relationship information between entities by its GUID along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(String guid, RequestOptions requestOptions) {
        return this.client.getWithResponse(guid, requestOptions).block();
    }

    /**
     * Delete a relationship between entities by its GUID.
     *
     * @param guid The globally unique identifier of the relationship.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(String guid, RequestOptions requestOptions) {
        return this.client.deleteWithResponse(guid, requestOptions).block();
    }
}
