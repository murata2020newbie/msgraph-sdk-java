// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OnlineMeeting;
import com.microsoft.graph.models.extensions.ChatInfo;
import com.microsoft.graph.models.extensions.MeetingParticipants;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Online Meeting Request.
 */
public class OnlineMeetingRequest extends BaseRequest<OnlineMeeting> {
	
    /**
     * The request for the OnlineMeeting
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnlineMeetingRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OnlineMeeting.class);
    }

    /**
     * Gets the OnlineMeeting from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super OnlineMeeting> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the OnlineMeeting from the service
     *
     * @return the OnlineMeeting from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnlineMeeting get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super OnlineMeeting> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this OnlineMeeting with a source
     *
     * @param sourceOnlineMeeting the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final OnlineMeeting sourceOnlineMeeting, @Nonnull final ICallback<? super OnlineMeeting> callback) {
        send(HttpMethod.PATCH, callback, sourceOnlineMeeting);
    }

    /**
     * Patches this OnlineMeeting with a source
     *
     * @param sourceOnlineMeeting the source object with updates
     * @return the updated OnlineMeeting
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnlineMeeting patch(@Nonnull final OnlineMeeting sourceOnlineMeeting) throws ClientException {
        return send(HttpMethod.PATCH, sourceOnlineMeeting);
    }

    /**
     * Creates a OnlineMeeting with a new object
     *
     * @param newOnlineMeeting the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final OnlineMeeting newOnlineMeeting, @Nonnull final ICallback<? super OnlineMeeting> callback) {
        send(HttpMethod.POST, callback, newOnlineMeeting);
    }

    /**
     * Creates a OnlineMeeting with a new object
     *
     * @param newOnlineMeeting the new object to create
     * @return the created OnlineMeeting
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnlineMeeting post(@Nonnull final OnlineMeeting newOnlineMeeting) throws ClientException {
        return send(HttpMethod.POST, newOnlineMeeting);
    }

    /**
     * Creates a OnlineMeeting with a new object
     *
     * @param newOnlineMeeting the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final OnlineMeeting newOnlineMeeting, @Nonnull final ICallback<? super OnlineMeeting> callback) {
        send(HttpMethod.PUT, callback, newOnlineMeeting);
    }

    /**
     * Creates a OnlineMeeting with a new object
     *
     * @param newOnlineMeeting the object to create/update
     * @return the created OnlineMeeting
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnlineMeeting put(@Nonnull final OnlineMeeting newOnlineMeeting) throws ClientException {
        return send(HttpMethod.PUT, newOnlineMeeting);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public OnlineMeetingRequest select(@Nonnull final String value) {
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
     public OnlineMeetingRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

