// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionAppLockerFile;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection App Locker File Request.
 */
public class WindowsInformationProtectionAppLockerFileRequest extends BaseRequest<WindowsInformationProtectionAppLockerFile> {
	
    /**
     * The request for the WindowsInformationProtectionAppLockerFile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsInformationProtectionAppLockerFileRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsInformationProtectionAppLockerFile.class);
    }

    /**
     * Gets the WindowsInformationProtectionAppLockerFile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super WindowsInformationProtectionAppLockerFile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsInformationProtectionAppLockerFile from the service
     *
     * @return the WindowsInformationProtectionAppLockerFile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsInformationProtectionAppLockerFile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super WindowsInformationProtectionAppLockerFile> callback) {
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
     * Patches this WindowsInformationProtectionAppLockerFile with a source
     *
     * @param sourceWindowsInformationProtectionAppLockerFile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final WindowsInformationProtectionAppLockerFile sourceWindowsInformationProtectionAppLockerFile, @Nonnull final ICallback<? super WindowsInformationProtectionAppLockerFile> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsInformationProtectionAppLockerFile);
    }

    /**
     * Patches this WindowsInformationProtectionAppLockerFile with a source
     *
     * @param sourceWindowsInformationProtectionAppLockerFile the source object with updates
     * @return the updated WindowsInformationProtectionAppLockerFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsInformationProtectionAppLockerFile patch(@Nonnull final WindowsInformationProtectionAppLockerFile sourceWindowsInformationProtectionAppLockerFile) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsInformationProtectionAppLockerFile);
    }

    /**
     * Creates a WindowsInformationProtectionAppLockerFile with a new object
     *
     * @param newWindowsInformationProtectionAppLockerFile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final WindowsInformationProtectionAppLockerFile newWindowsInformationProtectionAppLockerFile, @Nonnull final ICallback<? super WindowsInformationProtectionAppLockerFile> callback) {
        send(HttpMethod.POST, callback, newWindowsInformationProtectionAppLockerFile);
    }

    /**
     * Creates a WindowsInformationProtectionAppLockerFile with a new object
     *
     * @param newWindowsInformationProtectionAppLockerFile the new object to create
     * @return the created WindowsInformationProtectionAppLockerFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsInformationProtectionAppLockerFile post(@Nonnull final WindowsInformationProtectionAppLockerFile newWindowsInformationProtectionAppLockerFile) throws ClientException {
        return send(HttpMethod.POST, newWindowsInformationProtectionAppLockerFile);
    }

    /**
     * Creates a WindowsInformationProtectionAppLockerFile with a new object
     *
     * @param newWindowsInformationProtectionAppLockerFile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final WindowsInformationProtectionAppLockerFile newWindowsInformationProtectionAppLockerFile, @Nonnull final ICallback<? super WindowsInformationProtectionAppLockerFile> callback) {
        send(HttpMethod.PUT, callback, newWindowsInformationProtectionAppLockerFile);
    }

    /**
     * Creates a WindowsInformationProtectionAppLockerFile with a new object
     *
     * @param newWindowsInformationProtectionAppLockerFile the object to create/update
     * @return the created WindowsInformationProtectionAppLockerFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsInformationProtectionAppLockerFile put(@Nonnull final WindowsInformationProtectionAppLockerFile newWindowsInformationProtectionAppLockerFile) throws ClientException {
        return send(HttpMethod.PUT, newWindowsInformationProtectionAppLockerFile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WindowsInformationProtectionAppLockerFileRequest select(@Nonnull final String value) {
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
     public WindowsInformationProtectionAppLockerFileRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

