// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.Windows10CompliancePolicy;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Compliance Policy Request.
 */
public class Windows10CompliancePolicyRequest extends BaseRequest<Windows10CompliancePolicy> {
	
    /**
     * The request for the Windows10CompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows10CompliancePolicyRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows10CompliancePolicy.class);
    }

    /**
     * Gets the Windows10CompliancePolicy from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10CompliancePolicy> futureGet() {
        return futureSend(HttpMethod.GET, null);
    }

    /**
     * Gets the Windows10CompliancePolicy from the service
     *
     * @return the Windows10CompliancePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10CompliancePolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10CompliancePolicy> futureDelete() {
        return futureSend(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Windows10CompliancePolicy delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Windows10CompliancePolicy with a source
     *
     * @param sourceWindows10CompliancePolicy the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10CompliancePolicy> futurePatch(@Nonnull final Windows10CompliancePolicy sourceWindows10CompliancePolicy) {
        return futureSend(HttpMethod.PATCH, sourceWindows10CompliancePolicy);
    }

    /**
     * Patches this Windows10CompliancePolicy with a source
     *
     * @param sourceWindows10CompliancePolicy the source object with updates
     * @return the updated Windows10CompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10CompliancePolicy patch(@Nonnull final Windows10CompliancePolicy sourceWindows10CompliancePolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindows10CompliancePolicy);
    }

    /**
     * Creates a Windows10CompliancePolicy with a new object
     *
     * @param newWindows10CompliancePolicy the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10CompliancePolicy> futurePost(@Nonnull final Windows10CompliancePolicy newWindows10CompliancePolicy) {
        return futureSend(HttpMethod.POST, newWindows10CompliancePolicy);
    }

    /**
     * Creates a Windows10CompliancePolicy with a new object
     *
     * @param newWindows10CompliancePolicy the new object to create
     * @return the created Windows10CompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10CompliancePolicy post(@Nonnull final Windows10CompliancePolicy newWindows10CompliancePolicy) throws ClientException {
        return send(HttpMethod.POST, newWindows10CompliancePolicy);
    }

    /**
     * Creates a Windows10CompliancePolicy with a new object
     *
     * @param newWindows10CompliancePolicy the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Windows10CompliancePolicy> futurePut(@Nonnull final Windows10CompliancePolicy newWindows10CompliancePolicy) {
        return futureSend(HttpMethod.PUT, newWindows10CompliancePolicy);
    }

    /**
     * Creates a Windows10CompliancePolicy with a new object
     *
     * @param newWindows10CompliancePolicy the object to create/update
     * @return the created Windows10CompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Windows10CompliancePolicy put(@Nonnull final Windows10CompliancePolicy newWindows10CompliancePolicy) throws ClientException {
        return send(HttpMethod.PUT, newWindows10CompliancePolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public Windows10CompliancePolicyRequest select(@Nonnull final String value) {
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
     public Windows10CompliancePolicyRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

