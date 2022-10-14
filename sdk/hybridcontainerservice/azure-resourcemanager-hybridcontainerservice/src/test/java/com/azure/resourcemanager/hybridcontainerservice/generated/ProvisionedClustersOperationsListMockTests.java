// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager;
import com.azure.resourcemanager.hybridcontainerservice.models.LicenseType;
import com.azure.resourcemanager.hybridcontainerservice.models.LoadBalancerSku;
import com.azure.resourcemanager.hybridcontainerservice.models.Mode;
import com.azure.resourcemanager.hybridcontainerservice.models.NetworkPolicy;
import com.azure.resourcemanager.hybridcontainerservice.models.OsType;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClustersResponse;
import com.azure.resourcemanager.hybridcontainerservice.models.ResourceIdentityType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ProvisionedClustersOperationsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"identity\":{\"principalId\":\"qmt\",\"tenantId\":\"ltmm\",\"type\":\"SystemAssigned\"},\"properties\":{\"enableRbac\":false,\"linuxProfile\":{\"adminUsername\":\"phvwauyqncygu\"},\"features\":{},\"addonProfiles\":{},\"controlPlane\":{\"name\":\"xqupevzhf\",\"count\":292167631,\"availabilityZones\":[],\"maxCount\":1386174682,\"maxPods\":2002904961,\"minCount\":1583022780,\"mode\":\"System\",\"nodeLabels\":{},\"nodeTaints\":[],\"osType\":\"Linux\",\"nodeImageVersion\":\"uvhixbjxyfwn\",\"vmSize\":\"r\"},\"kubernetesVersion\":\"lsttpkiwkkbnuj\",\"networkProfile\":{\"loadBalancerSku\":\"unmanaged\",\"dnsServiceIP\":\"lbfpncurd\",\"networkPolicy\":\"flannel\",\"podCidr\":\"ithtywu\",\"podCidrs\":[],\"serviceCidr\":\"bihwqknfdnt\",\"serviceCidrs\":[]},\"nodeResourceGroup\":\"hrdgoihxumwcto\",\"agentPoolProfiles\":[],\"cloudProviderProfile\":{},\"provisioningState\":\"Deleting\",\"status\":{\"addonStatus\":{},\"errorMessage\":\"gg\"},\"aadProfile\":{\"adminGroupObjectIDs\":[],\"clientAppID\":\"tov\",\"enableAzureRbac\":false,\"managed\":false,\"serverAppID\":\"nqfiufxqknpi\",\"tenantID\":\"nepttwqmsni\"},\"windowsProfile\":{\"adminUsername\":\"dmqnrojlpij\",\"enableCsiProxy\":false,\"licenseType\":\"None\"},\"httpProxyConfig\":{\"httpProxy\":\"dhcrati\",\"httpsProxy\":\"ronasxift\",\"noProxy\":[],\"trustedCa\":\"yzhftwesgogczh\",\"username\":\"nxkrlgnyhmossxkk\"}},\"extendedLocation\":{\"type\":\"rghxjb\",\"name\":\"qxvcxgfrpdsofb\"},\"location\":\"hrnsvbu\",\"tags\":{\"ybycnunvj\":\"vz\",\"ikyzirtxdy\":\"rtkfawnopq\",\"ejnt\":\"x\"},\"id\":\"sewgioilqukr\",\"name\":\"dxtqmieoxo\",\"type\":\"ggufhyaomtb\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        HybridContainerServiceManager manager =
            HybridContainerServiceManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ProvisionedClustersResponse> response =
            manager.provisionedClustersOperations().list(Context.NONE);

        Assertions.assertEquals("hrnsvbu", response.iterator().next().location());
        Assertions.assertEquals("vz", response.iterator().next().tags().get("ybycnunvj"));
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, response.iterator().next().identity().type());
        Assertions.assertEquals("tov", response.iterator().next().properties().aadProfile().clientAppId());
        Assertions.assertEquals(false, response.iterator().next().properties().aadProfile().enableAzureRbac());
        Assertions.assertEquals(false, response.iterator().next().properties().aadProfile().managed());
        Assertions.assertEquals("nqfiufxqknpi", response.iterator().next().properties().aadProfile().serverAppId());
        Assertions.assertEquals("nepttwqmsni", response.iterator().next().properties().aadProfile().tenantId());
        Assertions
            .assertEquals("dmqnrojlpij", response.iterator().next().properties().windowsProfile().adminUsername());
        Assertions.assertEquals(false, response.iterator().next().properties().windowsProfile().enableCsiProxy());
        Assertions
            .assertEquals(LicenseType.NONE, response.iterator().next().properties().windowsProfile().licenseType());
        Assertions.assertEquals("dhcrati", response.iterator().next().properties().httpProxyConfig().httpProxy());
        Assertions.assertEquals("ronasxift", response.iterator().next().properties().httpProxyConfig().httpsProxy());
        Assertions
            .assertEquals("yzhftwesgogczh", response.iterator().next().properties().httpProxyConfig().trustedCa());
        Assertions
            .assertEquals("nxkrlgnyhmossxkk", response.iterator().next().properties().httpProxyConfig().username());
        Assertions.assertEquals(false, response.iterator().next().properties().enableRbac());
        Assertions
            .assertEquals("phvwauyqncygu", response.iterator().next().properties().linuxProfile().adminUsername());
        Assertions.assertEquals(292167631, response.iterator().next().properties().controlPlane().count());
        Assertions.assertEquals(1386174682, response.iterator().next().properties().controlPlane().maxCount());
        Assertions.assertEquals(2002904961, response.iterator().next().properties().controlPlane().maxPods());
        Assertions.assertEquals(1583022780, response.iterator().next().properties().controlPlane().minCount());
        Assertions.assertEquals(Mode.SYSTEM, response.iterator().next().properties().controlPlane().mode());
        Assertions.assertEquals(OsType.LINUX, response.iterator().next().properties().controlPlane().osType());
        Assertions
            .assertEquals("uvhixbjxyfwn", response.iterator().next().properties().controlPlane().nodeImageVersion());
        Assertions.assertEquals("r", response.iterator().next().properties().controlPlane().vmSize());
        Assertions.assertEquals("xqupevzhf", response.iterator().next().properties().controlPlane().name());
        Assertions.assertEquals("lsttpkiwkkbnuj", response.iterator().next().properties().kubernetesVersion());
        Assertions
            .assertEquals(
                LoadBalancerSku.UNMANAGED, response.iterator().next().properties().networkProfile().loadBalancerSku());
        Assertions.assertEquals("lbfpncurd", response.iterator().next().properties().networkProfile().dnsServiceIp());
        Assertions
            .assertEquals(
                NetworkPolicy.FLANNEL, response.iterator().next().properties().networkProfile().networkPolicy());
        Assertions.assertEquals("ithtywu", response.iterator().next().properties().networkProfile().podCidr());
        Assertions.assertEquals("bihwqknfdnt", response.iterator().next().properties().networkProfile().serviceCidr());
        Assertions.assertEquals("hrdgoihxumwcto", response.iterator().next().properties().nodeResourceGroup());
        Assertions.assertEquals("rghxjb", response.iterator().next().extendedLocation().type());
        Assertions.assertEquals("qxvcxgfrpdsofb", response.iterator().next().extendedLocation().name());
    }
}
