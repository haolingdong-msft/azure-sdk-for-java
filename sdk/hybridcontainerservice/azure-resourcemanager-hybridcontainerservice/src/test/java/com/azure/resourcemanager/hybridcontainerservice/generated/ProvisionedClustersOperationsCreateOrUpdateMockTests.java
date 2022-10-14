// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager;
import com.azure.resourcemanager.hybridcontainerservice.models.AadProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.CloudProviderProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.ControlPlaneProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.HttpProxyConfig;
import com.azure.resourcemanager.hybridcontainerservice.models.LicenseType;
import com.azure.resourcemanager.hybridcontainerservice.models.LinuxProfileProperties;
import com.azure.resourcemanager.hybridcontainerservice.models.LoadBalancerSku;
import com.azure.resourcemanager.hybridcontainerservice.models.Mode;
import com.azure.resourcemanager.hybridcontainerservice.models.NetworkPolicy;
import com.azure.resourcemanager.hybridcontainerservice.models.NetworkProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.OsType;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClusterIdentity;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClustersAllProperties;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClustersCommonPropertiesFeatures;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClustersExtendedLocation;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClustersResponse;
import com.azure.resourcemanager.hybridcontainerservice.models.ResourceIdentityType;
import com.azure.resourcemanager.hybridcontainerservice.models.WindowsProfile;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ProvisionedClustersOperationsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"identity\":{\"principalId\":\"amtmcz\",\"tenantId\":\"m\",\"type\":\"None\"},\"properties\":{\"enableRbac\":false,\"linuxProfile\":{\"adminUsername\":\"ioknssxmoj\"},\"features\":{},\"addonProfiles\":{},\"controlPlane\":{\"name\":\"wcfzqljyxgt\",\"count\":981677943,\"availabilityZones\":[],\"maxCount\":1722960093,\"maxPods\":1160079835,\"minCount\":1835924775,\"mode\":\"System\",\"nodeLabels\":{},\"nodeTaints\":[],\"osType\":\"Windows\",\"nodeImageVersion\":\"hvbbxuripltfnh\",\"vmSize\":\"axkgx\"},\"kubernetesVersion\":\"ckpyklyhplu\",\"networkProfile\":{\"loadBalancerSku\":\"unstacked-haproxy\",\"dnsServiceIP\":\"udlgzibthostgkts\",\"networkPolicy\":\"flannel\",\"podCidr\":\"eclze\",\"podCidrs\":[],\"serviceCidr\":\"cvhzlhp\",\"serviceCidrs\":[]},\"nodeResourceGroup\":\"qkdlw\",\"agentPoolProfiles\":[],\"cloudProviderProfile\":{},\"provisioningState\":\"Succeeded\",\"status\":{\"addonStatus\":{},\"errorMessage\":\"jfsmlmbtxhwgfwsr\"},\"aadProfile\":{\"adminGroupObjectIDs\":[],\"clientAppID\":\"ezbrhubskh\",\"enableAzureRbac\":false,\"managed\":false,\"serverAppID\":\"okkqfqjbvleo\",\"tenantID\":\"ml\"},\"windowsProfile\":{\"adminUsername\":\"tqzfavyv\",\"enableCsiProxy\":true,\"licenseType\":\"Windows_Server\"},\"httpProxyConfig\":{\"httpProxy\":\"yeua\",\"httpsProxy\":\"kq\",\"noProxy\":[],\"trustedCa\":\"gzslesjcbhernnti\",\"username\":\"djc\"}},\"extendedLocation\":{\"type\":\"wr\",\"name\":\"hwagohbuffkmrqe\"},\"location\":\"vvhmxtdrj\",\"tags\":{\"ewzcjznmwcp\":\"acoebj\"},\"id\":\"guaadraufactkahz\",\"name\":\"v\",\"type\":\"jjziuxxpsh\"}";

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

        ProvisionedClustersResponse response =
            manager
                .provisionedClustersOperations()
                .define("pjbi")
                .withRegion("huwrykqgaifm")
                .withExistingResourceGroup("hhavgrvkffovjz")
                .withTags(mapOf("dvk", "lb", "srhnjivo", "bejdznxcv"))
                .withIdentity(new ProvisionedClusterIdentity().withType(ResourceIdentityType.NONE))
                .withProperties(
                    new ProvisionedClustersAllProperties()
                        .withAadProfile(
                            new AadProfile()
                                .withServerAppSecret("nfqn")
                                .withAdminGroupObjectIDs(Arrays.asList())
                                .withClientAppId("gjup")
                                .withEnableAzureRbac(true)
                                .withManaged(false)
                                .withServerAppId("oqh")
                                .withTenantId("ejqgw"))
                        .withWindowsProfile(
                            new WindowsProfile()
                                .withAdminUsername("mwks")
                                .withEnableCsiProxy(true)
                                .withLicenseType(LicenseType.WINDOWS_SERVER)
                                .withAdminPassword("psxjvf"))
                        .withHttpProxyConfig(
                            new HttpProxyConfig()
                                .withHttpProxy("t")
                                .withHttpsProxy("rtwnawjslbi")
                                .withNoProxy(Arrays.asList())
                                .withTrustedCa("jgcyztsfmznba")
                                .withUsername("ph")
                                .withPassword("xvydfceacvlhvygd"))
                        .withEnableRbac(true)
                        .withLinuxProfile(new LinuxProfileProperties().withAdminUsername("mvzzbtdcqvp"))
                        .withFeatures(new ProvisionedClustersCommonPropertiesFeatures())
                        .withAddonProfiles(mapOf())
                        .withControlPlane(
                            new ControlPlaneProfile()
                                .withCount(224040944)
                                .withAvailabilityZones(Arrays.asList())
                                .withMaxCount(482373530)
                                .withMaxPods(593893972)
                                .withMinCount(692564067)
                                .withMode(Mode.SYSTEM)
                                .withNodeLabels(mapOf())
                                .withNodeTaints(Arrays.asList())
                                .withOsType(OsType.LINUX)
                                .withNodeImageVersion("fmwncotmrfh")
                                .withVmSize("ctymoxoftp")
                                .withName("dshf"))
                        .withKubernetesVersion("wycz")
                        .withNetworkProfile(
                            new NetworkProfile()
                                .withLoadBalancerSku(LoadBalancerSku.STACKED_METALLB)
                                .withDnsServiceIp("qjlihhyuspska")
                                .withNetworkPolicy(NetworkPolicy.FLANNEL)
                                .withPodCidr("mfwdgzxu")
                                .withPodCidrs(Arrays.asList())
                                .withServiceCidr("vpa")
                                .withServiceCidrs(Arrays.asList()))
                        .withNodeResourceGroup("reuzvxurisjn")
                        .withAgentPoolProfiles(Arrays.asList())
                        .withCloudProviderProfile(new CloudProviderProfile()))
                .withExtendedLocation(new ProvisionedClustersExtendedLocation().withType("rn").withName("x"))
                .create();

        Assertions.assertEquals("vvhmxtdrj", response.location());
        Assertions.assertEquals("acoebj", response.tags().get("ewzcjznmwcp"));
        Assertions.assertEquals(ResourceIdentityType.NONE, response.identity().type());
        Assertions.assertEquals("ezbrhubskh", response.properties().aadProfile().clientAppId());
        Assertions.assertEquals(false, response.properties().aadProfile().enableAzureRbac());
        Assertions.assertEquals(false, response.properties().aadProfile().managed());
        Assertions.assertEquals("okkqfqjbvleo", response.properties().aadProfile().serverAppId());
        Assertions.assertEquals("ml", response.properties().aadProfile().tenantId());
        Assertions.assertEquals("tqzfavyv", response.properties().windowsProfile().adminUsername());
        Assertions.assertEquals(true, response.properties().windowsProfile().enableCsiProxy());
        Assertions.assertEquals(LicenseType.WINDOWS_SERVER, response.properties().windowsProfile().licenseType());
        Assertions.assertEquals("yeua", response.properties().httpProxyConfig().httpProxy());
        Assertions.assertEquals("kq", response.properties().httpProxyConfig().httpsProxy());
        Assertions.assertEquals("gzslesjcbhernnti", response.properties().httpProxyConfig().trustedCa());
        Assertions.assertEquals("djc", response.properties().httpProxyConfig().username());
        Assertions.assertEquals(false, response.properties().enableRbac());
        Assertions.assertEquals("ioknssxmoj", response.properties().linuxProfile().adminUsername());
        Assertions.assertEquals(981677943, response.properties().controlPlane().count());
        Assertions.assertEquals(1722960093, response.properties().controlPlane().maxCount());
        Assertions.assertEquals(1160079835, response.properties().controlPlane().maxPods());
        Assertions.assertEquals(1835924775, response.properties().controlPlane().minCount());
        Assertions.assertEquals(Mode.SYSTEM, response.properties().controlPlane().mode());
        Assertions.assertEquals(OsType.WINDOWS, response.properties().controlPlane().osType());
        Assertions.assertEquals("hvbbxuripltfnh", response.properties().controlPlane().nodeImageVersion());
        Assertions.assertEquals("axkgx", response.properties().controlPlane().vmSize());
        Assertions.assertEquals("wcfzqljyxgt", response.properties().controlPlane().name());
        Assertions.assertEquals("ckpyklyhplu", response.properties().kubernetesVersion());
        Assertions
            .assertEquals(LoadBalancerSku.UNSTACKED_HAPROXY, response.properties().networkProfile().loadBalancerSku());
        Assertions.assertEquals("udlgzibthostgkts", response.properties().networkProfile().dnsServiceIp());
        Assertions.assertEquals(NetworkPolicy.FLANNEL, response.properties().networkProfile().networkPolicy());
        Assertions.assertEquals("eclze", response.properties().networkProfile().podCidr());
        Assertions.assertEquals("cvhzlhp", response.properties().networkProfile().serviceCidr());
        Assertions.assertEquals("qkdlw", response.properties().nodeResourceGroup());
        Assertions.assertEquals("wr", response.extendedLocation().type());
        Assertions.assertEquals("hwagohbuffkmrqe", response.extendedLocation().name());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
