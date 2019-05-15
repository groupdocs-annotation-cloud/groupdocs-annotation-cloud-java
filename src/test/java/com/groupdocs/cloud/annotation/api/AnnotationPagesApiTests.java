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

import com.groupdocs.cloud.annotation.client.ApiException;
import com.groupdocs.cloud.annotation.model.PageImages;
import com.groupdocs.cloud.annotation.model.requests.DeletePagesRequest;
import com.groupdocs.cloud.annotation.model.requests.GetPagesRequest;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import static org.junit.Assert.assertNotNull;
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
                "cells\\one-page.xlsx|0|0|false|false||", "diagram\\one-page.vsd|0|0|false|false||", "email\\one-page.emlx|0|0|false|false||", "images\\one-page.png|0|0|false|false||", "pdf\\one-page.pdf|0|0|false|false||", "slides\\one-page.pptx|0|0|false|false||", "words\\one-page.docx|0|0|false|false||", "cells\\ten-pages.xlsx|8|1|false|false||", "diagram\\ten-pages.vsd|3|5|false|false||", "pdf\\ten-pages.pdf|8|1|false|false||", "slides\\ten-pages.pptx|3|5|false|false||", "words\\ten-pages.docx|10|1|false|false||", "pdf\\one-page-password.pdf|0|0|false|false||password"
            })
    public void test1GetPages(String filePath, Integer countPagesToConvert, Integer pageNumber, Boolean withoutAnnotations, Boolean enableCaching, String cacheStoragePath, String password) throws ApiException
    {
        GetPagesRequest request = new GetPagesRequest(filePath, countPagesToConvert, pageNumber, null, withoutAnnotations, enableCaching, cacheStoragePath, password);
        PageImages imagePages = previewApi.getPages(request);
        assertNotNull(imagePages);
    }

    @Test
    @Parameters(
            {
                "cells\\one-page.xlsx", "diagram\\one-page.vsd", "email\\one-page.emlx", "images\\one-page.png", "pdf\\one-page.pdf", "slides\\one-page.pptx", "words\\one-page.docx", "cells\\ten-pages.xlsx", "diagram\\ten-pages.vsd", "pdf\\ten-pages.pdf", "slides\\ten-pages.pptx", "words\\ten-pages.docx", "pdf\\one-page-password.pdf"
            })
    public void test2DeletePages(String filePath) throws ApiException
    {
        previewApi.deletePages(new DeletePagesRequest(filePath));
    }
}
