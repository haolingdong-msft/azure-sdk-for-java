// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.share.stress;

import com.azure.core.util.Context;
import com.azure.storage.file.share.ShareFileAsyncClient;
import com.azure.storage.file.share.ShareFileClient;
import com.azure.storage.file.share.models.ShareFileUploadRangeOptions;
import com.azure.storage.file.share.stress.utils.OriginalContent;
import com.azure.storage.stress.CrcInputStream;
import com.azure.storage.stress.StorageStressOptions;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.nio.ByteBuffer;

public class UploadRange extends ShareScenarioBase<StorageStressOptions> {
    private final OriginalContent originalContent = new OriginalContent();
    private final ShareFileClient syncClient;
    private final ShareFileAsyncClient asyncClient;
    private final ShareFileAsyncClient asyncNoFaultClient;

    public UploadRange(StorageStressOptions options) {
        super(options);
        String fileName = generateFileName();
        this.syncClient = getSyncShareClient().getFileClient(fileName);
        this.asyncClient = getAsyncShareClient().getFileClient(fileName);
        this.asyncNoFaultClient = getAsyncShareClientNoFault().getFileClient(fileName);
    }

    @Override
    protected void runInternal(Context span) {
        try (CrcInputStream inputStream = new CrcInputStream(originalContent.getContentHead(), options.getSize())) {
            syncClient.uploadRangeWithResponse(new ShareFileUploadRangeOptions(inputStream, options.getSize()), null, span);
            originalContent.checkMatch(inputStream.getContentInfo(), span).block();
        }
    }

    @Override
    protected Mono<Void> runInternalAsync(Context span) {
        Flux<ByteBuffer> byteBufferFlux = new CrcInputStream(originalContent.getContentHead(), options.getSize())
            .convertStreamToByteBuffer();
        return asyncClient.uploadRange(byteBufferFlux, options.getSize())
            .then(originalContent.checkMatch(byteBufferFlux, span));
    }

    @Override
    public Mono<Void> setupAsync() {
        return super.setupAsync()
            .then(originalContent.setupFile(asyncNoFaultClient, options.getSize()));
    }

    @Override
    public Mono<Void> cleanupAsync() {
        return asyncNoFaultClient.deleteIfExists()
            .then(super.cleanupAsync());
    }
}
