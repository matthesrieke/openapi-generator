package org.openapitools.client.api;

import io.vertx.core.file.AsyncFile;
import java.math.BigDecimal;
import org.openapitools.client.model.Client;
import org.openapitools.client.model.FileSchemaTestClass;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.openapitools.client.model.OuterComposite;
import org.openapitools.client.model.User;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.MultiMap;
import io.vertx.core.json.JsonObject;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.*;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;


public class FakeApiImpl implements FakeApi {

    private ApiClient apiClient;

    public FakeApiImpl() {
        this(null);
    }

    public FakeApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient != null ? apiClient : Configuration.getDefaultApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * Test serialization of outer boolean types
     * @param body Input boolean as post body (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void fakeOuterBooleanSerialize(Boolean body, Handler<AsyncResult<Boolean>> resultHandler) {
        Object localVarBody = body;
        
        // create path and map variables
        String localVarPath = "/fake/outer/boolean";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "*/*" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] {  };
        TypeReference<Boolean> localVarReturnType = new TypeReference<Boolean>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * 
     * Test serialization of object with outer number type
     * @param outerComposite Input composite as post body (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void fakeOuterCompositeSerialize(OuterComposite outerComposite, Handler<AsyncResult<OuterComposite>> resultHandler) {
        Object localVarBody = outerComposite;
        
        // create path and map variables
        String localVarPath = "/fake/outer/composite";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "*/*" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] {  };
        TypeReference<OuterComposite> localVarReturnType = new TypeReference<OuterComposite>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * 
     * Test serialization of outer number types
     * @param body Input number as post body (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void fakeOuterNumberSerialize(BigDecimal body, Handler<AsyncResult<BigDecimal>> resultHandler) {
        Object localVarBody = body;
        
        // create path and map variables
        String localVarPath = "/fake/outer/number";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "*/*" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] {  };
        TypeReference<BigDecimal> localVarReturnType = new TypeReference<BigDecimal>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * 
     * Test serialization of outer string types
     * @param body Input string as post body (optional)
     * @param resultHandler Asynchronous result handler
     */
    public void fakeOuterStringSerialize(String body, Handler<AsyncResult<String>> resultHandler) {
        Object localVarBody = body;
        
        // create path and map variables
        String localVarPath = "/fake/outer/string";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "*/*" };
        String[] localVarContentTypes = {  };
        String[] localVarAuthNames = new String[] {  };
        TypeReference<String> localVarReturnType = new TypeReference<String>() {};
        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * 
     * For this test, the body for this request much reference a schema named &#x60;File&#x60;.
     * @param fileSchemaTestClass  (required)
     * @param resultHandler Asynchronous result handler
     */
    public void testBodyWithFileSchema(FileSchemaTestClass fileSchemaTestClass, Handler<AsyncResult<Void>> resultHandler) {
        Object localVarBody = fileSchemaTestClass;
        
        // verify the required parameter 'fileSchemaTestClass' is set
        if (fileSchemaTestClass == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'fileSchemaTestClass' when calling testBodyWithFileSchema"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/fake/body-with-file-schema";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] {  };

        apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, null, resultHandler);
    }
    /**
     * 
     * 
     * @param query  (required)
     * @param user  (required)
     * @param resultHandler Asynchronous result handler
     */
    public void testBodyWithQueryParams(String query, User user, Handler<AsyncResult<Void>> resultHandler) {
        Object localVarBody = user;
        
        // verify the required parameter 'query' is set
        if (query == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'query' when calling testBodyWithQueryParams"));
            return;
        }
        
        // verify the required parameter 'user' is set
        if (user == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'user' when calling testBodyWithQueryParams"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/fake/body-with-query-params";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] {  };

        apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, null, resultHandler);
    }
    /**
     * To test \&quot;client\&quot; model
     * To test \&quot;client\&quot; model
     * @param client client model (required)
     * @param resultHandler Asynchronous result handler
     */
    public void testClientModel(Client client, Handler<AsyncResult<Client>> resultHandler) {
        Object localVarBody = client;
        
        // verify the required parameter 'client' is set
        if (client == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'client' when calling testClientModel"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/fake";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = { "application/json" };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] {  };
        TypeReference<Client> localVarReturnType = new TypeReference<Client>() {};
        apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, localVarReturnType, resultHandler);
    }
    /**
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     * @param number None (required)
     * @param _double None (required)
     * @param patternWithoutDelimiter None (required)
     * @param _byte None (required)
     * @param integer None (optional, default to null)
     * @param int32 None (optional, default to null)
     * @param int64 None (optional, default to null)
     * @param _float None (optional, default to null)
     * @param string None (optional, default to null)
     * @param binary None (optional, default to null)
     * @param date None (optional, default to null)
     * @param dateTime None (optional, default to null)
     * @param password None (optional, default to null)
     * @param paramCallback None (optional, default to null)
     * @param resultHandler Asynchronous result handler
     */
    public void testEndpointParameters(BigDecimal number, Double _double, String patternWithoutDelimiter, byte[] _byte, Integer integer, Integer int32, Long int64, Float _float, String string, AsyncFile binary, LocalDate date, OffsetDateTime dateTime, String password, String paramCallback, Handler<AsyncResult<Void>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'number' is set
        if (number == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'number' when calling testEndpointParameters"));
            return;
        }
        
        // verify the required parameter '_double' is set
        if (_double == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter '_double' when calling testEndpointParameters"));
            return;
        }
        
        // verify the required parameter 'patternWithoutDelimiter' is set
        if (patternWithoutDelimiter == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'patternWithoutDelimiter' when calling testEndpointParameters"));
            return;
        }
        
        // verify the required parameter '_byte' is set
        if (_byte == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter '_byte' when calling testEndpointParameters"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/fake";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        if (integer != null) localVarFormParams.put("integer", integer);
if (int32 != null) localVarFormParams.put("int32", int32);
if (int64 != null) localVarFormParams.put("int64", int64);
if (number != null) localVarFormParams.put("number", number);
if (_float != null) localVarFormParams.put("float", _float);
if (_double != null) localVarFormParams.put("double", _double);
if (string != null) localVarFormParams.put("string", string);
if (patternWithoutDelimiter != null) localVarFormParams.put("pattern_without_delimiter", patternWithoutDelimiter);
if (_byte != null) localVarFormParams.put("byte", _byte);
if (binary != null) localVarFormParams.put("binary", binary);
if (date != null) localVarFormParams.put("date", date);
if (dateTime != null) localVarFormParams.put("dateTime", dateTime);
if (password != null) localVarFormParams.put("password", password);
if (paramCallback != null) localVarFormParams.put("callback", paramCallback);

        String[] localVarAccepts = {  };
        String[] localVarContentTypes = { "application/x-www-form-urlencoded" };
        String[] localVarAuthNames = new String[] { "http_basic_test" };

        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, null, resultHandler);
    }
    /**
     * To test enum parameters
     * To test enum parameters
     * @param enumHeaderStringArray Header parameter enum test (string array) (optional)
     * @param enumHeaderString Header parameter enum test (string) (optional, default to -efg)
     * @param enumQueryStringArray Query parameter enum test (string array) (optional)
     * @param enumQueryString Query parameter enum test (string) (optional, default to -efg)
     * @param enumQueryInteger Query parameter enum test (double) (optional)
     * @param enumQueryDouble Query parameter enum test (double) (optional)
     * @param enumFormStringArray Form parameter enum test (string array) (optional, default to $)
     * @param enumFormString Form parameter enum test (string) (optional, default to -efg)
     * @param resultHandler Asynchronous result handler
     */
    public void testEnumParameters(List<String> enumHeaderStringArray, String enumHeaderString, List<String> enumQueryStringArray, String enumQueryString, Integer enumQueryInteger, Double enumQueryDouble, List<String> enumFormStringArray, String enumFormString, Handler<AsyncResult<Void>> resultHandler) {
        Object localVarBody = null;
        
        // create path and map variables
        String localVarPath = "/fake";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "enum_query_string_array", enumQueryStringArray));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "enum_query_string", enumQueryString));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "enum_query_integer", enumQueryInteger));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "enum_query_double", enumQueryDouble));

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        if (enumHeaderStringArray != null)
        localVarHeaderParams.add("enum_header_string_array", apiClient.parameterToString(enumHeaderStringArray));
