/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ImagePagesApi.java">
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


import java.io.File;
import com.groupdocs.cloud.annotation.model.ImagePage;
import com.groupdocs.cloud.annotation.model.ImagePages;
import com.groupdocs.cloud.annotation.model.requests.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImagePagesApi {
    private ApiClient apiClient;

    public ImagePagesApi(String appSid, String appKey) {
        this(new Configuration(appSid, appKey));
    }

    public ImagePagesApi(Configuration configuration) {
        this.apiClient = new ApiClient(configuration);
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

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
        String localVarPath = "/annotation/{name}/image/pages"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deletePagesValidateBeforeCall(DeletePagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deletePages(Async)");
        }
        

        com.squareup.okhttp.Call call = deletePagesCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Removes document&#39;s pages as image.
     * 
     * @param request The request model
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File deletePages(DeletePagesRequest request) throws ApiException {
        ApiResponse<File> resp = deletePagesWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Removes document&#39;s pages as image.
     * 
     * @param request The request model
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> deletePagesWithHttpInfo(DeletePagesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deletePagesValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Removes document&#39;s pages as image. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deletePagesAsync(DeletePagesRequest request, final ApiCallback<File> callback) throws ApiException {

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
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPage
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPageCall(GetPageRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/annotation/{name}/image/pages/{pageNumber}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(request.getPageNumber().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));

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
    private com.squareup.okhttp.Call getPageValidateBeforeCall(GetPageRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getPage(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (request.getPageNumber() == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling getPage(Async)");
        }
        

        com.squareup.okhttp.Call call = getPageCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Downloads document&#39;s page as image.
     * 
     * @param request The request model
     * @return ImagePage
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ImagePage getPage(GetPageRequest request) throws ApiException {
        ApiResponse<ImagePage> resp = getPageWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Downloads document&#39;s page as image.
     * 
     * @param request The request model
     * @return ApiResponse&lt;ImagePage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ImagePage> getPageWithHttpInfo(GetPageRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getPageValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<ImagePage>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Downloads document&#39;s page as image. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPageAsync(GetPageRequest request, final ApiCallback<ImagePage> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPageValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ImagePage>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
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
        String localVarPath = "/annotation/{name}/image/pages"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(request.getName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));

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
    private com.squareup.okhttp.Call getPagesValidateBeforeCall(GetPagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getPages(Async)");
        }
        

        com.squareup.okhttp.Call call = getPagesCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves document&#39;s pages as images.
     * 
     * @param request The request model
     * @return ImagePages
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ImagePages getPages(GetPagesRequest request) throws ApiException {
        ApiResponse<ImagePages> resp = getPagesWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves document&#39;s pages as images.
     * 
     * @param request The request model
     * @return ApiResponse&lt;ImagePages&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ImagePages> getPagesWithHttpInfo(GetPagesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getPagesValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<ImagePages>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves document&#39;s pages as images. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPagesAsync(GetPagesRequest request, final ApiCallback<ImagePages> callback) throws ApiException {

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
        Type localVarReturnType = new TypeToken<ImagePages>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postPages
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postPagesCall(PostPagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/annotation/{name}/image/pages"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postPagesValidateBeforeCall(PostPagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postPages(Async)");
        }
        

        com.squareup.okhttp.Call call = postPagesCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates document&#39;s pages as image.
     * 
     * @param request The request model
     * @return ImagePages
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ImagePages postPages(PostPagesRequest request) throws ApiException {
        ApiResponse<ImagePages> resp = postPagesWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Creates document&#39;s pages as image.
     * 
     * @param request The request model
     * @return ApiResponse&lt;ImagePages&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ImagePages> postPagesWithHttpInfo(PostPagesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postPagesValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<ImagePages>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates document&#39;s pages as image. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postPagesAsync(PostPagesRequest request, final ApiCallback<ImagePages> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postPagesValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ImagePages>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}