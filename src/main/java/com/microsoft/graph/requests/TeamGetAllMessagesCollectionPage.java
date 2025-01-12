// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ChatMessage;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.TeamGetAllMessagesCollectionRequestBuilder;
import com.microsoft.graph.requests.TeamGetAllMessagesCollectionPage;
import com.microsoft.graph.requests.TeamGetAllMessagesCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Team Get All Messages Collection Page.
 */
public class TeamGetAllMessagesCollectionPage extends BaseCollectionPage<ChatMessage, TeamGetAllMessagesCollectionRequestBuilder> {

    /**
     * A collection page for ChatMessage.
     *
     * @param response The serialized TeamGetAllMessagesCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public TeamGetAllMessagesCollectionPage(@Nonnull final TeamGetAllMessagesCollectionResponse response, @Nonnull final TeamGetAllMessagesCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for TeamGetAllMessages
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public TeamGetAllMessagesCollectionPage(@Nonnull final java.util.List<ChatMessage> pageContents, @Nullable final TeamGetAllMessagesCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
