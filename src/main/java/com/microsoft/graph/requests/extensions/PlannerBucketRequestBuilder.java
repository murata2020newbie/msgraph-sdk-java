// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.PlannerBucket;
import com.microsoft.graph.requests.extensions.PlannerTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerTaskRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Bucket Request Builder.
 */
public class PlannerBucketRequestBuilder extends BaseRequestBuilder<PlannerBucket> {

    /**
     * The request builder for the PlannerBucket
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerBucketRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the PlannerBucketRequest instance
     */
    @Nonnull
    public PlannerBucketRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the PlannerBucketRequest instance
     */
    @Nonnull
    public PlannerBucketRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.PlannerBucketRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the PlannerTask collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PlannerTaskCollectionRequestBuilder tasks() {
        return new PlannerTaskCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tasks"), getClient(), null);
    }

    /**
     * Gets a request builder for the PlannerTask item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PlannerTaskRequestBuilder tasks(@Nonnull final String id) {
        return new PlannerTaskRequestBuilder(getRequestUrlWithAdditionalSegment("tasks") + "/" + id, getClient(), null);
    }
}
