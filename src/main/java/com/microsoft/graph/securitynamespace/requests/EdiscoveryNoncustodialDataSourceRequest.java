// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.EdiscoveryNoncustodialDataSource;
import com.microsoft.graph.security.requests.DataSourceRequestBuilder;
import com.microsoft.graph.security.requests.EdiscoveryIndexOperationWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Noncustodial Data Source Request.
 */
public class EdiscoveryNoncustodialDataSourceRequest extends BaseRequest<EdiscoveryNoncustodialDataSource> {
	
    /**
     * The request for the EdiscoveryNoncustodialDataSource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EdiscoveryNoncustodialDataSourceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EdiscoveryNoncustodialDataSource.class);
    }

    /**
     * Gets the EdiscoveryNoncustodialDataSource from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryNoncustodialDataSource> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the EdiscoveryNoncustodialDataSource from the service
     *
     * @return the EdiscoveryNoncustodialDataSource from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EdiscoveryNoncustodialDataSource get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryNoncustodialDataSource> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public EdiscoveryNoncustodialDataSource delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this EdiscoveryNoncustodialDataSource with a source
     *
     * @param sourceEdiscoveryNoncustodialDataSource the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryNoncustodialDataSource> patchAsync(@Nonnull final EdiscoveryNoncustodialDataSource sourceEdiscoveryNoncustodialDataSource) {
        return sendAsync(HttpMethod.PATCH, sourceEdiscoveryNoncustodialDataSource);
    }

    /**
     * Patches this EdiscoveryNoncustodialDataSource with a source
     *
     * @param sourceEdiscoveryNoncustodialDataSource the source object with updates
     * @return the updated EdiscoveryNoncustodialDataSource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EdiscoveryNoncustodialDataSource patch(@Nonnull final EdiscoveryNoncustodialDataSource sourceEdiscoveryNoncustodialDataSource) throws ClientException {
        return send(HttpMethod.PATCH, sourceEdiscoveryNoncustodialDataSource);
    }

    /**
     * Creates a EdiscoveryNoncustodialDataSource with a new object
     *
     * @param newEdiscoveryNoncustodialDataSource the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryNoncustodialDataSource> postAsync(@Nonnull final EdiscoveryNoncustodialDataSource newEdiscoveryNoncustodialDataSource) {
        return sendAsync(HttpMethod.POST, newEdiscoveryNoncustodialDataSource);
    }

    /**
     * Creates a EdiscoveryNoncustodialDataSource with a new object
     *
     * @param newEdiscoveryNoncustodialDataSource the new object to create
     * @return the created EdiscoveryNoncustodialDataSource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EdiscoveryNoncustodialDataSource post(@Nonnull final EdiscoveryNoncustodialDataSource newEdiscoveryNoncustodialDataSource) throws ClientException {
        return send(HttpMethod.POST, newEdiscoveryNoncustodialDataSource);
    }

    /**
     * Creates a EdiscoveryNoncustodialDataSource with a new object
     *
     * @param newEdiscoveryNoncustodialDataSource the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EdiscoveryNoncustodialDataSource> putAsync(@Nonnull final EdiscoveryNoncustodialDataSource newEdiscoveryNoncustodialDataSource) {
        return sendAsync(HttpMethod.PUT, newEdiscoveryNoncustodialDataSource);
    }

    /**
     * Creates a EdiscoveryNoncustodialDataSource with a new object
     *
     * @param newEdiscoveryNoncustodialDataSource the object to create/update
     * @return the created EdiscoveryNoncustodialDataSource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EdiscoveryNoncustodialDataSource put(@Nonnull final EdiscoveryNoncustodialDataSource newEdiscoveryNoncustodialDataSource) throws ClientException {
        return send(HttpMethod.PUT, newEdiscoveryNoncustodialDataSource);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public EdiscoveryNoncustodialDataSourceRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public EdiscoveryNoncustodialDataSourceRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
