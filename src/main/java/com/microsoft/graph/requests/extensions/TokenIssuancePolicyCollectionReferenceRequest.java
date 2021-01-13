// Template Source: BaseEntityCollectionReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.TokenIssuancePolicy;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.TokenIssuancePolicyWithReferenceRequest;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.models.extensions.TokenIssuancePolicy;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.http.ReferenceRequestBody;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Token Issuance Policy Collection Reference Request.
 */
public class TokenIssuancePolicyCollectionReferenceRequest extends BaseCollectionWithReferencesRequest<TokenIssuancePolicy, TokenIssuancePolicyWithReferenceRequest, TokenIssuancePolicyReferenceRequestBuilder, TokenIssuancePolicyWithReferenceRequestBuilder, TokenIssuancePolicyCollectionResponse, TokenIssuancePolicyCollectionWithReferencesPage, TokenIssuancePolicyCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of TokenIssuancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TokenIssuancePolicyCollectionReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TokenIssuancePolicyCollectionResponse.class, TokenIssuancePolicyCollectionWithReferencesPage.class, TokenIssuancePolicyCollectionWithReferencesRequestBuilder.class);
    }

    /**
     * Creates a new TokenIssuancePolicy
     * @param newTokenIssuancePolicy the TokenIssuancePolicy to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TokenIssuancePolicy> futurePost(@Nonnull final TokenIssuancePolicy newTokenIssuancePolicy) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/policies/tokenIssuancePolicies/" + newTokenIssuancePolicy.id);
        return new TokenIssuancePolicyWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .futurePost(newTokenIssuancePolicy, body);
    }

    /**
     * Creates a new TokenIssuancePolicy
     * @param newTokenIssuancePolicy the TokenIssuancePolicy to create
     * @return the newly created object
     */
    @Nonnull
    public TokenIssuancePolicy post(@Nonnull final TokenIssuancePolicy newTokenIssuancePolicy) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/policies/tokenIssuancePolicies/" + newTokenIssuancePolicy.id);
        return new TokenIssuancePolicyWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest(getBaseRequest().getHeaders())
                .post(newTokenIssuancePolicy, body);
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public TokenIssuancePolicyCollectionReferenceRequest expand(@Nonnull final String value) {
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
    public TokenIssuancePolicyCollectionReferenceRequest filter(@Nonnull final String value) {
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
    public TokenIssuancePolicyCollectionReferenceRequest orderBy(@Nonnull final String value) {
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
    public TokenIssuancePolicyCollectionReferenceRequest select(@Nonnull final String value) {
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
    public TokenIssuancePolicyCollectionReferenceRequest top(final int value) {
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
    public TokenIssuancePolicyCollectionReferenceRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public TokenIssuancePolicyCollectionReferenceRequest count() {
        addCountOption(true);
        return this;
    }
}
