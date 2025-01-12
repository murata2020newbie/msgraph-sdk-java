// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AuditLogRoot;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Audit Log Root Request.
 */
public class AuditLogRootRequest extends BaseRequest<AuditLogRoot> {
	
    /**
     * The request for the AuditLogRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AuditLogRootRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AuditLogRoot.class);
    }

    /**
     * Gets the AuditLogRoot from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuditLogRoot> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AuditLogRoot from the service
     *
     * @return the AuditLogRoot from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AuditLogRoot get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuditLogRoot> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AuditLogRoot delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AuditLogRoot with a source
     *
     * @param sourceAuditLogRoot the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuditLogRoot> patchAsync(@Nonnull final AuditLogRoot sourceAuditLogRoot) {
        return sendAsync(HttpMethod.PATCH, sourceAuditLogRoot);
    }

    /**
     * Patches this AuditLogRoot with a source
     *
     * @param sourceAuditLogRoot the source object with updates
     * @return the updated AuditLogRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AuditLogRoot patch(@Nonnull final AuditLogRoot sourceAuditLogRoot) throws ClientException {
        return send(HttpMethod.PATCH, sourceAuditLogRoot);
    }

    /**
     * Creates a AuditLogRoot with a new object
     *
     * @param newAuditLogRoot the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuditLogRoot> postAsync(@Nonnull final AuditLogRoot newAuditLogRoot) {
        return sendAsync(HttpMethod.POST, newAuditLogRoot);
    }

    /**
     * Creates a AuditLogRoot with a new object
     *
     * @param newAuditLogRoot the new object to create
     * @return the created AuditLogRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AuditLogRoot post(@Nonnull final AuditLogRoot newAuditLogRoot) throws ClientException {
        return send(HttpMethod.POST, newAuditLogRoot);
    }

    /**
     * Creates a AuditLogRoot with a new object
     *
     * @param newAuditLogRoot the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuditLogRoot> putAsync(@Nonnull final AuditLogRoot newAuditLogRoot) {
        return sendAsync(HttpMethod.PUT, newAuditLogRoot);
    }

    /**
     * Creates a AuditLogRoot with a new object
     *
     * @param newAuditLogRoot the object to create/update
     * @return the created AuditLogRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AuditLogRoot put(@Nonnull final AuditLogRoot newAuditLogRoot) throws ClientException {
        return send(HttpMethod.PUT, newAuditLogRoot);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AuditLogRootRequest select(@Nonnull final String value) {
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
     public AuditLogRootRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

