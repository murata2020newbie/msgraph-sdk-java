// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.Conversation;
import com.microsoft.graph.requests.extensions.ConversationThreadCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationThreadRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conversation Request.
 */
public class ConversationRequest extends BaseRequest<Conversation> {
	
    /**
     * The request for the Conversation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ConversationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Conversation.class);
    }

    /**
     * Gets the Conversation from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Conversation> futureGet() {
        return futureSend(HttpMethod.GET, null);
    }

    /**
     * Gets the Conversation from the service
     *
     * @return the Conversation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Conversation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Conversation> futureDelete() {
        return futureSend(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Conversation delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Conversation with a source
     *
     * @param sourceConversation the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Conversation> futurePatch(@Nonnull final Conversation sourceConversation) {
        return futureSend(HttpMethod.PATCH, sourceConversation);
    }

    /**
     * Patches this Conversation with a source
     *
     * @param sourceConversation the source object with updates
     * @return the updated Conversation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Conversation patch(@Nonnull final Conversation sourceConversation) throws ClientException {
        return send(HttpMethod.PATCH, sourceConversation);
    }

    /**
     * Creates a Conversation with a new object
     *
     * @param newConversation the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Conversation> futurePost(@Nonnull final Conversation newConversation) {
        return futureSend(HttpMethod.POST, newConversation);
    }

    /**
     * Creates a Conversation with a new object
     *
     * @param newConversation the new object to create
     * @return the created Conversation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Conversation post(@Nonnull final Conversation newConversation) throws ClientException {
        return send(HttpMethod.POST, newConversation);
    }

    /**
     * Creates a Conversation with a new object
     *
     * @param newConversation the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Conversation> futurePut(@Nonnull final Conversation newConversation) {
        return futureSend(HttpMethod.PUT, newConversation);
    }

    /**
     * Creates a Conversation with a new object
     *
     * @param newConversation the object to create/update
     * @return the created Conversation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Conversation put(@Nonnull final Conversation newConversation) throws ClientException {
        return send(HttpMethod.PUT, newConversation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ConversationRequest select(@Nonnull final String value) {
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
     public ConversationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

