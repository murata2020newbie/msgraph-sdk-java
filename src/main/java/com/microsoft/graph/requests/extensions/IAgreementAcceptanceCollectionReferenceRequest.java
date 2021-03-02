// Template Source: IBaseEntityCollectionReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.AgreementAcceptance;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.AgreementAcceptance;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Agreement Acceptance Collection Reference Request.
 */
public interface IAgreementAcceptanceCollectionReferenceRequest {

    void post(final AgreementAcceptance newAgreementAcceptance, final ICallback<? super AgreementAcceptance> callback);

    AgreementAcceptance post(final AgreementAcceptance newAgreementAcceptance) throws ClientException;

    IAgreementAcceptanceCollectionReferenceRequest select(final String value);

    IAgreementAcceptanceCollectionReferenceRequest top(final int value);

}