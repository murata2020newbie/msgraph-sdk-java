// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ScheduleChangeRequestActor;
import com.microsoft.graph.models.generated.ScheduleChangeState;
import com.microsoft.graph.models.extensions.ChangeTrackedEntity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Schedule Change Request.
 */
public class ScheduleChangeRequest extends ChangeTrackedEntity implements IJsonBackedObject {


    /**
     * The Assigned To.
     * 
     */
    @SerializedName("assignedTo")
    @Expose
    public ScheduleChangeRequestActor assignedTo;

    /**
     * The Manager Action Date Time.
     * 
     */
    @SerializedName("managerActionDateTime")
    @Expose
    public java.util.Calendar managerActionDateTime;

    /**
     * The Manager Action Message.
     * 
     */
    @SerializedName("managerActionMessage")
    @Expose
    public String managerActionMessage;

    /**
     * The Manager User Id.
     * 
     */
    @SerializedName("managerUserId")
    @Expose
    public String managerUserId;

    /**
     * The Sender Date Time.
     * 
     */
    @SerializedName("senderDateTime")
    @Expose
    public java.util.Calendar senderDateTime;

    /**
     * The Sender Message.
     * 
     */
    @SerializedName("senderMessage")
    @Expose
    public String senderMessage;

    /**
     * The Sender User Id.
     * 
     */
    @SerializedName("senderUserId")
    @Expose
    public String senderUserId;

    /**
     * The State.
     * 
     */
    @SerializedName("state")
    @Expose
    public ScheduleChangeState state;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
