/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.keyvault;

import com.microsoft.windowsazure.exception.ServiceException;

import java.io.IOException;
import java.util.concurrent.Future;

/**
 * Cryptographic and management operations for keys in a vault
 */
interface KeyOperations {
    /**
     * Requests that a backup of the specified key be downloaded to the client.
     *
     * @param keyIdentifier
     *            Required.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred. This
     *             class is the general class of exceptions produced by failed
     *             or interrupted I/O operations.
     * @throws ServiceException
     *             Thrown if an unexpected response is found.
     * @return Represents the response to a key operation request.
     */
    KeyOpResponseMessageWithRawJsonContent backup(String keyIdentifier) throws IOException, ServiceException;

    /**
     * Requests that a backup of the specified key be downloaded to the client.
     *
     * @param keyIdentifier
     *            Required.
     * @return Represents the response to a key operation request.
     */
    Future<KeyOpResponseMessageWithRawJsonContent> backupAsync(String keyIdentifier);

    /**
     * Creates a new, named, key in the specified vault.
     *
     * @param vault
     *            Required.
     * @param keyName
     *            Required.
     * @param keyOpRequest
     *            Required.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred. This
     *             class is the general class of exceptions produced by failed
     *             or interrupted I/O operations.
     * @throws ServiceException
     *             Thrown if an unexpected response is found.
     * @return Represents the response to a key operation request.
     */
    KeyOpResponseMessageWithRawJsonContent create(String vault, String keyName, KeyOpRequestMessageWithRawJsonContent keyOpRequest) throws IOException, ServiceException;

    /**
     * Creates a new, named, key in the specified vault.
     *
     * @param vault
     *            Required.
     * @param keyName
     *            Required.
     * @param keyOpRequest
     *            Required.
     * @return Represents the response to a key operation request.
     */
    Future<KeyOpResponseMessageWithRawJsonContent> createAsync(String vault, String keyName, KeyOpRequestMessageWithRawJsonContent keyOpRequest);

    /**
     * Decrypts a single block of data.
     *
     * @param keyIdentifier
     *            Required.
     * @param keyOpRequest
     *            Required.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred. This
     *             class is the general class of exceptions produced by failed
     *             or interrupted I/O operations.
     * @throws ServiceException
     *             Thrown if an unexpected response is found.
     * @return Represents the response to a key operation request.
     */
    KeyOpResponseMessageWithRawJsonContent decryptData(String keyIdentifier, KeyOpRequestMessageWithRawJsonContent keyOpRequest) throws IOException, ServiceException;

    /**
     * Decrypts a single block of data.
     *
     * @param keyIdentifier
     *            Required.
     * @param keyOpRequest
     *            Required.
     * @return Represents the response to a key operation request.
     */
    Future<KeyOpResponseMessageWithRawJsonContent> decryptDataAsync(String keyIdentifier, KeyOpRequestMessageWithRawJsonContent keyOpRequest);

    /**
     * Delete the specified key
     *
     * @param vault
     *            Required.
     * @param keyName
     *            Required.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred. This
     *             class is the general class of exceptions produced by failed
     *             or interrupted I/O operations.
     * @throws ServiceException
     *             Thrown if an unexpected response is found.
     * @return Represents the response to a key operation request.
     */
    KeyOpResponseMessageWithRawJsonContent deleteKey(String vault, String keyName) throws IOException, ServiceException;

    /**
     * Delete the specified key
     *
     * @param vault
     *            Required.
     * @param keyName
     *            Required.
     * @return Represents the response to a key operation request.
     */
    Future<KeyOpResponseMessageWithRawJsonContent> deleteKeyAsync(String vault, String keyName);

    /**
     * Encrypts a single block of data.
     *
     * @param keyIdentifier
     *            Required.
     * @param keyOpRequest
     *            Required.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred. This
     *             class is the general class of exceptions produced by failed
     *             or interrupted I/O operations.
     * @throws ServiceException
     *             Thrown if an unexpected response is found.
     * @return Represents the response to a key operation request.
     */
    KeyOpResponseMessageWithRawJsonContent encryptData(String keyIdentifier, KeyOpRequestMessageWithRawJsonContent keyOpRequest) throws IOException, ServiceException;

    /**
     * Encrypts a single block of data.
     *
     * @param keyIdentifier
     *            Required.
     * @param keyOpRequest
     *            Required.
     * @return Represents the response to a key operation request.
     */
    Future<KeyOpResponseMessageWithRawJsonContent> encryptDataAsync(String keyIdentifier, KeyOpRequestMessageWithRawJsonContent keyOpRequest);

    /**
     * Retrieves the public portion of a key plus its attributes
     *
     * @param keyIdentifier
     *            Required.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred. This
     *             class is the general class of exceptions produced by failed
     *             or interrupted I/O operations.
     * @throws ServiceException
     *             Thrown if an unexpected response is found.
     * @return Represents the response to a key operation request.
     */
    KeyOpResponseMessageWithRawJsonContent get(String keyIdentifier) throws IOException, ServiceException;

