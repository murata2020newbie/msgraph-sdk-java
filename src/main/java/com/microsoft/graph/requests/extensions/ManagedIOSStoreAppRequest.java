// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.ManagedIOSStoreApp;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed IOSStore App Request.
 */
public class ManagedIOSStoreAppRequest extends BaseRequest<ManagedIOSStoreApp> {
	
    /**
     * The request for the ManagedIOSStoreApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedIOSStoreAppRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedIOSStoreApp.class);
    }

    /**
     * Gets the ManagedIOSStoreApp from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedIOSStoreApp> futureGet() {
        return futureSend(HttpMethod.GET, null);
    }

    /**
     * Gets the ManagedIOSStoreApp from the service
     *
     * @return the ManagedIOSStoreApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedIOSStoreApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedIOSStoreApp> futureDelete() {
        return futureSend(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ManagedIOSStoreApp delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ManagedIOSStoreApp with a source
     *
     * @param sourceManagedIOSStoreApp the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedIOSStoreApp> futurePatch(@Nonnull final ManagedIOSStoreApp sourceManagedIOSStoreApp) {
        return futureSend(HttpMethod.PATCH, sourceManagedIOSStoreApp);
    }

    /**
     * Patches this ManagedIOSStoreApp with a source
     *
     * @param sourceManagedIOSStoreApp the source object with updates
     * @return the updated ManagedIOSStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedIOSStoreApp patch(@Nonnull final ManagedIOSStoreApp sourceManagedIOSStoreApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedIOSStoreApp);
    }

    /**
     * Creates a ManagedIOSStoreApp with a new object
     *
     * @param newManagedIOSStoreApp the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedIOSStoreApp> futurePost(@Nonnull final ManagedIOSStoreApp newManagedIOSStoreApp) {
        return futureSend(HttpMethod.POST, newManagedIOSStoreApp);
    }

    /**
     * Creates a ManagedIOSStoreApp with a new object
     *
     * @param newManagedIOSStoreApp the new object to create
     * @return the created ManagedIOSStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedIOSStoreApp post(@Nonnull final ManagedIOSStoreApp newManagedIOSStoreApp) throws ClientException {
        return send(HttpMethod.POST, newManagedIOSStoreApp);
    }

    /**
     * Creates a ManagedIOSStoreApp with a new object
     *
     * @param newManagedIOSStoreApp the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedIOSStoreApp> futurePut(@Nonnull final ManagedIOSStoreApp newManagedIOSStoreApp) {
        return futureSend(HttpMethod.PUT, newManagedIOSStoreApp);
    }

    /**
     * Creates a ManagedIOSStoreApp with a new object
     *
     * @param newManagedIOSStoreApp the object to create/update
     * @return the created ManagedIOSStoreApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedIOSStoreApp put(@Nonnull final ManagedIOSStoreApp newManagedIOSStoreApp) throws ClientException {
        return send(HttpMethod.PUT, newManagedIOSStoreApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ManagedIOSStoreAppRequest select(@Nonnull final String value) {
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
     public ManagedIOSStoreAppRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

