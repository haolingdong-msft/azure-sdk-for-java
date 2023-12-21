// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.Activity;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.Expression;
import com.azure.resourcemanager.datafactory.models.IfConditionActivity;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class IfConditionActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IfConditionActivity model = BinaryData.fromString(
            "{\"type\":\"IfCondition\",\"typeProperties\":{\"expression\":{\"value\":\"kbgohxbjizf\"},\"ifTrueActivities\":[{\"type\":\"Activity\",\"name\":\"bqdrjunigx\",\"description\":\"nnghgazdbv\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Succeeded\",\"dependsOn\":[{\"activity\":\"jqswr\",\"dependencyConditions\":[\"Completed\",\"Failed\",\"Skipped\"],\"\":{\"mvrbdtvvtapwkw\":\"datangjepydjdpapn\",\"cdehskmfiudnpj\":\"datathmexid\"}},{\"activity\":\"xfhtsgyyrg\",\"dependencyConditions\":[\"Completed\"],\"\":{\"ytihhq\":\"datagqllgokznffqvtx\"}},{\"activity\":\"ncwgrwgdpfzdygt\",\"dependencyConditions\":[\"Completed\",\"Failed\",\"Failed\",\"Completed\"],\"\":{\"slaiu\":\"datamyolvg\",\"wvwzuetqcxoamxu\":\"datancr\",\"uzxsn\":\"datawzduhixomxvb\",\"eozgnwmcizclnqe\":\"dataxipgfkcodou\"}}],\"userProperties\":[{\"name\":\"pwp\",\"value\":\"datadfjsjkondrkncfoq\"}],\"\":{\"ikxs\":\"dataslcvpqwrsfd\"}},{\"type\":\"Activity\",\"name\":\"gaegrppwol\",\"description\":\"flj\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Skipped\",\"dependsOn\":[{\"activity\":\"dwvyjzokvycinm\",\"dependencyConditions\":[\"Failed\",\"Succeeded\",\"Completed\"],\"\":{\"exzxbiwnq\":\"datafoztwmvprnqjx\",\"ryesgalsparbjs\":\"datawqtbztogihpylf\",\"lvnosblc\":\"dataqybvgemkze\"}},{\"activity\":\"ctwac\",\"dependencyConditions\":[\"Failed\"],\"\":{\"fh\":\"datadcvjhykptcijuntm\",\"xxymtcwacavz\":\"dataccqhtlqrfsrfxr\",\"xid\":\"datadybhydlq\",\"ihnsaespzwgpjrix\":\"datast\"}}],\"userProperties\":[{\"name\":\"v\",\"value\":\"datawuttl\"},{\"name\":\"fcnht\",\"value\":\"dataaiypihqmmmbokdqk\"},{\"name\":\"bpfzxnivvuwrv\",\"value\":\"datahlz\"},{\"name\":\"lkgpipwt\",\"value\":\"datatrbfipbddhfk\"}],\"\":{\"awzkefz\":\"dataqqun\",\"yqiytrhhmld\":\"datauyhvaovoqonqjlpc\",\"nmstflk\":\"datatyz\",\"bbcsbcfecmcprggc\":\"datagzo\"}},{\"type\":\"Activity\",\"name\":\"fssbqwvragvxhwbq\",\"description\":\"frrv\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Skipped\",\"dependsOn\":[{\"activity\":\"fblkge\",\"dependencyConditions\":[\"Skipped\",\"Succeeded\",\"Completed\",\"Succeeded\"],\"\":{\"upp\":\"datafcamdffoibxjg\"}}],\"userProperties\":[{\"name\":\"awqxrenjzlqbtef\",\"value\":\"datactpzhoxagayno\"},{\"name\":\"hjvtefevhedfzxs\",\"value\":\"dataypara\"},{\"name\":\"rgsfnjokrfpiqgqv\",\"value\":\"datarlbsglqiuqsqzumx\"},{\"name\":\"x\",\"value\":\"datamuosoziqcuiekuya\"}],\"\":{\"dpfxlkwyqoaejy\":\"datakxtgeejxwbredx\",\"e\":\"dataqgen\",\"oxvbwsa\":\"datapaiat\",\"udp\":\"datazvtinrortjtyls\"}}],\"ifFalseActivities\":[{\"type\":\"Activity\",\"name\":\"nngijnzlokxihf\",\"description\":\"mbljlrf\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Failed\",\"dependsOn\":[{\"activity\":\"dhrfvbicd\",\"dependencyConditions\":[\"Skipped\",\"Completed\",\"Failed\"],\"\":{\"tqnq\":\"datazxbf\",\"jqfachfmvqnkgst\":\"datalmqeauizk\",\"ujvsc\":\"datae\",\"pwm\":\"datapwpqvg\"}},{\"activity\":\"efhburxnagvcsm\",\"dependencyConditions\":[\"Skipped\",\"Failed\",\"Completed\"],\"\":{\"zlfhn\":\"datatqnqbdxwyo\"}},{\"activity\":\"juuwmcugveiiegoo\",\"dependencyConditions\":[\"Skipped\",\"Succeeded\"],\"\":{\"thohfqbeai\":\"datalbudf\"}}],\"userProperties\":[{\"name\":\"nhxgiydkrgdascm\",\"value\":\"datankabwpdvedmx\"},{\"name\":\"kbgxgykx\",\"value\":\"datazetaonkfbgwfkc\"},{\"name\":\"ldepzrsz\",\"value\":\"dataj\"},{\"name\":\"dcisceiauoy\",\"value\":\"dataudnxaw\"}],\"\":{\"paviu\":\"databmbvccui\",\"o\":\"datajizbjsu\",\"crtmebrssrlxenqp\":\"dataetl\",\"j\":\"datahc\"}},{\"type\":\"Activity\",\"name\":\"qmb\",\"description\":\"ensogdvhqqxggnc\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Skipped\",\"dependsOn\":[{\"activity\":\"xcjqrvpgukscr\",\"dependencyConditions\":[\"Completed\",\"Skipped\",\"Skipped\"],\"\":{\"oaj\":\"datama\",\"s\":\"datagkcac\"}},{\"activity\":\"jgageyxajk\",\"dependencyConditions\":[\"Skipped\",\"Completed\"],\"\":{\"zbeemlsrtgbgcmut\":\"datajqbmgfxwy\",\"lpuuf\":\"datakwd\",\"rxyejjqctq\":\"datahbdmmf\",\"gvpsmxfchnhjsa\":\"databahiiatpdxpox\"}},{\"activity\":\"pwx\",\"dependencyConditions\":[\"Succeeded\",\"Failed\",\"Failed\",\"Failed\"],\"\":{\"lvwtslzblgvezhim\":\"datalqgpskynkkezkv\",\"dzkovt\":\"dataiyqwlxkyoysyutnr\",\"ayupa\":\"datanmcaprxhixmybl\",\"ipxhghicw\":\"datagkrumpunwyfyvhcb\"}},{\"activity\":\"h\",\"dependencyConditions\":[\"Completed\",\"Succeeded\",\"Succeeded\",\"Completed\"],\"\":{\"m\":\"datapyanooytil\",\"wqljmmoquicrz\":\"datas\"}}],\"userProperties\":[{\"name\":\"qacebcnhz\",\"value\":\"datasaumjuruspflv\"},{\"name\":\"lvwkgcpfz\",\"value\":\"dataekbrqg\"},{\"name\":\"vxwq\",\"value\":\"datamvsrbmf\"}],\"\":{\"ob\":\"dataml\"}},{\"type\":\"Activity\",\"name\":\"uoyownygbra\",\"description\":\"whebyczwegtzdpr\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Succeeded\",\"dependsOn\":[{\"activity\":\"sqi\",\"dependencyConditions\":[\"Failed\",\"Skipped\"],\"\":{\"dlt\":\"datavturdglecmegol\"}},{\"activity\":\"ryhztwxuizakejo\",\"dependencyConditions\":[\"Completed\",\"Failed\",\"Completed\",\"Completed\"],\"\":{\"qlg\":\"datazgnf\",\"we\":\"dataezgbqi\",\"znvyeuxd\":\"dataaceokrarzkza\"}}],\"userProperties\":[{\"name\":\"mt\",\"value\":\"datapukmxgslzbpnl\"},{\"name\":\"zqwmx\",\"value\":\"dataotwzes\"},{\"name\":\"j\",\"value\":\"datacpcpeur\"},{\"name\":\"ofzmvt\",\"value\":\"datayj\"}],\"\":{\"bqhe\":\"datarptlty\",\"wjlbygqfmeeuuurx\":\"datah\",\"ob\":\"dataslxzwvygquiwcfq\",\"mte\":\"datawwdev\"}}]},\"name\":\"hvgg\",\"description\":\"irqkskyyam\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Skipped\",\"dependsOn\":[{\"activity\":\"wcd\",\"dependencyConditions\":[\"Succeeded\"],\"\":{\"lvlfkwdtsbjmc\":\"datarxmlmibvczdjko\",\"n\":\"datasefezjyfaqdwfa\",\"hwlvh\":\"datadetslxe\",\"zil\":\"datalxxgelad\"}},{\"activity\":\"rsycujnsznjsk\",\"dependencyConditions\":[\"Skipped\",\"Succeeded\",\"Succeeded\",\"Succeeded\"],\"\":{\"sonfxsfje\":\"dataxpixuyy\",\"ytedspkduhz\":\"datajnxicufxt\"}}],\"userProperties\":[{\"name\":\"gcfltte\",\"value\":\"dataqpjcuuyttuindp\"}],\"\":{\"bahtlopbns\":\"datajncaqgt\",\"shnoxrmabb\":\"datajzrnjcagagmgulln\",\"guau\":\"datatzcdbqzwutakbva\",\"ccd\":\"datamcwplloj\"}}")
            .toObject(IfConditionActivity.class);
        Assertions.assertEquals("hvgg", model.name());
        Assertions.assertEquals("irqkskyyam", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SKIPPED, model.onInactiveMarkAs());
        Assertions.assertEquals("wcd", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("gcfltte", model.userProperties().get(0).name());
        Assertions.assertEquals("kbgohxbjizf", model.expression().value());
        Assertions.assertEquals("bqdrjunigx", model.ifTrueActivities().get(0).name());
        Assertions.assertEquals("nnghgazdbv", model.ifTrueActivities().get(0).description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.ifTrueActivities().get(0).state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SUCCEEDED, model.ifTrueActivities().get(0).onInactiveMarkAs());
        Assertions.assertEquals("jqswr", model.ifTrueActivities().get(0).dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED,
            model.ifTrueActivities().get(0).dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("pwp", model.ifTrueActivities().get(0).userProperties().get(0).name());
        Assertions.assertEquals("nngijnzlokxihf", model.ifFalseActivities().get(0).name());
        Assertions.assertEquals("mbljlrf", model.ifFalseActivities().get(0).description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.ifFalseActivities().get(0).state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.ifFalseActivities().get(0).onInactiveMarkAs());
        Assertions.assertEquals("dhrfvbicd", model.ifFalseActivities().get(0).dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED,
            model.ifFalseActivities().get(0).dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("nhxgiydkrgdascm", model.ifFalseActivities().get(0).userProperties().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IfConditionActivity model
            = new IfConditionActivity().withName("hvgg").withDescription("irqkskyyam").withState(ActivityState.INACTIVE)
                .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SKIPPED)
                .withDependsOn(Arrays.asList(new ActivityDependency().withActivity("wcd")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.SUCCEEDED))
                    .withAdditionalProperties(mapOf()),
                    new ActivityDependency().withActivity("rsycujnsznjsk")
                        .withDependencyConditions(
                            Arrays.asList(DependencyCondition.SKIPPED, DependencyCondition.SUCCEEDED,
                                DependencyCondition.SUCCEEDED, DependencyCondition.SUCCEEDED))
                        .withAdditionalProperties(mapOf())))
                .withUserProperties(
                    Arrays.asList(new UserProperty().withName("gcfltte").withValue("dataqpjcuuyttuindp")))
                .withExpression(new Expression().withValue("kbgohxbjizf"))
                .withIfTrueActivities(Arrays.asList(
                    new Activity().withName("bqdrjunigx").withDescription("nnghgazdbv")
                        .withState(ActivityState.INACTIVE).withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SUCCEEDED)
                        .withDependsOn(Arrays.asList(
                            new ActivityDependency()
                                .withActivity("jqswr")
                                .withDependencyConditions(Arrays.asList(
                                    DependencyCondition.COMPLETED, DependencyCondition.FAILED,
                                    DependencyCondition.SKIPPED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("xfhtsgyyrg")
                                .withDependencyConditions(Arrays.asList(DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency().withActivity("ncwgrwgdpfzdygt")
                                .withDependencyConditions(
                                    Arrays.asList(DependencyCondition.COMPLETED, DependencyCondition.FAILED,
                                        DependencyCondition.FAILED, DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf())))
                        .withUserProperties(
                            Arrays.asList(new UserProperty().withName("pwp").withValue("datadfjsjkondrkncfoq")))
                        .withAdditionalProperties(mapOf("type", "Activity")),
                    new Activity().withName("gaegrppwol").withDescription("flj").withState(ActivityState.INACTIVE)
                        .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SKIPPED)
                        .withDependsOn(Arrays.asList(
                            new ActivityDependency().withActivity("dwvyjzokvycinm")
                                .withDependencyConditions(Arrays.asList(DependencyCondition.FAILED,
                                    DependencyCondition.SUCCEEDED, DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency().withActivity("ctwac")
                                .withDependencyConditions(Arrays.asList(DependencyCondition.FAILED))
                                .withAdditionalProperties(mapOf())))
                        .withUserProperties(Arrays.asList(new UserProperty().withName("v").withValue("datawuttl"),
                            new UserProperty().withName("fcnht").withValue("dataaiypihqmmmbokdqk"),
                            new UserProperty().withName("bpfzxnivvuwrv").withValue("datahlz"), new UserProperty()
                                .withName("lkgpipwt").withValue("datatrbfipbddhfk")))
                        .withAdditionalProperties(mapOf("type", "Activity")),
                    new Activity().withName("fssbqwvragvxhwbq").withDescription("frrv").withState(ActivityState.ACTIVE)
                        .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SKIPPED)
                        .withDependsOn(Arrays.asList(new ActivityDependency().withActivity("fblkge")
                            .withDependencyConditions(
                                Arrays.asList(DependencyCondition.SKIPPED, DependencyCondition.SUCCEEDED,
                                    DependencyCondition.COMPLETED, DependencyCondition.SUCCEEDED))
                            .withAdditionalProperties(mapOf())))
                        .withUserProperties(
                            Arrays.asList(new UserProperty().withName("awqxrenjzlqbtef").withValue("datactpzhoxagayno"),
                                new UserProperty().withName("hjvtefevhedfzxs").withValue("dataypara"),
                                new UserProperty().withName("rgsfnjokrfpiqgqv").withValue("datarlbsglqiuqsqzumx"),
                                new UserProperty().withName("x").withValue("datamuosoziqcuiekuya")))
                        .withAdditionalProperties(mapOf("type", "Activity"))))
                .withIfFalseActivities(Arrays.asList(
                    new Activity().withName("nngijnzlokxihf").withDescription("mbljlrf").withState(ActivityState.ACTIVE)
                        .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.FAILED)
                        .withDependsOn(
                            Arrays.asList(
                                new ActivityDependency().withActivity("dhrfvbicd")
                                    .withDependencyConditions(
                                        Arrays.asList(DependencyCondition.SKIPPED, DependencyCondition.COMPLETED,
                                            DependencyCondition.FAILED))
                                    .withAdditionalProperties(mapOf()),
                                new ActivityDependency().withActivity("efhburxnagvcsm")
                                    .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED,
                                        DependencyCondition.FAILED, DependencyCondition.COMPLETED))
                                    .withAdditionalProperties(mapOf()),
                                new ActivityDependency().withActivity("juuwmcugveiiegoo")
                                    .withDependencyConditions(
                                        Arrays.asList(DependencyCondition.SKIPPED, DependencyCondition.SUCCEEDED))
                                    .withAdditionalProperties(mapOf())))
                        .withUserProperties(
                            Arrays.asList(new UserProperty().withName("nhxgiydkrgdascm").withValue("datankabwpdvedmx"),
                                new UserProperty().withName("kbgxgykx").withValue("datazetaonkfbgwfkc"),
                                new UserProperty().withName("ldepzrsz")
                                    .withValue("dataj"),
                                new UserProperty().withName("dcisceiauoy").withValue("dataudnxaw")))
                        .withAdditionalProperties(mapOf("type", "Activity")),
                    new Activity().withName("qmb").withDescription("ensogdvhqqxggnc").withState(ActivityState.ACTIVE)
                        .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SKIPPED)
                        .withDependsOn(Arrays.asList(
                            new ActivityDependency().withActivity("xcjqrvpgukscr")
                                .withDependencyConditions(Arrays.asList(DependencyCondition.COMPLETED,
                                    DependencyCondition.SKIPPED, DependencyCondition.SKIPPED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency().withActivity("jgageyxajk")
                                .withDependencyConditions(
                                    Arrays.asList(DependencyCondition.SKIPPED, DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency().withActivity("pwx")
                                .withDependencyConditions(Arrays.asList(DependencyCondition.SUCCEEDED,
                                    DependencyCondition.FAILED, DependencyCondition.FAILED, DependencyCondition.FAILED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency().withActivity("h")
                                .withDependencyConditions(Arrays.asList(DependencyCondition.COMPLETED,
                                    DependencyCondition.SUCCEEDED, DependencyCondition.SUCCEEDED,
                                    DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf())))
                        .withUserProperties(
                            Arrays
                                .asList(new UserProperty().withName("qacebcnhz").withValue("datasaumjuruspflv"),
                                    new UserProperty().withName("lvwkgcpfz").withValue("dataekbrqg"),
                                    new UserProperty().withName("vxwq").withValue("datamvsrbmf")))
                        .withAdditionalProperties(mapOf("type", "Activity")),
                    new Activity()
                        .withName("uoyownygbra").withDescription("whebyczwegtzdpr").withState(
                            ActivityState.INACTIVE)
                        .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SUCCEEDED)
                        .withDependsOn(Arrays.asList(
                            new ActivityDependency().withActivity("sqi")
                                .withDependencyConditions(
                                    Arrays.asList(DependencyCondition.FAILED, DependencyCondition.SKIPPED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency().withActivity("ryhztwxuizakejo")
                                .withDependencyConditions(
                                    Arrays.asList(DependencyCondition.COMPLETED, DependencyCondition.FAILED,
                                        DependencyCondition.COMPLETED, DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf())))
                        .withUserProperties(
                            Arrays.asList(new UserProperty().withName("mt").withValue("datapukmxgslzbpnl"),
                                new UserProperty().withName("zqwmx").withValue("dataotwzes"),
                                new UserProperty().withName("j").withValue("datacpcpeur"),
                                new UserProperty().withName("ofzmvt").withValue("datayj")))
                        .withAdditionalProperties(mapOf("type", "Activity"))));
        model = BinaryData.fromObject(model).toObject(IfConditionActivity.class);
        Assertions.assertEquals("hvgg", model.name());
        Assertions.assertEquals("irqkskyyam", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SKIPPED, model.onInactiveMarkAs());
        Assertions.assertEquals("wcd", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("gcfltte", model.userProperties().get(0).name());
        Assertions.assertEquals("kbgohxbjizf", model.expression().value());
        Assertions.assertEquals("bqdrjunigx", model.ifTrueActivities().get(0).name());
        Assertions.assertEquals("nnghgazdbv", model.ifTrueActivities().get(0).description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.ifTrueActivities().get(0).state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SUCCEEDED, model.ifTrueActivities().get(0).onInactiveMarkAs());
        Assertions.assertEquals("jqswr", model.ifTrueActivities().get(0).dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED,
            model.ifTrueActivities().get(0).dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("pwp", model.ifTrueActivities().get(0).userProperties().get(0).name());
        Assertions.assertEquals("nngijnzlokxihf", model.ifFalseActivities().get(0).name());
        Assertions.assertEquals("mbljlrf", model.ifFalseActivities().get(0).description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.ifFalseActivities().get(0).state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.ifFalseActivities().get(0).onInactiveMarkAs());
        Assertions.assertEquals("dhrfvbicd", model.ifFalseActivities().get(0).dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED,
            model.ifFalseActivities().get(0).dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("nhxgiydkrgdascm", model.ifFalseActivities().get(0).userProperties().get(0).name());
    }

    // Use "Map.of" if available
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
