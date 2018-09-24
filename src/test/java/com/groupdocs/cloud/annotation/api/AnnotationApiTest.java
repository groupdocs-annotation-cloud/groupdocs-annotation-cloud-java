/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="AnnotationApiTest.java">
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
import com.groupdocs.cloud.annotation.model.AnnotationInfo;
import java.io.File;
import com.groupdocs.cloud.annotation.model.AnnotationReplyInfo;
import com.groupdocs.cloud.annotation.model.Point;
import com.groupdocs.cloud.annotation.model.Rectangle;
import com.groupdocs.cloud.annotation.model.requests.*;
import org.junit.Test;
import org.threeten.bp.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * API tests for AnnotationApi
 */
public class AnnotationApiTest extends BaseApiTest{

    /**
     * Removes annotations from document.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCleanDocumentTest() throws ApiException {
        DeleteCleanDocumentRequest request = new DeleteCleanDocumentRequest();
        request.setName("one-page.pdf");
        request.setFolder("gfc-testdata/testsdata/groupdocs.annotation");
        request.setPassword(null);
        Object response = annotationApi.deleteCleanDocument(request);
        assertNotNull(response);
        assertTrue(response instanceof File);
    }
    
    /**
     * Extracts annotations from document.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getImportTest() throws ApiException {
        GetImportRequest request = new GetImportRequest();
        request.setName("one-page-annotated.pdf");
        request.setFolder("gfc-testdata/testsdata/groupdocs.annotation");
        request.setPassword(null);
        List<AnnotationInfo> response = annotationApi.getImport(request);
        assertNotNull(response);
    }
    
    /**
     * Adds annotations to the document.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putExportTest() throws ApiException {
        List<AnnotationInfo> annotations = new ArrayList<AnnotationInfo>();
        AnnotationInfo textAnnotation = new AnnotationInfo();
        textAnnotation.annotationPosition(new Point(852.0, 154.31));
        List<AnnotationReplyInfo> replies = new ArrayList<AnnotationReplyInfo>();
        AnnotationReplyInfo replyInfo = new AnnotationReplyInfo();
        replyInfo.setMessage("reply text");
        replyInfo.setRepliedOn(OffsetDateTime.now());
        replyInfo.setUserName("Admin");
        replies.add(replyInfo);
        replyInfo = new AnnotationReplyInfo();
        replyInfo.setMessage("reply2 text");
        replyInfo.setRepliedOn(OffsetDateTime.now());
        replyInfo.setUserName("Commentator");
        replies.add(replyInfo);
        textAnnotation.replies(replies);
        textAnnotation.setBox(new Rectangle(173.29, 154.31, 142.5, 9.0));
        textAnnotation.setPageNumber(0);
        textAnnotation.setSvgPath("[{\"x\":173.2986,\"y\":687.5769},{\"x\":315.7985,\"y\":687.5769},{\"x\":173.2986,\"y\":678.5769},{\"x\":315.7985,\"y\":678.5769}]");
        textAnnotation.setType(AnnotationInfo.TypeEnum.TEXT);
        textAnnotation.setCreatorName("Anonym A.");
        annotations.add(textAnnotation);
        PutExportRequest request = new PutExportRequest();
        request.setName("one-page.pdf");
        request.setBody(annotations);
        request.setFolder("gfc-testdata/testsdata/groupdocs.annotation");
        request.setPassword(null);
        Object response = annotationApi.putExport(request);
        assertNotNull(response);
        assertTrue(response instanceof File);
    }
}
