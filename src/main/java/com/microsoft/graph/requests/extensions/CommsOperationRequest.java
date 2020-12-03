// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CommsOperation;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Comms Operation Request.
 */
public class CommsOperationRequest extends BaseRequest<CommsOperation> {
	
    /**
     * The request for the CommsOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public CommsOperationRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends CommsOperation> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the CommsOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CommsOperationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CommsOperation.class);
    }

    /**
     * Gets the CommsOperation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super CommsOperation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the CommsOperation from the service
     *
     * @return the CommsOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CommsOperation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super CommsOperation> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this CommsOperation with a source
     *
     * @param sourceCommsOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final CommsOperation sourceCommsOperation, @Nonnull final ICallback<? super CommsOperation> callback) {
        send(HttpMethod.PATCH, callback, sourceCommsOperation);
    }

    /**
     * Patches this CommsOperation with a source
     *
     * @param sourceCommsOperation the source object with updates
     * @return the updated CommsOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CommsOperation patch(@Nonnull final CommsOperation sourceCommsOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourceCommsOperation);
    }

    /**
     * Creates a CommsOperation with a new object
     *
     * @param newCommsOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final CommsOperation newCommsOperation, @Nonnull final ICallback<? super CommsOperation> callback) {
        send(HttpMethod.POST, callback, newCommsOperation);
    }

    /**
     * Creates a CommsOperation with a new object
     *
     * @param newCommsOperation the new object to create
     * @return the created CommsOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CommsOperation post(@Nonnull final CommsOperation newCommsOperation) throws ClientException {
        return send(HttpMethod.POST, newCommsOperation);
    }

    /**
     * Creates a CommsOperation with a new object
     *
     * @param newCommsOperation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final CommsOperation newCommsOperation, @Nonnull final ICallback<? super CommsOperation> callback) {
        send(HttpMethod.PUT, callback, newCommsOperation);
    }

    /**
     * Creates a CommsOperation with a new object
     *
     * @param newCommsOperation the object to create/update
     * @return the created CommsOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CommsOperation put(@Nonnull final CommsOperation newCommsOperation) throws ClientException {
        return send(HttpMethod.PUT, newCommsOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public CommsOperationRequest select(@Nonnull final String value) {
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
     public CommsOperationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

