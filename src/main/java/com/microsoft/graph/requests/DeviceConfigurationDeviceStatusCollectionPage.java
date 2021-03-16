// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.DeviceConfigurationDeviceStatus;
import com.microsoft.graph.requests.DeviceConfigurationDeviceStatusCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.DeviceConfigurationDeviceStatusCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Device Status Collection Page.
 */
public class DeviceConfigurationDeviceStatusCollectionPage extends BaseCollectionPage<DeviceConfigurationDeviceStatus, DeviceConfigurationDeviceStatusCollectionRequestBuilder> {

    /**
     * A collection page for DeviceConfigurationDeviceStatus
     *
     * @param response the serialized DeviceConfigurationDeviceStatusCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceConfigurationDeviceStatusCollectionPage(@Nonnull final DeviceConfigurationDeviceStatusCollectionResponse response, @Nonnull final DeviceConfigurationDeviceStatusCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DeviceConfigurationDeviceStatus
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceConfigurationDeviceStatusCollectionPage(@Nonnull final java.util.List<DeviceConfigurationDeviceStatus> pageContents, @Nullable final DeviceConfigurationDeviceStatusCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}