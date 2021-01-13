// Template Source: BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.EducationClass;
import com.microsoft.graph.requests.extensions.EducationUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationUserRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSchoolCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSchoolRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseReferenceRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Class Reference Request.
 */
public class EducationClassReferenceRequest extends BaseReferenceRequest<EducationClass> {

    /**
     * The request for the EducationClass
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationClassReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationClass.class);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public EducationClassReferenceRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public EducationClassReferenceRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }
    /**
     * Puts the EducationClass
     *
     * @param srcEducationClass the EducationClass reference to PUT
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EducationClass> futurePut(@Nonnull final EducationClass srcEducationClass) {
        final JsonObject payload = new JsonObject();
        payload.add("@odata.id", new JsonPrimitive(this.getClient().getServiceRoot() + "/education/classes/" + srcEducationClass.id));
        return futureSend(HttpMethod.PUT, payload);
    }

    /**
     * Puts the EducationClass
     *
     * @param srcEducationClass the EducationClass reference to PUT
     * @return the EducationClass
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public EducationClass put(@Nonnull final EducationClass srcEducationClass) throws ClientException {
        final JsonObject payload = new JsonObject();
        payload.add("@odata.id", new JsonPrimitive(this.getClient().getServiceRoot() + "/education/classes/" + srcEducationClass.id));
        return send(HttpMethod.PUT, payload);
    }
}
