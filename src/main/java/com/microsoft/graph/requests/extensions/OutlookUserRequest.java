// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.OutlookUser;
import com.microsoft.graph.models.extensions.LocaleInfo;
import com.microsoft.graph.models.extensions.TimeZoneInformation;
import com.microsoft.graph.models.generated.TimeZoneStandard;
import com.microsoft.graph.requests.extensions.OutlookCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookCategoryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Outlook User Request.
 */
public class OutlookUserRequest extends BaseRequest<OutlookUser> {
	
    /**
     * The request for the OutlookUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OutlookUserRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OutlookUser.class);
    }

    /**
     * Gets the OutlookUser from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OutlookUser> futureGet() {
        return futureSend(HttpMethod.GET, null);
    }

    /**
     * Gets the OutlookUser from the service
     *
     * @return the OutlookUser from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OutlookUser get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OutlookUser> futureDelete() {
        return futureSend(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public OutlookUser delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this OutlookUser with a source
     *
     * @param sourceOutlookUser the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OutlookUser> futurePatch(@Nonnull final OutlookUser sourceOutlookUser) {
        return futureSend(HttpMethod.PATCH, sourceOutlookUser);
    }

    /**
     * Patches this OutlookUser with a source
     *
     * @param sourceOutlookUser the source object with updates
     * @return the updated OutlookUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OutlookUser patch(@Nonnull final OutlookUser sourceOutlookUser) throws ClientException {
        return send(HttpMethod.PATCH, sourceOutlookUser);
    }

    /**
     * Creates a OutlookUser with a new object
     *
     * @param newOutlookUser the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OutlookUser> futurePost(@Nonnull final OutlookUser newOutlookUser) {
        return futureSend(HttpMethod.POST, newOutlookUser);
    }

    /**
     * Creates a OutlookUser with a new object
     *
     * @param newOutlookUser the new object to create
     * @return the created OutlookUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OutlookUser post(@Nonnull final OutlookUser newOutlookUser) throws ClientException {
        return send(HttpMethod.POST, newOutlookUser);
    }

    /**
     * Creates a OutlookUser with a new object
     *
     * @param newOutlookUser the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OutlookUser> futurePut(@Nonnull final OutlookUser newOutlookUser) {
        return futureSend(HttpMethod.PUT, newOutlookUser);
    }

    /**
     * Creates a OutlookUser with a new object
     *
     * @param newOutlookUser the object to create/update
     * @return the created OutlookUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OutlookUser put(@Nonnull final OutlookUser newOutlookUser) throws ClientException {
        return send(HttpMethod.PUT, newOutlookUser);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public OutlookUserRequest select(@Nonnull final String value) {
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
     public OutlookUserRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

