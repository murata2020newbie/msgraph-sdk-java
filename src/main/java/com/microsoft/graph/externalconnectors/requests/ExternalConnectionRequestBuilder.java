// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.externalconnectors.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.externalconnectors.models.ExternalConnection;
import com.microsoft.graph.externalconnectors.requests.ExternalItemCollectionRequestBuilder;
import com.microsoft.graph.externalconnectors.requests.ExternalItemRequestBuilder;
import com.microsoft.graph.externalconnectors.requests.ConnectionOperationCollectionRequestBuilder;
import com.microsoft.graph.externalconnectors.requests.ConnectionOperationRequestBuilder;
import com.microsoft.graph.externalconnectors.requests.SchemaRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the External Connection Request Builder.
 */
public class ExternalConnectionRequestBuilder extends BaseRequestBuilder<ExternalConnection> {

    /**
     * The request builder for the ExternalConnection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ExternalConnectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ExternalConnectionRequest instance
     */
    @Nonnull
    public ExternalConnectionRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ExternalConnectionRequest instance
     */
    @Nonnull
    public ExternalConnectionRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.externalconnectors.requests.ExternalConnectionRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the ExternalItem collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ExternalItemCollectionRequestBuilder items() {
        return new ExternalItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("items"), getClient(), null);
    }

    /**
     * Gets a request builder for the ExternalItem item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ExternalItemRequestBuilder items(@Nonnull final String id) {
        return new ExternalItemRequestBuilder(getRequestUrlWithAdditionalSegment("items") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ConnectionOperation collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ConnectionOperationCollectionRequestBuilder operations() {
        return new ConnectionOperationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("operations"), getClient(), null);
    }

    /**
     * Gets a request builder for the ConnectionOperation item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ConnectionOperationRequestBuilder operations(@Nonnull final String id) {
        return new ConnectionOperationRequestBuilder(getRequestUrlWithAdditionalSegment("operations") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Schema
     *
     * @return the SchemaRequestBuilder instance
     */
    @Nonnull
    public SchemaRequestBuilder schema() {
        return new SchemaRequestBuilder(getRequestUrlWithAdditionalSegment("schema"), getClient(), null);
    }
}
