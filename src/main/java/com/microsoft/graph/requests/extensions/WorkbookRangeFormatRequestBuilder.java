// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.WorkbookRangeFormat;
import com.microsoft.graph.requests.extensions.WorkbookRangeBorderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeBorderRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeFillRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeFontRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookFormatProtectionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Format Request Builder.
 */
public class WorkbookRangeFormatRequestBuilder extends BaseRequestBuilder<WorkbookRangeFormat> {

    /**
     * The request builder for the WorkbookRangeFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookRangeFormatRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the WorkbookRangeFormatRequest instance
     */
    @Nonnull
    public WorkbookRangeFormatRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the WorkbookRangeFormatRequest instance
     */
    @Nonnull
    public WorkbookRangeFormatRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.WorkbookRangeFormatRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the WorkbookRangeBorder collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WorkbookRangeBorderCollectionRequestBuilder borders() {
        return new WorkbookRangeBorderCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("borders"), getClient(), null);
    }

    /**
     * Gets a request builder for the WorkbookRangeBorder item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WorkbookRangeBorderRequestBuilder borders(@Nonnull final String id) {
        return new WorkbookRangeBorderRequestBuilder(getRequestUrlWithAdditionalSegment("borders") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookRangeFill
     *
     * @return the WorkbookRangeFillRequestBuilder instance
     */
    @Nonnull
    public WorkbookRangeFillRequestBuilder fill() {
        return new WorkbookRangeFillRequestBuilder(getRequestUrlWithAdditionalSegment("fill"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookRangeFont
     *
     * @return the WorkbookRangeFontRequestBuilder instance
     */
    @Nonnull
    public WorkbookRangeFontRequestBuilder font() {
        return new WorkbookRangeFontRequestBuilder(getRequestUrlWithAdditionalSegment("font"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookFormatProtection
     *
     * @return the WorkbookFormatProtectionRequestBuilder instance
     */
    @Nonnull
    public WorkbookFormatProtectionRequestBuilder protection() {
        return new WorkbookFormatProtectionRequestBuilder(getRequestUrlWithAdditionalSegment("protection"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public WorkbookRangeFormatAutofitColumnsRequestBuilder autofitColumns() {
        return new WorkbookRangeFormatAutofitColumnsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.autofitColumns"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public WorkbookRangeFormatAutofitRowsRequestBuilder autofitRows() {
        return new WorkbookRangeFormatAutofitRowsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.autofitRows"), getClient(), null);
    }
}
