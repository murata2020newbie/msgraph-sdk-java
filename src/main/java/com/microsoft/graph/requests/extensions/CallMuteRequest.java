// Template Source: BaseMethodRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MuteParticipantOperation;
import com.microsoft.graph.models.extensions.Call;
import com.microsoft.graph.requests.extensions.CallMuteRequest;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.extensions.CallMuteParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Mute Request.
 */
public class CallMuteRequest extends BaseRequest<MuteParticipantOperation> {
    /**
     * The request for this CallMute
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public CallMuteRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final CallMuteParameterSet parameters) {
        super(requestUrl, client, requestOptions, MuteParticipantOperation.class);
        body = parameters;
    }

	/** The body for the method */
    @Nullable
    protected CallMuteParameterSet body;
    /**
     * Invokes the method and returns a future with the result
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MuteParticipantOperation> futurePost() {
        return futureSend(HttpMethod.POST, body);
    }

    /**
     * Invokes the method and returns the result
     * @return result of the method invocation
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public MuteParticipantOperation post() throws ClientException {
       return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public CallMuteRequest select(@Nonnull final String value) {
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
    public CallMuteRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

}
