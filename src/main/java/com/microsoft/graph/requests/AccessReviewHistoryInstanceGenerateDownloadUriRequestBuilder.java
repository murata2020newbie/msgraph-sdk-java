// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.AccessReviewHistoryInstanceGenerateDownloadUriRequest;
import com.microsoft.graph.models.AccessReviewHistoryInstance;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review History Instance Generate Download Uri Request Builder.
 */
public class AccessReviewHistoryInstanceGenerateDownloadUriRequestBuilder extends BaseActionRequestBuilder<AccessReviewHistoryInstance> {

    /**
     * The request builder for this AccessReviewHistoryInstanceGenerateDownloadUri
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessReviewHistoryInstanceGenerateDownloadUriRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the AccessReviewHistoryInstanceGenerateDownloadUriRequest
     *
     * @param requestOptions the options for the request
     * @return the AccessReviewHistoryInstanceGenerateDownloadUriRequest instance
     */
    @Nonnull
    public AccessReviewHistoryInstanceGenerateDownloadUriRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the AccessReviewHistoryInstanceGenerateDownloadUriRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the AccessReviewHistoryInstanceGenerateDownloadUriRequest instance
     */
    @Nonnull
    public AccessReviewHistoryInstanceGenerateDownloadUriRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final AccessReviewHistoryInstanceGenerateDownloadUriRequest request = new AccessReviewHistoryInstanceGenerateDownloadUriRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}
