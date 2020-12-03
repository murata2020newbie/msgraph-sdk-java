// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfigurationAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Mobile App Configuration Assignment Request.
 */
public class ManagedDeviceMobileAppConfigurationAssignmentRequest extends BaseRequest<ManagedDeviceMobileAppConfigurationAssignment> {
	
    /**
     * The request for the ManagedDeviceMobileAppConfigurationAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceMobileAppConfigurationAssignmentRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDeviceMobileAppConfigurationAssignment.class);
    }

    /**
     * Gets the ManagedDeviceMobileAppConfigurationAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super ManagedDeviceMobileAppConfigurationAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedDeviceMobileAppConfigurationAssignment from the service
     *
     * @return the ManagedDeviceMobileAppConfigurationAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedDeviceMobileAppConfigurationAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super ManagedDeviceMobileAppConfigurationAssignment> callback) {
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
     * Patches this ManagedDeviceMobileAppConfigurationAssignment with a source
     *
     * @param sourceManagedDeviceMobileAppConfigurationAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final ManagedDeviceMobileAppConfigurationAssignment sourceManagedDeviceMobileAppConfigurationAssignment, @Nonnull final ICallback<? super ManagedDeviceMobileAppConfigurationAssignment> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedDeviceMobileAppConfigurationAssignment);
    }

    /**
     * Patches this ManagedDeviceMobileAppConfigurationAssignment with a source
     *
     * @param sourceManagedDeviceMobileAppConfigurationAssignment the source object with updates
     * @return the updated ManagedDeviceMobileAppConfigurationAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedDeviceMobileAppConfigurationAssignment patch(@Nonnull final ManagedDeviceMobileAppConfigurationAssignment sourceManagedDeviceMobileAppConfigurationAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedDeviceMobileAppConfigurationAssignment);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationAssignment with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final ManagedDeviceMobileAppConfigurationAssignment newManagedDeviceMobileAppConfigurationAssignment, @Nonnull final ICallback<? super ManagedDeviceMobileAppConfigurationAssignment> callback) {
        send(HttpMethod.POST, callback, newManagedDeviceMobileAppConfigurationAssignment);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationAssignment with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationAssignment the new object to create
     * @return the created ManagedDeviceMobileAppConfigurationAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedDeviceMobileAppConfigurationAssignment post(@Nonnull final ManagedDeviceMobileAppConfigurationAssignment newManagedDeviceMobileAppConfigurationAssignment) throws ClientException {
        return send(HttpMethod.POST, newManagedDeviceMobileAppConfigurationAssignment);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationAssignment with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final ManagedDeviceMobileAppConfigurationAssignment newManagedDeviceMobileAppConfigurationAssignment, @Nonnull final ICallback<? super ManagedDeviceMobileAppConfigurationAssignment> callback) {
        send(HttpMethod.PUT, callback, newManagedDeviceMobileAppConfigurationAssignment);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationAssignment with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationAssignment the object to create/update
     * @return the created ManagedDeviceMobileAppConfigurationAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedDeviceMobileAppConfigurationAssignment put(@Nonnull final ManagedDeviceMobileAppConfigurationAssignment newManagedDeviceMobileAppConfigurationAssignment) throws ClientException {
        return send(HttpMethod.PUT, newManagedDeviceMobileAppConfigurationAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ManagedDeviceMobileAppConfigurationAssignmentRequest select(@Nonnull final String value) {
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
     public ManagedDeviceMobileAppConfigurationAssignmentRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

