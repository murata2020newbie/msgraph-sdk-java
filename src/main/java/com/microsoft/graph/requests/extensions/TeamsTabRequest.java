// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TeamsTab;
import com.microsoft.graph.requests.extensions.TeamsAppRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams Tab Request.
 */
public class TeamsTabRequest extends BaseRequest<TeamsTab> {
	
    /**
     * The request for the TeamsTab
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsTabRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamsTab.class);
    }

    /**
     * Gets the TeamsTab from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super TeamsTab> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the TeamsTab from the service
     *
     * @return the TeamsTab from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsTab get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super TeamsTab> callback) {
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
     * Patches this TeamsTab with a source
     *
     * @param sourceTeamsTab the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final TeamsTab sourceTeamsTab, @Nonnull final ICallback<? super TeamsTab> callback) {
        send(HttpMethod.PATCH, callback, sourceTeamsTab);
    }

    /**
     * Patches this TeamsTab with a source
     *
     * @param sourceTeamsTab the source object with updates
     * @return the updated TeamsTab
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsTab patch(@Nonnull final TeamsTab sourceTeamsTab) throws ClientException {
        return send(HttpMethod.PATCH, sourceTeamsTab);
    }

    /**
     * Creates a TeamsTab with a new object
     *
     * @param newTeamsTab the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final TeamsTab newTeamsTab, @Nonnull final ICallback<? super TeamsTab> callback) {
        send(HttpMethod.POST, callback, newTeamsTab);
    }

    /**
     * Creates a TeamsTab with a new object
     *
     * @param newTeamsTab the new object to create
     * @return the created TeamsTab
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsTab post(@Nonnull final TeamsTab newTeamsTab) throws ClientException {
        return send(HttpMethod.POST, newTeamsTab);
    }

    /**
     * Creates a TeamsTab with a new object
     *
     * @param newTeamsTab the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final TeamsTab newTeamsTab, @Nonnull final ICallback<? super TeamsTab> callback) {
        send(HttpMethod.PUT, callback, newTeamsTab);
    }

    /**
     * Creates a TeamsTab with a new object
     *
     * @param newTeamsTab the object to create/update
     * @return the created TeamsTab
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsTab put(@Nonnull final TeamsTab newTeamsTab) throws ClientException {
        return send(HttpMethod.PUT, newTeamsTab);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TeamsTabRequest select(@Nonnull final String value) {
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
     public TeamsTabRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

