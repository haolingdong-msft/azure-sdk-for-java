// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.verticals.agrifood.farming;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.PollerFlux;
import com.azure.verticals.agrifood.farming.implementation.BoundariesImpl;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous FarmBeatsClient type. */
@ServiceClient(builder = BoundariesClientBuilder.class, isAsync = true)
public final class BoundariesAsyncClient {
    @Generated private final BoundariesImpl serviceClient;

    /**
     * Initializes an instance of BoundariesAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    BoundariesAsyncClient(BoundariesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Returns a paginated list of boundary resources across all parties.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>parentType</td><td>String</td><td>No</td><td>Type of the parent it belongs to.</td></tr>
     *     <tr><td>type</td><td>String</td><td>No</td><td>Type it belongs to.</td></tr>
     *     <tr><td>parentIds</td><td>List&lt;String&gt;</td><td>No</td><td>Parent Ids of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>minArea</td><td>Double</td><td>No</td><td>Minimum area of the boundary (inclusive).</td></tr>
     *     <tr><td>maxArea</td><td>Double</td><td>No</td><td>Maximum acreage of the boundary (inclusive).</td></tr>
     *     <tr><td>ids</td><td>List&lt;String&gt;</td><td>No</td><td>Ids of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>names</td><td>List&lt;String&gt;</td><td>No</td><td>Names of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>propertyFilters</td><td>List&lt;String&gt;</td><td>No</td><td>Filters on key-value pairs within the Properties object.
     * eg. "{testKey} eq {testValue}". Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>statuses</td><td>List&lt;String&gt;</td><td>No</td><td>Statuses of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>minCreatedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum creation date of resource (inclusive).</td></tr>
     *     <tr><td>maxCreatedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum creation date of resource (inclusive).</td></tr>
     *     <tr><td>minLastModifiedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum last modified date of resource (inclusive).</td></tr>
     *     <tr><td>maxLastModifiedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum last modified date of resource (inclusive).</td></tr>
     *     <tr><td>maxPageSize</td><td>Integer</td><td>No</td><td>Maximum number of items needed (inclusive).
     * Minimum = 10, Maximum = 1000, Default value = 50.</td></tr>
     *     <tr><td>skipToken</td><td>String</td><td>No</td><td>Skip token for getting next set of results.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Optional)
     *     parentId: String (Optional)
     *     area (Optional): {
     *         unit: String (Optional)
     *         value: Double (Optional)
     *     }
     *     parentType: String(Field/SeasonalField/Zone/Prescription/PlantTissueAnalysis/ApplicationData/PlantingData/TillageData/HarvestData) (Optional)
     *     type: String (Optional)
     *     id: String (Optional)
     *     eTag: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     source: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paged response contains list of requested objects and a URL link to get the next set of results as
     *     paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> list(RequestOptions requestOptions) {
        return this.serviceClient.listAsync(requestOptions);
    }

    /**
     * Search for boundaries across all parties by fields and intersecting geometry.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     ids (Optional): [
     *         String (Optional)
     *     ]
     *     names (Optional): [
     *         String (Optional)
     *     ]
     *     propertyFilters (Optional): [
     *         String (Optional)
     *     ]
     *     statuses (Optional): [
     *         String (Optional)
     *     ]
     *     minCreatedDateTime: OffsetDateTime (Optional)
     *     maxCreatedDateTime: OffsetDateTime (Optional)
     *     minLastModifiedDateTime: OffsetDateTime (Optional)
     *     maxLastModifiedDateTime: OffsetDateTime (Optional)
     *     maxPageSize: Integer (Optional)
     *     skipToken: String (Optional)
     *     parentType: String(Field/SeasonalField/Zone/Prescription/PlantTissueAnalysis/ApplicationData/PlantingData/TillageData/HarvestData) (Optional)
     *     type: String (Optional)
     *     parentIds (Optional): [
     *         String (Optional)
     *     ]
     *     minArea: Double (Optional)
     *     maxArea: Double (Optional)
     *     intersectsWithGeometry (Optional): {
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Optional)
     *     parentId: String (Optional)
     *     area (Optional): {
     *         unit: String (Optional)
     *         value: Double (Optional)
     *     }
     *     parentType: String(Field/SeasonalField/Zone/Prescription/PlantTissueAnalysis/ApplicationData/PlantingData/TillageData/HarvestData) (Optional)
     *     type: String (Optional)
     *     id: String (Optional)
     *     eTag: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     source: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param searchBoundaryQuery Query filters.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paged response contains list of requested objects and a URL link to get the next set of results as
     *     paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> search(BinaryData searchBoundaryQuery, RequestOptions requestOptions) {
        return this.serviceClient.searchAsync(searchBoundaryQuery, requestOptions);
    }

    /**
     * Create a cascade delete job for specified boundary.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Required)
     *     resourceId: String (Required)
     *     resourceType: String (Required)
     *     id: String (Optional)
     *     status: String(Waiting/Running/Succeeded/Failed/Cancelled) (Optional)
     *     durationInSeconds: Double (Optional)
     *     message: String (Optional)
     *     errorCode: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     lastActionDateTime: OffsetDateTime (Optional)
     *     startTime: OffsetDateTime (Optional)
     *     endTime: OffsetDateTime (Optional)
     * }
     * }</pre>
     *
     * @param jobId Job ID supplied by end user.
     * @param partyId ID of the associated party.
     * @param boundaryId ID of the boundary to be deleted.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of schema of cascade delete job.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginCreateCascadeDeleteJob(
            String jobId, String partyId, String boundaryId, RequestOptions requestOptions) {
        return this.serviceClient.beginCreateCascadeDeleteJobAsync(jobId, partyId, boundaryId, requestOptions);
    }

    /**
     * Get cascade delete job for specified boundary.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Required)
     *     resourceId: String (Required)
     *     resourceType: String (Required)
     *     id: String (Optional)
     *     status: String(Waiting/Running/Succeeded/Failed/Cancelled) (Optional)
     *     durationInSeconds: Double (Optional)
     *     message: String (Optional)
     *     errorCode: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     lastActionDateTime: OffsetDateTime (Optional)
     *     startTime: OffsetDateTime (Optional)
     *     endTime: OffsetDateTime (Optional)
     * }
     * }</pre>
     *
     * @param jobId Id of the job.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return cascade delete job for specified boundary along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getCascadeDeleteJobDetailsWithResponse(
            String jobId, RequestOptions requestOptions) {
        return this.serviceClient.getCascadeDeleteJobDetailsWithResponseAsync(jobId, requestOptions);
    }

    /**
     * Returns a paginated list of boundary resources under a particular party.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>parentType</td><td>String</td><td>No</td><td>Type of the parent it belongs to.</td></tr>
     *     <tr><td>type</td><td>String</td><td>No</td><td>Type it belongs to.</td></tr>
     *     <tr><td>parentIds</td><td>List&lt;String&gt;</td><td>No</td><td>Parent Ids of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>minArea</td><td>Double</td><td>No</td><td>Minimum area of the boundary (inclusive).</td></tr>
     *     <tr><td>maxArea</td><td>Double</td><td>No</td><td>Maximum acreage of the boundary (inclusive).</td></tr>
     *     <tr><td>ids</td><td>List&lt;String&gt;</td><td>No</td><td>Ids of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>names</td><td>List&lt;String&gt;</td><td>No</td><td>Names of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>propertyFilters</td><td>List&lt;String&gt;</td><td>No</td><td>Filters on key-value pairs within the Properties object.
     * eg. "{testKey} eq {testValue}". Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>statuses</td><td>List&lt;String&gt;</td><td>No</td><td>Statuses of the resource. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>minCreatedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum creation date of resource (inclusive).</td></tr>
     *     <tr><td>maxCreatedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum creation date of resource (inclusive).</td></tr>
     *     <tr><td>minLastModifiedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Minimum last modified date of resource (inclusive).</td></tr>
     *     <tr><td>maxLastModifiedDateTime</td><td>OffsetDateTime</td><td>No</td><td>Maximum last modified date of resource (inclusive).</td></tr>
     *     <tr><td>maxPageSize</td><td>Integer</td><td>No</td><td>Maximum number of items needed (inclusive).
     * Minimum = 10, Maximum = 1000, Default value = 50.</td></tr>
     *     <tr><td>skipToken</td><td>String</td><td>No</td><td>Skip token for getting next set of results.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Optional)
     *     parentId: String (Optional)
     *     area (Optional): {
     *         unit: String (Optional)
     *         value: Double (Optional)
     *     }
     *     parentType: String(Field/SeasonalField/Zone/Prescription/PlantTissueAnalysis/ApplicationData/PlantingData/TillageData/HarvestData) (Optional)
     *     type: String (Optional)
     *     id: String (Optional)
     *     eTag: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     source: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param partyId Id of the associated party.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paged response contains list of requested objects and a URL link to get the next set of results as
     *     paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listByPartyId(String partyId, RequestOptions requestOptions) {
        return this.serviceClient.listByPartyIdAsync(partyId, requestOptions);
    }

    /**
     * Search for boundaries by fields and intersecting geometry.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     ids (Optional): [
     *         String (Optional)
     *     ]
     *     names (Optional): [
     *         String (Optional)
     *     ]
     *     propertyFilters (Optional): [
     *         String (Optional)
     *     ]
     *     statuses (Optional): [
     *         String (Optional)
     *     ]
     *     minCreatedDateTime: OffsetDateTime (Optional)
     *     maxCreatedDateTime: OffsetDateTime (Optional)
     *     minLastModifiedDateTime: OffsetDateTime (Optional)
     *     maxLastModifiedDateTime: OffsetDateTime (Optional)
     *     maxPageSize: Integer (Optional)
     *     skipToken: String (Optional)
     *     parentType: String(Field/SeasonalField/Zone/Prescription/PlantTissueAnalysis/ApplicationData/PlantingData/TillageData/HarvestData) (Optional)
     *     type: String (Optional)
     *     parentIds (Optional): [
     *         String (Optional)
     *     ]
     *     minArea: Double (Optional)
     *     maxArea: Double (Optional)
     *     intersectsWithGeometry (Optional): {
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     partyId: String (Optional)
     *     parentId: String (Optional)
     *     area (Optional): {
     *         unit: String (Optional)
     *         value: Double (Optional)
     *     }
     *     parentType: String(Field/SeasonalField/Zone/Prescription/PlantTissueAnalysis/ApplicationData/PlantingData/TillageData/HarvestData) (Optional)
     *     type: String (Optional)
     *     id: String (Optional)
     *     eTag: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     source: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param partyId Id of the party.
     * @param searchBoundaryQuery Query filters.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paged response contains list of requested objects and a URL link to get the next set of results as
     *     paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> searchByPartyId(
            String partyId, BinaryData searchBoundaryQuery, RequestOptions requestOptions) {
        return this.serviceClient.searchByPartyIdAsync(partyId, searchBoundaryQuery, requestOptions);
    }

    /**
     * Creates or updates a boundary resource.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     geometry (Optional): {
     *     }
     *     type: String (Optional)
     *     crs: String (Optional)
     *     centroid (Optional): (recursive schema, see centroid above)
     *     bbox (Optional): (recursive schema, see bbox above)
     *     partyId: String (Optional)
     *     parentId: String (Optional)
     *     area (Optional): {
     *         unit: String (Optional)
     *         value: Double (Optional)
     *     }
     *     parentType: String(Field/SeasonalField/Zone/Prescription/PlantTissueAnalysis/ApplicationData/PlantingData/TillageData/HarvestData) (Optional)
     *     id: String (Optional)
     *     eTag: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     source: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     geometry (Optional): {
     *     }
     *     type: String (Optional)
     *     crs: String (Optional)
     *     centroid (Optional): (recursive schema, see centroid above)
     *     bbox (Optional): (recursive schema, see bbox above)
     *     partyId: String (Optional)
     *     parentId: String (Optional)
     *     area (Optional): {
     *         unit: String (Optional)
     *         value: Double (Optional)
     *     }
     *     parentType: String(Field/SeasonalField/Zone/Prescription/PlantTissueAnalysis/ApplicationData/PlantingData/TillageData/HarvestData) (Optional)
     *     id: String (Optional)
     *     eTag: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     source: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param partyId Id of the party resource.
     * @param boundaryId Id of the boundary resource.
     * @param boundary Boundary resource payload to create or update.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return schema of boundary resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createOrUpdateWithResponse(
            String partyId, String boundaryId, BinaryData boundary, RequestOptions requestOptions) {
        return this.serviceClient.createOrUpdateWithResponseAsync(partyId, boundaryId, boundary, requestOptions);
    }

    /**
     * Gets a specified boundary resource under a particular party.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     geometry (Optional): {
     *     }
     *     type: String (Optional)
     *     crs: String (Optional)
     *     centroid (Optional): (recursive schema, see centroid above)
     *     bbox (Optional): (recursive schema, see bbox above)
     *     partyId: String (Optional)
     *     parentId: String (Optional)
     *     area (Optional): {
     *         unit: String (Optional)
     *         value: Double (Optional)
     *     }
     *     parentType: String(Field/SeasonalField/Zone/Prescription/PlantTissueAnalysis/ApplicationData/PlantingData/TillageData/HarvestData) (Optional)
     *     id: String (Optional)
     *     eTag: String (Optional)
     *     status: String (Optional)
     *     createdDateTime: OffsetDateTime (Optional)
     *     modifiedDateTime: OffsetDateTime (Optional)
     *     source: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     createdBy: String (Optional)
     *     modifiedBy: String (Optional)
     *     properties (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param partyId Id of the associated party.
     * @param boundaryId Id of the boundary.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a specified boundary resource under a particular party along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponse(
            String partyId, String boundaryId, RequestOptions requestOptions) {
        return this.serviceClient.getWithResponseAsync(partyId, boundaryId, requestOptions);
    }

    /**
     * Deletes a specified boundary resource under a particular party.
     *
     * @param partyId Id of the party.
     * @param boundaryId Id of the boundary.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponse(String partyId, String boundaryId, RequestOptions requestOptions) {
        return this.serviceClient.deleteWithResponseAsync(partyId, boundaryId, requestOptions);
    }

    /**
     * Returns overlapping area between two boundary Ids.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     boundaryArea: Double (Optional)
     *     otherBoundaryArea: Double (Optional)
     *     intersectingArea: Double (Optional)
     * }
     * }</pre>
     *
     * @param partyId Id of the party.
     * @param boundaryId Id of the boundary.
     * @param otherPartyId PartyId of the other field.
     * @param otherBoundaryId Id of the other boundary.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return schema of boundary overlap response along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getOverlapWithResponse(
            String partyId,
            String boundaryId,
            String otherPartyId,
            String otherBoundaryId,
            RequestOptions requestOptions) {
        return this.serviceClient.getOverlapWithResponseAsync(
                partyId, boundaryId, otherPartyId, otherBoundaryId, requestOptions);
    }
}
