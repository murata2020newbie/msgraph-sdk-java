// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ManagedMobileApp;
import com.microsoft.graph.models.extensions.TargetedManagedAppPolicyAssignment;
import com.microsoft.graph.models.extensions.ManagedAppPolicyDeploymentSummary;
import com.microsoft.graph.models.extensions.ManagedAppConfiguration;
import com.microsoft.graph.requests.extensions.ManagedMobileAppCollectionPage;
import com.microsoft.graph.requests.extensions.TargetedManagedAppPolicyAssignmentCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Targeted Managed App Configuration.
 */
public class TargetedManagedAppConfiguration extends ManagedAppConfiguration implements IJsonBackedObject {


    /**
     * The Deployed App Count.
     * Count of apps to which the current policy is deployed.
     */
    @SerializedName("deployedAppCount")
    @Expose
    public Integer deployedAppCount;

    /**
     * The Is Assigned.
     * Indicates if the policy is deployed to any inclusion groups or not.
     */
    @SerializedName("isAssigned")
    @Expose
    public Boolean isAssigned;

    /**
     * The Apps.
     * List of apps to which the policy is deployed.
     */
    @SerializedName("apps")
    @Expose
    public ManagedMobileAppCollectionPage apps;

    /**
     * The Assignments.
     * Navigation property to list of inclusion and exclusion groups to which the policy is deployed.
     */
    @SerializedName("assignments")
    @Expose
    public TargetedManagedAppPolicyAssignmentCollectionPage assignments;

    /**
     * The Deployment Summary.
     * Navigation property to deployment summary of the configuration.
     */
    @SerializedName("deploymentSummary")
    @Expose
    public ManagedAppPolicyDeploymentSummary deploymentSummary;


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


        if (json.has("apps")) {
            apps = serializer.deserializeObject(json.get("apps").toString(), ManagedMobileAppCollectionPage.class);
        }

        if (json.has("assignments")) {
            assignments = serializer.deserializeObject(json.get("assignments").toString(), TargetedManagedAppPolicyAssignmentCollectionPage.class);
        }
    }
}
