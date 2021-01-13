// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.ContactFolder;
import com.microsoft.graph.requests.extensions.ContactFolderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ContactFolderRequestBuilder;
import com.microsoft.graph.requests.extensions.ContactCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ContactRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Contact Folder Request.
 */
public class ContactFolderRequest extends BaseRequest<ContactFolder> {
	
    /**
     * The request for the ContactFolder
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ContactFolderRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ContactFolder.class);
    }

    /**
     * Gets the ContactFolder from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ContactFolder> futureGet() {
        return futureSend(HttpMethod.GET, null);
    }

    /**
     * Gets the ContactFolder from the service
     *
     * @return the ContactFolder from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ContactFolder get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ContactFolder> futureDelete() {
        return futureSend(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ContactFolder delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ContactFolder with a source
     *
     * @param sourceContactFolder the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ContactFolder> futurePatch(@Nonnull final ContactFolder sourceContactFolder) {
        return futureSend(HttpMethod.PATCH, sourceContactFolder);
    }

    /**
     * Patches this ContactFolder with a source
     *
     * @param sourceContactFolder the source object with updates
     * @return the updated ContactFolder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ContactFolder patch(@Nonnull final ContactFolder sourceContactFolder) throws ClientException {
        return send(HttpMethod.PATCH, sourceContactFolder);
    }

    /**
     * Creates a ContactFolder with a new object
     *
     * @param newContactFolder the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ContactFolder> futurePost(@Nonnull final ContactFolder newContactFolder) {
        return futureSend(HttpMethod.POST, newContactFolder);
    }

    /**
     * Creates a ContactFolder with a new object
     *
     * @param newContactFolder the new object to create
     * @return the created ContactFolder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ContactFolder post(@Nonnull final ContactFolder newContactFolder) throws ClientException {
        return send(HttpMethod.POST, newContactFolder);
    }

    /**
     * Creates a ContactFolder with a new object
     *
     * @param newContactFolder the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ContactFolder> futurePut(@Nonnull final ContactFolder newContactFolder) {
        return futureSend(HttpMethod.PUT, newContactFolder);
    }

    /**
     * Creates a ContactFolder with a new object
     *
     * @param newContactFolder the object to create/update
     * @return the created ContactFolder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ContactFolder put(@Nonnull final ContactFolder newContactFolder) throws ClientException {
        return send(HttpMethod.PUT, newContactFolder);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ContactFolderRequest select(@Nonnull final String value) {
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
     public ContactFolderRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

