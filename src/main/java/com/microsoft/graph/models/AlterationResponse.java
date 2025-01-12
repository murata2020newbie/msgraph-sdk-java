// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.SearchAlteration;
import com.microsoft.graph.models.SearchAlterationType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Alteration Response.
 */
public class AlterationResponse implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Original Query String.
     * Defines the original user query string.
     */
    @SerializedName(value = "originalQueryString", alternate = {"OriginalQueryString"})
    @Expose
	@Nullable
    public String originalQueryString;

    /**
     * The Query Alteration.
     * Defines the details of the alteration information for the spelling correction.
     */
    @SerializedName(value = "queryAlteration", alternate = {"QueryAlteration"})
    @Expose
	@Nullable
    public SearchAlteration queryAlteration;

    /**
     * The Query Alteration Type.
     * Defines the type of the spelling correction. Possible values are: suggestion, modification.
     */
    @SerializedName(value = "queryAlterationType", alternate = {"QueryAlterationType"})
    @Expose
	@Nullable
    public SearchAlterationType queryAlterationType;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
