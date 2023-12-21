// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.servicefabric.ServiceFabricManager;
import com.azure.resourcemanager.servicefabric.models.ApplicationResource;
import com.azure.resourcemanager.servicefabric.models.ArmUpgradeFailureAction;
import com.azure.resourcemanager.servicefabric.models.ManagedIdentityType;
import com.azure.resourcemanager.servicefabric.models.RollingUpgradeMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ApplicationsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"identity\":{\"principalId\":\"tgk\",\"tenantId\":\"tvdxeclzedqb\",\"type\":\"None\",\"userAssignedIdentities\":{\"fsmlmbtxhwgfw\":{\"principalId\":\"plodqkdlwwqfbu\",\"clientId\":\"kxtrq\"}}},\"properties\":{\"provisioningState\":\"a\",\"typeName\":\"oezbrhubsk\",\"typeVersion\":\"dyg\",\"parameters\":{\"rfmluiqtq\":\"kkqfqjbvle\",\"yvnqqybaryeuay\":\"fa\",\"bqgzslesjcbhern\":\"kq\"},\"upgradePolicy\":{\"upgradeReplicaSetCheckTimeout\":\"ewdjcvbquwrb\",\"forceRestart\":true,\"rollingUpgradeMonitoringPolicy\":{\"failureAction\":\"Rollback\",\"healthCheckWaitDuration\":\"buffkmrqemvvhm\",\"healthCheckStableDuration\":\"drjf\",\"healthCheckRetryTimeout\":\"acoebj\",\"upgradeTimeout\":\"wzcjznmwcpmgua\",\"upgradeDomainTimeout\":\"raufactkahzova\"},\"applicationHealthPolicy\":{\"considerWarningAsError\":true,\"maxPercentUnhealthyDeployedApplications\":347971797,\"defaultServiceTypeHealthPolicy\":{\"maxPercentUnhealthyServices\":113664127,\"maxPercentUnhealthyPartitionsPerService\":1959547059,\"maxPercentUnhealthyReplicasPerPartition\":196518772},\"serviceTypeHealthPolicyMap\":{\"lfg\":{},\"lqubkwdlen\":{}}},\"upgradeMode\":\"UnmonitoredAuto\",\"recreateApplication\":true},\"minimumNodes\":5032851596424421907,\"maximumNodes\":3773912633867560647,\"removeApplicationCapacity\":false,\"metrics\":[{\"name\":\"inyflnorwmduvwp\",\"maximumCapacity\":7997351295761854478,\"reservationCapacity\":2959519988127241657,\"totalApplicationCapacity\":8236469646650196378},{\"name\":\"gpqch\",\"maximumCapacity\":4486802272843555243,\"reservationCapacity\":3778167690103643206,\"totalApplicationCapacity\":6219904994785247374},{\"name\":\"xgibbda\",\"maximumCapacity\":3690608915062764768,\"reservationCapacity\":5258496855323298629,\"totalApplicationCapacity\":4529300263395127628},{\"name\":\"sukokwbqplhl\",\"maximumCapacity\":8356054412580573793,\"reservationCapacity\":7056990023571937899,\"totalApplicationCapacity\":864057560368064195}],\"managedIdentities\":[{\"name\":\"zsoldwey\",\"principalId\":\"qdunvmnnrwrbior\"},{\"name\":\"talywjhhgdnhxms\",\"principalId\":\"v\"},{\"name\":\"omi\",\"principalId\":\"ox\"},{\"name\":\"gdufiqnd\",\"principalId\":\"euzaof\"}]},\"location\":\"hvcyyysfg\",\"tags\":{\"qonmacj\":\"cubiipuipw\",\"izsh\":\"k\",\"gmblrri\":\"vcimpev\",\"rwfscjfnynszquj\":\"bywdxsmicc\"},\"etag\":\"dvoqyt\",\"id\":\"yo\",\"name\":\"bblgyavut\",\"type\":\"thjoxoism\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        ServiceFabricManager manager = ServiceFabricManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        ApplicationResource response = manager.applications()
            .getWithResponse("uodpv", "uudl", "zibt", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals(ManagedIdentityType.NONE, response.identity().type());
        Assertions.assertEquals("hvcyyysfg", response.location());
        Assertions.assertEquals("cubiipuipw", response.tags().get("qonmacj"));
        Assertions.assertEquals("oezbrhubsk", response.typeName());
        Assertions.assertEquals("dyg", response.typeVersion());
        Assertions.assertEquals("kkqfqjbvle", response.parameters().get("rfmluiqtq"));
        Assertions.assertEquals("ewdjcvbquwrb", response.upgradePolicy().upgradeReplicaSetCheckTimeout());
        Assertions.assertEquals(true, response.upgradePolicy().forceRestart());
        Assertions.assertEquals(ArmUpgradeFailureAction.ROLLBACK,
            response.upgradePolicy().rollingUpgradeMonitoringPolicy().failureAction());
        Assertions.assertEquals("buffkmrqemvvhm",
            response.upgradePolicy().rollingUpgradeMonitoringPolicy().healthCheckWaitDuration());
        Assertions.assertEquals("drjf",
            response.upgradePolicy().rollingUpgradeMonitoringPolicy().healthCheckStableDuration());
        Assertions.assertEquals("acoebj",
            response.upgradePolicy().rollingUpgradeMonitoringPolicy().healthCheckRetryTimeout());
        Assertions.assertEquals("wzcjznmwcpmgua",
            response.upgradePolicy().rollingUpgradeMonitoringPolicy().upgradeTimeout());
        Assertions.assertEquals("raufactkahzova",
            response.upgradePolicy().rollingUpgradeMonitoringPolicy().upgradeDomainTimeout());
        Assertions.assertEquals(true, response.upgradePolicy().applicationHealthPolicy().considerWarningAsError());
        Assertions.assertEquals(347971797,
            response.upgradePolicy().applicationHealthPolicy().maxPercentUnhealthyDeployedApplications());
        Assertions.assertEquals(113664127, response.upgradePolicy().applicationHealthPolicy()
            .defaultServiceTypeHealthPolicy().maxPercentUnhealthyServices());
        Assertions.assertEquals(1959547059, response.upgradePolicy().applicationHealthPolicy()
            .defaultServiceTypeHealthPolicy().maxPercentUnhealthyPartitionsPerService());
        Assertions.assertEquals(196518772, response.upgradePolicy().applicationHealthPolicy()
            .defaultServiceTypeHealthPolicy().maxPercentUnhealthyReplicasPerPartition());
        Assertions.assertEquals(RollingUpgradeMode.UNMONITORED_AUTO, response.upgradePolicy().upgradeMode());
        Assertions.assertEquals(true, response.upgradePolicy().recreateApplication());
        Assertions.assertEquals(5032851596424421907L, response.minimumNodes());
        Assertions.assertEquals(3773912633867560647L, response.maximumNodes());
        Assertions.assertEquals(false, response.removeApplicationCapacity());
        Assertions.assertEquals("inyflnorwmduvwp", response.metrics().get(0).name());
        Assertions.assertEquals(7997351295761854478L, response.metrics().get(0).maximumCapacity());
        Assertions.assertEquals(2959519988127241657L, response.metrics().get(0).reservationCapacity());
        Assertions.assertEquals(8236469646650196378L, response.metrics().get(0).totalApplicationCapacity());
        Assertions.assertEquals("zsoldwey", response.managedIdentities().get(0).name());
        Assertions.assertEquals("qdunvmnnrwrbior", response.managedIdentities().get(0).principalId());
    }
}
