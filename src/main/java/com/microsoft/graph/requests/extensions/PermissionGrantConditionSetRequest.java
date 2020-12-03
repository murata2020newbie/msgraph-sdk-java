// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PermissionGrantConditionSet;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Permission Grant Condition Set Request.
 */
public class PermissionGrantConditionSetRequest extends BaseRequest<PermissionGrantConditionSet> {
	
    /**
     * The request for the PermissionGrantConditionSet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PermissionGrantConditionSetRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PermissionGrantConditionSet.class);
    }

    /**
     * Gets the PermissionGrantConditionSet from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super PermissionGrantConditionSet> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PermissionGrantConditionSet from the service
     *
     * @return the PermissionGrantConditionSet from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PermissionGrantConditionSet get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super PermissionGrantConditionSet> callback) {
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
     * Patches this PermissionGrantConditionSet with a source
     *
     * @param sourcePermissionGrantConditionSet the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final PermissionGrantConditionSet sourcePermissionGrantConditionSet, @Nonnull final ICallback<? super PermissionGrantConditionSet> callback) {
        send(HttpMethod.PATCH, callback, sourcePermissionGrantConditionSet);
    }

    /**
     * Patches this PermissionGrantConditionSet with a source
     *
     * @param sourcePermissionGrantConditionSet the source object with updates
     * @return the updated PermissionGrantConditionSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PermissionGrantConditionSet patch(@Nonnull final PermissionGrantConditionSet sourcePermissionGrantConditionSet) throws ClientException {
        return send(HttpMethod.PATCH, sourcePermissionGrantConditionSet);
    }

    /**
     * Creates a PermissionGrantConditionSet with a new object
     *
     * @param newPermissionGrantConditionSet the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final PermissionGrantConditionSet newPermissionGrantConditionSet, @Nonnull final ICallback<? super PermissionGrantConditionSet> callback) {
        send(HttpMethod.POST, callback, newPermissionGrantConditionSet);
    }

    /**
     * Creates a PermissionGrantConditionSet with a new object
     *
     * @param newPermissionGrantConditionSet the new object to create
     * @return the created PermissionGrantConditionSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PermissionGrantConditionSet post(@Nonnull final PermissionGrantConditionSet newPermissionGrantConditionSet) throws ClientException {
        return send(HttpMethod.POST, newPermissionGrantConditionSet);
    }

    /**
     * Creates a PermissionGrantConditionSet with a new object
     *
     * @param newPermissionGrantConditionSet the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final PermissionGrantConditionSet newPermissionGrantConditionSet, @Nonnull final ICallback<? super PermissionGrantConditionSet> callback) {
        send(HttpMethod.PUT, callback, newPermissionGrantConditionSet);
    }

    /**
     * Creates a PermissionGrantConditionSet with a new object
     *
     * @param newPermissionGrantConditionSet the object to create/update
     * @return the created PermissionGrantConditionSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PermissionGrantConditionSet put(@Nonnull final PermissionGrantConditionSet newPermissionGrantConditionSet) throws ClientException {
        return send(HttpMethod.PUT, newPermissionGrantConditionSet);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public PermissionGrantConditionSetRequest select(@Nonnull final String value) {
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
     public PermissionGrantConditionSetRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

