// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.Schedule;
import com.microsoft.graph.models.extensions.OpenShiftChangeRequest;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.requests.extensions.OpenShiftChangeRequestCollectionResponse;
import com.microsoft.graph.requests.extensions.OpenShiftChangeRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OpenShiftChangeRequestCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Open Shift Change Request Collection Request.
 */
public class OpenShiftChangeRequestCollectionRequest extends BaseEntityCollectionRequest<OpenShiftChangeRequest, OpenShiftChangeRequestCollectionResponse, OpenShiftChangeRequestCollectionPage> {

    /**
     * The request builder for this collection of OpenShiftChangeRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OpenShiftChangeRequestCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OpenShiftChangeRequestCollectionResponse.class, OpenShiftChangeRequestCollectionPage.class, OpenShiftChangeRequestCollectionRequestBuilder.class);
    }

    /**
     * Creates a new OpenShiftChangeRequest
     * @param newOpenShiftChangeRequest the OpenShiftChangeRequest to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OpenShiftChangeRequest> futurePost(@Nonnull final OpenShiftChangeRequest newOpenShiftChangeRequest) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new OpenShiftChangeRequestRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .futurePost(newOpenShiftChangeRequest);
    }

    /**
     * Creates a new OpenShiftChangeRequest
     * @param newOpenShiftChangeRequest the OpenShiftChangeRequest to create
     * @return the newly created object
     */
    @Nonnull
    public OpenShiftChangeRequest post(@Nonnull final OpenShiftChangeRequest newOpenShiftChangeRequest) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new OpenShiftChangeRequestRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newOpenShiftChangeRequest);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public OpenShiftChangeRequestCollectionRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public OpenShiftChangeRequestCollectionRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public OpenShiftChangeRequestCollectionRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public OpenShiftChangeRequestCollectionRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public OpenShiftChangeRequestCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public OpenShiftChangeRequestCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public OpenShiftChangeRequestCollectionRequest count() {
        addCountOption(true);
        return this;
    }
    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public OpenShiftChangeRequestCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public OpenShiftChangeRequestCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}

