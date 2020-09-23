// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.OnlineMeetingProviderType;
import com.microsoft.graph.models.generated.CalendarColor;
import com.microsoft.graph.models.extensions.EmailAddress;
import com.microsoft.graph.models.extensions.CalendarPermission;
import com.microsoft.graph.models.extensions.Event;
import com.microsoft.graph.models.extensions.MultiValueLegacyExtendedProperty;
import com.microsoft.graph.models.extensions.SingleValueLegacyExtendedProperty;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.CalendarPermissionCollectionPage;
import com.microsoft.graph.requests.extensions.EventCollectionPage;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar.
 */
public class Calendar extends Entity implements IJsonBackedObject {


    /**
     * The Allowed Online Meeting Providers.
     * Represent the online meeting service providers that can be used to create online meetings in this calendar. Possible values are: unknown, skypeForBusiness, skypeForConsumer, teamsForBusiness.
     */
    @SerializedName("allowedOnlineMeetingProviders")
    @Expose
    public java.util.List<OnlineMeetingProviderType> allowedOnlineMeetingProviders;

    /**
     * The Can Edit.
     * True if the user can write to the calendar, false otherwise. This property is true for the user who created the calendar. This property is also true for a user who has been shared a calendar and granted write access.
     */
    @SerializedName("canEdit")
    @Expose
    public Boolean canEdit;

    /**
     * The Can Share.
     * True if the user has the permission to share the calendar, false otherwise. Only the user who created the calendar can share it.
     */
    @SerializedName("canShare")
    @Expose
    public Boolean canShare;

    /**
     * The Can View Private Items.
     * True if the user can read calendar items that have been marked private, false otherwise.
     */
    @SerializedName("canViewPrivateItems")
    @Expose
    public Boolean canViewPrivateItems;

    /**
     * The Change Key.
     * Identifies the version of the calendar object. Every time the calendar is changed, changeKey changes as well. This allows Exchange to apply changes to the correct version of the object. Read-only.
     */
    @SerializedName("changeKey")
    @Expose
    public String changeKey;

    /**
     * The Color.
     * Specifies the color theme to distinguish the calendar from other calendars in a UI. The property values are: LightBlue=0, LightGreen=1, LightOrange=2, LightGray=3, LightYellow=4, LightTeal=5, LightPink=6, LightBrown=7, LightRed=8, MaxColor=9, Auto=-1
     */
    @SerializedName("color")
    @Expose
    public CalendarColor color;

    /**
     * The Default Online Meeting Provider.
     * The default online meeting provider for meetings sent from this calendar. Possible values are: unknown, skypeForBusiness, skypeForConsumer, teamsForBusiness.
     */
    @SerializedName("defaultOnlineMeetingProvider")
    @Expose
    public OnlineMeetingProviderType defaultOnlineMeetingProvider;

    /**
     * The Is Removable.
     * Indicates whether this user calendar can be deleted from the user mailbox.
     */
    @SerializedName("isRemovable")
    @Expose
    public Boolean isRemovable;

    /**
     * The Is Tallying Responses.
     * Indicates whether this user calendar supports tracking of meeting responses. Only meeting invites sent from users' primary calendars support tracking of meeting responses.
     */
    @SerializedName("isTallyingResponses")
    @Expose
    public Boolean isTallyingResponses;

    /**
     * The Name.
     * The calendar name.
     */
    @SerializedName("name")
    @Expose
    public String name;

    /**
     * The Owner.
     * If set, this represents the user who created or added the calendar. For a calendar that the user created or added, the owner property is set to the user. For a calendar shared with the user, the owner property is set to the person who shared that calendar with the user.
     */
    @SerializedName("owner")
    @Expose
    public EmailAddress owner;

    /**
     * The Calendar Permissions.
     * The permissions of the users with whom the calendar is shared.
     */
    @SerializedName("calendarPermissions")
    @Expose
    public CalendarPermissionCollectionPage calendarPermissions;

    /**
     * The Calendar View.
     * The calendar view for the calendar. Navigation property. Read-only.
     */
    @SerializedName("calendarView")
    @Expose
    public EventCollectionPage calendarView;

    /**
     * The Events.
     * The events in the calendar. Navigation property. Read-only.
     */
    @SerializedName("events")
    @Expose
    public EventCollectionPage events;

    /**
     * The Multi Value Extended Properties.
     * The collection of multi-value extended properties defined for the calendar. Read-only. Nullable.
     */
    @SerializedName("multiValueExtendedProperties")
    @Expose
    public MultiValueLegacyExtendedPropertyCollectionPage multiValueExtendedProperties;

    /**
     * The Single Value Extended Properties.
     * The collection of single-value extended properties defined for the calendar. Read-only. Nullable.
     */
    @SerializedName("singleValueExtendedProperties")
    @Expose
    public SingleValueLegacyExtendedPropertyCollectionPage singleValueExtendedProperties;


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


        if (json.has("calendarPermissions")) {
            calendarPermissions = serializer.deserializeObject(json.get("calendarPermissions").toString(), CalendarPermissionCollectionPage.class);
        }

        if (json.has("calendarView")) {
            calendarView = serializer.deserializeObject(json.get("calendarView").toString(), EventCollectionPage.class);
        }

        if (json.has("events")) {
            events = serializer.deserializeObject(json.get("events").toString(), EventCollectionPage.class);
        }

        if (json.has("multiValueExtendedProperties")) {
            multiValueExtendedProperties = serializer.deserializeObject(json.get("multiValueExtendedProperties").toString(), MultiValueLegacyExtendedPropertyCollectionPage.class);
        }

        if (json.has("singleValueExtendedProperties")) {
            singleValueExtendedProperties = serializer.deserializeObject(json.get("singleValueExtendedProperties").toString(), SingleValueLegacyExtendedPropertyCollectionPage.class);
        }
    }
}
