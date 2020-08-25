// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ICallRequest;
import com.microsoft.graph.requests.extensions.CallRequest;
import com.microsoft.graph.requests.extensions.IParticipantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ParticipantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IParticipantRequestBuilder;
import com.microsoft.graph.requests.extensions.ParticipantRequestBuilder;
import com.microsoft.graph.requests.extensions.ICommsOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CommsOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICommsOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.CommsOperationRequestBuilder;
import com.microsoft.graph.models.extensions.MediaConfig;
import com.microsoft.graph.models.generated.Modality;
import com.microsoft.graph.requests.extensions.ICallAnswerRequestBuilder;
import com.microsoft.graph.requests.extensions.CallAnswerRequestBuilder;
import com.microsoft.graph.requests.extensions.ICallCancelMediaProcessingRequestBuilder;
import com.microsoft.graph.requests.extensions.CallCancelMediaProcessingRequestBuilder;
import com.microsoft.graph.models.generated.ScreenSharingRole;
import com.microsoft.graph.requests.extensions.ICallChangeScreenSharingRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.CallChangeScreenSharingRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.ICallKeepAliveRequestBuilder;
import com.microsoft.graph.requests.extensions.CallKeepAliveRequestBuilder;
import com.microsoft.graph.requests.extensions.ICallMuteRequestBuilder;
import com.microsoft.graph.requests.extensions.CallMuteRequestBuilder;
import com.microsoft.graph.models.extensions.Prompt;
import com.microsoft.graph.requests.extensions.ICallPlayPromptRequestBuilder;
import com.microsoft.graph.requests.extensions.CallPlayPromptRequestBuilder;
import com.microsoft.graph.models.extensions.Prompt;
import com.microsoft.graph.requests.extensions.ICallRecordResponseRequestBuilder;
import com.microsoft.graph.requests.extensions.CallRecordResponseRequestBuilder;
import com.microsoft.graph.models.extensions.InvitationParticipantInfo;
import com.microsoft.graph.requests.extensions.ICallRedirectRequestBuilder;
import com.microsoft.graph.requests.extensions.CallRedirectRequestBuilder;
import com.microsoft.graph.models.generated.RejectReason;
import com.microsoft.graph.requests.extensions.ICallRejectRequestBuilder;
import com.microsoft.graph.requests.extensions.CallRejectRequestBuilder;
import com.microsoft.graph.requests.extensions.ICallSubscribeToToneRequestBuilder;
import com.microsoft.graph.requests.extensions.CallSubscribeToToneRequestBuilder;
import com.microsoft.graph.models.extensions.InvitationParticipantInfo;
import com.microsoft.graph.requests.extensions.ICallTransferRequestBuilder;
import com.microsoft.graph.requests.extensions.CallTransferRequestBuilder;
import com.microsoft.graph.requests.extensions.ICallUnmuteRequestBuilder;
import com.microsoft.graph.requests.extensions.CallUnmuteRequestBuilder;
import com.microsoft.graph.models.generated.RecordingStatus;
import com.microsoft.graph.requests.extensions.ICallUpdateRecordingStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.CallUpdateRecordingStatusRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Request Builder.
 */
public class CallRequestBuilder extends BaseRequestBuilder implements ICallRequestBuilder {

    /**
     * The request builder for the Call
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CallRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the ICallRequest instance
     */
    public ICallRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ICallRequest instance
     */
    public ICallRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new CallRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IParticipantCollectionRequestBuilder participants() {
        return new ParticipantCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("participants"), getClient(), null);
    }

    public IParticipantRequestBuilder participants(final String id) {
        return new ParticipantRequestBuilder(getRequestUrlWithAdditionalSegment("participants") + "/" + id, getClient(), null);
    }
    public ICommsOperationCollectionRequestBuilder operations() {
        return new CommsOperationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("operations"), getClient(), null);
    }

    public ICommsOperationRequestBuilder operations(final String id) {
        return new CommsOperationRequestBuilder(getRequestUrlWithAdditionalSegment("operations") + "/" + id, getClient(), null);
    }

    public ICallAnswerRequestBuilder answer(final String callbackUri, final MediaConfig mediaConfig, final java.util.List<Modality> acceptedModalities) {
        return new CallAnswerRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.answer"), getClient(), null, callbackUri, mediaConfig, acceptedModalities);
    }

    public ICallCancelMediaProcessingRequestBuilder cancelMediaProcessing(final String clientContext) {
        return new CallCancelMediaProcessingRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.cancelMediaProcessing"), getClient(), null, clientContext);
    }

    public ICallChangeScreenSharingRoleRequestBuilder changeScreenSharingRole(final ScreenSharingRole role) {
        return new CallChangeScreenSharingRoleRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.changeScreenSharingRole"), getClient(), null, role);
    }

    public ICallKeepAliveRequestBuilder keepAlive() {
        return new CallKeepAliveRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.keepAlive"), getClient(), null);
    }

    public ICallMuteRequestBuilder mute(final String clientContext) {
        return new CallMuteRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.mute"), getClient(), null, clientContext);
    }

    public ICallPlayPromptRequestBuilder playPrompt(final java.util.List<Prompt> prompts, final String clientContext) {
        return new CallPlayPromptRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.playPrompt"), getClient(), null, prompts, clientContext);
    }

    public ICallRecordResponseRequestBuilder recordResponse(final java.util.List<Prompt> prompts, final Boolean bargeInAllowed, final Integer initialSilenceTimeoutInSeconds, final Integer maxSilenceTimeoutInSeconds, final Integer maxRecordDurationInSeconds, final Boolean playBeep, final java.util.List<String> stopTones, final String clientContext) {
        return new CallRecordResponseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.recordResponse"), getClient(), null, prompts, bargeInAllowed, initialSilenceTimeoutInSeconds, maxSilenceTimeoutInSeconds, maxRecordDurationInSeconds, playBeep, stopTones, clientContext);
    }

    public ICallRedirectRequestBuilder redirect(final java.util.List<InvitationParticipantInfo> targets, final Integer timeout, final String callbackUri) {
        return new CallRedirectRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.redirect"), getClient(), null, targets, timeout, callbackUri);
    }

    public ICallRejectRequestBuilder reject(final RejectReason reason, final String callbackUri) {
        return new CallRejectRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.reject"), getClient(), null, reason, callbackUri);
    }

    public ICallSubscribeToToneRequestBuilder subscribeToTone(final String clientContext) {
        return new CallSubscribeToToneRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.subscribeToTone"), getClient(), null, clientContext);
    }

    public ICallTransferRequestBuilder transfer(final InvitationParticipantInfo transferTarget) {
        return new CallTransferRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.transfer"), getClient(), null, transferTarget);
    }

    public ICallUnmuteRequestBuilder unmute(final String clientContext) {
        return new CallUnmuteRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unmute"), getClient(), null, clientContext);
    }

    public ICallUpdateRecordingStatusRequestBuilder updateRecordingStatus(final RecordingStatus status, final String clientContext) {
        return new CallUpdateRecordingStatusRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.updateRecordingStatus"), getClient(), null, status, clientContext);
    }
}

