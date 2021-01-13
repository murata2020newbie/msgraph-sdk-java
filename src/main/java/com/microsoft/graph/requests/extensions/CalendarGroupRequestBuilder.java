// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.CalendarGroup;
import com.microsoft.graph.requests.extensions.CalendarCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar Group Request Builder.
 */
public class CalendarGroupRequestBuilder extends BaseRequestBuilder<CalendarGroup> {

    /**
     * The request builder for the CalendarGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CalendarGroupRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the CalendarGroupRequest instance
     */
    @Nonnull
    public CalendarGroupRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the CalendarGroupRequest instance
     */
    @Nonnull
    public CalendarGroupRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.CalendarGroupRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the Calendar collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public CalendarCollectionRequestBuilder calendars() {
        return new CalendarCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("calendars"), getClient(), null);
    }

    /**
     * Gets a request builder for the Calendar item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public CalendarRequestBuilder calendars(@Nonnull final String id) {
        return new CalendarRequestBuilder(getRequestUrlWithAdditionalSegment("calendars") + "/" + id, getClient(), null);
    }
}
