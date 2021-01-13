// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.ManagedAppDiagnosticStatus;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.UserGetManagedAppDiagnosticStatusesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserGetManagedAppDiagnosticStatusesCollectionRequest;
import com.microsoft.graph.requests.extensions.UserGetManagedAppDiagnosticStatusesCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Get Managed App Diagnostic Statuses Collection Request Builder.
 */
public class UserGetManagedAppDiagnosticStatusesCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<ManagedAppDiagnosticStatus, UserGetManagedAppDiagnosticStatusesCollectionRequestBuilder, UserGetManagedAppDiagnosticStatusesCollectionResponse, UserGetManagedAppDiagnosticStatusesCollectionPage, UserGetManagedAppDiagnosticStatusesCollectionRequest> {

    /**
     * The request builder for this collection of User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserGetManagedAppDiagnosticStatusesCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserGetManagedAppDiagnosticStatusesCollectionRequestBuilder.class, UserGetManagedAppDiagnosticStatusesCollectionRequest.class);
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the UserGetManagedAppDiagnosticStatusesCollectionRequest instance
     */
    @Override
    @Nonnull
    public UserGetManagedAppDiagnosticStatusesCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final UserGetManagedAppDiagnosticStatusesCollectionRequest request = super.buildRequest(requestOptions);
        return request;
    }
}
