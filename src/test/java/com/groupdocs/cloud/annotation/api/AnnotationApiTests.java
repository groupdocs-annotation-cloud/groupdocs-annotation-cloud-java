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
import com.groupdocs.cloud.annotation.model.AnnotationInfo.PenStyleEnum;
import com.groupdocs.cloud.annotation.model.AnnotationInfo.TypeEnum;
import com.groupdocs.cloud.annotation.model.requests.*;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(JUnitParamsRunner.class)
public class AnnotationApiTests extends BaseApiTest
{

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
                "cells\\one-page-password.xlsx,password",
                "pdf\\one-page-password.pdf,password",
                "slides\\one-page-password.pptx,password",
                "words\\one-page-password.docx,password"
            })
    public void testAddAnnotations(String filePath, String password) throws ApiException
    {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setFilePath(filePath);
        fileInfo.setPassword(password);

        AnnotateOptions options = new AnnotateOptions();
        options.setFileInfo(fileInfo);
        options.setAnnotations(getAnnotations());
        options.setOutputPath(DefaultOutputPath + "/" + filePath.substring(filePath.lastIndexOf("\\")+1));

        AnnotateRequest request = new AnnotateRequest(options);
        AnnotationApiLink result = annotateApi.annotate(request);

        assertNotNull(result);
        assertNotNull(result.getHref());
        assertNotEquals(0, result.getHref().length());
    }

    @Test
    @Parameters(
            {
                "cells\\ten-pages.xlsx",
                "diagram\\ten-pages.vsd",
                "pdf\\ten-pages.pdf",
                "slides\\ten-pages.pptx",
                "words\\ten-pages.docx"
            })
    public void testAddAnnotationsManyPages(String filePath) throws ApiException
    {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setFilePath(filePath);

        AnnotateOptions options = new AnnotateOptions();
        options.setFileInfo(fileInfo);
        options.setAnnotations(getAnnotationsManyPages());
        options.setOutputPath(DefaultOutputPath + "/" + filePath.substring(filePath.lastIndexOf("\\")+1));

        AnnotateRequest request = new AnnotateRequest(options);
        AnnotationApiLink result = annotateApi.annotate(request);

        assertNotNull(result);
        assertNotNull(result.getHref());
        assertNotEquals(0, result.getHref().length());
    }

    @Test
    @Parameters(
            {
                "input\\input.docx",
                "input\\input.xlsx",
                "input\\input.eml",
                "input\\input.html",
                "input\\input.pdf",
                "input\\input.png",
                "input\\input.pptx",
                "input\\input.vsdx",
            })
    public void testExtract(String filePath) throws ApiException
    {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setFilePath(filePath);
        
        ExtractRequest request = new ExtractRequest(fileInfo);

        List<AnnotationInfo> result = annotateApi.extract(request);

        assertNotNull(result);
        assertNotEquals(0, result.size());
        assertTrue(result.get(0) instanceof AnnotationInfo);
    }

    @Test
    @Parameters(
            {
                "diagram\\one-page.vsd,,false,0,0,",
                "email\\one-page.emlx,,false,0,0,",
                "images\\one-page.png,,false,0,0,",
                "pdf\\one-page.pdf,,false,-1,-1,",
                "slides\\one-page.pptx,,false,0,0,",
                "words\\one-page.docx,,false,0,0,",
                "diagram\\ten-pages.vsd,Area,false,2,5,",
                "pdf\\ten-pages.pdf,Area,false,2,5,",
                "slides\\ten-pages.pptx,Area,false,2,5,",
                "words\\ten-pages.docx,Area,false,2,5,",
                 "pdf\\one-page-password.pdf,,false,-1,-1,password",
                "slides\\one-page-password.pptx,,false,0,0,password",
                "words\\one-page-password.docx,,false,0,0,password"
            })
    public void testAddDirect(String filePath, String annotationTypes, Boolean annotatedPages, Integer firstPage, Integer lastPage, String password) throws ApiException
    {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setFilePath(filePath);
        fileInfo.setPassword(password);

        AnnotateOptions options = new AnnotateOptions();
        options.setFileInfo(fileInfo);
        options.setAnnotations(getAnnotations());
        options.setFirstPage(firstPage);
        options.setLastPage(lastPage);
        options.setOnlyAnnotatedPages(annotatedPages);
        options.setOutputPath(DefaultOutputPath + "/" + filePath.substring(filePath.lastIndexOf("\\")+1));

        AnnotateDirectRequest request = new AnnotateDirectRequest(options);
        File result = annotateApi.annotateDirect(request);

        assertNotNull(result);
        assertTrue(result.getTotalSpace() > 0);
    }

    @Test
    @Parameters(
            {
                "input\\input.docx",
                "input\\input.xlsx",
                "input\\input.eml",
                "input\\input.html",
                "input\\input.pdf",
                "input\\input.png",
                "input\\input.pptx",
                "input\\input.vsdx"
            })
    public void testRemoveAnnotations(String filePath) throws ApiException
    {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setFilePath(filePath);

        RemoveOptions options = new RemoveOptions();
        options.setFileInfo(fileInfo);        
        options.setAnnotationIds(Arrays.asList(1, 2, 3));
        options.setOutputPath(DefaultOutputPath + "/" + filePath.substring(filePath.lastIndexOf("\\")+1));

        RemoveAnnotationsRequest request = new RemoveAnnotationsRequest(options);
        AnnotationApiLink result = annotateApi.removeAnnotations(request);

        assertNotNull(result);
        assertNotNull(result.getHref());
        assertNotEquals(0, result.getHref().length());
    }

    private Point GetPoint()
    {
        Point pt = new Point();
        pt.setX(852.0);
        pt.setY(59.388262910798119);
        return pt;
    }

    private Rectangle GetRectangle()
    {
        Rectangle r = new Rectangle();
        r.setX(375.89276123046875);
        r.setY(59.388262910798119);
        r.setWidth(88.7330551147461);
        r.setHeight(37.7290153503418);
        return r;
    }    

    private List<AnnotationInfo> getAnnotations()
    {
        AnnotationInfo[] annotations = new AnnotationInfo[1];
        annotations[0] = new AnnotationInfo();
        annotations[0].setAnnotationPosition(GetPoint());
        annotations[0].setBox(GetRectangle());
        annotations[0].setPageNumber(0);
        annotations[0].setPenColor(1201033);
        annotations[0].setPenStyle(PenStyleEnum.SOLID);
        annotations[0].setPenWidth(1);
        annotations[0].setType(TypeEnum.AREA);
        annotations[0].setCreatorName("Anonym A.");
        return Arrays.asList(annotations);
    }

    private List<AnnotationInfo> getAnnotationsManyPages()
    {
        AnnotationInfo[] annotations = new AnnotationInfo[4];
        annotations[0] = new AnnotationInfo();
        annotations[0].setAnnotationPosition(GetPoint());
        annotations[0].setBox(GetRectangle());
        annotations[0].setPageNumber(0);
        annotations[0].setPenColor(1201033);
        annotations[0].setPenStyle(PenStyleEnum.SOLID);
        annotations[0].setPenWidth(1);
        annotations[0].setType(TypeEnum.DISTANCE);
        annotations[0].setCreatorName("Anonym A.");
        annotations[1] = new AnnotationInfo();
        annotations[1].setAnnotationPosition(GetPoint());
        annotations[1].setBox(GetRectangle());
        annotations[1].setPageNumber(2);
        annotations[1].setPenColor(1201033);
        annotations[1].setPenStyle(PenStyleEnum.SOLID);
        annotations[1].setPenWidth(1);
        annotations[1].setType(TypeEnum.AREA);
        annotations[1].setCreatorName("Anonym A.");
        annotations[2] = new AnnotationInfo();
        annotations[2].setAnnotationPosition(GetPoint());
        annotations[2].setBox(GetRectangle());
        annotations[2].setPageNumber(4);
        annotations[2].setType(TypeEnum.POINT);
        annotations[2].setCreatorName("Anonym A.");
        annotations[3] = new AnnotationInfo();
        annotations[3].setAnnotationPosition(GetPoint());
        annotations[3].setBox(GetRectangle());
        annotations[3].setPageNumber(5);
        annotations[3].setPenColor(1201033);
        annotations[3].setPenStyle(PenStyleEnum.SOLID);
        annotations[3].setPenWidth(1);
        annotations[3].setType(TypeEnum.ARROW);
        annotations[3].setCreatorName("Anonym A.");
        return Arrays.asList(annotations);
    }
}
