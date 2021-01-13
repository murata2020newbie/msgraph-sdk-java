// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.ListItemGetActivitiesByIntervalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ListItemGetActivitiesByIntervalCollectionRequest;
import com.microsoft.graph.requests.extensions.ListItemGetActivitiesByIntervalCollectionResponse;
import com.microsoft.graph.models.extensions.ListItemGetActivitiesByIntervalParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the List Item Get Activities By Interval Collection Request Builder.
 */
public class ListItemGetActivitiesByIntervalCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<ItemActivityStat, ListItemGetActivitiesByIntervalCollectionRequestBuilder, ListItemGetActivitiesByIntervalCollectionResponse, ListItemGetActivitiesByIntervalCollectionPage, ListItemGetActivitiesByIntervalCollectionRequest> {

    /**
     * The request builder for this collection of ListItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ListItemGetActivitiesByIntervalCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ListItemGetActivitiesByIntervalCollectionRequestBuilder.class, ListItemGetActivitiesByIntervalCollectionRequest.class);
    }
    /**
     * The request builder for this collection of ListItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ListItemGetActivitiesByIntervalCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ListItemGetActivitiesByIntervalParameterSet parameters) {
        super(requestUrl, client, requestOptions, ListItemGetActivitiesByIntervalCollectionRequestBuilder.class, ListItemGetActivitiesByIntervalCollectionRequest.class);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ListItemGetActivitiesByIntervalCollectionRequest instance
     */
    @Override
    @Nonnull
    public ListItemGetActivitiesByIntervalCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ListItemGetActivitiesByIntervalCollectionRequest request = super.buildRequest(requestOptions);
        return request;
    }
}
