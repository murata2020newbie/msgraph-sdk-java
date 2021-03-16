// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.PrinterRestoreFactoryDefaultsRequest;
import com.microsoft.graph.models.Printer;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Printer Restore Factory Defaults Request Builder.
 */
public class PrinterRestoreFactoryDefaultsRequestBuilder extends BaseActionRequestBuilder<Printer> {

    /**
     * The request builder for this PrinterRestoreFactoryDefaults
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrinterRestoreFactoryDefaultsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the PrinterRestoreFactoryDefaultsRequest
     *
     * @param requestOptions the options for the request
     * @return the PrinterRestoreFactoryDefaultsRequest instance
     */
    @Nonnull
    public PrinterRestoreFactoryDefaultsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the PrinterRestoreFactoryDefaultsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the PrinterRestoreFactoryDefaultsRequest instance
     */
    @Nonnull
    public PrinterRestoreFactoryDefaultsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final PrinterRestoreFactoryDefaultsRequest request = new PrinterRestoreFactoryDefaultsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}