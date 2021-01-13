// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.IosManagedAppProtection;
import com.microsoft.graph.requests.extensions.ManagedMobileAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedMobileAppRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyDeploymentSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Managed App Protection Request.
 */
public class IosManagedAppProtectionRequest extends BaseRequest<IosManagedAppProtection> {
	
    /**
     * The request for the IosManagedAppProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosManagedAppProtectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosManagedAppProtection.class);
    }

    /**
     * Gets the IosManagedAppProtection from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosManagedAppProtection> futureGet() {
        return futureSend(HttpMethod.GET, null);
    }

    /**
     * Gets the IosManagedAppProtection from the service
     *
     * @return the IosManagedAppProtection from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosManagedAppProtection get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosManagedAppProtection> futureDelete() {
        return futureSend(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public IosManagedAppProtection delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this IosManagedAppProtection with a source
     *
     * @param sourceIosManagedAppProtection the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosManagedAppProtection> futurePatch(@Nonnull final IosManagedAppProtection sourceIosManagedAppProtection) {
        return futureSend(HttpMethod.PATCH, sourceIosManagedAppProtection);
    }

    /**
     * Patches this IosManagedAppProtection with a source
     *
     * @param sourceIosManagedAppProtection the source object with updates
     * @return the updated IosManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosManagedAppProtection patch(@Nonnull final IosManagedAppProtection sourceIosManagedAppProtection) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosManagedAppProtection);
    }

    /**
     * Creates a IosManagedAppProtection with a new object
     *
     * @param newIosManagedAppProtection the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosManagedAppProtection> futurePost(@Nonnull final IosManagedAppProtection newIosManagedAppProtection) {
        return futureSend(HttpMethod.POST, newIosManagedAppProtection);
    }

    /**
     * Creates a IosManagedAppProtection with a new object
     *
     * @param newIosManagedAppProtection the new object to create
     * @return the created IosManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosManagedAppProtection post(@Nonnull final IosManagedAppProtection newIosManagedAppProtection) throws ClientException {
        return send(HttpMethod.POST, newIosManagedAppProtection);
    }

    /**
     * Creates a IosManagedAppProtection with a new object
     *
     * @param newIosManagedAppProtection the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosManagedAppProtection> futurePut(@Nonnull final IosManagedAppProtection newIosManagedAppProtection) {
        return futureSend(HttpMethod.PUT, newIosManagedAppProtection);
    }

    /**
     * Creates a IosManagedAppProtection with a new object
     *
     * @param newIosManagedAppProtection the object to create/update
     * @return the created IosManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosManagedAppProtection put(@Nonnull final IosManagedAppProtection newIosManagedAppProtection) throws ClientException {
        return send(HttpMethod.PUT, newIosManagedAppProtection);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public IosManagedAppProtectionRequest select(@Nonnull final String value) {
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
     public IosManagedAppProtectionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

