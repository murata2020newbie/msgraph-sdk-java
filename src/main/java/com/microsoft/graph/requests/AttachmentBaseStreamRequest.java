// Template Source: BaseStreamRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AttachmentBase;
import com.microsoft.graph.models.AttachmentInfo;
import com.microsoft.graph.models.UploadSession;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseStreamRequest;

import java.io.InputStream;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Attachment Base Stream Request.
 */
public class AttachmentBaseStreamRequest extends BaseStreamRequest<AttachmentBase> {

    /**
     * The request for the AttachmentBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AttachmentBaseStreamRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AttachmentBase.class);
    }

    /**
     * Gets the contents of this stream
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<InputStream> getAsync() {
        return sendAsync();
    }

    /**
     * Gets the contents of this stream
     *
     * @return the stream that the caller needs to close
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public InputStream get() throws ClientException {
       return send();
    }

    /**
     * Uploads to the stream
     *
     * @param fileContents the contents of the stream to upload
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AttachmentBase> putAsync(@Nonnull final byte[] fileContents) {
        return sendAsync(fileContents);
    }

    /**
     * Uploads to the stream
     *
     * @param fileContents the contents of the stream to upload
     * @return the result of the upload
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public AttachmentBase put(@Nonnull final byte[] fileContents) throws ClientException {
        return send(fileContents);
    }
}
