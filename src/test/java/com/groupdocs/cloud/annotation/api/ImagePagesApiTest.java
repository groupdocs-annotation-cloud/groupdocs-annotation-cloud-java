/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ImagePagesApiTest.java">
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

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import com.groupdocs.cloud.annotation.client.ApiException;
import java.io.File;
import com.groupdocs.cloud.annotation.model.ImagePage;
import com.groupdocs.cloud.annotation.model.ImagePages;
import com.groupdocs.cloud.annotation.model.requests.*;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * API tests for ImagePagesApi
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ImagePagesApiTest extends BaseApiTest{

    /**
     * Removes document's pages as image.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void test1deletePagesTest() throws ApiException {
        DeletePagesRequest request = new DeletePagesRequest();
        request.setName("one-page.pdf");
        request.setFolder("gfc-testdata/testsdata/groupdocs.annotation");
        Object response = imagePagesApi.deletePages(request);
        assertNotNull(response);
        assertTrue(response instanceof File);
    }

    /**
     * Creates document's pages as image.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void test2postPagesTest() throws ApiException {
        PostPagesRequest request = new PostPagesRequest();
        request.setName("one-page.pdf");
        request.setFolder("gfc-testdata/testsdata/groupdocs.annotation");
        request.setPassword(null);
        Object response = imagePagesApi.postPages(request);
        assertNotNull(response);
        assertTrue(response instanceof ImagePages);
    }

    /**
     * Downloads document's page as image.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void test3getPageTest() throws ApiException {
        GetPageRequest request = new GetPageRequest();
        request.setName("one-page.pdf");
        request.setPageNumber(0);
        request.setFolder("gfc-testdata/testsdata/groupdocs.annotation");
        Object response = imagePagesApi.getPage(request);
        assertNotNull(response);
        assertTrue(response instanceof ImagePage);
    }
    
    /**
     * Retrieves document's pages as images.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void test4getPagesTest() throws ApiException {
        GetPagesRequest request = new GetPagesRequest();
        request.setName("one-page.pdf");
        request.setFolder("gfc-testdata/testsdata/groupdocs.annotation");
        Object response = imagePagesApi.getPages(request);
        assertNotNull(response);
        assertTrue(response instanceof ImagePages);
    }
}
