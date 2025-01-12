// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Channel Does User Have Access Parameter Set.
 */
public class ChannelDoesUserHaveAccessParameterSet {
    /**
     * The user Id.
     * 
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
	@Nullable
    public String userId;

    /**
     * The tenant Id.
     * 
     */
    @SerializedName(value = "tenantId", alternate = {"TenantId"})
    @Expose
	@Nullable
    public String tenantId;

    /**
     * The user Principal Name.
     * 
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
	@Nullable
    public String userPrincipalName;


    /**
     * Instiaciates a new ChannelDoesUserHaveAccessParameterSet
     */
    public ChannelDoesUserHaveAccessParameterSet() {}
    /**
     * Instiaciates a new ChannelDoesUserHaveAccessParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ChannelDoesUserHaveAccessParameterSet(@Nonnull final ChannelDoesUserHaveAccessParameterSetBuilder builder) {
        this.userId = builder.userId;
        this.tenantId = builder.tenantId;
        this.userPrincipalName = builder.userPrincipalName;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ChannelDoesUserHaveAccessParameterSetBuilder newBuilder() {
        return new ChannelDoesUserHaveAccessParameterSetBuilder();
    }
    /**
     * Fluent builder for the ChannelDoesUserHaveAccessParameterSet
     */
    public static final class ChannelDoesUserHaveAccessParameterSetBuilder {
        /**
         * The userId parameter value
         */
        @Nullable
        protected String userId;
        /**
         * Sets the UserId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ChannelDoesUserHaveAccessParameterSetBuilder withUserId(@Nullable final String val) {
            this.userId = val;
            return this;
        }
        /**
         * The tenantId parameter value
         */
        @Nullable
        protected String tenantId;
        /**
         * Sets the TenantId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ChannelDoesUserHaveAccessParameterSetBuilder withTenantId(@Nullable final String val) {
            this.tenantId = val;
            return this;
        }
        /**
         * The userPrincipalName parameter value
         */
        @Nullable
        protected String userPrincipalName;
        /**
         * Sets the UserPrincipalName
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ChannelDoesUserHaveAccessParameterSetBuilder withUserPrincipalName(@Nullable final String val) {
            this.userPrincipalName = val;
            return this;
        }
        /**
         * Instanciates a new ChannelDoesUserHaveAccessParameterSetBuilder
         */
        @Nullable
        protected ChannelDoesUserHaveAccessParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ChannelDoesUserHaveAccessParameterSet build() {
            return new ChannelDoesUserHaveAccessParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.userId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("userId", userId));
        }
        if(this.tenantId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("tenantId", tenantId));
        }
        if(this.userPrincipalName != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("userPrincipalName", userPrincipalName));
        }
        return result;
    }
}
