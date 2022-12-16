// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.fluent.models.OSFamilyInner;
import com.azure.resourcemanager.compute.fluent.models.OSVersionInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in CloudServiceOperatingSystemsClient. */
public interface CloudServiceOperatingSystemsClient {
    /**
     * Gets properties of a guest operating system version that can be specified in the XML service configuration
     * (.cscfg) for a cloud service.
     *
     * @param location Name of the location that the OS version pertains to.
     * @param osVersionName Name of the OS version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a guest operating system version that can be specified in the XML service configuration
     *     (.cscfg) for a cloud service along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<OSVersionInner>> getOSVersionWithResponseAsync(String location, String osVersionName);

    /**
     * Gets properties of a guest operating system version that can be specified in the XML service configuration
     * (.cscfg) for a cloud service.
     *
     * @param location Name of the location that the OS version pertains to.
     * @param osVersionName Name of the OS version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a guest operating system version that can be specified in the XML service configuration
     *     (.cscfg) for a cloud service on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<OSVersionInner> getOSVersionAsync(String location, String osVersionName);

    /**
     * Gets properties of a guest operating system version that can be specified in the XML service configuration
     * (.cscfg) for a cloud service.
     *
     * @param location Name of the location that the OS version pertains to.
     * @param osVersionName Name of the OS version.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a guest operating system version that can be specified in the XML service configuration
     *     (.cscfg) for a cloud service along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OSVersionInner> getOSVersionWithResponse(String location, String osVersionName, Context context);

    /**
     * Gets properties of a guest operating system version that can be specified in the XML service configuration
     * (.cscfg) for a cloud service.
     *
     * @param location Name of the location that the OS version pertains to.
     * @param osVersionName Name of the OS version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a guest operating system version that can be specified in the XML service configuration
     *     (.cscfg) for a cloud service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OSVersionInner getOSVersion(String location, String osVersionName);

    /**
     * Gets a list of all guest operating system versions available to be specified in the XML service configuration
     * (.cscfg) for a cloud service. Use nextLink property in the response to get the next page of OS versions. Do this
     * till nextLink is null to fetch all the OS versions.
     *
     * @param location Name of the location that the OS versions pertain to.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all guest operating system versions available to be specified in the XML service configuration
     *     (.cscfg) for a cloud service as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<OSVersionInner> listOSVersionsAsync(String location);

    /**
     * Gets a list of all guest operating system versions available to be specified in the XML service configuration
     * (.cscfg) for a cloud service. Use nextLink property in the response to get the next page of OS versions. Do this
     * till nextLink is null to fetch all the OS versions.
     *
     * @param location Name of the location that the OS versions pertain to.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all guest operating system versions available to be specified in the XML service configuration
     *     (.cscfg) for a cloud service as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OSVersionInner> listOSVersions(String location);

    /**
     * Gets a list of all guest operating system versions available to be specified in the XML service configuration
     * (.cscfg) for a cloud service. Use nextLink property in the response to get the next page of OS versions. Do this
     * till nextLink is null to fetch all the OS versions.
     *
     * @param location Name of the location that the OS versions pertain to.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all guest operating system versions available to be specified in the XML service configuration
     *     (.cscfg) for a cloud service as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OSVersionInner> listOSVersions(String location, Context context);

    /**
     * Gets properties of a guest operating system family that can be specified in the XML service configuration
     * (.cscfg) for a cloud service.
     *
     * @param location Name of the location that the OS family pertains to.
     * @param osFamilyName Name of the OS family.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a guest operating system family that can be specified in the XML service configuration
     *     (.cscfg) for a cloud service along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<OSFamilyInner>> getOSFamilyWithResponseAsync(String location, String osFamilyName);

    /**
     * Gets properties of a guest operating system family that can be specified in the XML service configuration
     * (.cscfg) for a cloud service.
     *
     * @param location Name of the location that the OS family pertains to.
     * @param osFamilyName Name of the OS family.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a guest operating system family that can be specified in the XML service configuration
     *     (.cscfg) for a cloud service on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<OSFamilyInner> getOSFamilyAsync(String location, String osFamilyName);

    /**
     * Gets properties of a guest operating system family that can be specified in the XML service configuration
     * (.cscfg) for a cloud service.
     *
     * @param location Name of the location that the OS family pertains to.
     * @param osFamilyName Name of the OS family.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a guest operating system family that can be specified in the XML service configuration
     *     (.cscfg) for a cloud service along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OSFamilyInner> getOSFamilyWithResponse(String location, String osFamilyName, Context context);

    /**
     * Gets properties of a guest operating system family that can be specified in the XML service configuration
     * (.cscfg) for a cloud service.
     *
     * @param location Name of the location that the OS family pertains to.
     * @param osFamilyName Name of the OS family.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a guest operating system family that can be specified in the XML service configuration
     *     (.cscfg) for a cloud service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OSFamilyInner getOSFamily(String location, String osFamilyName);

    /**
     * Gets a list of all guest operating system families available to be specified in the XML service configuration
     * (.cscfg) for a cloud service. Use nextLink property in the response to get the next page of OS Families. Do this
     * till nextLink is null to fetch all the OS Families.
     *
     * @param location Name of the location that the OS families pertain to.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all guest operating system families available to be specified in the XML service configuration
     *     (.cscfg) for a cloud service as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<OSFamilyInner> listOSFamiliesAsync(String location);

    /**
     * Gets a list of all guest operating system families available to be specified in the XML service configuration
     * (.cscfg) for a cloud service. Use nextLink property in the response to get the next page of OS Families. Do this
     * till nextLink is null to fetch all the OS Families.
     *
     * @param location Name of the location that the OS families pertain to.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all guest operating system families available to be specified in the XML service configuration
     *     (.cscfg) for a cloud service as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OSFamilyInner> listOSFamilies(String location);

    /**
     * Gets a list of all guest operating system families available to be specified in the XML service configuration
     * (.cscfg) for a cloud service. Use nextLink property in the response to get the next page of OS Families. Do this
     * till nextLink is null to fetch all the OS Families.
     *
     * @param location Name of the location that the OS families pertain to.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all guest operating system families available to be specified in the XML service configuration
     *     (.cscfg) for a cloud service as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<OSFamilyInner> listOSFamilies(String location, Context context);
}
