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
 * The class for the Workbook Chart Fill Set Solid Color Parameter Set.
 */
public class WorkbookChartFillSetSolidColorParameterSet {
    /**
     * The color.
     * 
     */
    @SerializedName(value = "color", alternate = {"Color"})
    @Expose
	@Nullable
    public String color;


    /**
     * Instiaciates a new WorkbookChartFillSetSolidColorParameterSet
     */
    public WorkbookChartFillSetSolidColorParameterSet() {}
    /**
     * Instiaciates a new WorkbookChartFillSetSolidColorParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookChartFillSetSolidColorParameterSet(@Nonnull final WorkbookChartFillSetSolidColorParameterSetBuilder builder) {
        this.color = builder.color;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookChartFillSetSolidColorParameterSetBuilder newBuilder() {
        return new WorkbookChartFillSetSolidColorParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookChartFillSetSolidColorParameterSet
     */
    public static final class WorkbookChartFillSetSolidColorParameterSetBuilder {
        /**
         * The color parameter value
         */
        @Nullable
        protected String color;
        /**
         * Sets the Color
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookChartFillSetSolidColorParameterSetBuilder withColor(@Nullable final String val) {
            this.color = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookChartFillSetSolidColorParameterSetBuilder
         */
        @Nullable
        protected WorkbookChartFillSetSolidColorParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookChartFillSetSolidColorParameterSet build() {
            return new WorkbookChartFillSetSolidColorParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.color != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("color", color));
        }
        return result;
    }
}
