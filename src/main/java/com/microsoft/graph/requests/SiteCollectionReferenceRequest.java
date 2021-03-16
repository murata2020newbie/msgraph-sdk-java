// Template Source: BaseEntityCollectionReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.User;
import com.microsoft.graph.models.Site;
import com.microsoft.graph.models.ItemActivityStat;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.SiteWithReferenceRequest;
import com.microsoft.graph.requests.SiteReferenceRequestBuilder;
import com.microsoft.graph.requests.SiteWithReferenceRequestBuilder;
import com.microsoft.graph.requests.SiteCollectionWithReferencesRequest;
import com.microsoft.graph.requests.SiteCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.models.Site;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.http.ReferenceRequestBody;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Collection Reference Request.
 */
public class SiteCollectionReferenceRequest extends BaseCollectionWithReferencesRequest<Site, SiteWithReferenceRequest, SiteReferenceRequestBuilder, SiteWithReferenceRequestBuilder, SiteCollectionResponse, SiteCollectionWithReferencesPage, SiteCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of Site
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SiteCollectionReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SiteCollectionResponse.class, SiteCollectionWithReferencesPage.class, SiteCollectionWithReferencesRequestBuilder.class);
    }

    /**
     * Creates a new Site
     * @param newSite the Site to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Site> postAsync(@Nonnull final Site newSite) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/sites/" + newSite.id);
        return new SiteWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newSite, body);
    }

    /**
     * Creates a new Site
     * @param newSite the Site to create
     * @return the newly created object
     */
    @Nonnull
    public Site post(@Nonnull final Site newSite) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/sites/" + newSite.id);
        return new SiteWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest(getBaseRequest().getHeaders())
                .post(newSite, body);
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public SiteCollectionReferenceRequest expand(@Nonnull final String value) {
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
    public SiteCollectionReferenceRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the sort clause
     * @return the updated request
     */
    @Nonnull
    public SiteCollectionReferenceRequest orderBy(@Nonnull final String value) {
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
    public SiteCollectionReferenceRequest select(@Nonnull final String value) {
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
    public SiteCollectionReferenceRequest top(final int value) {
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
    public SiteCollectionReferenceRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public SiteCollectionReferenceRequest count() {
        addCountOption(true);
        return this;
    }
}