// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sqlvirtualmachine.SqlVirtualMachineManager;
import com.azure.resourcemanager.sqlvirtualmachine.models.BackupScheduleType;
import com.azure.resourcemanager.sqlvirtualmachine.models.DayOfWeek;
import com.azure.resourcemanager.sqlvirtualmachine.models.DiskConfigurationType;
import com.azure.resourcemanager.sqlvirtualmachine.models.FullBackupFrequencyType;
import com.azure.resourcemanager.sqlvirtualmachine.models.IdentityType;
import com.azure.resourcemanager.sqlvirtualmachine.models.LeastPrivilegeMode;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlImageSku;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlManagementMode;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlServerLicenseType;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlVirtualMachine;
import com.azure.resourcemanager.sqlvirtualmachine.models.StorageWorkloadType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class SqlVirtualMachinesListByResourceGroupTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"identity\":{\"type\":\"None\"},\"properties\":{\"virtualMachineResourceId\":\"odsotbobzdop\",\"provisioningState\":\"wvnhdldwmgx\",\"sqlImageOffer\":\"rslpmutwuoeg\",\"sqlServerLicenseType\":\"AHUB\",\"sqlManagement\":\"LightWeight\",\"leastPrivilegeMode\":\"Enabled\",\"sqlImageSku\":\"Developer\",\"sqlVirtualMachineGroupResourceId\":\"sluicpdggkzz\",\"wsfcDomainCredentials\":{\"clusterBootstrapAccountPassword\":\"bmpaxmodfvu\",\"clusterOperatorAccountPassword\":\"yw\",\"sqlServiceAccountPassword\":\"pfvmwyhrfou\"},\"wsfcStaticIp\":\"taakc\",\"autoPatchingSettings\":{\"enable\":false,\"dayOfWeek\":\"Wednesday\",\"maintenanceWindowStartingHour\":1814420357,\"maintenanceWindowDuration\":1349275484},\"autoBackupSettings\":{\"enable\":true,\"enableEncryption\":true,\"retentionPeriod\":1989438546,\"storageAccountUrl\":\"smond\",\"storageContainerName\":\"quxvypomgkop\",\"storageAccessKey\":\"hojvpajqgxysmocm\",\"password\":\"fqvm\",\"backupSystemDbs\":false,\"backupScheduleType\":\"Manual\",\"fullBackupFrequency\":\"Weekly\",\"daysOfWeek\":[],\"fullBackupStartTime\":1382848835,\"fullBackupWindowHours\":760338850,\"logBackupFrequency\":1009044014},\"keyVaultCredentialSettings\":{\"enable\":false,\"credentialName\":\"tddckcb\",\"azureKeyVaultUrl\":\"ejrjxgciqibrho\",\"servicePrincipalName\":\"sdqrhzoymibmrq\",\"servicePrincipalSecret\":\"bahwfl\"},\"serverConfigurationsManagementSettings\":{},\"storageConfigurationSettings\":{\"sqlSystemDbOnDataDisk\":false,\"diskConfigurationType\":\"NEW\",\"storageWorkloadType\":\"OLTP\"},\"assessmentSettings\":{\"enable\":true,\"runImmediately\":false},\"enableAutomaticUpgrade\":true},\"location\":\"giwbwoenwa\",\"tags\":{\"xwbpokulpiuj\":\"tdtkcn\",\"obyu\":\"aasipqi\",\"dbutauvfbtkuwhh\":\"erpqlpqwcciuqg\"},\"id\":\"hykojoxafnndlpic\",\"name\":\"koymkcd\",\"type\":\"h\"}]}";

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

        SqlVirtualMachineManager manager =
            SqlVirtualMachineManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<SqlVirtualMachine> response =
            manager.sqlVirtualMachines().listByResourceGroup("bcvkcvqvpkeq", Context.NONE);

        Assertions.assertEquals("giwbwoenwa", response.iterator().next().location());
        Assertions.assertEquals("tdtkcn", response.iterator().next().tags().get("xwbpokulpiuj"));
        Assertions.assertEquals(IdentityType.NONE, response.iterator().next().identity().type());
        Assertions.assertEquals("odsotbobzdop", response.iterator().next().virtualMachineResourceId());
        Assertions.assertEquals("rslpmutwuoeg", response.iterator().next().sqlImageOffer());
        Assertions.assertEquals(SqlServerLicenseType.AHUB, response.iterator().next().sqlServerLicenseType());
        Assertions.assertEquals(SqlManagementMode.LIGHT_WEIGHT, response.iterator().next().sqlManagement());
        Assertions.assertEquals(LeastPrivilegeMode.ENABLED, response.iterator().next().leastPrivilegeMode());
        Assertions.assertEquals(SqlImageSku.DEVELOPER, response.iterator().next().sqlImageSku());
        Assertions.assertEquals("sluicpdggkzz", response.iterator().next().sqlVirtualMachineGroupResourceId());
        Assertions
            .assertEquals(
                "bmpaxmodfvu", response.iterator().next().wsfcDomainCredentials().clusterBootstrapAccountPassword());
        Assertions
            .assertEquals("yw", response.iterator().next().wsfcDomainCredentials().clusterOperatorAccountPassword());
        Assertions
            .assertEquals(
                "pfvmwyhrfou", response.iterator().next().wsfcDomainCredentials().sqlServiceAccountPassword());
        Assertions.assertEquals("taakc", response.iterator().next().wsfcStaticIp());
        Assertions.assertEquals(false, response.iterator().next().autoPatchingSettings().enable());
        Assertions.assertEquals(DayOfWeek.WEDNESDAY, response.iterator().next().autoPatchingSettings().dayOfWeek());
        Assertions
            .assertEquals(
                1814420357, response.iterator().next().autoPatchingSettings().maintenanceWindowStartingHour());
        Assertions
            .assertEquals(1349275484, response.iterator().next().autoPatchingSettings().maintenanceWindowDuration());
        Assertions.assertEquals(true, response.iterator().next().autoBackupSettings().enable());
        Assertions.assertEquals(true, response.iterator().next().autoBackupSettings().enableEncryption());
        Assertions.assertEquals(1989438546, response.iterator().next().autoBackupSettings().retentionPeriod());
        Assertions.assertEquals("smond", response.iterator().next().autoBackupSettings().storageAccountUrl());
        Assertions.assertEquals("quxvypomgkop", response.iterator().next().autoBackupSettings().storageContainerName());
        Assertions.assertEquals("hojvpajqgxysmocm", response.iterator().next().autoBackupSettings().storageAccessKey());
        Assertions.assertEquals("fqvm", response.iterator().next().autoBackupSettings().password());
        Assertions.assertEquals(false, response.iterator().next().autoBackupSettings().backupSystemDbs());
        Assertions
            .assertEquals(
                BackupScheduleType.MANUAL, response.iterator().next().autoBackupSettings().backupScheduleType());
        Assertions
            .assertEquals(
                FullBackupFrequencyType.WEEKLY, response.iterator().next().autoBackupSettings().fullBackupFrequency());
        Assertions.assertEquals(1382848835, response.iterator().next().autoBackupSettings().fullBackupStartTime());
        Assertions.assertEquals(760338850, response.iterator().next().autoBackupSettings().fullBackupWindowHours());
        Assertions.assertEquals(1009044014, response.iterator().next().autoBackupSettings().logBackupFrequency());
        Assertions.assertEquals(false, response.iterator().next().keyVaultCredentialSettings().enable());
        Assertions.assertEquals("tddckcb", response.iterator().next().keyVaultCredentialSettings().credentialName());
        Assertions
            .assertEquals("ejrjxgciqibrho", response.iterator().next().keyVaultCredentialSettings().azureKeyVaultUrl());
        Assertions
            .assertEquals(
                "sdqrhzoymibmrq", response.iterator().next().keyVaultCredentialSettings().servicePrincipalName());
        Assertions
            .assertEquals("bahwfl", response.iterator().next().keyVaultCredentialSettings().servicePrincipalSecret());
        Assertions
            .assertEquals(false, response.iterator().next().storageConfigurationSettings().sqlSystemDbOnDataDisk());
        Assertions
            .assertEquals(
                DiskConfigurationType.NEW,
                response.iterator().next().storageConfigurationSettings().diskConfigurationType());
        Assertions
            .assertEquals(
                StorageWorkloadType.OLTP,
                response.iterator().next().storageConfigurationSettings().storageWorkloadType());
        Assertions.assertEquals(true, response.iterator().next().assessmentSettings().enable());
        Assertions.assertEquals(false, response.iterator().next().assessmentSettings().runImmediately());
        Assertions.assertEquals(true, response.iterator().next().enableAutomaticUpgrade());
    }
}
