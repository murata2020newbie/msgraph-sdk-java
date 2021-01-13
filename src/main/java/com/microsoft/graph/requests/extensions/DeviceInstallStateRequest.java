// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.DeviceInstallState;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Install State Request.
 */
public class DeviceInstallStateRequest extends BaseRequest<DeviceInstallState> {
	
    /**
     * The request for the DeviceInstallState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceInstallStateRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceInstallState.class);
    }

    /**
     * Gets the DeviceInstallState from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceInstallState> futureGet() {
        return futureSend(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceInstallState from the service
     *
     * @return the DeviceInstallState from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceInstallState get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceInstallState> futureDelete() {
        return futureSend(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceInstallState delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceInstallState with a source
     *
     * @param sourceDeviceInstallState the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceInstallState> futurePatch(@Nonnull final DeviceInstallState sourceDeviceInstallState) {
        return futureSend(HttpMethod.PATCH, sourceDeviceInstallState);
    }

    /**
     * Patches this DeviceInstallState with a source
     *
     * @param sourceDeviceInstallState the source object with updates
     * @return the updated DeviceInstallState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceInstallState patch(@Nonnull final DeviceInstallState sourceDeviceInstallState) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceInstallState);
    }

    /**
     * Creates a DeviceInstallState with a new object
     *
     * @param newDeviceInstallState the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceInstallState> futurePost(@Nonnull final DeviceInstallState newDeviceInstallState) {
        return futureSend(HttpMethod.POST, newDeviceInstallState);
    }

    /**
     * Creates a DeviceInstallState with a new object
     *
     * @param newDeviceInstallState the new object to create
     * @return the created DeviceInstallState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceInstallState post(@Nonnull final DeviceInstallState newDeviceInstallState) throws ClientException {
        return send(HttpMethod.POST, newDeviceInstallState);
    }

    /**
     * Creates a DeviceInstallState with a new object
     *
     * @param newDeviceInstallState the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceInstallState> futurePut(@Nonnull final DeviceInstallState newDeviceInstallState) {
        return futureSend(HttpMethod.PUT, newDeviceInstallState);
    }

    /**
     * Creates a DeviceInstallState with a new object
     *
     * @param newDeviceInstallState the object to create/update
     * @return the created DeviceInstallState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceInstallState put(@Nonnull final DeviceInstallState newDeviceInstallState) throws ClientException {
        return send(HttpMethod.PUT, newDeviceInstallState);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceInstallStateRequest select(@Nonnull final String value) {
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
     public DeviceInstallStateRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

