// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.StartHoldMusicOperation;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Start Hold Music Operation Request.
 */
public class StartHoldMusicOperationRequest extends BaseRequest<StartHoldMusicOperation> {
	
    /**
     * The request for the StartHoldMusicOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public StartHoldMusicOperationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, StartHoldMusicOperation.class);
    }

    /**
     * Gets the StartHoldMusicOperation from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<StartHoldMusicOperation> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the StartHoldMusicOperation from the service
     *
     * @return the StartHoldMusicOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public StartHoldMusicOperation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<StartHoldMusicOperation> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public StartHoldMusicOperation delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this StartHoldMusicOperation with a source
     *
     * @param sourceStartHoldMusicOperation the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<StartHoldMusicOperation> patchAsync(@Nonnull final StartHoldMusicOperation sourceStartHoldMusicOperation) {
        return sendAsync(HttpMethod.PATCH, sourceStartHoldMusicOperation);
    }

    /**
     * Patches this StartHoldMusicOperation with a source
     *
     * @param sourceStartHoldMusicOperation the source object with updates
     * @return the updated StartHoldMusicOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public StartHoldMusicOperation patch(@Nonnull final StartHoldMusicOperation sourceStartHoldMusicOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourceStartHoldMusicOperation);
    }

    /**
     * Creates a StartHoldMusicOperation with a new object
     *
     * @param newStartHoldMusicOperation the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<StartHoldMusicOperation> postAsync(@Nonnull final StartHoldMusicOperation newStartHoldMusicOperation) {
        return sendAsync(HttpMethod.POST, newStartHoldMusicOperation);
    }

    /**
     * Creates a StartHoldMusicOperation with a new object
     *
     * @param newStartHoldMusicOperation the new object to create
     * @return the created StartHoldMusicOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public StartHoldMusicOperation post(@Nonnull final StartHoldMusicOperation newStartHoldMusicOperation) throws ClientException {
        return send(HttpMethod.POST, newStartHoldMusicOperation);
    }

    /**
     * Creates a StartHoldMusicOperation with a new object
     *
     * @param newStartHoldMusicOperation the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<StartHoldMusicOperation> putAsync(@Nonnull final StartHoldMusicOperation newStartHoldMusicOperation) {
        return sendAsync(HttpMethod.PUT, newStartHoldMusicOperation);
    }

    /**
     * Creates a StartHoldMusicOperation with a new object
     *
     * @param newStartHoldMusicOperation the object to create/update
     * @return the created StartHoldMusicOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public StartHoldMusicOperation put(@Nonnull final StartHoldMusicOperation newStartHoldMusicOperation) throws ClientException {
        return send(HttpMethod.PUT, newStartHoldMusicOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public StartHoldMusicOperationRequest select(@Nonnull final String value) {
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
     public StartHoldMusicOperationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
