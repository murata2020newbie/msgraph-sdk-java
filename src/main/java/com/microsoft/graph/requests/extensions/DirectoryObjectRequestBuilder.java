// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.ExtensionProperty;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.extensions.DirectoryObjectCheckMemberGroupsParameterSet;
import com.microsoft.graph.models.extensions.DirectoryObjectCheckMemberObjectsParameterSet;
import com.microsoft.graph.models.extensions.DirectoryObjectGetMemberGroupsParameterSet;
import com.microsoft.graph.models.extensions.DirectoryObjectGetMemberObjectsParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Object Request Builder.
 */
public class DirectoryObjectRequestBuilder extends BaseRequestBuilder<DirectoryObject> {

    /**
     * The request builder for the DirectoryObject
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectoryObjectRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DirectoryObjectRequest instance
     */
    @Nonnull
    public DirectoryObjectRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the DirectoryObjectRequest instance
     */
    @Nonnull
    public DirectoryObjectRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.DirectoryObjectRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectCheckMemberGroupsCollectionRequestBuilder checkMemberGroups(@Nonnull final DirectoryObjectCheckMemberGroupsParameterSet parameters) {
        return new DirectoryObjectCheckMemberGroupsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.checkMemberGroups"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectCheckMemberObjectsCollectionRequestBuilder checkMemberObjects(@Nonnull final DirectoryObjectCheckMemberObjectsParameterSet parameters) {
        return new DirectoryObjectCheckMemberObjectsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.checkMemberObjects"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectGetMemberGroupsCollectionRequestBuilder getMemberGroups(@Nonnull final DirectoryObjectGetMemberGroupsParameterSet parameters) {
        return new DirectoryObjectGetMemberGroupsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMemberGroups"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectGetMemberObjectsCollectionRequestBuilder getMemberObjects(@Nonnull final DirectoryObjectGetMemberObjectsParameterSet parameters) {
        return new DirectoryObjectGetMemberObjectsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMemberObjects"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public DirectoryObjectRestoreRequestBuilder restore() {
        return new DirectoryObjectRestoreRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.restore"), getClient(), null);
    }
}
