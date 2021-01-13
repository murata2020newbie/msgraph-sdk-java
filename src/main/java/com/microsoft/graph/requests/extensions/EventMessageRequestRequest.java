// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.EventMessageRequest;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Event Message Request Request.
 */
public class EventMessageRequestRequest extends BaseRequest<EventMessageRequest> {
	
    /**
     * The request for the EventMessageRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EventMessageRequestRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EventMessageRequest.class);
    }

    /**
     * Gets the EventMessageRequest from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EventMessageRequest> futureGet() {
        return futureSend(HttpMethod.GET, null);
    }

    /**
     * Gets the EventMessageRequest from the service
     *
     * @return the EventMessageRequest from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EventMessageRequest get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EventMessageRequest> futureDelete() {
        return futureSend(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public EventMessageRequest delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this EventMessageRequest with a source
     *
     * @param sourceEventMessageRequest the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EventMessageRequest> futurePatch(@Nonnull final EventMessageRequest sourceEventMessageRequest) {
        return futureSend(HttpMethod.PATCH, sourceEventMessageRequest);
    }

    /**
     * Patches this EventMessageRequest with a source
     *
     * @param sourceEventMessageRequest the source object with updates
     * @return the updated EventMessageRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EventMessageRequest patch(@Nonnull final EventMessageRequest sourceEventMessageRequest) throws ClientException {
        return send(HttpMethod.PATCH, sourceEventMessageRequest);
    }

    /**
     * Creates a EventMessageRequest with a new object
     *
     * @param newEventMessageRequest the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EventMessageRequest> futurePost(@Nonnull final EventMessageRequest newEventMessageRequest) {
        return futureSend(HttpMethod.POST, newEventMessageRequest);
    }

    /**
     * Creates a EventMessageRequest with a new object
     *
     * @param newEventMessageRequest the new object to create
     * @return the created EventMessageRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EventMessageRequest post(@Nonnull final EventMessageRequest newEventMessageRequest) throws ClientException {
        return send(HttpMethod.POST, newEventMessageRequest);
    }

    /**
     * Creates a EventMessageRequest with a new object
     *
     * @param newEventMessageRequest the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EventMessageRequest> futurePut(@Nonnull final EventMessageRequest newEventMessageRequest) {
        return futureSend(HttpMethod.PUT, newEventMessageRequest);
    }

    /**
     * Creates a EventMessageRequest with a new object
     *
     * @param newEventMessageRequest the object to create/update
     * @return the created EventMessageRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EventMessageRequest put(@Nonnull final EventMessageRequest newEventMessageRequest) throws ClientException {
        return send(HttpMethod.PUT, newEventMessageRequest);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public EventMessageRequestRequest select(@Nonnull final String value) {
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
     public EventMessageRequestRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

