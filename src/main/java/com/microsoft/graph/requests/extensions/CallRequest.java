// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.Call;
import com.microsoft.graph.models.extensions.MediaConfig;
import com.microsoft.graph.models.generated.Modality;
import com.microsoft.graph.models.extensions.CancelMediaProcessingOperation;
import com.microsoft.graph.models.generated.ScreenSharingRole;
import com.microsoft.graph.models.extensions.MuteParticipantOperation;
import com.microsoft.graph.models.extensions.Prompt;
import com.microsoft.graph.models.extensions.PlayPromptOperation;
import com.microsoft.graph.models.extensions.RecordOperation;
import com.microsoft.graph.models.extensions.InvitationParticipantInfo;
import com.microsoft.graph.models.generated.RejectReason;
import com.microsoft.graph.models.extensions.SubscribeToToneOperation;
import com.microsoft.graph.models.extensions.UnmuteParticipantOperation;
import com.microsoft.graph.models.generated.RecordingStatus;
import com.microsoft.graph.models.extensions.UpdateRecordingStatusOperation;
import com.microsoft.graph.models.extensions.TeleconferenceDeviceQuality;
import com.microsoft.graph.requests.extensions.CommsOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CommsOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.ParticipantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ParticipantRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Request.
 */
public class CallRequest extends BaseRequest<Call> {
	
    /**
     * The request for the Call
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CallRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Call.class);
    }

    /**
     * Gets the Call from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Call> futureGet() {
        return futureSend(HttpMethod.GET, null);
    }

    /**
     * Gets the Call from the service
     *
     * @return the Call from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Call get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Call> futureDelete() {
        return futureSend(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Call delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Call with a source
     *
     * @param sourceCall the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Call> futurePatch(@Nonnull final Call sourceCall) {
        return futureSend(HttpMethod.PATCH, sourceCall);
    }

    /**
     * Patches this Call with a source
     *
     * @param sourceCall the source object with updates
     * @return the updated Call
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Call patch(@Nonnull final Call sourceCall) throws ClientException {
        return send(HttpMethod.PATCH, sourceCall);
    }

    /**
     * Creates a Call with a new object
     *
     * @param newCall the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Call> futurePost(@Nonnull final Call newCall) {
        return futureSend(HttpMethod.POST, newCall);
    }

    /**
     * Creates a Call with a new object
     *
     * @param newCall the new object to create
     * @return the created Call
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Call post(@Nonnull final Call newCall) throws ClientException {
        return send(HttpMethod.POST, newCall);
    }

    /**
     * Creates a Call with a new object
     *
     * @param newCall the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Call> futurePut(@Nonnull final Call newCall) {
        return futureSend(HttpMethod.PUT, newCall);
    }

    /**
     * Creates a Call with a new object
     *
     * @param newCall the object to create/update
     * @return the created Call
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Call put(@Nonnull final Call newCall) throws ClientException {
        return send(HttpMethod.PUT, newCall);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public CallRequest select(@Nonnull final String value) {
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
     public CallRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

