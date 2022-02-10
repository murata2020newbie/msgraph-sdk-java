// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.WorkforceIntegrationEncryption;
import com.microsoft.graph.models.WorkforceIntegrationSupportedEntities;
import com.microsoft.graph.models.ChangeTrackedEntity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workforce Integration.
 */
public class WorkforceIntegration extends ChangeTrackedEntity implements IJsonBackedObject {


    /**
     * The Api Version.
     * API version for the call back URL. Start with 1.
     */
    @SerializedName(value = "apiVersion", alternate = {"ApiVersion"})
    @Expose
	@Nullable
    public Integer apiVersion;

    /**
     * The Display Name.
     * Name of the workforce integration.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Encryption.
     * The workforce integration encryption resource.
     */
    @SerializedName(value = "encryption", alternate = {"Encryption"})
    @Expose
	@Nullable
    public WorkforceIntegrationEncryption encryption;

    /**
     * The Is Active.
     * Indicates whether this workforce integration is currently active and available.
     */
    @SerializedName(value = "isActive", alternate = {"IsActive"})
    @Expose
	@Nullable
    public Boolean isActive;

    /**
     * The Supported Entities.
     * The Shifts entities supported for synchronous change notifications. Shifts will make a call back to the url provided on client changes on those entities added here. By default, no entities are supported for change notifications. Possible values are: none, shift, swapRequest, userShiftPreferences, openshift, openShiftRequest, offerShiftRequest, unknownFutureValue.
     */
    @SerializedName(value = "supportedEntities", alternate = {"SupportedEntities"})
    @Expose
	@Nullable
    public EnumSet<WorkforceIntegrationSupportedEntities> supportedEntities;

    /**
     * The Url.
     * Workforce Integration URL for callbacks from the Shifts service.
     */
    @SerializedName(value = "url", alternate = {"Url"})
    @Expose
	@Nullable
    public String url;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
