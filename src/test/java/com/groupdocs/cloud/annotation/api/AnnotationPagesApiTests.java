/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
 * Copyright (c) 2003-2021 Aspose Pty Ltd
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

import com.groupdocs.cloud.annotation.client.ApiException;
import com.groupdocs.cloud.annotation.model.*;
import com.groupdocs.cloud.annotation.model.requests.*;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(JUnitParamsRunner.class)
public class AnnotationPagesApiTests extends BaseApiTest
{

    @Test
    @Parameters(
            {
                "cells\\one-page.xlsx||",
                "diagram\\one-page.vsd||",
                "email\\one-page.emlx||",
                "images\\one-page.png||",
                "pdf\\one-page.pdf||",
                "slides\\one-page.pptx||",
                "words\\one-page.docx||",
                "cells\\ten-pages.xlsx||",
                "diagram\\ten-pages.vsd||",
                "pdf\\ten-pages.pdf||",
                "slides\\ten-pages.pptx||",
                "words\\ten-pages.docx||",
                "pdf\\one-page-password.pdf|\"PNG\"|password"
            })
    public void test1CreatePages(String filePath, String format, String password) throws ApiException
    {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setFilePath(filePath);
        fileInfo.setPassword(password);
        
        PreviewOptions options = new PreviewOptions();
        options.setFileInfo(fileInfo);        

        GetPagesRequest request = new GetPagesRequest(options);
        PageImages result = previewApi.getPages(request);

        assertNotNull(result);
        assertNotEquals(0, (int)result.getTotalCount());
        assertNotNull(result.getEntries());
        assertNotEquals(0, result.getEntries().size());
    }

    @Test
    @Parameters(
            {
                "cells\\one-page.xlsx|",
                "diagram\\one-page.vsd|",
                "email\\one-page.emlx|",
                "images\\one-page.png|",
                "pdf\\one-page.pdf|",
                "slides\\one-page.pptx|",
                "words\\one-page.docx|",
                "cells\\ten-pages.xlsx|",
                "diagram\\ten-pages.vsd|",
                "pdf\\ten-pages.pdf|",
                "slides\\ten-pages.pptx|",
                "words\\ten-pages.docx|",
                "pdf\\one-page-password.pdf|password"
            })
    public void test2DeletePages(String filePath, String password) throws ApiException
    {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setFilePath(filePath);
        fileInfo.setPassword(password);

        DeletePagesRequest request = new DeletePagesRequest(fileInfo);
        previewApi.deletePages(request);
    }
}
