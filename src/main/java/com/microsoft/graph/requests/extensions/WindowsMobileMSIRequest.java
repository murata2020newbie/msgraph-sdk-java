// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsMobileMSI;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Mobile MSIRequest.
 */
public class WindowsMobileMSIRequest extends BaseRequest<WindowsMobileMSI> {
	
    /**
     * The request for the WindowsMobileMSI
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsMobileMSIRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsMobileMSI.class);
    }

    /**
     * Gets the WindowsMobileMSI from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super WindowsMobileMSI> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsMobileMSI from the service
     *
     * @return the WindowsMobileMSI from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsMobileMSI get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super WindowsMobileMSI> callback) {
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
     * Patches this WindowsMobileMSI with a source
     *
     * @param sourceWindowsMobileMSI the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final WindowsMobileMSI sourceWindowsMobileMSI, @Nonnull final ICallback<? super WindowsMobileMSI> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsMobileMSI);
    }

    /**
     * Patches this WindowsMobileMSI with a source
     *
     * @param sourceWindowsMobileMSI the source object with updates
     * @return the updated WindowsMobileMSI
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsMobileMSI patch(@Nonnull final WindowsMobileMSI sourceWindowsMobileMSI) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsMobileMSI);
    }

    /**
     * Creates a WindowsMobileMSI with a new object
     *
     * @param newWindowsMobileMSI the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final WindowsMobileMSI newWindowsMobileMSI, @Nonnull final ICallback<? super WindowsMobileMSI> callback) {
        send(HttpMethod.POST, callback, newWindowsMobileMSI);
    }

    /**
     * Creates a WindowsMobileMSI with a new object
     *
     * @param newWindowsMobileMSI the new object to create
     * @return the created WindowsMobileMSI
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsMobileMSI post(@Nonnull final WindowsMobileMSI newWindowsMobileMSI) throws ClientException {
        return send(HttpMethod.POST, newWindowsMobileMSI);
    }

    /**
     * Creates a WindowsMobileMSI with a new object
     *
     * @param newWindowsMobileMSI the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final WindowsMobileMSI newWindowsMobileMSI, @Nonnull final ICallback<? super WindowsMobileMSI> callback) {
        send(HttpMethod.PUT, callback, newWindowsMobileMSI);
    }

    /**
     * Creates a WindowsMobileMSI with a new object
     *
     * @param newWindowsMobileMSI the object to create/update
     * @return the created WindowsMobileMSI
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsMobileMSI put(@Nonnull final WindowsMobileMSI newWindowsMobileMSI) throws ClientException {
        return send(HttpMethod.PUT, newWindowsMobileMSI);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WindowsMobileMSIRequest select(@Nonnull final String value) {
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
     public WindowsMobileMSIRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

