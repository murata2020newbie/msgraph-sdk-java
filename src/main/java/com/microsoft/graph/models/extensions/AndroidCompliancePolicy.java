// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.DeviceThreatProtectionLevel;
import com.microsoft.graph.models.generated.AndroidRequiredPasswordType;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicy;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Compliance Policy.
 */
public class AndroidCompliancePolicy extends DeviceCompliancePolicy implements IJsonBackedObject {


    /**
     * The Device Threat Protection Enabled.
     * Require that devices have enabled device threat protection.
     */
    @SerializedName("deviceThreatProtectionEnabled")
    @Expose
    public Boolean deviceThreatProtectionEnabled;

    /**
     * The Device Threat Protection Required Security Level.
     * Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured, low, medium, high, notSet.
     */
    @SerializedName("deviceThreatProtectionRequiredSecurityLevel")
    @Expose
    public DeviceThreatProtectionLevel deviceThreatProtectionRequiredSecurityLevel;

    /**
     * The Min Android Security Patch Level.
     * Minimum Android security patch level.
     */
    @SerializedName("minAndroidSecurityPatchLevel")
    @Expose
    public String minAndroidSecurityPatchLevel;

    /**
     * The Os Maximum Version.
     * Maximum Android version.
     */
    @SerializedName("osMaximumVersion")
    @Expose
    public String osMaximumVersion;

    /**
     * The Os Minimum Version.
     * Minimum Android version.
     */
    @SerializedName("osMinimumVersion")
    @Expose
    public String osMinimumVersion;

    /**
     * The Password Expiration Days.
     * Number of days before the password expires. Valid values 1 to 365
     */
    @SerializedName("passwordExpirationDays")
    @Expose
    public Integer passwordExpirationDays;

    /**
     * The Password Minimum Length.
     * Minimum password length. Valid values 4 to 16
     */
    @SerializedName("passwordMinimumLength")
    @Expose
    public Integer passwordMinimumLength;

    /**
     * The Password Minutes Of Inactivity Before Lock.
     * Minutes of inactivity before a password is required.
     */
    @SerializedName("passwordMinutesOfInactivityBeforeLock")
    @Expose
    public Integer passwordMinutesOfInactivityBeforeLock;

    /**
     * The Password Previous Password Block Count.
     * Number of previous passwords to block. Valid values 1 to 24
     */
    @SerializedName("passwordPreviousPasswordBlockCount")
    @Expose
    public Integer passwordPreviousPasswordBlockCount;

    /**
     * The Password Required.
     * Require a password to unlock device.
     */
    @SerializedName("passwordRequired")
    @Expose
    public Boolean passwordRequired;

    /**
     * The Password Required Type.
     * Type of characters in password. Possible values are: deviceDefault, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, numeric, numericComplex, any.
     */
    @SerializedName("passwordRequiredType")
    @Expose
    public AndroidRequiredPasswordType passwordRequiredType;

    /**
     * The Security Block Jailbroken Devices.
     * Devices must not be jailbroken or rooted.
     */
    @SerializedName("securityBlockJailbrokenDevices")
    @Expose
    public Boolean securityBlockJailbrokenDevices;

    /**
     * The Security Disable Usb Debugging.
     * Disable USB debugging on Android devices.
     */
    @SerializedName("securityDisableUsbDebugging")
    @Expose
    public Boolean securityDisableUsbDebugging;

    /**
     * The Security Prevent Install Apps From Unknown Sources.
     * Require that devices disallow installation of apps from unknown sources.
     */
    @SerializedName("securityPreventInstallAppsFromUnknownSources")
    @Expose
    public Boolean securityPreventInstallAppsFromUnknownSources;

    /**
     * The Security Require Company Portal App Integrity.
     * Require the device to pass the Company Portal client app runtime integrity check.
     */
    @SerializedName("securityRequireCompanyPortalAppIntegrity")
    @Expose
    public Boolean securityRequireCompanyPortalAppIntegrity;

    /**
     * The Security Require Google Play Services.
     * Require Google Play Services to be installed and enabled on the device.
     */
    @SerializedName("securityRequireGooglePlayServices")
    @Expose
    public Boolean securityRequireGooglePlayServices;

    /**
     * The Security Require Safety Net Attestation Basic Integrity.
     * Require the device to pass the SafetyNet basic integrity check.
     */
    @SerializedName("securityRequireSafetyNetAttestationBasicIntegrity")
    @Expose
    public Boolean securityRequireSafetyNetAttestationBasicIntegrity;

    /**
     * The Security Require Safety Net Attestation Certified Device.
     * Require the device to pass the SafetyNet certified device check.
     */
    @SerializedName("securityRequireSafetyNetAttestationCertifiedDevice")
    @Expose
    public Boolean securityRequireSafetyNetAttestationCertifiedDevice;

    /**
     * The Security Require Up To Date Security Providers.
     * Require the device to have up to date security providers. The device will require Google Play Services to be enabled and up to date.
     */
    @SerializedName("securityRequireUpToDateSecurityProviders")
    @Expose
    public Boolean securityRequireUpToDateSecurityProviders;

    /**
     * The Security Require Verify Apps.
     * Require the Android Verify apps feature is turned on.
     */
    @SerializedName("securityRequireVerifyApps")
    @Expose
    public Boolean securityRequireVerifyApps;

    /**
     * The Storage Require Encryption.
     * Require encryption on Android devices.
     */
    @SerializedName("storageRequireEncryption")
    @Expose
    public Boolean storageRequireEncryption;


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
