// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Graph Service Client.
 */
public class BaseGraphServiceClient extends BaseClient implements IBaseGraphServiceClient {

    /**
     * The default endpoint for the Microsoft Graph Service
     */
    public static final String DEFAULT_GRAPH_ENDPOINT = "https://graph.microsoft.com/v1.0";

    /**
     * The current endpoint
     */
    private String endpoint;

    @Override
    public String getServiceRoot() {
        if (endpoint == null) {
            endpoint = DEFAULT_GRAPH_ENDPOINT;
        }
        return endpoint;
    }

    @Override
    public void setServiceRoot(String value) {
        endpoint = value;
    }

    /**
     * Gets the collection of DirectoryObjects objects.
     *
     * @return The request builder for the collection of DirectoryObjects objects
     */
    public IDirectoryObjectCollectionRequestBuilder directoryObjects() {
        return new DirectoryObjectCollectionRequestBuilder(getServiceRoot() + "/directoryObjects", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single DirectoryObjects.
     *
     * @param id The id of the DirectoryObjects to retrieve.
     * @return The request builder for the DirectoryObjects object
     */
    public IDirectoryObjectRequestBuilder directoryObjects(final String id) {
        return new DirectoryObjectRequestBuilder(getServiceRoot() + "/directoryObjects/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Devices objects.
     *
     * @return The request builder for the collection of Devices objects
     */
    public IDeviceCollectionRequestBuilder devices() {
        return new DeviceCollectionRequestBuilder(getServiceRoot() + "/devices", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Devices.
     *
     * @param id The id of the Devices to retrieve.
     * @return The request builder for the Devices object
     */
    public IDeviceRequestBuilder devices(final String id) {
        return new DeviceRequestBuilder(getServiceRoot() + "/devices/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Domains objects.
     *
     * @return The request builder for the collection of Domains objects
     */
    public IDomainCollectionRequestBuilder domains() {
        return new DomainCollectionRequestBuilder(getServiceRoot() + "/domains", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Domains.
     *
     * @param id The id of the Domains to retrieve.
     * @return The request builder for the Domains object
     */
    public IDomainRequestBuilder domains(final String id) {
        return new DomainRequestBuilder(getServiceRoot() + "/domains/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of DomainDnsRecords objects.
     *
     * @return The request builder for the collection of DomainDnsRecords objects
     */
    public IDomainDnsRecordCollectionRequestBuilder domainDnsRecords() {
        return new DomainDnsRecordCollectionRequestBuilder(getServiceRoot() + "/domainDnsRecords", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single DomainDnsRecords.
     *
     * @param id The id of the DomainDnsRecords to retrieve.
     * @return The request builder for the DomainDnsRecords object
     */
    public IDomainDnsRecordRequestBuilder domainDnsRecords(final String id) {
        return new DomainDnsRecordRequestBuilder(getServiceRoot() + "/domainDnsRecords/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Groups objects.
     *
     * @return The request builder for the collection of Groups objects
     */
    public IGroupCollectionRequestBuilder groups() {
        return new GroupCollectionRequestBuilder(getServiceRoot() + "/groups", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Groups.
     *
     * @param id The id of the Groups to retrieve.
     * @return The request builder for the Groups object
     */
    public IGroupRequestBuilder groups(final String id) {
        return new GroupRequestBuilder(getServiceRoot() + "/groups/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of DirectoryRoles objects.
     *
     * @return The request builder for the collection of DirectoryRoles objects
     */
    public IDirectoryRoleCollectionRequestBuilder directoryRoles() {
        return new DirectoryRoleCollectionRequestBuilder(getServiceRoot() + "/directoryRoles", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single DirectoryRoles.
     *
     * @param id The id of the DirectoryRoles to retrieve.
     * @return The request builder for the DirectoryRoles object
     */
    public IDirectoryRoleRequestBuilder directoryRoles(final String id) {
        return new DirectoryRoleRequestBuilder(getServiceRoot() + "/directoryRoles/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of DirectoryRoleTemplates objects.
     *
     * @return The request builder for the collection of DirectoryRoleTemplates objects
     */
    public IDirectoryRoleTemplateCollectionRequestBuilder directoryRoleTemplates() {
        return new DirectoryRoleTemplateCollectionRequestBuilder(getServiceRoot() + "/directoryRoleTemplates", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single DirectoryRoleTemplates.
     *
     * @param id The id of the DirectoryRoleTemplates to retrieve.
     * @return The request builder for the DirectoryRoleTemplates object
     */
    public IDirectoryRoleTemplateRequestBuilder directoryRoleTemplates(final String id) {
        return new DirectoryRoleTemplateRequestBuilder(getServiceRoot() + "/directoryRoleTemplates/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Organization objects.
     *
     * @return The request builder for the collection of Organization objects
     */
    public IOrganizationCollectionRequestBuilder organization() {
        return new OrganizationCollectionRequestBuilder(getServiceRoot() + "/organization", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Organization.
     *
     * @param id The id of the Organization to retrieve.
     * @return The request builder for the Organization object
     */
    public IOrganizationRequestBuilder organization(final String id) {
        return new OrganizationRequestBuilder(getServiceRoot() + "/organization/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of GroupSettings objects.
     *
     * @return The request builder for the collection of GroupSettings objects
     */
    public IGroupSettingCollectionRequestBuilder groupSettings() {
        return new GroupSettingCollectionRequestBuilder(getServiceRoot() + "/groupSettings", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single GroupSettings.
     *
     * @param id The id of the GroupSettings to retrieve.
     * @return The request builder for the GroupSettings object
     */
    public IGroupSettingRequestBuilder groupSettings(final String id) {
        return new GroupSettingRequestBuilder(getServiceRoot() + "/groupSettings/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of GroupSettingTemplates objects.
     *
     * @return The request builder for the collection of GroupSettingTemplates objects
     */
    public IGroupSettingTemplateCollectionRequestBuilder groupSettingTemplates() {
        return new GroupSettingTemplateCollectionRequestBuilder(getServiceRoot() + "/groupSettingTemplates", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single GroupSettingTemplates.
     *
     * @param id The id of the GroupSettingTemplates to retrieve.
     * @return The request builder for the GroupSettingTemplates object
     */
    public IGroupSettingTemplateRequestBuilder groupSettingTemplates(final String id) {
        return new GroupSettingTemplateRequestBuilder(getServiceRoot() + "/groupSettingTemplates/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of SubscribedSkus objects.
     *
     * @return The request builder for the collection of SubscribedSkus objects
     */
    public ISubscribedSkuCollectionRequestBuilder subscribedSkus() {
        return new SubscribedSkuCollectionRequestBuilder(getServiceRoot() + "/subscribedSkus", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single SubscribedSkus.
     *
     * @param id The id of the SubscribedSkus to retrieve.
     * @return The request builder for the SubscribedSkus object
     */
    public ISubscribedSkuRequestBuilder subscribedSkus(final String id) {
        return new SubscribedSkuRequestBuilder(getServiceRoot() + "/subscribedSkus/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Users objects.
     *
     * @return The request builder for the collection of Users objects
     */
    public IUserCollectionRequestBuilder users() {
        return new UserCollectionRequestBuilder(getServiceRoot() + "/users", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Users.
     *
     * @param id The id of the Users to retrieve.
     * @return The request builder for the Users object
     */
    public IUserRequestBuilder users(final String id) {
        return new UserRequestBuilder(getServiceRoot() + "/users/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Contracts objects.
     *
     * @return The request builder for the collection of Contracts objects
     */
    public IContractCollectionRequestBuilder contracts() {
        return new ContractCollectionRequestBuilder(getServiceRoot() + "/contracts", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Contracts.
     *
     * @param id The id of the Contracts to retrieve.
     * @return The request builder for the Contracts object
     */
    public IContractRequestBuilder contracts(final String id) {
        return new ContractRequestBuilder(getServiceRoot() + "/contracts/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of SchemaExtensions objects.
     *
     * @return The request builder for the collection of SchemaExtensions objects
     */
    public ISchemaExtensionCollectionRequestBuilder schemaExtensions() {
        return new SchemaExtensionCollectionRequestBuilder(getServiceRoot() + "/schemaExtensions", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single SchemaExtensions.
     *
     * @param id The id of the SchemaExtensions to retrieve.
     * @return The request builder for the SchemaExtensions object
     */
    public ISchemaExtensionRequestBuilder schemaExtensions(final String id) {
        return new SchemaExtensionRequestBuilder(getServiceRoot() + "/schemaExtensions/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Drives objects.
     *
     * @return The request builder for the collection of Drives objects
     */
    public IDriveCollectionRequestBuilder drives() {
        return new DriveCollectionRequestBuilder(getServiceRoot() + "/drives", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Drives.
     *
     * @param id The id of the Drives to retrieve.
     * @return The request builder for the Drives object
     */
    public IDriveRequestBuilder drives(final String id) {
        return new DriveRequestBuilder(getServiceRoot() + "/drives/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Shares objects.
     *
     * @return The request builder for the collection of Shares objects
     */
    public ISharedDriveItemCollectionRequestBuilder shares() {
        return new SharedDriveItemCollectionRequestBuilder(getServiceRoot() + "/shares", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Shares.
     *
     * @param id The id of the Shares to retrieve.
     * @return The request builder for the Shares object
     */
    public ISharedDriveItemRequestBuilder shares(final String id) {
        return new SharedDriveItemRequestBuilder(getServiceRoot() + "/shares/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Sites objects.
     *
     * @return The request builder for the collection of Sites objects
     */
    public ISiteCollectionRequestBuilder sites() {
        return new SiteCollectionRequestBuilder(getServiceRoot() + "/sites", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Sites.
     *
     * @param id The id of the Sites to retrieve.
     * @return The request builder for the Sites object
     */
    public ISiteRequestBuilder sites(final String id) {
        return new SiteRequestBuilder(getServiceRoot() + "/sites/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Workbooks objects.
     *
     * @return The request builder for the collection of Workbooks objects
     */
    public IDriveItemCollectionRequestBuilder workbooks() {
        return new DriveItemCollectionRequestBuilder(getServiceRoot() + "/workbooks", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Workbooks.
     *
     * @param id The id of the Workbooks to retrieve.
     * @return The request builder for the Workbooks object
     */
    public IDriveItemRequestBuilder workbooks(final String id) {
        return new DriveItemRequestBuilder(getServiceRoot() + "/workbooks/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Subscriptions objects.
     *
     * @return The request builder for the collection of Subscriptions objects
     */
    public ISubscriptionCollectionRequestBuilder subscriptions() {
        return new SubscriptionCollectionRequestBuilder(getServiceRoot() + "/subscriptions", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Subscriptions.
     *
     * @param id The id of the Subscriptions to retrieve.
     * @return The request builder for the Subscriptions object
     */
    public ISubscriptionRequestBuilder subscriptions(final String id) {
        return new SubscriptionRequestBuilder(getServiceRoot() + "/subscriptions/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Invitations objects.
     *
     * @return The request builder for the collection of Invitations objects
     */
    public IInvitationCollectionRequestBuilder invitations() {
        return new InvitationCollectionRequestBuilder(getServiceRoot() + "/invitations", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Invitations.
     *
     * @param id The id of the Invitations to retrieve.
     * @return The request builder for the Invitations object
     */
    public IInvitationRequestBuilder invitations(final String id) {
        return new InvitationRequestBuilder(getServiceRoot() + "/invitations/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets GraphServiceRequestBuilder.
     *
     * @return the User.
     */
    public IUserRequestBuilder me() {
        return new UserRequestBuilder(getServiceRoot() + "/me", (IGraphServiceClient)this, null);
    }

    /**
     * Gets GraphServiceRequestBuilder.
     *
     * @return the Drive.
     */
    public IDriveRequestBuilder drive() {
        return new DriveRequestBuilder(getServiceRoot() + "/drive", (IGraphServiceClient)this, null);
    }

    /**
     * Gets GraphServiceRequestBuilder.
     *
     * @return the Planner.
     */
    public IPlannerRequestBuilder planner() {
        return new PlannerRequestBuilder(getServiceRoot() + "/planner", (IGraphServiceClient)this, null);
    }
}
