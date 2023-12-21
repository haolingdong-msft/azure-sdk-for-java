// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridnetwork.models.ArtifactManifestPropertiesFormat;
import com.azure.resourcemanager.hybridnetwork.models.ArtifactType;
import com.azure.resourcemanager.hybridnetwork.models.ManifestArtifactFormat;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ArtifactManifestPropertiesFormatTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ArtifactManifestPropertiesFormat model = BinaryData.fromString(
            "{\"provisioningState\":\"Canceled\",\"artifactManifestState\":\"Validating\",\"artifacts\":[{\"artifactName\":\"rykqgaifmvikl\",\"artifactType\":\"ArmTemplate\",\"artifactVersion\":\"khbejdznxc\"},{\"artifactName\":\"srhnjivo\",\"artifactType\":\"ImageFile\",\"artifactVersion\":\"ovqfzge\"},{\"artifactName\":\"dftuljltduce\",\"artifactType\":\"ArmTemplate\",\"artifactVersion\":\"czu\"},{\"artifactName\":\"ejwcwwqiok\",\"artifactType\":\"OCIArtifact\",\"artifactVersion\":\"mojmsvpkjprvkw\"}]}")
            .toObject(ArtifactManifestPropertiesFormat.class);
        Assertions.assertEquals("rykqgaifmvikl", model.artifacts().get(0).artifactName());
        Assertions.assertEquals(ArtifactType.ARM_TEMPLATE, model.artifacts().get(0).artifactType());
        Assertions.assertEquals("khbejdznxc", model.artifacts().get(0).artifactVersion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ArtifactManifestPropertiesFormat model = new ArtifactManifestPropertiesFormat().withArtifacts(Arrays.asList(
            new ManifestArtifactFormat().withArtifactName("rykqgaifmvikl").withArtifactType(ArtifactType.ARM_TEMPLATE)
                .withArtifactVersion("khbejdznxc"),
            new ManifestArtifactFormat().withArtifactName("srhnjivo").withArtifactType(ArtifactType.IMAGE_FILE)
                .withArtifactVersion("ovqfzge"),
            new ManifestArtifactFormat().withArtifactName("dftuljltduce").withArtifactType(ArtifactType.ARM_TEMPLATE)
                .withArtifactVersion("czu"),
            new ManifestArtifactFormat().withArtifactName("ejwcwwqiok").withArtifactType(ArtifactType.OCIARTIFACT)
                .withArtifactVersion("mojmsvpkjprvkw")));
        model = BinaryData.fromObject(model).toObject(ArtifactManifestPropertiesFormat.class);
        Assertions.assertEquals("rykqgaifmvikl", model.artifacts().get(0).artifactName());
        Assertions.assertEquals(ArtifactType.ARM_TEMPLATE, model.artifacts().get(0).artifactType());
        Assertions.assertEquals("khbejdznxc", model.artifacts().get(0).artifactVersion());
    }
}
