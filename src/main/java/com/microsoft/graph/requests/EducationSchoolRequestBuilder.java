// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.EducationSchool;
import com.microsoft.graph.requests.AdministrativeUnitWithReferenceRequestBuilder;
import com.microsoft.graph.requests.EducationClassCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.EducationClassWithReferenceRequestBuilder;
import com.microsoft.graph.requests.EducationUserCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.EducationUserWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education School Request Builder.
 */
public class EducationSchoolRequestBuilder extends BaseRequestBuilder<EducationSchool> {

    /**
     * The request builder for the EducationSchool
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationSchoolRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the EducationSchoolRequest instance
     */
    @Nonnull
    public EducationSchoolRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the EducationSchoolRequest instance
     */
    @Nonnull
    public EducationSchoolRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.EducationSchoolRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for AdministrativeUnit
     *
     * @return the AdministrativeUnitWithReferenceRequestBuilder instance
     */
    @Nonnull
    public AdministrativeUnitWithReferenceRequestBuilder administrativeUnit() {
        return new AdministrativeUnitWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("administrativeUnit"), getClient(), null);
    }
    /**
     *  Gets a request builder for the EducationClass collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public EducationClassCollectionWithReferencesRequestBuilder classes() {
        return new EducationClassCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("classes"), getClient(), null);
    }

    /**
     * Gets a request builder for the EducationClass item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public EducationClassWithReferenceRequestBuilder classes(@Nonnull final String id) {
        return new EducationClassWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("classes") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the EducationUser collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public EducationUserCollectionWithReferencesRequestBuilder users() {
        return new EducationUserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("users"), getClient(), null);
    }

    /**
     * Gets a request builder for the EducationUser item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public EducationUserWithReferenceRequestBuilder users(@Nonnull final String id) {
        return new EducationUserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("users") + "/" + id, getClient(), null);
    }
}