    /**
     * Retrieves the public portion of a key plus its attributes
     *
     * @param keyIdentifier
     *            Required.
     * @return Represents the response to a key operation request.
     */
    Future<KeyOpResponseMessageWithRawJsonContent> getAsync(String keyIdentifier);

    /**
     * Imports a key into the specified vault
     *
     * @param keyIdentifier
     *            Required.
     * @param keyOpRequest
     *            Required.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred. This
     *             class is the general class of exceptions produced by failed
     *             or interrupted I/O operations.
     * @throws ServiceException
     *             Thrown if an unexpected response is found.
     * @return Represents the response to a key operation request.
     */
    KeyOpResponseMessageWithRawJsonContent importMethod(String keyIdentifier, KeyOpRequestMessageWithRawJsonContent keyOpRequest) throws IOException, ServiceException;

    /**
     * Imports a key into the specified vault
     *
     * @param keyIdentifier
     *            Required.
     * @param keyOpRequest
     *            Required.
     * @return Represents the response to a key operation request.
     */
    Future<KeyOpResponseMessageWithRawJsonContent> importMethodAsync(String keyIdentifier, KeyOpRequestMessageWithRawJsonContent keyOpRequest);

    /**
     * List the keys in the vault
     *
     * @param vault
     *            Required.
     * @param top
     *            Required.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred. This
     *             class is the general class of exceptions produced by failed
     *             or interrupted I/O operations.
     * @throws ServiceException
     *             Thrown if an unexpected response is found.
     * @return Represents the response to a key operation request.
     */
    KeyOpResponseMessageWithRawJsonContent list(String vault, Integer top) throws IOException, ServiceException;

    /**
     * List the keys in the vault
     *
     * @param vault
     *            Required.
     * @param top
     *            Required.
     * @return Represents the response to a key operation request.
     */
    Future<KeyOpResponseMessageWithRawJsonContent> listAsync(String vault, Integer top);

    /**
     * List the next page of keys in the vault
     *
     * @param nextLink
     *            Required.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred. This
     *             class is the general class of exceptions produced by failed
     *             or interrupted I/O operations.
     * @throws ServiceException
     *             Thrown if an unexpected response is found.
     * @return Represents the response to a key operation request.
     */
    KeyOpResponseMessageWithRawJsonContent listNext(String nextLink) throws IOException, ServiceException;

    /**
     * List the next page of keys in the vault
     *
     * @param nextLink
     *            Required.
     * @return Represents the response to a key operation request.
     */
    Future<KeyOpResponseMessageWithRawJsonContent> listNextAsync(String nextLink);

    /**
     * List the versions of a key
     *
     * @param vault
     *            Required.
     * @param keyName
     *            Required.
     * @param top
     *            Required.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred. This
     *             class is the general class of exceptions produced by failed
     *             or interrupted I/O operations.
     * @throws ServiceException
     *             Thrown if an unexpected response is found.
     * @return Represents the response to a key operation request.
     */
    KeyOpResponseMessageWithRawJsonContent listVersions(String vault, String keyName, Integer top) throws IOException, ServiceException;

    /**
     * List the versions of a key
     *
     * @param vault
     *            Required.
     * @param keyName
     *            Required.
     * @param top
     *            Required.
     * @return Represents the response to a key operation request.
     */
    Future<KeyOpResponseMessageWithRawJsonContent> listVersionsAsync(String vault, String keyName, Integer top);

    /**
     * List the next page of versions of a key
     *
     * @param nextLink
     *            Required.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred. This
     *             class is the general class of exceptions produced by failed
     *             or interrupted I/O operations.
     * @throws ServiceException
     *             Thrown if an unexpected response is found.
     * @return Represents the response to a key operation request.
     */
    KeyOpResponseMessageWithRawJsonContent listVersionsNext(String nextLink) throws IOException, ServiceException;

    /**
     * List the next page of versions of a key
     *
     * @param nextLink
     *            Required.
     * @return Represents the response to a key operation request.
     */
    Future<KeyOpResponseMessageWithRawJsonContent> listVersionsNextAsync(String nextLink);

    /**
     * Restores the backup key in to a vault
     *
     * @param vault
     *            Required.
     * @param keyOpRequest
     *            Required.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred. This
     *             class is the general class of exceptions produced by failed
     *             or interrupted I/O operations.
     * @throws ServiceException
     *             Thrown if an unexpected response is found.
     * @return Represents the response to a key operation request.
     */
    KeyOpResponseMessageWithRawJsonContent restore(String vault, KeyOpRequestMessageWithRawJsonContent keyOpRequest) throws IOException, ServiceException;

    /**
     * Restores the backup key in to a vault
     *
     * @param vault
     *            Required.
     * @param keyOpRequest
     *            Required.
     * @return Represents the response to a key operation request.
     */
    Future<KeyOpResponseMessageWithRawJsonContent> restoreAsync(String vault, KeyOpRequestMessageWithRawJsonContent keyOpRequest);

