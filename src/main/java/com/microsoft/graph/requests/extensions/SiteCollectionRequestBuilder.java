// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.Site;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.SiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteCollectionRequest;
import com.microsoft.graph.requests.extensions.SiteAddCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteRemoveCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.extensions.SiteAddParameterSet;
import com.microsoft.graph.models.extensions.SiteRemoveParameterSet;
import com.microsoft.graph.models.extensions.SiteGetActivitiesByIntervalParameterSet;
import com.microsoft.graph.models.extensions.SiteGetByPathParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Collection Request Builder.
 */
public class SiteCollectionRequestBuilder extends BaseCollectionRequestBuilder<Site, SiteRequestBuilder, SiteCollectionResponse, SiteCollectionPage, SiteCollectionRequest> {

    /**
     * The request builder for this collection of Site
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SiteCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SiteRequestBuilder.class, SiteCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public SiteAddCollectionRequestBuilder add(@Nonnull final SiteAddParameterSet parameters) {
        return new SiteAddCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.add"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public SiteRemoveCollectionRequestBuilder remove(@Nonnull final SiteRemoveParameterSet parameters) {
        return new SiteRemoveCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.remove"), getClient(), null, parameters);
    }

    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}
