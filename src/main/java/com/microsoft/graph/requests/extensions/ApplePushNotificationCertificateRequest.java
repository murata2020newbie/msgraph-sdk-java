// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.ApplePushNotificationCertificate;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Apple Push Notification Certificate Request.
 */
public class ApplePushNotificationCertificateRequest extends BaseRequest<ApplePushNotificationCertificate> {
	
    /**
     * The request for the ApplePushNotificationCertificate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ApplePushNotificationCertificateRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ApplePushNotificationCertificate.class);
    }

    /**
     * Gets the ApplePushNotificationCertificate from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ApplePushNotificationCertificate> futureGet() {
        return futureSend(HttpMethod.GET, null);
    }

    /**
     * Gets the ApplePushNotificationCertificate from the service
     *
     * @return the ApplePushNotificationCertificate from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ApplePushNotificationCertificate get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ApplePushNotificationCertificate> futureDelete() {
        return futureSend(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ApplePushNotificationCertificate delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ApplePushNotificationCertificate with a source
     *
     * @param sourceApplePushNotificationCertificate the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ApplePushNotificationCertificate> futurePatch(@Nonnull final ApplePushNotificationCertificate sourceApplePushNotificationCertificate) {
        return futureSend(HttpMethod.PATCH, sourceApplePushNotificationCertificate);
    }

    /**
     * Patches this ApplePushNotificationCertificate with a source
     *
     * @param sourceApplePushNotificationCertificate the source object with updates
     * @return the updated ApplePushNotificationCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ApplePushNotificationCertificate patch(@Nonnull final ApplePushNotificationCertificate sourceApplePushNotificationCertificate) throws ClientException {
        return send(HttpMethod.PATCH, sourceApplePushNotificationCertificate);
    }

    /**
     * Creates a ApplePushNotificationCertificate with a new object
     *
     * @param newApplePushNotificationCertificate the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ApplePushNotificationCertificate> futurePost(@Nonnull final ApplePushNotificationCertificate newApplePushNotificationCertificate) {
        return futureSend(HttpMethod.POST, newApplePushNotificationCertificate);
    }

    /**
     * Creates a ApplePushNotificationCertificate with a new object
     *
     * @param newApplePushNotificationCertificate the new object to create
     * @return the created ApplePushNotificationCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ApplePushNotificationCertificate post(@Nonnull final ApplePushNotificationCertificate newApplePushNotificationCertificate) throws ClientException {
        return send(HttpMethod.POST, newApplePushNotificationCertificate);
    }

    /**
     * Creates a ApplePushNotificationCertificate with a new object
     *
     * @param newApplePushNotificationCertificate the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ApplePushNotificationCertificate> futurePut(@Nonnull final ApplePushNotificationCertificate newApplePushNotificationCertificate) {
        return futureSend(HttpMethod.PUT, newApplePushNotificationCertificate);
    }

    /**
     * Creates a ApplePushNotificationCertificate with a new object
     *
     * @param newApplePushNotificationCertificate the object to create/update
     * @return the created ApplePushNotificationCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ApplePushNotificationCertificate put(@Nonnull final ApplePushNotificationCertificate newApplePushNotificationCertificate) throws ClientException {
        return send(HttpMethod.PUT, newApplePushNotificationCertificate);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ApplePushNotificationCertificateRequest select(@Nonnull final String value) {
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
     public ApplePushNotificationCertificateRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

