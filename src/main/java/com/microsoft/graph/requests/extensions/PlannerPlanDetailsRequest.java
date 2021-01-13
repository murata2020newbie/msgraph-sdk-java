// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.PlannerPlanDetails;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Plan Details Request.
 */
public class PlannerPlanDetailsRequest extends BaseRequest<PlannerPlanDetails> {
	
    /**
     * The request for the PlannerPlanDetails
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerPlanDetailsRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PlannerPlanDetails.class);
    }

    /**
     * Gets the PlannerPlanDetails from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PlannerPlanDetails> futureGet() {
        return futureSend(HttpMethod.GET, null);
    }

    /**
     * Gets the PlannerPlanDetails from the service
     *
     * @return the PlannerPlanDetails from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PlannerPlanDetails get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PlannerPlanDetails> futureDelete() {
        return futureSend(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public PlannerPlanDetails delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this PlannerPlanDetails with a source
     *
     * @param sourcePlannerPlanDetails the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PlannerPlanDetails> futurePatch(@Nonnull final PlannerPlanDetails sourcePlannerPlanDetails) {
        return futureSend(HttpMethod.PATCH, sourcePlannerPlanDetails);
    }

    /**
     * Patches this PlannerPlanDetails with a source
     *
     * @param sourcePlannerPlanDetails the source object with updates
     * @return the updated PlannerPlanDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PlannerPlanDetails patch(@Nonnull final PlannerPlanDetails sourcePlannerPlanDetails) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlannerPlanDetails);
    }

    /**
     * Creates a PlannerPlanDetails with a new object
     *
     * @param newPlannerPlanDetails the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PlannerPlanDetails> futurePost(@Nonnull final PlannerPlanDetails newPlannerPlanDetails) {
        return futureSend(HttpMethod.POST, newPlannerPlanDetails);
    }

    /**
     * Creates a PlannerPlanDetails with a new object
     *
     * @param newPlannerPlanDetails the new object to create
     * @return the created PlannerPlanDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PlannerPlanDetails post(@Nonnull final PlannerPlanDetails newPlannerPlanDetails) throws ClientException {
        return send(HttpMethod.POST, newPlannerPlanDetails);
    }

    /**
     * Creates a PlannerPlanDetails with a new object
     *
     * @param newPlannerPlanDetails the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PlannerPlanDetails> futurePut(@Nonnull final PlannerPlanDetails newPlannerPlanDetails) {
        return futureSend(HttpMethod.PUT, newPlannerPlanDetails);
    }

    /**
     * Creates a PlannerPlanDetails with a new object
     *
     * @param newPlannerPlanDetails the object to create/update
     * @return the created PlannerPlanDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PlannerPlanDetails put(@Nonnull final PlannerPlanDetails newPlannerPlanDetails) throws ClientException {
        return send(HttpMethod.PUT, newPlannerPlanDetails);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public PlannerPlanDetailsRequest select(@Nonnull final String value) {
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
     public PlannerPlanDetailsRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

