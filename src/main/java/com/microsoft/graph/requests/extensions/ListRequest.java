// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.List;
import com.microsoft.graph.requests.extensions.ColumnDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ColumnDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.ContentTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ContentTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.ListItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ListItemRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the List Request.
 */
public class ListRequest extends BaseRequest<List> {
	
    /**
     * The request for the List
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ListRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, List.class);
    }

    /**
     * Gets the List from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super List> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the List from the service
     *
     * @return the List from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public List get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super List> callback) {
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
     * Patches this List with a source
     *
     * @param sourceList the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final List sourceList, @Nonnull final ICallback<? super List> callback) {
        send(HttpMethod.PATCH, callback, sourceList);
    }

    /**
     * Patches this List with a source
     *
     * @param sourceList the source object with updates
     * @return the updated List
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public List patch(@Nonnull final List sourceList) throws ClientException {
        return send(HttpMethod.PATCH, sourceList);
    }

    /**
     * Creates a List with a new object
     *
     * @param newList the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final List newList, @Nonnull final ICallback<? super List> callback) {
        send(HttpMethod.POST, callback, newList);
    }

    /**
     * Creates a List with a new object
     *
     * @param newList the new object to create
     * @return the created List
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public List post(@Nonnull final List newList) throws ClientException {
        return send(HttpMethod.POST, newList);
    }

    /**
     * Creates a List with a new object
     *
     * @param newList the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final List newList, @Nonnull final ICallback<? super List> callback) {
        send(HttpMethod.PUT, callback, newList);
    }

    /**
     * Creates a List with a new object
     *
     * @param newList the object to create/update
     * @return the created List
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public List put(@Nonnull final List newList) throws ClientException {
        return send(HttpMethod.PUT, newList);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ListRequest select(@Nonnull final String value) {
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
     public ListRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

