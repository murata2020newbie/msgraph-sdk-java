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
import com.microsoft.graph.models.AppListType;
import com.microsoft.graph.models.AppListItem;
import com.microsoft.graph.models.RequiredPasswordType;
import com.microsoft.graph.models.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSGeneral Device Configuration.
 */
public class MacOSGeneralDeviceConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Compliant App List Type.
     * List that is in the CompliantAppsList. Possible values are: none, appsInListCompliant, appsNotInListCompliant.
     */
    @SerializedName(value = "compliantAppListType", alternate = {"CompliantAppListType"})
    @Expose
	@Nullable
    public AppListType compliantAppListType;

    /**
     * The Compliant Apps List.
     * List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.
     */
    @SerializedName(value = "compliantAppsList", alternate = {"CompliantAppsList"})
    @Expose
	@Nullable
    public java.util.List<AppListItem> compliantAppsList;

    /**
     * The Email In Domain Suffixes.
     * An email address lacking a suffix that matches any of these strings will be considered out-of-domain.
     */
    @SerializedName(value = "emailInDomainSuffixes", alternate = {"EmailInDomainSuffixes"})
    @Expose
	@Nullable
    public java.util.List<String> emailInDomainSuffixes;

    /**
     * The Password Block Simple.
     * Block simple passwords.
     */
    @SerializedName(value = "passwordBlockSimple", alternate = {"PasswordBlockSimple"})
    @Expose
	@Nullable
    public Boolean passwordBlockSimple;

    /**
     * The Password Expiration Days.
     * Number of days before the password expires.
     */
    @SerializedName(value = "passwordExpirationDays", alternate = {"PasswordExpirationDays"})
    @Expose
	@Nullable
    public Integer passwordExpirationDays;

    /**
     * The Password Minimum Character Set Count.
     * Number of character sets a password must contain. Valid values 0 to 4
     */
    @SerializedName(value = "passwordMinimumCharacterSetCount", alternate = {"PasswordMinimumCharacterSetCount"})
    @Expose
	@Nullable
    public Integer passwordMinimumCharacterSetCount;

    /**
     * The Password Minimum Length.
     * Minimum length of passwords.
     */
    @SerializedName(value = "passwordMinimumLength", alternate = {"PasswordMinimumLength"})
    @Expose
	@Nullable
    public Integer passwordMinimumLength;

    /**
     * The Password Minutes Of Inactivity Before Lock.
     * Minutes of inactivity required before a password is required.
     */
    @SerializedName(value = "passwordMinutesOfInactivityBeforeLock", alternate = {"PasswordMinutesOfInactivityBeforeLock"})
    @Expose
	@Nullable
    public Integer passwordMinutesOfInactivityBeforeLock;

    /**
     * The Password Minutes Of Inactivity Before Screen Timeout.
     * Minutes of inactivity required before the screen times out.
     */
    @SerializedName(value = "passwordMinutesOfInactivityBeforeScreenTimeout", alternate = {"PasswordMinutesOfInactivityBeforeScreenTimeout"})
    @Expose
	@Nullable
    public Integer passwordMinutesOfInactivityBeforeScreenTimeout;

    /**
     * The Password Previous Password Block Count.
     * Number of previous passwords to block.
     */
    @SerializedName(value = "passwordPreviousPasswordBlockCount", alternate = {"PasswordPreviousPasswordBlockCount"})
    @Expose
	@Nullable
    public Integer passwordPreviousPasswordBlockCount;

    /**
     * The Password Required.
     * Whether or not to require a password.
     */
    @SerializedName(value = "passwordRequired", alternate = {"PasswordRequired"})
    @Expose
	@Nullable
    public Boolean passwordRequired;

    /**
     * The Password Required Type.
     * Type of password that is required. Possible values are: deviceDefault, alphanumeric, numeric.
     */
    @SerializedName(value = "passwordRequiredType", alternate = {"PasswordRequiredType"})
    @Expose
	@Nullable
    public RequiredPasswordType passwordRequiredType;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
