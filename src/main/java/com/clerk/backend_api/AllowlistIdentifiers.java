/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.clerk.backend_api;

import com.clerk.backend_api.models.components.AllowlistIdentifier;
import com.clerk.backend_api.models.components.DeletedObject;
import com.clerk.backend_api.models.errors.ClerkErrors;
import com.clerk.backend_api.models.errors.SDKError;
import com.clerk.backend_api.models.operations.CreateAllowlistIdentifierRequestBody;
import com.clerk.backend_api.models.operations.CreateAllowlistIdentifierRequestBuilder;
import com.clerk.backend_api.models.operations.CreateAllowlistIdentifierResponse;
import com.clerk.backend_api.models.operations.DeleteAllowlistIdentifierRequest;
import com.clerk.backend_api.models.operations.DeleteAllowlistIdentifierRequestBuilder;
import com.clerk.backend_api.models.operations.DeleteAllowlistIdentifierResponse;
import com.clerk.backend_api.models.operations.ListAllowlistIdentifiersRequest;
import com.clerk.backend_api.models.operations.ListAllowlistIdentifiersRequestBuilder;
import com.clerk.backend_api.models.operations.ListAllowlistIdentifiersResponse;
import com.clerk.backend_api.models.operations.SDKMethodInterfaces.*;
import com.clerk.backend_api.utils.BackoffStrategy;
import com.clerk.backend_api.utils.HTTPClient;
import com.clerk.backend_api.utils.HTTPRequest;
import com.clerk.backend_api.utils.Hook.AfterErrorContextImpl;
import com.clerk.backend_api.utils.Hook.AfterSuccessContextImpl;
import com.clerk.backend_api.utils.Hook.BeforeRequestContextImpl;
import com.clerk.backend_api.utils.Options;
import com.clerk.backend_api.utils.Retries.NonRetryableException;
import com.clerk.backend_api.utils.Retries;
import com.clerk.backend_api.utils.RetryConfig;
import com.clerk.backend_api.utils.SerializedBody;
import com.clerk.backend_api.utils.Utils.JsonShape;
import com.clerk.backend_api.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Boolean;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class AllowlistIdentifiers implements
            MethodCallListAllowlistIdentifiers,
            MethodCallCreateAllowlistIdentifier,
            MethodCallDeleteAllowlistIdentifier {

    private final SDKConfiguration sdkConfiguration;

    AllowlistIdentifiers(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * List all identifiers on the allow-list
     * 
     * <p>Get a list of all identifiers allowed to sign up to an instance
     * 
     * @return The call builder
     */
    public ListAllowlistIdentifiersRequestBuilder list() {
        return new ListAllowlistIdentifiersRequestBuilder(this);
    }

    /**
     * List all identifiers on the allow-list
     * 
     * <p>Get a list of all identifiers allowed to sign up to an instance
     * 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListAllowlistIdentifiersResponse listDirect() throws Exception {
        return list(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }
    
    /**
     * List all identifiers on the allow-list
     * 
     * <p>Get a list of all identifiers allowed to sign up to an instance
     * 
     * @param paginated Whether to paginate the results.
     *         If true, the results will be paginated.
     *         If false, the results will not be paginated.
     * @param limit Applies a limit to the number of results returned.
     *         Can be used for paginating the results together with `offset`.
     * @param offset Skip the first `offset` results when paginating.
     *         Needs to be an integer greater or equal to zero.
     *         To be used in conjunction with `limit`.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListAllowlistIdentifiersResponse list(
            Optional<Boolean> paginated,
            Optional<Long> limit,
            Optional<Long> offset,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }
        ListAllowlistIdentifiersRequest request =
            ListAllowlistIdentifiersRequest
                .builder()
                .paginated(paginated)
                .limit(limit)
                .offset(offset)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl();
        String _url = Utils.generateURL(
                _baseUrl,
                "/allowlist_identifiers");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                ListAllowlistIdentifiersRequest.class,
                request, 
                null));
        
        Optional<SecuritySource> _hookSecuritySource = Optional.of(this.sdkConfiguration.securitySource());
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource().getSecurity());
        HTTPClient _client = this.sdkConfiguration.client();
        HTTPRequest _finalReq = _req;
        RetryConfig _retryConfig;
        if (options.isPresent() && options.get().retryConfig().isPresent()) {
            _retryConfig = options.get().retryConfig().get();
        } else if (this.sdkConfiguration.retryConfig().isPresent()) {
            _retryConfig = this.sdkConfiguration.retryConfig().get();
        } else {
            _retryConfig = RetryConfig.builder()
                .backoff(BackoffStrategy.builder()
                            .initialInterval(500, TimeUnit.MILLISECONDS)
                            .maxInterval(60000, TimeUnit.MILLISECONDS)
                            .baseFactor((double)(1.5))
                            .maxElapsedTime(3600000, TimeUnit.MILLISECONDS)
                            .retryConnectError(true)
                            .build())
                .build();
        }
        List<String> _statusCodes = new ArrayList<>();
        _statusCodes.add("5XX");
        Retries _retries = Retries.builder()
            .action(() -> {
                HttpRequest _r = null;
                try {
                    _r = sdkConfiguration.hooks()
                        .beforeRequest(
                            new BeforeRequestContextImpl(
                                this.sdkConfiguration,
                                _baseUrl,
                                "ListAllowlistIdentifiers", 
                                Optional.of(List.of()), 
                                _hookSecuritySource),
                            _finalReq.build());
                } catch (Exception _e) {
                    throw new NonRetryableException(_e);
                }
                try {
                    return _client.send(_r);
                } catch (Exception _e) {
                    return sdkConfiguration.hooks()
                        .afterError(
                            new AfterErrorContextImpl(
                                this.sdkConfiguration,
                                _baseUrl,
                                "ListAllowlistIdentifiers",
                                 Optional.of(List.of()),
                                 _hookSecuritySource), 
                            Optional.empty(),
                            Optional.of(_e));
                }
            })
            .retryConfig(_retryConfig)
            .statusCodes(_statusCodes)
            .build();
        HttpResponse<InputStream> _httpRes = sdkConfiguration.hooks()
                 .afterSuccess(
                     new AfterSuccessContextImpl(
                         this.sdkConfiguration,
                         _baseUrl,
                         "ListAllowlistIdentifiers", 
                         Optional.of(List.of()), 
                         _hookSecuritySource),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListAllowlistIdentifiersResponse.Builder _resBuilder = 
            ListAllowlistIdentifiersResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListAllowlistIdentifiersResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<AllowlistIdentifier> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<AllowlistIdentifier>>() {});
                _res.withAllowlistIdentifierList(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401", "402")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ClerkErrors _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ClerkErrors>() {});
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }



    /**
     * Add identifier to the allow-list
     * 
     * <p>Create an identifier allowed to sign up to an instance
     * 
     * @return The call builder
     */
    public CreateAllowlistIdentifierRequestBuilder create() {
        return new CreateAllowlistIdentifierRequestBuilder(this);
    }

    /**
     * Add identifier to the allow-list
     * 
     * <p>Create an identifier allowed to sign up to an instance
     * 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateAllowlistIdentifierResponse createDirect() throws Exception {
        return create(Optional.empty(), Optional.empty());
    }
    
    /**
     * Add identifier to the allow-list
     * 
     * <p>Create an identifier allowed to sign up to an instance
     * 
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateAllowlistIdentifierResponse create(
            Optional<? extends CreateAllowlistIdentifierRequestBody> request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }
        String _baseUrl = this.sdkConfiguration.serverUrl();
        String _url = Utils.generateURL(
                _baseUrl,
                "/allowlist_identifiers");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Optional<? extends CreateAllowlistIdentifierRequestBody>>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "request",
                "json",
                false);
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        
        Optional<SecuritySource> _hookSecuritySource = Optional.of(this.sdkConfiguration.securitySource());
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource().getSecurity());
        HTTPClient _client = this.sdkConfiguration.client();
        HTTPRequest _finalReq = _req;
        RetryConfig _retryConfig;
        if (options.isPresent() && options.get().retryConfig().isPresent()) {
            _retryConfig = options.get().retryConfig().get();
        } else if (this.sdkConfiguration.retryConfig().isPresent()) {
            _retryConfig = this.sdkConfiguration.retryConfig().get();
        } else {
            _retryConfig = RetryConfig.builder()
                .backoff(BackoffStrategy.builder()
                            .initialInterval(500, TimeUnit.MILLISECONDS)
                            .maxInterval(60000, TimeUnit.MILLISECONDS)
                            .baseFactor((double)(1.5))
                            .maxElapsedTime(3600000, TimeUnit.MILLISECONDS)
                            .retryConnectError(true)
                            .build())
                .build();
        }
        List<String> _statusCodes = new ArrayList<>();
        _statusCodes.add("5XX");
        Retries _retries = Retries.builder()
            .action(() -> {
                HttpRequest _r = null;
                try {
                    _r = sdkConfiguration.hooks()
                        .beforeRequest(
                            new BeforeRequestContextImpl(
                                this.sdkConfiguration,
                                _baseUrl,
                                "CreateAllowlistIdentifier", 
                                Optional.of(List.of()), 
                                _hookSecuritySource),
                            _finalReq.build());
                } catch (Exception _e) {
                    throw new NonRetryableException(_e);
                }
                try {
                    return _client.send(_r);
                } catch (Exception _e) {
                    return sdkConfiguration.hooks()
                        .afterError(
                            new AfterErrorContextImpl(
                                this.sdkConfiguration,
                                _baseUrl,
                                "CreateAllowlistIdentifier",
                                 Optional.of(List.of()),
                                 _hookSecuritySource), 
                            Optional.empty(),
                            Optional.of(_e));
                }
            })
            .retryConfig(_retryConfig)
            .statusCodes(_statusCodes)
            .build();
        HttpResponse<InputStream> _httpRes = sdkConfiguration.hooks()
                 .afterSuccess(
                     new AfterSuccessContextImpl(
                         this.sdkConfiguration,
                         _baseUrl,
                         "CreateAllowlistIdentifier", 
                         Optional.of(List.of()), 
                         _hookSecuritySource),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        CreateAllowlistIdentifierResponse.Builder _resBuilder = 
            CreateAllowlistIdentifierResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        CreateAllowlistIdentifierResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                AllowlistIdentifier _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<AllowlistIdentifier>() {});
                _res.withAllowlistIdentifier(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "402", "422")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ClerkErrors _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ClerkErrors>() {});
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }



    /**
     * Delete identifier from allow-list
     * 
     * <p>Delete an identifier from the instance allow-list
     * 
     * @return The call builder
     */
    public DeleteAllowlistIdentifierRequestBuilder delete() {
        return new DeleteAllowlistIdentifierRequestBuilder(this);
    }

    /**
     * Delete identifier from allow-list
     * 
     * <p>Delete an identifier from the instance allow-list
     * 
     * @param identifierId The ID of the identifier to delete from the allow-list
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public DeleteAllowlistIdentifierResponse delete(
            String identifierId) throws Exception {
        return delete(identifierId, Optional.empty());
    }
    
    /**
     * Delete identifier from allow-list
     * 
     * <p>Delete an identifier from the instance allow-list
     * 
     * @param identifierId The ID of the identifier to delete from the allow-list
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public DeleteAllowlistIdentifierResponse delete(
            String identifierId,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }
        DeleteAllowlistIdentifierRequest request =
            DeleteAllowlistIdentifierRequest
                .builder()
                .identifierId(identifierId)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl();
        String _url = Utils.generateURL(
                DeleteAllowlistIdentifierRequest.class,
                _baseUrl,
                "/allowlist_identifiers/{identifier_id}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "DELETE");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        
        Optional<SecuritySource> _hookSecuritySource = Optional.of(this.sdkConfiguration.securitySource());
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource().getSecurity());
        HTTPClient _client = this.sdkConfiguration.client();
        HTTPRequest _finalReq = _req;
        RetryConfig _retryConfig;
        if (options.isPresent() && options.get().retryConfig().isPresent()) {
            _retryConfig = options.get().retryConfig().get();
        } else if (this.sdkConfiguration.retryConfig().isPresent()) {
            _retryConfig = this.sdkConfiguration.retryConfig().get();
        } else {
            _retryConfig = RetryConfig.builder()
                .backoff(BackoffStrategy.builder()
                            .initialInterval(500, TimeUnit.MILLISECONDS)
                            .maxInterval(60000, TimeUnit.MILLISECONDS)
                            .baseFactor((double)(1.5))
                            .maxElapsedTime(3600000, TimeUnit.MILLISECONDS)
                            .retryConnectError(true)
                            .build())
                .build();
        }
        List<String> _statusCodes = new ArrayList<>();
        _statusCodes.add("5XX");
        Retries _retries = Retries.builder()
            .action(() -> {
                HttpRequest _r = null;
                try {
                    _r = sdkConfiguration.hooks()
                        .beforeRequest(
                            new BeforeRequestContextImpl(
                                this.sdkConfiguration,
                                _baseUrl,
                                "DeleteAllowlistIdentifier", 
                                Optional.of(List.of()), 
                                _hookSecuritySource),
                            _finalReq.build());
                } catch (Exception _e) {
                    throw new NonRetryableException(_e);
                }
                try {
                    return _client.send(_r);
                } catch (Exception _e) {
                    return sdkConfiguration.hooks()
                        .afterError(
                            new AfterErrorContextImpl(
                                this.sdkConfiguration,
                                _baseUrl,
                                "DeleteAllowlistIdentifier",
                                 Optional.of(List.of()),
                                 _hookSecuritySource), 
                            Optional.empty(),
                            Optional.of(_e));
                }
            })
            .retryConfig(_retryConfig)
            .statusCodes(_statusCodes)
            .build();
        HttpResponse<InputStream> _httpRes = sdkConfiguration.hooks()
                 .afterSuccess(
                     new AfterSuccessContextImpl(
                         this.sdkConfiguration,
                         _baseUrl,
                         "DeleteAllowlistIdentifier", 
                         Optional.of(List.of()), 
                         _hookSecuritySource),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        DeleteAllowlistIdentifierResponse.Builder _resBuilder = 
            DeleteAllowlistIdentifierResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        DeleteAllowlistIdentifierResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                DeletedObject _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<DeletedObject>() {});
                _res.withDeletedObject(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "402", "404")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ClerkErrors _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ClerkErrors>() {});
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }

}