    /**
     * Creates a signature from a digest using the specified key in the vault
     *
     * @param keyIdentifier
     *            Required.
     * @param keyOpRequest
     *            Required.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred. This
     *             class is the general class of exceptions produced by failed
     *             or interrupted I/O operations.
     * @throws ServiceException
     *             Thrown if an unexpected response is found.
     * @return Represents the response to a key operation request.
     */
    KeyOpResponseMessageWithRawJsonContent sign(String keyIdentifier, KeyOpRequestMessageWithRawJsonContent keyOpRequest) throws IOException, ServiceException;

    /**
     * Creates a signature from a digest using the specified key in the vault
     *
     * @param keyIdentifier
     *            Required.
     * @param keyOpRequest
     *            Required.
     * @return Represents the response to a key operation request.
     */
    Future<KeyOpResponseMessageWithRawJsonContent> signAsync(String keyIdentifier, KeyOpRequestMessageWithRawJsonContent keyOpRequest);

    /**
     * Unwraps a symmetric key using the specified key in the vault
     *
     * @param keyIdentifier
     *            Required.
     * @param keyOpRequest
     *            Required.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred. This
     *             class is the general class of exceptions produced by failed
     *             or interrupted I/O operations.
     * @throws ServiceException
     *             Thrown if an unexpected response is found.
     * @return Represents the response to a key operation request.
     */
    KeyOpResponseMessageWithRawJsonContent unwrapKey(String keyIdentifier, KeyOpRequestMessageWithRawJsonContent keyOpRequest) throws IOException, ServiceException;

    /**
     * Unwraps a symmetric key using the specified key in the vault
     *
     * @param keyIdentifier
     *            Required.
     * @param keyOpRequest
     *            Required.
     * @return Represents the response to a key operation request.
     */
    Future<KeyOpResponseMessageWithRawJsonContent> unwrapKeyAsync(String keyIdentifier, KeyOpRequestMessageWithRawJsonContent keyOpRequest);

    /**
     * Updates the Key Attributes associated with the specified key
     *
     * @param keyIdentifier
     *            Required.
     * @param keyOpRequest
     *            Required.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred. This
     *             class is the general class of exceptions produced by failed
     *             or interrupted I/O operations.
     * @throws ServiceException
     *             Thrown if an unexpected response is found.
     * @return Represents the response to a key operation request.
     */
    KeyOpResponseMessageWithRawJsonContent update(String keyIdentifier, KeyOpRequestMessageWithRawJsonContent keyOpRequest) throws IOException, ServiceException;

    /**
     * Updates the Key Attributes associated with the specified key
     *
     * @param keyIdentifier
     *            Required.
     * @param keyOpRequest
     *            Required.
     * @return Represents the response to a key operation request.
     */
    Future<KeyOpResponseMessageWithRawJsonContent> updateAsync(String keyIdentifier, KeyOpRequestMessageWithRawJsonContent keyOpRequest);

    /**
     * Verifies a signature using the specified key
     *
     * @param keyIdentifier
     *            Required.
     * @param keyOpRequest
     *            Required.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred. This
     *             class is the general class of exceptions produced by failed
     *             or interrupted I/O operations.
     * @throws ServiceException
     *             Thrown if an unexpected response is found.
     * @return Represents the response to a key operation request.
     */
    KeyOpResponseMessageWithRawJsonContent verify(String keyIdentifier, KeyOpRequestMessageWithRawJsonContent keyOpRequest) throws IOException, ServiceException;

    /**
     * Verifies a signature using the specified key
     *
     * @param keyIdentifier
     *            Required.
     * @param keyOpRequest
     *            Required.
     * @return Represents the response to a key operation request.
     */
    Future<KeyOpResponseMessageWithRawJsonContent> verifyAsync(String keyIdentifier, KeyOpRequestMessageWithRawJsonContent keyOpRequest);

    /**
     * Wraps a symmetric key using the specified key
     *
     * @param keyIdentifier
     *            Required.
     * @param keyOpRequest
     *            Required.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred. This
     *             class is the general class of exceptions produced by failed
     *             or interrupted I/O operations.
     * @throws ServiceException
     *             Thrown if an unexpected response is found.
     * @return Represents the response to a key operation request.
     */
    KeyOpResponseMessageWithRawJsonContent wrapKey(String keyIdentifier, KeyOpRequestMessageWithRawJsonContent keyOpRequest) throws IOException, ServiceException;

    /**
     * Wraps a symmetric key using the specified key
     *
     * @param keyIdentifier
     *            Required.
     * @param keyOpRequest
     *            Required.
     * @return Represents the response to a key operation request.
     */
    Future<KeyOpResponseMessageWithRawJsonContent> wrapKeyAsync(String keyIdentifier, KeyOpRequestMessageWithRawJsonContent keyOpRequest);
}
