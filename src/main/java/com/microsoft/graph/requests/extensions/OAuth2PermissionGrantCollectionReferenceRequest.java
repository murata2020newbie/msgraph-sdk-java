// Template Source: BaseEntityCollectionReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.OAuth2PermissionGrant;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantWithReferenceRequest;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.models.extensions.OAuth2PermissionGrant;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.http.ReferenceRequestBody;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the OAuth2Permission Grant Collection Reference Request.
 */
public class OAuth2PermissionGrantCollectionReferenceRequest extends BaseCollectionWithReferencesRequest<OAuth2PermissionGrant, OAuth2PermissionGrantWithReferenceRequest, OAuth2PermissionGrantReferenceRequestBuilder, OAuth2PermissionGrantWithReferenceRequestBuilder, OAuth2PermissionGrantCollectionResponse, OAuth2PermissionGrantCollectionWithReferencesPage, OAuth2PermissionGrantCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of OAuth2PermissionGrant
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OAuth2PermissionGrantCollectionReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OAuth2PermissionGrantCollectionResponse.class, OAuth2PermissionGrantCollectionWithReferencesPage.class, OAuth2PermissionGrantCollectionWithReferencesRequestBuilder.class);
    }

    /**
     * Creates a new OAuth2PermissionGrant
     * @param newOAuth2PermissionGrant the OAuth2PermissionGrant to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OAuth2PermissionGrant> futurePost(@Nonnull final OAuth2PermissionGrant newOAuth2PermissionGrant) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/oauth2PermissionGrants/" + newOAuth2PermissionGrant.id);
        return new OAuth2PermissionGrantWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .futurePost(newOAuth2PermissionGrant, body);
    }

    /**
     * Creates a new OAuth2PermissionGrant
     * @param newOAuth2PermissionGrant the OAuth2PermissionGrant to create
     * @return the newly created object
     */
    @Nonnull
    public OAuth2PermissionGrant post(@Nonnull final OAuth2PermissionGrant newOAuth2PermissionGrant) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/oauth2PermissionGrants/" + newOAuth2PermissionGrant.id);
        return new OAuth2PermissionGrantWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest(getBaseRequest().getHeaders())
                .post(newOAuth2PermissionGrant, body);
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public OAuth2PermissionGrantCollectionReferenceRequest expand(@Nonnull final String value) {
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
    public OAuth2PermissionGrantCollectionReferenceRequest filter(@Nonnull final String value) {
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
    public OAuth2PermissionGrantCollectionReferenceRequest orderBy(@Nonnull final String value) {
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
    public OAuth2PermissionGrantCollectionReferenceRequest select(@Nonnull final String value) {
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
    public OAuth2PermissionGrantCollectionReferenceRequest top(final int value) {
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
    public OAuth2PermissionGrantCollectionReferenceRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public OAuth2PermissionGrantCollectionReferenceRequest count() {
        addCountOption(true);
        return this;
    }
}
