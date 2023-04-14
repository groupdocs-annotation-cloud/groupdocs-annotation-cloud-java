/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
 * Copyright (c) 2003-2023 Aspose Pty Ltd
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

import com.groupdocs.cloud.annotation.model.*;
import com.groupdocs.cloud.annotation.client.ApiException;
import com.groupdocs.cloud.annotation.model.DocumentInfo;
import com.groupdocs.cloud.annotation.model.requests.GetInfoRequest;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class AnnotationInfoApiTests extends BaseApiTest
{
    @Test
    public void TestGetInfoReturnsFileNotFound()
    {
        // Arrange        
        FileInfo fileInfo = new FileInfo();
        fileInfo.setFilePath("some-folder\\notExists.docx");        

        GetInfoRequest request = new GetInfoRequest(fileInfo);

        // Act & Assert  
        try {
            infoApi.getInfo(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Specified file not found", ex.getMessage());
        }  
    }
    
    @Test
    @Parameters(
            {
                "cells\\one-page.xlsx,",
                "diagram\\one-page.vsd,",
                "email\\one-page.emlx,",
                "images\\one-page.png,",
                "pdf\\one-page.pdf,",
                "slides\\one-page.pptx,",
                "words\\one-page.docx,",
                "cells\\ten-pages.xlsx,",
                "diagram\\ten-pages.vsd,",
                "pdf\\ten-pages.pdf,",
                "slides\\ten-pages.pptx,",
                "words\\ten-pages.docx,",
                "pdf\\one-page-password.pdf,password",
                "words\\one-page-password.docx,password"
            })
    public void testGetInfo(String filePath, String password) throws ApiException
    {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setFilePath(filePath);
        fileInfo.setPassword(password);

        GetInfoRequest request = new GetInfoRequest(fileInfo);
        DocumentInfo info = infoApi.getInfo(request);
        
        assertNotNull(info);
        assertEquals(filePath, info.getPath());
    }
}
