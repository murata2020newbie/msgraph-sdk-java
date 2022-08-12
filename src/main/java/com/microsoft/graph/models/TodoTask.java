// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.ItemBody;
import com.microsoft.graph.models.DateTimeTimeZone;
import com.microsoft.graph.models.Importance;
import com.microsoft.graph.models.PatternedRecurrence;
import com.microsoft.graph.models.TaskStatus;
import com.microsoft.graph.models.AttachmentBase;
import com.microsoft.graph.models.AttachmentSession;
import com.microsoft.graph.models.ChecklistItem;
import com.microsoft.graph.models.Extension;
import com.microsoft.graph.models.LinkedResource;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.AttachmentBaseCollectionPage;
import com.microsoft.graph.requests.AttachmentSessionCollectionPage;
import com.microsoft.graph.requests.ChecklistItemCollectionPage;
import com.microsoft.graph.requests.ExtensionCollectionPage;
import com.microsoft.graph.requests.LinkedResourceCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Todo Task.
 */
public class TodoTask extends Entity implements IJsonBackedObject {


    /**
     * The Body.
     * The task body that typically contains information about the task.
     */
    @SerializedName(value = "body", alternate = {"Body"})
    @Expose
	@Nullable
    public ItemBody body;

    /**
     * The Body Last Modified Date Time.
     * The date and time when the task body was last modified. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     */
    @SerializedName(value = "bodyLastModifiedDateTime", alternate = {"BodyLastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime bodyLastModifiedDateTime;

    /**
     * The Categories.
     * The categories associated with the task. Each category corresponds to the displayName property of an outlookCategory that the user has defined.
     */
    @SerializedName(value = "categories", alternate = {"Categories"})
    @Expose
	@Nullable
    public java.util.List<String> categories;

    /**
     * The Completed Date Time.
     * The date and time in the specified time zone that the task was finished.
     */
    @SerializedName(value = "completedDateTime", alternate = {"CompletedDateTime"})
    @Expose
	@Nullable
    public DateTimeTimeZone completedDateTime;

    /**
     * The Created Date Time.
     * The date and time when the task was created. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Due Date Time.
     * The date and time in the specified time zone that the task is to be finished.
     */
    @SerializedName(value = "dueDateTime", alternate = {"DueDateTime"})
    @Expose
	@Nullable
    public DateTimeTimeZone dueDateTime;

    /**
     * The Has Attachments.
     * Indicates whether the task has attachments.
     */
    @SerializedName(value = "hasAttachments", alternate = {"HasAttachments"})
    @Expose
	@Nullable
    public Boolean hasAttachments;

    /**
     * The Importance.
     * The importance of the task. Possible values are: low, normal, high.
     */
    @SerializedName(value = "importance", alternate = {"Importance"})
    @Expose
	@Nullable
    public Importance importance;

    /**
     * The Is Reminder On.
     * Set to true if an alert is set to remind the user of the task.
     */
    @SerializedName(value = "isReminderOn", alternate = {"IsReminderOn"})
    @Expose
	@Nullable
    public Boolean isReminderOn;

    /**
     * The Last Modified Date Time.
     * The date and time when the task was last modified. By default, it is in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Recurrence.
     * The recurrence pattern for the task.
     */
    @SerializedName(value = "recurrence", alternate = {"Recurrence"})
    @Expose
	@Nullable
    public PatternedRecurrence recurrence;

    /**
     * The Reminder Date Time.
     * The date and time in the specified time zone for a reminder alert of the task to occur.
     */
    @SerializedName(value = "reminderDateTime", alternate = {"ReminderDateTime"})
    @Expose
	@Nullable
    public DateTimeTimeZone reminderDateTime;

    /**
     * The Start Date Time.
     * The date and time in the specified time zone at which the task is scheduled to start.
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public DateTimeTimeZone startDateTime;

    /**
     * The Status.
     * Indicates the state or progress of the task. Possible values are: notStarted, inProgress, completed, waitingOnOthers, deferred.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public TaskStatus status;

    /**
     * The Title.
     * A brief description of the task.
     */
    @SerializedName(value = "title", alternate = {"Title"})
    @Expose
	@Nullable
    public String title;

    /**
     * The Attachments.
     * A collection of file attachments for the task.
     */
    @SerializedName(value = "attachments", alternate = {"Attachments"})
    @Expose
	@Nullable
    public AttachmentBaseCollectionPage attachments;

    /**
     * The Attachment Sessions.
     * 
     */
    @SerializedName(value = "attachmentSessions", alternate = {"AttachmentSessions"})
    @Expose
	@Nullable
    public AttachmentSessionCollectionPage attachmentSessions;

    /**
     * The Checklist Items.
     * A collection of smaller subtasks linked to the more complex parent task.
     */
    @SerializedName(value = "checklistItems", alternate = {"ChecklistItems"})
    @Expose
	@Nullable
    public ChecklistItemCollectionPage checklistItems;

    /**
     * The Extensions.
     * The collection of open extensions defined for the task. Nullable.
     */
    @SerializedName(value = "extensions", alternate = {"Extensions"})
    @Expose
	@Nullable
    public ExtensionCollectionPage extensions;

    /**
     * The Linked Resources.
     * A collection of resources linked to the task.
     */
    @SerializedName(value = "linkedResources", alternate = {"LinkedResources"})
    @Expose
	@Nullable
    public LinkedResourceCollectionPage linkedResources;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("attachments")) {
            attachments = serializer.deserializeObject(json.get("attachments"), AttachmentBaseCollectionPage.class);
        }

        if (json.has("attachmentSessions")) {
            attachmentSessions = serializer.deserializeObject(json.get("attachmentSessions"), AttachmentSessionCollectionPage.class);
        }

        if (json.has("checklistItems")) {
            checklistItems = serializer.deserializeObject(json.get("checklistItems"), ChecklistItemCollectionPage.class);
        }

        if (json.has("extensions")) {
            extensions = serializer.deserializeObject(json.get("extensions"), ExtensionCollectionPage.class);
        }

        if (json.has("linkedResources")) {
            linkedResources = serializer.deserializeObject(json.get("linkedResources"), LinkedResourceCollectionPage.class);
        }
    }
}
