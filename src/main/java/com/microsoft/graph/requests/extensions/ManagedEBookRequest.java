// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedEBook;
import com.microsoft.graph.models.extensions.ManagedEBookAssignment;
import com.microsoft.graph.requests.extensions.ManagedEBookAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedEBookAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceInstallStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceInstallStateRequestBuilder;
import com.microsoft.graph.requests.extensions.UserInstallStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserInstallStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.EBookInstallSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed EBook Request.
 */
public class ManagedEBookRequest extends BaseRequest<ManagedEBook> {
	
    /**
     * The request for the ManagedEBook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public ManagedEBookRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends ManagedEBook> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the ManagedEBook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedEBookRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedEBook.class);
    }

    /**
     * Gets the ManagedEBook from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super ManagedEBook> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedEBook from the service
     *
     * @return the ManagedEBook from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedEBook get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super ManagedEBook> callback) {
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
     * Patches this ManagedEBook with a source
     *
     * @param sourceManagedEBook the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final ManagedEBook sourceManagedEBook, @Nonnull final ICallback<? super ManagedEBook> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedEBook);
    }

    /**
     * Patches this ManagedEBook with a source
     *
     * @param sourceManagedEBook the source object with updates
     * @return the updated ManagedEBook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedEBook patch(@Nonnull final ManagedEBook sourceManagedEBook) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedEBook);
    }

    /**
     * Creates a ManagedEBook with a new object
     *
     * @param newManagedEBook the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final ManagedEBook newManagedEBook, @Nonnull final ICallback<? super ManagedEBook> callback) {
        send(HttpMethod.POST, callback, newManagedEBook);
    }

    /**
     * Creates a ManagedEBook with a new object
     *
     * @param newManagedEBook the new object to create
     * @return the created ManagedEBook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedEBook post(@Nonnull final ManagedEBook newManagedEBook) throws ClientException {
        return send(HttpMethod.POST, newManagedEBook);
    }

    /**
     * Creates a ManagedEBook with a new object
     *
     * @param newManagedEBook the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final ManagedEBook newManagedEBook, @Nonnull final ICallback<? super ManagedEBook> callback) {
        send(HttpMethod.PUT, callback, newManagedEBook);
    }

    /**
     * Creates a ManagedEBook with a new object
     *
     * @param newManagedEBook the object to create/update
     * @return the created ManagedEBook
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedEBook put(@Nonnull final ManagedEBook newManagedEBook) throws ClientException {
        return send(HttpMethod.PUT, newManagedEBook);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ManagedEBookRequest select(@Nonnull final String value) {
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
     public ManagedEBookRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

