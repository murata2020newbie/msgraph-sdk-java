// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfigurationUserSummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Mobile App Configuration User Summary Request.
 */
public class ManagedDeviceMobileAppConfigurationUserSummaryRequest extends BaseRequest<ManagedDeviceMobileAppConfigurationUserSummary> {
	
    /**
     * The request for the ManagedDeviceMobileAppConfigurationUserSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceMobileAppConfigurationUserSummaryRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDeviceMobileAppConfigurationUserSummary.class);
    }

    /**
     * Gets the ManagedDeviceMobileAppConfigurationUserSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super ManagedDeviceMobileAppConfigurationUserSummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedDeviceMobileAppConfigurationUserSummary from the service
     *
     * @return the ManagedDeviceMobileAppConfigurationUserSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedDeviceMobileAppConfigurationUserSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super ManagedDeviceMobileAppConfigurationUserSummary> callback) {
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
     * Patches this ManagedDeviceMobileAppConfigurationUserSummary with a source
     *
     * @param sourceManagedDeviceMobileAppConfigurationUserSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final ManagedDeviceMobileAppConfigurationUserSummary sourceManagedDeviceMobileAppConfigurationUserSummary, @Nonnull final ICallback<? super ManagedDeviceMobileAppConfigurationUserSummary> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedDeviceMobileAppConfigurationUserSummary);
    }

    /**
     * Patches this ManagedDeviceMobileAppConfigurationUserSummary with a source
     *
     * @param sourceManagedDeviceMobileAppConfigurationUserSummary the source object with updates
     * @return the updated ManagedDeviceMobileAppConfigurationUserSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedDeviceMobileAppConfigurationUserSummary patch(@Nonnull final ManagedDeviceMobileAppConfigurationUserSummary sourceManagedDeviceMobileAppConfigurationUserSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedDeviceMobileAppConfigurationUserSummary);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationUserSummary with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationUserSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final ManagedDeviceMobileAppConfigurationUserSummary newManagedDeviceMobileAppConfigurationUserSummary, @Nonnull final ICallback<? super ManagedDeviceMobileAppConfigurationUserSummary> callback) {
        send(HttpMethod.POST, callback, newManagedDeviceMobileAppConfigurationUserSummary);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationUserSummary with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationUserSummary the new object to create
     * @return the created ManagedDeviceMobileAppConfigurationUserSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedDeviceMobileAppConfigurationUserSummary post(@Nonnull final ManagedDeviceMobileAppConfigurationUserSummary newManagedDeviceMobileAppConfigurationUserSummary) throws ClientException {
        return send(HttpMethod.POST, newManagedDeviceMobileAppConfigurationUserSummary);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationUserSummary with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationUserSummary the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final ManagedDeviceMobileAppConfigurationUserSummary newManagedDeviceMobileAppConfigurationUserSummary, @Nonnull final ICallback<? super ManagedDeviceMobileAppConfigurationUserSummary> callback) {
        send(HttpMethod.PUT, callback, newManagedDeviceMobileAppConfigurationUserSummary);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationUserSummary with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationUserSummary the object to create/update
     * @return the created ManagedDeviceMobileAppConfigurationUserSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedDeviceMobileAppConfigurationUserSummary put(@Nonnull final ManagedDeviceMobileAppConfigurationUserSummary newManagedDeviceMobileAppConfigurationUserSummary) throws ClientException {
        return send(HttpMethod.PUT, newManagedDeviceMobileAppConfigurationUserSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ManagedDeviceMobileAppConfigurationUserSummaryRequest select(@Nonnull final String value) {
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
     public ManagedDeviceMobileAppConfigurationUserSummaryRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

