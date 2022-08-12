// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DocumentSetVersion;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Document Set Version Request Builder.
 */
public class DocumentSetVersionRequestBuilder extends BaseRequestBuilder<DocumentSetVersion> {

    /**
     * The request builder for the DocumentSetVersion
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DocumentSetVersionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DocumentSetVersionRequest instance
     */
    @Nonnull
    public DocumentSetVersionRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the DocumentSetVersionRequest instance
     */
    @Nonnull
    public DocumentSetVersionRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.DocumentSetVersionRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for FieldValueSet
     *
     * @return the FieldValueSetRequestBuilder instance
     */
    @Nonnull
    public FieldValueSetRequestBuilder fields() {
        return new FieldValueSetRequestBuilder(getRequestUrlWithAdditionalSegment("fields"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public DocumentSetVersionRestoreRequestBuilder restore() {
        return new DocumentSetVersionRestoreRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.restore"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ListItemVersionRestoreVersionRequestBuilder restoreVersion() {
        return new ListItemVersionRestoreVersionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.restoreVersion"), getClient(), null);
    }
}