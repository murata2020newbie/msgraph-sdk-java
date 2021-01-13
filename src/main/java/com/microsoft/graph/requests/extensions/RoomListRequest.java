// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.RoomList;
import com.microsoft.graph.requests.extensions.RoomCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RoomRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Room List Request.
 */
public class RoomListRequest extends BaseRequest<RoomList> {
	
    /**
     * The request for the RoomList
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RoomListRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, RoomList.class);
    }

    /**
     * Gets the RoomList from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<RoomList> futureGet() {
        return futureSend(HttpMethod.GET, null);
    }

    /**
     * Gets the RoomList from the service
     *
     * @return the RoomList from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public RoomList get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<RoomList> futureDelete() {
        return futureSend(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public RoomList delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this RoomList with a source
     *
     * @param sourceRoomList the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<RoomList> futurePatch(@Nonnull final RoomList sourceRoomList) {
        return futureSend(HttpMethod.PATCH, sourceRoomList);
    }

    /**
     * Patches this RoomList with a source
     *
     * @param sourceRoomList the source object with updates
     * @return the updated RoomList
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public RoomList patch(@Nonnull final RoomList sourceRoomList) throws ClientException {
        return send(HttpMethod.PATCH, sourceRoomList);
    }

    /**
     * Creates a RoomList with a new object
     *
     * @param newRoomList the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<RoomList> futurePost(@Nonnull final RoomList newRoomList) {
        return futureSend(HttpMethod.POST, newRoomList);
    }

    /**
     * Creates a RoomList with a new object
     *
     * @param newRoomList the new object to create
     * @return the created RoomList
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public RoomList post(@Nonnull final RoomList newRoomList) throws ClientException {
        return send(HttpMethod.POST, newRoomList);
    }

    /**
     * Creates a RoomList with a new object
     *
     * @param newRoomList the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<RoomList> futurePut(@Nonnull final RoomList newRoomList) {
        return futureSend(HttpMethod.PUT, newRoomList);
    }

    /**
     * Creates a RoomList with a new object
     *
     * @param newRoomList the object to create/update
     * @return the created RoomList
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public RoomList put(@Nonnull final RoomList newRoomList) throws ClientException {
        return send(HttpMethod.PUT, newRoomList);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public RoomListRequest select(@Nonnull final String value) {
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
     public RoomListRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

