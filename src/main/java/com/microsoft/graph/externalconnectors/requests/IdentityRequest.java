// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.externalconnectors.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.externalconnectors.models.Identity;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Request.
 */
public class IdentityRequest extends BaseRequest<Identity> {
	
    /**
     * The request for the Identity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IdentityRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Identity.class);
    }

    /**
     * Gets the Identity from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Identity> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Identity from the service
     *
     * @return the Identity from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Identity get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Identity> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Identity delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Identity with a source
     *
     * @param sourceIdentity the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Identity> patchAsync(@Nonnull final Identity sourceIdentity) {
        return sendAsync(HttpMethod.PATCH, sourceIdentity);
    }

    /**
     * Patches this Identity with a source
     *
     * @param sourceIdentity the source object with updates
     * @return the updated Identity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Identity patch(@Nonnull final Identity sourceIdentity) throws ClientException {
        return send(HttpMethod.PATCH, sourceIdentity);
    }

    /**
     * Creates a Identity with a new object
     *
     * @param newIdentity the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Identity> postAsync(@Nonnull final Identity newIdentity) {
        return sendAsync(HttpMethod.POST, newIdentity);
    }

    /**
     * Creates a Identity with a new object
     *
     * @param newIdentity the new object to create
     * @return the created Identity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Identity post(@Nonnull final Identity newIdentity) throws ClientException {
        return send(HttpMethod.POST, newIdentity);
    }

    /**
     * Creates a Identity with a new object
     *
     * @param newIdentity the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Identity> putAsync(@Nonnull final Identity newIdentity) {
        return sendAsync(HttpMethod.PUT, newIdentity);
    }

    /**
     * Creates a Identity with a new object
     *
     * @param newIdentity the object to create/update
     * @return the created Identity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Identity put(@Nonnull final Identity newIdentity) throws ClientException {
        return send(HttpMethod.PUT, newIdentity);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public IdentityRequest select(@Nonnull final String value) {
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
     public IdentityRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

