// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.DeviceConfigurationDeviceStateSummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Device State Summary Request.
 */
public class DeviceConfigurationDeviceStateSummaryRequest extends BaseRequest<DeviceConfigurationDeviceStateSummary> {
	
    /**
     * The request for the DeviceConfigurationDeviceStateSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceConfigurationDeviceStateSummaryRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceConfigurationDeviceStateSummary.class);
    }

    /**
     * Gets the DeviceConfigurationDeviceStateSummary from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceConfigurationDeviceStateSummary> futureGet() {
        return futureSend(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceConfigurationDeviceStateSummary from the service
     *
     * @return the DeviceConfigurationDeviceStateSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceConfigurationDeviceStateSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceConfigurationDeviceStateSummary> futureDelete() {
        return futureSend(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceConfigurationDeviceStateSummary delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceConfigurationDeviceStateSummary with a source
     *
     * @param sourceDeviceConfigurationDeviceStateSummary the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceConfigurationDeviceStateSummary> futurePatch(@Nonnull final DeviceConfigurationDeviceStateSummary sourceDeviceConfigurationDeviceStateSummary) {
        return futureSend(HttpMethod.PATCH, sourceDeviceConfigurationDeviceStateSummary);
    }

    /**
     * Patches this DeviceConfigurationDeviceStateSummary with a source
     *
     * @param sourceDeviceConfigurationDeviceStateSummary the source object with updates
     * @return the updated DeviceConfigurationDeviceStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceConfigurationDeviceStateSummary patch(@Nonnull final DeviceConfigurationDeviceStateSummary sourceDeviceConfigurationDeviceStateSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceConfigurationDeviceStateSummary);
    }

    /**
     * Creates a DeviceConfigurationDeviceStateSummary with a new object
     *
     * @param newDeviceConfigurationDeviceStateSummary the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceConfigurationDeviceStateSummary> futurePost(@Nonnull final DeviceConfigurationDeviceStateSummary newDeviceConfigurationDeviceStateSummary) {
        return futureSend(HttpMethod.POST, newDeviceConfigurationDeviceStateSummary);
    }

    /**
     * Creates a DeviceConfigurationDeviceStateSummary with a new object
     *
     * @param newDeviceConfigurationDeviceStateSummary the new object to create
     * @return the created DeviceConfigurationDeviceStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceConfigurationDeviceStateSummary post(@Nonnull final DeviceConfigurationDeviceStateSummary newDeviceConfigurationDeviceStateSummary) throws ClientException {
        return send(HttpMethod.POST, newDeviceConfigurationDeviceStateSummary);
    }

    /**
     * Creates a DeviceConfigurationDeviceStateSummary with a new object
     *
     * @param newDeviceConfigurationDeviceStateSummary the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceConfigurationDeviceStateSummary> futurePut(@Nonnull final DeviceConfigurationDeviceStateSummary newDeviceConfigurationDeviceStateSummary) {
        return futureSend(HttpMethod.PUT, newDeviceConfigurationDeviceStateSummary);
    }

    /**
     * Creates a DeviceConfigurationDeviceStateSummary with a new object
     *
     * @param newDeviceConfigurationDeviceStateSummary the object to create/update
     * @return the created DeviceConfigurationDeviceStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceConfigurationDeviceStateSummary put(@Nonnull final DeviceConfigurationDeviceStateSummary newDeviceConfigurationDeviceStateSummary) throws ClientException {
        return send(HttpMethod.PUT, newDeviceConfigurationDeviceStateSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceConfigurationDeviceStateSummaryRequest select(@Nonnull final String value) {
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
     public DeviceConfigurationDeviceStateSummaryRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

