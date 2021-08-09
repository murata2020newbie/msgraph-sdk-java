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
import com.microsoft.graph.models.EducationAddedStudentAction;
import com.microsoft.graph.models.EducationAssignmentRecipient;
import com.microsoft.graph.models.IdentitySet;
import com.microsoft.graph.models.EducationAssignmentGradeType;
import com.microsoft.graph.models.EducationItemBody;
import com.microsoft.graph.models.EducationAssignmentStatus;
import com.microsoft.graph.models.EducationCategory;
import com.microsoft.graph.models.EducationAssignmentResource;
import com.microsoft.graph.models.EducationRubric;
import com.microsoft.graph.models.EducationSubmission;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.EducationCategoryCollectionPage;
import com.microsoft.graph.requests.EducationAssignmentResourceCollectionPage;
import com.microsoft.graph.requests.EducationSubmissionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Assignment.
 */
public class EducationAssignment extends Entity implements IJsonBackedObject {


    /**
     * The Added Student Action.
     * Optional field to control the assignment behavior for students who are added after the assignment is published. If not specified, defaults to none value. Currently supports only two values: none or assignIfOpen.
     */
    @SerializedName(value = "addedStudentAction", alternate = {"AddedStudentAction"})
    @Expose
	@Nullable
    public EducationAddedStudentAction addedStudentAction;

    /**
     * The Allow Late Submissions.
     * Identifies whether students can submit after the due date. If this property is not specified during create, it defaults to true.
     */
    @SerializedName(value = "allowLateSubmissions", alternate = {"AllowLateSubmissions"})
    @Expose
	@Nullable
    public Boolean allowLateSubmissions;

    /**
     * The Allow Students To Add Resources To Submission.
     * Identifies whether students can add their own resources to a submission or if they can only modify resources added by the teacher.
     */
    @SerializedName(value = "allowStudentsToAddResourcesToSubmission", alternate = {"AllowStudentsToAddResourcesToSubmission"})
    @Expose
	@Nullable
    public Boolean allowStudentsToAddResourcesToSubmission;

    /**
     * The Assign Date Time.
     * The date when the assignment should become active.  If in the future, the assignment is not shown to the student until this date.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "assignDateTime", alternate = {"AssignDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime assignDateTime;

    /**
     * The Assigned Date Time.
     * The moment that the assignment was published to students and the assignment shows up on the students timeline.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "assignedDateTime", alternate = {"AssignedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime assignedDateTime;

    /**
     * The Assign To.
     * Which users, or whole class should receive a submission object once the assignment is published.
     */
    @SerializedName(value = "assignTo", alternate = {"AssignTo"})
    @Expose
	@Nullable
    public EducationAssignmentRecipient assignTo;

    /**
     * The Class Id.
     * Class which this assignment belongs.
     */
    @SerializedName(value = "classId", alternate = {"ClassId"})
    @Expose
	@Nullable
    public String classId;

    /**
     * The Close Date Time.
     * Date when the assignment will be closed for submissions. This is an optional field that can be null if the assignment does not allowLateSubmissions or when the closeDateTime is the same as the dueDateTime. But if specified, then the closeDateTime must be greater than or equal to the dueDateTime. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "closeDateTime", alternate = {"CloseDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime closeDateTime;

    /**
     * The Created By.
     * Who created the assignment.
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
	@Nullable
    public IdentitySet createdBy;

    /**
     * The Created Date Time.
     * Moment when the assignment was created.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Display Name.
     * Name of the assignment.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Due Date Time.
     * Date when the students assignment is due.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "dueDateTime", alternate = {"DueDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime dueDateTime;

    /**
     * The Grading.
     * How the assignment will be graded.
     */
    @SerializedName(value = "grading", alternate = {"Grading"})
    @Expose
	@Nullable
    public EducationAssignmentGradeType grading;

    /**
     * The Instructions.
     * Instructions for the assignment.  This along with the display name tell the student what to do.
     */
    @SerializedName(value = "instructions", alternate = {"Instructions"})
    @Expose
	@Nullable
    public EducationItemBody instructions;

    /**
     * The Last Modified By.
     * Who last modified the assignment.
     */
    @SerializedName(value = "lastModifiedBy", alternate = {"LastModifiedBy"})
    @Expose
	@Nullable
    public IdentitySet lastModifiedBy;

    /**
     * The Last Modified Date Time.
     * Moment when the assignment was last modified.  The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Notification Channel Url.
     * Optional field to specify the URL of the channel to post the assignment publish notification. If not specified or null, defaults to the General channel. This field only applies to assignments where the assignTo value is educationAssignmentClassRecipient. Updating the notificationChannelUrl is not allowed after the assignment has been published.
     */
    @SerializedName(value = "notificationChannelUrl", alternate = {"NotificationChannelUrl"})
    @Expose
	@Nullable
    public String notificationChannelUrl;

    /**
     * The Resources Folder Url.
     * Folder URL where all the file resources for this assignment are stored.
     */
    @SerializedName(value = "resourcesFolderUrl", alternate = {"ResourcesFolderUrl"})
    @Expose
	@Nullable
    public String resourcesFolderUrl;

    /**
     * The Status.
     * Status of the Assignment.  You can not PATCH this value.  Possible values are: draft, scheduled, published, assigned.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public EducationAssignmentStatus status;

    /**
     * The Web Url.
     * The deep link URL for the given assignment.
     */
    @SerializedName(value = "webUrl", alternate = {"WebUrl"})
    @Expose
	@Nullable
    public String webUrl;

    /**
     * The Categories.
     * When set, enables users to easily find assignments of a given type.  Read-only. Nullable.
     */
    @SerializedName(value = "categories", alternate = {"Categories"})
    @Expose
	@Nullable
    public EducationCategoryCollectionPage categories;

    /**
     * The Resources.
     * Learning objects that are associated with this assignment.  Only teachers can modify this list. Nullable.
     */
    @SerializedName(value = "resources", alternate = {"Resources"})
    @Expose
	@Nullable
    public EducationAssignmentResourceCollectionPage resources;

    /**
     * The Rubric.
     * When set, the grading rubric attached to this assignment.
     */
    @SerializedName(value = "rubric", alternate = {"Rubric"})
    @Expose
	@Nullable
    public EducationRubric rubric;

    /**
     * The Submissions.
     * Once published, there is a submission object for each student representing their work and grade.  Read-only. Nullable.
     */
    @SerializedName(value = "submissions", alternate = {"Submissions"})
    @Expose
	@Nullable
    public EducationSubmissionCollectionPage submissions;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("categories")) {
            categories = serializer.deserializeObject(json.get("categories"), EducationCategoryCollectionPage.class);
        }

        if (json.has("resources")) {
            resources = serializer.deserializeObject(json.get("resources"), EducationAssignmentResourceCollectionPage.class);
        }

        if (json.has("submissions")) {
            submissions = serializer.deserializeObject(json.get("submissions"), EducationSubmissionCollectionPage.class);
        }
    }
}