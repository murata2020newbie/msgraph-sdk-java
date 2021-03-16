// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.OnenoteSectionCopyToNotebookRequest;
import com.microsoft.graph.models.OnenoteSection;
import com.microsoft.graph.models.OnenoteOperation;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.OnenoteSectionCopyToNotebookParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Section Copy To Notebook Request Builder.
 */
public class OnenoteSectionCopyToNotebookRequestBuilder extends BaseActionRequestBuilder<OnenoteOperation> {

    /**
     * The request builder for this OnenoteSectionCopyToNotebook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnenoteSectionCopyToNotebookRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private OnenoteSectionCopyToNotebookParameterSet body;
    /**
     * The request builder for this OnenoteSectionCopyToNotebook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public OnenoteSectionCopyToNotebookRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final OnenoteSectionCopyToNotebookParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the OnenoteSectionCopyToNotebookRequest
     *
     * @param requestOptions the options for the request
     * @return the OnenoteSectionCopyToNotebookRequest instance
     */
    @Nonnull
    public OnenoteSectionCopyToNotebookRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the OnenoteSectionCopyToNotebookRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the OnenoteSectionCopyToNotebookRequest instance
     */
    @Nonnull
    public OnenoteSectionCopyToNotebookRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final OnenoteSectionCopyToNotebookRequest request = new OnenoteSectionCopyToNotebookRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}