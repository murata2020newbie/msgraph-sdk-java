// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.TargetedManagedAppPolicyAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Targeted Managed App Policy Assignment Request.
 */
public class TargetedManagedAppPolicyAssignmentRequest extends BaseRequest<TargetedManagedAppPolicyAssignment> {
	
    /**
     * The request for the TargetedManagedAppPolicyAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TargetedManagedAppPolicyAssignmentRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TargetedManagedAppPolicyAssignment.class);
    }

    /**
     * Gets the TargetedManagedAppPolicyAssignment from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TargetedManagedAppPolicyAssignment> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the TargetedManagedAppPolicyAssignment from the service
     *
     * @return the TargetedManagedAppPolicyAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TargetedManagedAppPolicyAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TargetedManagedAppPolicyAssignment> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public TargetedManagedAppPolicyAssignment delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this TargetedManagedAppPolicyAssignment with a source
     *
     * @param sourceTargetedManagedAppPolicyAssignment the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TargetedManagedAppPolicyAssignment> patchAsync(@Nonnull final TargetedManagedAppPolicyAssignment sourceTargetedManagedAppPolicyAssignment) {
        return sendAsync(HttpMethod.PATCH, sourceTargetedManagedAppPolicyAssignment);
    }

    /**
     * Patches this TargetedManagedAppPolicyAssignment with a source
     *
     * @param sourceTargetedManagedAppPolicyAssignment the source object with updates
     * @return the updated TargetedManagedAppPolicyAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TargetedManagedAppPolicyAssignment patch(@Nonnull final TargetedManagedAppPolicyAssignment sourceTargetedManagedAppPolicyAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceTargetedManagedAppPolicyAssignment);
    }

    /**
     * Creates a TargetedManagedAppPolicyAssignment with a new object
     *
     * @param newTargetedManagedAppPolicyAssignment the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TargetedManagedAppPolicyAssignment> postAsync(@Nonnull final TargetedManagedAppPolicyAssignment newTargetedManagedAppPolicyAssignment) {
        return sendAsync(HttpMethod.POST, newTargetedManagedAppPolicyAssignment);
    }

    /**
     * Creates a TargetedManagedAppPolicyAssignment with a new object
     *
     * @param newTargetedManagedAppPolicyAssignment the new object to create
     * @return the created TargetedManagedAppPolicyAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TargetedManagedAppPolicyAssignment post(@Nonnull final TargetedManagedAppPolicyAssignment newTargetedManagedAppPolicyAssignment) throws ClientException {
        return send(HttpMethod.POST, newTargetedManagedAppPolicyAssignment);
    }

    /**
     * Creates a TargetedManagedAppPolicyAssignment with a new object
     *
     * @param newTargetedManagedAppPolicyAssignment the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TargetedManagedAppPolicyAssignment> putAsync(@Nonnull final TargetedManagedAppPolicyAssignment newTargetedManagedAppPolicyAssignment) {
        return sendAsync(HttpMethod.PUT, newTargetedManagedAppPolicyAssignment);
    }

    /**
     * Creates a TargetedManagedAppPolicyAssignment with a new object
     *
     * @param newTargetedManagedAppPolicyAssignment the object to create/update
     * @return the created TargetedManagedAppPolicyAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TargetedManagedAppPolicyAssignment put(@Nonnull final TargetedManagedAppPolicyAssignment newTargetedManagedAppPolicyAssignment) throws ClientException {
        return send(HttpMethod.PUT, newTargetedManagedAppPolicyAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TargetedManagedAppPolicyAssignmentRequest select(@Nonnull final String value) {
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
     public TargetedManagedAppPolicyAssignmentRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
