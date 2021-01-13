// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.Reminder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UserReminderViewCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserReminderViewCollectionPage;
import com.microsoft.graph.requests.extensions.UserReminderViewCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Reminder View Collection Page.
 */
public class UserReminderViewCollectionPage extends BaseCollectionPage<Reminder, UserReminderViewCollectionRequestBuilder> {

    /**
     * A collection page for Reminder.
     *
     * @param response The serialized UserReminderViewCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public UserReminderViewCollectionPage(@Nonnull final UserReminderViewCollectionResponse response, @Nonnull final UserReminderViewCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for UserReminderView
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public UserReminderViewCollectionPage(@Nonnull final java.util.List<Reminder> pageContents, @Nullable final UserReminderViewCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
