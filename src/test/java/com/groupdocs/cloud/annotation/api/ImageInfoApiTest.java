/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ImageInfoApiTest.java">
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
import com.groupdocs.cloud.annotation.model.DocumentInfo;
import com.groupdocs.cloud.annotation.model.requests.*;
import org.junit.Test;

/**
 * API tests for ImageInfoApi
 */
public class ImageInfoApiTest extends BaseApiTest {

    /**
     * Retrieves document&#39;s information.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInfoTest() throws ApiException {

        GetInfoRequest request = new GetInfoRequest();
        request.setName("one-page.pdf");
        request.setFolder("gfc-testdata/testsdata/groupdocs.annotation");
        request.setPassword(null);
        Object response = imageInfoApi.getInfo(request);
        assertNotNull(response);
        assertTrue(response instanceof DocumentInfo);
    }
}
