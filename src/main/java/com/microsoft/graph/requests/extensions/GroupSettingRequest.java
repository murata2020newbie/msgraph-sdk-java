// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupSetting;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Setting Request.
 */
public class GroupSettingRequest extends BaseRequest<GroupSetting> {
	
    /**
     * The request for the GroupSetting
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupSettingRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupSetting.class);
    }

    /**
     * Gets the GroupSetting from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super GroupSetting> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the GroupSetting from the service
     *
     * @return the GroupSetting from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupSetting get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super GroupSetting> callback) {
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
     * Patches this GroupSetting with a source
     *
     * @param sourceGroupSetting the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final GroupSetting sourceGroupSetting, @Nonnull final ICallback<? super GroupSetting> callback) {
        send(HttpMethod.PATCH, callback, sourceGroupSetting);
    }

    /**
     * Patches this GroupSetting with a source
     *
     * @param sourceGroupSetting the source object with updates
     * @return the updated GroupSetting
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupSetting patch(@Nonnull final GroupSetting sourceGroupSetting) throws ClientException {
        return send(HttpMethod.PATCH, sourceGroupSetting);
    }

    /**
     * Creates a GroupSetting with a new object
     *
     * @param newGroupSetting the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final GroupSetting newGroupSetting, @Nonnull final ICallback<? super GroupSetting> callback) {
        send(HttpMethod.POST, callback, newGroupSetting);
    }

    /**
     * Creates a GroupSetting with a new object
     *
     * @param newGroupSetting the new object to create
     * @return the created GroupSetting
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupSetting post(@Nonnull final GroupSetting newGroupSetting) throws ClientException {
        return send(HttpMethod.POST, newGroupSetting);
    }

    /**
     * Creates a GroupSetting with a new object
     *
     * @param newGroupSetting the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final GroupSetting newGroupSetting, @Nonnull final ICallback<? super GroupSetting> callback) {
        send(HttpMethod.PUT, callback, newGroupSetting);
    }

    /**
     * Creates a GroupSetting with a new object
     *
     * @param newGroupSetting the object to create/update
     * @return the created GroupSetting
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupSetting put(@Nonnull final GroupSetting newGroupSetting) throws ClientException {
        return send(HttpMethod.PUT, newGroupSetting);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public GroupSettingRequest select(@Nonnull final String value) {
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
     public GroupSettingRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

