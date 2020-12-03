// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ConversationThread;
import com.microsoft.graph.models.extensions.Post;
import com.microsoft.graph.requests.extensions.PostCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PostRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conversation Thread Request.
 */
public class ConversationThreadRequest extends BaseRequest<ConversationThread> {
	
    /**
     * The request for the ConversationThread
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ConversationThreadRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ConversationThread.class);
    }

    /**
     * Gets the ConversationThread from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super ConversationThread> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ConversationThread from the service
     *
     * @return the ConversationThread from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ConversationThread get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super ConversationThread> callback) {
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
     * Patches this ConversationThread with a source
     *
     * @param sourceConversationThread the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final ConversationThread sourceConversationThread, @Nonnull final ICallback<? super ConversationThread> callback) {
        send(HttpMethod.PATCH, callback, sourceConversationThread);
    }

    /**
     * Patches this ConversationThread with a source
     *
     * @param sourceConversationThread the source object with updates
     * @return the updated ConversationThread
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ConversationThread patch(@Nonnull final ConversationThread sourceConversationThread) throws ClientException {
        return send(HttpMethod.PATCH, sourceConversationThread);
    }

    /**
     * Creates a ConversationThread with a new object
     *
     * @param newConversationThread the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final ConversationThread newConversationThread, @Nonnull final ICallback<? super ConversationThread> callback) {
        send(HttpMethod.POST, callback, newConversationThread);
    }

    /**
     * Creates a ConversationThread with a new object
     *
     * @param newConversationThread the new object to create
     * @return the created ConversationThread
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ConversationThread post(@Nonnull final ConversationThread newConversationThread) throws ClientException {
        return send(HttpMethod.POST, newConversationThread);
    }

    /**
     * Creates a ConversationThread with a new object
     *
     * @param newConversationThread the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final ConversationThread newConversationThread, @Nonnull final ICallback<? super ConversationThread> callback) {
        send(HttpMethod.PUT, callback, newConversationThread);
    }

    /**
     * Creates a ConversationThread with a new object
     *
     * @param newConversationThread the object to create/update
     * @return the created ConversationThread
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ConversationThread put(@Nonnull final ConversationThread newConversationThread) throws ClientException {
        return send(HttpMethod.PUT, newConversationThread);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ConversationThreadRequest select(@Nonnull final String value) {
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
     public ConversationThreadRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

