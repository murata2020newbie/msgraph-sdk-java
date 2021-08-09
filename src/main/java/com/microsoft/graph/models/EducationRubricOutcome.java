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
import com.microsoft.graph.models.RubricQualityFeedbackModel;
import com.microsoft.graph.models.RubricQualitySelectedColumnModel;
import com.microsoft.graph.models.EducationOutcome;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Rubric Outcome.
 */
public class EducationRubricOutcome extends EducationOutcome implements IJsonBackedObject {


    /**
     * The Published Rubric Quality Feedback.
     * A copy of the rubricQualityFeedback property that is made when the grade is released to the student.
     */
    @SerializedName(value = "publishedRubricQualityFeedback", alternate = {"PublishedRubricQualityFeedback"})
    @Expose
	@Nullable
    public java.util.List<RubricQualityFeedbackModel> publishedRubricQualityFeedback;

    /**
     * The Published Rubric Quality Selected Levels.
     * A copy of the rubricQualitySelectedLevels property that is made when the grade is released to the student.
     */
    @SerializedName(value = "publishedRubricQualitySelectedLevels", alternate = {"PublishedRubricQualitySelectedLevels"})
    @Expose
	@Nullable
    public java.util.List<RubricQualitySelectedColumnModel> publishedRubricQualitySelectedLevels;

    /**
     * The Rubric Quality Feedback.
     * A collection of specific feedback for each quality of this rubric.
     */
    @SerializedName(value = "rubricQualityFeedback", alternate = {"RubricQualityFeedback"})
    @Expose
	@Nullable
    public java.util.List<RubricQualityFeedbackModel> rubricQualityFeedback;

    /**
     * The Rubric Quality Selected Levels.
     * The level that the teacher has selected for each quality while grading this assignment.
     */
    @SerializedName(value = "rubricQualitySelectedLevels", alternate = {"RubricQualitySelectedLevels"})
    @Expose
	@Nullable
    public java.util.List<RubricQualitySelectedColumnModel> rubricQualitySelectedLevels;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}