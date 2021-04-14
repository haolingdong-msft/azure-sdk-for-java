// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry;

import com.azure.containers.containerregistry.models.RepositoryProperties;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.HttpClient;
import com.azure.core.test.implementation.ImplUtils;
import com.azure.core.util.Context;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.azure.containers.containerregistry.TestUtils.ALPINE_REPOSITORY_NAME;
import static com.azure.containers.containerregistry.TestUtils.DISPLAY_NAME_WITH_ARGUMENTS;
import static com.azure.containers.containerregistry.TestUtils.HELLO_WORLD_REPOSITORY_NAME;
import static com.azure.containers.containerregistry.TestUtils.PAGESIZE_2;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ContainerRegistryClientTest extends ContainerRegistryClientsTestBase {
    private ContainerRegistryClient client;

    @BeforeAll
    static void beforeAll() {
        TestUtils.importImage(ImplUtils.getTestMode(), HELLO_WORLD_REPOSITORY_NAME, Arrays.asList("latest", "v1", "v2", "v3", "v4"));
        TestUtils.importImage(ImplUtils.getTestMode(), ALPINE_REPOSITORY_NAME, Arrays.asList("latest"));
    }

    private ContainerRegistryClient getContainerRegistryClient(HttpClient httpClient) {
        return getContainerRegistryBuilder(httpClient).buildClient();
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void listRepositories(HttpClient httpClient) {
        client = getContainerRegistryClient(httpClient);

        List<String> repositories = client.listRepositories().stream().collect(Collectors.toList());
        repositories.containsAll(Arrays.asList(TestUtils.HELLO_WORLD_REPOSITORY_NAME, TestUtils.ALPINE_REPOSITORY_NAME));
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void listRepositoriesWithPageSize(HttpClient httpClient) {
        client = getContainerRegistryClient(httpClient);

        ArrayList<String> repositories = new ArrayList<>();
        client.listRepositories().iterableByPage(PAGESIZE_2).forEach(res -> res.getValue().forEach(repo -> repositories.add(repo)));
        repositories.containsAll(Arrays.asList(TestUtils.HELLO_WORLD_REPOSITORY_NAME, TestUtils.ALPINE_REPOSITORY_NAME));
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void deleteRepositoryThrows(HttpClient httpClient) {
        client = getContainerRegistryClient(httpClient);
        assertThrows(NullPointerException.class, () -> client.deleteRepository(null));
        assertThrows(ResourceNotFoundException.class, () -> client.deleteRepository("missingRepo"));
        assertThrows(NullPointerException.class, () -> client.deleteRepositoryWithResponse(null, Context.NONE));
        assertThrows(ResourceNotFoundException.class, () -> client.deleteRepositoryWithResponse("missingRepo", Context.NONE));
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("getHttpClients")
    public void getContainerRepositoryClient(HttpClient httpClient) {
        client = getContainerRegistryClient(httpClient);

        ContainerRepositoryClient repositoryClient = client.getRepositoryClient(HELLO_WORLD_REPOSITORY_NAME);
        assertNotNull(repositoryClient);
        RepositoryProperties props = repositoryClient.getProperties();
        validateProperties(props);
    }
}
