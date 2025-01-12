// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.ResourceReference;
import com.microsoft.graph.models.ResourceVisualization;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Trending.
 */
public class Trending extends Entity implements IJsonBackedObject {


    /**
     * The Last Modified Date Time.
     * 
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Resource Reference.
     * Reference properties of the trending document, such as the url and type of the document.
     */
    @SerializedName(value = "resourceReference", alternate = {"ResourceReference"})
    @Expose
	@Nullable
    public ResourceReference resourceReference;

    /**
     * The Resource Visualization.
     * Properties that you can use to visualize the document in your experience.
     */
    @SerializedName(value = "resourceVisualization", alternate = {"ResourceVisualization"})
    @Expose
	@Nullable
    public ResourceVisualization resourceVisualization;

    /**
     * The Weight.
     * Value indicating how much the document is currently trending. The larger the number, the more the document is currently trending around the user (the more relevant it is). Returned documents are sorted by this value.
     */
    @SerializedName(value = "weight", alternate = {"Weight"})
    @Expose
	@Nullable
    public Double weight;

    /**
     * The Resource.
     * Used for navigating to the trending document.
     */
    @SerializedName(value = "resource", alternate = {"Resource"})
    @Expose
	@Nullable
    public Entity resource;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
