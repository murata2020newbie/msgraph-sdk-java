// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.IosDeviceFeaturesConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Device Features Configuration Request.
 */
public class IosDeviceFeaturesConfigurationRequest extends BaseRequest<IosDeviceFeaturesConfiguration> {
	
    /**
     * The request for the IosDeviceFeaturesConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosDeviceFeaturesConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosDeviceFeaturesConfiguration.class);
    }

    /**
     * Gets the IosDeviceFeaturesConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosDeviceFeaturesConfiguration> futureGet() {
        return futureSend(HttpMethod.GET, null);
    }

    /**
     * Gets the IosDeviceFeaturesConfiguration from the service
     *
     * @return the IosDeviceFeaturesConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosDeviceFeaturesConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosDeviceFeaturesConfiguration> futureDelete() {
        return futureSend(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public IosDeviceFeaturesConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this IosDeviceFeaturesConfiguration with a source
     *
     * @param sourceIosDeviceFeaturesConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosDeviceFeaturesConfiguration> futurePatch(@Nonnull final IosDeviceFeaturesConfiguration sourceIosDeviceFeaturesConfiguration) {
        return futureSend(HttpMethod.PATCH, sourceIosDeviceFeaturesConfiguration);
    }

    /**
     * Patches this IosDeviceFeaturesConfiguration with a source
     *
     * @param sourceIosDeviceFeaturesConfiguration the source object with updates
     * @return the updated IosDeviceFeaturesConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosDeviceFeaturesConfiguration patch(@Nonnull final IosDeviceFeaturesConfiguration sourceIosDeviceFeaturesConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosDeviceFeaturesConfiguration);
    }

    /**
     * Creates a IosDeviceFeaturesConfiguration with a new object
     *
     * @param newIosDeviceFeaturesConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosDeviceFeaturesConfiguration> futurePost(@Nonnull final IosDeviceFeaturesConfiguration newIosDeviceFeaturesConfiguration) {
        return futureSend(HttpMethod.POST, newIosDeviceFeaturesConfiguration);
    }

    /**
     * Creates a IosDeviceFeaturesConfiguration with a new object
     *
     * @param newIosDeviceFeaturesConfiguration the new object to create
     * @return the created IosDeviceFeaturesConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosDeviceFeaturesConfiguration post(@Nonnull final IosDeviceFeaturesConfiguration newIosDeviceFeaturesConfiguration) throws ClientException {
        return send(HttpMethod.POST, newIosDeviceFeaturesConfiguration);
    }

    /**
     * Creates a IosDeviceFeaturesConfiguration with a new object
     *
     * @param newIosDeviceFeaturesConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosDeviceFeaturesConfiguration> futurePut(@Nonnull final IosDeviceFeaturesConfiguration newIosDeviceFeaturesConfiguration) {
        return futureSend(HttpMethod.PUT, newIosDeviceFeaturesConfiguration);
    }

    /**
     * Creates a IosDeviceFeaturesConfiguration with a new object
     *
     * @param newIosDeviceFeaturesConfiguration the object to create/update
     * @return the created IosDeviceFeaturesConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosDeviceFeaturesConfiguration put(@Nonnull final IosDeviceFeaturesConfiguration newIosDeviceFeaturesConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newIosDeviceFeaturesConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public IosDeviceFeaturesConfigurationRequest select(@Nonnull final String value) {
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
     public IosDeviceFeaturesConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

