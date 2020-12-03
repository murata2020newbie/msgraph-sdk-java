// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedAppStatus;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Status Request.
 */
public class ManagedAppStatusRequest extends BaseRequest<ManagedAppStatus> {
	
    /**
     * The request for the ManagedAppStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public ManagedAppStatusRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends ManagedAppStatus> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the ManagedAppStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppStatusRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedAppStatus.class);
    }

    /**
     * Gets the ManagedAppStatus from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super ManagedAppStatus> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedAppStatus from the service
     *
     * @return the ManagedAppStatus from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAppStatus get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super ManagedAppStatus> callback) {
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
     * Patches this ManagedAppStatus with a source
     *
     * @param sourceManagedAppStatus the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final ManagedAppStatus sourceManagedAppStatus, @Nonnull final ICallback<? super ManagedAppStatus> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedAppStatus);
    }

    /**
     * Patches this ManagedAppStatus with a source
     *
     * @param sourceManagedAppStatus the source object with updates
     * @return the updated ManagedAppStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAppStatus patch(@Nonnull final ManagedAppStatus sourceManagedAppStatus) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedAppStatus);
    }

    /**
     * Creates a ManagedAppStatus with a new object
     *
     * @param newManagedAppStatus the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final ManagedAppStatus newManagedAppStatus, @Nonnull final ICallback<? super ManagedAppStatus> callback) {
        send(HttpMethod.POST, callback, newManagedAppStatus);
    }

    /**
     * Creates a ManagedAppStatus with a new object
     *
     * @param newManagedAppStatus the new object to create
     * @return the created ManagedAppStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAppStatus post(@Nonnull final ManagedAppStatus newManagedAppStatus) throws ClientException {
        return send(HttpMethod.POST, newManagedAppStatus);
    }

    /**
     * Creates a ManagedAppStatus with a new object
     *
     * @param newManagedAppStatus the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final ManagedAppStatus newManagedAppStatus, @Nonnull final ICallback<? super ManagedAppStatus> callback) {
        send(HttpMethod.PUT, callback, newManagedAppStatus);
    }

    /**
     * Creates a ManagedAppStatus with a new object
     *
     * @param newManagedAppStatus the object to create/update
     * @return the created ManagedAppStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedAppStatus put(@Nonnull final ManagedAppStatus newManagedAppStatus) throws ClientException {
        return send(HttpMethod.PUT, newManagedAppStatus);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ManagedAppStatusRequest select(@Nonnull final String value) {
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
     public ManagedAppStatusRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

