/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.clerk.backend_api.models.operations;

import com.clerk.backend_api.utils.Options;
import java.lang.Boolean;
import java.lang.Exception;
import java.lang.Long;
import java.lang.String;
import java.util.List;
import java.util.Optional;

public class SDKMethodInterfaces {

    public interface MethodCallGetPublicInterstitial {
        GetPublicInterstitialResponse getPublicInterstitial(
            GetPublicInterstitialRequest request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallGetJWKS {
        GetJWKSResponse getJWKS(
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallGetClientList {
        GetClientListResponse list(
            Optional<Boolean> paginated,
            Optional<Long> limit,
            Optional<Long> offset,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallVerifyClient {
        VerifyClientResponse verify(
            Optional<? extends VerifyClientRequestBody> request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallGetClient {
        GetClientResponse get(
            String clientId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallCreateEmailAddress {
        CreateEmailAddressResponse create(
            Optional<? extends CreateEmailAddressRequestBody> request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallGetEmailAddress {
        GetEmailAddressResponse get(
            String emailAddressId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallDeleteEmailAddress {
        DeleteEmailAddressResponse delete(
            String emailAddressId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallUpdateEmailAddress {
        UpdateEmailAddressResponse update(
            String emailAddressId,
            Optional<? extends UpdateEmailAddressRequestBody> requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallCreatePhoneNumber {
        CreatePhoneNumberResponse create(
            Optional<? extends CreatePhoneNumberRequestBody> request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallGetPhoneNumber {
        GetPhoneNumberResponse get(
            String phoneNumberId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallDeletePhoneNumber {
        DeletePhoneNumberResponse delete(
            String phoneNumberId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallUpdatePhoneNumber {
        UpdatePhoneNumberResponse update(
            String phoneNumberId,
            Optional<? extends UpdatePhoneNumberRequestBody> requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallGetSessionList {
        GetSessionListResponse list(
            GetSessionListRequest request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallCreateSession {
        CreateSessionResponse create(
            Optional<? extends CreateSessionRequestBody> request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallGetSession {
        GetSessionResponse get(
            String sessionId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallRefreshSession {
        RefreshSessionResponse refresh(
            String sessionId,
            Optional<? extends RefreshSessionRequestBody> requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallRevokeSession {
        RevokeSessionResponse revoke(
            String sessionId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallVerifySession {
        VerifySessionResponse verify(
            String sessionId,
            Optional<? extends VerifySessionRequestBody> requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallCreateSessionToken {
        CreateSessionTokenResponse createToken(
            String sessionId,
            Optional<? extends CreateSessionTokenRequestBody> requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallCreateSessionTokenFromTemplate {
        CreateSessionTokenFromTemplateResponse createTokenFromTemplate(
            String sessionId,
            String templateName,
            Optional<? extends CreateSessionTokenFromTemplateRequestBody> requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallGetTemplateList {
        GetTemplateListResponse list(
            TemplateType templateType,
            Optional<Boolean> paginated,
            Optional<Long> limit,
            Optional<Long> offset,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallGetTemplate {
        GetTemplateResponse get(
            PathParamTemplateType templateType,
            String slug,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallRevertTemplate {
        RevertTemplateResponse revert(
            RevertTemplatePathParamTemplateType templateType,
            String slug,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallToggleTemplateDelivery {
        ToggleTemplateDeliveryResponse toggleTemplateDelivery(
            ToggleTemplateDeliveryPathParamTemplateType templateType,
            String slug,
            Optional<? extends ToggleTemplateDeliveryRequestBody> requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallUpsertTemplate {
        UpsertTemplateResponse upsert(
            UpsertTemplatePathParamTemplateType templateType,
            String slug,
            Optional<? extends UpsertTemplateRequestBody> requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallPreviewTemplate {
        PreviewTemplateResponse preview(
            String templateType,
            String slug,
            Optional<? extends PreviewTemplateRequestBody> requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallGetUserList {
        GetUserListResponse list(
            GetUserListRequest request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallCreateUser {
        CreateUserResponse create(
            CreateUserRequestBody request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallGetUsersCount {
        GetUsersCountResponse count(
            GetUsersCountRequest request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallGetUser {
        GetUserResponse get(
            String userId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallUpdateUser {
        UpdateUserResponse update(
            String userId,
            UpdateUserRequestBody requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallDeleteUser {
        DeleteUserResponse delete(
            String userId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallBanUser {
        BanUserResponse ban(
            String userId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallUnbanUser {
        UnbanUserResponse unban(
            String userId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallLockUser {
        LockUserResponse lock(
            String userId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallUnlockUser {
        UnlockUserResponse unlock(
            String userId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallSetUserProfileImage {
        SetUserProfileImageResponse setProfileImage(
            String userId,
            SetUserProfileImageRequestBody requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallDeleteUserProfileImage {
        DeleteUserProfileImageResponse deleteProfileImage(
            String userId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallUpdateUserMetadata {
        UpdateUserMetadataResponse updateMetadata(
            String userId,
            Optional<? extends UpdateUserMetadataRequestBody> requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallGetOAuthAccessToken {
        GetOAuthAccessTokenResponse getOAuthAccessToken(
            GetOAuthAccessTokenRequest request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallUsersGetOrganizationMemberships {
        UsersGetOrganizationMembershipsResponse getOrganizationMemberships(
            String userId,
            Optional<Long> limit,
            Optional<Long> offset,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallUsersGetOrganizationInvitations {
        UsersGetOrganizationInvitationsResponse getOrganizationInvitations(
            String userId,
            Optional<Long> limit,
            Optional<Long> offset,
            Optional<? extends QueryParamStatus> status,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallVerifyPassword {
        VerifyPasswordResponse verifyPassword(
            String userId,
            Optional<? extends VerifyPasswordRequestBody> requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallVerifyTOTP {
        VerifyTOTPResponse verifyTotp(
            String userId,
            Optional<? extends VerifyTOTPRequestBody> requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallDisableMFA {
        DisableMFAResponse disableMfa(
            String userId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallDeleteBackupCode {
        DeleteBackupCodeResponse deleteBackupCodes(
            String userId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallUserPasskeyDelete {
        UserPasskeyDeleteResponse deletePasskey(
            String userId,
            String passkeyIdentificationId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallUserWeb3WalletDelete {
        UserWeb3WalletDeleteResponse deleteWeb3Wallet(
            String userId,
            String web3WalletIdentificationId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallDeleteTOTP {
        DeleteTOTPResponse deleteTOTP(
            String userId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallDeleteExternalAccount {
        DeleteExternalAccountResponse deleteExternalAccount(
            String userId,
            String externalAccountId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallInstanceGetOrganizationMemberships {
        InstanceGetOrganizationMembershipsResponse getInstanceOrganizationMemberships(
            Optional<String> orderBy,
            Optional<Long> limit,
            Optional<Long> offset,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallCreateInvitation {
        CreateInvitationResponse create(
            Optional<? extends CreateInvitationRequestBody> request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallListInvitations {
        ListInvitationsResponse list(
            ListInvitationsRequest request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallCreateBulkInvitations {
        CreateBulkInvitationsResponse bulkCreate(
            Optional<? extends List<RequestBody>> request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallRevokeInvitation {
        RevokeInvitationResponse revoke(
            String invitationId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallListInstanceOrganizationInvitations {
        ListInstanceOrganizationInvitationsResponse getAll(
            ListInstanceOrganizationInvitationsRequest request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallCreateOrganizationInvitation {
        CreateOrganizationInvitationResponse create(
            String organizationId,
            Optional<? extends CreateOrganizationInvitationRequestBody> requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallListOrganizationInvitations {
        ListOrganizationInvitationsResponse list(
            String organizationId,
            Optional<? extends ListOrganizationInvitationsQueryParamStatus> status,
            Optional<Long> limit,
            Optional<Long> offset,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallCreateOrganizationInvitationBulk {
        CreateOrganizationInvitationBulkResponse bulkCreate(
            String organizationId,
            List<CreateOrganizationInvitationBulkRequestBody> requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallListPendingOrganizationInvitations {
        ListPendingOrganizationInvitationsResponse listPending(
            String organizationId,
            Optional<Long> limit,
            Optional<Long> offset,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallGetOrganizationInvitation {
        GetOrganizationInvitationResponse get(
            String organizationId,
            String invitationId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallRevokeOrganizationInvitation {
        RevokeOrganizationInvitationResponse revoke(
            String organizationId,
            String invitationId,
            Optional<? extends RevokeOrganizationInvitationRequestBody> requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallListAllowlistIdentifiers {
        ListAllowlistIdentifiersResponse list(
            Optional<Boolean> paginated,
            Optional<Long> limit,
            Optional<Long> offset,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallCreateAllowlistIdentifier {
        CreateAllowlistIdentifierResponse create(
            Optional<? extends CreateAllowlistIdentifierRequestBody> request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallDeleteAllowlistIdentifier {
        DeleteAllowlistIdentifierResponse delete(
            String identifierId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallListBlocklistIdentifiers {
        ListBlocklistIdentifiersResponse list(
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallCreateBlocklistIdentifier {
        CreateBlocklistIdentifierResponse create(
            Optional<? extends CreateBlocklistIdentifierRequestBody> request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallDeleteBlocklistIdentifier {
        DeleteBlocklistIdentifierResponse delete(
            String identifierId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallUpdateInstanceAuthConfig {
        UpdateInstanceAuthConfigResponse updateInstanceSettings(
            Optional<? extends UpdateInstanceAuthConfigRequestBody> request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallUpdateProductionInstanceDomain {
        UpdateProductionInstanceDomainResponse updateProductionInstanceDomain(
            Optional<? extends UpdateProductionInstanceDomainRequestBody> request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallCreateActorToken {
        CreateActorTokenResponse create(
            Optional<? extends CreateActorTokenRequestBody> request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallRevokeActorToken {
        RevokeActorTokenResponse revoke(
            String actorTokenId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallListDomains {
        ListDomainsResponse list(
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallAddDomain {
        AddDomainResponse add(
            Optional<? extends AddDomainRequestBody> request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallDeleteDomain {
        DeleteDomainResponse delete(
            String domainId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallUpdateDomain {
        UpdateDomainResponse update(
            String domainId,
            UpdateDomainRequestBody requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallGetInstance {
        GetInstanceResponse get(
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallUpdateInstance {
        UpdateInstanceResponse update(
            Optional<? extends UpdateInstanceRequestBody> request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallUpdateInstanceRestrictions {
        UpdateInstanceRestrictionsResponse updateRestrictions(
            Optional<? extends UpdateInstanceRestrictionsRequestBody> request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallChangeProductionInstanceDomain {
        ChangeProductionInstanceDomainResponse changeDomain(
            Optional<? extends ChangeProductionInstanceDomainRequestBody> request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallUpdateInstanceOrganizationSettings {
        UpdateInstanceOrganizationSettingsResponse updateOrganizationSettings(
            Optional<? extends UpdateInstanceOrganizationSettingsRequestBody> request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallCreateSvixApp {
        CreateSvixAppResponse createSvixApp(
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallDeleteSvixApp {
        DeleteSvixAppResponse deleteSvixApp(
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallGenerateSvixAuthURL {
        GenerateSvixAuthURLResponse generateSvixAuthURL(
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallListJWTTemplates {
        ListJWTTemplatesResponse list(
            Optional<Boolean> paginated,
            Optional<Long> limit,
            Optional<Long> offset,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallCreateJWTTemplate {
        CreateJWTTemplateResponse create(
            Optional<? extends CreateJWTTemplateRequestBody> request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallGetJWTTemplate {
        GetJWTTemplateResponse get(
            String templateId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallUpdateJWTTemplate {
        UpdateJWTTemplateResponse update(
            String templateId,
            Optional<? extends UpdateJWTTemplateRequestBody> requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallDeleteJWTTemplate {
        DeleteJWTTemplateResponse delete(
            String templateId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallListOrganizations {
        ListOrganizationsResponse list(
            ListOrganizationsRequest request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallCreateOrganization {
        CreateOrganizationResponse create(
            Optional<? extends CreateOrganizationRequestBody> request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallGetOrganization {
        GetOrganizationResponse get(
            String organizationId,
            Optional<Boolean> includeMembersCount,
            Optional<Boolean> includeMissingMemberWithElevatedPermissions,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallUpdateOrganization {
        UpdateOrganizationResponse update(
            String organizationId,
            UpdateOrganizationRequestBody requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallDeleteOrganization {
        DeleteOrganizationResponse delete(
            String organizationId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallMergeOrganizationMetadata {
        MergeOrganizationMetadataResponse mergeMetadata(
            String organizationId,
            MergeOrganizationMetadataRequestBody requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallUploadOrganizationLogo {
        UploadOrganizationLogoResponse uploadLogo(
            String organizationId,
            Optional<? extends UploadOrganizationLogoRequestBody> requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallDeleteOrganizationLogo {
        DeleteOrganizationLogoResponse deleteLogo(
            String organizationId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallCreateOrganizationMembership {
        CreateOrganizationMembershipResponse create(
            String organizationId,
            CreateOrganizationMembershipRequestBody requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallListOrganizationMemberships {
        ListOrganizationMembershipsResponse list(
            ListOrganizationMembershipsRequest request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallUpdateOrganizationMembership {
        UpdateOrganizationMembershipResponse update(
            String organizationId,
            String userId,
            UpdateOrganizationMembershipRequestBody requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallDeleteOrganizationMembership {
        DeleteOrganizationMembershipResponse delete(
            String organizationId,
            String userId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallUpdateOrganizationMembershipMetadata {
        UpdateOrganizationMembershipMetadataResponse updateMetadata(
            String organizationId,
            String userId,
            Optional<? extends UpdateOrganizationMembershipMetadataRequestBody> requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallCreateOrganizationDomain {
        CreateOrganizationDomainResponse create(
            String organizationId,
            CreateOrganizationDomainRequestBody requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallListOrganizationDomains {
        ListOrganizationDomainsResponse list(
            ListOrganizationDomainsRequest request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallUpdateOrganizationDomain {
        UpdateOrganizationDomainResponse update(
            String organizationId,
            String domainId,
            UpdateOrganizationDomainRequestBody requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallDeleteOrganizationDomain {
        DeleteOrganizationDomainResponse delete(
            String organizationId,
            String domainId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallVerifyDomainProxy {
        VerifyDomainProxyResponse verify(
            Optional<? extends VerifyDomainProxyRequestBody> request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallListRedirectURLs {
        ListRedirectURLsResponse list(
            Optional<Boolean> paginated,
            Optional<Long> limit,
            Optional<Long> offset,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallCreateRedirectURL {
        CreateRedirectURLResponse create(
            Optional<? extends CreateRedirectURLRequestBody> request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallGetRedirectURL {
        GetRedirectURLResponse get(
            String id,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallDeleteRedirectURL {
        DeleteRedirectURLResponse delete(
            String id,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallCreateSignInToken {
        CreateSignInTokenResponse create(
            Optional<? extends CreateSignInTokenRequestBody> request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallRevokeSignInToken {
        RevokeSignInTokenResponse revoke(
            String signInTokenId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallGetSignUp {
        GetSignUpResponse get(
            String id,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallUpdateSignUp {
        UpdateSignUpResponse update(
            String id,
            Optional<? extends UpdateSignUpRequestBody> requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallListOAuthApplications {
        ListOAuthApplicationsResponse list(
            Optional<Long> limit,
            Optional<Long> offset,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallCreateOAuthApplication {
        CreateOAuthApplicationResponse create(
            Optional<? extends CreateOAuthApplicationRequestBody> request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallGetOAuthApplication {
        GetOAuthApplicationResponse get(
            String oauthApplicationId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallUpdateOAuthApplication {
        UpdateOAuthApplicationResponse update(
            String oauthApplicationId,
            UpdateOAuthApplicationRequestBody requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallDeleteOAuthApplication {
        DeleteOAuthApplicationResponse delete(
            String oauthApplicationId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallRotateOAuthApplicationSecret {
        RotateOAuthApplicationSecretResponse rotateSecret(
            String oauthApplicationId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallListSAMLConnections {
        ListSAMLConnectionsResponse list(
            ListSAMLConnectionsRequest request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallCreateSAMLConnection {
        CreateSAMLConnectionResponse create(
            Optional<? extends CreateSAMLConnectionRequestBody> request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallGetSAMLConnection {
        GetSAMLConnectionResponse get(
            String samlConnectionId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallUpdateSAMLConnection {
        UpdateSAMLConnectionResponse update(
            String samlConnectionId,
            UpdateSAMLConnectionRequestBody requestBody,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallDeleteSAMLConnection {
        DeleteSAMLConnectionResponse delete(
            String samlConnectionId,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallCreateTestingToken {
        CreateTestingTokenResponse create(
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallListWaitlistEntries {
        ListWaitlistEntriesResponse list(
            ListWaitlistEntriesRequest request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallCreateWaitlistEntry {
        CreateWaitlistEntryResponse create(
            Optional<? extends CreateWaitlistEntryRequestBody> request,
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallCreateAccountlessApplication {
        CreateAccountlessApplicationResponse create(
            Optional<Options> options) throws Exception;
    }

    public interface MethodCallCompleteAccountlessApplication {
        CompleteAccountlessApplicationResponse complete(
            Optional<Options> options) throws Exception;
    }
}
