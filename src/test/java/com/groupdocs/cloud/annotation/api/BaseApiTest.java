/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
 * Copyright (c) 2003-2019 Aspose Pty Ltd
 * </copyright>
 * <summary>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */
package com.groupdocs.cloud.annotation.api;

import com.groupdocs.cloud.annotation.model.requests.ObjectExistsRequest;
import com.groupdocs.cloud.annotation.model.requests.DeleteFolderRequest;
import com.groupdocs.cloud.annotation.model.requests.UploadFileRequest;
import com.groupdocs.cloud.annotation.model.ObjectExist;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.groupdocs.cloud.annotation.client.ApiException;
import com.groupdocs.cloud.annotation.client.Configuration;
import com.groupdocs.cloud.annotation.client.JSON;

import org.junit.After;
import org.junit.Before;

/**
 * API tests for AnnotationApi
 */
public class BaseApiTest
{
    protected InfoApi infoApi;
    protected AnnotateApi annotateApi;
    protected PreviewApi previewApi;
    protected StorageApi storageApi;
    protected FileApi fileApi;
    protected FolderApi folderApi;

    public BaseApiTest()
    {
        super();

        Configuration configuration = new Configuration(Config.AppSID, Config.AppKey);
        configuration.setApiBaseUrl(Config.ApiBaseUrl);
        int timeOut = 60 * 1000;
        infoApi = new InfoApi(configuration);
        infoApi.getApiClient().setReadTimeout(timeOut);
        annotateApi = new AnnotateApi(configuration);
        annotateApi.getApiClient().setReadTimeout(timeOut);
        previewApi = new PreviewApi(configuration);
        previewApi.getApiClient().setReadTimeout(timeOut);
        storageApi = new StorageApi(configuration);
        storageApi.getApiClient().setReadTimeout(timeOut);
        fileApi = new FileApi(configuration);
        fileApi.getApiClient().setReadTimeout(timeOut);
        folderApi = new FolderApi(configuration);
        folderApi.getApiClient().setReadTimeout(timeOut);
    }

    private static boolean setUpIsDone = false;

    @Before
    public void setUp() throws ApiException, FileNotFoundException
    {

        if (setUpIsDone)
        {
            return;
        }

        for (TestFile file : TestFiles.TestFilesList())
        {

            ObjectExist response = storageApi.objectExists(new ObjectExistsRequest(file.getPath(), null, null));
            if (!response.getExists())
            {
                File fileObj = getTestFile(file);
                fileApi.uploadFile(new UploadFileRequest(file.getPath(), fileObj, null));
            }
        }

        setUpIsDone = true;
    }

    @After
    public void cleanup() throws ApiException
    {
        removeTempFiles();
    }

    private void removeTempFiles() throws ApiException
    {
        deleteFolderFromStorage("annotation");
    }

    private void deleteFolderFromStorage(String folderName) throws ApiException
    {
        folderApi.deleteFolder(new DeleteFolderRequest(folderName, null, true));
    }

    public File getTestFile(TestFile testFile) throws FileNotFoundException
    {
        Path filePath = Paths.get("resources", testFile.getFolder(), testFile.getFileName());
        File file = filePath.toFile();
        if (!file.exists())
        {
            throw new FileNotFoundException(file.getAbsolutePath());
        }

        return file;
    }

    public File toJsonFile(Object obj) throws IOException
    {
        JSON json = new JSON();
        String content = json.serialize(obj);

        File file = File.createTempFile("java", ".json");
        FileWriter fileWriter = new FileWriter(file.getAbsoluteFile(), true);
        fileWriter.write(content);
        fileWriter.close();

        return file;
    }
}
