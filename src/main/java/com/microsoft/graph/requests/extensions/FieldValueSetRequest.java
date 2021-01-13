// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.FieldValueSet;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Field Value Set Request.
 */
public class FieldValueSetRequest extends BaseRequest<FieldValueSet> {
	
    /**
     * The request for the FieldValueSet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public FieldValueSetRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, FieldValueSet.class);
    }

    /**
     * Gets the FieldValueSet from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<FieldValueSet> futureGet() {
        return futureSend(HttpMethod.GET, null);
    }

    /**
     * Gets the FieldValueSet from the service
     *
     * @return the FieldValueSet from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public FieldValueSet get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<FieldValueSet> futureDelete() {
        return futureSend(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public FieldValueSet delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this FieldValueSet with a source
     *
     * @param sourceFieldValueSet the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<FieldValueSet> futurePatch(@Nonnull final FieldValueSet sourceFieldValueSet) {
        return futureSend(HttpMethod.PATCH, sourceFieldValueSet);
    }

    /**
     * Patches this FieldValueSet with a source
     *
     * @param sourceFieldValueSet the source object with updates
     * @return the updated FieldValueSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public FieldValueSet patch(@Nonnull final FieldValueSet sourceFieldValueSet) throws ClientException {
        return send(HttpMethod.PATCH, sourceFieldValueSet);
    }

    /**
     * Creates a FieldValueSet with a new object
     *
     * @param newFieldValueSet the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<FieldValueSet> futurePost(@Nonnull final FieldValueSet newFieldValueSet) {
        return futureSend(HttpMethod.POST, newFieldValueSet);
    }

    /**
     * Creates a FieldValueSet with a new object
     *
     * @param newFieldValueSet the new object to create
     * @return the created FieldValueSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public FieldValueSet post(@Nonnull final FieldValueSet newFieldValueSet) throws ClientException {
        return send(HttpMethod.POST, newFieldValueSet);
    }

    /**
     * Creates a FieldValueSet with a new object
     *
     * @param newFieldValueSet the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<FieldValueSet> futurePut(@Nonnull final FieldValueSet newFieldValueSet) {
        return futureSend(HttpMethod.PUT, newFieldValueSet);
    }

    /**
     * Creates a FieldValueSet with a new object
     *
     * @param newFieldValueSet the object to create/update
     * @return the created FieldValueSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public FieldValueSet put(@Nonnull final FieldValueSet newFieldValueSet) throws ClientException {
        return send(HttpMethod.PUT, newFieldValueSet);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public FieldValueSetRequest select(@Nonnull final String value) {
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
     public FieldValueSetRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