if (enumHeaderString != null)
        localVarHeaderParams.add("enum_header_string", apiClient.parameterToString(enumHeaderString));

        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        if (enumFormStringArray != null) localVarFormParams.put("enum_form_string_array", enumFormStringArray);
if (enumFormString != null) localVarFormParams.put("enum_form_string", enumFormString);

        String[] localVarAccepts = {  };
        String[] localVarContentTypes = { "application/x-www-form-urlencoded" };
        String[] localVarAuthNames = new String[] {  };

        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, null, resultHandler);
    }
    /**
     * test inline additionalProperties
     * 
     * @param requestBody request body (required)
     * @param resultHandler Asynchronous result handler
     */
    public void testInlineAdditionalProperties(Map<String, String> requestBody, Handler<AsyncResult<Void>> resultHandler) {
        Object localVarBody = requestBody;
        
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'requestBody' when calling testInlineAdditionalProperties"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/fake/inline-additionalProperties";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        
        String[] localVarAccepts = {  };
        String[] localVarContentTypes = { "application/json" };
        String[] localVarAuthNames = new String[] {  };

        apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, null, resultHandler);
    }
    /**
     * test json serialization of form data
     * 
     * @param param field1 (required)
     * @param param2 field2 (required)
     * @param resultHandler Asynchronous result handler
     */
    public void testJsonFormData(String param, String param2, Handler<AsyncResult<Void>> resultHandler) {
        Object localVarBody = null;
        
        // verify the required parameter 'param' is set
        if (param == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'param' when calling testJsonFormData"));
            return;
        }
        
        // verify the required parameter 'param2' is set
        if (param2 == null) {
            resultHandler.handle(ApiException.fail(400, "Missing the required parameter 'param2' when calling testJsonFormData"));
            return;
        }
        
        // create path and map variables
        String localVarPath = "/fake/jsonFormData";

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();

        // header params
        MultiMap localVarHeaderParams = MultiMap.caseInsensitiveMultiMap();
        
        // form params
        // TODO: sending files within multipart/form-data is not supported yet (because of vertx web-client)
        Map<String, Object> localVarFormParams = new HashMap<>();
        if (param != null) localVarFormParams.put("param", param);
if (param2 != null) localVarFormParams.put("param2", param2);

        String[] localVarAccepts = {  };
        String[] localVarContentTypes = { "application/x-www-form-urlencoded" };
        String[] localVarAuthNames = new String[] {  };

        apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarBody, localVarHeaderParams, localVarFormParams, localVarAccepts, localVarContentTypes, localVarAuthNames, null, resultHandler);
    }
}
