// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.encryption.cosmos.models;

import com.azure.cosmos.implementation.Utils;
import com.azure.cosmos.implementation.apachecommons.lang.StringUtils;
import com.azure.cosmos.implementation.apachecommons.lang.tuple.Pair;
import com.azure.cosmos.models.SqlParameter;
import com.azure.cosmos.models.SqlQuerySpec;
import com.azure.encryption.cosmos.CosmosEncryptionAsyncContainer;
import com.azure.encryption.cosmos.EncryptionBridgeInternal;
import com.azure.encryption.cosmos.implementation.EncryptionProcessor;
import com.azure.encryption.cosmos.implementation.EncryptionUtils;
import com.azure.encryption.cosmos.implementation.mdesrc.cryptography.EncryptionType;
import com.azure.encryption.cosmos.implementation.mdesrc.cryptography.MicrosoftDataEncryptionException;
import com.fasterxml.jackson.databind.JsonNode;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.List;

/**
 * Represents a SQL query with encryption parameters in the Azure Cosmos DB database service.
 */
public final class SqlQuerySpecWithEncryption {
    private SqlQuerySpec sqlQuerySpec;
    private HashMap<String, SqlParameter> encryptionParamMap = new HashMap<>();

    /**
     * Creates a new instance of SQL query spec with encryption.
     *
     * @param sqlQuerySpec the SQL query spec.
     */
    public SqlQuerySpecWithEncryption(SqlQuerySpec sqlQuerySpec) {
        this.sqlQuerySpec = sqlQuerySpec;
    }

    /**
     * Adds an encryption parameter.
     *
     * @param path Path
     * @param sqlParameter SQL parameter
     */
    public void addEncryptionParameter(String path, SqlParameter sqlParameter) {
        encryptionParamMap.put(path, sqlParameter);
    }

    Mono<Void> addEncryptionParameterAsync(String path, SqlParameter sqlParameter,
                                           CosmosEncryptionAsyncContainer cosmosEncryptionAsyncContainer) {
        if (StringUtils.isEmpty(path) || path.charAt(0) != '/' || path.lastIndexOf('/') != 0) {
            return Mono.empty();
        }

        List<SqlParameter> parameters = sqlQuerySpec.getParameters();
        if (parameters != null) {
            return EncryptionBridgeInternal.getEncryptionProcessor(cosmosEncryptionAsyncContainer)
                                           .initEncryptionSettingsIfNotInitializedAsync().then(Mono.defer(() -> {

                    return EncryptionBridgeInternal.getEncryptionProcessor(cosmosEncryptionAsyncContainer)
                        .getEncryptionSettings()
                        .getEncryptionSettingForPropertyAsync(sqlParameter.getName().substring(1),
                            EncryptionBridgeInternal.getEncryptionProcessor(cosmosEncryptionAsyncContainer)).flatMap(encryptionSettings -> {            // encryptionSettings.
                            if (encryptionSettings == null) {
                                // property not encrypted.
                                return Mono.empty();
                            }
                            if (encryptionSettings.getEncryptionType() == EncryptionType.Randomized) {
                                return Mono.error(new IllegalArgumentException(String.format("Path %s cannot be used " +
                                    "in " +
                                    "the " +
                                    "query because of randomized encryption", path)));
                            }
                            try {
                                byte[] valueByte =
                                    EncryptionUtils.serializeJsonToByteArray(EncryptionUtils.getSimpleObjectMapper(),
                                        sqlParameter.getValue(Object.class));
                                JsonNode itemJObj = Utils.parse(valueByte, JsonNode.class);
                                Pair<EncryptionProcessor.TypeMarker, byte[]> typeMarkerPair =
                                    EncryptionProcessor.toByteArray(itemJObj);
                                byte[] cipherText =
                                    encryptionSettings.getAeadAes256CbcHmac256EncryptionAlgorithm().encrypt(typeMarkerPair.getRight());
                                byte[] cipherTextWithTypeMarker = new byte[cipherText.length + 1];
                                cipherTextWithTypeMarker[0] = (byte) typeMarkerPair.getLeft().getValue();
                                System.arraycopy(cipherText, 0, cipherTextWithTypeMarker, 1, cipherText.length);
                                SqlParameter encryptedParameter = new SqlParameter(sqlParameter.getName(),
                                    cipherTextWithTypeMarker);
                                parameters.add(encryptedParameter);
                            } catch (MicrosoftDataEncryptionException ex) {
                                return Mono.error(ex);
                            }
                            return Mono.empty();
                        });

                }));
        }
        return Mono.empty();
    }

    HashMap<String, SqlParameter> getEncryptionParamMap() {
        return encryptionParamMap;
    }

    SqlQuerySpec getSqlQuerySpec() {
        return sqlQuerySpec;
    }
}
