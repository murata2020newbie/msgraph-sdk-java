// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WorkbookWorksheet;
import com.microsoft.graph.models.WorkbookTable;
import com.microsoft.graph.models.WorkbookRange;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.WorkbookTableCollectionRequestBuilder;
import com.microsoft.graph.requests.WorkbookTableRequestBuilder;
import com.microsoft.graph.requests.WorkbookTableCollectionRequest;
import com.microsoft.graph.requests.WorkbookTableAddRequestBuilder;
import com.microsoft.graph.requests.WorkbookTableCountRequestBuilder;
import com.microsoft.graph.requests.WorkbookTableItemAtRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.WorkbookTableAddParameterSet;
import com.microsoft.graph.models.WorkbookTableItemAtParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Collection Request Builder.
 */
public class WorkbookTableCollectionRequestBuilder extends BaseCollectionRequestBuilder<WorkbookTable, WorkbookTableRequestBuilder, WorkbookTableCollectionResponse, WorkbookTableCollectionPage, WorkbookTableCollectionRequest> {

    /**
     * The request builder for this collection of WorkbookWorksheet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookTableCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookTableRequestBuilder.class, WorkbookTableCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookTableAddRequestBuilder add(@Nonnull final WorkbookTableAddParameterSet parameters) {
        return new WorkbookTableAddRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.add"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public WorkbookTableCountRequestBuilder count() {
        return new WorkbookTableCountRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.count"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WorkbookTableItemAtRequestBuilder itemAt(@Nonnull final WorkbookTableItemAtParameterSet parameters) {
        return new WorkbookTableItemAtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.itemAt"), getClient(), null, parameters);
    }
}
