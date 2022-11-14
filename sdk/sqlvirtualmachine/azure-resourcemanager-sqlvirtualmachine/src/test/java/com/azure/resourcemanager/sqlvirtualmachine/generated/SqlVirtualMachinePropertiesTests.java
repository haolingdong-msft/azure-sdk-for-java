// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sqlvirtualmachine.fluent.models.SqlVirtualMachineProperties;
import com.azure.resourcemanager.sqlvirtualmachine.models.AdditionalFeaturesServerConfigurations;
import com.azure.resourcemanager.sqlvirtualmachine.models.AssessmentDayOfWeek;
import com.azure.resourcemanager.sqlvirtualmachine.models.AssessmentSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.AutoBackupDaysOfWeek;
import com.azure.resourcemanager.sqlvirtualmachine.models.AutoBackupSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.AutoPatchingSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.BackupScheduleType;
import com.azure.resourcemanager.sqlvirtualmachine.models.ConnectivityType;
import com.azure.resourcemanager.sqlvirtualmachine.models.DayOfWeek;
import com.azure.resourcemanager.sqlvirtualmachine.models.DiskConfigurationType;
import com.azure.resourcemanager.sqlvirtualmachine.models.FullBackupFrequencyType;
import com.azure.resourcemanager.sqlvirtualmachine.models.KeyVaultCredentialSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.LeastPrivilegeMode;
import com.azure.resourcemanager.sqlvirtualmachine.models.Schedule;
import com.azure.resourcemanager.sqlvirtualmachine.models.ServerConfigurationsManagementSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlConnectivityUpdateSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlImageSku;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlInstanceSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlManagementMode;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlServerLicenseType;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlStorageSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlStorageUpdateSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlTempDbSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlWorkloadType;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlWorkloadTypeUpdateSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.StorageConfigurationSettings;
import com.azure.resourcemanager.sqlvirtualmachine.models.StorageWorkloadType;
import com.azure.resourcemanager.sqlvirtualmachine.models.WsfcDomainCredentials;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SqlVirtualMachinePropertiesTests {
    @Test
    public void testDeserialize() {
        SqlVirtualMachineProperties model =
            BinaryData
                .fromString(
                    "{\"virtualMachineResourceId\":\"myzydagfuaxbez\",\"provisioningState\":\"uokktwhrdxwz\",\"sqlImageOffer\":\"q\",\"sqlServerLicenseType\":\"DR\",\"sqlManagement\":\"LightWeight\",\"leastPrivilegeMode\":\"Enabled\",\"sqlImageSku\":\"Web\",\"sqlVirtualMachineGroupResourceId\":\"o\",\"wsfcDomainCredentials\":{\"clusterBootstrapAccountPassword\":\"fakeBootstrapCredentialPlaceholder\",\"clusterOperatorAccountPassword\":\"fakeOperatorCredentialPlaceholder\",\"sqlServiceAccountPassword\":\"fakeSqlServiceAccountPasswordPlaceholder\"},\"wsfcStaticIp\":\"xhqyudxorrqnb\",\"autoPatchingSettings\":{\"enable\":true,\"dayOfWeek\":\"Sunday\",\"maintenanceWindowStartingHour\":2041227856,\"maintenanceWindowDuration\":688230720},\"autoBackupSettings\":{\"enable\":true,\"enableEncryption\":false,\"retentionPeriod\":711383541,\"storageAccountUrl\":\"rm\",\"storageContainerName\":\"d\",\"storageAccessKey\":\"fakeAutoBackupStorageCredentialPlaceholder\",\"password\":\"fakeAutoBackupCredentialPlaceholder\",\"backupSystemDbs\":false,\"backupScheduleType\":\"Manual\",\"fullBackupFrequency\":\"Weekly\",\"daysOfWeek\":[\"Monday\",\"Tuesday\",\"Sunday\"],\"fullBackupStartTime\":79438477,\"fullBackupWindowHours\":1785940860,\"logBackupFrequency\":1882721753},\"keyVaultCredentialSettings\":{\"enable\":false,\"credentialName\":\"lhzdobp\",\"azureKeyVaultUrl\":\"mflbv\",\"servicePrincipalName\":\"chrkcciwwzjuqk\",\"servicePrincipalSecret\":\"fakeServicePrincipleSecretPlaceholder\"},\"serverConfigurationsManagementSettings\":{\"sqlConnectivityUpdateSettings\":{\"connectivityType\":\"PUBLIC\",\"port\":1163138760,\"sqlAuthUpdateUserName\":\"fakeSqlAuthUpdateUserNamePlaceholder\",\"sqlAuthUpdatePassword\":\"fakeSqlAuthUpdatePasswordPlaceholder\"},\"sqlWorkloadTypeUpdateSettings\":{\"sqlWorkloadType\":\"DW\"},\"sqlStorageUpdateSettings\":{\"diskCount\":93185233,\"startingDeviceId\":499062312,\"diskConfigurationType\":\"NEW\"},\"additionalFeaturesServerConfigurations\":{\"isRServicesEnabled\":true},\"sqlInstanceSettings\":{\"collation\":\"hocohslkev\",\"maxDop\":1452843037,\"isOptimizeForAdHocWorkloadsEnabled\":false,\"minServerMemoryMB\":1915206631,\"maxServerMemoryMB\":635098272,\"isLpimEnabled\":true,\"isIfiEnabled\":true}},\"storageConfigurationSettings\":{\"sqlDataSettings\":{\"luns\":[750094319,441262471],\"defaultFilePath\":\"ithlvmezyvshxm\"},\"sqlLogSettings\":{\"luns\":[2042967034,820071175,681165656],\"defaultFilePath\":\"igrxwburvjxxjn\"},\"sqlTempDbSettings\":{\"dataFileSize\":655244901,\"dataGrowth\":796522407,\"logFileSize\":1581089013,\"logGrowth\":1482419493,\"dataFileCount\":368872056,\"persistFolder\":true,\"persistFolderPath\":\"vudwtiukbldng\",\"luns\":[2138211196,1997522468,655680628],\"defaultFilePath\":\"z\"},\"sqlSystemDbOnDataDisk\":false,\"diskConfigurationType\":\"ADD\",\"storageWorkloadType\":\"OLTP\"},\"assessmentSettings\":{\"enable\":true,\"runImmediately\":true,\"schedule\":{\"enable\":false,\"weeklyInterval\":2112033193,\"monthlyOccurrence\":2000492920,\"dayOfWeek\":\"Sunday\",\"startTime\":\"typmrbpizcdrqjsd\"}},\"enableAutomaticUpgrade\":true}")
                .toObject(SqlVirtualMachineProperties.class);
        Assertions.assertEquals("myzydagfuaxbez", model.virtualMachineResourceId());
        Assertions.assertEquals("q", model.sqlImageOffer());
        Assertions.assertEquals(SqlServerLicenseType.DR, model.sqlServerLicenseType());
        Assertions.assertEquals(SqlManagementMode.LIGHT_WEIGHT, model.sqlManagement());
        Assertions.assertEquals(LeastPrivilegeMode.ENABLED, model.leastPrivilegeMode());
        Assertions.assertEquals(SqlImageSku.WEB, model.sqlImageSku());
        Assertions.assertEquals("o", model.sqlVirtualMachineGroupResourceId());
        Assertions.assertEquals("fakeBootstrapCredentialPlaceholder", model.wsfcDomainCredentials().clusterBootstrapAccountPassword());
        Assertions.assertEquals("fakeOperatorCredentialPlaceholder", model.wsfcDomainCredentials().clusterOperatorAccountPassword());
        Assertions.assertEquals("fakeSqlServiceAccountPasswordPlaceholder", model.wsfcDomainCredentials().sqlServiceAccountPassword());
        Assertions.assertEquals("xhqyudxorrqnb", model.wsfcStaticIp());
        Assertions.assertEquals(true, model.autoPatchingSettings().enable());
        Assertions.assertEquals(DayOfWeek.SUNDAY, model.autoPatchingSettings().dayOfWeek());
        Assertions.assertEquals(2041227856, model.autoPatchingSettings().maintenanceWindowStartingHour());
        Assertions.assertEquals(688230720, model.autoPatchingSettings().maintenanceWindowDuration());
        Assertions.assertEquals(true, model.autoBackupSettings().enable());
        Assertions.assertEquals(false, model.autoBackupSettings().enableEncryption());
        Assertions.assertEquals(711383541, model.autoBackupSettings().retentionPeriod());
        Assertions.assertEquals("rm", model.autoBackupSettings().storageAccountUrl());
        Assertions.assertEquals("d", model.autoBackupSettings().storageContainerName());
        Assertions.assertEquals("fakeAutoBackupStorageCredentialPlaceholder", model.autoBackupSettings().storageAccessKey());
        Assertions.assertEquals("fakeAutoBackupCredentialPlaceholder", model.autoBackupSettings().password());
        Assertions.assertEquals(false, model.autoBackupSettings().backupSystemDbs());
        Assertions.assertEquals(BackupScheduleType.MANUAL, model.autoBackupSettings().backupScheduleType());
        Assertions.assertEquals(FullBackupFrequencyType.WEEKLY, model.autoBackupSettings().fullBackupFrequency());
        Assertions.assertEquals(AutoBackupDaysOfWeek.MONDAY, model.autoBackupSettings().daysOfWeek().get(0));
        Assertions.assertEquals(79438477, model.autoBackupSettings().fullBackupStartTime());
        Assertions.assertEquals(1785940860, model.autoBackupSettings().fullBackupWindowHours());
        Assertions.assertEquals(1882721753, model.autoBackupSettings().logBackupFrequency());
        Assertions.assertEquals(false, model.keyVaultCredentialSettings().enable());
        Assertions.assertEquals("lhzdobp", model.keyVaultCredentialSettings().credentialName());
        Assertions.assertEquals("mflbv", model.keyVaultCredentialSettings().azureKeyVaultUrl());
        Assertions.assertEquals("chrkcciwwzjuqk", model.keyVaultCredentialSettings().servicePrincipalName());
        Assertions.assertEquals("fakeServicePrincipleSecretPlaceholder", model.keyVaultCredentialSettings().servicePrincipalSecret());
        Assertions
            .assertEquals(
                ConnectivityType.PUBLIC,
                model.serverConfigurationsManagementSettings().sqlConnectivityUpdateSettings().connectivityType());
        Assertions
            .assertEquals(
                1163138760, model.serverConfigurationsManagementSettings().sqlConnectivityUpdateSettings().port());
        Assertions
            .assertEquals(
                "fakeSqlAuthUpdateUserNamePlaceholder",
                model.serverConfigurationsManagementSettings().sqlConnectivityUpdateSettings().sqlAuthUpdateUsername());
        Assertions
            .assertEquals(
                "fakeSqlAuthUpdatePasswordPlaceholder",
                model.serverConfigurationsManagementSettings().sqlConnectivityUpdateSettings().sqlAuthUpdatePassword());
        Assertions
            .assertEquals(
                SqlWorkloadType.DW,
                model.serverConfigurationsManagementSettings().sqlWorkloadTypeUpdateSettings().sqlWorkloadType());
        Assertions
            .assertEquals(
                93185233, model.serverConfigurationsManagementSettings().sqlStorageUpdateSettings().diskCount());
        Assertions
            .assertEquals(
                499062312,
                model.serverConfigurationsManagementSettings().sqlStorageUpdateSettings().startingDeviceId());
        Assertions
            .assertEquals(
                DiskConfigurationType.NEW,
                model.serverConfigurationsManagementSettings().sqlStorageUpdateSettings().diskConfigurationType());
        Assertions
            .assertEquals(
                true,
                model
                    .serverConfigurationsManagementSettings()
                    .additionalFeaturesServerConfigurations()
                    .isRServicesEnabled());
        Assertions
            .assertEquals(
                "hocohslkev", model.serverConfigurationsManagementSettings().sqlInstanceSettings().collation());
        Assertions
            .assertEquals(1452843037, model.serverConfigurationsManagementSettings().sqlInstanceSettings().maxDop());
        Assertions
            .assertEquals(
                false,
                model
                    .serverConfigurationsManagementSettings()
                    .sqlInstanceSettings()
                    .isOptimizeForAdHocWorkloadsEnabled());
        Assertions
            .assertEquals(
                1915206631, model.serverConfigurationsManagementSettings().sqlInstanceSettings().minServerMemoryMB());
        Assertions
            .assertEquals(
                635098272, model.serverConfigurationsManagementSettings().sqlInstanceSettings().maxServerMemoryMB());
        Assertions
            .assertEquals(true, model.serverConfigurationsManagementSettings().sqlInstanceSettings().isLpimEnabled());
        Assertions
            .assertEquals(true, model.serverConfigurationsManagementSettings().sqlInstanceSettings().isIfiEnabled());
        Assertions.assertEquals(750094319, model.storageConfigurationSettings().sqlDataSettings().luns().get(0));
        Assertions
            .assertEquals("ithlvmezyvshxm", model.storageConfigurationSettings().sqlDataSettings().defaultFilePath());
        Assertions.assertEquals(2042967034, model.storageConfigurationSettings().sqlLogSettings().luns().get(0));
        Assertions
            .assertEquals("igrxwburvjxxjn", model.storageConfigurationSettings().sqlLogSettings().defaultFilePath());
        Assertions.assertEquals(655244901, model.storageConfigurationSettings().sqlTempDbSettings().dataFileSize());
        Assertions.assertEquals(796522407, model.storageConfigurationSettings().sqlTempDbSettings().dataGrowth());
        Assertions.assertEquals(1581089013, model.storageConfigurationSettings().sqlTempDbSettings().logFileSize());
        Assertions.assertEquals(1482419493, model.storageConfigurationSettings().sqlTempDbSettings().logGrowth());
        Assertions.assertEquals(368872056, model.storageConfigurationSettings().sqlTempDbSettings().dataFileCount());
        Assertions.assertEquals(true, model.storageConfigurationSettings().sqlTempDbSettings().persistFolder());
        Assertions
            .assertEquals(
                "vudwtiukbldng", model.storageConfigurationSettings().sqlTempDbSettings().persistFolderPath());
        Assertions.assertEquals(2138211196, model.storageConfigurationSettings().sqlTempDbSettings().luns().get(0));
        Assertions.assertEquals("z", model.storageConfigurationSettings().sqlTempDbSettings().defaultFilePath());
        Assertions.assertEquals(false, model.storageConfigurationSettings().sqlSystemDbOnDataDisk());
        Assertions
            .assertEquals(DiskConfigurationType.ADD, model.storageConfigurationSettings().diskConfigurationType());
        Assertions.assertEquals(StorageWorkloadType.OLTP, model.storageConfigurationSettings().storageWorkloadType());
        Assertions.assertEquals(true, model.assessmentSettings().enable());
        Assertions.assertEquals(true, model.assessmentSettings().runImmediately());
        Assertions.assertEquals(false, model.assessmentSettings().schedule().enable());
        Assertions.assertEquals(2112033193, model.assessmentSettings().schedule().weeklyInterval());
        Assertions.assertEquals(2000492920, model.assessmentSettings().schedule().monthlyOccurrence());
        Assertions.assertEquals(AssessmentDayOfWeek.SUNDAY, model.assessmentSettings().schedule().dayOfWeek());
        Assertions.assertEquals("typmrbpizcdrqjsd", model.assessmentSettings().schedule().startTime());
        Assertions.assertEquals(true, model.enableAutomaticUpgrade());
    }

    @Test
    public void testSerialize() {
        SqlVirtualMachineProperties model =
            new SqlVirtualMachineProperties()
                .withVirtualMachineResourceId("myzydagfuaxbez")
                .withSqlImageOffer("q")
                .withSqlServerLicenseType(SqlServerLicenseType.DR)
                .withSqlManagement(SqlManagementMode.LIGHT_WEIGHT)
                .withLeastPrivilegeMode(LeastPrivilegeMode.ENABLED)
                .withSqlImageSku(SqlImageSku.WEB)
                .withSqlVirtualMachineGroupResourceId("o")
                .withWsfcDomainCredentials(
                    new WsfcDomainCredentials()
                        .withClusterBootstrapAccountPassword("fakeBootstrapCredentialPlaceholder")
                        .withClusterOperatorAccountPassword("fakeOperatorCredentialPlaceholder")
                        .withSqlServiceAccountPassword("fakeSqlServiceAccountPasswordPlaceholder"))
                .withWsfcStaticIp("xhqyudxorrqnb")
                .withAutoPatchingSettings(
                    new AutoPatchingSettings()
                        .withEnable(true)
                        .withDayOfWeek(DayOfWeek.SUNDAY)
                        .withMaintenanceWindowStartingHour(2041227856)
                        .withMaintenanceWindowDuration(688230720))
                .withAutoBackupSettings(
                    new AutoBackupSettings()
                        .withEnable(true)
                        .withEnableEncryption(false)
                        .withRetentionPeriod(711383541)
                        .withStorageAccountUrl("rm")
                        .withStorageContainerName("d")
                        .withStorageAccessKey("fakeAutoBackupStorageCredentialPlaceholder")
                        .withPassword("fakeAutoBackupCredentialPlaceholder")
                        .withBackupSystemDbs(false)
                        .withBackupScheduleType(BackupScheduleType.MANUAL)
                        .withFullBackupFrequency(FullBackupFrequencyType.WEEKLY)
                        .withDaysOfWeek(
                            Arrays
                                .asList(
                                    AutoBackupDaysOfWeek.MONDAY,
                                    AutoBackupDaysOfWeek.TUESDAY,
                                    AutoBackupDaysOfWeek.SUNDAY))
                        .withFullBackupStartTime(79438477)
                        .withFullBackupWindowHours(1785940860)
                        .withLogBackupFrequency(1882721753))
                .withKeyVaultCredentialSettings(
                    new KeyVaultCredentialSettings()
                        .withEnable(false)
                        .withCredentialName("lhzdobp")
                        .withAzureKeyVaultUrl("mflbv")
                        .withServicePrincipalName("chrkcciwwzjuqk")
                        .withServicePrincipalSecret("fakeServicePrincipleSecretPlaceholder"))
                .withServerConfigurationsManagementSettings(
                    new ServerConfigurationsManagementSettings()
                        .withSqlConnectivityUpdateSettings(
                            new SqlConnectivityUpdateSettings()
                                .withConnectivityType(ConnectivityType.PUBLIC)
                                .withPort(1163138760)
                                .withSqlAuthUpdateUsername("fakeSqlAuthUpdateUserNamePlaceholder")
                                .withSqlAuthUpdatePassword("fakeSqlAuthUpdatePasswordPlaceholder"))
                        .withSqlWorkloadTypeUpdateSettings(
                            new SqlWorkloadTypeUpdateSettings().withSqlWorkloadType(SqlWorkloadType.DW))
                        .withSqlStorageUpdateSettings(
                            new SqlStorageUpdateSettings()
                                .withDiskCount(93185233)
                                .withStartingDeviceId(499062312)
                                .withDiskConfigurationType(DiskConfigurationType.NEW))
                        .withAdditionalFeaturesServerConfigurations(
                            new AdditionalFeaturesServerConfigurations().withIsRServicesEnabled(true))
                        .withSqlInstanceSettings(
                            new SqlInstanceSettings()
                                .withCollation("hocohslkev")
                                .withMaxDop(1452843037)
                                .withIsOptimizeForAdHocWorkloadsEnabled(false)
                                .withMinServerMemoryMB(1915206631)
                                .withMaxServerMemoryMB(635098272)
                                .withIsLpimEnabled(true)
                                .withIsIfiEnabled(true)))
                .withStorageConfigurationSettings(
                    new StorageConfigurationSettings()
                        .withSqlDataSettings(
                            new SqlStorageSettings()
                                .withLuns(Arrays.asList(750094319, 441262471))
                                .withDefaultFilePath("ithlvmezyvshxm"))
                        .withSqlLogSettings(
                            new SqlStorageSettings()
                                .withLuns(Arrays.asList(2042967034, 820071175, 681165656))
                                .withDefaultFilePath("igrxwburvjxxjn"))
                        .withSqlTempDbSettings(
                            new SqlTempDbSettings()
                                .withDataFileSize(655244901)
                                .withDataGrowth(796522407)
                                .withLogFileSize(1581089013)
                                .withLogGrowth(1482419493)
                                .withDataFileCount(368872056)
                                .withPersistFolder(true)
                                .withPersistFolderPath("vudwtiukbldng")
                                .withLuns(Arrays.asList(2138211196, 1997522468, 655680628))
                                .withDefaultFilePath("z"))
                        .withSqlSystemDbOnDataDisk(false)
                        .withDiskConfigurationType(DiskConfigurationType.ADD)
                        .withStorageWorkloadType(StorageWorkloadType.OLTP))
                .withAssessmentSettings(
                    new AssessmentSettings()
                        .withEnable(true)
                        .withRunImmediately(true)
                        .withSchedule(
                            new Schedule()
                                .withEnable(false)
                                .withWeeklyInterval(2112033193)
                                .withMonthlyOccurrence(2000492920)
                                .withDayOfWeek(AssessmentDayOfWeek.SUNDAY)
                                .withStartTime("typmrbpizcdrqjsd")))
                .withEnableAutomaticUpgrade(true);
        model = BinaryData.fromObject(model).toObject(SqlVirtualMachineProperties.class);
        Assertions.assertEquals("myzydagfuaxbez", model.virtualMachineResourceId());
        Assertions.assertEquals("q", model.sqlImageOffer());
        Assertions.assertEquals(SqlServerLicenseType.DR, model.sqlServerLicenseType());
        Assertions.assertEquals(SqlManagementMode.LIGHT_WEIGHT, model.sqlManagement());
        Assertions.assertEquals(LeastPrivilegeMode.ENABLED, model.leastPrivilegeMode());
        Assertions.assertEquals(SqlImageSku.WEB, model.sqlImageSku());
        Assertions.assertEquals("o", model.sqlVirtualMachineGroupResourceId());
        Assertions.assertEquals("fakeBootstrapCredentialPlaceholder", model.wsfcDomainCredentials().clusterBootstrapAccountPassword());
        Assertions.assertEquals("fakeOperatorCredentialPlaceholder", model.wsfcDomainCredentials().clusterOperatorAccountPassword());
        Assertions.assertEquals("fakeSqlServiceAccountPasswordPlaceholder", model.wsfcDomainCredentials().sqlServiceAccountPassword());
        Assertions.assertEquals("xhqyudxorrqnb", model.wsfcStaticIp());
        Assertions.assertEquals(true, model.autoPatchingSettings().enable());
        Assertions.assertEquals(DayOfWeek.SUNDAY, model.autoPatchingSettings().dayOfWeek());
        Assertions.assertEquals(2041227856, model.autoPatchingSettings().maintenanceWindowStartingHour());
        Assertions.assertEquals(688230720, model.autoPatchingSettings().maintenanceWindowDuration());
        Assertions.assertEquals(true, model.autoBackupSettings().enable());
        Assertions.assertEquals(false, model.autoBackupSettings().enableEncryption());
        Assertions.assertEquals(711383541, model.autoBackupSettings().retentionPeriod());
        Assertions.assertEquals("rm", model.autoBackupSettings().storageAccountUrl());
        Assertions.assertEquals("d", model.autoBackupSettings().storageContainerName());
        Assertions.assertEquals("fakeAutoBackupStorageCredentialPlaceholder", model.autoBackupSettings().storageAccessKey());
        Assertions.assertEquals("fakeAutoBackupCredentialPlaceholder", model.autoBackupSettings().password());
        Assertions.assertEquals(false, model.autoBackupSettings().backupSystemDbs());
        Assertions.assertEquals(BackupScheduleType.MANUAL, model.autoBackupSettings().backupScheduleType());
        Assertions.assertEquals(FullBackupFrequencyType.WEEKLY, model.autoBackupSettings().fullBackupFrequency());
        Assertions.assertEquals(AutoBackupDaysOfWeek.MONDAY, model.autoBackupSettings().daysOfWeek().get(0));
        Assertions.assertEquals(79438477, model.autoBackupSettings().fullBackupStartTime());
        Assertions.assertEquals(1785940860, model.autoBackupSettings().fullBackupWindowHours());
        Assertions.assertEquals(1882721753, model.autoBackupSettings().logBackupFrequency());
        Assertions.assertEquals(false, model.keyVaultCredentialSettings().enable());
        Assertions.assertEquals("lhzdobp", model.keyVaultCredentialSettings().credentialName());
        Assertions.assertEquals("mflbv", model.keyVaultCredentialSettings().azureKeyVaultUrl());
        Assertions.assertEquals("chrkcciwwzjuqk", model.keyVaultCredentialSettings().servicePrincipalName());
        Assertions.assertEquals("fakeServicePrincipleSecretPlaceholder", model.keyVaultCredentialSettings().servicePrincipalSecret());
        Assertions
            .assertEquals(
                ConnectivityType.PUBLIC,
                model.serverConfigurationsManagementSettings().sqlConnectivityUpdateSettings().connectivityType());
        Assertions
            .assertEquals(
                1163138760, model.serverConfigurationsManagementSettings().sqlConnectivityUpdateSettings().port());
        Assertions
            .assertEquals(
                "fakeSqlAuthUpdateUserNamePlaceholder",
                model.serverConfigurationsManagementSettings().sqlConnectivityUpdateSettings().sqlAuthUpdateUsername());
        Assertions
            .assertEquals(
                "fakeSqlAuthUpdatePasswordPlaceholder",
                model.serverConfigurationsManagementSettings().sqlConnectivityUpdateSettings().sqlAuthUpdatePassword());
        Assertions
            .assertEquals(
                SqlWorkloadType.DW,
                model.serverConfigurationsManagementSettings().sqlWorkloadTypeUpdateSettings().sqlWorkloadType());
        Assertions
            .assertEquals(
                93185233, model.serverConfigurationsManagementSettings().sqlStorageUpdateSettings().diskCount());
        Assertions
            .assertEquals(
                499062312,
                model.serverConfigurationsManagementSettings().sqlStorageUpdateSettings().startingDeviceId());
        Assertions
            .assertEquals(
                DiskConfigurationType.NEW,
                model.serverConfigurationsManagementSettings().sqlStorageUpdateSettings().diskConfigurationType());
        Assertions
            .assertEquals(
                true,
                model
                    .serverConfigurationsManagementSettings()
                    .additionalFeaturesServerConfigurations()
                    .isRServicesEnabled());
        Assertions
            .assertEquals(
                "hocohslkev", model.serverConfigurationsManagementSettings().sqlInstanceSettings().collation());
        Assertions
            .assertEquals(1452843037, model.serverConfigurationsManagementSettings().sqlInstanceSettings().maxDop());
        Assertions
            .assertEquals(
                false,
                model
                    .serverConfigurationsManagementSettings()
                    .sqlInstanceSettings()
                    .isOptimizeForAdHocWorkloadsEnabled());
        Assertions
            .assertEquals(
                1915206631, model.serverConfigurationsManagementSettings().sqlInstanceSettings().minServerMemoryMB());
        Assertions
            .assertEquals(
                635098272, model.serverConfigurationsManagementSettings().sqlInstanceSettings().maxServerMemoryMB());
        Assertions
            .assertEquals(true, model.serverConfigurationsManagementSettings().sqlInstanceSettings().isLpimEnabled());
        Assertions
            .assertEquals(true, model.serverConfigurationsManagementSettings().sqlInstanceSettings().isIfiEnabled());
        Assertions.assertEquals(750094319, model.storageConfigurationSettings().sqlDataSettings().luns().get(0));
        Assertions
            .assertEquals("ithlvmezyvshxm", model.storageConfigurationSettings().sqlDataSettings().defaultFilePath());
        Assertions.assertEquals(2042967034, model.storageConfigurationSettings().sqlLogSettings().luns().get(0));
        Assertions
            .assertEquals("igrxwburvjxxjn", model.storageConfigurationSettings().sqlLogSettings().defaultFilePath());
        Assertions.assertEquals(655244901, model.storageConfigurationSettings().sqlTempDbSettings().dataFileSize());
        Assertions.assertEquals(796522407, model.storageConfigurationSettings().sqlTempDbSettings().dataGrowth());
        Assertions.assertEquals(1581089013, model.storageConfigurationSettings().sqlTempDbSettings().logFileSize());
        Assertions.assertEquals(1482419493, model.storageConfigurationSettings().sqlTempDbSettings().logGrowth());
        Assertions.assertEquals(368872056, model.storageConfigurationSettings().sqlTempDbSettings().dataFileCount());
        Assertions.assertEquals(true, model.storageConfigurationSettings().sqlTempDbSettings().persistFolder());
        Assertions
            .assertEquals(
                "vudwtiukbldng", model.storageConfigurationSettings().sqlTempDbSettings().persistFolderPath());
        Assertions.assertEquals(2138211196, model.storageConfigurationSettings().sqlTempDbSettings().luns().get(0));
        Assertions.assertEquals("z", model.storageConfigurationSettings().sqlTempDbSettings().defaultFilePath());
        Assertions.assertEquals(false, model.storageConfigurationSettings().sqlSystemDbOnDataDisk());
        Assertions
            .assertEquals(DiskConfigurationType.ADD, model.storageConfigurationSettings().diskConfigurationType());
        Assertions.assertEquals(StorageWorkloadType.OLTP, model.storageConfigurationSettings().storageWorkloadType());
        Assertions.assertEquals(true, model.assessmentSettings().enable());
        Assertions.assertEquals(true, model.assessmentSettings().runImmediately());
        Assertions.assertEquals(false, model.assessmentSettings().schedule().enable());
        Assertions.assertEquals(2112033193, model.assessmentSettings().schedule().weeklyInterval());
        Assertions.assertEquals(2000492920, model.assessmentSettings().schedule().monthlyOccurrence());
        Assertions.assertEquals(AssessmentDayOfWeek.SUNDAY, model.assessmentSettings().schedule().dayOfWeek());
        Assertions.assertEquals("typmrbpizcdrqjsd", model.assessmentSettings().schedule().startTime());
        Assertions.assertEquals(true, model.enableAutomaticUpgrade());
    }
}
