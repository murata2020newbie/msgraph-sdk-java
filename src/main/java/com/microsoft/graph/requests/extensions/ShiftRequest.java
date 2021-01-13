// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.Shift;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Shift Request.
 */
public class ShiftRequest extends BaseRequest<Shift> {
	
    /**
     * The request for the Shift
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ShiftRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Shift.class);
    }

    /**
     * Gets the Shift from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Shift> futureGet() {
        return futureSend(HttpMethod.GET, null);
    }

    /**
     * Gets the Shift from the service
     *
     * @return the Shift from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Shift get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Shift> futureDelete() {
        return futureSend(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Shift delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Shift with a source
     *
     * @param sourceShift the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Shift> futurePatch(@Nonnull final Shift sourceShift) {
        return futureSend(HttpMethod.PATCH, sourceShift);
    }

    /**
     * Patches this Shift with a source
     *
     * @param sourceShift the source object with updates
     * @return the updated Shift
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Shift patch(@Nonnull final Shift sourceShift) throws ClientException {
        return send(HttpMethod.PATCH, sourceShift);
    }

    /**
     * Creates a Shift with a new object
     *
     * @param newShift the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Shift> futurePost(@Nonnull final Shift newShift) {
        return futureSend(HttpMethod.POST, newShift);
    }

    /**
     * Creates a Shift with a new object
     *
     * @param newShift the new object to create
     * @return the created Shift
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Shift post(@Nonnull final Shift newShift) throws ClientException {
        return send(HttpMethod.POST, newShift);
    }

    /**
     * Creates a Shift with a new object
     *
     * @param newShift the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Shift> futurePut(@Nonnull final Shift newShift) {
        return futureSend(HttpMethod.PUT, newShift);
    }

    /**
     * Creates a Shift with a new object
     *
     * @param newShift the object to create/update
     * @return the created Shift
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Shift put(@Nonnull final Shift newShift) throws ClientException {
        return send(HttpMethod.PUT, newShift);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ShiftRequest select(@Nonnull final String value) {
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
     public ShiftRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

