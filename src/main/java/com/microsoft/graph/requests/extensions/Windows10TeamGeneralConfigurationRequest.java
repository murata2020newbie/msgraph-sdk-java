// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.Windows10TeamGeneralConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Team General Configuration Request.
 */
public class Windows10TeamGeneralConfigurationRequest extends BaseRequest<Windows10TeamGeneralConfiguration> {
	
    /**
     * The request for the Windows10TeamGeneralConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows10TeamGeneralConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows10TeamGeneralConfiguration.class);
    }

    /**
     * Gets the Windows10TeamGeneralConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10TeamGeneralConfiguration> futureGet() {
        return futureSend(HttpMethod.GET, null);
    }

    /**
     * Gets the Windows10TeamGeneralConfiguration from the service
     *
     * @return the Windows10TeamGeneralConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10TeamGeneralConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10TeamGeneralConfiguration> futureDelete() {
        return futureSend(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Windows10TeamGeneralConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Windows10TeamGeneralConfiguration with a source
     *
     * @param sourceWindows10TeamGeneralConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10TeamGeneralConfiguration> futurePatch(@Nonnull final Windows10TeamGeneralConfiguration sourceWindows10TeamGeneralConfiguration) {
        return futureSend(HttpMethod.PATCH, sourceWindows10TeamGeneralConfiguration);
    }

    /**
     * Patches this Windows10TeamGeneralConfiguration with a source
     *
     * @param sourceWindows10TeamGeneralConfiguration the source object with updates
     * @return the updated Windows10TeamGeneralConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10TeamGeneralConfiguration patch(@Nonnull final Windows10TeamGeneralConfiguration sourceWindows10TeamGeneralConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindows10TeamGeneralConfiguration);
    }

    /**
     * Creates a Windows10TeamGeneralConfiguration with a new object
     *
     * @param newWindows10TeamGeneralConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10TeamGeneralConfiguration> futurePost(@Nonnull final Windows10TeamGeneralConfiguration newWindows10TeamGeneralConfiguration) {
        return futureSend(HttpMethod.POST, newWindows10TeamGeneralConfiguration);
    }

    /**
     * Creates a Windows10TeamGeneralConfiguration with a new object
     *
     * @param newWindows10TeamGeneralConfiguration the new object to create
     * @return the created Windows10TeamGeneralConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10TeamGeneralConfiguration post(@Nonnull final Windows10TeamGeneralConfiguration newWindows10TeamGeneralConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindows10TeamGeneralConfiguration);
    }

    /**
     * Creates a Windows10TeamGeneralConfiguration with a new object
     *
     * @param newWindows10TeamGeneralConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10TeamGeneralConfiguration> futurePut(@Nonnull final Windows10TeamGeneralConfiguration newWindows10TeamGeneralConfiguration) {
        return futureSend(HttpMethod.PUT, newWindows10TeamGeneralConfiguration);
    }

    /**
     * Creates a Windows10TeamGeneralConfiguration with a new object
     *
     * @param newWindows10TeamGeneralConfiguration the object to create/update
     * @return the created Windows10TeamGeneralConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10TeamGeneralConfiguration put(@Nonnull final Windows10TeamGeneralConfiguration newWindows10TeamGeneralConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newWindows10TeamGeneralConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public Windows10TeamGeneralConfigurationRequest select(@Nonnull final String value) {
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
     public Windows10TeamGeneralConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

