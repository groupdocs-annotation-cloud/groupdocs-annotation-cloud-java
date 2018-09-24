/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ImageInfoApi.java">
 *   Copyright (c) 2003-2018 Aspose Pty Ltd
 * </copyright>
 * <summary>
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.groupdocs.cloud.annotation.api;

import com.groupdocs.cloud.annotation.client.ApiCallback;
import com.groupdocs.cloud.annotation.client.ApiClient;
import com.groupdocs.cloud.annotation.client.ApiException;
import com.groupdocs.cloud.annotation.client.ApiResponse;
import com.groupdocs.cloud.annotation.client.Configuration;
import com.groupdocs.cloud.annotation.client.Pair;
import com.groupdocs.cloud.annotation.client.ProgressRequestBody;
import com.groupdocs.cloud.annotation.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.groupdocs.cloud.annotation.model.DocumentInfo;
import com.groupdocs.cloud.annotation.model.requests.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImageInfoApi {
    private ApiClient apiClient;

    public ImageInfoApi(String appSid, String appKey) {
        this(new Configuration(appSid, appKey));
    }

    public ImageInfoApi(Configuration configuration) {
        this.apiClient = new ApiClient(configuration);
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getInfo
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getInfoCall(GetInfoRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/annotation/{name}/image/info"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getInfoValidateBeforeCall(GetInfoRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getInfo(Async)");
        }
        

        com.squareup.okhttp.Call call = getInfoCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves document&#39;s information.
     * 
     * @param request The request model
     * @return DocumentInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentInfo getInfo(GetInfoRequest request) throws ApiException {
        ApiResponse<DocumentInfo> resp = getInfoWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves document&#39;s information.
     * 
     * @param request The request model
     * @return ApiResponse&lt;DocumentInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentInfo> getInfoWithHttpInfo(GetInfoRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getInfoValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves document&#39;s information. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getInfoAsync(GetInfoRequest request, final ApiCallback<DocumentInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getInfoValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}