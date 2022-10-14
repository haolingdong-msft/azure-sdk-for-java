// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.resourcemanager.appcontainers.models.Action;
import com.azure.resourcemanager.appcontainers.models.AppProtocol;
import com.azure.resourcemanager.appcontainers.models.BindingType;
import com.azure.resourcemanager.appcontainers.models.Configuration;
import com.azure.resourcemanager.appcontainers.models.Container;
import com.azure.resourcemanager.appcontainers.models.ContainerAppProbe;
import com.azure.resourcemanager.appcontainers.models.ContainerAppProbeHttpGet;
import com.azure.resourcemanager.appcontainers.models.ContainerAppProbeHttpGetHttpHeadersItem;
import com.azure.resourcemanager.appcontainers.models.ContainerAppProbeTcpSocket;
import com.azure.resourcemanager.appcontainers.models.ContainerResources;
import com.azure.resourcemanager.appcontainers.models.CustomDomain;
import com.azure.resourcemanager.appcontainers.models.CustomScaleRule;
import com.azure.resourcemanager.appcontainers.models.Dapr;
import com.azure.resourcemanager.appcontainers.models.Ingress;
import com.azure.resourcemanager.appcontainers.models.IngressTransportMethod;
import com.azure.resourcemanager.appcontainers.models.InitContainer;
import com.azure.resourcemanager.appcontainers.models.IpSecurityRestrictionRule;
import com.azure.resourcemanager.appcontainers.models.LogLevel;
import com.azure.resourcemanager.appcontainers.models.Scale;
import com.azure.resourcemanager.appcontainers.models.ScaleRule;
import com.azure.resourcemanager.appcontainers.models.TcpScaleRule;
import com.azure.resourcemanager.appcontainers.models.Template;
import com.azure.resourcemanager.appcontainers.models.TrafficWeight;
import com.azure.resourcemanager.appcontainers.models.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for ContainerApps CreateOrUpdate. */
public final class ContainerAppsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/preview/2022-06-01-preview/examples/ContainerApps_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or Update Container App.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void createOrUpdateContainerApp(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .containerApps()
            .define("testcontainerApp0")
            .withRegion("East US")
            .withExistingResourceGroup("rg")
            .withEnvironmentId(
                "/subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/rg/providers/Microsoft.App/managedEnvironments/demokube")
            .withWorkloadProfileType("GeneralPurpose")
            .withConfiguration(
                new Configuration()
                    .withIngress(
                        new Ingress()
                            .withExternal(true)
                            .withTargetPort(3000)
                            .withTraffic(
                                Arrays
                                    .asList(
                                        new TrafficWeight()
                                            .withRevisionName("testcontainerApp0-ab1234")
                                            .withWeight(100)
                                            .withLabel("production")))
                            .withCustomDomains(
                                Arrays
                                    .asList(
                                        new CustomDomain()
                                            .withName("www.my-name.com")
                                            .withBindingType(BindingType.SNI_ENABLED)
                                            .withCertificateId(
                                                "/subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/rg/providers/Microsoft.App/managedEnvironments/demokube/certificates/my-certificate-for-my-name-dot-com"),
                                        new CustomDomain()
                                            .withName("www.my-other-name.com")
                                            .withBindingType(BindingType.SNI_ENABLED)
                                            .withCertificateId(
                                                "/subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/rg/providers/Microsoft.App/managedEnvironments/demokube/certificates/my-certificate-for-my-other-name-dot-com")))
                            .withIpSecurityRestrictions(
                                Arrays
                                    .asList(
                                        new IpSecurityRestrictionRule()
                                            .withName("Allow work IP A subnet")
                                            .withDescription(
                                                "Allowing all IP's within the subnet below to access containerapp")
                                            .withIpAddressRange("192.168.1.1/32")
                                            .withAction(Action.ALLOW),
                                        new IpSecurityRestrictionRule()
                                            .withName("Allow work IP B subnet")
                                            .withDescription(
                                                "Allowing all IP's within the subnet below to access containerapp")
                                            .withIpAddressRange("192.168.1.1/8")
                                            .withAction(Action.ALLOW))))
                    .withDapr(
                        new Dapr()
                            .withEnabled(true)
                            .withAppProtocol(AppProtocol.HTTP)
                            .withAppPort(3000)
                            .withHttpReadBufferSize(30)
                            .withHttpMaxRequestSize(10)
                            .withLogLevel(LogLevel.DEBUG)
                            .withEnableApiLogging(true))
                    .withMaxInactiveRevisions(10))
            .withTemplate(
                new Template()
                    .withInitContainers(
                        Arrays
                            .asList(
                                new InitContainer()
                                    .withImage("repo/testcontainerApp0:v4")
                                    .withName("testinitcontainerApp0")
                                    .withCommand(Arrays.asList("/bin/sh"))
                                    .withArgs(Arrays.asList("-c", "while true; do echo hello; sleep 10;done"))
                                    .withResources(new ContainerResources().withCpu(0.2D).withMemory("100Mi"))))
                    .withContainers(
                        Arrays
                            .asList(
                                new Container()
                                    .withImage("repo/testcontainerApp0:v1")
                                    .withName("testcontainerApp0")
                                    .withProbes(
                                        Arrays
                                            .asList(
                                                new ContainerAppProbe()
                                                    .withHttpGet(
                                                        new ContainerAppProbeHttpGet()
                                                            .withHttpHeaders(
                                                                Arrays
                                                                    .asList(
                                                                        new ContainerAppProbeHttpGetHttpHeadersItem()
                                                                            .withName("Custom-Header")
                                                                            .withValue("Awesome")))
                                                            .withPath("/health")
                                                            .withPort(8080))
                                                    .withInitialDelaySeconds(3)
                                                    .withPeriodSeconds(3)
                                                    .withType(Type.LIVENESS)))))
                    .withScale(
                        new Scale()
                            .withMinReplicas(1)
                            .withMaxReplicas(5)
                            .withRules(
                                Arrays
                                    .asList(
                                        new ScaleRule()
                                            .withName("httpscalingrule")
                                            .withCustom(
                                                new CustomScaleRule()
                                                    .withType("http")
                                                    .withMetadata(mapOf("concurrentRequests", "50")))))))
            .create();
    }

    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/preview/2022-06-01-preview/examples/ContainerApps_TcpApp_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or Update Tcp App.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void createOrUpdateTcpApp(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .containerApps()
            .define("testcontainerAppTcp")
            .withRegion("East US")
            .withExistingResourceGroup("rg")
            .withEnvironmentId(
                "/subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/rg/providers/Microsoft.App/managedEnvironments/demokube")
            .withConfiguration(
                new Configuration()
                    .withIngress(
                        new Ingress()
                            .withExternal(true)
                            .withTargetPort(3000)
                            .withExposedPort(4000)
                            .withTransport(IngressTransportMethod.TCP)
                            .withTraffic(
                                Arrays
                                    .asList(
                                        new TrafficWeight()
                                            .withRevisionName("testcontainerAppTcp-ab1234")
                                            .withWeight(100)))))
            .withTemplate(
                new Template()
                    .withContainers(
                        Arrays
                            .asList(
                                new Container()
                                    .withImage("repo/testcontainerAppTcp:v1")
                                    .withName("testcontainerAppTcp")
                                    .withProbes(
                                        Arrays
                                            .asList(
                                                new ContainerAppProbe()
                                                    .withInitialDelaySeconds(3)
                                                    .withPeriodSeconds(3)
                                                    .withTcpSocket(new ContainerAppProbeTcpSocket().withPort(8080))
                                                    .withType(Type.LIVENESS)))))
                    .withScale(
                        new Scale()
                            .withMinReplicas(1)
                            .withMaxReplicas(5)
                            .withRules(
                                Arrays
                                    .asList(
                                        new ScaleRule()
                                            .withName("tcpscalingrule")
                                            .withTcp(
                                                new TcpScaleRule()
                                                    .withMetadata(mapOf("concurrentConnections", "50")))))))
            .create();
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
