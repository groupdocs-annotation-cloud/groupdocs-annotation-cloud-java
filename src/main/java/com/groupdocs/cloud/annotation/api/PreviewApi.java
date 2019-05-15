/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PreviewApi.java">
 *   Copyright (c) 2003-2019 Aspose Pty Ltd
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

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;
import com.groupdocs.cloud.annotation.client.*;
import com.groupdocs.cloud.annotation.model.*;
import com.groupdocs.cloud.annotation.model.requests.*;

public class PreviewApi {
    private ApiClient apiClient;

    /**
     * Initializes new instance of PreviewApi
     * @param appSid Application identifier (App SID)
     * @param appKey Application private key (App Key)
     */
    public PreviewApi(String appSid, String appKey) {
        this(new Configuration(appSid, appKey));
    }

    /**
     * Initializes new instance of PreviewApi
     * @param configuration Configuration The configuration
     */
    public PreviewApi(Configuration configuration) {
        this.apiClient = new ApiClient(configuration);
    }

    /**
     * Gets ApiClient
     *
     * @return ApiClient The Api client
     */
    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Sets ApiClient
     *
     * @param apiClient The Api client
     */
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deletePages
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deletePagesCall(DeletePagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/annotation/pages";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getfilePath() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("filePath", request.getfilePath()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deletePagesValidateBeforeCall(DeletePagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'filePath' is set
        if (request.getfilePath() == null) {
            throw new ApiException("Missing the required parameter 'filePath' when calling deletePages(Async)");
        }
        

        com.squareup.okhttp.Call call = deletePagesCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Removes document&#39;s pages image representations
     * 
     * @param request The request model
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deletePages(DeletePagesRequest request) throws ApiException {
        deletePagesWithHttpInfo(request);
    }

    /**
     * Removes document&#39;s pages image representations
     * 
     * @param request The request model
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deletePagesWithHttpInfo(DeletePagesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deletePagesValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Removes document&#39;s pages image representations (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deletePagesAsync(DeletePagesRequest request, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deletePagesValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getPages
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPagesCall(GetPagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/annotation/pages";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getfilePath() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("filePath", request.getfilePath()));
        if (request.getcountPagesToConvert() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("countPagesToConvert", request.getcountPagesToConvert()));
        if (request.getpageNumber() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("pageNumber", request.getpageNumber()));
        if (request.getpageNumbersToConvert() != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "pageNumbersToConvert", request.getpageNumbersToConvert()));
        if (request.getwithoutAnnotations() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("withoutAnnotations", request.getwithoutAnnotations()));
        if (request.getenableCaching() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("enableCaching", request.getenableCaching()));
        if (request.getcacheStoragePath() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("cacheStoragePath", request.getcacheStoragePath()));
        if (request.getpassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getpassword()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getPagesValidateBeforeCall(GetPagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'filePath' is set
        if (request.getfilePath() == null) {
            throw new ApiException("Missing the required parameter 'filePath' when calling getPages(Async)");
        }
        

        com.squareup.okhttp.Call call = getPagesCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Generates image representations from documents pages
     * 
     * @param request The request model
     * @return PageImages
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageImages getPages(GetPagesRequest request) throws ApiException {
        ApiResponse<PageImages> resp = getPagesWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Generates image representations from documents pages
     * 
     * @param request The request model
     * @return ApiResponse&lt;PageImages&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageImages> getPagesWithHttpInfo(GetPagesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getPagesValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<PageImages>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Generates image representations from documents pages (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPagesAsync(GetPagesRequest request, final ApiCallback<PageImages> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPagesValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageImages>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

