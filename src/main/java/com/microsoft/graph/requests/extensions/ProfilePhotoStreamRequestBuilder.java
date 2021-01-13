// Template Source: BaseEntityStreamRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.ProfilePhoto;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import java.io.InputStream;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Profile Photo Stream Request Builder.
 */
public class ProfilePhotoStreamRequestBuilder extends BaseRequestBuilder<InputStream> {

    /**
     * The request builder for the ProfilePhoto
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ProfilePhotoStreamRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ProfilePhotoStreamRequest instance
     */
    @Nonnull
    public ProfilePhotoStreamRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the ProfilePhotoStreamRequest instance
     */
    @Nonnull
    public ProfilePhotoStreamRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ProfilePhotoStreamRequest(getRequestUrl(), getClient(), requestOptions);
    }


}
